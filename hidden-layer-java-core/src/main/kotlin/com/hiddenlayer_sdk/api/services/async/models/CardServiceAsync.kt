// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.models

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.models.cards.CardListParams
import com.hiddenlayer_sdk.api.models.models.cards.CardListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync

    /** List Model Cards */
    fun list(): CompletableFuture<CardListResponse> = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListResponse>

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CompletableFuture<CardListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListResponse> =
        list(CardListParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /models/v3/cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none())

        /** @see [list] */
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListResponse>>

        /** @see [list] */
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListResponse>> =
            list(CardListParams.none(), requestOptions)
    }
}
