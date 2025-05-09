// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

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
import com.hiddenlayer_sdk.api.core.prepare
import com.hiddenlayer_sdk.api.models.scans.ScanCheckHealthParams
import com.hiddenlayer_sdk.api.models.scans.ScanCheckReadinessParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsParams
import com.hiddenlayer_sdk.api.models.scans.ScanRetrieveResultsResponse
import com.hiddenlayer_sdk.api.services.blocking.scans.JobService
import com.hiddenlayer_sdk.api.services.blocking.scans.JobServiceImpl
import com.hiddenlayer_sdk.api.services.blocking.scans.ResultService
import com.hiddenlayer_sdk.api.services.blocking.scans.ResultServiceImpl
import com.hiddenlayer_sdk.api.services.blocking.scans.UploadService
import com.hiddenlayer_sdk.api.services.blocking.scans.UploadServiceImpl
import kotlin.jvm.optionals.getOrNull

class ScanServiceImpl internal constructor(private val clientOptions: ClientOptions) : ScanService {

    private val withRawResponse: ScanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val results: ResultService by lazy { ResultServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val upload: UploadService by lazy { UploadServiceImpl(clientOptions) }

    override fun withRawResponse(): ScanService.WithRawResponse = withRawResponse

    override fun results(): ResultService = results

    override fun jobs(): JobService = jobs

    override fun upload(): UploadService = upload

    override fun checkHealth(params: ScanCheckHealthParams, requestOptions: RequestOptions) {
        // get /scans/v3/health
        withRawResponse().checkHealth(params, requestOptions)
    }

    override fun checkReadiness(params: ScanCheckReadinessParams, requestOptions: RequestOptions) {
        // get /scans/v3/readiness
        withRawResponse().checkReadiness(params, requestOptions)
    }

    override fun retrieveResults(
        params: ScanRetrieveResultsParams,
        requestOptions: RequestOptions,
    ): ScanRetrieveResultsResponse =
        // get /scans/v3/results/{scan_id}
        withRawResponse().retrieveResults(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScanService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val results: ResultService.WithRawResponse by lazy {
            ResultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val upload: UploadService.WithRawResponse by lazy {
            UploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun results(): ResultService.WithRawResponse = results

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun upload(): UploadService.WithRawResponse = upload

        private val checkHealthHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun checkHealth(
            params: ScanCheckHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("scans", "v3", "health")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { checkHealthHandler.handle(it) } }
        }

        private val checkReadinessHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun checkReadiness(
            params: ScanCheckReadinessParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("scans", "v3", "readiness")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { checkReadinessHandler.handle(it) } }
        }

        private val retrieveResultsHandler: Handler<ScanRetrieveResultsResponse> =
            jsonHandler<ScanRetrieveResultsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveResults(
            params: ScanRetrieveResultsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScanRetrieveResultsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scanId", params.scanId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("scans", "v3", "results", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
