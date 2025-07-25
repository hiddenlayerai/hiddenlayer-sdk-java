// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListResponse
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.jobs.ScanJob
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    /** Get scan results (SARIF / V3) */
    fun retrieve(scanId: String): CompletableFuture<ScanReport> =
        retrieve(scanId, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        scanId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReport> =
        retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        scanId: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): CompletableFuture<ScanReport> = retrieve(scanId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReport>

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): CompletableFuture<ScanReport> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(scanId: String, requestOptions: RequestOptions): CompletableFuture<ScanReport> =
        retrieve(scanId, JobRetrieveParams.none(), requestOptions)

    /** Get scan results (Summaries) */
    fun list(): CompletableFuture<JobListResponse> = list(JobListParams.none())

    /** @see list */
    fun list(
        params: JobListParams = JobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobListResponse>

    /** @see list */
    fun list(params: JobListParams = JobListParams.none()): CompletableFuture<JobListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<JobListResponse> =
        list(JobListParams.none(), requestOptions)

    /** Scan a remote model */
    fun request(params: JobRequestParams): CompletableFuture<ScanJob> =
        request(params, RequestOptions.none())

    /** @see request */
    fun request(
        params: JobRequestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanJob>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [JobServiceAsync.retrieve].
         */
        fun retrieve(scanId: String): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(scanId, JobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            scanId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            scanId: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(scanId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>>

        /** @see retrieve */
        fun retrieve(params: JobRetrieveParams): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(scanId, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<JobListResponse>> = list(JobListParams.none())

        /** @see list */
        fun list(
            params: JobListParams = JobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobListResponse>>

        /** @see list */
        fun list(
            params: JobListParams = JobListParams.none()
        ): CompletableFuture<HttpResponseFor<JobListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<JobListResponse>> =
            list(JobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /scan/v3/jobs`, but is otherwise the same as
         * [JobServiceAsync.request].
         */
        fun request(params: JobRequestParams): CompletableFuture<HttpResponseFor<ScanJob>> =
            request(params, RequestOptions.none())

        /** @see request */
        fun request(
            params: JobRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanJob>>
    }
}
