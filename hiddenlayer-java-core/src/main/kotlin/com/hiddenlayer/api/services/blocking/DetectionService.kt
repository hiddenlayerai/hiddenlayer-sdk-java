// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.detection.DetectionRequestEvaluationParams
import com.hiddenlayer.api.models.detection.DetectionRequestEvaluationResponse
import com.hiddenlayer.api.models.detection.DetectionResponseEvaluationParams
import com.hiddenlayer.api.models.detection.DetectionResponseEvaluationResponse
import java.util.function.Consumer

interface DetectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetectionService

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Analyzes an LLM request payload for security threats before it is sent to the model.
     *
     * Accepts any valid provider request payload and returns:
     * - If detect or redact action: the request payload (potentially modified) in the provider's
     *   request format
     * - If block action: a canned block message in the provider's response format
     *
     * Use this endpoint inline in your LLM pipeline to evaluate prompts before they reach the
     * model.
     *
     * Supported provider formats:
     * - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
     * - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
     * - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
     */
    fun requestEvaluation(
        params: DetectionRequestEvaluationParams
    ): DetectionRequestEvaluationResponse = requestEvaluation(params, RequestOptions.none())

    /** @see requestEvaluation */
    fun requestEvaluation(
        params: DetectionRequestEvaluationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetectionRequestEvaluationResponse

    /** @see requestEvaluation */
    fun requestEvaluation(
        body: DetectionRequestEvaluationParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetectionRequestEvaluationResponse =
        requestEvaluation(
            DetectionRequestEvaluationParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see requestEvaluation */
    fun requestEvaluation(
        body: DetectionRequestEvaluationParams.Body
    ): DetectionRequestEvaluationResponse = requestEvaluation(body, RequestOptions.none())

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Analyzes an LLM response payload for security threats after it is received from the model.
     *
     * Accepts any valid provider response payload and returns:
     * - If detect or redact action: the response payload (potentially modified) in the provider's
     *   response format
     * - If block action: a canned block message in the provider's response format
     *
     * Use this endpoint inline in your LLM pipeline to evaluate model outputs before returning them
     * to users.
     *
     * Supported provider formats:
     * - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
     * - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
     * - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
     */
    fun responseEvaluation(
        params: DetectionResponseEvaluationParams
    ): DetectionResponseEvaluationResponse = responseEvaluation(params, RequestOptions.none())

    /** @see responseEvaluation */
    fun responseEvaluation(
        params: DetectionResponseEvaluationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetectionResponseEvaluationResponse

    /** @see responseEvaluation */
    fun responseEvaluation(
        body: DetectionResponseEvaluationParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DetectionResponseEvaluationResponse =
        responseEvaluation(
            DetectionResponseEvaluationParams.builder().body(body).build(),
            requestOptions,
        )

    /** @see responseEvaluation */
    fun responseEvaluation(
        body: DetectionResponseEvaluationParams.Body
    ): DetectionResponseEvaluationResponse = responseEvaluation(body, RequestOptions.none())

    /** A view of [DetectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /detection/v2/request-evaluations`, but is
         * otherwise the same as [DetectionService.requestEvaluation].
         */
        @MustBeClosed
        fun requestEvaluation(
            params: DetectionRequestEvaluationParams
        ): HttpResponseFor<DetectionRequestEvaluationResponse> =
            requestEvaluation(params, RequestOptions.none())

        /** @see requestEvaluation */
        @MustBeClosed
        fun requestEvaluation(
            params: DetectionRequestEvaluationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetectionRequestEvaluationResponse>

        /** @see requestEvaluation */
        @MustBeClosed
        fun requestEvaluation(
            body: DetectionRequestEvaluationParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetectionRequestEvaluationResponse> =
            requestEvaluation(
                DetectionRequestEvaluationParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see requestEvaluation */
        @MustBeClosed
        fun requestEvaluation(
            body: DetectionRequestEvaluationParams.Body
        ): HttpResponseFor<DetectionRequestEvaluationResponse> =
            requestEvaluation(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /detection/v2/response-evaluations`, but is
         * otherwise the same as [DetectionService.responseEvaluation].
         */
        @MustBeClosed
        fun responseEvaluation(
            params: DetectionResponseEvaluationParams
        ): HttpResponseFor<DetectionResponseEvaluationResponse> =
            responseEvaluation(params, RequestOptions.none())

        /** @see responseEvaluation */
        @MustBeClosed
        fun responseEvaluation(
            params: DetectionResponseEvaluationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetectionResponseEvaluationResponse>

        /** @see responseEvaluation */
        @MustBeClosed
        fun responseEvaluation(
            body: DetectionResponseEvaluationParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DetectionResponseEvaluationResponse> =
            responseEvaluation(
                DetectionResponseEvaluationParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see responseEvaluation */
        @MustBeClosed
        fun responseEvaluation(
            body: DetectionResponseEvaluationParams.Body
        ): HttpResponseFor<DetectionResponseEvaluationResponse> =
            responseEvaluation(body, RequestOptions.none())
    }
}
