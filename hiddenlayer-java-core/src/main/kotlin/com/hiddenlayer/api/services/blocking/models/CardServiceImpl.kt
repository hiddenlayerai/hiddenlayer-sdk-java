// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.models

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
import com.hiddenlayer.api.core.prepare
import com.hiddenlayer.api.models.models.cards.CardListPage
import com.hiddenlayer.api.models.models.cards.CardListPageResponse
import com.hiddenlayer.api.models.models.cards.CardListParams
import java.util.function.Consumer

class CardServiceImpl internal constructor(private val clientOptions: ClientOptions) : CardService {

    private val withRawResponse: CardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService =
        CardServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: CardListParams, requestOptions: RequestOptions): CardListPage =
        // get /models/v4/cards
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardService.WithRawResponse =
            CardServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("models", "v4", "cards")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CardListPage.builder()
                            .service(CardServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
