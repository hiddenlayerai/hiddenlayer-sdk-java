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
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepareAsync
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorUpdateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorServiceAsync {

    private val withRawResponse: SensorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync =
        SensorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorCreateResponse> =
        // post /api/v2/sensors/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorRetrieveResponse> =
        // get /api/v2/sensors/{sensor_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SensorUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorUpdateResponse> =
        // put /api/v2/sensors/{sensor_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SensorDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /api/v2/sensors/{sensor_id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun query(
        params: SensorQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorQueryResponse> =
        // post /api/v2/sensors/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorServiceAsync.WithRawResponse =
            SensorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SensorCreateResponse> =
            jsonHandler<SensorCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<SensorRetrieveResponse> =
            jsonHandler<SensorRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
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

        private val updateHandler: Handler<SensorUpdateResponse> =
            jsonHandler<SensorUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: SensorUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val queryHandler: Handler<SensorQueryResponse> =
            jsonHandler<SensorQueryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun query(
            params: SensorQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { queryHandler.handle(it) }
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
