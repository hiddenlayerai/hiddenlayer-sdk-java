// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.core.ClientOptions
import com.hiddenlayer.api.core.RequestOptions
import com.hiddenlayer.api.core.http.HttpResponse
import com.hiddenlayer.api.core.http.HttpResponseFor
import com.hiddenlayer.api.models.sensors.SensorCreateParams
import com.hiddenlayer.api.models.sensors.SensorCreateResponse
import com.hiddenlayer.api.models.sensors.SensorDeleteParams
import com.hiddenlayer.api.models.sensors.SensorQueryParams
import com.hiddenlayer.api.models.sensors.SensorQueryResponse
import com.hiddenlayer.api.models.sensors.SensorRetrieveParams
import com.hiddenlayer.api.models.sensors.SensorRetrieveResponse
import com.hiddenlayer.api.models.sensors.SensorUpdateParams
import com.hiddenlayer.api.models.sensors.SensorUpdateResponse
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

    /** @see create */
    fun create(
        params: SensorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorCreateResponse>

    /** Get Sensor */
    fun retrieve(sensorId: String): CompletableFuture<SensorRetrieveResponse> =
        retrieve(sensorId, SensorRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sensorId: String,
        params: SensorRetrieveParams = SensorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorRetrieveResponse> =
        retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sensorId: String,
        params: SensorRetrieveParams = SensorRetrieveParams.none(),
    ): CompletableFuture<SensorRetrieveResponse> = retrieve(sensorId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SensorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: SensorRetrieveParams): CompletableFuture<SensorRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sensorId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorRetrieveResponse> =
        retrieve(sensorId, SensorRetrieveParams.none(), requestOptions)

    /** Update Sensor */
    fun update(sensorId: String): CompletableFuture<SensorUpdateResponse> =
        update(sensorId, SensorUpdateParams.none())

    /** @see update */
    fun update(
        sensorId: String,
        params: SensorUpdateParams = SensorUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorUpdateResponse> =
        update(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see update */
    fun update(
        sensorId: String,
        params: SensorUpdateParams = SensorUpdateParams.none(),
    ): CompletableFuture<SensorUpdateResponse> = update(sensorId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SensorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorUpdateResponse>

    /** @see update */
    fun update(params: SensorUpdateParams): CompletableFuture<SensorUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        sensorId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SensorUpdateResponse> =
        update(sensorId, SensorUpdateParams.none(), requestOptions)

    /** Remove an Adhoc Sensor */
    fun delete(sensorId: String): CompletableFuture<Void?> =
        delete(sensorId, SensorDeleteParams.none())

    /** @see delete */
    fun delete(
        sensorId: String,
        params: SensorDeleteParams = SensorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sensorId: String,
        params: SensorDeleteParams = SensorDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(sensorId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SensorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SensorDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sensorId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(sensorId, SensorDeleteParams.none(), requestOptions)

    /** Query Sensors */
    fun query(): CompletableFuture<SensorQueryResponse> = query(SensorQueryParams.none())

    /** @see query */
    fun query(
        params: SensorQueryParams = SensorQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SensorQueryResponse>

    /** @see query */
    fun query(
        params: SensorQueryParams = SensorQueryParams.none()
    ): CompletableFuture<SensorQueryResponse> = query(params, RequestOptions.none())

    /** @see query */
    fun query(requestOptions: RequestOptions): CompletableFuture<SensorQueryResponse> =
        query(SensorQueryParams.none(), requestOptions)

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

        /** @see create */
        fun create(
            params: SensorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/sensors/{sensor_id}`, but is otherwise the
         * same as [SensorServiceAsync.retrieve].
         */
        fun retrieve(sensorId: String): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(sensorId, SensorRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams = SensorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sensorId: String,
            params: SensorRetrieveParams = SensorRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(sensorId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SensorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: SensorRetrieveParams
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sensorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorRetrieveResponse>> =
            retrieve(sensorId, SensorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /api/v2/sensors/{sensor_id}`, but is otherwise the
         * same as [SensorServiceAsync.update].
         */
        fun update(sensorId: String): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> =
            update(sensorId, SensorUpdateParams.none())

        /** @see update */
        fun update(
            sensorId: String,
            params: SensorUpdateParams = SensorUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> =
            update(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see update */
        fun update(
            sensorId: String,
            params: SensorUpdateParams = SensorUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> =
            update(sensorId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SensorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>>

        /** @see update */
        fun update(
            params: SensorUpdateParams
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            sensorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SensorUpdateResponse>> =
            update(sensorId, SensorUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v2/sensors/{sensor_id}`, but is otherwise
         * the same as [SensorServiceAsync.delete].
         */
        fun delete(sensorId: String): CompletableFuture<HttpResponse> =
            delete(sensorId, SensorDeleteParams.none())

        /** @see delete */
        fun delete(
            sensorId: String,
            params: SensorDeleteParams = SensorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sensorId(sensorId).build(), requestOptions)

        /** @see delete */
        fun delete(
            sensorId: String,
            params: SensorDeleteParams = SensorDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(sensorId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SensorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SensorDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sensorId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(sensorId, SensorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/sensors/query`, but is otherwise the same
         * as [SensorServiceAsync.query].
         */
        fun query(): CompletableFuture<HttpResponseFor<SensorQueryResponse>> =
            query(SensorQueryParams.none())

        /** @see query */
        fun query(
            params: SensorQueryParams = SensorQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>>

        /** @see query */
        fun query(
            params: SensorQueryParams = SensorQueryParams.none()
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>> =
            query(params, RequestOptions.none())

        /** @see query */
        fun query(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SensorQueryResponse>> =
            query(SensorQueryParams.none(), requestOptions)
    }
}
