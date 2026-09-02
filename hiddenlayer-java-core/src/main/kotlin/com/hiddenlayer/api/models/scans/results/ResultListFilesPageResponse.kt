// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cursor-based pagination navigation links */
class ResultListFilesPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val first: JsonField<String>,
    private val items: JsonField<List<ScanFileResult>>,
    private val next: JsonField<String>,
    private val prev: JsonField<String>,
    private val last: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("first") @ExcludeMissing first: JsonField<String> = JsonMissing.of(),
        @JsonProperty("items")
        @ExcludeMissing
        items: JsonField<List<ScanFileResult>> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev") @ExcludeMissing prev: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last") @ExcludeMissing last: JsonField<String> = JsonMissing.of(),
    ) : this(first, items, next, prev, last, mutableMapOf())

    /**
     * Pagination cursor pointing to the first page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun first(): String = first.getRequired("first")

    /**
     * Array of items for this page
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<ScanFileResult> = items.getRequired("items")

    /**
     * Pagination cursor pointing to the next page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun next(): String = next.getRequired("next")

    /**
     * Pagination cursor pointing to the previous page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prev(): String = prev.getRequired("prev")

    /**
     * Pagination cursor pointing to the last page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun last(): Optional<String> = last.getOptional("last")

    /**
     * Returns the raw JSON value of [first].
     *
     * Unlike [first], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first") @ExcludeMissing fun _first(): JsonField<String> = first

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<ScanFileResult>> = items

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [prev].
     *
     * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<String> = prev

    /**
     * Returns the raw JSON value of [last].
     *
     * Unlike [last], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last") @ExcludeMissing fun _last(): JsonField<String> = last

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
         * Returns a mutable builder for constructing an instance of [ResultListFilesPageResponse].
         *
         * The following fields are required:
         * ```java
         * .first()
         * .items()
         * .next()
         * .prev()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResultListFilesPageResponse]. */
    class Builder internal constructor() {

        private var first: JsonField<String>? = null
        private var items: JsonField<MutableList<ScanFileResult>>? = null
        private var next: JsonField<String>? = null
        private var prev: JsonField<String>? = null
        private var last: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(resultListFilesPageResponse: ResultListFilesPageResponse) = apply {
            first = resultListFilesPageResponse.first
            items = resultListFilesPageResponse.items.map { it.toMutableList() }
            next = resultListFilesPageResponse.next
            prev = resultListFilesPageResponse.prev
            last = resultListFilesPageResponse.last
            additionalProperties = resultListFilesPageResponse.additionalProperties.toMutableMap()
        }

        /** Pagination cursor pointing to the first page. */
        fun first(first: String) = first(JsonField.of(first))

        /**
         * Sets [Builder.first] to an arbitrary JSON value.
         *
         * You should usually call [Builder.first] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun first(first: JsonField<String>) = apply { this.first = first }

        /** Array of items for this page */
        fun items(items: List<ScanFileResult>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<ScanFileResult>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun items(items: JsonField<List<ScanFileResult>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScanFileResult] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: ScanFileResult) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Pagination cursor pointing to the next page. */
        fun next(next: String) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** Pagination cursor pointing to the previous page. */
        fun prev(prev: String) = prev(JsonField.of(prev))

        /**
         * Sets [Builder.prev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prev] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prev(prev: JsonField<String>) = apply { this.prev = prev }

        /** Pagination cursor pointing to the last page. */
        fun last(last: String) = last(JsonField.of(last))

        /**
         * Sets [Builder.last] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last(last: JsonField<String>) = apply { this.last = last }

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
         * Returns an immutable instance of [ResultListFilesPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .first()
         * .items()
         * .next()
         * .prev()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResultListFilesPageResponse =
            ResultListFilesPageResponse(
                checkRequired("first", first),
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("next", next),
                checkRequired("prev", prev),
                last,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ResultListFilesPageResponse = apply {
        if (validated) {
            return@apply
        }

        first()
        items().forEach { it.validate() }
        next()
        prev()
        last()
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
        (if (first.asKnown().isPresent) 1 else 0) +
            (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (prev.asKnown().isPresent) 1 else 0) +
            (if (last.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResultListFilesPageResponse &&
            first == other.first &&
            items == other.items &&
            next == other.next &&
            prev == other.prev &&
            last == other.last &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(first, items, next, prev, last, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResultListFilesPageResponse{first=$first, items=$items, next=$next, prev=$prev, last=$last, additionalProperties=$additionalProperties}"
}
