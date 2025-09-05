// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.client

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.lib.AsyncCommunityScanner
import com.hiddenlayer_sdk.api.lib.AsyncModelScanner
import com.hiddenlayer_sdk.api.services.async.ModelServiceAsync
import com.hiddenlayer_sdk.api.services.async.PromptAnalyzerServiceAsync
import com.hiddenlayer_sdk.api.services.async.ScanServiceAsync
import com.hiddenlayer_sdk.api.services.async.SensorServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Hidden Layer REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface HiddenLayerClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): HiddenLayerClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HiddenLayerClientAsync

    fun models(): ModelServiceAsync

    fun promptAnalyzer(): PromptAnalyzerServiceAsync

    fun sensors(): SensorServiceAsync

    fun scans(): ScanServiceAsync

    /**
     * Async community scanner that provides the communityScan method with polling functionality.
     *
     * This extends the generated SDK to provide the same functionality as the old SDK's
     * communityScan method, which initiates a scan and optionally waits for results.
     */
    fun communityScanner(): AsyncCommunityScanner

    /**
     * Model scanner that provides file and folder scanning functionality.
     *
     * This extends the generated SDK to provide async versions of all model scanning functionality
     * including file and folder scanning with multipart upload functionality.
     */
    fun modelScanner(): AsyncModelScanner

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [HiddenLayerClientAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HiddenLayerClientAsync.WithRawResponse

        fun models(): ModelServiceAsync.WithRawResponse

        fun promptAnalyzer(): PromptAnalyzerServiceAsync.WithRawResponse

        fun sensors(): SensorServiceAsync.WithRawResponse

        fun scans(): ScanServiceAsync.WithRawResponse
    }
}
