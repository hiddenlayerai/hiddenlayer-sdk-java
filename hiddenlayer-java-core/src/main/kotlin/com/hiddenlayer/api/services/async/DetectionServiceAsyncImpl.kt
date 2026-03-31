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
import com.hiddenlayer.api.lib.BetaWarning
import com.hiddenlayer.api.models.detection.DetectionRequestEvaluationParams
import com.hiddenlayer.api.models.detection.DetectionRequestEvaluationResponse
import com.hiddenlayer.api.models.detection.DetectionResponseEvaluationParams
import com.hiddenlayer.api.models.detection.DetectionResponseEvaluationResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class DetectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DetectionServiceAsync {

    private val withRawResponse: DetectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DetectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetectionServiceAsync =
        DetectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun requestEvaluation(
        params: DetectionRequestEvaluationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DetectionRequestEvaluationResponse> {
        BetaWarning.warnBeta("DetectionService.requestEvaluation")
        // post /detection/v2/request-evaluations
        return withRawResponse().requestEvaluation(params, requestOptions).thenApply { it.parse() }
    }

    override fun responseEvaluation(
        params: DetectionResponseEvaluationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DetectionResponseEvaluationResponse> {
        BetaWarning.warnBeta("DetectionService.responseEvaluation")
        // post /detection/v2/response-evaluations
        return withRawResponse().responseEvaluation(params, requestOptions).thenApply { it.parse() }
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DetectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetectionServiceAsync.WithRawResponse =
            DetectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val requestEvaluationHandler: Handler<DetectionRequestEvaluationResponse> =
            jsonHandler<DetectionRequestEvaluationResponse>(clientOptions.jsonMapper)

        override fun requestEvaluation(
            params: DetectionRequestEvaluationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetectionRequestEvaluationResponse>> {
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
                            .use { requestEvaluationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val responseEvaluationHandler: Handler<DetectionResponseEvaluationResponse> =
            jsonHandler<DetectionResponseEvaluationResponse>(clientOptions.jsonMapper)

        override fun responseEvaluation(
            params: DetectionResponseEvaluationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetectionResponseEvaluationResponse>> {
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
                            .use { responseEvaluationHandler.handle(it) }
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
