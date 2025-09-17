// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans.upload

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer.api.models.scans.upload.file.FileAddResponse
import com.hiddenlayer.api.models.scans.upload.file.FileCompleteParams
import com.hiddenlayer.api.models.scans.upload.file.FileCompleteResponse
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

    /** Upload a model file */
    fun add(scanId: String, params: FileAddParams): CompletableFuture<FileAddResponse> =
        add(scanId, params, RequestOptions.none())

    /** @see add */
    fun add(
        scanId: String,
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAddResponse> =
        add(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see add */
    fun add(params: FileAddParams): CompletableFuture<FileAddResponse> =
        add(params, RequestOptions.none())

    /** @see add */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAddResponse>

    /** Complete a file upload */
    fun complete(
        fileId: String,
        params: FileCompleteParams,
    ): CompletableFuture<FileCompleteResponse> = complete(fileId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        fileId: String,
        params: FileCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCompleteResponse> =
        complete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see complete */
    fun complete(params: FileCompleteParams): CompletableFuture<FileCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: FileCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCompleteResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload/{scan_id}/file`, but is otherwise
         * the same as [FileServiceAsync.add].
         */
        fun add(
            scanId: String,
            params: FileAddParams,
        ): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(scanId, params, RequestOptions.none())

        /** @see add */
        fun add(
            scanId: String,
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see add */
        fun add(params: FileAddParams): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(params, RequestOptions.none())

        /** @see add */
        fun add(
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAddResponse>>

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}/file/{file_id}`, but is
         * otherwise the same as [FileServiceAsync.complete].
         */
        fun complete(
            fileId: String,
            params: FileCompleteParams,
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>> =
            complete(fileId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            fileId: String,
            params: FileCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>> =
            complete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see complete */
        fun complete(
            params: FileCompleteParams
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: FileCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>>
    }
}
