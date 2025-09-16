// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InteractionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InteractionServiceAsync

    /** Performs a detailed security analysis of the input and/or output of LLM interactions. */
    fun analyze(params: InteractionAnalyzeParams): CompletableFuture<InteractionAnalyzeResponse> =
        analyze(params, RequestOptions.none())

    /** @see analyze */
    fun analyze(
        params: InteractionAnalyzeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InteractionAnalyzeResponse>

    /**
     * A view of [InteractionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InteractionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /detection/v1/interactions`, but is otherwise the
         * same as [InteractionServiceAsync.analyze].
         */
        fun analyze(
            params: InteractionAnalyzeParams
        ): CompletableFuture<HttpResponseFor<InteractionAnalyzeResponse>> =
            analyze(params, RequestOptions.none())

        /** @see analyze */
        fun analyze(
            params: InteractionAnalyzeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InteractionAnalyzeResponse>>
    }
}
