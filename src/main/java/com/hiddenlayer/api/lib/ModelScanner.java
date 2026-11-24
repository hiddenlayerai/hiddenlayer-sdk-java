package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.BaseHiddenLayerClient;
import com.hiddenlayer.api.core.HiddenLayerException;
import com.hiddenlayer.api.resources.scans.upload.file.types.AddFileResponse;
import com.hiddenlayer.api.resources.scans.upload.file.types.AddFileResponsePartsItem;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Scans local model files and folders.
 *
 * <p>Each scan uploads the files in parts, then returns the scan report: the finished scan's when told to wait for
 * results, otherwise the report as it stands.
 */
public class ModelScanner {
    private static final Logger LOGGER = Logger.getLogger("ModelScanner");

    private final BaseHiddenLayerClient client;

    public ModelScanner(BaseHiddenLayerClient client) {
        this.client = client;
    }

    /**
     * Scan a single local file.
     *
     * @param options The scan options
     * @return Scan results
     * @throws IllegalArgumentException if the path is not an existing file
     * @throws HiddenLayerException if the upload or the scan fails; its cause is the failure
     */
    public ScanReportOfRecordV3 scanFile(ScanFileOptions options) {
        Path file = ScanUploads.requireFile(options.getModelPath());
        LOGGER.info("Starting file scan for: " + options.getModelPath());
        String scanId = startUpload(
                options.getModelName(), options.getModelVersion(), options.getRequestSource(), options.getOrigin());
        try {
            return uploadAndRead(scanId, Collections.singletonList(file), options.getWaitForResults());
        } catch (RuntimeException e) {
            LOGGER.severe("Failed to upload file: " + e.getMessage());
            throw new HiddenLayerException("File scan failed: " + e.getMessage(), e);
        }
    }

    /** Scan a single local file as version {@code "1"}, waiting for results. */
    public ScanReportOfRecordV3 scanFile(String modelName, String modelPath) {
        return scanFile(modelName, modelPath, ScanFileOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan a single local file, waiting for results. */
    public ScanReportOfRecordV3 scanFile(String modelName, String modelPath, String modelVersion) {
        return scanFile(modelName, modelPath, modelVersion, ScanFileOptions.DEFAULT_WAIT_FOR_RESULTS);
    }

    /** Scan a single local file. */
    public ScanReportOfRecordV3 scanFile(
            String modelName, String modelPath, String modelVersion, boolean waitForResults) {
        return scanFile(modelName, modelPath, modelVersion, waitForResults, ScanFileOptions.DEFAULT_REQUEST_SOURCE);
    }

    /** Scan a single local file. */
    public ScanReportOfRecordV3 scanFile(
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
     * @return Scan results
     */
    public ScanReportOfRecordV3 scanFile(
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
     * @return Scan results
     * @throws IllegalArgumentException if the path is not an existing folder, or no file in it is left to scan
     * @throws HiddenLayerException if the upload or the scan fails; its cause is the failure
     */
    public ScanReportOfRecordV3 scanFolder(ScanFolderOptions options) {
        List<Path> files = ScanUploads.requireFolderFiles(options);
        LOGGER.info("Starting folder scan for: " + options.getPath() + ", found " + files.size() + " files to scan");
        String scanId = startUpload(
                options.getModelName(), options.getModelVersion(), options.getRequestSource(), options.getOrigin());
        try {
            return uploadAndRead(scanId, files, options.getWaitForResults());
        } catch (RuntimeException e) {
            LOGGER.severe("Failed to upload folder: " + e.getMessage());
            throw new HiddenLayerException("Folder scan failed: " + e.getMessage(), e);
        }
    }

    /** Scan every file under a local folder as version {@code "1"}, waiting for results. */
    public ScanReportOfRecordV3 scanFolder(String modelName, String path) {
        return scanFolder(modelName, path, ScanFileOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan every file under a local folder, waiting for results. */
    public ScanReportOfRecordV3 scanFolder(String modelName, String path, String modelVersion) {
        return scanFolder(modelName, path, modelVersion, Collections.<String>emptyList());
    }

    /** Scan the files under a local folder that match one of {@code allowFilePatterns}, or all when it is empty. */
    public ScanReportOfRecordV3 scanFolder(
            String modelName, String path, String modelVersion, List<String> allowFilePatterns) {
        return scanFolder(
                modelName, path, modelVersion, allowFilePatterns, ScanFolderOptions.DEFAULT_IGNORE_FILE_PATTERNS);
    }

    /** Scan the files under a local folder that the patterns select, waiting for results. */
    public ScanReportOfRecordV3 scanFolder(
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
    public ScanReportOfRecordV3 scanFolder(
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
    public ScanReportOfRecordV3 scanFolder(
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
     * @return Scan results
     */
    public ScanReportOfRecordV3 scanFolder(
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

    private String startUpload(String modelName, String modelVersion, String requestSource, String origin) {
        return client.scans()
                .upload()
                .start(ScanUploads.startRequest(modelName, modelVersion, requestSource, origin))
                .getScanId();
    }

    private ScanReportOfRecordV3 uploadAndRead(String scanId, List<Path> files, boolean waitForResults) {
        for (Path file : files) {
            uploadFile(scanId, file);
        }
        client.scans().upload().completeAll(scanId);
        return waitForResults ? ScanUtils.waitForScanResults(client, scanId) : ScanUtils.getScanResults(client, scanId);
    }

    private void uploadFile(String scanId, Path file) {
        long fileSize = ScanUploads.size(file);
        AddFileResponse upload = client.scans().upload().file().add(scanId, ScanUploads.addRequest(file, fileSize));
        for (AddFileResponsePartsItem part : upload.getParts()) {
            ScanUploads.uploadPart(file, fileSize, part);
        }
        client.scans().upload().file().complete(scanId, upload.getUploadId());
    }
}
