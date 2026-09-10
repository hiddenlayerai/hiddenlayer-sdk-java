/**
 * Shared utilities for scan functionality across different scanner types.
 *
 * This module provides common retry logic for handling scan retrieval operations that may initially
 * return 404 errors due to timing issues.
 *
 * Scan reports are assembled from the summary endpoint plus the cursor-paginated file-results
 * endpoint; the unpaginated results endpoint is not used.
 */
package com.hiddenlayer.api.lib

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.client.HiddenLayerClientAsync
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.errors.NotFoundException
import com.hiddenlayer.api.models.scans.results.ResultListFilesPageAsync
import com.hiddenlayer.api.models.scans.results.ResultListFilesParams
import com.hiddenlayer.api.models.scans.results.ResultRetrieveSummaryParams
import com.hiddenlayer.api.models.scans.results.ScanFileResult
import com.hiddenlayer.api.models.scans.results.ScanReport
import com.hiddenlayer.api.models.scans.results.ScanReportSummary
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import java.util.logging.Logger

/** Scan status constants */
object ScanStatus {
    const val DONE = "done"
    const val FAILED = "failed"
    const val PENDING = "pending"
    const val RUNNING = "running"
    const val CANCELED = "canceled"
}

private val logger = Logger.getLogger("ScanUtils")

// Page size and inter-page delay for collecting file results. The delay throttles
// reconstruction of massive scans (10k+ files) so the SDK never hammers the API
// with back-to-back page reads.
private const val FILE_RESULTS_PAGE_SIZE = 100L
private const val FILE_RESULTS_PAGE_DELAY_MS = 250L

// Deprecated top-level report fields that mirror `.summary.*` per the API contract.
private val DEPRECATED_SUMMARY_MIRROR_FIELDS =
    listOf(
        "detection_count",
        "file_count",
        "files_with_detections_count",
        "detection_categories",
        "severity",
    )

/** Assemble a full ScanReport from a scan summary plus its paginated file results. */
internal fun buildScanReport(
    summary: ScanReportSummary,
    fileResults: List<ScanFileResult>,
): ScanReport {
    val mapper = jsonMapper()
    val report = mapper.valueToTree<ObjectNode>(summary)
    report.set<JsonNode>("file_results", mapper.valueToTree(fileResults))
    val nestedSummary = report.get("summary")
    if (nestedSummary != null && nestedSummary.isObject) {
        for (field in DEPRECATED_SUMMARY_MIRROR_FIELDS) {
            if (!report.has(field) && nestedSummary.has(field)) {
                report.set<JsonNode>(field, nestedSummary.get(field))
            }
        }
    }
    return mapper.treeToValue(report, ScanReport::class.java)
}

/** Fetch every file result for a scan, throttling between page reads. */
internal fun collectFileResults(client: HiddenLayerClient, scanId: String): List<ScanFileResult> {
    var page =
        client
            .scans()
            .results()
            .listFiles(
                ResultListFilesParams.builder()
                    .scanId(scanId)
                    .pageSize(FILE_RESULTS_PAGE_SIZE)
                    .build()
            )
    val fileResults = page.items().toMutableList()
    while (page.hasNextPage()) {
        Thread.sleep(FILE_RESULTS_PAGE_DELAY_MS)
        page = page.nextPage()
        fileResults.addAll(page.items())
    }
    return fileResults
}

/** Async version of collectFileResults; retries are scheduled on the supplied executor. */
internal fun collectFileResultsAsync(
    client: HiddenLayerClientAsync,
    scanId: String,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<List<ScanFileResult>> {
    return client
        .scans()
        .results()
        .listFiles(
            ResultListFilesParams.builder().scanId(scanId).pageSize(FILE_RESULTS_PAGE_SIZE).build()
        )
        .thenCompose { page ->
            collectRemainingPagesAsync(page, page.items().toMutableList(), executor)
        }
}

private fun collectRemainingPagesAsync(
    page: ResultListFilesPageAsync,
    collected: MutableList<ScanFileResult>,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<List<ScanFileResult>> {
    if (!page.hasNextPage()) {
        return CompletableFuture.completedFuture(collected)
    }
    val future = CompletableFuture<List<ScanFileResult>>()
    executor.schedule(
        Runnable {
            page
                .nextPage()
                .thenCompose { next ->
                    collected.addAll(next.items())
                    collectRemainingPagesAsync(next, collected, executor)
                }
                .whenComplete { result, ex ->
                    if (ex != null) {
                        future.completeExceptionally(ex)
                    } else {
                        future.complete(result)
                    }
                }
        },
        FILE_RESULTS_PAGE_DELAY_MS,
        TimeUnit.MILLISECONDS,
    )
    return future
}

/**
 * Get the scan report with retry logic for 404 errors.
 *
 * Used when waitForResults=false to handle initial scan availability.
 *
 * The report is assembled from the summary endpoint plus the paginated file-results endpoint. If
 * the scan is still running, the assembled report is a point-in-time snapshot: paginating over an
 * active scan may miss or duplicate file entries.
 *
 * @param client The HiddenLayer client instance
 * @param scanId The ID of the scan to retrieve
 * @return The scan report
 * @throws NotFoundException if scan is not found after all retries
 * @throws RuntimeException if an unexpected error occurs
 */
fun getScanResults(client: HiddenLayerClient, scanId: String): ScanReport {
    var retries = 0
    val maxRetries = 5 // Fewer retries since we're not waiting for completion
    val baseDelay = 500L // milliseconds

    while (retries < maxRetries) {
        try {
            val summary =
                client
                    .scans()
                    .results()
                    .retrieveSummary(ResultRetrieveSummaryParams.builder().scanId(scanId).build())
            return buildScanReport(summary, collectFileResults(client, scanId))
        } catch (e: NotFoundException) {
            retries++
            if (retries >= maxRetries) {
                logger.severe("Scan $scanId not found after $maxRetries attempts")
                throw e
            }

            val jitter = ThreadLocalRandom.current().nextLong(0, 500)
            val delay = baseDelay * retries + jitter
            logger.info(
                "Scan not yet available, retrying in ${delay / 1000.0}s (attempt ${retries + 1}/$maxRetries)"
            )
            Thread.sleep(delay)
        }
    }

    // Should never reach here due to throw above, but satisfy Kotlin
    throw RuntimeException("Scan $scanId not found after $maxRetries attempts")
}

/**
 * Wait for the scan to finish, then assemble the full report.
 *
 * Polls the lightweight summary endpoint for status; once the scan reaches a terminal state, the
 * report is assembled from that summary plus the paginated file-results endpoint (throttled between
 * pages).
 *
 * Handles initial 404 errors when scan is not immediately available.
 *
 * @param client The HiddenLayer client instance
 * @param scanId The ID of the scan to wait for
 * @return The completed scan report
 * @throws RuntimeException if an unexpected error occurs
 */
fun waitForScanResults(client: HiddenLayerClient, scanId: String): ScanReport {
    val baseDelay = 100L // milliseconds
    var retries = 0
    var summary: ScanReportSummary? = null

    while (true) {
        try {
            summary =
                client
                    .scans()
                    .results()
                    .retrieveSummary(ResultRetrieveSummaryParams.builder().scanId(scanId).build())
            // If we got here, scan exists - check if it's done
            val status = summary.status()
            if (
                status == ScanReportSummary.Status.DONE ||
                    status == ScanReportSummary.Status.FAILED ||
                    status == ScanReportSummary.Status.CANCELED
            ) {
                break
            }
            logger.info("scan status: $status")
        } catch (e: NotFoundException) {
            // Scan not found yet, treat it like any other retry condition
            logger.info("scan not found yet, retrying...")
        }

        retries++
        val jitter = ThreadLocalRandom.current().nextLong(0, 1000)
        var delay =
            baseDelay * Math.pow(2.0, retries.toDouble()).toLong() +
                jitter // exponential backoff retry
        delay = minOf(delay, 30000) // cap at 30 seconds
        Thread.sleep(delay)
    }

    return buildScanReport(summary!!, collectFileResults(client, scanId))
}

/**
 * Async version of getScanResults with retry logic for 404 errors.
 *
 * Used when waitForResults=false to handle initial scan availability.
 *
 * @param client The async HiddenLayer client instance
 * @param scanId The ID of the scan to retrieve
 * @param executor The executor to use for scheduling retries
 * @return A CompletableFuture containing the scan report
 */
fun getScanResultsAsync(
    client: HiddenLayerClientAsync,
    scanId: String,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<ScanReport> {
    return getScanResultsAsyncInternal(client, scanId, 0, 5, 500L, executor)
}

private fun getScanResultsAsyncInternal(
    client: HiddenLayerClientAsync,
    scanId: String,
    retries: Int,
    maxRetries: Int,
    baseDelay: Long,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<ScanReport> {
    return client
        .scans()
        .results()
        .retrieveSummary(ResultRetrieveSummaryParams.builder().scanId(scanId).build())
        .handle { result, exception ->
            when {
                result != null ->
                    collectFileResultsAsync(client, scanId, executor).thenApply { fileResults ->
                        buildScanReport(result, fileResults)
                    }
                exception is NotFoundException -> {
                    if (retries >= maxRetries) {
                        logger.severe("Scan $scanId not found after $maxRetries attempts")
                        val failedFuture = CompletableFuture<ScanReport>()
                        failedFuture.completeExceptionally(exception)
                        failedFuture
                    } else {
                        val jitter = ThreadLocalRandom.current().nextLong(0, 500)
                        val delay = baseDelay * (retries + 1) + jitter
                        logger.info(
                            "Scan not yet available, retrying in ${delay / 1000.0}s (attempt ${retries + 2}/$maxRetries)"
                        )

                        val future = CompletableFuture<ScanReport>()
                        executor.schedule(
                            Runnable {
                                getScanResultsAsyncInternal(
                                        client,
                                        scanId,
                                        retries + 1,
                                        maxRetries,
                                        baseDelay,
                                        executor,
                                    )
                                    .whenComplete { result, ex ->
                                        if (ex != null) {
                                            future.completeExceptionally(ex)
                                        } else {
                                            future.complete(result)
                                        }
                                    }
                            },
                            delay,
                            TimeUnit.MILLISECONDS,
                        )
                        future
                    }
                }
                else -> {
                    val failedFuture = CompletableFuture<ScanReport>()
                    failedFuture.completeExceptionally(
                        exception ?: RuntimeException("Unknown error")
                    )
                    failedFuture
                }
            }
        }
        .thenCompose { it }
}

/**
 * Async version of waitForScanResults.
 *
 * Handles initial 404 errors when scan is not immediately available.
 *
 * @param client The async HiddenLayer client instance
 * @param scanId The ID of the scan to wait for
 * @param executor The executor to use for scheduling retries
 * @return A CompletableFuture containing the completed scan report
 */
fun waitForScanResultsAsync(
    client: HiddenLayerClientAsync,
    scanId: String,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<ScanReport> {
    return waitForScanResultsAsyncInternal(client, scanId, 0, 100L, executor)
}

private fun waitForScanResultsAsyncInternal(
    client: HiddenLayerClientAsync,
    scanId: String,
    retries: Int,
    baseDelay: Long,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<ScanReport> {
    return client
        .scans()
        .results()
        .retrieveSummary(ResultRetrieveSummaryParams.builder().scanId(scanId).build())
        .handle { result, exception ->
            when {
                result != null -> {
                    val status = result.status()
                    if (
                        status == ScanReportSummary.Status.DONE ||
                            status == ScanReportSummary.Status.FAILED ||
                            status == ScanReportSummary.Status.CANCELED
                    ) {
                        // Scan is finished: collect file results and assemble the report
                        collectFileResultsAsync(client, scanId, executor).thenApply { fileResults ->
                            buildScanReport(result, fileResults)
                        }
                    } else {
                        logger.info("scan status: $status")
                        scheduleNextRetry(client, scanId, retries + 1, baseDelay, executor)
                    }
                }
                exception is NotFoundException -> {
                    logger.info("scan not found yet, retrying...")
                    scheduleNextRetry(client, scanId, retries + 1, baseDelay, executor)
                }
                else -> {
                    val failedFuture = CompletableFuture<ScanReport>()
                    failedFuture.completeExceptionally(
                        exception ?: RuntimeException("Unknown error")
                    )
                    failedFuture
                }
            }
        }
        .thenCompose { it }
}

private fun scheduleNextRetry(
    client: HiddenLayerClientAsync,
    scanId: String,
    retries: Int,
    baseDelay: Long,
    executor: java.util.concurrent.ScheduledExecutorService,
): CompletableFuture<ScanReport> {
    val jitter = ThreadLocalRandom.current().nextLong(0, 1000)
    var delay =
        baseDelay * Math.pow(2.0, retries.toDouble()).toLong() + jitter // exponential backoff retry
    delay = minOf(delay, 30000) // cap at 30 seconds

    val future = CompletableFuture<ScanReport>()
    executor.schedule(
        Runnable {
            waitForScanResultsAsyncInternal(client, scanId, retries, baseDelay, executor)
                .whenComplete { result, ex ->
                    if (ex != null) {
                        future.completeExceptionally(ex)
                    } else {
                        future.complete(result)
                    }
                }
        },
        delay,
        TimeUnit.MILLISECONDS,
    )
    return future
}
