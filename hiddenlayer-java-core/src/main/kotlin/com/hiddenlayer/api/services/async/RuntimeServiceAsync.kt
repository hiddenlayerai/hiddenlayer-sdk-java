// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.lib.BetaApi
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateInteractionParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateInteractionResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestResponse
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RuntimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RuntimeServiceAsync

    /**
     * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
     * Breaking changes may occur.
     *
     * Performs synchronous security evaluation on an LLM **interaction**. The interaction can be a
     * standalone user prompt, a standalone model response, a partial exchange, or a long multi-turn
     * message history. The endpoint imposes no requirement that the messages form a complete
     * request/response pair.
     *
     * The request carries `metadata` and an `interaction` payload. The `interaction` field accepts
     * either:
     * - the **canonical**, provider-agnostic form (`CanonicalInteraction`) — an ordered sequence of
     *   messages (user, assistant, system, tool) with their role and content parts, and optionally
     *   the tool catalog that was in scope; or
     * - a **native LLM-provider payload** passed through verbatim. Supported provider formats:
     *     - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
     *     - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
     *     - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
     *
     * Returns the evaluation context (`evaluated_interaction`): the canonicalized messages with
     * per-message signals and findings attached. Also returns the policy outcome, which carries the
     * enforcement action, threat level, any detections, and the effective payload the caller should
     * forward (`outcome.effective_interaction`).
     *
     * Use this endpoint when you need full evaluation results. For inline pass-through (provider
     * request/response payloads returned in the same provider format), use the request-evaluations
     * and response-evaluations endpoints instead.
     */
    fun evaluateInteraction(
        params: RuntimeEvaluateInteractionParams
    ): CompletableFuture<RuntimeEvaluateInteractionResponse> =
        evaluateInteraction(params, RequestOptions.none())

    /** @see evaluateInteraction */
    fun evaluateInteraction(
        params: RuntimeEvaluateInteractionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateInteractionResponse>

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
    fun evaluateRequest(
        params: RuntimeEvaluateRequestParams
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
        evaluateRequest(params, RequestOptions.none())

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(
        params: RuntimeEvaluateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateRequestResponse>

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(
        body: RuntimeEvaluateRequestParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
        evaluateRequest(RuntimeEvaluateRequestParams.builder().body(body).build(), requestOptions)

    /** @see evaluateRequest */
    @BetaApi
    fun evaluateRequest(
        body: RuntimeEvaluateRequestParams.Body
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
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
    fun evaluateResponse(
        params: RuntimeEvaluateResponseParams
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        evaluateResponse(params, RequestOptions.none())

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        params: RuntimeEvaluateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateResponseResponse>

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        body: RuntimeEvaluateResponseParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        evaluateResponse(RuntimeEvaluateResponseParams.builder().body(body).build(), requestOptions)

    /** @see evaluateResponse */
    @BetaApi
    fun evaluateResponse(
        body: RuntimeEvaluateResponseParams.Body
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        evaluateResponse(body, RequestOptions.none())

    /**
     * A view of [RuntimeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RuntimeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /detection/v2/interaction-evaluations`, but is
         * otherwise the same as [RuntimeServiceAsync.evaluateInteraction].
         */
        fun evaluateInteraction(
            params: RuntimeEvaluateInteractionParams
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateInteractionResponse>> =
            evaluateInteraction(params, RequestOptions.none())

        /** @see evaluateInteraction */
        fun evaluateInteraction(
            params: RuntimeEvaluateInteractionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateInteractionResponse>>

        /**
         * Returns a raw HTTP response for `post /detection/v2/request-evaluations`, but is
         * otherwise the same as [RuntimeServiceAsync.evaluateRequest].
         */
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> =
            evaluateRequest(params, RequestOptions.none())

        /** @see evaluateRequest */
        @BetaApi
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>>

        /** @see evaluateRequest */
        @BetaApi
        fun evaluateRequest(
            body: RuntimeEvaluateRequestParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> =
            evaluateRequest(
                RuntimeEvaluateRequestParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateRequest */
        @BetaApi
        fun evaluateRequest(
            body: RuntimeEvaluateRequestParams.Body
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> =
            evaluateRequest(body, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /detection/v2/response-evaluations`, but is
         * otherwise the same as [RuntimeServiceAsync.evaluateResponse].
         */
        fun evaluateResponse(
            params: RuntimeEvaluateResponseParams
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> =
            evaluateResponse(params, RequestOptions.none())

        /** @see evaluateResponse */
        @BetaApi
        fun evaluateResponse(
            params: RuntimeEvaluateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>>

        /** @see evaluateResponse */
        @BetaApi
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> =
            evaluateResponse(
                RuntimeEvaluateResponseParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateResponse */
        @BetaApi
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> =
            evaluateResponse(body, RequestOptions.none())
    }
}
