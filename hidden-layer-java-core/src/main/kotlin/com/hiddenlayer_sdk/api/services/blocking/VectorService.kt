// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsParams
import com.hiddenlayer_sdk.api.models.vectors.VectorSubmitVectorsResponse

interface VectorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Submit vectors */
    fun submitVectors(params: VectorSubmitVectorsParams): VectorSubmitVectorsResponse =
        submitVectors(params, RequestOptions.none())

    /** @see [submitVectors] */
    fun submitVectors(
        params: VectorSubmitVectorsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorSubmitVectorsResponse

    /** A view of [VectorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/v2/submit`, but is otherwise the same as
         * [VectorService.submitVectors].
         */
        @MustBeClosed
        fun submitVectors(
            params: VectorSubmitVectorsParams
        ): HttpResponseFor<VectorSubmitVectorsResponse> =
            submitVectors(params, RequestOptions.none())

        /** @see [submitVectors] */
        @MustBeClosed
        fun submitVectors(
            params: VectorSubmitVectorsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorSubmitVectorsResponse>
    }
}
