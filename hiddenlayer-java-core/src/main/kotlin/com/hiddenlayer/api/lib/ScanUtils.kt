/**
 * Shared utilities for scan functionality across different scanner types.
 *
 * This module provides common retry logic for handling scan retrieval operations that may initially
 * return 404 errors due to timing issues.
 */
package com.hiddenlayer.api.lib

import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.client.HiddenLayerClientAsync
import com.hiddenlayer.api.errors.NotFoundException
import com.hiddenlayer.api.models.scans.jobs.JobRetrieveParams
import com.hiddenlayer.api.models.scans.results.ScanReport
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

/**
 * Get scan results with retry logic for 404 errors.
 *
 * Used when waitForResults=false to handle initial scan availability.
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
            return client
                .scans()
                .jobs()
                .retrieve(JobRetrieveParams.builder().scanId(scanId).build())
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
 * Wait for scan results using exponential backoff polling.
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
    var scanResults: ScanReport? = null

    while (true) {
        try {
            scanResults =
                client.scans().jobs().retrieve(JobRetrieveParams.builder().scanId(scanId).build())
            // If we got here, scan exists - check if it's done
            val status = scanResults.status()
            if (
                status == com.hiddenlayer.api.models.scans.results.ScanReport.Status.DONE ||
                    status ==
                        com.hiddenlayer.api.models.scans.results.ScanReport.Status.FAILED ||
                    status ==
                        com.hiddenlayer.api.models.scans.results.ScanReport.Status.CANCELED
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

    return scanResults!!
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
        .jobs()
        .retrieve(JobRetrieveParams.builder().scanId(scanId).build())
        .handle { result, exception ->
            when {
                result != null -> CompletableFuture.completedFuture(result)
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
        .jobs()
        .retrieve(JobRetrieveParams.builder().scanId(scanId).build())
        .handle { result, exception ->
            when {
                result != null -> {
                    val status = result.status()
                    if (
                        status ==
                            com.hiddenlayer.api.models.scans.results.ScanReport.Status.DONE ||
                            status ==
                                com.hiddenlayer.api.models.scans.results.ScanReport.Status
                                    .FAILED ||
                            status ==
                                com.hiddenlayer.api.models.scans.results.ScanReport.Status
                                    .CANCELED
                    ) {
                        CompletableFuture.completedFuture(result)
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
