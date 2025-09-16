// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.handlers.errorBodyHandler
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepare
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllResponse
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartResponse
import com.hiddenlayer_sdk.api.services.blocking.scans.upload.FileService
import com.hiddenlayer_sdk.api.services.blocking.scans.upload.FileServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UploadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UploadService {

    private val withRawResponse: UploadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val file: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): UploadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService =
        UploadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun file(): FileService = file

    override fun completeAll(
        params: UploadCompleteAllParams,
        requestOptions: RequestOptions,
    ): UploadCompleteAllResponse =
        // patch /scan/v3/upload/{scan_id}
        withRawResponse().completeAll(params, requestOptions).parse()

    override fun start(
        params: UploadStartParams,
        requestOptions: RequestOptions,
    ): UploadStartResponse =
        // post /scan/v3/upload
        withRawResponse().start(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UploadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val file: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadService.WithRawResponse =
            UploadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun file(): FileService.WithRawResponse = file

        private val completeAllHandler: Handler<UploadCompleteAllResponse> =
            jsonHandler<UploadCompleteAllResponse>(clientOptions.jsonMapper)

        override fun completeAll(
            params: UploadCompleteAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadCompleteAllResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "upload", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startHandler: Handler<UploadStartResponse> =
            jsonHandler<UploadStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: UploadStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadStartResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "upload")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
