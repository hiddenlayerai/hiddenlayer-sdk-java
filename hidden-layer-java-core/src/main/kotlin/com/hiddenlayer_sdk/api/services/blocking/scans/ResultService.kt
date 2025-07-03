// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultListResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.function.Consumer

interface ResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultService

    /** Get scan results (SARIF / V3) */
    fun retrieve(scanId: String, params: ResultRetrieveParams): ScanReport =
        retrieve(scanId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        scanId: String,
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport = retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: ResultRetrieveParams): ScanReport = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport

    /** Get scan results (Summaries) */
    fun list(params: ResultListParams): ResultListResponse = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultListResponse

    /** A view of [ResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(scanId: String, params: ResultRetrieveParams): HttpResponseFor<ScanReport> =
            retrieve(scanId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            scanId: String,
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport> =
            retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ResultRetrieveParams): HttpResponseFor<ScanReport> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport>

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [ResultService.list].
         */
        @MustBeClosed
        fun list(params: ResultListParams): HttpResponseFor<ResultListResponse> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultListResponse>
    }
}
