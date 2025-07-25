// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadCompleteAllResponse
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartParams
import com.hiddenlayer_sdk.api.models.scans.upload.UploadStartResponse
import com.hiddenlayer_sdk.api.services.blocking.scans.upload.FileService
import java.util.function.Consumer

interface UploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService

    fun file(): FileService

    /** Scan uploaded files */
    fun completeAll(scanId: String): UploadCompleteAllResponse =
        completeAll(scanId, UploadCompleteAllParams.none())

    /** @see completeAll */
    fun completeAll(
        scanId: String,
        params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCompleteAllResponse =
        completeAll(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see completeAll */
    fun completeAll(
        scanId: String,
        params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
    ): UploadCompleteAllResponse = completeAll(scanId, params, RequestOptions.none())

    /** @see completeAll */
    fun completeAll(
        params: UploadCompleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCompleteAllResponse

    /** @see completeAll */
    fun completeAll(params: UploadCompleteAllParams): UploadCompleteAllResponse =
        completeAll(params, RequestOptions.none())

    /** @see completeAll */
    fun completeAll(scanId: String, requestOptions: RequestOptions): UploadCompleteAllResponse =
        completeAll(scanId, UploadCompleteAllParams.none(), requestOptions)

    /** Start a model upload */
    fun start(params: UploadStartParams): UploadStartResponse = start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: UploadStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadStartResponse

    /** A view of [UploadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService.WithRawResponse

        fun file(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}`, but is otherwise the
         * same as [UploadService.completeAll].
         */
        @MustBeClosed
        fun completeAll(scanId: String): HttpResponseFor<UploadCompleteAllResponse> =
            completeAll(scanId, UploadCompleteAllParams.none())

        /** @see completeAll */
        @MustBeClosed
        fun completeAll(
            scanId: String,
            params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCompleteAllResponse> =
            completeAll(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see completeAll */
        @MustBeClosed
        fun completeAll(
            scanId: String,
            params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
        ): HttpResponseFor<UploadCompleteAllResponse> =
            completeAll(scanId, params, RequestOptions.none())

        /** @see completeAll */
        @MustBeClosed
        fun completeAll(
            params: UploadCompleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCompleteAllResponse>

        /** @see completeAll */
        @MustBeClosed
        fun completeAll(
            params: UploadCompleteAllParams
        ): HttpResponseFor<UploadCompleteAllResponse> = completeAll(params, RequestOptions.none())

        /** @see completeAll */
        @MustBeClosed
        fun completeAll(
            scanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadCompleteAllResponse> =
            completeAll(scanId, UploadCompleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload`, but is otherwise the same as
         * [UploadService.start].
         */
        @MustBeClosed
        fun start(params: UploadStartParams): HttpResponseFor<UploadStartResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: UploadStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadStartResponse>
    }
}
