// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllResponse
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartResponse
import com.hiddenlayer_sdk.api.services.blocking.scans.upload.FileService

interface UploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun file(): FileService

    /** Indicate All files are uploaded and start the scan */
    fun completeAll(params: UploadCompleteAllParams): UploadCompleteAllResponse =
        completeAll(params, RequestOptions.none())

    /** @see [completeAll] */
    fun completeAll(
        params: UploadCompleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCompleteAllResponse

    /** Start V3 Upload */
    fun start(params: UploadStartParams): UploadStartResponse = start(params, RequestOptions.none())

    /** @see [start] */
    fun start(
        params: UploadStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadStartResponse

    /** A view of [UploadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun file(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}`, but is otherwise the
         * same as [UploadService.completeAll].
         */
        @MustBeClosed
        fun completeAll(
            params: UploadCompleteAllParams
        ): HttpResponseFor<UploadCompleteAllResponse> = completeAll(params, RequestOptions.none())

        /** @see [completeAll] */
        @MustBeClosed
        fun completeAll(
            params: UploadCompleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCompleteAllResponse>

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload`, but is otherwise the same as
         * [UploadService.start].
         */
        @MustBeClosed
        fun start(params: UploadStartParams): HttpResponseFor<UploadStartResponse> =
            start(params, RequestOptions.none())

        /** @see [start] */
        @MustBeClosed
        fun start(
            params: UploadStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadStartResponse>
    }
}
