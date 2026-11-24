package com.hiddenlayer.api.lib;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hiddenlayer.api.AsyncBaseHiddenLayerClient;
import com.hiddenlayer.api.BaseHiddenLayerClient;
import com.hiddenlayer.api.core.HiddenLayerApiException;
import com.hiddenlayer.api.core.HiddenLayerException;
import com.hiddenlayer.api.core.ObjectMappers;
import com.hiddenlayer.api.core.pagination.SyncPagingIterable;
import com.hiddenlayer.api.resources.scans.results.requests.ListFilesResultsRequest;
import com.hiddenlayer.api.resources.scans.results.types.ListFilesResultsResponse;
import com.hiddenlayer.api.types.ScanFileResultWithComplianceV3;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import com.hiddenlayer.api.types.ScanReportSummaryResponseV3;
import com.hiddenlayer.api.types.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Reads a scan's report, retrying while the scan isn't available yet.
 *
 * <p>A report is assembled from the summary endpoint and the cursor-paginated file-results endpoint; the
 * unpaginated results endpoint is not used.
 */
public final class ScanUtils {
    static final int FILE_RESULTS_PAGE_SIZE = 100;

    // One scan's page reads stop here (1M files at the page size above): a cursor that never advances must fail
    // rather than paginate forever.
    static final int FILE_RESULTS_MAX_PAGES = 10_000;

    static final int MAX_AVAILABILITY_ATTEMPTS = 5;

    // The generated client retries a response's status, not a request that timed out or lost its connection, as
    // 2.x's did. This many of those in a row end a wait for results.
    static final int MAX_POLL_NETWORK_FAILURES = 3;

    private static final Logger LOGGER = Logger.getLogger("ScanUtils");

    // Deprecated top-level report fields that mirror `.summary.*` per the API contract.
    private static final List<String> DEPRECATED_SUMMARY_MIRROR_FIELDS = Collections.unmodifiableList(Arrays.asList(
            "detection_count", "file_count", "files_with_detections_count", "detection_categories", "severity"));

    private ScanUtils() {}

    /**
     * Get the scan report, retrying while the scan is not found.
     *
     * <p>Used when a scan helper is told not to wait for results. If the scan is still running, the report is a
     * point-in-time snapshot: paginating over an active scan may miss or duplicate file entries.
     *
     * @param client The HiddenLayer client
     * @param scanId The ID of the scan to retrieve
     * @return The scan report
     * @throws HiddenLayerApiException with status 404 if the scan is still not found after every attempt
     */
    public static ScanReportOfRecordV3 getScanResults(BaseHiddenLayerClient client, String scanId) {
        return getScanResults(client, scanId, ScanPacing.DEFAULT);
    }

    static ScanReportOfRecordV3 getScanResults(BaseHiddenLayerClient client, String scanId, ScanPacing pacing) {
        int attempts = 0;
        while (true) {
            try {
                ScanReportSummaryResponseV3 summary = client.scans().results().retrieveSummary(scanId);
                return buildScanReport(summary, collectFileResults(client, scanId, pacing));
            } catch (HiddenLayerApiException e) {
                if (!isNotFound(e)) {
                    throw e;
                }
                attempts++;
                if (attempts >= MAX_AVAILABILITY_ATTEMPTS) {
                    LOGGER.severe(notFoundAfterEveryAttempt(scanId));
                    throw e;
                }
                pause(logAvailabilityRetry(pacing, attempts));
            }
        }
    }

    /**
     * Wait for the scan to finish, then assemble the full report.
     *
     * <p>Polls the summary endpoint until the scan is done, failed or canceled, treating a scan that is not found
     * yet as one that hasn't finished.
     *
     * @param client The HiddenLayer client
     * @param scanId The ID of the scan to wait for
     * @return The finished scan's report
     * @throws HiddenLayerException when three status polls in a row time out or lose their connection
     */
    public static ScanReportOfRecordV3 waitForScanResults(BaseHiddenLayerClient client, String scanId) {
        return waitForScanResults(client, scanId, ScanPacing.DEFAULT);
    }

    static ScanReportOfRecordV3 waitForScanResults(BaseHiddenLayerClient client, String scanId, ScanPacing pacing) {
        int polls = 0;
        int networkFailures = 0;
        while (true) {
            ScanReportSummaryResponseV3 summary = null;
            try {
                summary = client.scans().results().retrieveSummary(scanId);
                networkFailures = 0;
            } catch (HiddenLayerApiException e) {
                if (!isNotFound(e)) {
                    throw e;
                }
                networkFailures = 0;
                LOGGER.info("scan not found yet, retrying...");
            } catch (HiddenLayerException e) {
                networkFailures++;
                if (!mayPollAgain(e, networkFailures)) {
                    throw e;
                }
            }
            if (summary != null) {
                if (isFinished(summary.getStatus())) {
                    return buildScanReport(summary, collectFileResults(client, scanId, pacing));
                }
                LOGGER.info("scan status: " + summary.getStatus());
            }
            polls++;
            pause(pacing.pollDelayMillis(polls));
        }
    }

    /**
     * Asynchronous {@link #getScanResults(BaseHiddenLayerClient, String)}.
     *
     * @param client The asynchronous HiddenLayer client
     * @param scanId The ID of the scan to retrieve
     * @param executor Schedules the retries and the reads of further pages
     * @return A future of the scan report
     */
    public static CompletableFuture<ScanReportOfRecordV3> getScanResultsAsync(
            AsyncBaseHiddenLayerClient client, String scanId, ScheduledExecutorService executor) {
        return getScanResultsAsync(client, scanId, executor, ScanPacing.DEFAULT);
    }

    static CompletableFuture<ScanReportOfRecordV3> getScanResultsAsync(
            AsyncBaseHiddenLayerClient client, String scanId, ScheduledExecutorService executor, ScanPacing pacing) {
        CompletableFuture<ScanReportOfRecordV3> result = new CompletableFuture<>();
        readReport(new AsyncRead(client, scanId, executor, pacing), 0, result);
        return result;
    }

    /**
     * Asynchronous {@link #waitForScanResults(BaseHiddenLayerClient, String)}.
     *
     * @param client The asynchronous HiddenLayer client
     * @param scanId The ID of the scan to wait for
     * @param executor Schedules the polls and the reads of further pages
     * @return A future of the finished scan's report
     */
    public static CompletableFuture<ScanReportOfRecordV3> waitForScanResultsAsync(
            AsyncBaseHiddenLayerClient client, String scanId, ScheduledExecutorService executor) {
        return waitForScanResultsAsync(client, scanId, executor, ScanPacing.DEFAULT);
    }

    static CompletableFuture<ScanReportOfRecordV3> waitForScanResultsAsync(
            AsyncBaseHiddenLayerClient client, String scanId, ScheduledExecutorService executor, ScanPacing pacing) {
        CompletableFuture<ScanReportOfRecordV3> result = new CompletableFuture<>();
        pollUntilFinished(new AsyncRead(client, scanId, executor, pacing), 0, 0, result);
        return result;
    }

    /** Assemble a full scan report from a scan summary plus its paginated file results. */
    static ScanReportOfRecordV3 buildScanReport(
            ScanReportSummaryResponseV3 summary, List<ScanFileResultWithComplianceV3> fileResults) {
        ObjectNode report = ObjectMappers.JSON_MAPPER.valueToTree(summary);
        report.set("file_results", ObjectMappers.JSON_MAPPER.valueToTree(fileResults));
        JsonNode nestedSummary = report.get("summary");
        if (nestedSummary != null && nestedSummary.isObject()) {
            for (String field : DEPRECATED_SUMMARY_MIRROR_FIELDS) {
                if (!report.has(field) && nestedSummary.has(field)) {
                    report.set(field, nestedSummary.get(field));
                }
            }
        }
        try {
            return ObjectMappers.JSON_MAPPER.treeToValue(report, ScanReportOfRecordV3.class);
        } catch (JsonProcessingException e) {
            throw new HiddenLayerException("Failed to assemble the scan report: " + e.getMessage(), e);
        }
    }

    /** Fetch every file result for a scan, pausing between page reads. */
    static List<ScanFileResultWithComplianceV3> collectFileResults(
            BaseHiddenLayerClient client, String scanId, ScanPacing pacing) {
        List<ScanFileResultWithComplianceV3> fileResults = new ArrayList<>();
        String cursor = null;
        int pages = 0;
        while (true) {
            SyncPagingIterable<ScanFileResultWithComplianceV3> page =
                    client.scans().results().listFiles(scanId, filesRequest(cursor));
            pages++;
            fileResults.addAll(page.getItems());
            cursor = nextCursor(page);
            if (cursor == null) {
                return fileResults;
            }
            if (pages >= FILE_RESULTS_MAX_PAGES) {
                throw tooManyPages(scanId);
            }
            pause(pacing.pageDelayMillis());
        }
    }

    static CompletableFuture<List<ScanFileResultWithComplianceV3>> collectFileResultsAsync(AsyncRead read) {
        CompletableFuture<List<ScanFileResultWithComplianceV3>> result = new CompletableFuture<>();
        readFilesPage(read, null, 1, new ArrayList<>(), result);
        return result;
    }

    /**
     * The cursor of the page after this one, or null on the last page. The API sends an empty cursor on the last
     * page, and a page without items ends the listing whatever its cursor.
     */
    static String nextCursor(SyncPagingIterable<ScanFileResultWithComplianceV3> page) {
        if (page.getItems().isEmpty()) {
            return null;
        }
        Optional<ListFilesResultsResponse> response = page.getResponse();
        String next = response.map(ListFilesResultsResponse::getNext).orElse(null);
        return next == null || next.trim().isEmpty() ? null : next;
    }

    static Throwable unwrap(Throwable failure) {
        Throwable cause = failure;
        while ((cause instanceof CompletionException || cause instanceof ExecutionException)
                && cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    private static void readReport(AsyncRead read, int attempts, CompletableFuture<ScanReportOfRecordV3> result) {
        guard(result, () -> read.client
                .scans()
                .results()
                .retrieveSummary(read.scanId)
                .thenCompose(
                        summary -> collectFileResultsAsync(read).thenApply(files -> buildScanReport(summary, files)))
                .whenComplete((report, failure) -> guard(result, () -> {
                    if (failure == null) {
                        result.complete(report);
                        return;
                    }
                    Throwable cause = unwrap(failure);
                    int attempt = attempts + 1;
                    if (!isNotFound(cause)) {
                        result.completeExceptionally(cause);
                        return;
                    }
                    if (attempt >= MAX_AVAILABILITY_ATTEMPTS) {
                        LOGGER.severe(notFoundAfterEveryAttempt(read.scanId));
                        result.completeExceptionally(cause);
                        return;
                    }
                    long delay = logAvailabilityRetry(read.pacing, attempt);
                    schedule(read, delay, result, () -> readReport(read, attempt, result));
                })));
    }

    private static void pollUntilFinished(
            AsyncRead read, int polls, int networkFailures, CompletableFuture<ScanReportOfRecordV3> result) {
        guard(result, () -> read.client
                .scans()
                .results()
                .retrieveSummary(read.scanId)
                .whenComplete((summary, failure) -> guard(result, () -> {
                    int failuresInARow = 0;
                    if (failure != null) {
                        Throwable cause = unwrap(failure);
                        if (isNotFound(cause)) {
                            LOGGER.info("scan not found yet, retrying...");
                        } else if (mayPollAgain(cause, networkFailures + 1)) {
                            failuresInARow = networkFailures + 1;
                        } else {
                            result.completeExceptionally(cause);
                            return;
                        }
                    } else if (isFinished(summary.getStatus())) {
                        collectFileResultsAsync(read)
                                .whenComplete((files, filesFailure) -> guard(result, () -> {
                                    if (filesFailure != null) {
                                        result.completeExceptionally(unwrap(filesFailure));
                                    } else {
                                        result.complete(buildScanReport(summary, files));
                                    }
                                }));
                        return;
                    } else {
                        LOGGER.info("scan status: " + summary.getStatus());
                    }
                    int poll = polls + 1;
                    int failuresSoFar = failuresInARow;
                    schedule(
                            read,
                            read.pacing.pollDelayMillis(poll),
                            result,
                            () -> pollUntilFinished(read, poll, failuresSoFar, result));
                })));
    }

    private static void readFilesPage(
            AsyncRead read,
            String cursor,
            int pages,
            List<ScanFileResultWithComplianceV3> collected,
            CompletableFuture<List<ScanFileResultWithComplianceV3>> result) {
        guard(result, () -> read.client
                .scans()
                .results()
                .listFiles(read.scanId, filesRequest(cursor))
                .whenComplete((page, failure) -> guard(result, () -> {
                    if (failure != null) {
                        result.completeExceptionally(unwrap(failure));
                        return;
                    }
                    collected.addAll(page.getItems());
                    String next = nextCursor(page);
                    if (next == null) {
                        result.complete(collected);
                    } else if (pages >= FILE_RESULTS_MAX_PAGES) {
                        result.completeExceptionally(tooManyPages(read.scanId));
                    } else {
                        schedule(
                                read,
                                read.pacing.pageDelayMillis(),
                                result,
                                () -> readFilesPage(read, next, pages + 1, collected, result));
                    }
                })));
    }

    // Each step runs from a callback or a scheduled task, where a thrown exception would otherwise be dropped and
    // leave the caller's future pending forever.
    private static void guard(CompletableFuture<?> result, Runnable step) {
        try {
            step.run();
        } catch (Throwable e) {
            result.completeExceptionally(e);
        }
    }

    private static void schedule(AsyncRead read, long delayMillis, CompletableFuture<?> result, Runnable step) {
        try {
            read.executor.schedule(() -> guard(result, step), delayMillis, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            result.completeExceptionally(e);
        }
    }

    private static long logAvailabilityRetry(ScanPacing pacing, int attempts) {
        long delay = pacing.availabilityDelayMillis(attempts);
        LOGGER.info("Scan not yet available, retrying in " + delay / 1000.0 + "s (attempt " + (attempts + 1) + "/"
                + MAX_AVAILABILITY_ATTEMPTS + ")");
        return delay;
    }

    private static String notFoundAfterEveryAttempt(String scanId) {
        return "Scan " + scanId + " not found after " + MAX_AVAILABILITY_ATTEMPTS + " attempts";
    }

    private static ListFilesResultsRequest filesRequest(String cursor) {
        return ListFilesResultsRequest.builder()
                .pageSize(FILE_RESULTS_PAGE_SIZE)
                .cursor(Optional.ofNullable(cursor))
                .build();
    }

    private static boolean isFinished(Status status) {
        return Status.DONE.equals(status) || Status.FAILED.equals(status) || Status.CANCELED.equals(status);
    }

    private static boolean isNotFound(Throwable failure) {
        return failure instanceof HiddenLayerApiException && ((HiddenLayerApiException) failure).statusCode() == 404;
    }

    /** Whether a status poll that failed in transit is tried again: all but the third such failure in a row. */
    private static boolean mayPollAgain(Throwable failure, int networkFailures) {
        boolean isNetworkFailure = failure instanceof HiddenLayerException
                && !(failure instanceof HiddenLayerApiException)
                && failure.getCause() instanceof IOException;
        if (!isNetworkFailure || networkFailures >= MAX_POLL_NETWORK_FAILURES) {
            return false;
        }
        LOGGER.warning("scan status request failed, retrying: " + failure.getCause());
        return true;
    }

    private static IllegalStateException tooManyPages(String scanId) {
        return new IllegalStateException("Scan " + scanId + " file results exceeded " + FILE_RESULTS_MAX_PAGES
                + " pages; the next cursor is not advancing");
    }

    private static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new HiddenLayerException("Interrupted while waiting for scan results", e);
        }
    }

    /** What every step of an asynchronous read of one scan shares. */
    static final class AsyncRead {
        final AsyncBaseHiddenLayerClient client;

        final String scanId;

        final ScheduledExecutorService executor;

        final ScanPacing pacing;

        AsyncRead(
                AsyncBaseHiddenLayerClient client,
                String scanId,
                ScheduledExecutorService executor,
                ScanPacing pacing) {
            this.client = client;
            this.scanId = scanId;
            this.executor = executor;
            this.pacing = pacing;
        }
    }
}
