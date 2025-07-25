// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.models.ModelCreateParams
import com.hiddenlayer_sdk.api.models.models.ModelCreateResponse
import com.hiddenlayer_sdk.api.models.models.ModelDeleteParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveResponse
import com.hiddenlayer_sdk.api.services.async.models.CardServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ModelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModelServiceAsync

    fun cards(): CardServiceAsync

    /** Upsert Models */
    fun create(params: ModelCreateParams): CompletableFuture<ModelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ModelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelCreateResponse>

    /** Get Model */
    fun retrieve(modelId: String): CompletableFuture<ModelRetrieveResponse> =
        retrieve(modelId, ModelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        params: ModelRetrieveParams = ModelRetrieveParams.none(),
    ): CompletableFuture<ModelRetrieveResponse> = retrieve(modelId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ModelRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ModelRetrieveParams): CompletableFuture<ModelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        modelId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModelRetrieveResponse> =
        retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

    /** Delete Adhoc Model */
    fun delete(modelId: String): CompletableFuture<Void?> =
        delete(modelId, ModelDeleteParams.none())

    /** @see delete */
    fun delete(
        modelId: String,
        params: ModelDeleteParams = ModelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().modelId(modelId).build(), requestOptions)

    /** @see delete */
    fun delete(
        modelId: String,
        params: ModelDeleteParams = ModelDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(modelId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ModelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ModelDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(modelId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(modelId, ModelDeleteParams.none(), requestOptions)

    /** A view of [ModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModelServiceAsync.WithRawResponse

        fun cards(): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /api/v2/models`, but is otherwise the same as
         * [ModelServiceAsync.create].
         */
        fun create(
            params: ModelCreateParams
        ): CompletableFuture<HttpResponseFor<ModelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ModelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelServiceAsync.retrieve].
         */
        fun retrieve(modelId: String): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, ModelRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            params: ModelRetrieveParams = ModelRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ModelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ModelRetrieveParams
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            modelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModelRetrieveResponse>> =
            retrieve(modelId, ModelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/models/{model_id}`, but is otherwise the
         * same as [ModelServiceAsync.delete].
         */
        fun delete(modelId: String): CompletableFuture<HttpResponse> =
            delete(modelId, ModelDeleteParams.none())

        /** @see delete */
        fun delete(
            modelId: String,
            params: ModelDeleteParams = ModelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().modelId(modelId).build(), requestOptions)

        /** @see delete */
        fun delete(
            modelId: String,
            params: ModelDeleteParams = ModelDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(modelId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ModelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ModelDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            modelId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(modelId, ModelDeleteParams.none(), requestOptions)
    }
}
