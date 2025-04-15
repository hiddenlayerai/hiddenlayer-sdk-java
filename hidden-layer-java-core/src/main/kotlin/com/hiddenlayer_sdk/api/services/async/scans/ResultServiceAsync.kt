// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

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
import java.util.concurrent.CompletableFuture

interface ResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get Result of a Model Scan */
    fun retrieve(params: ResultRetrieveParams): CompletableFuture<ScanReport> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReport>

    /** Get condensed reports for a Model Scan */
    fun list(): CompletableFuture<ResultListResponse> = list(ResultListParams.none())

    /** @see [list] */
    fun list(
        params: ResultListParams = ResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultListResponse>

    /** @see [list] */
    fun list(
        params: ResultListParams = ResultListParams.none()
    ): CompletableFuture<ResultListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ResultListResponse> =
        list(ResultListParams.none(), requestOptions)

    /** Indicate part (file or files) of a model scan has completed */
    fun patch(params: ResultPatchParams): CompletableFuture<ResultPatchResponse> =
        patch(params, RequestOptions.none())

    /** @see [patch] */
    fun patch(
        params: ResultPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultPatchResponse>

    /** Indicate model scan has started */
    fun start(params: ResultStartParams): CompletableFuture<Void?> =
        start(params, RequestOptions.none())

    /** @see [start] */
    fun start(
        params: ResultStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [ResultServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ResultRetrieveParams): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>>

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [ResultServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(ResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResultListParams = ResultListParams.none()
        ): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(ResultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultServiceAsync.patch].
         */
        @MustBeClosed
        fun patch(
            params: ResultPatchParams
        ): CompletableFuture<HttpResponseFor<ResultPatchResponse>> =
            patch(params, RequestOptions.none())

        /** @see [patch] */
        @MustBeClosed
        fun patch(
            params: ResultPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultPatchResponse>>

        /**
         * Returns a raw HTTP response for `post /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultServiceAsync.start].
         */
        @MustBeClosed
        fun start(params: ResultStartParams): CompletableFuture<HttpResponse> =
            start(params, RequestOptions.none())

        /** @see [start] */
        @MustBeClosed
        fun start(
            params: ResultStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
