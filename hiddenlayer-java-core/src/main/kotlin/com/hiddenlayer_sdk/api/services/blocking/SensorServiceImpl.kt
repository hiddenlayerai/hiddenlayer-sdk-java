// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.handlers.emptyHandler
import com.hiddenlayer_sdk.api.core.handlers.errorBodyHandler
import com.hiddenlayer_sdk.api.core.handlers.errorHandler
import com.hiddenlayer_sdk.api.core.handlers.jsonHandler
import com.hiddenlayer_sdk.api.core.http.HttpMethod
import com.hiddenlayer_sdk.api.core.http.HttpRequest
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponse.Handler
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.core.http.json
import com.hiddenlayer_sdk.api.core.http.parseable
import com.hiddenlayer_sdk.api.core.prepare
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorUpdateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SensorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SensorService {

    private val withRawResponse: SensorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SensorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService =
        SensorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions,
    ): SensorCreateResponse =
        // post /api/v2/sensors/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions,
    ): SensorRetrieveResponse =
        // get /api/v2/sensors/{sensor_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SensorUpdateParams,
        requestOptions: RequestOptions,
    ): SensorUpdateResponse =
        // put /api/v2/sensors/{sensor_id}
        withRawResponse().update(params, requestOptions).parse()

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

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorService.WithRawResponse =
            SensorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SensorCreateResponse> =
            jsonHandler<SensorCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<SensorRetrieveResponse> =
            jsonHandler<SensorRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sensorId", params.sensorId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<SensorUpdateResponse> =
            jsonHandler<SensorUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SensorUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

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
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val queryHandler: Handler<SensorQueryResponse> =
            jsonHandler<SensorQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: SensorQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SensorQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v2", "sensors", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
