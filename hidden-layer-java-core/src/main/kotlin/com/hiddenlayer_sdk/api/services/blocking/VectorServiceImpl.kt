// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.RequestOptions
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
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsParams
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsResponse

class VectorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VectorService {

    private val withRawResponse: VectorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VectorService.WithRawResponse = withRawResponse

    override fun submitVectors(
        params: VectorSubmitVectorsParams,
        requestOptions: RequestOptions,
    ): VectorSubmitVectorsResponse =
        // post /api/v2/submit
        withRawResponse().submitVectors(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VectorService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val submitVectorsHandler: Handler<VectorSubmitVectorsResponse> =
            jsonHandler<VectorSubmitVectorsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun submitVectors(
            params: VectorSubmitVectorsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorSubmitVectorsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "v2", "submit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { submitVectorsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
