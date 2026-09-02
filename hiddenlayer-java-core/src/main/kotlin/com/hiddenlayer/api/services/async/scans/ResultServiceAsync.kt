// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.results.ResultListFilesPageAsync
import com.hiddenlayer.api.models.scans.results.ResultListFilesParams
import com.hiddenlayer.api.models.scans.results.ResultRetrieveSummaryParams
import com.hiddenlayer.api.models.scans.results.ResultSarifParams
import com.hiddenlayer.api.models.scans.results.ScanReportSummary
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

    /**
     * Returns a cursor-paginated list of file results for a given scan. Results are sorted by
     * compliance status, then highest detection severity, then file path.
     */
    fun listFiles(scanId: String): CompletableFuture<ResultListFilesPageAsync> =
        listFiles(scanId, ResultListFilesParams.none())

    /** @see listFiles */
    fun listFiles(
        scanId: String,
        params: ResultListFilesParams = ResultListFilesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultListFilesPageAsync> =
        listFiles(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see listFiles */
    fun listFiles(
        scanId: String,
        params: ResultListFilesParams = ResultListFilesParams.none(),
    ): CompletableFuture<ResultListFilesPageAsync> =
        listFiles(scanId, params, RequestOptions.none())

    /** @see listFiles */
    fun listFiles(
        params: ResultListFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResultListFilesPageAsync>

    /** @see listFiles */
    fun listFiles(params: ResultListFilesParams): CompletableFuture<ResultListFilesPageAsync> =
        listFiles(params, RequestOptions.none())

    /** @see listFiles */
    fun listFiles(
        scanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResultListFilesPageAsync> =
        listFiles(scanId, ResultListFilesParams.none(), requestOptions)

    /** Returns aggregated summary information for a scan without file-level results. */
    fun retrieveSummary(scanId: String): CompletableFuture<ScanReportSummary> =
        retrieveSummary(scanId, ResultRetrieveSummaryParams.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        scanId: String,
        params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReportSummary> =
        retrieveSummary(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see retrieveSummary */
    fun retrieveSummary(
        scanId: String,
        params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
    ): CompletableFuture<ScanReportSummary> = retrieveSummary(scanId, params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: ResultRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScanReportSummary>

    /** @see retrieveSummary */
    fun retrieveSummary(params: ResultRetrieveSummaryParams): CompletableFuture<ScanReportSummary> =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        scanId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanReportSummary> =
        retrieveSummary(scanId, ResultRetrieveSummaryParams.none(), requestOptions)

    /** Get scan results in SARIF format */
    fun sarif(scanId: String): CompletableFuture<String> = sarif(scanId, ResultSarifParams.none())

    /** @see sarif */
    fun sarif(
        scanId: String,
        params: ResultSarifParams = ResultSarifParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> = sarif(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see sarif */
    fun sarif(
        scanId: String,
        params: ResultSarifParams = ResultSarifParams.none(),
    ): CompletableFuture<String> = sarif(scanId, params, RequestOptions.none())

    /** @see sarif */
    fun sarif(
        params: ResultSarifParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see sarif */
    fun sarif(params: ResultSarifParams): CompletableFuture<String> =
        sarif(params, RequestOptions.none())

    /** @see sarif */
    fun sarif(scanId: String, requestOptions: RequestOptions): CompletableFuture<String> =
        sarif(scanId, ResultSarifParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/files`, but is otherwise
         * the same as [ResultServiceAsync.listFiles].
         */
        fun listFiles(
            scanId: String
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> =
            listFiles(scanId, ResultListFilesParams.none())

        /** @see listFiles */
        fun listFiles(
            scanId: String,
            params: ResultListFilesParams = ResultListFilesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> =
            listFiles(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see listFiles */
        fun listFiles(
            scanId: String,
            params: ResultListFilesParams = ResultListFilesParams.none(),
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> =
            listFiles(scanId, params, RequestOptions.none())

        /** @see listFiles */
        fun listFiles(
            params: ResultListFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>>

        /** @see listFiles */
        fun listFiles(
            params: ResultListFilesParams
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> =
            listFiles(params, RequestOptions.none())

        /** @see listFiles */
        fun listFiles(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> =
            listFiles(scanId, ResultListFilesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/summary`, but is
         * otherwise the same as [ResultServiceAsync.retrieveSummary].
         */
        fun retrieveSummary(scanId: String): CompletableFuture<HttpResponseFor<ScanReportSummary>> =
            retrieveSummary(scanId, ResultRetrieveSummaryParams.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            scanId: String,
            params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>> =
            retrieveSummary(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see retrieveSummary */
        fun retrieveSummary(
            scanId: String,
            params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>> =
            retrieveSummary(scanId, params, RequestOptions.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            params: ResultRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>>

        /** @see retrieveSummary */
        fun retrieveSummary(
            params: ResultRetrieveSummaryParams
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>> =
            retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        fun retrieveSummary(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>> =
            retrieveSummary(scanId, ResultRetrieveSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/sarif`, but is otherwise
         * the same as [ResultServiceAsync.sarif].
         */
        fun sarif(scanId: String): CompletableFuture<HttpResponseFor<String>> =
            sarif(scanId, ResultSarifParams.none())

        /** @see sarif */
        fun sarif(
            scanId: String,
            params: ResultSarifParams = ResultSarifParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            sarif(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see sarif */
        fun sarif(
            scanId: String,
            params: ResultSarifParams = ResultSarifParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> = sarif(scanId, params, RequestOptions.none())

        /** @see sarif */
        fun sarif(
            params: ResultSarifParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see sarif */
        fun sarif(params: ResultSarifParams): CompletableFuture<HttpResponseFor<String>> =
            sarif(params, RequestOptions.none())

        /** @see sarif */
        fun sarif(
            scanId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            sarif(scanId, ResultSarifParams.none(), requestOptions)
    }
}
