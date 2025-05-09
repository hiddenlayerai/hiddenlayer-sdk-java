// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultListResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultPatchParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultPatchResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultStartParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport

interface ResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get Result of a Model Scan */
    fun retrieve(scanId: String): ScanReport = retrieve(scanId, ResultRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        scanId: String,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport = retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        scanId: String,
        params: ResultRetrieveParams = ResultRetrieveParams.none(),
    ): ScanReport = retrieve(scanId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReport

    /** @see [retrieve] */
    fun retrieve(params: ResultRetrieveParams): ScanReport = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(scanId: String, requestOptions: RequestOptions): ScanReport =
        retrieve(scanId, ResultRetrieveParams.none(), requestOptions)

    /** Get condensed reports for a Model Scan */
    fun list(): ResultListResponse = list(ResultListParams.none())

    /** @see [list] */
    fun list(
        params: ResultListParams = ResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultListResponse

    /** @see [list] */
    fun list(params: ResultListParams = ResultListParams.none()): ResultListResponse =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ResultListResponse =
        list(ResultListParams.none(), requestOptions)

    /** Indicate part (file or files) of a model scan has completed */
    fun patch(pathScanId: String, params: ResultPatchParams): ResultPatchResponse =
        patch(pathScanId, params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        pathScanId: String,
        params: ResultPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultPatchResponse =
        patch(params.toBuilder().pathScanId(pathScanId).build(), requestOptions)

    /** @see [patch] */
    fun patch(params: ResultPatchParams): ResultPatchResponse = patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: ResultPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultPatchResponse

    /** Indicate model scan has started */
    fun start(pathScanId: String, params: ResultStartParams) =
        start(pathScanId, params, RequestOptions.none())

    /** @see [start] */
    fun start(
        pathScanId: String,
        params: ResultStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = start(params.toBuilder().pathScanId(pathScanId).build(), requestOptions)

    /** @see [start] */
    fun start(params: ResultStartParams) = start(params, RequestOptions.none())

    /** @see [start] */
    fun start(params: ResultStartParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(scanId: String): HttpResponseFor<ScanReport> =
            retrieve(scanId, ResultRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            scanId: String,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport> =
            retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            scanId: String,
            params: ResultRetrieveParams = ResultRetrieveParams.none(),
        ): HttpResponseFor<ScanReport> = retrieve(scanId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReport>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ResultRetrieveParams): HttpResponseFor<ScanReport> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(scanId: String, requestOptions: RequestOptions): HttpResponseFor<ScanReport> =
            retrieve(scanId, ResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [ResultService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ResultListResponse> = list(ResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none()
        ): HttpResponseFor<ResultListResponse> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ResultListResponse> =
            list(ResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultService.patch].
         */
        @MustBeClosed
        fun patch(
            pathScanId: String,
            params: ResultPatchParams,
        ): HttpResponseFor<ResultPatchResponse> = patch(pathScanId, params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            pathScanId: String,
            params: ResultPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultPatchResponse> =
            patch(params.toBuilder().pathScanId(pathScanId).build(), requestOptions)

        /** @see [patch] */
        @MustBeClosed
        fun patch(params: ResultPatchParams): HttpResponseFor<ResultPatchResponse> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: ResultPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultPatchResponse>

        /**
         * Returns a raw HTTP response for `post /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultService.start].
         */
        @MustBeClosed
        fun start(pathScanId: String, params: ResultStartParams): HttpResponse =
            start(pathScanId, params, RequestOptions.none())

        /** @see [start] */
        @MustBeClosed
        fun start(
            pathScanId: String,
            params: ResultStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = start(params.toBuilder().pathScanId(pathScanId).build(), requestOptions)

        /** @see [start] */
        @MustBeClosed
        fun start(params: ResultStartParams): HttpResponse = start(params, RequestOptions.none())

        /** @see [start] */
        @MustBeClosed
        fun start(
            params: ResultStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
