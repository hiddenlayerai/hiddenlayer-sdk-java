// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.client

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.getPackageVersion
import com.hiddenlayer_sdk.api.services.async.ModelServiceAsync
import com.hiddenlayer_sdk.api.services.async.ModelServiceAsyncImpl
import com.hiddenlayer_sdk.api.services.async.ScanServiceAsync
import com.hiddenlayer_sdk.api.services.async.ScanServiceAsyncImpl
import com.hiddenlayer_sdk.api.services.async.SensorServiceAsync
import com.hiddenlayer_sdk.api.services.async.SensorServiceAsyncImpl
import com.hiddenlayer_sdk.api.services.async.VectorServiceAsync
import com.hiddenlayer_sdk.api.services.async.VectorServiceAsyncImpl
import java.util.function.Consumer

class HiddenLayerClientAsyncImpl(private val clientOptions: ClientOptions) :
    HiddenLayerClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: HiddenLayerClient by lazy { HiddenLayerClientImpl(clientOptions) }

    private val withRawResponse: HiddenLayerClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensors: SensorServiceAsync by lazy {
        SensorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vectors: VectorServiceAsync by lazy {
        VectorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scans: ScanServiceAsync by lazy { ScanServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): HiddenLayerClient = sync

    override fun withRawResponse(): HiddenLayerClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HiddenLayerClientAsync =
        HiddenLayerClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun models(): ModelServiceAsync = models

    override fun sensors(): SensorServiceAsync = sensors

    override fun vectors(): VectorServiceAsync = vectors

    override fun scans(): ScanServiceAsync = scans

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HiddenLayerClientAsync.WithRawResponse {

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensors: SensorServiceAsync.WithRawResponse by lazy {
            SensorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vectors: VectorServiceAsync.WithRawResponse by lazy {
            VectorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scans: ScanServiceAsync.WithRawResponse by lazy {
            ScanServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HiddenLayerClientAsync.WithRawResponse =
            HiddenLayerClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun models(): ModelServiceAsync.WithRawResponse = models

        override fun sensors(): SensorServiceAsync.WithRawResponse = sensors

        override fun vectors(): VectorServiceAsync.WithRawResponse = vectors

        override fun scans(): ScanServiceAsync.WithRawResponse = scans
    }
}
