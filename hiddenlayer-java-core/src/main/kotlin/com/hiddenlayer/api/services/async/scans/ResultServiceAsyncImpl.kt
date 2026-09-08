// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.handlers.errorBodyHandler
import com.hiddenlayer.api.core.handlers.errorHandler
import com.hiddenlayer.api.core.handlers.jsonHandler
import com.hiddenlayer.api.core.handlers.stringHandler
import com.hiddenlayer.api.core.http.HttpMethod
import com.hiddenlayer.api.core.http.HttpRequest
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponse.Handler
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.core.http.parseable
import com.hiddenlayer.api.core.prepareAsync
import com.hiddenlayer.api.models.scans.results.ResultListFilesPageAsync
import com.hiddenlayer.api.models.scans.results.ResultListFilesPageResponse
import com.hiddenlayer.api.models.scans.results.ResultListFilesParams
import com.hiddenlayer.api.models.scans.results.ResultRetrieveSummaryParams
import com.hiddenlayer.api.models.scans.results.ResultSarifParams
import com.hiddenlayer.api.models.scans.results.ScanReportSummary
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResultServiceAsync {

    private val withRawResponse: ResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResultServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResultServiceAsync =
        ResultServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listFiles(
        params: ResultListFilesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResultListFilesPageAsync> =
        // get /scan/v3/results/{scan_id}/files
        withRawResponse().listFiles(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSummary(
        params: ResultRetrieveSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanReportSummary> =
        // get /scan/v3/results/{scan_id}/summary
        withRawResponse().retrieveSummary(params, requestOptions).thenApply { it.parse() }

    override fun sarif(
        params: ResultSarifParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /scan/v3/results/{scan_id}/sarif
        withRawResponse().sarif(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResultServiceAsync.WithRawResponse =
            ResultServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listFilesHandler: Handler<ResultListFilesPageResponse> =
            jsonHandler<ResultListFilesPageResponse>(clientOptions.jsonMapper)

        override fun listFiles(
            params: ResultListFilesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResultListFilesPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "results", params._pathParam(0), "files")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listFilesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ResultListFilesPageAsync.builder()
                                    .service(ResultServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveSummaryHandler: Handler<ScanReportSummary> =
            jsonHandler<ScanReportSummary>(clientOptions.jsonMapper)

        override fun retrieveSummary(
            params: ResultRetrieveSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanReportSummary>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "results", params._pathParam(0), "summary")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSummaryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sarifHandler: Handler<String> = stringHandler()

        override fun sarif(
            params: ResultSarifParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "results", params._pathParam(0), "sarif")
                    .putHeader("Accept", "application/sarif+json")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sarifHandler.handle(it) }
                    }
                }
        }
    }
}
