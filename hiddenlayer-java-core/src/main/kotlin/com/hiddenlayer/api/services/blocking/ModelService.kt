// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.models.ModelDeleteParams
import com.hiddenlayer.api.models.models.ModelRetrieveParams
import com.hiddenlayer.api.models.models.ModelRetrieveResponse
import com.hiddenlayer.api.services.blocking.models.CardService
import java.util.function.Consumer

interface ModelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService

    fun cards(): CardService

    /** Get Model */
    fun retrieve(modelId: String): ModelRetrieveResponse =
        retrieve(modelId, ModelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveResponse = retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
    ): ModelRetrieveResponse = retrieve(modelId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModelRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ModelRetrieveParams): ModelRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(modelId: String, requestOptions: RequestOptions): ModelRetrieveResponse =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /** Delete Adhoc Model */
    fun delete(modelId: String) = delete(modelId, ModelDeleteParams.none())

    /** @see delete */
    fun delete(
        modelId: String,
        params: ModelDeleteParams = ModelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see delete */
    fun delete(modelId: String, params: ModelDeleteParams = ModelDeleteParams.none()) =
        delete(modelId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ModelDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ModelDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(modelId: String, requestOptions: RequestOptions) =
        delete(modelId, ModelDeleteParams.none(), requestOptions)

    /** A view of [ModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelService.WithRawResponse

        fun cards(): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(modelId: String): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(modelId, ModelRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
        ): HttpResponseFor<ModelRetrieveResponse> = retrieve(modelId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModelRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ModelRetrieveParams): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelRetrieveResponse> =
            retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelService.delete].
         */
        @MustBeClosed
        fun delete(modelId: String): HttpResponse = delete(modelId, ModelDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            modelId: String,
            params: ModelDeleteParams = ModelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            modelId: String,
            params: ModelDeleteParams = ModelDeleteParams.none(),
        ): HttpResponse = delete(modelId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ModelDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(modelId: String, requestOptions: RequestOptions): HttpResponse =
            delete(modelId, ModelDeleteParams.none(), requestOptions)
    }
}
