// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.ClientOptions
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveResponse
import java.util.function.Consumer

interface SensorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService

    /** Create Sensor Record */
    fun create(params: SensorCreateParams): SensorCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorCreateResponse

    /** Get Sensor */
    fun retrieve(sensorId: String, params: SensorRetrieveParams): SensorRetrieveResponse =
        retrieve(sensorId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        sensorId: String,
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorRetrieveResponse =
        retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: SensorRetrieveParams): SensorRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorRetrieveResponse

    /** Remove an Adhoc Sensor */
    fun delete(sensorId: String, params: SensorDeleteParams) =
        delete(sensorId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        sensorId: String,
        params: SensorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: SensorDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: SensorDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Query Sensors */
    fun query(params: SensorQueryParams): SensorQueryResponse = query(params, RequestOptions.none())

    /** @see [query] */
    fun query(
        params: SensorQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorQueryResponse

    /** A view of [SensorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/create`, but is otherwise the same
         * as [SensorService.create].
         */
        @MustBeClosed
        fun create(params: SensorCreateParams): HttpResponseFor<SensorCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/sensors/{sensor_id}`, but is otherwise the
         * same as [SensorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams,
        ): HttpResponseFor<SensorRetrieveResponse> =
            retrieve(sensorId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorRetrieveResponse> =
            retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: SensorRetrieveParams): HttpResponseFor<SensorRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorRetrieveResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v2/sensors/{sensor_id}`, but is otherwise
         * the same as [SensorService.delete].
         */
        @MustBeClosed
        fun delete(sensorId: String, params: SensorDeleteParams): HttpResponse =
            delete(sensorId, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            sensorId: String,
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: SensorDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/query`, but is otherwise the same
         * as [SensorService.query].
         */
        @MustBeClosed
        fun query(params: SensorQueryParams): HttpResponseFor<SensorQueryResponse> =
            query(params, RequestOptions.none())

        /** @see [query] */
        @MustBeClosed
        fun query(
            params: SensorQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorQueryResponse>
    }
}
