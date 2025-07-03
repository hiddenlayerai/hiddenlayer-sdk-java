// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans.upload

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileAddResponse
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteParams
import com.hiddenlayer_sdk.api.models.scans.upload.file.FileCompleteResponse
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

    /** Upload a model file */
    fun add(scanId: String, params: FileAddParams): FileAddResponse =
        add(scanId, params, RequestOptions.none())

    /** @see [add] */
    fun add(
        scanId: String,
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAddResponse = add(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see [add] */
    fun add(params: FileAddParams): FileAddResponse = add(params, RequestOptions.none())

    /** @see [add] */
    fun add(
        params: FileAddParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileAddResponse

    /** Complete a file upload */
    fun complete(fileId: String, params: FileCompleteParams): FileCompleteResponse =
        complete(fileId, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        fileId: String,
        params: FileCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileCompleteResponse = complete(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [complete] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload/{scan_id}/file`, but is otherwise
         * the same as [FileService.add].
         */
        @MustBeClosed
        fun add(scanId: String, params: FileAddParams): HttpResponseFor<FileAddResponse> =
            add(scanId, params, RequestOptions.none())

        /** @see [add] */
        @MustBeClosed
        fun add(
            scanId: String,
            params: FileAddParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileAddResponse> =
            add(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [add] */
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
        fun complete(
            fileId: String,
            params: FileCompleteParams,
        ): HttpResponseFor<FileCompleteResponse> = complete(fileId, params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            fileId: String,
            params: FileCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileCompleteResponse> =
            complete(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [complete] */
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
