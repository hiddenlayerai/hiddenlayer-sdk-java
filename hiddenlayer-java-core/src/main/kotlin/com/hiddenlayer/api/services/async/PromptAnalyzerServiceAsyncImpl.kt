// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import java.util.function.Consumer

class PromptAnalyzerServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PromptAnalyzerServiceAsync {

    private val withRawResponse: PromptAnalyzerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptAnalyzerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): PromptAnalyzerServiceAsync =
        PromptAnalyzerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptAnalyzerServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptAnalyzerServiceAsync.WithRawResponse =
            PromptAnalyzerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
