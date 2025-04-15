// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans.upload

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddResponse
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteResponse
import java.util.concurrent.CompletableFuture

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add file to V3 Upload */
    fun add(params: FileAddParams): CompletableFuture<FileAddResponse> =
        add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileAddResponse>

    /** Indicate that upload is completed for {file_id} */
    fun complete(params: FileCompleteParams): CompletableFuture<FileCompleteResponse> =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: FileCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileCompleteResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload/{scan_id}/file`, but is otherwise
         * the same as [FileServiceAsync.add].
         */
        @MustBeClosed
        fun add(params: FileAddParams): CompletableFuture<HttpResponseFor<FileAddResponse>> =
            add(params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileAddResponse>>

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}/file/{file_id}`, but is
         * otherwise the same as [FileServiceAsync.complete].
         */
        @MustBeClosed
        fun complete(
            params: FileCompleteParams
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: FileCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileCompleteResponse>>
    }
}
