// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.scans.results.ResultSarifParams
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
