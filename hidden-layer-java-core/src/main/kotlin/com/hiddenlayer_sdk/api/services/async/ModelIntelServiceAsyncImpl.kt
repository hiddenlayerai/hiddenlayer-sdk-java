// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.services.async.modelintel.FileServiceAsync
import com.hiddenlayer_sdk.api.services.async.modelintel.FileServiceAsyncImpl
import java.util.function.Consumer

class ModelIntelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelIntelServiceAsync {

    private val withRawResponse: ModelIntelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ModelIntelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelIntelServiceAsync =
        ModelIntelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileServiceAsync = files

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelIntelServiceAsync.WithRawResponse {

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelIntelServiceAsync.WithRawResponse =
            ModelIntelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files
    }
}
