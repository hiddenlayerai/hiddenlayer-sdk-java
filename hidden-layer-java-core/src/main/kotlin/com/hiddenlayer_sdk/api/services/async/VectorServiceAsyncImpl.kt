// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

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
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsParams
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class VectorServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VectorServiceAsync {

    private val withRawResponse: VectorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VectorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VectorServiceAsync =
        VectorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun submitVectors(
        params: VectorSubmitVectorsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VectorSubmitVectorsResponse> =
        // post /api/v2/submit
        withRawResponse().submitVectors(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VectorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VectorServiceAsync.WithRawResponse =
            VectorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val submitVectorsHandler: Handler<VectorSubmitVectorsResponse> =
            jsonHandler<VectorSubmitVectorsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun submitVectors(
            params: VectorSubmitVectorsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VectorSubmitVectorsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "submit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
