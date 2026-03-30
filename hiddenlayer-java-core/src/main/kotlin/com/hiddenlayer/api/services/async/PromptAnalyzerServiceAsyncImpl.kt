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
import com.hiddenlayer.api.models.promptanalyzer.PromptAnalyzerCreateParams
import com.hiddenlayer.api.models.promptanalyzer.PromptAnalyzerCreateResponse
import java.util.concurrent.CompletableFuture
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

    override fun create(
        params: PromptAnalyzerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PromptAnalyzerCreateResponse> =
        // post /api/v1/submit/prompt-analyzer
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptAnalyzerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptAnalyzerServiceAsync.WithRawResponse =
            PromptAnalyzerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PromptAnalyzerCreateResponse> =
            jsonHandler<PromptAnalyzerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PromptAnalyzerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PromptAnalyzerCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "submit", "prompt-analyzer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
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
