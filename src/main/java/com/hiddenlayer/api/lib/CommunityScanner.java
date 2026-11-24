package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.BaseHiddenLayerClient;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;

/**
 * Scans models that are at a remote location, such as a Hugging Face repository or a presigned URL.
 *
 * <p>A community scan requests the scan, then returns the scan report: the finished scan's when told to wait for
 * results, otherwise the report as it stands.
 */
public class CommunityScanner {
    private final BaseHiddenLayerClient client;

    public CommunityScanner(BaseHiddenLayerClient client) {
        this.client = client;
    }

    /**
     * Scan a model available at a remote location.
     *
     * @param options The scan options
     * @return Scan results
     */
    public ScanReportOfRecordV3 communityScan(CommunityScanOptions options) {
        String scanId = CommunityScans.scanId(client.scans().jobs().request(CommunityScans.jobRequest(options)));
        return options.getWaitForResults()
                ? ScanUtils.waitForScanResults(client, scanId)
                : ScanUtils.getScanResults(client, scanId);
    }

    /** Scan a model at a remote location as version {@code "main"}, waiting for results. */
    public ScanReportOfRecordV3 communityScan(String modelName, String modelPath, String modelSource) {
        return communityScan(modelName, modelPath, modelSource, CommunityScanOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan a model at a remote location, waiting for results. */
    public ScanReportOfRecordV3 communityScan(
            String modelName, String modelPath, String modelSource, String modelVersion) {
        return communityScan(
                modelName, modelPath, modelSource, modelVersion, CommunityScanOptions.DEFAULT_WAIT_FOR_RESULTS);
    }

    /** Scan a model at a remote location. */
    public ScanReportOfRecordV3 communityScan(
            String modelName, String modelPath, String modelSource, String modelVersion, boolean waitForResults) {
        return communityScan(
                modelName,
                modelPath,
                modelSource,
                modelVersion,
                waitForResults,
                CommunityScanOptions.DEFAULT_REQUEST_SOURCE);
    }

    /** Scan a model at a remote location. */
    public ScanReportOfRecordV3 communityScan(
            String modelName,
            String modelPath,
            String modelSource,
            String modelVersion,
            boolean waitForResults,
            String requestSource) {
        return communityScan(
                modelName,
                modelPath,
                modelSource,
                modelVersion,
                waitForResults,
                requestSource,
                CommunityScanOptions.DEFAULT_ORIGIN);
    }

    /**
     * Scan a model available at a remote location.
     *
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param modelPath Path to the model in the remote location, e.g. a presigned S3 URL
     * @param modelSource Type of remote location where the model is stored, see {@link CommunityScanSource}
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI
     * @param waitForResults Whether to wait for the scan to finish
     * @param requestSource Source that requested the scan
     * @param origin Origin platform where the model came from
     * @return Scan results
     */
    public ScanReportOfRecordV3 communityScan(
            String modelName,
            String modelPath,
            String modelSource,
            String modelVersion,
            boolean waitForResults,
            String requestSource,
            String origin) {
        return communityScan(new CommunityScanOptions(
                modelName, modelPath, modelSource, modelVersion, waitForResults, requestSource, origin));
    }
}
