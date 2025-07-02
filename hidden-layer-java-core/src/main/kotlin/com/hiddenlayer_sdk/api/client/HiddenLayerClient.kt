// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.client

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.services.blocking.ModelService
import com.hiddenlayer_sdk.api.services.blocking.ScanService
import com.hiddenlayer_sdk.api.services.blocking.SensorService
import com.hiddenlayer_sdk.api.services.blocking.VectorService
import java.util.function.Consumer

/**
 * A client for interacting with the Hidden Layer REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface HiddenLayerClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): HiddenLayerClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HiddenLayerClient

    fun models(): ModelService

    fun sensors(): SensorService

    fun vectors(): VectorService

    fun scans(): ScanService

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

    /** A view of [HiddenLayerClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HiddenLayerClient.WithRawResponse

        fun models(): ModelService.WithRawResponse

        fun sensors(): SensorService.WithRawResponse

        fun vectors(): VectorService.WithRawResponse

        fun scans(): ScanService.WithRawResponse
    }
}
