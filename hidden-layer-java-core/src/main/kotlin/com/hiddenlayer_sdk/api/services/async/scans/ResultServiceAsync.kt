// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultListResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ResultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultServiceAsync

    /** Get scan results (SARIF / V3) */
    fun retrieve(scanId: String, params: ResultRetrieveParams): CompletableFuture<ScanReport> =
        retrieve(scanId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        scanId: String,
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReport> =
        retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: ResultRetrieveParams): CompletableFuture<ScanReport> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReport>

    /** Get scan results (Summaries) */
    fun list(params: ResultListParams): CompletableFuture<ResultListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultListResponse>

    /**
     * A view of [ResultServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResultServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}`, but is otherwise the
         * same as [ResultServiceAsync.retrieve].
         */
        fun retrieve(
            scanId: String,
            params: ResultRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(scanId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            scanId: String,
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(params: ResultRetrieveParams): CompletableFuture<HttpResponseFor<ScanReport>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReport>>

        /**
         * Returns a raw HTTP response for `get /scan/v3/results`, but is otherwise the same as
         * [ResultServiceAsync.list].
         */
        fun list(params: ResultListParams): CompletableFuture<HttpResponseFor<ResultListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: ResultListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultListResponse>>
    }
}
