// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
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
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeResponse
import java.util.function.Consumer

class InteractionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InteractionService {

    private val withRawResponse: InteractionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InteractionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InteractionService =
        InteractionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun analyze(
        params: InteractionAnalyzeParams,
        requestOptions: RequestOptions,
    ): InteractionAnalyzeResponse =
        // post /detection/v1/interactions
        withRawResponse().analyze(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InteractionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InteractionService.WithRawResponse =
            InteractionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val analyzeHandler: Handler<InteractionAnalyzeResponse> =
            jsonHandler<InteractionAnalyzeResponse>(clientOptions.jsonMapper)

        override fun analyze(
            params: InteractionAnalyzeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InteractionAnalyzeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("detection", "v1", "interactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
