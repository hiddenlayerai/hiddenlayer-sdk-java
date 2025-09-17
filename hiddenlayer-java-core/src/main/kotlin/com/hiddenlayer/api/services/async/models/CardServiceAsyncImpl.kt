// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.models

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
import com.hiddenlayer.api.core.http.parseable
import com.hiddenlayer.api.core.prepareAsync
import com.hiddenlayer.api.models.models.cards.CardListPageAsync
import com.hiddenlayer.api.models.models.cards.CardListPageResponse
import com.hiddenlayer.api.models.models.cards.CardListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardListPageAsync> =
        // get /models/v4/cards
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("models", "v4", "cards")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CardListPageAsync.builder()
                                    .service(CardServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
