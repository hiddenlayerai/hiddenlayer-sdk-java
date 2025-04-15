// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hiddenlayer_sdk.api.core.RequestOptions
import com.hiddenlayer_sdk.api.core.http.HttpResponse
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor
import com.hiddenlayer_sdk.api.models.sensors.Sensor
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import com.hiddenlayer_sdk.api.models.sensors.SensorDeleteParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryParams
import com.hiddenlayer_sdk.api.models.sensors.SensorQueryResponse
import com.hiddenlayer_sdk.api.models.sensors.SensorRetrieveParams

interface SensorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Sensor */
    fun create(params: SensorCreateParams): Sensor = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sensor

    /** Get Sensor */
    fun retrieve(params: SensorRetrieveParams): Sensor = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Sensor

    /** Delete Sensor */
    fun delete(params: SensorDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: SensorDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Query a Sensor */
    fun query(): SensorQueryResponse = query(SensorQueryParams.none())

    /** @see [query] */
    fun query(
        params: SensorQueryParams = SensorQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SensorQueryResponse

    /** @see [query] */
    fun query(params: SensorQueryParams = SensorQueryParams.none()): SensorQueryResponse =
        query(params, RequestOptions.none())

    /** @see [query] */
    fun query(requestOptions: RequestOptions): SensorQueryResponse =
        query(SensorQueryParams.none(), requestOptions)

    /** A view of [SensorService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/create`, but is otherwise the same
         * as [SensorService.create].
         */
        @MustBeClosed
        fun create(params: SensorCreateParams): HttpResponseFor<Sensor> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sensor>

        /**
         * Returns a raw HTTP response for `get /api/v2/sensors/{sensor_id}`, but is otherwise the
         * same as [SensorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: SensorRetrieveParams): HttpResponseFor<Sensor> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Sensor>

        /**
         * Returns a raw HTTP response for `delete /api/v2/sensors/{sensor_id}`, but is otherwise
         * the same as [SensorService.delete].
         */
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
        fun query(): HttpResponseFor<SensorQueryResponse> = query(SensorQueryParams.none())

        /** @see [query] */
        @MustBeClosed
        fun query(
            params: SensorQueryParams = SensorQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SensorQueryResponse>

        /** @see [query] */
        @MustBeClosed
        fun query(
            params: SensorQueryParams = SensorQueryParams.none()
        ): HttpResponseFor<SensorQueryResponse> = query(params, RequestOptions.none())

        /** @see [query] */
        @MustBeClosed
        fun query(requestOptions: RequestOptions): HttpResponseFor<SensorQueryResponse> =
            query(SensorQueryParams.none(), requestOptions)
    }
}
