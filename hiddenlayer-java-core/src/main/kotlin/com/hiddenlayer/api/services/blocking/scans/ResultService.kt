// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.results.ResultListFilesPage
import com.hiddenlayer.api.models.scans.results.ResultListFilesParams
import com.hiddenlayer.api.models.scans.results.ResultRetrieveSummaryParams
import com.hiddenlayer.api.models.scans.results.ResultSarifParams
import com.hiddenlayer.api.models.scans.results.ScanReportSummary
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

    /**
     * Returns a cursor-paginated list of file results for a given scan. Results are sorted by
     * compliance status, then highest detection severity, then file path.
     */
    fun listFiles(scanId: String): ResultListFilesPage =
        listFiles(scanId, ResultListFilesParams.none())

    /** @see listFiles */
    fun listFiles(
        scanId: String,
        params: ResultListFilesParams = ResultListFilesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultListFilesPage = listFiles(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see listFiles */
    fun listFiles(
        scanId: String,
        params: ResultListFilesParams = ResultListFilesParams.none(),
    ): ResultListFilesPage = listFiles(scanId, params, RequestOptions.none())

    /** @see listFiles */
    fun listFiles(
        params: ResultListFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResultListFilesPage

    /** @see listFiles */
    fun listFiles(params: ResultListFilesParams): ResultListFilesPage =
        listFiles(params, RequestOptions.none())

    /** @see listFiles */
    fun listFiles(scanId: String, requestOptions: RequestOptions): ResultListFilesPage =
        listFiles(scanId, ResultListFilesParams.none(), requestOptions)

    /** Returns aggregated summary information for a scan without file-level results. */
    fun retrieveSummary(scanId: String): ScanReportSummary =
        retrieveSummary(scanId, ResultRetrieveSummaryParams.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        scanId: String,
        params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReportSummary =
        retrieveSummary(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see retrieveSummary */
    fun retrieveSummary(
        scanId: String,
        params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
    ): ScanReportSummary = retrieveSummary(scanId, params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(
        params: ResultRetrieveSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScanReportSummary

    /** @see retrieveSummary */
    fun retrieveSummary(params: ResultRetrieveSummaryParams): ScanReportSummary =
        retrieveSummary(params, RequestOptions.none())

    /** @see retrieveSummary */
    fun retrieveSummary(scanId: String, requestOptions: RequestOptions): ScanReportSummary =
        retrieveSummary(scanId, ResultRetrieveSummaryParams.none(), requestOptions)

    /** Get scan results in SARIF format */
    fun sarif(scanId: String): String = sarif(scanId, ResultSarifParams.none())

    /** @see sarif */
    fun sarif(
        scanId: String,
        params: ResultSarifParams = ResultSarifParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = sarif(params.toBuilder().scanId(scanId).build(), requestOptions)

    /** @see sarif */
    fun sarif(scanId: String, params: ResultSarifParams = ResultSarifParams.none()): String =
        sarif(scanId, params, RequestOptions.none())

    /** @see sarif */
    fun sarif(
        params: ResultSarifParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see sarif */
    fun sarif(params: ResultSarifParams): String = sarif(params, RequestOptions.none())

    /** @see sarif */
    fun sarif(scanId: String, requestOptions: RequestOptions): String =
        sarif(scanId, ResultSarifParams.none(), requestOptions)

    /** A view of [ResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/files`, but is otherwise
         * the same as [ResultService.listFiles].
         */
        @MustBeClosed
        fun listFiles(scanId: String): HttpResponseFor<ResultListFilesPage> =
            listFiles(scanId, ResultListFilesParams.none())

        /** @see listFiles */
        @MustBeClosed
        fun listFiles(
            scanId: String,
            params: ResultListFilesParams = ResultListFilesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultListFilesPage> =
            listFiles(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see listFiles */
        @MustBeClosed
        fun listFiles(
            scanId: String,
            params: ResultListFilesParams = ResultListFilesParams.none(),
        ): HttpResponseFor<ResultListFilesPage> = listFiles(scanId, params, RequestOptions.none())

        /** @see listFiles */
        @MustBeClosed
        fun listFiles(
            params: ResultListFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResultListFilesPage>

        /** @see listFiles */
        @MustBeClosed
        fun listFiles(params: ResultListFilesParams): HttpResponseFor<ResultListFilesPage> =
            listFiles(params, RequestOptions.none())

        /** @see listFiles */
        @MustBeClosed
        fun listFiles(
            scanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResultListFilesPage> =
            listFiles(scanId, ResultListFilesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/summary`, but is
         * otherwise the same as [ResultService.retrieveSummary].
         */
        @MustBeClosed
        fun retrieveSummary(scanId: String): HttpResponseFor<ScanReportSummary> =
            retrieveSummary(scanId, ResultRetrieveSummaryParams.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            scanId: String,
            params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReportSummary> =
            retrieveSummary(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            scanId: String,
            params: ResultRetrieveSummaryParams = ResultRetrieveSummaryParams.none(),
        ): HttpResponseFor<ScanReportSummary> =
            retrieveSummary(scanId, params, RequestOptions.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            params: ResultRetrieveSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScanReportSummary>

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            params: ResultRetrieveSummaryParams
        ): HttpResponseFor<ScanReportSummary> = retrieveSummary(params, RequestOptions.none())

        /** @see retrieveSummary */
        @MustBeClosed
        fun retrieveSummary(
            scanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScanReportSummary> =
            retrieveSummary(scanId, ResultRetrieveSummaryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scan/v3/results/{scan_id}/sarif`, but is otherwise
         * the same as [ResultService.sarif].
         */
        @MustBeClosed
        fun sarif(scanId: String): HttpResponseFor<String> = sarif(scanId, ResultSarifParams.none())

        /** @see sarif */
        @MustBeClosed
        fun sarif(
            scanId: String,
            params: ResultSarifParams = ResultSarifParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            sarif(params.toBuilder().scanId(scanId).build(), requestOptions)

        /** @see sarif */
        @MustBeClosed
        fun sarif(
            scanId: String,
            params: ResultSarifParams = ResultSarifParams.none(),
        ): HttpResponseFor<String> = sarif(scanId, params, RequestOptions.none())

        /** @see sarif */
        @MustBeClosed
        fun sarif(
            params: ResultSarifParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see sarif */
        @MustBeClosed
        fun sarif(params: ResultSarifParams): HttpResponseFor<String> =
            sarif(params, RequestOptions.none())

        /** @see sarif */
        @MustBeClosed
        fun sarif(scanId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            sarif(scanId, ResultSarifParams.none(), requestOptions)
    }
}
