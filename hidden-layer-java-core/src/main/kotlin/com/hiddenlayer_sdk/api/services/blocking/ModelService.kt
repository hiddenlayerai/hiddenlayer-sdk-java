// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.models.ModelDeleteParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveResponse
import com.hiddenlayer_sdk.api.services.blocking.models.CardService

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cards(): CardService

    /** Get Model */
    fun retrieve(params: ModelRetrieveParams): ModelRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveResponse

    /** Delete Adhoc Model */
    fun delete(params: ModelDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: ModelDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cards(): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ModelRetrieveParams): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelService.delete].
         */
        @MustBeClosed
        fun delete(params: ModelDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
