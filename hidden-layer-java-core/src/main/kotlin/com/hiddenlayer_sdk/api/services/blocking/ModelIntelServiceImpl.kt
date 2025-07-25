// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.services.blocking.modelintel.FileService
import com.hiddenlayer_sdk.api.services.blocking.modelintel.FileServiceImpl
import java.util.function.Consumer

class ModelIntelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelIntelService {

    private val withRawResponse: ModelIntelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): ModelIntelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelIntelService =
        ModelIntelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun files(): FileService = files

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelIntelService.WithRawResponse {

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelIntelService.WithRawResponse =
            ModelIntelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun files(): FileService.WithRawResponse = files
    }
}
