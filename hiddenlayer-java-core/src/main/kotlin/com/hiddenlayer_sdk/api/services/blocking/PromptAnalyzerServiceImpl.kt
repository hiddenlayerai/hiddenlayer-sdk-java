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
import com.hiddenlayer_sdk.api.models.promptanalyzer.PromptAnalyzerCreateParams
import com.hiddenlayer_sdk.api.models.promptanalyzer.PromptAnalyzerCreateResponse
import java.util.function.Consumer

class PromptAnalyzerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PromptAnalyzerService {

    private val withRawResponse: PromptAnalyzerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PromptAnalyzerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptAnalyzerService =
        PromptAnalyzerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PromptAnalyzerCreateParams,
        requestOptions: RequestOptions,
    ): PromptAnalyzerCreateResponse =
        // post /api/v1/submit/prompt-analyzer
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PromptAnalyzerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptAnalyzerService.WithRawResponse =
            PromptAnalyzerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PromptAnalyzerCreateResponse> =
            jsonHandler<PromptAnalyzerCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PromptAnalyzerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PromptAnalyzerCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "submit", "prompt-analyzer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
