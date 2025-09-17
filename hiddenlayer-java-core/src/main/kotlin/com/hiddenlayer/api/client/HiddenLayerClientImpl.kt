// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.client

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.getPackageVersion
import com.hiddenlayer.api.services.blocking.InteractionService
import com.hiddenlayer.api.services.blocking.InteractionServiceImpl
import com.hiddenlayer.api.services.blocking.ModelService
import com.hiddenlayer.api.services.blocking.ModelServiceImpl
import com.hiddenlayer.api.services.blocking.PromptAnalyzerService
import com.hiddenlayer.api.services.blocking.PromptAnalyzerServiceImpl
import com.hiddenlayer.api.services.blocking.ScanService
import com.hiddenlayer.api.services.blocking.ScanServiceImpl
import com.hiddenlayer.api.services.blocking.SensorService
import com.hiddenlayer.api.services.blocking.SensorServiceImpl
import java.util.function.Consumer

class HiddenLayerClientImpl(private val clientOptions: ClientOptions) : HiddenLayerClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: HiddenLayerClientAsync by lazy { HiddenLayerClientAsyncImpl(clientOptions) }

    private val withRawResponse: HiddenLayerClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val promptAnalyzer: PromptAnalyzerService by lazy {
        PromptAnalyzerServiceImpl(clientOptionsWithUserAgent)
    }

    private val interactions: InteractionService by lazy {
        InteractionServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensors: SensorService by lazy { SensorServiceImpl(clientOptionsWithUserAgent) }

    private val scans: ScanService by lazy { ScanServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): HiddenLayerClientAsync = async

    override fun withRawResponse(): HiddenLayerClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HiddenLayerClient =
        HiddenLayerClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun models(): ModelService = models

    override fun promptAnalyzer(): PromptAnalyzerService = promptAnalyzer

    override fun interactions(): InteractionService = interactions

    override fun sensors(): SensorService = sensors

    override fun scans(): ScanService = scans

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HiddenLayerClient.WithRawResponse {

        private val models: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val promptAnalyzer: PromptAnalyzerService.WithRawResponse by lazy {
            PromptAnalyzerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val interactions: InteractionService.WithRawResponse by lazy {
            InteractionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensors: SensorService.WithRawResponse by lazy {
            SensorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scans: ScanService.WithRawResponse by lazy {
            ScanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HiddenLayerClient.WithRawResponse =
            HiddenLayerClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun models(): ModelService.WithRawResponse = models

        override fun promptAnalyzer(): PromptAnalyzerService.WithRawResponse = promptAnalyzer

        override fun interactions(): InteractionService.WithRawResponse = interactions

        override fun sensors(): SensorService.WithRawResponse = sensors

        override fun scans(): ScanService.WithRawResponse = scans
    }
}
