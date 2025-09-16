// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeResponse
import java.util.function.Consumer

interface InteractionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InteractionService

    /** Performs a detailed security analysis of the input and/or output of LLM interactions. */
    fun analyze(params: InteractionAnalyzeParams): InteractionAnalyzeResponse =
        analyze(params, RequestOptions.none())

    /** @see analyze */
    fun analyze(
        params: InteractionAnalyzeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InteractionAnalyzeResponse

    /**
     * A view of [InteractionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InteractionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /detection/v1/interactions`, but is otherwise the
         * same as [InteractionService.analyze].
         */
        @MustBeClosed
        fun analyze(params: InteractionAnalyzeParams): HttpResponseFor<InteractionAnalyzeResponse> =
            analyze(params, RequestOptions.none())

        /** @see analyze */
        @MustBeClosed
        fun analyze(
            params: InteractionAnalyzeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InteractionAnalyzeResponse>
    }
}
