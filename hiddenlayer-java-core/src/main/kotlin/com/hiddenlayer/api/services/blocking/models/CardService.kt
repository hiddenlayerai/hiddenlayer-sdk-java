// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.models

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.models.cards.CardListPage
import com.hiddenlayer.api.models.models.cards.CardListParams
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

    /**
     * Deprecated in favor of `GET /asset-inventory/v2/assets` (`asset_type[in]=MODEL`), which
     * returns the same model-card data — scan status/timing and findings from the `supply-chain`
     * annotation — alongside the rest of an asset's data, with matching filters (`model_id[eq]`,
     * `scan_started_at[gt/gte/lt/lte]`) and sorts (`model_name`, `scan_started_at`).
     */
    @Deprecated("deprecated") fun list(): CardListPage = list(CardListParams.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPage

    /** @see list */
    @Deprecated("deprecated")
    fun list(params: CardListParams = CardListParams.none()): CardListPage =
        list(params, RequestOptions.none())

    /** @see list */
    @Deprecated("deprecated")
    fun list(requestOptions: RequestOptions): CardListPage =
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
         * Returns a raw HTTP response for `get /models/v4/cards`, but is otherwise the same as
         * [CardService.list].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(): HttpResponseFor<CardListPage> = list(CardListParams.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListPage>

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(params: CardListParams = CardListParams.none()): HttpResponseFor<CardListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @Deprecated("deprecated")
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListPage> =
            list(CardListParams.none(), requestOptions)
    }
}
