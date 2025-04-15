// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans.upload

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddResponse
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteResponse

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add file to V3 Upload */
    fun add(params: FileAddParams): FileAddResponse = add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAddResponse

    /** Indicate that upload is completed for {file_id} */
    fun complete(params: FileCompleteParams): FileCompleteResponse =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: FileCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileCompleteResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload/{scan_id}/file`, but is otherwise
         * the same as [FileService.add].
         */
        @MustBeClosed
        fun add(params: FileAddParams): HttpResponseFor<FileAddResponse> =
            add(params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileAddResponse>

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}/file/{file_id}`, but is
         * otherwise the same as [FileService.complete].
         */
        @MustBeClosed
        fun complete(params: FileCompleteParams): HttpResponseFor<FileCompleteResponse> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: FileCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileCompleteResponse>
    }
}
