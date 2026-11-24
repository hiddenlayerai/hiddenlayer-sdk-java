package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.AsyncBaseHiddenLayerClient;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/**
 * Scans local model files and folders without blocking the caller.
 *
 * <p>The scanner reads and uploads files on threads of its own, which keep the JVM alive until {@link #close()}
 * stops them. A scanner taken from {@code AsyncHiddenLayerClient.modelScanner()} is closed with its client; close one
 * you construct yourself.
 */
public class AsyncModelScanner implements AutoCloseable {
    private static final Logger LOGGER = Logger.getLogger("ModelScanner");

    private final AsyncBaseHiddenLayerClient client;

    private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);

    public AsyncModelScanner(AsyncBaseHiddenLayerClient client) {
        this.client = client;
    }

    /**
     * Scan a single local file.
     *
     * @param options The scan options
     * @return A future of the scan results, which fails with what failed: an {@link IllegalArgumentException} for a
     *     path that is not an existing file, or the upload's or the scan's own failure
     */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(ScanFileOptions options) {
        return CompletableFuture.supplyAsync(
                        () -> {
                            Path file = ScanUploads.requireFile(options.getModelPath());
                            LOGGER.info("Starting async file scan for: " + options.getModelPath());
                            return Collections.singletonList(file);
                        },
                        executor)
                .thenCompose(files -> scan(
                        files,
                        options.getModelName(),
                        options.getModelVersion(),
                        options.getRequestSource(),
                        options.getOrigin(),
                        options.getWaitForResults()))
                .whenComplete((report, failure) -> {
                    if (failure != null) {
                        LOGGER.severe("Failed to upload file: "
                                + ScanUtils.unwrap(failure).getMessage());
                    }
                });
    }

    /** Scan a single local file as version {@code "1"}, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(String modelName, String modelPath) {
        return scanFile(modelName, modelPath, ScanFileOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan a single local file, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(String modelName, String modelPath, String modelVersion) {
        return scanFile(modelName, modelPath, modelVersion, ScanFileOptions.DEFAULT_WAIT_FOR_RESULTS);
    }

    /** Scan a single local file. */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(
            String modelName, String modelPath, String modelVersion, boolean waitForResults) {
        return scanFile(modelName, modelPath, modelVersion, waitForResults, ScanFileOptions.DEFAULT_REQUEST_SOURCE);
    }

    /** Scan a single local file. */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(
            String modelName, String modelPath, String modelVersion, boolean waitForResults, String requestSource) {
        return scanFile(
                modelName, modelPath, modelVersion, waitForResults, requestSource, ScanFileOptions.DEFAULT_ORIGIN);
    }

    /**
     * Scan a single local file.
     *
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param modelPath Path of the local file to scan
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI
     * @param waitForResults Whether to wait for the scan to finish
     * @param requestSource Source that requested the scan
     * @param origin Origin platform where the model came from
     * @return A future of the scan results
     */
    public CompletableFuture<ScanReportOfRecordV3> scanFile(
            String modelName,
            String modelPath,
            String modelVersion,
            boolean waitForResults,
            String requestSource,
            String origin) {
        return scanFile(new ScanFileOptions(modelName, modelPath, modelVersion, waitForResults, requestSource, origin));
    }

    /**
     * Scan every file under a local folder, as one model.
     *
     * @param options The scan options
     * @return A future of the scan results, which fails with what failed: an {@link IllegalArgumentException} for a
     *     path that is not an existing folder or holds no file to scan, or the upload's or the scan's own failure
     */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(ScanFolderOptions options) {
        return CompletableFuture.supplyAsync(
                        () -> {
                            List<Path> files = ScanUploads.requireFolderFiles(options);
                            LOGGER.info("Starting async folder scan for: " + options.getPath() + ", found "
                                    + files.size() + " files to scan");
                            return files;
                        },
                        executor)
                .thenCompose(files -> scan(
                        files,
                        options.getModelName(),
                        options.getModelVersion(),
                        options.getRequestSource(),
                        options.getOrigin(),
                        options.getWaitForResults()))
                .whenComplete((report, failure) -> {
                    if (failure != null) {
                        LOGGER.severe("Failed to upload folder: "
                                + ScanUtils.unwrap(failure).getMessage());
                    }
                });
    }

    /** Scan every file under a local folder as version {@code "1"}, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(String modelName, String path) {
        return scanFolder(modelName, path, ScanFileOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan every file under a local folder, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(String modelName, String path, String modelVersion) {
        return scanFolder(modelName, path, modelVersion, Collections.<String>emptyList());
    }

    /** Scan the files under a local folder that match one of {@code allowFilePatterns}, or all when it is empty. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(
            String modelName, String path, String modelVersion, List<String> allowFilePatterns) {
        return scanFolder(
                modelName, path, modelVersion, allowFilePatterns, ScanFolderOptions.DEFAULT_IGNORE_FILE_PATTERNS);
    }

    /** Scan the files under a local folder that the patterns select, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(
            String modelName,
            String path,
            String modelVersion,
            List<String> allowFilePatterns,
            List<String> ignoreFilePatterns) {
        return scanFolder(
                modelName,
                path,
                modelVersion,
                allowFilePatterns,
                ignoreFilePatterns,
                ScanFileOptions.DEFAULT_WAIT_FOR_RESULTS);
    }

    /** Scan the files under a local folder that the patterns select. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(
            String modelName,
            String path,
            String modelVersion,
            List<String> allowFilePatterns,
            List<String> ignoreFilePatterns,
            boolean waitForResults) {
        return scanFolder(
                modelName,
                path,
                modelVersion,
                allowFilePatterns,
                ignoreFilePatterns,
                waitForResults,
                ScanFileOptions.DEFAULT_REQUEST_SOURCE);
    }

    /** Scan the files under a local folder that the patterns select. */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(
            String modelName,
            String path,
            String modelVersion,
            List<String> allowFilePatterns,
            List<String> ignoreFilePatterns,
            boolean waitForResults,
            String requestSource) {
        return scanFolder(
                modelName,
                path,
                modelVersion,
                allowFilePatterns,
                ignoreFilePatterns,
                waitForResults,
                requestSource,
                ScanFileOptions.DEFAULT_ORIGIN);
    }

    /**
     * Scan the files under a local folder that the patterns select.
     *
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param path Path of the local folder to scan
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI
     * @param allowFilePatterns When not empty, only files matching one of these patterns are scanned
     * @param ignoreFilePatterns Files matching one of these patterns are not scanned
     * @param waitForResults Whether to wait for the scan to finish
     * @param requestSource Source that requested the scan
     * @param origin Origin platform where the model came from
     * @return A future of the scan results
     */
    public CompletableFuture<ScanReportOfRecordV3> scanFolder(
            String modelName,
            String path,
            String modelVersion,
            List<String> allowFilePatterns,
            List<String> ignoreFilePatterns,
            boolean waitForResults,
            String requestSource,
            String origin) {
        return scanFolder(new ScanFolderOptions(
                modelName,
                path,
                modelVersion,
                allowFilePatterns,
                ignoreFilePatterns,
                waitForResults,
                requestSource,
                origin));
    }

    /** Stops the scanner's threads. A scan still uploading or waiting for its results fails at its next step. */
    @Override
    public void close() {
        executor.shutdown();
    }

    private CompletableFuture<ScanReportOfRecordV3> scan(
            List<Path> files,
            String modelName,
            String modelVersion,
            String requestSource,
            String origin,
            boolean waitForResults) {
        return client.scans()
                .upload()
                .start(ScanUploads.startRequest(modelName, modelVersion, requestSource, origin))
                .thenCompose(started -> {
                    String scanId = started.getScanId();
                    List<CompletableFuture<Void>> uploads = new ArrayList<>(files.size());
                    for (Path file : files) {
                        uploads.add(uploadFile(scanId, file));
                    }
                    return allOf(uploads)
                            .thenCompose(ignored -> client.scans().upload().completeAll(scanId))
                            .thenCompose(ignored -> waitForResults
                                    ? ScanUtils.waitForScanResultsAsync(client, scanId, executor)
                                    : ScanUtils.getScanResultsAsync(client, scanId, executor));
                });
    }

    private CompletableFuture<Void> uploadFile(String scanId, Path file) {
        return CompletableFuture.supplyAsync(() -> ScanUploads.size(file), executor)
                .thenCompose(fileSize -> client.scans()
                        .upload()
                        .file()
                        .add(scanId, ScanUploads.addRequest(file, fileSize))
                        .thenCompose(upload -> {
                            List<CompletableFuture<Void>> parts =
                                    new ArrayList<>(upload.getParts().size());
                            upload.getParts()
                                    .forEach(part -> parts.add(CompletableFuture.runAsync(
                                            () -> ScanUploads.uploadPart(file, fileSize, part), executor)));
                            return allOf(parts)
                                    .thenCompose(ignored ->
                                            client.scans().upload().file().complete(scanId, upload.getUploadId()));
                        }))
                .thenApply(ignored -> null);
    }

    private static CompletableFuture<Void> allOf(List<CompletableFuture<Void>> futures) {
        return CompletableFuture.allOf(futures.toArray(new CompletableFuture<?>[0]));
    }
}
