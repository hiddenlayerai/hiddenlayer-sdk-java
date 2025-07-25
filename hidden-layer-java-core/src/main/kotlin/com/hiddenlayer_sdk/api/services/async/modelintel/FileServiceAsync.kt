// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.modelintel

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.modelintel.files.FileGetMetadataParams
import com.hiddenlayer_sdk.api.models.modelintel.files.FileGetMetadataResponse
import com.hiddenlayer_sdk.api.models.modelintel.files.FileRetrieveParams
import com.hiddenlayer_sdk.api.models.modelintel.files.FileRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /**
     * Retrieve detailed file information including all associated instances, repositories, and
     * metadata
     */
    fun retrieve(sha256: String): CompletableFuture<FileRetrieveResponse> =
        retrieve(sha256, FileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sha256: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRetrieveResponse> =
        retrieve(params.toBuilder().sha256(sha256).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sha256: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
    ): CompletableFuture<FileRetrieveResponse> = retrieve(sha256, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): CompletableFuture<FileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sha256: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileRetrieveResponse> =
        retrieve(sha256, FileRetrieveParams.none(), requestOptions)

    /** Retrieve file information such as filetype, file size in bytes, and MIME type */
    fun getMetadata(sha256: String): CompletableFuture<FileGetMetadataResponse> =
        getMetadata(sha256, FileGetMetadataParams.none())

    /** @see getMetadata */
    fun getMetadata(
        sha256: String,
        params: FileGetMetadataParams = FileGetMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetMetadataResponse> =
        getMetadata(params.toBuilder().sha256(sha256).build(), requestOptions)

    /** @see getMetadata */
    fun getMetadata(
        sha256: String,
        params: FileGetMetadataParams = FileGetMetadataParams.none(),
    ): CompletableFuture<FileGetMetadataResponse> =
        getMetadata(sha256, params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        params: FileGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileGetMetadataResponse>

    /** @see getMetadata */
    fun getMetadata(params: FileGetMetadataParams): CompletableFuture<FileGetMetadataResponse> =
        getMetadata(params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        sha256: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileGetMetadataResponse> =
        getMetadata(sha256, FileGetMetadataParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /model-intel/v1/file/{sha256}`, but is otherwise the
         * same as [FileServiceAsync.retrieve].
         */
        fun retrieve(sha256: String): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(sha256, FileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sha256: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(params.toBuilder().sha256(sha256).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sha256: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(sha256, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sha256: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileRetrieveResponse>> =
            retrieve(sha256, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /model-intel/v1/file/{sha256}/metadata`, but is
         * otherwise the same as [FileServiceAsync.getMetadata].
         */
        fun getMetadata(
            sha256: String
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>> =
            getMetadata(sha256, FileGetMetadataParams.none())

        /** @see getMetadata */
        fun getMetadata(
            sha256: String,
            params: FileGetMetadataParams = FileGetMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>> =
            getMetadata(params.toBuilder().sha256(sha256).build(), requestOptions)

        /** @see getMetadata */
        fun getMetadata(
            sha256: String,
            params: FileGetMetadataParams = FileGetMetadataParams.none(),
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>> =
            getMetadata(sha256, params, RequestOptions.none())

        /** @see getMetadata */
        fun getMetadata(
            params: FileGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>>

        /** @see getMetadata */
        fun getMetadata(
            params: FileGetMetadataParams
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>> =
            getMetadata(params, RequestOptions.none())

        /** @see getMetadata */
        fun getMetadata(
            sha256: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileGetMetadataResponse>> =
            getMetadata(sha256, FileGetMetadataParams.none(), requestOptions)
    }
}
