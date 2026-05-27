// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

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
import com.hiddenlayer.api.core.prepare
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateInteractionParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateInteractionResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseResponse
import java.util.function.Consumer

class RuntimeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RuntimeService {

    private val withRawResponse: RuntimeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RuntimeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuntimeService =
        RuntimeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun evaluateInteraction(
        params: RuntimeEvaluateInteractionParams,
        requestOptions: RequestOptions,
    ): RuntimeEvaluateInteractionResponse =
        // post /detection/v2/interaction-evaluations
        withRawResponse().evaluateInteraction(params, requestOptions).parse()

    override fun evaluateRequest(
        params: RuntimeEvaluateRequestParams,
        requestOptions: RequestOptions,
    ): RuntimeEvaluateRequestResponse =
        // post /detection/v2/request-evaluations
        withRawResponse().evaluateRequest(params, requestOptions).parse()

    override fun evaluateResponse(
        params: RuntimeEvaluateResponseParams,
        requestOptions: RequestOptions,
    ): RuntimeEvaluateResponseResponse =
        // post /detection/v2/response-evaluations
        withRawResponse().evaluateResponse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RuntimeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuntimeService.WithRawResponse =
            RuntimeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val evaluateInteractionHandler: Handler<RuntimeEvaluateInteractionResponse> =
            jsonHandler<RuntimeEvaluateInteractionResponse>(clientOptions.jsonMapper)

        override fun evaluateInteraction(
            params: RuntimeEvaluateInteractionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuntimeEvaluateInteractionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v2", "interaction-evaluations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { evaluateInteractionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val evaluateRequestHandler: Handler<RuntimeEvaluateRequestResponse> =
            jsonHandler<RuntimeEvaluateRequestResponse>(clientOptions.jsonMapper)

        override fun evaluateRequest(
            params: RuntimeEvaluateRequestParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuntimeEvaluateRequestResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v2", "request-evaluations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { evaluateRequestHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val evaluateResponseHandler: Handler<RuntimeEvaluateResponseResponse> =
            jsonHandler<RuntimeEvaluateResponseResponse>(clientOptions.jsonMapper)

        override fun evaluateResponse(
            params: RuntimeEvaluateResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RuntimeEvaluateResponseResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v2", "response-evaluations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
