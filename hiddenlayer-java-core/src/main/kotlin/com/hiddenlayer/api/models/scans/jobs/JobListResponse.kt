// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.checkKnown
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import com.hiddenlayer.api.models.scans.results.ScanReport
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class JobListResponse
private constructor(
    private val items: JsonField<List<ScanReport>>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val total: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<ScanReport>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
    ) : this(items, limit, offset, total, mutableMapOf())

    /**
     * List of items. If no matching items are found, then `[]` will be returned.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<ScanReport> = items.getRequired("items")

    /**
     * Maximum number of items to return
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * Begin returning the results from this offset
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Long = offset.getRequired("offset")

    /**
     * Total number of items available based on the query criteria.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Double = total.getRequired("total")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ScanReport>> = items

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

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
         * Returns a mutable builder for constructing an instance of [JobListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .limit()
         * .offset()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<ScanReport>>? = null
        private var limit: JsonField<Long>? = null
        private var offset: JsonField<Long>? = null
        private var total: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobListResponse: JobListResponse) = apply {
            items = jobListResponse.items.map { it.toMutableList() }
            limit = jobListResponse.limit
            offset = jobListResponse.offset
            total = jobListResponse.total
            additionalProperties = jobListResponse.additionalProperties.toMutableMap()
        }

        /** List of items. If no matching items are found, then `[]` will be returned. */
        fun items(items: List<ScanReport>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<ScanReport>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<ScanReport>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScanReport] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: ScanReport) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Maximum number of items to return */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** Begin returning the results from this offset */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        /** Total number of items available based on the query criteria. */
        fun total(total: Double) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Double>) = apply { this.total = total }

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
         * Returns an immutable instance of [JobListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .limit()
         * .offset()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobListResponse =
            JobListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("limit", limit),
                checkRequired("offset", offset),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): JobListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        limit()
        offset()
        total()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobListResponse &&
            items == other.items &&
            limit == other.limit &&
            offset == other.offset &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, limit, offset, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobListResponse{items=$items, limit=$limit, offset=$offset, total=$total, additionalProperties=$additionalProperties}"
}
