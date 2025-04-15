// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.handlers.emptyHandler
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.handlers.withErrorHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultListResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultPatchParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultPatchResponse
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultStartParams
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.concurrent.CompletableFuture

class ResultServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ResultServiceAsync {

    private val withRawResponse: ResultServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ResultServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ResultRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanReport> =
        // get /scan/v3/results/{scan_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ResultListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResultListResponse> =
        // get /scan/v3/results
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun patch(
        params: ResultPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResultPatchResponse> =
        // patch /scan/v3/results/{scan_id}
        withRawResponse().patch(params, requestOptions).thenApply { it.parse() }

    override fun start(
        params: ResultStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /scan/v3/results/{scan_id}
        withRawResponse().start(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ResultServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ScanReport> =
            jsonHandler<ScanReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ResultRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanReport>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("scan", "v3", "results", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ResultListResponse> =
            jsonHandler<ResultListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: ResultListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResultListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("scan", "v3", "results")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patchHandler: Handler<ResultPatchResponse> =
            jsonHandler<ResultPatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun patch(
            params: ResultPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResultPatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("scan", "v3", "results", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { patchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun start(
            params: ResultStartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("scan", "v3", "results", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { startHandler.handle(it) } }
                }
        }
    }
}
