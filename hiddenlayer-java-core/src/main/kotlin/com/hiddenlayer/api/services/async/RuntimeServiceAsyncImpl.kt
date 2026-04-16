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
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class RuntimeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RuntimeServiceAsync {

    private val withRawResponse: RuntimeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuntimeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuntimeServiceAsync =
        RuntimeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun evaluateRequest(
        params: RuntimeEvaluateRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
        // post /detection/v2/request-evaluations
        withRawResponse().evaluateRequest(params, requestOptions).thenApply { it.parse() }

    override fun evaluateResponse(
        params: RuntimeEvaluateResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        // post /detection/v2/response-evaluations
        withRawResponse().evaluateResponse(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuntimeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuntimeServiceAsync.WithRawResponse =
            RuntimeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val evaluateRequestHandler: Handler<RuntimeEvaluateRequestResponse> =
            jsonHandler<RuntimeEvaluateRequestResponse>(clientOptions.jsonMapper)

        override fun evaluateRequest(
            params: RuntimeEvaluateRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v2", "request-evaluations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { evaluateRequestHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val evaluateResponseHandler: Handler<RuntimeEvaluateResponseResponse> =
            jsonHandler<RuntimeEvaluateResponseResponse>(clientOptions.jsonMapper)

        override fun evaluateResponse(
            params: RuntimeEvaluateResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v2", "response-evaluations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { evaluateResponseHandler.handle(it) }
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
