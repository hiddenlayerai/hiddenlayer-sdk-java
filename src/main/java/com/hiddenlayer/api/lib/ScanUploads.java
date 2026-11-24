package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.core.HiddenLayerException;
import com.hiddenlayer.api.resources.scans.upload.file.requests.AddFileRequest;
import com.hiddenlayer.api.resources.scans.upload.file.types.AddFileResponsePartsItem;
import com.hiddenlayer.api.resources.scans.upload.requests.MultiFileUploadRequestV3;
import com.hiddenlayer.api.types.ScanJobRequestSource;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** What the synchronous and asynchronous model scanners share: choosing the files and uploading their parts. */
final class ScanUploads {
    static final String REQUESTING_ENTITY = "hiddenlayer-java-sdk";

    // The client's default request timeout. Without one, a stalled upload never returns.
    static final int UPLOAD_TIMEOUT_MILLIS = 60_000;

    private ScanUploads() {}

    static MultiFileUploadRequestV3 startRequest(
            String modelName, String modelVersion, String requestSource, String origin) {
        return MultiFileUploadRequestV3.builder()
                .modelVersion(modelVersion)
                .modelName(modelName)
                .requestingEntity(REQUESTING_ENTITY)
                .requestSource(ScanJobRequestSource.valueOf(requestSource))
                .origin(origin)
                .build();
    }

    static Path requireFile(String modelPath) {
        Path file = Paths.get(modelPath);
        if (!Files.exists(file)) {
            throw new IllegalArgumentException("File does not exist: " + modelPath);
        }
        if (!Files.isRegularFile(file)) {
            throw new IllegalArgumentException("Path is not a file: " + modelPath);
        }
        return file;
    }

    static List<Path> requireFolderFiles(ScanFolderOptions options) {
        Path folder = Paths.get(options.getPath());
        if (!Files.exists(folder)) {
            throw new IllegalArgumentException("Directory does not exist: " + options.getPath());
        }
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Path is not a directory: " + options.getPath());
        }
        List<Path> files = filteredFiles(folder, options.getAllowFilePatterns(), options.getIgnoreFilePatterns());
        if (files.isEmpty()) {
            throw new IllegalArgumentException("No files found to scan in directory: " + options.getPath());
        }
        return files;
    }

    static List<Path> filteredFiles(Path folder, List<String> allowPatterns, List<String> ignorePatterns) {
        try (Stream<Path> paths = Files.walk(folder)) {
            return paths.filter(Files::isRegularFile)
                    .filter(file -> {
                        String fileName = file.toString();
                        boolean isAllowed = allowPatterns.isEmpty() || matchesAny(fileName, allowPatterns);
                        return isAllowed && !matchesAny(fileName, ignorePatterns);
                    })
                    .collect(Collectors.toList());
        } catch (IOException | UncheckedIOException e) {
            throw new HiddenLayerException("Failed to list the files under " + folder, e);
        }
    }

    /**
     * Whether the whole of {@code fileName}, a path as the folder walk yields it, matches {@code pattern}: {@code
     * *} is any run of characters but {@code /}, {@code **} any run, and {@code ?} any one character.
     */
    static boolean matchesPattern(String fileName, String pattern) {
        String regex = pattern.replace("\\", "\\\\")
                .replace(".", "\\.")
                .replace("**", "DOUBLE_STAR_PLACEHOLDER")
                .replace("*", "[^/]*")
                .replace("DOUBLE_STAR_PLACEHOLDER", ".*")
                .replace("?", ".");
        return Pattern.matches(regex, fileName);
    }

    static AddFileRequest addRequest(Path file, long fileSize) {
        // The generated client declares file-content-length as a 32-bit integer.
        if (fileSize > Integer.MAX_VALUE) {
            throw new HiddenLayerException(file + " is " + fileSize + " bytes, and this version of the SDK uploads"
                    + " files of up to " + Integer.MAX_VALUE + " bytes");
        }
        return AddFileRequest.builder()
                .fileContentLength((int) fileSize)
                .fileName(file.getFileName().toString())
                .build();
    }

    static long size(Path file) {
        try {
            return Files.size(file);
        } catch (IOException e) {
            throw new HiddenLayerException("Failed to read the size of " + file, e);
        }
    }

    /** Reads one part of the file and PUTs it to the part's presigned URL. */
    static void uploadPart(Path file, long fileSize, AddFileResponsePartsItem part) {
        String uploadUrl =
                part.getUploadUrl().orElseThrow(() -> new HiddenLayerException("Part upload URL must not be null"));
        long startOffset = part.getStartOffset().map(Number::longValue).orElse(0L);
        long endOffset = part.getEndOffset().map(Number::longValue).orElse(fileSize);
        // The offsets come from the API: out of range, they would upload bytes the file doesn't have.
        boolean isWithinFile = startOffset >= 0 && startOffset <= endOffset && endOffset <= fileSize;
        if (!isWithinFile || endOffset - startOffset > Integer.MAX_VALUE) {
            throw new HiddenLayerException("Part " + startOffset + " to " + endOffset + " is not a part of " + file
                    + ", which has " + fileSize + " bytes");
        }
        putPart(uploadUrl, readPart(file, startOffset, endOffset));
    }

    static byte[] readPart(Path file, long startOffset, long endOffset) {
        byte[] partData = new byte[Math.toIntExact(endOffset - startOffset)];
        try (RandomAccessFile source = new RandomAccessFile(file.toFile(), "r")) {
            source.seek(startOffset);
            source.readFully(partData);
            return partData;
        } catch (IOException e) {
            throw new HiddenLayerException(
                    "Failed to read bytes " + startOffset + " to " + endOffset + " of " + file, e);
        }
    }

    static void putPart(String uploadUrl, byte[] partData) {
        URL url;
        try {
            url = new URL(uploadUrl);
        } catch (MalformedURLException e) {
            // Not chained: its message repeats the URL, signature included.
            throw new HiddenLayerException("Part upload URL is not a URL: " + withoutQuery(uploadUrl));
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(UPLOAD_TIMEOUT_MILLIS);
            connection.setReadTimeout(UPLOAD_TIMEOUT_MILLIS);
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            connection.setRequestProperty("Content-Length", Integer.toString(partData.length));
            connection.setDoOutput(true);
            try (OutputStream body = connection.getOutputStream()) {
                body.write(partData);
                body.flush();
            }
            int responseCode = connection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException("Failed to upload part: HTTP " + responseCode);
            }
        } catch (IOException e) {
            throw new HiddenLayerException("Failed to upload part to " + withoutQuery(uploadUrl), e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    // A presigned URL's query string is its credential, so it stays out of messages and logs.
    static String withoutQuery(String url) {
        int query = url.indexOf('?');
        return query < 0 ? url : url.substring(0, query);
    }

    private static boolean matchesAny(String fileName, List<String> patterns) {
        for (String pattern : patterns) {
            if (matchesPattern(fileName, pattern)) {
                return true;
            }
        }
        return false;
    }
}
