// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.promptanalyzer.PromptAnalyzerCreateParams
import com.hiddenlayer_sdk.api.models.promptanalyzer.PromptAnalyzerCreateResponse
import java.util.function.Consumer

interface PromptAnalyzerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptAnalyzerService

    /** Analyze LLM Prompt and Response */
    fun create(params: PromptAnalyzerCreateParams): PromptAnalyzerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PromptAnalyzerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptAnalyzerCreateResponse

    /**
     * A view of [PromptAnalyzerService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptAnalyzerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/submit/prompt-analyzer`, but is otherwise
         * the same as [PromptAnalyzerService.create].
         */
        @MustBeClosed
        fun create(
            params: PromptAnalyzerCreateParams
        ): HttpResponseFor<PromptAnalyzerCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PromptAnalyzerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptAnalyzerCreateResponse>
    }
}
