// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

import com.fasterxml.jackson.annotation.JsonCreator
import com.hiddenlayer.api.core.Enum
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.Params
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Model Cards */
class CardListParams
private constructor(
    private val aidrSeverity: List<AidrSeverity>?,
    private val aidrStatus: AidrStatus?,
    private val limit: Long?,
    private val modelCreated: ModelCreated?,
    private val modelName: ModelName?,
    private val modscanSeverity: List<ModscanSeverity>?,
    private val modscanStatus: ModscanStatus?,
    private val offset: Long?,
    private val provider: List<Provider>?,
    private val sort: String?,
    private val source: Source?,
    private val xCorrelationId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun aidrSeverity(): Optional<List<AidrSeverity>> = Optional.ofNullable(aidrSeverity)

    /** filter by aidr enabled */
    fun aidrStatus(): Optional<AidrStatus> = Optional.ofNullable(aidrStatus)

    /** Limit the number of items returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** match on models created between dates */
    fun modelCreated(): Optional<ModelCreated> = Optional.ofNullable(modelCreated)

    /** substring match on model name */
    fun modelName(): Optional<ModelName> = Optional.ofNullable(modelName)

    fun modscanSeverity(): Optional<List<ModscanSeverity>> = Optional.ofNullable(modscanSeverity)

    fun modscanStatus(): Optional<ModscanStatus> = Optional.ofNullable(modscanStatus)

    /** Begin returning the results from this offset */
    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun provider(): Optional<List<Provider>> = Optional.ofNullable(provider)

    /**
     * allow sorting by model name or created at timestamp, ascending (+) or the default descending
     * (-)
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** substring and full match on model source */
    fun source(): Optional<Source> = Optional.ofNullable(source)

    fun xCorrelationId(): Optional<String> = Optional.ofNullable(xCorrelationId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CardListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardListParams]. */
    class Builder internal constructor() {

        private var aidrSeverity: MutableList<AidrSeverity>? = null
        private var aidrStatus: AidrStatus? = null
        private var limit: Long? = null
        private var modelCreated: ModelCreated? = null
        private var modelName: ModelName? = null
        private var modscanSeverity: MutableList<ModscanSeverity>? = null
        private var modscanStatus: ModscanStatus? = null
        private var offset: Long? = null
        private var provider: MutableList<Provider>? = null
        private var sort: String? = null
        private var source: Source? = null
        private var xCorrelationId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardListParams: CardListParams) = apply {
            aidrSeverity = cardListParams.aidrSeverity?.toMutableList()
            aidrStatus = cardListParams.aidrStatus
            limit = cardListParams.limit
            modelCreated = cardListParams.modelCreated
            modelName = cardListParams.modelName
            modscanSeverity = cardListParams.modscanSeverity?.toMutableList()
            modscanStatus = cardListParams.modscanStatus
            offset = cardListParams.offset
            provider = cardListParams.provider?.toMutableList()
            sort = cardListParams.sort
            source = cardListParams.source
            xCorrelationId = cardListParams.xCorrelationId
            additionalHeaders = cardListParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardListParams.additionalQueryParams.toBuilder()
        }

        fun aidrSeverity(aidrSeverity: List<AidrSeverity>?) = apply {
            this.aidrSeverity = aidrSeverity?.toMutableList()
        }

        /** Alias for calling [Builder.aidrSeverity] with `aidrSeverity.orElse(null)`. */
        fun aidrSeverity(aidrSeverity: Optional<List<AidrSeverity>>) =
            aidrSeverity(aidrSeverity.getOrNull())

        /**
         * Adds a single [AidrSeverity] to [Builder.aidrSeverity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAidrSeverity(aidrSeverity: AidrSeverity) = apply {
            this.aidrSeverity = (this.aidrSeverity ?: mutableListOf()).apply { add(aidrSeverity) }
        }

        /** filter by aidr enabled */
        fun aidrStatus(aidrStatus: AidrStatus?) = apply { this.aidrStatus = aidrStatus }

        /** Alias for calling [Builder.aidrStatus] with `aidrStatus.orElse(null)`. */
        fun aidrStatus(aidrStatus: Optional<AidrStatus>) = aidrStatus(aidrStatus.getOrNull())

        /** Limit the number of items returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** match on models created between dates */
        fun modelCreated(modelCreated: ModelCreated?) = apply { this.modelCreated = modelCreated }

        /** Alias for calling [Builder.modelCreated] with `modelCreated.orElse(null)`. */
        fun modelCreated(modelCreated: Optional<ModelCreated>) =
            modelCreated(modelCreated.getOrNull())

        /** substring match on model name */
        fun modelName(modelName: ModelName?) = apply { this.modelName = modelName }

        /** Alias for calling [Builder.modelName] with `modelName.orElse(null)`. */
        fun modelName(modelName: Optional<ModelName>) = modelName(modelName.getOrNull())

        fun modscanSeverity(modscanSeverity: List<ModscanSeverity>?) = apply {
            this.modscanSeverity = modscanSeverity?.toMutableList()
        }

        /** Alias for calling [Builder.modscanSeverity] with `modscanSeverity.orElse(null)`. */
        fun modscanSeverity(modscanSeverity: Optional<List<ModscanSeverity>>) =
            modscanSeverity(modscanSeverity.getOrNull())

        /**
         * Adds a single [ModscanSeverity] to [Builder.modscanSeverity].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModscanSeverity(modscanSeverity: ModscanSeverity) = apply {
            this.modscanSeverity =
                (this.modscanSeverity ?: mutableListOf()).apply { add(modscanSeverity) }
        }

        fun modscanStatus(modscanStatus: ModscanStatus?) = apply {
            this.modscanStatus = modscanStatus
        }

        /** Alias for calling [Builder.modscanStatus] with `modscanStatus.orElse(null)`. */
        fun modscanStatus(modscanStatus: Optional<ModscanStatus>) =
            modscanStatus(modscanStatus.getOrNull())

        /** Begin returning the results from this offset */
        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

        fun provider(provider: List<Provider>?) = apply {
            this.provider = provider?.toMutableList()
        }

        /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
        fun provider(provider: Optional<List<Provider>>) = provider(provider.getOrNull())

        /**
         * Adds a single [Provider] to [Builder.provider].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: Provider) = apply {
            this.provider = (this.provider ?: mutableListOf()).apply { add(provider) }
        }

        /**
         * allow sorting by model name or created at timestamp, ascending (+) or the default
         * descending (-)
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

        /** substring and full match on model source */
        fun source(source: Source?) = apply { this.source = source }

        /** Alias for calling [Builder.source] with `source.orElse(null)`. */
        fun source(source: Optional<Source>) = source(source.getOrNull())

        fun xCorrelationId(xCorrelationId: String?) = apply { this.xCorrelationId = xCorrelationId }

        /** Alias for calling [Builder.xCorrelationId] with `xCorrelationId.orElse(null)`. */
        fun xCorrelationId(xCorrelationId: Optional<String>) =
            xCorrelationId(xCorrelationId.getOrNull())

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
         * Returns an immutable instance of [CardListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardListParams =
            CardListParams(
                aidrSeverity?.toImmutable(),
                aidrStatus,
                limit,
                modelCreated,
                modelName,
                modscanSeverity?.toImmutable(),
                modscanStatus,
                offset,
                provider?.toImmutable(),
                sort,
                source,
                xCorrelationId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xCorrelationId?.let { put("X-Correlation-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                aidrSeverity?.let { put("aidr_severity", it.joinToString(",") { it.toString() }) }
                aidrStatus?.let { put("aidr_status", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                modelCreated?.let {
                    it.gte().ifPresent {
                        put("model_created[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.lte().ifPresent {
                        put("model_created[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("model_created[$key]", value)
                        }
                    }
                }
                modelName?.let {
                    it.contains().ifPresent { put("model_name[contains]", it) }
                    it.eq().ifPresent { put("model_name[eq]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("model_name[$key]", value)
                        }
                    }
                }
                modscanSeverity?.let {
                    put("modscan_severity", it.joinToString(",") { it.toString() })
                }
                modscanStatus?.let { put("modscan_status", it.toString()) }
                offset?.let { put("offset", it.toString()) }
                provider?.let { put("provider", it.joinToString(",") { it.toString() }) }
                sort?.let { put("sort", it) }
                source?.let {
                    it.contains().ifPresent { put("source[contains]", it) }
                    it.eq().ifPresent { put("source[eq]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("source[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    class AidrSeverity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SAFE = of("SAFE")

            @JvmField val UNSAFE = of("UNSAFE")

            @JvmField val SUSPICIOUS = of("SUSPICIOUS")

            @JvmStatic fun of(value: String) = AidrSeverity(JsonField.of(value))
        }

        /** An enum containing [AidrSeverity]'s known values. */
        enum class Known {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
        }

        /**
         * An enum containing [AidrSeverity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AidrSeverity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            /**
             * An enum member indicating that [AidrSeverity] was instantiated with an unknown value.
             */
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
                SAFE -> Value.SAFE
                UNSAFE -> Value.UNSAFE
                SUSPICIOUS -> Value.SUSPICIOUS
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
                SAFE -> Known.SAFE
                UNSAFE -> Known.UNSAFE
                SUSPICIOUS -> Known.SUSPICIOUS
                else -> throw HiddenLayerInvalidDataException("Unknown AidrSeverity: $value")
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

        fun validate(): AidrSeverity = apply {
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

            return other is AidrSeverity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** filter by aidr enabled */
    class AidrStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val DISABLED = of("DISABLED")

            @JvmField val ANY = of("ANY")

            @JvmStatic fun of(value: String) = AidrStatus(JsonField.of(value))
        }

        /** An enum containing [AidrStatus]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
            ANY,
        }

        /**
         * An enum containing [AidrStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AidrStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            ANY,
            /**
             * An enum member indicating that [AidrStatus] was instantiated with an unknown value.
             */
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                ANY -> Value.ANY
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                ANY -> Known.ANY
                else -> throw HiddenLayerInvalidDataException("Unknown AidrStatus: $value")
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

        fun validate(): AidrStatus = apply {
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

            return other is AidrStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** match on models created between dates */
    class ModelCreated
    private constructor(
        private val gte: OffsetDateTime?,
        private val lte: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

        fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ModelCreated]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelCreated]. */
        class Builder internal constructor() {

            private var gte: OffsetDateTime? = null
            private var lte: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(modelCreated: ModelCreated) = apply {
                gte = modelCreated.gte
                lte = modelCreated.lte
                additionalProperties = modelCreated.additionalProperties.toBuilder()
            }

            fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

            fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

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
             * Returns an immutable instance of [ModelCreated].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ModelCreated = ModelCreated(gte, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelCreated &&
                gte == other.gte &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelCreated{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /** substring match on model name */
    class ModelName
    private constructor(
        private val contains: String?,
        private val eq: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun contains(): Optional<String> = Optional.ofNullable(contains)

        fun eq(): Optional<String> = Optional.ofNullable(eq)

        /** Query params to send with the request. */
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

            return other is ModelName &&
                contains == other.contains &&
                eq == other.eq &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(contains, eq, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelName{contains=$contains, eq=$eq, additionalProperties=$additionalProperties}"
    }

    class ModscanSeverity @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SAFE = of("SAFE")

            @JvmField val UNSAFE = of("UNSAFE")

            @JvmField val SUSPICIOUS = of("SUSPICIOUS")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val ERROR = of("ERROR")

            @JvmField val NOT_AVAILABLE = of("not available")

            @JvmField val CRITICAL = of("critical")

            @JvmField val HIGH = of("high")

            @JvmField val MEDIUM = of("medium")

            @JvmField val LOW = of("low")

            @JvmField val UNKNOWN = of("unknown")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = ModscanSeverity(JsonField.of(value))
        }

        /** An enum containing [ModscanSeverity]'s known values. */
        enum class Known {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            UNKNOWN,
            ERROR,
            NOT_AVAILABLE,
            CRITICAL,
            HIGH,
            MEDIUM,
            LOW,
            UNKNOWN,
            NONE,
        }

        /**
         * An enum containing [ModscanSeverity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModscanSeverity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            UNKNOWN,
            ERROR,
            NOT_AVAILABLE,
            CRITICAL,
            HIGH,
            MEDIUM,
            LOW,
            UNKNOWN,
            NONE,
            /**
             * An enum member indicating that [ModscanSeverity] was instantiated with an unknown
             * value.
             */
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
                SAFE -> Value.SAFE
                UNSAFE -> Value.UNSAFE
                SUSPICIOUS -> Value.SUSPICIOUS
                UNKNOWN -> Value.UNKNOWN
                ERROR -> Value.ERROR
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
                CRITICAL -> Value.CRITICAL
                HIGH -> Value.HIGH
                MEDIUM -> Value.MEDIUM
                LOW -> Value.LOW
                UNKNOWN -> Value.UNKNOWN
                NONE -> Value.NONE
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
                SAFE -> Known.SAFE
                UNSAFE -> Known.UNSAFE
                SUSPICIOUS -> Known.SUSPICIOUS
                UNKNOWN -> Known.UNKNOWN
                ERROR -> Known.ERROR
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                CRITICAL -> Known.CRITICAL
                HIGH -> Known.HIGH
                MEDIUM -> Known.MEDIUM
                LOW -> Known.LOW
                UNKNOWN -> Known.UNKNOWN
                NONE -> Known.NONE
                else -> throw HiddenLayerInvalidDataException("Unknown ModscanSeverity: $value")
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

        fun validate(): ModscanSeverity = apply {
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

            return other is ModscanSeverity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ModscanStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ENABLED = of("ENABLED")

            @JvmField val DISABLED = of("DISABLED")

            @JvmField val ANY = of("ANY")

            @JvmStatic fun of(value: String) = ModscanStatus(JsonField.of(value))
        }

        /** An enum containing [ModscanStatus]'s known values. */
        enum class Known {
            ENABLED,
            DISABLED,
            ANY,
        }

        /**
         * An enum containing [ModscanStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ModscanStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENABLED,
            DISABLED,
            ANY,
            /**
             * An enum member indicating that [ModscanStatus] was instantiated with an unknown
             * value.
             */
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
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                ANY -> Value.ANY
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
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                ANY -> Known.ANY
                else -> throw HiddenLayerInvalidDataException("Unknown ModscanStatus: $value")
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

        fun validate(): ModscanStatus = apply {
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

            return other is ModscanStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AZURE = of("AZURE")

            @JvmField val ADHOC = of("ADHOC")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            AZURE,
            ADHOC,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AZURE,
            ADHOC,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                AZURE -> Value.AZURE
                ADHOC -> Value.ADHOC
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
                AZURE -> Known.AZURE
                ADHOC -> Known.ADHOC
                else -> throw HiddenLayerInvalidDataException("Unknown Provider: $value")
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

        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** substring and full match on model source */
    class Source
    private constructor(
        private val contains: String?,
        private val eq: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun contains(): Optional<String> = Optional.ofNullable(contains)

        fun eq(): Optional<String> = Optional.ofNullable(eq)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Source]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var contains: String? = null
            private var eq: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                contains = source.contains
                eq = source.eq
                additionalProperties = source.additionalProperties.toBuilder()
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
             * Returns an immutable instance of [Source].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Source = Source(contains, eq, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                contains == other.contains &&
                eq == other.eq &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(contains, eq, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{contains=$contains, eq=$eq, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardListParams &&
            aidrSeverity == other.aidrSeverity &&
            aidrStatus == other.aidrStatus &&
            limit == other.limit &&
            modelCreated == other.modelCreated &&
            modelName == other.modelName &&
            modscanSeverity == other.modscanSeverity &&
            modscanStatus == other.modscanStatus &&
            offset == other.offset &&
            provider == other.provider &&
            sort == other.sort &&
            source == other.source &&
            xCorrelationId == other.xCorrelationId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            aidrSeverity,
            aidrStatus,
            limit,
            modelCreated,
            modelName,
            modscanSeverity,
            modscanStatus,
            offset,
            provider,
            sort,
            source,
            xCorrelationId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CardListParams{aidrSeverity=$aidrSeverity, aidrStatus=$aidrStatus, limit=$limit, modelCreated=$modelCreated, modelName=$modelName, modscanSeverity=$modscanSeverity, modscanStatus=$modscanStatus, offset=$offset, provider=$provider, sort=$sort, source=$source, xCorrelationId=$xCorrelationId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
