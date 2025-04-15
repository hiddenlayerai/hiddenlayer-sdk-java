// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.models.ModelDeleteParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveResponse
import com.hiddenlayer_sdk.api.services.async.models.CardServiceAsync
import java.util.concurrent.CompletableFuture

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun cards(): CardServiceAsync

    /** Get Model */
    fun retrieve(params: ModelRetrieveParams): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse>

    /** Delete Adhoc Model */
    fun delete(params: ModelDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun cards(): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: ModelDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
