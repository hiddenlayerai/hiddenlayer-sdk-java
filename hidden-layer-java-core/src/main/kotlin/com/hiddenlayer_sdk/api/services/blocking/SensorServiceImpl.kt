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
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepare
import com.hiddenlayer_sdk.api.models.sensors.Sensor
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams
import kotlin.jvm.optionals.getOrNull

class SensorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorService {

    private val withRawResponse: SensorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorService.WithRawResponse = withRawResponse

    override fun create(params: SensorCreateParams, requestOptions: RequestOptions): Sensor =
        // post /api/v2/sensors/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: SensorRetrieveParams, requestOptions: RequestOptions): Sensor =
        // get /api/v2/sensors/{sensor_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: SensorDeleteParams, requestOptions: RequestOptions) {
        // delete /api/v2/sensors/{sensor_id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun query(
        params: SensorQueryParams,
        requestOptions: RequestOptions,
    ): SensorQueryResponse =
        // post /api/v2/sensors/query
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SensorService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Sensor> =
            jsonHandler<Sensor>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Sensor> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "v2", "sensors", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Sensor> =
            jsonHandler<Sensor>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Sensor> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val queryHandler: Handler<SensorQueryResponse> =
            jsonHandler<SensorQueryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun query(
            params: SensorQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "v2", "sensors", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
