// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.lib.BetaApi
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseResponse
import java.util.function.Consumer

interface RuntimeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuntimeService

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
    @BetaApi
    fun evaluateRequest(params: RuntimeEvaluateRequestParams): RuntimeEvaluateRequestResponse =
        evaluateRequest(params, RequestOptions.none())

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(
        params: RuntimeEvaluateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuntimeEvaluateRequestResponse

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(
        body: RuntimeEvaluateRequestParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuntimeEvaluateRequestResponse =
        evaluateRequest(RuntimeEvaluateRequestParams.builder().body(body).build(), requestOptions)

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(body: RuntimeEvaluateRequestParams.Body): RuntimeEvaluateRequestResponse =
        evaluateRequest(body, RequestOptions.none())

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
    @BetaApi
    fun evaluateResponse(params: RuntimeEvaluateResponseParams): RuntimeEvaluateResponseResponse =
        evaluateResponse(params, RequestOptions.none())

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        params: RuntimeEvaluateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuntimeEvaluateResponseResponse

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        body: RuntimeEvaluateResponseParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RuntimeEvaluateResponseResponse =
        evaluateResponse(RuntimeEvaluateResponseParams.builder().body(body).build(), requestOptions)

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        body: RuntimeEvaluateResponseParams.Body
    ): RuntimeEvaluateResponseResponse = evaluateResponse(body, RequestOptions.none())

    /** A view of [RuntimeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuntimeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /detection/v2/request-evaluations`, but is
         * otherwise the same as [RuntimeService.evaluateRequest].
         */
        @MustBeClosed
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams
        ): HttpResponseFor<RuntimeEvaluateRequestResponse> =
            evaluateRequest(params, RequestOptions.none())

        /** @see evaluateRequest */
        @MustBeClosed
        @BetaApi
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuntimeEvaluateRequestResponse>

        /** @see evaluateRequest */
        @MustBeClosed
        @BetaApi
        fun evaluateRequest(
            body: RuntimeEvaluateRequestParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuntimeEvaluateRequestResponse> =
            evaluateRequest(
                RuntimeEvaluateRequestParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateRequest */
        @MustBeClosed
        @BetaApi
        fun evaluateRequest(
            body: RuntimeEvaluateRequestParams.Body
        ): HttpResponseFor<RuntimeEvaluateRequestResponse> =
            evaluateRequest(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /detection/v2/response-evaluations`, but is
         * otherwise the same as [RuntimeService.evaluateResponse].
         */
        @MustBeClosed
        fun evaluateResponse(
            params: RuntimeEvaluateResponseParams
        ): HttpResponseFor<RuntimeEvaluateResponseResponse> =
            evaluateResponse(params, RequestOptions.none())

        /** @see evaluateResponse */
        @MustBeClosed
        @BetaApi
        fun evaluateResponse(
            params: RuntimeEvaluateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuntimeEvaluateResponseResponse>

        /** @see evaluateResponse */
        @MustBeClosed
        @BetaApi
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RuntimeEvaluateResponseResponse> =
            evaluateResponse(
                RuntimeEvaluateResponseParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateResponse */
        @MustBeClosed
        @BetaApi
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body
        ): HttpResponseFor<RuntimeEvaluateResponseResponse> =
            evaluateResponse(body, RequestOptions.none())
    }
}
