package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.AsyncBaseHiddenLayerClient;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Scans models that are at a remote location without blocking the caller.
 *
 * <p>The scanner schedules its polls on threads of its own, which keep the JVM alive until {@link #close()} stops
 * them. A scanner taken from {@code AsyncHiddenLayerClient.communityScanner()} is closed with its client; close one
 * you construct yourself.
 */
public class AsyncCommunityScanner implements AutoCloseable {
    private final AsyncBaseHiddenLayerClient client;

    private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

    public AsyncCommunityScanner(AsyncBaseHiddenLayerClient client) {
        this.client = client;
    }

    /**
     * Scan a model available at a remote location.
     *
     * @param options The scan options
     * @return A future of the scan results
     */
    public CompletableFuture<ScanReportOfRecordV3> communityScan(CommunityScanOptions options) {
        // From the scanner's thread: issuing a request can block on the token exchange, and throw its failure.
        return CompletableFuture.supplyAsync(
                        () -> client.scans().jobs().request(CommunityScans.jobRequest(options)), executor)
                .thenCompose(request -> request)
                .thenCompose(scanJob -> {
                    String scanId = CommunityScans.scanId(scanJob);
                    return options.getWaitForResults()
                            ? ScanUtils.waitForScanResultsAsync(client, scanId, executor)
                            : ScanUtils.getScanResultsAsync(client, scanId, executor);
                });
    }

    /** Scan a model at a remote location as version {@code "main"}, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> communityScan(
            String modelName, String modelPath, String modelSource) {
        return communityScan(modelName, modelPath, modelSource, CommunityScanOptions.DEFAULT_MODEL_VERSION);
    }

    /** Scan a model at a remote location, waiting for results. */
    public CompletableFuture<ScanReportOfRecordV3> communityScan(
            String modelName, String modelPath, String modelSource, String modelVersion) {
        return communityScan(
                modelName, modelPath, modelSource, modelVersion, CommunityScanOptions.DEFAULT_WAIT_FOR_RESULTS);
    }

    /** Scan a model at a remote location. */
    public CompletableFuture<ScanReportOfRecordV3> communityScan(
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
    public CompletableFuture<ScanReportOfRecordV3> communityScan(
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
     * @return A future of the scan results
     */
    public CompletableFuture<ScanReportOfRecordV3> communityScan(
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

    /** Stops the scanner's threads. A scan still waiting for its results fails at its next poll. */
    @Override
    public void close() {
        executor.shutdown();
    }
}
