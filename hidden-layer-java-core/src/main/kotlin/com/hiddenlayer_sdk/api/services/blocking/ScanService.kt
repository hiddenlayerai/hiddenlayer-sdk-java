// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.ScanCheckHealthParams
import com.hiddenlayer_sdk.api.models.scans.ScanCheckReadinessParams
import com.hiddenlayer_sdk.api.models.scans.ScanCreateReportParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsResponse
import com.hiddenlayer_sdk.api.services.blocking.scans.JobService
import com.hiddenlayer_sdk.api.services.blocking.scans.ResultService
import com.hiddenlayer_sdk.api.services.blocking.scans.UploadService

interface ScanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun results(): ResultService

    fun jobs(): JobService

    fun upload(): UploadService

    /** Health check endpoint for Model Supply Chain Services */
    fun checkHealth() = checkHealth(ScanCheckHealthParams.none())

    /** @see [checkHealth] */
    fun checkHealth(
        params: ScanCheckHealthParams = ScanCheckHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [checkHealth] */
    fun checkHealth(params: ScanCheckHealthParams = ScanCheckHealthParams.none()) =
        checkHealth(params, RequestOptions.none())

    /** @see [checkHealth] */
    fun checkHealth(requestOptions: RequestOptions) =
        checkHealth(ScanCheckHealthParams.none(), requestOptions)

    /** Readiness check endpoint for Model Supply Chain Services */
    fun checkReadiness() = checkReadiness(ScanCheckReadinessParams.none())

    /** @see [checkReadiness] */
    fun checkReadiness(
        params: ScanCheckReadinessParams = ScanCheckReadinessParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [checkReadiness] */
    fun checkReadiness(params: ScanCheckReadinessParams = ScanCheckReadinessParams.none()) =
        checkReadiness(params, RequestOptions.none())

    /** @see [checkReadiness] */
    fun checkReadiness(requestOptions: RequestOptions) =
        checkReadiness(ScanCheckReadinessParams.none(), requestOptions)

    /** Engine Report Endpoint of Model Scan Results */
    fun createReport(params: ScanCreateReportParams) = createReport(params, RequestOptions.none())

    /** @see [createReport] */
    fun createReport(
        params: ScanCreateReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Retrieve Model Scan Results */
    fun retrieveResults(params: ScanRetrieveResultsParams): ScanRetrieveResultsResponse =
        retrieveResults(params, RequestOptions.none())

    /** @see [retrieveResults] */
    fun retrieveResults(
        params: ScanRetrieveResultsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanRetrieveResultsResponse

    /** A view of [ScanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun results(): ResultService.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        fun upload(): UploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scans/v3/health`, but is otherwise the same as
         * [ScanService.checkHealth].
         */
        @MustBeClosed fun checkHealth(): HttpResponse = checkHealth(ScanCheckHealthParams.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(
            params: ScanCheckHealthParams = ScanCheckHealthParams.none()
        ): HttpResponse = checkHealth(params, RequestOptions.none())

        /** @see [checkHealth] */
        @MustBeClosed
        fun checkHealth(requestOptions: RequestOptions): HttpResponse =
            checkHealth(ScanCheckHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scans/v3/readiness`, but is otherwise the same as
         * [ScanService.checkReadiness].
         */
        @MustBeClosed
        fun checkReadiness(): HttpResponse = checkReadiness(ScanCheckReadinessParams.none())

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(
            params: ScanCheckReadinessParams = ScanCheckReadinessParams.none()
        ): HttpResponse = checkReadiness(params, RequestOptions.none())

        /** @see [checkReadiness] */
        @MustBeClosed
        fun checkReadiness(requestOptions: RequestOptions): HttpResponse =
            checkReadiness(ScanCheckReadinessParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scans/v3/reports/{scan_id}`, but is otherwise the
         * same as [ScanService.createReport].
         */
        @MustBeClosed
        fun createReport(params: ScanCreateReportParams): HttpResponse =
            createReport(params, RequestOptions.none())

        /** @see [createReport] */
        @MustBeClosed
        fun createReport(
            params: ScanCreateReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /scans/v3/results/{scan_id}`, but is otherwise the
         * same as [ScanService.retrieveResults].
         */
        @MustBeClosed
        fun retrieveResults(
            params: ScanRetrieveResultsParams
        ): HttpResponseFor<ScanRetrieveResultsResponse> =
            retrieveResults(params, RequestOptions.none())

        /** @see [retrieveResults] */
        @MustBeClosed
        fun retrieveResults(
            params: ScanRetrieveResultsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanRetrieveResultsResponse>
    }
}
