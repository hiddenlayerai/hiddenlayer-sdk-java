// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.jobs

import com.fasterxml.jackson.annotation.JsonCreator
import com.hiddenlayer_sdk.api.core.Enum
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get scan results (Summaries) */
class JobListParams
private constructor(
    private val detectionCategory: String?,
    private val endTime: OffsetDateTime?,
    private val latestPerModelVersionOnly: Boolean?,
    private val limit: Long?,
    private val modelIds: List<String>?,
    private val modelName: ModelName?,
    private val modelVersionIds: List<String>?,
    private val offset: Long?,
    private val scannerVersion: String?,
    private val severity: List<String>?,
    private val sort: String?,
    private val source: Source?,
    private val startTime: OffsetDateTime?,
    private val status: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** filter by a single detection category */
    fun detectionCategory(): Optional<String> = Optional.ofNullable(detectionCategory)

    /** End Time */
    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    /** only return latest result per model version */
    fun latestPerModelVersionOnly(): Optional<Boolean> =
        Optional.ofNullable(latestPerModelVersionOnly)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Model ID */
    fun modelIds(): Optional<List<String>> = Optional.ofNullable(modelIds)

    /** filter by the model name */
    fun modelName(): Optional<ModelName> = Optional.ofNullable(modelName)

    /** Model Version IDs */
    fun modelVersionIds(): Optional<List<String>> = Optional.ofNullable(modelVersionIds)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    /** filter by version of the scanner */
    fun scannerVersion(): Optional<String> = Optional.ofNullable(scannerVersion)

    /** Severities */
    fun severity(): Optional<List<String>> = Optional.ofNullable(severity)

    /**
     * allow sorting by model name, status, severity or created at, ascending (+) or the default
     * descending (-)
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** source of model related to scans */
    fun source(): Optional<Source> = Optional.ofNullable(source)

    /** Start Time */
    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Statuses */
    fun status(): Optional<List<String>> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): JobListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [JobListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobListParams]. */
    class Builder internal constructor() {

        private var detectionCategory: String? = null
        private var endTime: OffsetDateTime? = null
        private var latestPerModelVersionOnly: Boolean? = null
        private var limit: Long? = null
        private var modelIds: MutableList<String>? = null
        private var modelName: ModelName? = null
        private var modelVersionIds: MutableList<String>? = null
        private var offset: Long? = null
        private var scannerVersion: String? = null
        private var severity: MutableList<String>? = null
        private var sort: String? = null
        private var source: Source? = null
        private var startTime: OffsetDateTime? = null
        private var status: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobListParams: JobListParams) = apply {
            detectionCategory = jobListParams.detectionCategory
            endTime = jobListParams.endTime
            latestPerModelVersionOnly = jobListParams.latestPerModelVersionOnly
            limit = jobListParams.limit
            modelIds = jobListParams.modelIds?.toMutableList()
            modelName = jobListParams.modelName
            modelVersionIds = jobListParams.modelVersionIds?.toMutableList()
            offset = jobListParams.offset
            scannerVersion = jobListParams.scannerVersion
            severity = jobListParams.severity?.toMutableList()
            sort = jobListParams.sort
            source = jobListParams.source
            startTime = jobListParams.startTime
            status = jobListParams.status?.toMutableList()
            additionalHeaders = jobListParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobListParams.additionalQueryParams.toBuilder()
        }

        /** filter by a single detection category */
        fun detectionCategory(detectionCategory: String?) = apply {
            this.detectionCategory = detectionCategory
        }

        /** Alias for calling [Builder.detectionCategory] with `detectionCategory.orElse(null)`. */
        fun detectionCategory(detectionCategory: Optional<String>) =
            detectionCategory(detectionCategory.getOrNull())

        /** End Time */
        fun endTime(endTime: OffsetDateTime?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        /** only return latest result per model version */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Boolean?) = apply {
            this.latestPerModelVersionOnly = latestPerModelVersionOnly
        }

        /**
         * Alias for [Builder.latestPerModelVersionOnly].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Boolean) =
            latestPerModelVersionOnly(latestPerModelVersionOnly as Boolean?)

        /**
         * Alias for calling [Builder.latestPerModelVersionOnly] with
         * `latestPerModelVersionOnly.orElse(null)`.
         */
        fun latestPerModelVersionOnly(latestPerModelVersionOnly: Optional<Boolean>) =
            latestPerModelVersionOnly(latestPerModelVersionOnly.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Model ID */
        fun modelIds(modelIds: List<String>?) = apply { this.modelIds = modelIds?.toMutableList() }

        /** Alias for calling [Builder.modelIds] with `modelIds.orElse(null)`. */
        fun modelIds(modelIds: Optional<List<String>>) = modelIds(modelIds.getOrNull())

        /**
         * Adds a single [String] to [modelIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModelId(modelId: String) = apply {
            modelIds = (modelIds ?: mutableListOf()).apply { add(modelId) }
        }

        /** filter by the model name */
        fun modelName(modelName: ModelName?) = apply { this.modelName = modelName }

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<ModelName>) = modelName(modelName.getOrNull())

        /** Model Version IDs */
        fun modelVersionIds(modelVersionIds: List<String>?) = apply {
            this.modelVersionIds = modelVersionIds?.toMutableList()
        }

        /** Alias for calling [Builder.modelVersionIds] with `modelVersionIds.orElse(null)`. */
        fun modelVersionIds(modelVersionIds: Optional<List<String>>) =
            modelVersionIds(modelVersionIds.getOrNull())

        /**
         * Adds a single [String] to [modelVersionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModelVersionId(modelVersionId: String) = apply {
            modelVersionIds = (modelVersionIds ?: mutableListOf()).apply { add(modelVersionId) }
        }

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        /** filter by version of the scanner */
        fun scannerVersion(scannerVersion: String?) = apply { this.scannerVersion = scannerVersion }

        /** Alias for calling [Builder.scannerVersion] with `scannerVersion.orElse(null)`. */
        fun scannerVersion(scannerVersion: Optional<String>) =
            scannerVersion(scannerVersion.getOrNull())

        /** Severities */
        fun severity(severity: List<String>?) = apply { this.severity = severity?.toMutableList() }

        /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
        fun severity(severity: Optional<List<String>>) = severity(severity.getOrNull())

        /**
         * Adds a single [String] to [Builder.severity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSeverity(severity: String) = apply {
            this.severity = (this.severity ?: mutableListOf()).apply { add(severity) }
        }

        /**
         * allow sorting by model name, status, severity or created at, ascending (+) or the default
         * descending (-)
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        /** source of model related to scans */
        fun source(source: Source?) = apply { this.source = source }

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        /** Start Time */
        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /** Statuses */
        fun status(status: List<String>?) = apply { this.status = status?.toMutableList() }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<List<String>>) = status(status.getOrNull())

        /**
         * Adds a single [String] to [Builder.status].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: String) = apply {
            this.status = (this.status ?: mutableListOf()).apply { add(status) }
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
         * Returns an immutable instance of [JobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): JobListParams =
            JobListParams(
                detectionCategory,
                endTime,
                latestPerModelVersionOnly,
                limit,
                modelIds?.toImmutable(),
                modelName,
                modelVersionIds?.toImmutable(),
                offset,
                scannerVersion,
                severity?.toImmutable(),
                sort,
                source,
                startTime,
                status?.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                detectionCategory?.let { put("detection_category", it) }
                endTime?.let { put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                latestPerModelVersionOnly?.let {
                    put("latest_per_model_version_only", it.toString())
                }
                limit?.let { put("limit", it.toString()) }
                modelIds?.let { put("model_ids", it.joinToString(",")) }
                modelName?.let {
                    it.contains().ifPresent { put("model_name[contains]", it) }
                    it.eq().ifPresent { put("model_name[eq]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("model_name[$key]", value)
                        }
                    }
                }
                modelVersionIds?.let { put("model_version_ids", it.joinToString(",")) }
                offset?.let { put("offset", it.toString()) }
                scannerVersion?.let { put("scanner_version", it) }
                severity?.let { put("severity", it.joinToString(",")) }
                sort?.let { put("sort", it) }
                source?.let {
                    it.eq().ifPresent { put("source[eq]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("source[$key]", value)
                        }
                    }
                }
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                status?.let { put("status", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    /** filter by the model name */
    class ModelName
    private constructor(
        private val contains: String?,
        private val eq: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun contains(): Optional<String> = Optional.ofNullable(contains)

        fun eq(): Optional<String> = Optional.ofNullable(eq)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelName]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelName]. */
        class Builder internal constructor() {

            private var contains: String? = null
            private var eq: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(modelName: ModelName) = apply {
                contains = modelName.contains
                eq = modelName.eq
                additionalProperties = modelName.additionalProperties.toBuilder()
            }

            fun contains(contains: String?) = apply { this.contains = contains }

            /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
            fun contains(contains: Optional<String>) = contains(contains.getOrNull())

            fun eq(eq: String?) = apply { this.eq = eq }

            /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
            fun eq(eq: Optional<String>) = eq(eq.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [ModelName].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelName = ModelName(contains, eq, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelName && contains == other.contains && eq == other.eq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contains, eq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelName{contains=$contains, eq=$eq, additionalProperties=$additionalProperties}"
    }

    /** source of model related to scans */
    class Source
    private constructor(private val eq: Eq?, private val additionalProperties: QueryParams) {

        fun eq(): Optional<Eq> = Optional.ofNullable(eq)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Source]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var eq: Eq? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                eq = source.eq
                additionalProperties = source.additionalProperties.toBuilder()
            }

            fun eq(eq: Eq?) = apply { this.eq = eq }

            /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
            fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Source].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Source = Source(eq, additionalProperties.build())
        }

        class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
            }

            /** An enum containing [Eq]'s known values. */
            enum class Known {
                ADHOC
            }

            /**
             * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Eq] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ADHOC,
                /** An enum member indicating that [Eq] was instantiated with an unknown value. */
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
                    else -> throw HiddenLayerInvalidDataException("Unknown Eq: $value")
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

            fun validate(): Eq = apply {
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

                return /* spotless:off */ other is Eq && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && eq == other.eq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Source{eq=$eq, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is JobListParams && detectionCategory == other.detectionCategory && endTime == other.endTime && latestPerModelVersionOnly == other.latestPerModelVersionOnly && limit == other.limit && modelIds == other.modelIds && modelName == other.modelName && modelVersionIds == other.modelVersionIds && offset == other.offset && scannerVersion == other.scannerVersion && severity == other.severity && sort == other.sort && source == other.source && startTime == other.startTime && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(detectionCategory, endTime, latestPerModelVersionOnly, limit, modelIds, modelName, modelVersionIds, offset, scannerVersion, severity, sort, source, startTime, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "JobListParams{detectionCategory=$detectionCategory, endTime=$endTime, latestPerModelVersionOnly=$latestPerModelVersionOnly, limit=$limit, modelIds=$modelIds, modelName=$modelName, modelVersionIds=$modelVersionIds, offset=$offset, scannerVersion=$scannerVersion, severity=$severity, sort=$sort, source=$source, startTime=$startTime, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
