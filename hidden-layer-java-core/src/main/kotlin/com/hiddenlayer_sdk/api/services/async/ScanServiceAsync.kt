// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
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
import java.util.function.Consumer

interface ScanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync

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

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync.WithRawResponse

        fun results(): ResultServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        fun upload(): UploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scans/v3/health`, but is otherwise the same as
         * [ScanServiceAsync.checkHealth].
         */
        fun checkHealth(): CompletableFuture<HttpResponse> =
            checkHealth(ScanCheckHealthParams.none())

        /** @see [checkHealth] */
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [checkHealth] */
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none()
        ): CompletableFuture<HttpResponse> = checkHealth(params, RequestOptions.none())

        /** @see [checkHealth] */
        fun checkHealth(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            checkHealth(ScanCheckHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scans/v3/readiness`, but is otherwise the same as
         * [ScanServiceAsync.checkReadiness].
         */
        fun checkReadiness(): CompletableFuture<HttpResponse> =
            checkReadiness(ScanCheckReadinessParams.none())

        /** @see [checkReadiness] */
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [checkReadiness] */
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none()
        ): CompletableFuture<HttpResponse> = checkReadiness(params, RequestOptions.none())

        /** @see [checkReadiness] */
        fun checkReadiness(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            checkReadiness(ScanCheckReadinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scans/v3/results/{scan_id}`, but is otherwise the
         * same as [ScanServiceAsync.retrieveResults].
         */
        fun retrieveResults(
            scanId: String
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, ScanRetrieveResultsParams.none())

        /** @see [retrieveResults] */
        fun retrieveResults(
            scanId: String,
            params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [retrieveResults] */
        fun retrieveResults(
            scanId: String,
            params: ScanRetrieveResultsParams = ScanRetrieveResultsParams.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, params, RequestOptions.none())

        /** @see [retrieveResults] */
        fun retrieveResults(
            params: ScanRetrieveResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>>

        /** @see [retrieveResults] */
        fun retrieveResults(
            params: ScanRetrieveResultsParams
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(params, RequestOptions.none())

        /** @see [retrieveResults] */
        fun retrieveResults(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> =
            retrieveResults(scanId, ScanRetrieveResultsParams.none(), requestOptions)
    }
}
