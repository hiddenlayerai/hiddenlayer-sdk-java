// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.handlers.emptyHandler
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
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.models.ModelDeleteParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveResponse
import com.hiddenlayer_sdk.api.services.async.models.CardServiceAsync
import com.hiddenlayer_sdk.api.services.async.models.CardServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ModelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModelServiceAsync {

    private val withRawResponse: ModelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ModelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelServiceAsync =
        ModelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cards(): CardServiceAsync = cards

    override fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelRetrieveResponse> =
        // get /api/v2/models/{model_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v2/models/{model_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val cards: CardServiceAsync.WithRawResponse by lazy {
            CardServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelServiceAsync.WithRawResponse =
            ModelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun cards(): CardServiceAsync.WithRawResponse = cards

        private val retrieveHandler: Handler<ModelRetrieveResponse> =
            jsonHandler<ModelRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("modelId", params.modelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "models", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("modelId", params.modelId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "models", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
