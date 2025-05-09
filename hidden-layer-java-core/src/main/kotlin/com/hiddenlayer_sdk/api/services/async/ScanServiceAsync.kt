// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.ScanCheckHealthParams
import com.hiddenlayer_sdk.api.models.scans.ScanCheckReadinessParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsResponse
import com.hiddenlayer_sdk.api.services.async.scans.JobServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.ResultServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.UploadServiceAsync
import java.util.concurrent.CompletableFuture

interface ScanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun results(): ResultServiceAsync

    fun jobs(): JobServiceAsync

    fun upload(): UploadServiceAsync

    /** Health check endpoint for Model Supply Chain Services */
    fun checkHealth(): CompletableFuture<Void?> = checkHealth(ScanCheckHealthParams.none())

    /** @see [checkHealth] */
    fun checkHealth(
        params: ScanCheckHealthParams = ScanCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [checkHealth] */
    fun checkHealth(
        params: ScanCheckHealthParams = ScanCheckHealthParams.none()
    ): CompletableFuture<Void?> = checkHealth(params, RequestOptions.none())

    /** @see [checkHealth] */
    fun checkHealth(requestOptions: RequestOptions): CompletableFuture<Void?> =
        checkHealth(ScanCheckHealthParams.none(), requestOptions)

    /** Readiness check endpoint for Model Supply Chain Services */
    fun checkReadiness(): CompletableFuture<Void?> = checkReadiness(ScanCheckReadinessParams.none())

    /** @see [checkReadiness] */
    fun checkReadiness(
        params: ScanCheckReadinessParams = ScanCheckReadinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [checkReadiness] */
    fun checkReadiness(
        params: ScanCheckReadinessParams = ScanCheckReadinessParams.none()
    ): CompletableFuture<Void?> = checkReadiness(params, RequestOptions.none())

    /** @see [checkReadiness] */
    fun checkReadiness(requestOptions: RequestOptions): CompletableFuture<Void?> =
        checkReadiness(ScanCheckReadinessParams.none(), requestOptions)

    /** Retrieve Model Scan Results */
    fun retrieveResults(scanId: String): CompletableFuture<ScanRetrieveResultsResponse> =
        retrieveResults(scanId, ScanRetrieveResultsParams.none())

    /** @see [retrieveResults] */
    fun retrieveResults(
        scanId: String,
        params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanRetrieveResultsResponse> =
        retrieveResults(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see [retrieveResults] */
    fun retrieveResults(
        scanId: String,
        params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
    ): CompletableFuture<ScanRetrieveResultsResponse> =
        retrieveResults(scanId, params, RequestOptions.none())

    /** @see [retrieveResults] */
    fun retrieveResults(
        params: ScanRetrieveResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanRetrieveResultsResponse>

    /** @see [retrieveResults] */
    fun retrieveResults(
        params: ScanRetrieveResultsParams
    ): CompletableFuture<ScanRetrieveResultsResponse> =
        retrieveResults(params, RequestOptions.none())

    /** @see [retrieveResults] */
    fun retrieveResults(
        scanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanRetrieveResultsResponse> =
        retrieveResults(scanId, ScanRetrieveResultsParams.none(), requestOptions)

    /** A view of [ScanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun results(): ResultServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        fun upload(): UploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scans/v3/health`, but is otherwise the same as
         * [ScanServiceAsync.checkHealth].
         */
        @MustBeClosed
        fun checkHealth(): CompletableFuture<HttpResponse> =
            checkHealth(ScanCheckHealthParams.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none()
        ): CompletableFuture<HttpResponse> = checkHealth(params, RequestOptions.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            checkHealth(ScanCheckHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scans/v3/readiness`, but is otherwise the same as
         * [ScanServiceAsync.checkReadiness].
         */
        @MustBeClosed
        fun checkReadiness(): CompletableFuture<HttpResponse> =
            checkReadiness(ScanCheckReadinessParams.none())

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none()
        ): CompletableFuture<HttpResponse> = checkReadiness(params, RequestOptions.none())

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            checkReadiness(ScanCheckReadinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scans/v3/results/{scan_id}`, but is otherwise the
         * same as [ScanServiceAsync.retrieveResults].
         */
        @MustBeClosed
        fun retrieveResults(
            scanId: String
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, ScanRetrieveResultsParams.none())

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            scanId: String,
            params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            scanId: String,
            params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, params, RequestOptions.none())

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            params: ScanRetrieveResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>>

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            params: ScanRetrieveResultsParams
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(params, RequestOptions.none())

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, ScanRetrieveResultsParams.none(), requestOptions)
    }
}
