// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.handlers.withErrorHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.jobs.ScanJob
import com.hiddenlayer_sdk.api.models.scans.results.ScanReport
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync =
        JobServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: JobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanJob> =
        // get /scan/v3/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun request(
        params: JobRequestParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ScanReport> =
        // post /scan/v3/jobs
        withRawResponse().request(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JobServiceAsync.WithRawResponse =
            JobServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ScanJob> =
            jsonHandler<ScanJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: JobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "jobs")
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

        private val requestHandler: Handler<ScanReport> =
            jsonHandler<ScanReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun request(
            params: JobRequestParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ScanReport>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scan", "v3", "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { requestHandler.handle(it) }
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
