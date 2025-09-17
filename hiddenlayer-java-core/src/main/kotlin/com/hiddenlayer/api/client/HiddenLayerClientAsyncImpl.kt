// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.client

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.getPackageVersion
import com.hiddenlayer.api.services.async.InteractionServiceAsync
import com.hiddenlayer.api.services.async.InteractionServiceAsyncImpl
import com.hiddenlayer.api.services.async.ModelServiceAsync
import com.hiddenlayer.api.services.async.ModelServiceAsyncImpl
import com.hiddenlayer.api.services.async.PromptAnalyzerServiceAsync
import com.hiddenlayer.api.services.async.PromptAnalyzerServiceAsyncImpl
import com.hiddenlayer.api.services.async.ScanServiceAsync
import com.hiddenlayer.api.services.async.ScanServiceAsyncImpl
import com.hiddenlayer.api.services.async.SensorServiceAsync
import com.hiddenlayer.api.services.async.SensorServiceAsyncImpl
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

    private val promptAnalyzer: PromptAnalyzerServiceAsync by lazy {
        PromptAnalyzerServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val interactions: InteractionServiceAsync by lazy {
        InteractionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val sensors: SensorServiceAsync by lazy {
        SensorServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scans: ScanServiceAsync by lazy { ScanServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): HiddenLayerClient = sync

    override fun withRawResponse(): HiddenLayerClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HiddenLayerClientAsync =
        HiddenLayerClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun models(): ModelServiceAsync = models

    override fun promptAnalyzer(): PromptAnalyzerServiceAsync = promptAnalyzer

    override fun interactions(): InteractionServiceAsync = interactions

    override fun sensors(): SensorServiceAsync = sensors

    override fun scans(): ScanServiceAsync = scans

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HiddenLayerClientAsync.WithRawResponse {

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val promptAnalyzer: PromptAnalyzerServiceAsync.WithRawResponse by lazy {
            PromptAnalyzerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val interactions: InteractionServiceAsync.WithRawResponse by lazy {
            InteractionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensors: SensorServiceAsync.WithRawResponse by lazy {
            SensorServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun promptAnalyzer(): PromptAnalyzerServiceAsync.WithRawResponse = promptAnalyzer

        override fun interactions(): InteractionServiceAsync.WithRawResponse = interactions

        override fun sensors(): SensorServiceAsync.WithRawResponse = sensors

        override fun scans(): ScanServiceAsync.WithRawResponse = scans
    }
}
