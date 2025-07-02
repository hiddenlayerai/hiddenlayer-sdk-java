// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsParams
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VectorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VectorServiceAsync

    /** Submit vectors */
    fun submitVectors(
        params: VectorSubmitVectorsParams
    ): CompletableFuture<VectorSubmitVectorsResponse> = submitVectors(params, RequestOptions.none())

    /** @see [submitVectors] */
    fun submitVectors(
        params: VectorSubmitVectorsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VectorSubmitVectorsResponse>

    /**
     * A view of [VectorServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VectorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/submit`, but is otherwise the same as
         * [VectorServiceAsync.submitVectors].
         */
        fun submitVectors(
            params: VectorSubmitVectorsParams
        ): CompletableFuture<HttpResponseFor<VectorSubmitVectorsResponse>> =
            submitVectors(params, RequestOptions.none())

        /** @see [submitVectors] */
        fun submitVectors(
            params: VectorSubmitVectorsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VectorSubmitVectorsResponse>>
    }
}
