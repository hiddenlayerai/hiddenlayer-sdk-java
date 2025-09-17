// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SensorQueryResponse
private constructor(
    private val pageNumber: JsonField<Long>,
    private val pageSize: JsonField<Long>,
    private val results: JsonField<List<Result>>,
    private val totalCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("page_number") @ExcludeMissing pageNumber: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<Result>> = JsonMissing.of(),
        @JsonProperty("total_count") @ExcludeMissing totalCount: JsonField<Long> = JsonMissing.of(),
    ) : this(pageNumber, pageSize, results, totalCount, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageNumber(): Long = pageNumber.getRequired("page_number")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pageSize(): Long = pageSize.getRequired("page_size")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalCount(): Long = totalCount.getRequired("total_count")

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

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

    /**
     * Returns the raw JSON value of [totalCount].
     *
     * Unlike [totalCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_count") @ExcludeMissing fun _totalCount(): JsonField<Long> = totalCount

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
         * Returns a mutable builder for constructing an instance of [SensorQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .pageSize()
         * .results()
         * .totalCount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SensorQueryResponse]. */
    class Builder internal constructor() {

        private var pageNumber: JsonField<Long>? = null
        private var pageSize: JsonField<Long>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var totalCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sensorQueryResponse: SensorQueryResponse) = apply {
            pageNumber = sensorQueryResponse.pageNumber
            pageSize = sensorQueryResponse.pageSize
            results = sensorQueryResponse.results.map { it.toMutableList() }
            totalCount = sensorQueryResponse.totalCount
            additionalProperties = sensorQueryResponse.additionalProperties.toMutableMap()
        }

        fun pageNumber(pageNumber: Long) = pageNumber(JsonField.of(pageNumber))

        /**
         * Sets [Builder.pageNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageNumber] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageNumber(pageNumber: JsonField<Long>) = apply { this.pageNumber = pageNumber }

        fun pageSize(pageSize: Long) = pageSize(JsonField.of(pageSize))

        /**
         * Sets [Builder.pageSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pageSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pageSize(pageSize: JsonField<Long>) = apply { this.pageSize = pageSize }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        fun totalCount(totalCount: Long) = totalCount(JsonField.of(totalCount))

        /**
         * Sets [Builder.totalCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalCount(totalCount: JsonField<Long>) = apply { this.totalCount = totalCount }

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
         * Returns an immutable instance of [SensorQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .pageNumber()
         * .pageSize()
         * .results()
         * .totalCount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SensorQueryResponse =
            SensorQueryResponse(
                checkRequired("pageNumber", pageNumber),
                checkRequired("pageSize", pageSize),
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("totalCount", totalCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SensorQueryResponse = apply {
        if (validated) {
            return@apply
        }

        pageNumber()
        pageSize()
        results().forEach { it.validate() }
        totalCount()
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
        (if (pageNumber.asKnown().isPresent) 1 else 0) +
            (if (pageSize.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (totalCount.asKnown().isPresent) 1 else 0)

    class Result
    private constructor(
        private val active: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val modelId: JsonField<String>,
        private val plaintextName: JsonField<String>,
        private val sensorId: JsonField<String>,
        private val tags: JsonField<Tags>,
        private val tenantId: JsonField<String>,
        private val adhoc: JsonField<Boolean>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plaintext_name")
            @ExcludeMissing
            plaintextName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sensor_id")
            @ExcludeMissing
            sensorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
            @JsonProperty("tenant_id")
            @ExcludeMissing
            tenantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("adhoc") @ExcludeMissing adhoc: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            active,
            createdAt,
            modelId,
            plaintextName,
            sensorId,
            tags,
            tenantId,
            adhoc,
            version,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean = active.getRequired("active")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun plaintextName(): String = plaintextName.getRequired("plaintext_name")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sensorId(): String = sensorId.getRequired("sensor_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Tags = tags.getRequired("tags")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tenantId(): String = tenantId.getRequired("tenant_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun adhoc(): Optional<Boolean> = adhoc.getOptional("adhoc")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

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
         * Returns the raw JSON value of [sensorId].
         *
         * Unlike [sensorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensor_id") @ExcludeMissing fun _sensorId(): JsonField<String> = sensorId

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

        /**
         * Returns the raw JSON value of [tenantId].
         *
         * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

        /**
         * Returns the raw JSON value of [adhoc].
         *
         * Unlike [adhoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adhoc") @ExcludeMissing fun _adhoc(): JsonField<Boolean> = adhoc

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

            /**
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .active()
             * .createdAt()
             * .modelId()
             * .plaintextName()
             * .sensorId()
             * .tags()
             * .tenantId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var modelId: JsonField<String>? = null
            private var plaintextName: JsonField<String>? = null
            private var sensorId: JsonField<String>? = null
            private var tags: JsonField<Tags>? = null
            private var tenantId: JsonField<String>? = null
            private var adhoc: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                active = result.active
                createdAt = result.createdAt
                modelId = result.modelId
                plaintextName = result.plaintextName
                sensorId = result.sensorId
                tags = result.tags
                tenantId = result.tenantId
                adhoc = result.adhoc
                version = result.version
                additionalProperties = result.additionalProperties.toMutableMap()
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

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

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

            fun sensorId(sensorId: String) = sensorId(JsonField.of(sensorId))

            /**
             * Sets [Builder.sensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensorId(sensorId: JsonField<String>) = apply { this.sensorId = sensorId }

            fun tags(tags: Tags) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

            fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

            /**
             * Sets [Builder.tenantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tenantId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

            fun adhoc(adhoc: Boolean) = adhoc(JsonField.of(adhoc))

            /**
             * Sets [Builder.adhoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adhoc] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adhoc(adhoc: JsonField<Boolean>) = apply { this.adhoc = adhoc }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .active()
             * .createdAt()
             * .modelId()
             * .plaintextName()
             * .sensorId()
             * .tags()
             * .tenantId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("active", active),
                    checkRequired("createdAt", createdAt),
                    checkRequired("modelId", modelId),
                    checkRequired("plaintextName", plaintextName),
                    checkRequired("sensorId", sensorId),
                    checkRequired("tags", tags),
                    checkRequired("tenantId", tenantId),
                    adhoc,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            active()
            createdAt()
            modelId()
            plaintextName()
            sensorId()
            tags().validate()
            tenantId()
            adhoc()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (modelId.asKnown().isPresent) 1 else 0) +
                (if (plaintextName.asKnown().isPresent) 1 else 0) +
                (if (sensorId.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tenantId.asKnown().isPresent) 1 else 0) +
                (if (adhoc.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        class Tags
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Tags]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tags]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tags: Tags) = apply {
                    additionalProperties = tags.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tags].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tags = Tags(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Tags = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tags && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Tags{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                active == other.active &&
                createdAt == other.createdAt &&
                modelId == other.modelId &&
                plaintextName == other.plaintextName &&
                sensorId == other.sensorId &&
                tags == other.tags &&
                tenantId == other.tenantId &&
                adhoc == other.adhoc &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                createdAt,
                modelId,
                plaintextName,
                sensorId,
                tags,
                tenantId,
                adhoc,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{active=$active, createdAt=$createdAt, modelId=$modelId, plaintextName=$plaintextName, sensorId=$sensorId, tags=$tags, tenantId=$tenantId, adhoc=$adhoc, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SensorQueryResponse &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            results == other.results &&
            totalCount == other.totalCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(pageNumber, pageSize, results, totalCount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SensorQueryResponse{pageNumber=$pageNumber, pageSize=$pageSize, results=$results, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
