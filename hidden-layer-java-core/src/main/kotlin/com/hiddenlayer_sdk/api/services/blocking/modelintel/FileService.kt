// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.modelintel

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.modelintel.files.FileGetMetadataParams
import com.hiddenlayer_sdk.api.models.modelintel.files.FileGetMetadataResponse
import com.hiddenlayer_sdk.api.models.modelintel.files.FileRetrieveParams
import com.hiddenlayer_sdk.api.models.modelintel.files.FileRetrieveResponse
import java.util.function.Consumer

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /**
     * Retrieve detailed file information including all associated instances, repositories, and
     * metadata
     */
    fun retrieve(sha256: String): FileRetrieveResponse = retrieve(sha256, FileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sha256: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse = retrieve(params.toBuilder().sha256(sha256).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sha256: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
    ): FileRetrieveResponse = retrieve(sha256, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): FileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(sha256: String, requestOptions: RequestOptions): FileRetrieveResponse =
        retrieve(sha256, FileRetrieveParams.none(), requestOptions)

    /** Retrieve file information such as filetype, file size in bytes, and MIME type */
    fun getMetadata(sha256: String): FileGetMetadataResponse =
        getMetadata(sha256, FileGetMetadataParams.none())

    /** @see getMetadata */
    fun getMetadata(
        sha256: String,
        params: FileGetMetadataParams = FileGetMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetMetadataResponse =
        getMetadata(params.toBuilder().sha256(sha256).build(), requestOptions)

    /** @see getMetadata */
    fun getMetadata(
        sha256: String,
        params: FileGetMetadataParams = FileGetMetadataParams.none(),
    ): FileGetMetadataResponse = getMetadata(sha256, params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(
        params: FileGetMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileGetMetadataResponse

    /** @see getMetadata */
    fun getMetadata(params: FileGetMetadataParams): FileGetMetadataResponse =
        getMetadata(params, RequestOptions.none())

    /** @see getMetadata */
    fun getMetadata(sha256: String, requestOptions: RequestOptions): FileGetMetadataResponse =
        getMetadata(sha256, FileGetMetadataParams.none(), requestOptions)

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /model-intel/v1/file/{sha256}`, but is otherwise the
         * same as [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sha256: String): HttpResponseFor<FileRetrieveResponse> =
            retrieve(sha256, FileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sha256: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse> =
            retrieve(params.toBuilder().sha256(sha256).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sha256: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): HttpResponseFor<FileRetrieveResponse> = retrieve(sha256, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FileRetrieveParams): HttpResponseFor<FileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sha256: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileRetrieveResponse> =
            retrieve(sha256, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /model-intel/v1/file/{sha256}/metadata`, but is
         * otherwise the same as [FileService.getMetadata].
         */
        @MustBeClosed
        fun getMetadata(sha256: String): HttpResponseFor<FileGetMetadataResponse> =
            getMetadata(sha256, FileGetMetadataParams.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            sha256: String,
            params: FileGetMetadataParams = FileGetMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetMetadataResponse> =
            getMetadata(params.toBuilder().sha256(sha256).build(), requestOptions)

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            sha256: String,
            params: FileGetMetadataParams = FileGetMetadataParams.none(),
        ): HttpResponseFor<FileGetMetadataResponse> =
            getMetadata(sha256, params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            params: FileGetMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileGetMetadataResponse>

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(params: FileGetMetadataParams): HttpResponseFor<FileGetMetadataResponse> =
            getMetadata(params, RequestOptions.none())

        /** @see getMetadata */
        @MustBeClosed
        fun getMetadata(
            sha256: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileGetMetadataResponse> =
            getMetadata(sha256, FileGetMetadataParams.none(), requestOptions)
    }
}
