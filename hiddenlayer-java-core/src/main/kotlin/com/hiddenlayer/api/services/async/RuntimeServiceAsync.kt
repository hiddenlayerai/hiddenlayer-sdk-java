// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
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
    fun evaluateRequest(
        params: RuntimeEvaluateRequestParams
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
        evaluateRequest(params, RequestOptions.none())

    /** @see evaluateRequest */
    fun evaluateRequest(
        params: RuntimeEvaluateRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateRequestResponse>

    /** @see evaluateRequest */
    fun evaluateRequest(
        body: RuntimeEvaluateRequestParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateRequestResponse> =
        evaluateRequest(RuntimeEvaluateRequestParams.builder().body(body).build(), requestOptions)

    /** @see evaluateRequest */
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
    fun evaluateResponse(
        params: RuntimeEvaluateResponseParams
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        evaluateResponse(params, RequestOptions.none())

    /** @see evaluateResponse */
    fun evaluateResponse(
        params: RuntimeEvaluateResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateResponseResponse>

    /** @see evaluateResponse */
    fun evaluateResponse(
        body: RuntimeEvaluateResponseParams.Body,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RuntimeEvaluateResponseResponse> =
        evaluateResponse(RuntimeEvaluateResponseParams.builder().body(body).build(), requestOptions)

    /** @see evaluateResponse */
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
         * Returns a raw HTTP response for `post /detection/v2/request-evaluations`, but is
         * otherwise the same as [RuntimeServiceAsync.evaluateRequest].
         */
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> =
            evaluateRequest(params, RequestOptions.none())

        /** @see evaluateRequest */
        fun evaluateRequest(
            params: RuntimeEvaluateRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>>

        /** @see evaluateRequest */
        fun evaluateRequest(
            body: RuntimeEvaluateRequestParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateRequestResponse>> =
            evaluateRequest(
                RuntimeEvaluateRequestParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateRequest */
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
        fun evaluateResponse(
            params: RuntimeEvaluateResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>>

        /** @see evaluateResponse */
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> =
            evaluateResponse(
                RuntimeEvaluateResponseParams.builder().body(body).build(),
                requestOptions,
            )

        /** @see evaluateResponse */
        fun evaluateResponse(
            body: RuntimeEvaluateResponseParams.Body
        ): CompletableFuture<HttpResponseFor<RuntimeEvaluateResponseResponse>> =
            evaluateResponse(body, RequestOptions.none())
    }
}
