// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.handlers.emptyHandler
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.handlers.withErrorHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.scans.ScanCheckHealthParams
import com.hiddenlayer_sdk.api.models.scans.ScanCheckReadinessParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsResponse
import com.hiddenlayer_sdk.api.services.async.scans.JobServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.JobServiceAsyncImpl
import com.hiddenlayer_sdk.api.services.async.scans.ResultServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.ResultServiceAsyncImpl
import com.hiddenlayer_sdk.api.services.async.scans.UploadServiceAsync
import com.hiddenlayer_sdk.api.services.async.scans.UploadServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ScanServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScanServiceAsync {

    private val withRawResponse: ScanServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val results: ResultServiceAsync by lazy { ResultServiceAsyncImpl(clientOptions) }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val upload: UploadServiceAsync by lazy { UploadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ScanServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ScanServiceAsync =
        ScanServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun results(): ResultServiceAsync = results

    override fun jobs(): JobServiceAsync = jobs

    override fun upload(): UploadServiceAsync = upload

    override fun checkHealth(
        params: ScanCheckHealthParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /scans/v3/health
        withRawResponse().checkHealth(params, requestOptions).thenAccept {}

    override fun checkReadiness(
        params: ScanCheckReadinessParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /scans/v3/readiness
        withRawResponse().checkReadiness(params, requestOptions).thenAccept {}

    override fun retrieveResults(
        params: ScanRetrieveResultsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanRetrieveResultsResponse> =
        // get /scans/v3/results/{scan_id}
        withRawResponse().retrieveResults(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScanServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val results: ResultServiceAsync.WithRawResponse by lazy {
            ResultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val upload: UploadServiceAsync.WithRawResponse by lazy {
            UploadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ScanServiceAsync.WithRawResponse =
            ScanServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun results(): ResultServiceAsync.WithRawResponse = results

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        override fun upload(): UploadServiceAsync.WithRawResponse = upload

        private val checkHealthHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun checkHealth(
            params: ScanCheckHealthParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scans", "v3", "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { checkHealthHandler.handle(it) } }
                }
        }

        private val checkReadinessHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun checkReadiness(
            params: ScanCheckReadinessParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scans", "v3", "readiness")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { checkReadinessHandler.handle(it) } }
                }
        }

        private val retrieveResultsHandler: Handler<ScanRetrieveResultsResponse> =
            jsonHandler<ScanRetrieveResultsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveResults(
            params: ScanRetrieveResultsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanRetrieveResultsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scans", "v3", "results", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveResultsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
