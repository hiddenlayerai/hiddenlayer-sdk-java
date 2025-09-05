/**
 * Community scan functionality for Hidden Layer SDK.
 *
 * This module provides the communityScan method that was available in the old SDK, which combines
 * scan request + polling + results retrieval in a single convenient method.
 */
package com.hiddenlayer_sdk.api.lib

import com.hiddenlayer_sdk.api.client.HiddenLayerClient
import com.hiddenlayer_sdk.api.client.HiddenLayerClientAsync
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.concurrent.CompletableFuture

/** Community scan source constants matching the old SDK. */
object CommunityScanSource {
    const val LOCAL = "LOCAL"
    const val AWS_PRESIGNED = "AWS_PRESIGNED"
    const val AWS_IAM_ROLE = "AWS_IAM_ROLE"
    const val AZURE_BLOB_SAS = "AZURE_BLOB_SAS"
    const val AZURE_BLOB_AD = "AZURE_BLOB_AD"
    const val GOOGLE_SIGNED = "GOOGLE_SIGNED"
    const val GOOGLE_OAUTH = "GOOGLE_OAUTH"
    const val HUGGING_FACE = "HUGGING_FACE"
}

/** Options for community scan operations. */
data class CommunityScanOptions(
    val modelName: String,
    val modelPath: String,
    val modelSource: String,
    val modelVersion: String = "main",
    val waitForResults: Boolean = true,
    val requestSource: String = "API Upload",
    val origin: String = "",
)

/**
 * Community scanner that provides the communityScan method with polling functionality.
 *
 * This class extends the generated SDK to provide the same functionality as the old SDK's
 * communityScan method, which initiates a scan and optionally waits for results.
 */
class CommunityScanner(private val client: HiddenLayerClient) {

    /**
     * Scan a model available at a remote location using the HiddenLayer Model Scanner.
     *
     * @param options The scan options containing model information
     * @return Scan Results
     * @throws RuntimeException if the scan fails or times out
     */
    fun communityScan(options: CommunityScanOptions): ScanReport {
        // Create the scan job
        val requestParams =
            JobRequestParams.builder()
                .access(
                    JobRequestParams.Access.builder()
                        .source(JobRequestParams.Access.Source.of(options.modelSource))
                        .build()
                )
                .inventory(
                    JobRequestParams.Inventory.builder()
                        .modelName(options.modelName)
                        .modelVersion(options.modelVersion)
                        .requestedScanLocation(options.modelPath)
                        .requestingEntity(options.requestSource)
                        .origin(options.origin)
                        .requestSource(
                            when (options.requestSource) {
                                "Hybrid Upload" ->
                                    JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD
                                "API Upload" -> JobRequestParams.Inventory.RequestSource.API_UPLOAD
                                "Integration" ->
                                    JobRequestParams.Inventory.RequestSource.INTEGRATION
                                "UI Upload" -> JobRequestParams.Inventory.RequestSource.UI_UPLOAD
                                else ->
                                    JobRequestParams.Inventory.RequestSource.of(
                                        options.requestSource
                                    )
                            }
                        )
                        .build()
                )
                .build()

        val scanJob = client.scans().jobs().request(requestParams)
        val scanId =
            scanJob.scanId().orElseThrow {
                RuntimeException("Scan ID not returned from scan request")
            }

        // Return results based on waitForResults flag
        return if (options.waitForResults) {
            waitForScanResults(client, scanId)
        } else {
            getScanResults(client, scanId)
        }
    }

    /**
     * Convenience method with individual parameters (for backward compatibility).
     *
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param modelPath Path to the model file in the remote location, e.g. a presigned S3 URL
     * @param modelSource Type of remote location where the model is stored
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI (default: "main")
     * @param waitForResults Whether to wait for the scan to finish (default: true)
     * @param requestSource Source that requested the scan (default: "API Upload")
     * @param origin Origin platform where the model came from (default: "")
     * @return Scan Results
     */
    @JvmOverloads
    fun communityScan(
        modelName: String,
        modelPath: String,
        modelSource: String,
        modelVersion: String = "main",
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): ScanReport {
        return communityScan(
            CommunityScanOptions(
                modelName = modelName,
                modelPath = modelPath,
                modelSource = modelSource,
                modelVersion = modelVersion,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }
}

/**
 * Async version of CommunityScanner that provides the communityScan method with polling
 * functionality.
 *
 * This class extends the generated SDK to provide the same functionality as the old SDK's
 * communityScan method, which initiates a scan and optionally waits for results.
 */
class AsyncCommunityScanner(private val client: HiddenLayerClientAsync) : AutoCloseable {

    /** Scheduled executor for retry operations */
    private val executor = java.util.concurrent.Executors.newScheduledThreadPool(2)

    /**
     * Async version of communityScan.
     *
     * @param options The scan options containing model information
     * @return A CompletableFuture containing the scan results
     */
    fun communityScan(options: CommunityScanOptions): CompletableFuture<ScanReport> {
        // Create the scan job
        val requestParams =
            JobRequestParams.builder()
                .access(
                    JobRequestParams.Access.builder()
                        .source(JobRequestParams.Access.Source.of(options.modelSource))
                        .build()
                )
                .inventory(
                    JobRequestParams.Inventory.builder()
                        .modelName(options.modelName)
                        .modelVersion(options.modelVersion)
                        .requestedScanLocation(options.modelPath)
                        .requestingEntity(options.requestSource)
                        .origin(options.origin)
                        .requestSource(
                            when (options.requestSource) {
                                "Hybrid Upload" ->
                                    JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD
                                "API Upload" -> JobRequestParams.Inventory.RequestSource.API_UPLOAD
                                "Integration" ->
                                    JobRequestParams.Inventory.RequestSource.INTEGRATION
                                "UI Upload" -> JobRequestParams.Inventory.RequestSource.UI_UPLOAD
                                else ->
                                    JobRequestParams.Inventory.RequestSource.of(
                                        options.requestSource
                                    )
                            }
                        )
                        .build()
                )
                .build()

        return client.scans().jobs().request(requestParams).thenCompose { scanJob ->
            val scanId =
                scanJob.scanId().orElseThrow {
                    RuntimeException("Scan ID not returned from scan request")
                }

            // Return results based on waitForResults flag
            if (options.waitForResults) {
                waitForScanResultsAsync(client, scanId, executor)
            } else {
                getScanResultsAsync(client, scanId, executor)
            }
        }
    }

    /**
     * Convenience method with individual parameters (for backward compatibility).
     *
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param modelPath Path to the model file in the remote location, e.g. a presigned S3 URL
     * @param modelSource Type of remote location where the model is stored
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI (default: "main")
     * @param waitForResults Whether to wait for the scan to finish (default: true)
     * @param requestSource Source that requested the scan (default: "API Upload")
     * @param origin Origin platform where the model came from (default: "")
     * @return A CompletableFuture containing the scan results
     */
    @JvmOverloads
    fun communityScan(
        modelName: String,
        modelPath: String,
        modelSource: String,
        modelVersion: String = "main",
        waitForResults: Boolean = true,
        requestSource: String = "API Upload",
        origin: String = "",
    ): CompletableFuture<ScanReport> {
        return communityScan(
            CommunityScanOptions(
                modelName = modelName,
                modelPath = modelPath,
                modelSource = modelSource,
                modelVersion = modelVersion,
                waitForResults = waitForResults,
                requestSource = requestSource,
                origin = origin,
            )
        )
    }

    /**
     * Closes the AsyncCommunityScanner and shuts down the internal scheduled executor.
     *
     * This method implements AutoCloseable.close() and ensures that all threads in the internal
     * executor are properly shut down.
     */
    override fun close() {
        executor.shutdown()
    }
}
