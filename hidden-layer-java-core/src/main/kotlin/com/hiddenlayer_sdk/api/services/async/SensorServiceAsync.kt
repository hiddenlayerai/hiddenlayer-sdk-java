// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SensorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SensorServiceAsync

    /** Create Sensor Record */
    fun create(params: SensorCreateParams): CompletableFuture<SensorCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorCreateResponse>

    /** Get Sensor */
    fun retrieve(
        sensorId: String,
        params: SensorRetrieveParams,
    ): CompletableFuture<SensorRetrieveResponse> = retrieve(sensorId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        sensorId: String,
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorRetrieveResponse> =
        retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: SensorRetrieveParams): CompletableFuture<SensorRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorRetrieveResponse>

    /** Remove an Adhoc Sensor */
    fun delete(sensorId: String, params: SensorDeleteParams): CompletableFuture<Void?> =
        delete(sensorId, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        sensorId: String,
        params: SensorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: SensorDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: SensorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Query Sensors */
    fun query(params: SensorQueryParams): CompletableFuture<SensorQueryResponse> =
        query(params, RequestOptions.none())

    /** @see [query] */
    fun query(
        params: SensorQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorQueryResponse>

    /**
     * A view of [SensorServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SensorServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/create`, but is otherwise the same
         * as [SensorServiceAsync.create].
         */
        fun create(
            params: SensorCreateParams
        ): CompletableFuture<HttpResponseFor<SensorCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/sensors/{sensor_id}`, but is otherwise the
         * same as [SensorServiceAsync.retrieve].
         */
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams,
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(sensorId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: SensorRetrieveParams
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v2/sensors/{sensor_id}`, but is otherwise
         * the same as [SensorServiceAsync.delete].
         */
        fun delete(sensorId: String, params: SensorDeleteParams): CompletableFuture<HttpResponse> =
            delete(sensorId, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            sensorId: String,
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see [delete] */
        fun delete(params: SensorDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/query`, but is otherwise the same
         * as [SensorServiceAsync.query].
         */
        fun query(
            params: SensorQueryParams
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see [query] */
        fun query(
            params: SensorQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>>
    }
}
