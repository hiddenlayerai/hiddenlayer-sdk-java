// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.jobs.JobListParams
import com.hiddenlayer.api.models.scans.jobs.JobListResponse
import com.hiddenlayer.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer.api.models.scans.jobs.JobRetrieveParams
import com.hiddenlayer.api.models.scans.jobs.ScanJob
import com.hiddenlayer.api.models.scans.results.ScanReport
import java.util.function.Consumer

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService

    /** Get scan results */
    fun retrieve(scanId: String): ScanReport = retrieve(scanId, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        scanId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport = retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(scanId: String, params: JobRetrieveParams = JobRetrieveParams.none()): ScanReport =
        retrieve(scanId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): ScanReport = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(scanId: String, requestOptions: RequestOptions): ScanReport =
        retrieve(scanId, JobRetrieveParams.none(), requestOptions)

    /** Get scan results (Summaries) */
    fun list(): JobListResponse = list(JobListParams.none())

    /** @see list */
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): JobListResponse

    /** @see list */
    fun list(params: JobListParams = JobListParams.none()): JobListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): JobListResponse =
        list(JobListParams.none(), requestOptions)

    /** Scan a remote model */
    fun request(params: JobRequestParams): ScanJob = request(params, RequestOptions.none())

    /** @see request */
    fun request(
        params: JobRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanJob

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(scanId: String): HttpResponseFor<ScanReport> =
            retrieve(scanId, JobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            scanId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport> =
            retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            scanId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): HttpResponseFor<ScanReport> = retrieve(scanId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JobRetrieveParams): HttpResponseFor<ScanReport> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(scanId: String, requestOptions: RequestOptions): HttpResponseFor<ScanReport> =
            retrieve(scanId, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<JobListResponse> = list(JobListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<JobListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: JobListParams = JobListParams.none()): HttpResponseFor<JobListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<JobListResponse> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scan/v3/jobs`, but is otherwise the same as
         * [JobService.request].
         */
        @MustBeClosed
        fun request(params: JobRequestParams): HttpResponseFor<ScanJob> =
            request(params, RequestOptions.none())

        /** @see request */
        @MustBeClosed
        fun request(
            params: JobRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanJob>
    }
}
