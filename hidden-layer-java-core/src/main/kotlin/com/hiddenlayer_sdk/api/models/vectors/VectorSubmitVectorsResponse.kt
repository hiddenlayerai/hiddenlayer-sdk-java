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
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects

class VectorSubmitVectorsResponse
private constructor(
    private val eventTime: JsonField<String>,
    private val groupId: JsonField<String>,
    private val requesterId: JsonField<String>,
    private val sensorId: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_time") @ExcludeMissing eventTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_id") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requester_id")
        @ExcludeMissing
        requesterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sensor_id") @ExcludeMissing sensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(eventTime, groupId, requesterId, sensorId, tenantId, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTime(): String = eventTime.getRequired("event_time")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupId(): String = groupId.getRequired("group_id")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requesterId(): String = requesterId.getRequired("requester_id")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sensorId(): String = sensorId.getRequired("sensor_id")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * Returns the raw JSON value of [eventTime].
     *
     * Unlike [eventTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_time") @ExcludeMissing fun _eventTime(): JsonField<String> = eventTime

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("group_id") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

    /**
     * Returns the raw JSON value of [requesterId].
     *
     * Unlike [requesterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requester_id")
    @ExcludeMissing
    fun _requesterId(): JsonField<String> = requesterId

    /**
     * Returns the raw JSON value of [sensorId].
     *
     * Unlike [sensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sensor_id") @ExcludeMissing fun _sensorId(): JsonField<String> = sensorId

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [VectorSubmitVectorsResponse].
         *
         * The following fields are required:
         * ```java
         * .eventTime()
         * .groupId()
         * .requesterId()
         * .sensorId()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VectorSubmitVectorsResponse]. */
    class Builder internal constructor() {

        private var eventTime: JsonField<String>? = null
        private var groupId: JsonField<String>? = null
        private var requesterId: JsonField<String>? = null
        private var sensorId: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vectorSubmitVectorsResponse: VectorSubmitVectorsResponse) = apply {
            eventTime = vectorSubmitVectorsResponse.eventTime
            groupId = vectorSubmitVectorsResponse.groupId
            requesterId = vectorSubmitVectorsResponse.requesterId
            sensorId = vectorSubmitVectorsResponse.sensorId
            tenantId = vectorSubmitVectorsResponse.tenantId
            additionalProperties = vectorSubmitVectorsResponse.additionalProperties.toMutableMap()
        }

        fun eventTime(eventTime: String) = eventTime(JsonField.of(eventTime))

        /**
         * Sets [Builder.eventTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTime] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventTime(eventTime: JsonField<String>) = apply { this.eventTime = eventTime }

        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        fun requesterId(requesterId: String) = requesterId(JsonField.of(requesterId))

        /**
         * Sets [Builder.requesterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requesterId(requesterId: JsonField<String>) = apply { this.requesterId = requesterId }

        fun sensorId(sensorId: String) = sensorId(JsonField.of(sensorId))

        /**
         * Sets [Builder.sensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sensorId(sensorId: JsonField<String>) = apply { this.sensorId = sensorId }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [VectorSubmitVectorsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventTime()
         * .groupId()
         * .requesterId()
         * .sensorId()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorSubmitVectorsResponse =
            VectorSubmitVectorsResponse(
                checkRequired("eventTime", eventTime),
                checkRequired("groupId", groupId),
                checkRequired("requesterId", requesterId),
                checkRequired("sensorId", sensorId),
                checkRequired("tenantId", tenantId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VectorSubmitVectorsResponse = apply {
        if (validated) {
            return@apply
        }

        eventTime()
        groupId()
        requesterId()
        sensorId()
        tenantId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (eventTime.asKnown().isPresent) 1 else 0) +
            (if (groupId.asKnown().isPresent) 1 else 0) +
            (if (requesterId.asKnown().isPresent) 1 else 0) +
            (if (sensorId.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorSubmitVectorsResponse && eventTime == other.eventTime && groupId == other.groupId && requesterId == other.requesterId && sensorId == other.sensorId && tenantId == other.tenantId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(eventTime, groupId, requesterId, sensorId, tenantId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VectorSubmitVectorsResponse{eventTime=$eventTime, groupId=$groupId, requesterId=$requesterId, sensorId=$sensorId, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
