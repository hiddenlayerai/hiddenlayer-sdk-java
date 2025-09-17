// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.Enum
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.Params
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Query Sensors */
class SensorQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun filter(): Optional<Filter> = body.filter()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderBy(): Optional<String> = body.orderBy()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orderDir(): Optional<OrderDir> = body.orderDir()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageNumber(): Optional<Long> = body.pageNumber()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pageSize(): Optional<Long> = body.pageSize()

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _filter(): JsonField<Filter> = body._filter()

    /**
     * Returns the raw JSON value of [orderBy].
     *
     * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderBy(): JsonField<String> = body._orderBy()

    /**
     * Returns the raw JSON value of [orderDir].
     *
     * Unlike [orderDir], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderDir(): JsonField<OrderDir> = body._orderDir()

    /**
     * Returns the raw JSON value of [pageNumber].
     *
     * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageNumber(): JsonField<Long> = body._pageNumber()

    /**
     * Returns the raw JSON value of [pageSize].
     *
     * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pageSize(): JsonField<Long> = body._pageSize()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SensorQueryParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SensorQueryParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SensorQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sensorQueryParams: SensorQueryParams) = apply {
            body = sensorQueryParams.body.toBuilder()
            additionalHeaders = sensorQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = sensorQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [filter]
         * - [orderBy]
         * - [orderDir]
         * - [pageNumber]
         * - [pageSize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun filter(filter: Filter) = apply { body.filter(filter) }

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [Filter] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<Filter>) = apply { body.filter(filter) }

        fun orderBy(orderBy: String) = apply { body.orderBy(orderBy) }

        /**
         * Sets [Builder.orderBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderBy] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orderBy(orderBy: JsonField<String>) = apply { body.orderBy(orderBy) }

        fun orderDir(orderDir: OrderDir) = apply { body.orderDir(orderDir) }

        /**
         * Sets [Builder.orderDir] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderDir] with a well-typed [OrderDir] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orderDir(orderDir: JsonField<OrderDir>) = apply { body.orderDir(orderDir) }

        fun pageNumber(pageNumber: Long) = apply { body.pageNumber(pageNumber) }

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageNumber(pageNumber: JsonField<Long>) = apply { body.pageNumber(pageNumber) }

        fun pageSize(pageSize: Long) = apply { body.pageSize(pageSize) }

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { body.pageSize(pageSize) }

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
         * Returns an immutable instance of [SensorQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SensorQueryParams =
            SensorQueryParams(
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
        private val filter: JsonField<Filter>,
        private val orderBy: JsonField<String>,
        private val orderDir: JsonField<OrderDir>,
        private val pageNumber: JsonField<Long>,
        private val pageSize: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<Filter> = JsonMissing.of(),
            @JsonProperty("order_by") @ExcludeMissing orderBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("order_dir")
            @ExcludeMissing
            orderDir: JsonField<OrderDir> = JsonMissing.of(),
            @JsonProperty("page_number")
            @ExcludeMissing
            pageNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        ) : this(filter, orderBy, orderDir, pageNumber, pageSize, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filter(): Optional<Filter> = filter.getOptional("filter")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderBy(): Optional<String> = orderBy.getOptional("order_by")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun orderDir(): Optional<OrderDir> = orderDir.getOptional("order_dir")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageNumber(): Optional<Long> = pageNumber.getOptional("page_number")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Long> = pageSize.getOptional("page_size")

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<Filter> = filter

        /**
         * Returns the raw JSON value of [orderBy].
         *
         * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_by") @ExcludeMissing fun _orderBy(): JsonField<String> = orderBy

        /**
         * Returns the raw JSON value of [orderDir].
         *
         * Unlike [orderDir], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_dir") @ExcludeMissing fun _orderDir(): JsonField<OrderDir> = orderDir

        /**
         * Returns the raw JSON value of [pageNumber].
         *
         * Unlike [pageNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_number") @ExcludeMissing fun _pageNumber(): JsonField<Long> = pageNumber

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Long> = pageSize

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var filter: JsonField<Filter> = JsonMissing.of()
            private var orderBy: JsonField<String> = JsonMissing.of()
            private var orderDir: JsonField<OrderDir> = JsonMissing.of()
            private var pageNumber: JsonField<Long> = JsonMissing.of()
            private var pageSize: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                filter = body.filter
                orderBy = body.orderBy
                orderDir = body.orderDir
                pageNumber = body.pageNumber
                pageSize = body.pageSize
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun filter(filter: Filter) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [Filter] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<Filter>) = apply { this.filter = filter }

            fun orderBy(orderBy: String) = orderBy(JsonField.of(orderBy))

            /**
             * Sets [Builder.orderBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderBy(orderBy: JsonField<String>) = apply { this.orderBy = orderBy }

            fun orderDir(orderDir: OrderDir) = orderDir(JsonField.of(orderDir))

            /**
             * Sets [Builder.orderDir] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderDir] with a well-typed [OrderDir] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderDir(orderDir: JsonField<OrderDir>) = apply { this.orderDir = orderDir }

            fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

            /**
             * Sets [Builder.pageNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

            fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

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
             */
            fun build(): Body =
                Body(
                    filter,
                    orderBy,
                    orderDir,
                    pageNumber,
                    pageSize,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            filter().ifPresent { it.validate() }
            orderBy()
            orderDir().ifPresent { it.validate() }
            pageNumber()
            pageSize()
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
            (filter.asKnown().getOrNull()?.validity() ?: 0) +
                (if (orderBy.asKnown().isPresent) 1 else 0) +
                (orderDir.asKnown().getOrNull()?.validity() ?: 0) +
                (if (pageNumber.asKnown().isPresent) 1 else 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                filter == other.filter &&
                orderBy == other.orderBy &&
                orderDir == other.orderDir &&
                pageNumber == other.pageNumber &&
                pageSize == other.pageSize &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(filter, orderBy, orderDir, pageNumber, pageSize, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{filter=$filter, orderBy=$orderBy, orderDir=$orderDir, pageNumber=$pageNumber, pageSize=$pageSize, additionalProperties=$additionalProperties}"
    }

    class Filter
    private constructor(
        private val active: JsonField<Boolean>,
        private val createdAtStart: JsonField<OffsetDateTime>,
        private val createdAtStop: JsonField<OffsetDateTime>,
        private val plaintextName: JsonField<String>,
        private val source: JsonField<Source>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at_start")
            @ExcludeMissing
            createdAtStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at_stop")
            @ExcludeMissing
            createdAtStop: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("plaintext_name")
            @ExcludeMissing
            plaintextName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            active,
            createdAtStart,
            createdAtStop,
            plaintextName,
            source,
            version,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun active(): Optional<Boolean> = active.getOptional("active")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAtStart(): Optional<OffsetDateTime> =
            createdAtStart.getOptional("created_at_start")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAtStop(): Optional<OffsetDateTime> = createdAtStop.getOptional("created_at_stop")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun plaintextName(): Optional<String> = plaintextName.getOptional("plaintext_name")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [createdAtStart].
         *
         * Unlike [createdAtStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("created_at_start")
        @ExcludeMissing
        fun _createdAtStart(): JsonField<OffsetDateTime> = createdAtStart

        /**
         * Returns the raw JSON value of [createdAtStop].
         *
         * Unlike [createdAtStop], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("created_at_stop")
        @ExcludeMissing
        fun _createdAtStop(): JsonField<OffsetDateTime> = createdAtStop

        /**
         * Returns the raw JSON value of [plaintextName].
         *
         * Unlike [plaintextName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plaintext_name")
        @ExcludeMissing
        fun _plaintextName(): JsonField<String> = plaintextName

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var createdAtStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAtStop: JsonField<OffsetDateTime> = JsonMissing.of()
            private var plaintextName: JsonField<String> = JsonMissing.of()
            private var source: JsonField<Source> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                active = filter.active
                createdAtStart = filter.createdAtStart
                createdAtStop = filter.createdAtStop
                plaintextName = filter.plaintextName
                source = filter.source
                version = filter.version
                additionalProperties = filter.additionalProperties.toMutableMap()
            }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun createdAtStart(createdAtStart: OffsetDateTime) =
                createdAtStart(JsonField.of(createdAtStart))

            /**
             * Sets [Builder.createdAtStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtStart(createdAtStart: JsonField<OffsetDateTime>) = apply {
                this.createdAtStart = createdAtStart
            }

            fun createdAtStop(createdAtStop: OffsetDateTime) =
                createdAtStop(JsonField.of(createdAtStop))

            /**
             * Sets [Builder.createdAtStop] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAtStop] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun createdAtStop(createdAtStop: JsonField<OffsetDateTime>) = apply {
                this.createdAtStop = createdAtStop
            }

            fun plaintextName(plaintextName: String) = plaintextName(JsonField.of(plaintextName))

            /**
             * Sets [Builder.plaintextName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plaintextName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun plaintextName(plaintextName: JsonField<String>) = apply {
                this.plaintextName = plaintextName
            }

            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

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
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(
                    active,
                    createdAtStart,
                    createdAtStop,
                    plaintextName,
                    source,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Filter = apply {
            if (validated) {
                return@apply
            }

            active()
            createdAtStart()
            createdAtStop()
            plaintextName()
            source().ifPresent { it.validate() }
            version()
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
            (if (active.asKnown().isPresent) 1 else 0) +
                (if (createdAtStart.asKnown().isPresent) 1 else 0) +
                (if (createdAtStop.asKnown().isPresent) 1 else 0) +
                (if (plaintextName.asKnown().isPresent) 1 else 0) +
                (source.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ADHOC = of("adhoc")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                ADHOC
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADHOC,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ADHOC -> Value.ADHOC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HiddenLayerInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ADHOC -> Known.ADHOC
                    else -> throw HiddenLayerInvalidDataException("Unknown Source: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HiddenLayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HiddenLayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Source = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                active == other.active &&
                createdAtStart == other.createdAtStart &&
                createdAtStop == other.createdAtStop &&
                plaintextName == other.plaintextName &&
                source == other.source &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                createdAtStart,
                createdAtStop,
                plaintextName,
                source,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{active=$active, createdAtStart=$createdAtStart, createdAtStop=$createdAtStop, plaintextName=$plaintextName, source=$source, version=$version, additionalProperties=$additionalProperties}"
    }

    class OrderDir @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = OrderDir(JsonField.of(value))
        }

        /** An enum containing [OrderDir]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [OrderDir]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OrderDir] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /** An enum member indicating that [OrderDir] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HiddenLayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw HiddenLayerInvalidDataException("Unknown OrderDir: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HiddenLayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                HiddenLayerInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): OrderDir = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderDir && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorQueryParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SensorQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
