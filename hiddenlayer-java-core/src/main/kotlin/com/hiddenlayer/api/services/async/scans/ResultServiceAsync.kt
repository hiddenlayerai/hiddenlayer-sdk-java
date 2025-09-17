// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.scans.results.ResultSarifParams
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
