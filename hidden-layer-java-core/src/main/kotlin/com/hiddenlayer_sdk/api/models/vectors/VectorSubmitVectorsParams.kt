// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.vectors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Submit vectors */
class VectorSubmitVectorsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputLayer(): String = body.inputLayer()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputLayerDtype(): String = body.inputLayerDtype()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputLayerShape(): List<Double> = body.inputLayerShape()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputLayer(): String = body.outputLayer()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputLayerDtype(): String = body.outputLayerDtype()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputLayerShape(): List<Double> = body.outputLayerShape()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sensorId(): String = body.sensorId()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventTime(): Optional<String> = body.eventTime()

    fun _metadata(): JsonValue = body._metadata()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun predictions(): Optional<List<Double>> = body.predictions()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requesterId(): Optional<String> = body.requesterId()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [inputLayer].
     *
     * Unlike [inputLayer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputLayer(): JsonField<String> = body._inputLayer()

    /**
     * Returns the raw JSON value of [inputLayerDtype].
     *
     * Unlike [inputLayerDtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputLayerDtype(): JsonField<String> = body._inputLayerDtype()

    /**
     * Returns the raw JSON value of [inputLayerShape].
     *
     * Unlike [inputLayerShape], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputLayerShape(): JsonField<List<Double>> = body._inputLayerShape()

    /**
     * Returns the raw JSON value of [outputLayer].
     *
     * Unlike [outputLayer], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _outputLayer(): JsonField<String> = body._outputLayer()

    /**
     * Returns the raw JSON value of [outputLayerDtype].
     *
     * Unlike [outputLayerDtype], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _outputLayerDtype(): JsonField<String> = body._outputLayerDtype()

    /**
     * Returns the raw JSON value of [outputLayerShape].
     *
     * Unlike [outputLayerShape], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _outputLayerShape(): JsonField<List<Double>> = body._outputLayerShape()

    /**
     * Returns the raw JSON value of [sensorId].
     *
     * Unlike [sensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sensorId(): JsonField<String> = body._sensorId()

    /**
     * Returns the raw JSON value of [eventTime].
     *
     * Unlike [eventTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _eventTime(): JsonField<String> = body._eventTime()

    /**
     * Returns the raw JSON value of [predictions].
     *
     * Unlike [predictions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _predictions(): JsonField<List<Double>> = body._predictions()

    /**
     * Returns the raw JSON value of [requesterId].
     *
     * Unlike [requesterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requesterId(): JsonField<String> = body._requesterId()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VectorSubmitVectorsParams].
         *
         * The following fields are required:
         * ```java
         * .inputLayer()
         * .inputLayerDtype()
         * .inputLayerShape()
         * .outputLayer()
         * .outputLayerDtype()
         * .outputLayerShape()
         * .sensorId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VectorSubmitVectorsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(vectorSubmitVectorsParams: VectorSubmitVectorsParams) = apply {
            body = vectorSubmitVectorsParams.body.toBuilder()
            additionalHeaders = vectorSubmitVectorsParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorSubmitVectorsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inputLayer]
         * - [inputLayerDtype]
         * - [inputLayerShape]
         * - [outputLayer]
         * - [outputLayerDtype]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun inputLayer(inputLayer: String) = apply { body.inputLayer(inputLayer) }

        /**
         * Sets [Builder.inputLayer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputLayer] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputLayer(inputLayer: JsonField<String>) = apply { body.inputLayer(inputLayer) }

        fun inputLayerDtype(inputLayerDtype: String) = apply {
            body.inputLayerDtype(inputLayerDtype)
        }

        /**
         * Sets [Builder.inputLayerDtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputLayerDtype] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputLayerDtype(inputLayerDtype: JsonField<String>) = apply {
            body.inputLayerDtype(inputLayerDtype)
        }

        fun inputLayerShape(inputLayerShape: List<Double>) = apply {
            body.inputLayerShape(inputLayerShape)
        }

        /**
         * Sets [Builder.inputLayerShape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputLayerShape] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputLayerShape(inputLayerShape: JsonField<List<Double>>) = apply {
            body.inputLayerShape(inputLayerShape)
        }

        /**
         * Adds a single [Double] to [Builder.inputLayerShape].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputLayerShape(inputLayerShape: Double) = apply {
            body.addInputLayerShape(inputLayerShape)
        }

        fun outputLayer(outputLayer: String) = apply { body.outputLayer(outputLayer) }

        /**
         * Sets [Builder.outputLayer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputLayer] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun outputLayer(outputLayer: JsonField<String>) = apply { body.outputLayer(outputLayer) }

        fun outputLayerDtype(outputLayerDtype: String) = apply {
            body.outputLayerDtype(outputLayerDtype)
        }

        /**
         * Sets [Builder.outputLayerDtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputLayerDtype] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputLayerDtype(outputLayerDtype: JsonField<String>) = apply {
            body.outputLayerDtype(outputLayerDtype)
        }

        fun outputLayerShape(outputLayerShape: List<Double>) = apply {
            body.outputLayerShape(outputLayerShape)
        }

        /**
         * Sets [Builder.outputLayerShape] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputLayerShape] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputLayerShape(outputLayerShape: JsonField<List<Double>>) = apply {
            body.outputLayerShape(outputLayerShape)
        }

        /**
         * Adds a single [Double] to [Builder.outputLayerShape].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputLayerShape(outputLayerShape: Double) = apply {
            body.addOutputLayerShape(outputLayerShape)
        }

        fun sensorId(sensorId: String) = apply { body.sensorId(sensorId) }

        /**
         * Sets [Builder.sensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sensorId(sensorId: JsonField<String>) = apply { body.sensorId(sensorId) }

        fun eventTime(eventTime: String) = apply { body.eventTime(eventTime) }

        /**
         * Sets [Builder.eventTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTime(eventTime: JsonField<String>) = apply { body.eventTime(eventTime) }

        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

        fun predictions(predictions: List<Double>) = apply { body.predictions(predictions) }

        /**
         * Sets [Builder.predictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.predictions] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun predictions(predictions: JsonField<List<Double>>) = apply {
            body.predictions(predictions)
        }

        /**
         * Adds a single [Double] to [predictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPrediction(prediction: Double) = apply { body.addPrediction(prediction) }

        fun requesterId(requesterId: String) = apply { body.requesterId(requesterId) }

        /**
         * Sets [Builder.requesterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requesterId(requesterId: JsonField<String>) = apply { body.requesterId(requesterId) }

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [VectorSubmitVectorsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputLayer()
         * .inputLayerDtype()
         * .inputLayerShape()
         * .outputLayer()
         * .outputLayerDtype()
         * .outputLayerShape()
         * .sensorId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorSubmitVectorsParams =
            VectorSubmitVectorsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val inputLayer: JsonField<String>,
        private val inputLayerDtype: JsonField<String>,
        private val inputLayerShape: JsonField<List<Double>>,
        private val outputLayer: JsonField<String>,
        private val outputLayerDtype: JsonField<String>,
        private val outputLayerShape: JsonField<List<Double>>,
        private val sensorId: JsonField<String>,
        private val eventTime: JsonField<String>,
        private val metadata: JsonValue,
        private val predictions: JsonField<List<Double>>,
        private val requesterId: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input_layer")
            @ExcludeMissing
            inputLayer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_layer_dtype")
            @ExcludeMissing
            inputLayerDtype: JsonField<String> = JsonMissing.of(),
            @JsonProperty("input_layer_shape")
            @ExcludeMissing
            inputLayerShape: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("output_layer")
            @ExcludeMissing
            outputLayer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_layer_dtype")
            @ExcludeMissing
            outputLayerDtype: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output_layer_shape")
            @ExcludeMissing
            outputLayerShape: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("sensor_id")
            @ExcludeMissing
            sensorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("event_time")
            @ExcludeMissing
            eventTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("predictions")
            @ExcludeMissing
            predictions: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("requester_id")
            @ExcludeMissing
            requesterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            inputLayer,
            inputLayerDtype,
            inputLayerShape,
            outputLayer,
            outputLayerDtype,
            outputLayerShape,
            sensorId,
            eventTime,
            metadata,
            predictions,
            requesterId,
            tags,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputLayer(): String = inputLayer.getRequired("input_layer")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputLayerDtype(): String = inputLayerDtype.getRequired("input_layer_dtype")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputLayerShape(): List<Double> = inputLayerShape.getRequired("input_layer_shape")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outputLayer(): String = outputLayer.getRequired("output_layer")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outputLayerDtype(): String = outputLayerDtype.getRequired("output_layer_dtype")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun outputLayerShape(): List<Double> = outputLayerShape.getRequired("output_layer_shape")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sensorId(): String = sensorId.getRequired("sensor_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun eventTime(): Optional<String> = eventTime.getOptional("event_time")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun predictions(): Optional<List<Double>> = predictions.getOptional("predictions")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requesterId(): Optional<String> = requesterId.getOptional("requester_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [inputLayer].
         *
         * Unlike [inputLayer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_layer")
        @ExcludeMissing
        fun _inputLayer(): JsonField<String> = inputLayer

        /**
         * Returns the raw JSON value of [inputLayerDtype].
         *
         * Unlike [inputLayerDtype], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_layer_dtype")
        @ExcludeMissing
        fun _inputLayerDtype(): JsonField<String> = inputLayerDtype

        /**
         * Returns the raw JSON value of [inputLayerShape].
         *
         * Unlike [inputLayerShape], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_layer_shape")
        @ExcludeMissing
        fun _inputLayerShape(): JsonField<List<Double>> = inputLayerShape

        /**
         * Returns the raw JSON value of [outputLayer].
         *
         * Unlike [outputLayer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_layer")
        @ExcludeMissing
        fun _outputLayer(): JsonField<String> = outputLayer

        /**
         * Returns the raw JSON value of [outputLayerDtype].
         *
         * Unlike [outputLayerDtype], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_layer_dtype")
        @ExcludeMissing
        fun _outputLayerDtype(): JsonField<String> = outputLayerDtype

        /**
         * Returns the raw JSON value of [outputLayerShape].
         *
         * Unlike [outputLayerShape], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_layer_shape")
        @ExcludeMissing
        fun _outputLayerShape(): JsonField<List<Double>> = outputLayerShape

        /**
         * Returns the raw JSON value of [sensorId].
         *
         * Unlike [sensorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensor_id") @ExcludeMissing fun _sensorId(): JsonField<String> = sensorId

        /**
         * Returns the raw JSON value of [eventTime].
         *
         * Unlike [eventTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_time") @ExcludeMissing fun _eventTime(): JsonField<String> = eventTime

        /**
         * Returns the raw JSON value of [predictions].
         *
         * Unlike [predictions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("predictions")
        @ExcludeMissing
        fun _predictions(): JsonField<List<Double>> = predictions

        /**
         * Returns the raw JSON value of [requesterId].
         *
         * Unlike [requesterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requester_id")
        @ExcludeMissing
        fun _requesterId(): JsonField<String> = requesterId

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .inputLayer()
             * .inputLayerDtype()
             * .inputLayerShape()
             * .outputLayer()
             * .outputLayerDtype()
             * .outputLayerShape()
             * .sensorId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inputLayer: JsonField<String>? = null
            private var inputLayerDtype: JsonField<String>? = null
            private var inputLayerShape: JsonField<MutableList<Double>>? = null
            private var outputLayer: JsonField<String>? = null
            private var outputLayerDtype: JsonField<String>? = null
            private var outputLayerShape: JsonField<MutableList<Double>>? = null
            private var sensorId: JsonField<String>? = null
            private var eventTime: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var predictions: JsonField<MutableList<Double>>? = null
            private var requesterId: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inputLayer = body.inputLayer
                inputLayerDtype = body.inputLayerDtype
                inputLayerShape = body.inputLayerShape.map { it.toMutableList() }
                outputLayer = body.outputLayer
                outputLayerDtype = body.outputLayerDtype
                outputLayerShape = body.outputLayerShape.map { it.toMutableList() }
                sensorId = body.sensorId
                eventTime = body.eventTime
                metadata = body.metadata
                predictions = body.predictions.map { it.toMutableList() }
                requesterId = body.requesterId
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun inputLayer(inputLayer: String) = inputLayer(JsonField.of(inputLayer))

            /**
             * Sets [Builder.inputLayer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputLayer] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputLayer(inputLayer: JsonField<String>) = apply { this.inputLayer = inputLayer }

            fun inputLayerDtype(inputLayerDtype: String) =
                inputLayerDtype(JsonField.of(inputLayerDtype))

            /**
             * Sets [Builder.inputLayerDtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputLayerDtype] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputLayerDtype(inputLayerDtype: JsonField<String>) = apply {
                this.inputLayerDtype = inputLayerDtype
            }

            fun inputLayerShape(inputLayerShape: List<Double>) =
                inputLayerShape(JsonField.of(inputLayerShape))

            /**
             * Sets [Builder.inputLayerShape] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputLayerShape] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputLayerShape(inputLayerShape: JsonField<List<Double>>) = apply {
                this.inputLayerShape = inputLayerShape.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.inputLayerShape].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInputLayerShape(inputLayerShape: Double) = apply {
                this.inputLayerShape =
                    (this.inputLayerShape ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inputLayerShape", it).add(inputLayerShape)
                    }
            }

            fun outputLayer(outputLayer: String) = outputLayer(JsonField.of(outputLayer))

            /**
             * Sets [Builder.outputLayer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputLayer] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputLayer(outputLayer: JsonField<String>) = apply {
                this.outputLayer = outputLayer
            }

            fun outputLayerDtype(outputLayerDtype: String) =
                outputLayerDtype(JsonField.of(outputLayerDtype))

            /**
             * Sets [Builder.outputLayerDtype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputLayerDtype] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputLayerDtype(outputLayerDtype: JsonField<String>) = apply {
                this.outputLayerDtype = outputLayerDtype
            }

            fun outputLayerShape(outputLayerShape: List<Double>) =
                outputLayerShape(JsonField.of(outputLayerShape))

            /**
             * Sets [Builder.outputLayerShape] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputLayerShape] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputLayerShape(outputLayerShape: JsonField<List<Double>>) = apply {
                this.outputLayerShape = outputLayerShape.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.outputLayerShape].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOutputLayerShape(outputLayerShape: Double) = apply {
                this.outputLayerShape =
                    (this.outputLayerShape ?: JsonField.of(mutableListOf())).also {
                        checkKnown("outputLayerShape", it).add(outputLayerShape)
                    }
            }

            fun sensorId(sensorId: String) = sensorId(JsonField.of(sensorId))

            /**
             * Sets [Builder.sensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensorId(sensorId: JsonField<String>) = apply { this.sensorId = sensorId }

            fun eventTime(eventTime: String) = eventTime(JsonField.of(eventTime))

            /**
             * Sets [Builder.eventTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventTime] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventTime(eventTime: JsonField<String>) = apply { this.eventTime = eventTime }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun predictions(predictions: List<Double>) = predictions(JsonField.of(predictions))

            /**
             * Sets [Builder.predictions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.predictions] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun predictions(predictions: JsonField<List<Double>>) = apply {
                this.predictions = predictions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [predictions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPrediction(prediction: Double) = apply {
                predictions =
                    (predictions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("predictions", it).add(prediction)
                    }
            }

            fun requesterId(requesterId: String) = requesterId(JsonField.of(requesterId))

            /**
             * Sets [Builder.requesterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requesterId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requesterId(requesterId: JsonField<String>) = apply {
                this.requesterId = requesterId
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .inputLayer()
             * .inputLayerDtype()
             * .inputLayerShape()
             * .outputLayer()
             * .outputLayerDtype()
             * .outputLayerShape()
             * .sensorId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("inputLayer", inputLayer),
                    checkRequired("inputLayerDtype", inputLayerDtype),
                    checkRequired("inputLayerShape", inputLayerShape).map { it.toImmutable() },
                    checkRequired("outputLayer", outputLayer),
                    checkRequired("outputLayerDtype", outputLayerDtype),
                    checkRequired("outputLayerShape", outputLayerShape).map { it.toImmutable() },
                    checkRequired("sensorId", sensorId),
                    eventTime,
                    metadata,
                    (predictions ?: JsonMissing.of()).map { it.toImmutable() },
                    requesterId,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inputLayer()
            inputLayerDtype()
            inputLayerShape()
            outputLayer()
            outputLayerDtype()
            outputLayerShape()
            sensorId()
            eventTime()
            predictions()
            requesterId()
            tags()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: HiddenLayerInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (inputLayer.asKnown().isPresent) 1 else 0) +
                (if (inputLayerDtype.asKnown().isPresent) 1 else 0) +
                (inputLayerShape.asKnown().getOrNull()?.size ?: 0) +
                (if (outputLayer.asKnown().isPresent) 1 else 0) +
                (if (outputLayerDtype.asKnown().isPresent) 1 else 0) +
                (outputLayerShape.asKnown().getOrNull()?.size ?: 0) +
                (if (sensorId.asKnown().isPresent) 1 else 0) +
                (if (eventTime.asKnown().isPresent) 1 else 0) +
                (predictions.asKnown().getOrNull()?.size ?: 0) +
                (if (requesterId.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && inputLayer == other.inputLayer && inputLayerDtype == other.inputLayerDtype && inputLayerShape == other.inputLayerShape && outputLayer == other.outputLayer && outputLayerDtype == other.outputLayerDtype && outputLayerShape == other.outputLayerShape && sensorId == other.sensorId && eventTime == other.eventTime && metadata == other.metadata && predictions == other.predictions && requesterId == other.requesterId && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputLayer, inputLayerDtype, inputLayerShape, outputLayer, outputLayerDtype, outputLayerShape, sensorId, eventTime, metadata, predictions, requesterId, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inputLayer=$inputLayer, inputLayerDtype=$inputLayerDtype, inputLayerShape=$inputLayerShape, outputLayer=$outputLayer, outputLayerDtype=$outputLayerDtype, outputLayerShape=$outputLayerShape, sensorId=$sensorId, eventTime=$eventTime, metadata=$metadata, predictions=$predictions, requesterId=$requesterId, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorSubmitVectorsParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorSubmitVectorsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
