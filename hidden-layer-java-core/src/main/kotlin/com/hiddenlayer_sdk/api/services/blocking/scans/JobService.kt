// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.jobs.ScanJob
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List all Model Scan Jobs */
    fun list(): ScanJob = list(JobListParams.none())

    /** @see [list] */
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanJob

    /** @see [list] */
    fun list(params: JobListParams = JobListParams.none()): ScanJob =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ScanJob = list(JobListParams.none(), requestOptions)

    /** Request a Model Scan Job */
    fun request(params: JobRequestParams): ScanReport = request(params, RequestOptions.none())

    /** @see [request] */
    fun request(
        params: JobRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /scan/v3/jobs`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ScanJob> = list(JobListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanJob>

        /** @see [list] */
        @MustBeClosed
        fun list(params: JobListParams = JobListParams.none()): HttpResponseFor<ScanJob> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ScanJob> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scan/v3/jobs`, but is otherwise the same as
         * [JobService.request].
         */
        @MustBeClosed
        fun request(params: JobRequestParams): HttpResponseFor<ScanReport> =
            request(params, RequestOptions.none())

        /** @see [request] */
        @MustBeClosed
        fun request(
            params: JobRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport>
    }
}
