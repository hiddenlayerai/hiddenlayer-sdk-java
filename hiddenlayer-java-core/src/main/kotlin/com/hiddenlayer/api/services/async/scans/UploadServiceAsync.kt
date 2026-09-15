// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.upload.UploadCompleteAllParams
import com.hiddenlayer.api.models.scans.upload.UploadCompleteAllResponse
import com.hiddenlayer.api.models.scans.upload.UploadStartParams
import com.hiddenlayer.api.models.scans.upload.UploadStartResponse
import com.hiddenlayer.api.services.async.scans.upload.FileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadServiceAsync

    fun file(): FileServiceAsync

    /** Scan uploaded files */
    fun completeAll(scanId: String): CompletableFuture<UploadCompleteAllResponse> =
        completeAll(scanId, UploadCompleteAllParams.none())

    /** @see completeAll */
    fun completeAll(
        scanId: String,
        params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCompleteAllResponse> =
        completeAll(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see completeAll */
    fun completeAll(
        scanId: String,
        params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
    ): CompletableFuture<UploadCompleteAllResponse> =
        completeAll(scanId, params, RequestOptions.none())

    /** @see completeAll */
    fun completeAll(
        params: UploadCompleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCompleteAllResponse>

    /** @see completeAll */
    fun completeAll(params: UploadCompleteAllParams): CompletableFuture<UploadCompleteAllResponse> =
        completeAll(params, RequestOptions.none())

    /** @see completeAll */
    fun completeAll(
        scanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadCompleteAllResponse> =
        completeAll(scanId, UploadCompleteAllParams.none(), requestOptions)

    /** Start a model upload */
    fun start(params: UploadStartParams): CompletableFuture<UploadStartResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: UploadStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadStartResponse>

    /**
     * A view of [UploadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadServiceAsync.WithRawResponse

        fun file(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /scan/v3/upload/{scan_id}`, but is otherwise the
         * same as [UploadServiceAsync.completeAll].
         */
        fun completeAll(
            scanId: String
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>> =
            completeAll(scanId, UploadCompleteAllParams.none())

        /** @see completeAll */
        fun completeAll(
            scanId: String,
            params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>> =
            completeAll(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see completeAll */
        fun completeAll(
            scanId: String,
            params: UploadCompleteAllParams = UploadCompleteAllParams.none(),
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>> =
            completeAll(scanId, params, RequestOptions.none())

        /** @see completeAll */
        fun completeAll(
            params: UploadCompleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>>

        /** @see completeAll */
        fun completeAll(
            params: UploadCompleteAllParams
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>> =
            completeAll(params, RequestOptions.none())

        /** @see completeAll */
        fun completeAll(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadCompleteAllResponse>> =
            completeAll(scanId, UploadCompleteAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scan/v3/upload`, but is otherwise the same as
         * [UploadServiceAsync.start].
         */
        fun start(
            params: UploadStartParams
        ): CompletableFuture<HttpResponseFor<UploadStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            params: UploadStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadStartResponse>>
    }
}
