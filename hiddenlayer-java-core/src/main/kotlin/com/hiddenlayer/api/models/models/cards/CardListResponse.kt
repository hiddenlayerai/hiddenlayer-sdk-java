// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.Enum
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardListResponse
private constructor(
    private val createdAt: JsonField<Long>,
    private val modelId: JsonField<String>,
    private val plaintextName: JsonField<String>,
    private val source: JsonField<String>,
    private val activeVersionCount: JsonField<Long>,
    private val attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel>,
    private val hasGenealogy: JsonField<Boolean>,
    private val modelScanThreatLevel: JsonField<ModelScanThreatLevel>,
    private val securityPosture: JsonField<SecurityPosture>,
    private val tags: JsonField<Tags>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plaintext_name")
        @ExcludeMissing
        plaintextName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active_version_count")
        @ExcludeMissing
        activeVersionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("attack_monitoring_threat_level")
        @ExcludeMissing
        attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel> = JsonMissing.of(),
        @JsonProperty("has_genealogy")
        @ExcludeMissing
        hasGenealogy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("model_scan_threat_level")
        @ExcludeMissing
        modelScanThreatLevel: JsonField<ModelScanThreatLevel> = JsonMissing.of(),
        @JsonProperty("security_posture")
        @ExcludeMissing
        securityPosture: JsonField<SecurityPosture> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
    ) : this(
        createdAt,
        modelId,
        plaintextName,
        source,
        activeVersionCount,
        attackMonitoringThreatLevel,
        hasGenealogy,
        modelScanThreatLevel,
        securityPosture,
        tags,
        mutableMapOf(),
    )

    /**
     * Unix Nano Epoch Timestamp
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("created_at")

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
    fun source(): String = source.getRequired("source")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeVersionCount(): Optional<Long> =
        activeVersionCount.getOptional("active_version_count")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attackMonitoringThreatLevel(): Optional<AttackMonitoringThreatLevel> =
        attackMonitoringThreatLevel.getOptional("attack_monitoring_threat_level")

    /**
     * A value of `true` indicates that one or more versions of this model have associated model
     * genealogy information.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasGenealogy(): Optional<Boolean> = hasGenealogy.getOptional("has_genealogy")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modelScanThreatLevel(): Optional<ModelScanThreatLevel> =
        modelScanThreatLevel.getOptional("model_scan_threat_level")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun securityPosture(): Optional<SecurityPosture> =
        securityPosture.getOptional("security_posture")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<Tags> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [modelId].
     *
     * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

    /**
     * Returns the raw JSON value of [plaintextName].
     *
     * Unlike [plaintextName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plaintext_name")
    @ExcludeMissing
    fun _plaintextName(): JsonField<String> = plaintextName

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [activeVersionCount].
     *
     * Unlike [activeVersionCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("active_version_count")
    @ExcludeMissing
    fun _activeVersionCount(): JsonField<Long> = activeVersionCount

    /**
     * Returns the raw JSON value of [attackMonitoringThreatLevel].
     *
     * Unlike [attackMonitoringThreatLevel], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("attack_monitoring_threat_level")
    @ExcludeMissing
    fun _attackMonitoringThreatLevel(): JsonField<AttackMonitoringThreatLevel> =
        attackMonitoringThreatLevel

    /**
     * Returns the raw JSON value of [hasGenealogy].
     *
     * Unlike [hasGenealogy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_genealogy")
    @ExcludeMissing
    fun _hasGenealogy(): JsonField<Boolean> = hasGenealogy

    /**
     * Returns the raw JSON value of [modelScanThreatLevel].
     *
     * Unlike [modelScanThreatLevel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("model_scan_threat_level")
    @ExcludeMissing
    fun _modelScanThreatLevel(): JsonField<ModelScanThreatLevel> = modelScanThreatLevel

    /**
     * Returns the raw JSON value of [securityPosture].
     *
     * Unlike [securityPosture], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_posture")
    @ExcludeMissing
    fun _securityPosture(): JsonField<SecurityPosture> = securityPosture

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

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
         * Returns a mutable builder for constructing an instance of [CardListResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .modelId()
         * .plaintextName()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardListResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<Long>? = null
        private var modelId: JsonField<String>? = null
        private var plaintextName: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var activeVersionCount: JsonField<Long> = JsonMissing.of()
        private var attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel> =
            JsonMissing.of()
        private var hasGenealogy: JsonField<Boolean> = JsonMissing.of()
        private var modelScanThreatLevel: JsonField<ModelScanThreatLevel> = JsonMissing.of()
        private var securityPosture: JsonField<SecurityPosture> = JsonMissing.of()
        private var tags: JsonField<Tags> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardListResponse: CardListResponse) = apply {
            createdAt = cardListResponse.createdAt
            modelId = cardListResponse.modelId
            plaintextName = cardListResponse.plaintextName
            source = cardListResponse.source
            activeVersionCount = cardListResponse.activeVersionCount
            attackMonitoringThreatLevel = cardListResponse.attackMonitoringThreatLevel
            hasGenealogy = cardListResponse.hasGenealogy
            modelScanThreatLevel = cardListResponse.modelScanThreatLevel
            securityPosture = cardListResponse.securityPosture
            tags = cardListResponse.tags
            additionalProperties = cardListResponse.additionalProperties.toMutableMap()
        }

        /** Unix Nano Epoch Timestamp */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun modelId(modelId: String) = modelId(JsonField.of(modelId))

        /**
         * Sets [Builder.modelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

        fun plaintextName(plaintextName: String) = plaintextName(JsonField.of(plaintextName))

        /**
         * Sets [Builder.plaintextName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plaintextName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun plaintextName(plaintextName: JsonField<String>) = apply {
            this.plaintextName = plaintextName
        }

        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun activeVersionCount(activeVersionCount: Long) =
            activeVersionCount(JsonField.of(activeVersionCount))

        /**
         * Sets [Builder.activeVersionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeVersionCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun activeVersionCount(activeVersionCount: JsonField<Long>) = apply {
            this.activeVersionCount = activeVersionCount
        }

        fun attackMonitoringThreatLevel(attackMonitoringThreatLevel: AttackMonitoringThreatLevel) =
            attackMonitoringThreatLevel(JsonField.of(attackMonitoringThreatLevel))

        /**
         * Sets [Builder.attackMonitoringThreatLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attackMonitoringThreatLevel] with a well-typed
         * [AttackMonitoringThreatLevel] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun attackMonitoringThreatLevel(
            attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel>
        ) = apply { this.attackMonitoringThreatLevel = attackMonitoringThreatLevel }

        /**
         * A value of `true` indicates that one or more versions of this model have associated model
         * genealogy information.
         */
        fun hasGenealogy(hasGenealogy: Boolean) = hasGenealogy(JsonField.of(hasGenealogy))

        /**
         * Sets [Builder.hasGenealogy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasGenealogy] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasGenealogy(hasGenealogy: JsonField<Boolean>) = apply {
            this.hasGenealogy = hasGenealogy
        }

        fun modelScanThreatLevel(modelScanThreatLevel: ModelScanThreatLevel) =
            modelScanThreatLevel(JsonField.of(modelScanThreatLevel))

        /**
         * Sets [Builder.modelScanThreatLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelScanThreatLevel] with a well-typed
         * [ModelScanThreatLevel] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun modelScanThreatLevel(modelScanThreatLevel: JsonField<ModelScanThreatLevel>) = apply {
            this.modelScanThreatLevel = modelScanThreatLevel
        }

        fun securityPosture(securityPosture: SecurityPosture) =
            securityPosture(JsonField.of(securityPosture))

        /**
         * Sets [Builder.securityPosture] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityPosture] with a well-typed [SecurityPosture]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun securityPosture(securityPosture: JsonField<SecurityPosture>) = apply {
            this.securityPosture = securityPosture
        }

        fun tags(tags: Tags) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

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
         * Returns an immutable instance of [CardListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .modelId()
         * .plaintextName()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardListResponse =
            CardListResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("modelId", modelId),
                checkRequired("plaintextName", plaintextName),
                checkRequired("source", source),
                activeVersionCount,
                attackMonitoringThreatLevel,
                hasGenealogy,
                modelScanThreatLevel,
                securityPosture,
                tags,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardListResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        modelId()
        plaintextName()
        source()
        activeVersionCount()
        attackMonitoringThreatLevel().ifPresent { it.validate() }
        hasGenealogy()
        modelScanThreatLevel().ifPresent { it.validate() }
        securityPosture().ifPresent { it.validate() }
        tags().ifPresent { it.validate() }
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (modelId.asKnown().isPresent) 1 else 0) +
            (if (plaintextName.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (activeVersionCount.asKnown().isPresent) 1 else 0) +
            (attackMonitoringThreatLevel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (hasGenealogy.asKnown().isPresent) 1 else 0) +
            (modelScanThreatLevel.asKnown().getOrNull()?.validity() ?: 0) +
            (securityPosture.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.validity() ?: 0)

    class AttackMonitoringThreatLevel
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SAFE = of("safe")

            @JvmField val UNSAFE = of("unsafe")

            @JvmField val SUSPICIOUS = of("suspicious")

            @JvmField val NOT_AVAILABLE = of("not available")

            @JvmStatic fun of(value: String) = AttackMonitoringThreatLevel(JsonField.of(value))
        }

        /** An enum containing [AttackMonitoringThreatLevel]'s known values. */
        enum class Known {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [AttackMonitoringThreatLevel]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AttackMonitoringThreatLevel] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [AttackMonitoringThreatLevel] was instantiated with an
             * unknown value.
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
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else ->
                    throw HiddenLayerInvalidDataException(
                        "Unknown AttackMonitoringThreatLevel: $value"
                    )
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

        fun validate(): AttackMonitoringThreatLevel = apply {
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

            return other is AttackMonitoringThreatLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ModelScanThreatLevel
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SAFE = of("safe")

            @JvmField val UNSAFE = of("unsafe")

            @JvmField val SUSPICIOUS = of("suspicious")

            @JvmField val NOT_AVAILABLE = of("not available")

            @JvmStatic fun of(value: String) = ModelScanThreatLevel(JsonField.of(value))
        }

        /** An enum containing [ModelScanThreatLevel]'s known values. */
        enum class Known {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [ModelScanThreatLevel]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ModelScanThreatLevel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SAFE,
            UNSAFE,
            SUSPICIOUS,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [ModelScanThreatLevel] was instantiated with an
             * unknown value.
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
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else ->
                    throw HiddenLayerInvalidDataException("Unknown ModelScanThreatLevel: $value")
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

        fun validate(): ModelScanThreatLevel = apply {
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

            return other is ModelScanThreatLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SecurityPosture
    private constructor(
        private val attackMonitoring: JsonField<Boolean>,
        private val modelScan: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attack_monitoring")
            @ExcludeMissing
            attackMonitoring: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("model_scan")
            @ExcludeMissing
            modelScan: JsonField<Boolean> = JsonMissing.of(),
        ) : this(attackMonitoring, modelScan, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attackMonitoring(): Optional<Boolean> =
            attackMonitoring.getOptional("attack_monitoring")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelScan(): Optional<Boolean> = modelScan.getOptional("model_scan")

        /**
         * Returns the raw JSON value of [attackMonitoring].
         *
         * Unlike [attackMonitoring], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attack_monitoring")
        @ExcludeMissing
        fun _attackMonitoring(): JsonField<Boolean> = attackMonitoring

        /**
         * Returns the raw JSON value of [modelScan].
         *
         * Unlike [modelScan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_scan") @ExcludeMissing fun _modelScan(): JsonField<Boolean> = modelScan

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

            /** Returns a mutable builder for constructing an instance of [SecurityPosture]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SecurityPosture]. */
        class Builder internal constructor() {

            private var attackMonitoring: JsonField<Boolean> = JsonMissing.of()
            private var modelScan: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(securityPosture: SecurityPosture) = apply {
                attackMonitoring = securityPosture.attackMonitoring
                modelScan = securityPosture.modelScan
                additionalProperties = securityPosture.additionalProperties.toMutableMap()
            }

            fun attackMonitoring(attackMonitoring: Boolean) =
                attackMonitoring(JsonField.of(attackMonitoring))

            /**
             * Sets [Builder.attackMonitoring] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attackMonitoring] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attackMonitoring(attackMonitoring: JsonField<Boolean>) = apply {
                this.attackMonitoring = attackMonitoring
            }

            fun modelScan(modelScan: Boolean) = modelScan(JsonField.of(modelScan))

            /**
             * Sets [Builder.modelScan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelScan] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelScan(modelScan: JsonField<Boolean>) = apply { this.modelScan = modelScan }

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
             * Returns an immutable instance of [SecurityPosture].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SecurityPosture =
                SecurityPosture(attackMonitoring, modelScan, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SecurityPosture = apply {
            if (validated) {
                return@apply
            }

            attackMonitoring()
            modelScan()
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
            (if (attackMonitoring.asKnown().isPresent) 1 else 0) +
                (if (modelScan.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SecurityPosture &&
                attackMonitoring == other.attackMonitoring &&
                modelScan == other.modelScan &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(attackMonitoring, modelScan, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SecurityPosture{attackMonitoring=$attackMonitoring, modelScan=$modelScan, additionalProperties=$additionalProperties}"
    }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

        return other is CardListResponse &&
            createdAt == other.createdAt &&
            modelId == other.modelId &&
            plaintextName == other.plaintextName &&
            source == other.source &&
            activeVersionCount == other.activeVersionCount &&
            attackMonitoringThreatLevel == other.attackMonitoringThreatLevel &&
            hasGenealogy == other.hasGenealogy &&
            modelScanThreatLevel == other.modelScanThreatLevel &&
            securityPosture == other.securityPosture &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            createdAt,
            modelId,
            plaintextName,
            source,
            activeVersionCount,
            attackMonitoringThreatLevel,
            hasGenealogy,
            modelScanThreatLevel,
            securityPosture,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardListResponse{createdAt=$createdAt, modelId=$modelId, plaintextName=$plaintextName, source=$source, activeVersionCount=$activeVersionCount, attackMonitoringThreatLevel=$attackMonitoringThreatLevel, hasGenealogy=$hasGenealogy, modelScanThreatLevel=$modelScanThreatLevel, securityPosture=$securityPosture, tags=$tags, additionalProperties=$additionalProperties}"
}
