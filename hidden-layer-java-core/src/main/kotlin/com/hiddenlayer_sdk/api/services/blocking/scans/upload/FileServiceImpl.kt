// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans.upload

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.handlers.withErrorHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepare
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddResponse
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun add(params: FileAddParams, requestOptions: RequestOptions): FileAddResponse =
        // post /scan/v3/upload/{scan_id}/file
        withRawResponse().add(params, requestOptions).parse()

    override fun complete(
        params: FileCompleteParams,
        requestOptions: RequestOptions,
    ): FileCompleteResponse =
        // patch /scan/v3/upload/{scan_id}/file/{file_id}
        withRawResponse().complete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addHandler: Handler<FileAddResponse> =
            jsonHandler<FileAddResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun add(
            params: FileAddParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileAddResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "upload", params._pathParam(0), "file")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val completeHandler: Handler<FileCompleteResponse> =
            jsonHandler<FileCompleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: FileCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileCompleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileId", params.fileId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "scan",
                        "v3",
                        "upload",
                        params._pathParam(0),
                        "file",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { completeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
