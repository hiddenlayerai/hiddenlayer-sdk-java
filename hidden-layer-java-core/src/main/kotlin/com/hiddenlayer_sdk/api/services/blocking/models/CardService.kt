// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.models

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.models.cards.CardListParams
import com.hiddenlayer_sdk.api.models.models.cards.CardListResponse
import java.util.function.Consumer

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService

    /** List Model Cards */
    fun list(): CardListResponse = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CardListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /models/v3/cards`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CardListResponse> = list(CardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none()
        ): HttpResponseFor<CardListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)
    }
}
