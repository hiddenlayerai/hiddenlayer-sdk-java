// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.handlers.errorBodyHandler
import com.hiddenlayer.api.core.handlers.errorHandler
import com.hiddenlayer.api.core.handlers.jsonHandler
import com.hiddenlayer.api.core.http.HttpMethod
import com.hiddenlayer.api.core.http.HttpRequest
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponse.Handler
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.core.http.json
import com.hiddenlayer.api.core.http.parseable
import com.hiddenlayer.api.core.prepareAsync
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class InteractionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InteractionServiceAsync {

    private val withRawResponse: InteractionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InteractionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InteractionServiceAsync =
        InteractionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun analyze(
        params: InteractionAnalyzeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InteractionAnalyzeResponse> =
        // post /detection/v1/interactions
        withRawResponse().analyze(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InteractionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InteractionServiceAsync.WithRawResponse =
            InteractionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val analyzeHandler: Handler<InteractionAnalyzeResponse> =
            jsonHandler<InteractionAnalyzeResponse>(clientOptions.jsonMapper)

        override fun analyze(
            params: InteractionAnalyzeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InteractionAnalyzeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v1", "interactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { analyzeHandler.handle(it) }
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
