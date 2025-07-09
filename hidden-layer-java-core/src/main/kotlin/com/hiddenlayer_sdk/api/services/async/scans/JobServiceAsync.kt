// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListResponse
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.jobs.ScanJob
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

    /** Get scan results (Summaries) */
    fun list(params: JobListParams): CompletableFuture<JobListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: JobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<JobListResponse>

    /** Scan a remote model */
    fun request(params: JobRequestParams): CompletableFuture<ScanJob> =
        request(params, RequestOptions.none())

    /** @see [request] */
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
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        fun list(params: JobListParams): CompletableFuture<HttpResponseFor<JobListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: JobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<JobListResponse>>

        /**
         * Returns a raw HTTP response for `post /scan/v3/jobs`, but is otherwise the same as
         * [JobServiceAsync.request].
         */
        fun request(params: JobRequestParams): CompletableFuture<HttpResponseFor<ScanJob>> =
            request(params, RequestOptions.none())

        /** @see [request] */
        fun request(
            params: JobRequestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanJob>>
    }
}
