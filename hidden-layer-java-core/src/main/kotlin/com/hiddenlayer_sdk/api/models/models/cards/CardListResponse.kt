// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.Enum
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardListResponse
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
         * Returns a mutable builder for constructing an instance of [CardListResponse].
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

    /** A builder for [CardListResponse]. */
    class Builder internal constructor() {

        private var pageNumber: JsonField<Long>? = null
        private var pageSize: JsonField<Long>? = null
        private var results: JsonField<MutableList<Result>>? = null
        private var totalCount: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardListResponse: CardListResponse) = apply {
            pageNumber = cardListResponse.pageNumber
            pageSize = cardListResponse.pageSize
            results = cardListResponse.results.map { it.toMutableList() }
            totalCount = cardListResponse.totalCount
            additionalProperties = cardListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [CardListResponse].
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
        fun build(): CardListResponse =
            CardListResponse(
                checkRequired("pageNumber", pageNumber),
                checkRequired("pageSize", pageSize),
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("totalCount", totalCount),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardListResponse = apply {
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
        private val activeVersions: JsonField<List<Long>>,
        private val createdAt: JsonField<Long>,
        private val modelId: JsonField<String>,
        private val plaintextName: JsonField<String>,
        private val source: JsonField<String>,
        private val attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel>,
        private val modelScanThreatLevel: JsonField<ModelScanThreatLevel>,
        private val securityPosture: JsonField<SecurityPosture>,
        private val tags: JsonField<Tags>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active_versions")
            @ExcludeMissing
            activeVersions: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plaintext_name")
            @ExcludeMissing
            plaintextName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attack_monitoring_threat_level")
            @ExcludeMissing
            attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel> = JsonMissing.of(),
            @JsonProperty("model_scan_threat_level")
            @ExcludeMissing
            modelScanThreatLevel: JsonField<ModelScanThreatLevel> = JsonMissing.of(),
            @JsonProperty("security_posture")
            @ExcludeMissing
            securityPosture: JsonField<SecurityPosture> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
        ) : this(
            activeVersions,
            createdAt,
            modelId,
            plaintextName,
            source,
            attackMonitoringThreatLevel,
            modelScanThreatLevel,
            securityPosture,
            tags,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun activeVersions(): List<Long> = activeVersions.getRequired("active_versions")

        /**
         * Unix Nano Epoch
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
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attackMonitoringThreatLevel(): Optional<AttackMonitoringThreatLevel> =
            attackMonitoringThreatLevel.getOptional("attack_monitoring_threat_level")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelScanThreatLevel(): Optional<ModelScanThreatLevel> =
            modelScanThreatLevel.getOptional("model_scan_threat_level")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun securityPosture(): Optional<SecurityPosture> =
            securityPosture.getOptional("security_posture")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<Tags> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [activeVersions].
         *
         * Unlike [activeVersions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("active_versions")
        @ExcludeMissing
        fun _activeVersions(): JsonField<List<Long>> = activeVersions

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
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

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
         * Returns the raw JSON value of [modelScanThreatLevel].
         *
         * Unlike [modelScanThreatLevel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("model_scan_threat_level")
        @ExcludeMissing
        fun _modelScanThreatLevel(): JsonField<ModelScanThreatLevel> = modelScanThreatLevel

        /**
         * Returns the raw JSON value of [securityPosture].
         *
         * Unlike [securityPosture], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .activeVersions()
             * .createdAt()
             * .modelId()
             * .plaintextName()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var activeVersions: JsonField<MutableList<Long>>? = null
            private var createdAt: JsonField<Long>? = null
            private var modelId: JsonField<String>? = null
            private var plaintextName: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var attackMonitoringThreatLevel: JsonField<AttackMonitoringThreatLevel> =
                JsonMissing.of()
            private var modelScanThreatLevel: JsonField<ModelScanThreatLevel> = JsonMissing.of()
            private var securityPosture: JsonField<SecurityPosture> = JsonMissing.of()
            private var tags: JsonField<Tags> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                activeVersions = result.activeVersions.map { it.toMutableList() }
                createdAt = result.createdAt
                modelId = result.modelId
                plaintextName = result.plaintextName
                source = result.source
                attackMonitoringThreatLevel = result.attackMonitoringThreatLevel
                modelScanThreatLevel = result.modelScanThreatLevel
                securityPosture = result.securityPosture
                tags = result.tags
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun activeVersions(activeVersions: List<Long>) =
                activeVersions(JsonField.of(activeVersions))

            /**
             * Sets [Builder.activeVersions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activeVersions] with a well-typed `List<Long>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun activeVersions(activeVersions: JsonField<List<Long>>) = apply {
                this.activeVersions = activeVersions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [activeVersions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addActiveVersion(activeVersion: Long) = apply {
                activeVersions =
                    (activeVersions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("activeVersions", it).add(activeVersion)
                    }
            }

            /** Unix Nano Epoch */
            fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

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

            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            fun attackMonitoringThreatLevel(
                attackMonitoringThreatLevel: AttackMonitoringThreatLevel
            ) = attackMonitoringThreatLevel(JsonField.of(attackMonitoringThreatLevel))

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

            fun modelScanThreatLevel(modelScanThreatLevel: ModelScanThreatLevel) =
                modelScanThreatLevel(JsonField.of(modelScanThreatLevel))

            /**
             * Sets [Builder.modelScanThreatLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelScanThreatLevel] with a well-typed
             * [ModelScanThreatLevel] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun modelScanThreatLevel(modelScanThreatLevel: JsonField<ModelScanThreatLevel>) =
                apply {
                    this.modelScanThreatLevel = modelScanThreatLevel
                }

            fun securityPosture(securityPosture: SecurityPosture) =
                securityPosture(JsonField.of(securityPosture))

            /**
             * Sets [Builder.securityPosture] to an arbitrary JSON value.
             *
             * You should usually call [Builder.securityPosture] with a well-typed [SecurityPosture]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun securityPosture(securityPosture: JsonField<SecurityPosture>) = apply {
                this.securityPosture = securityPosture
            }

            fun tags(tags: Tags) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [Tags] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .activeVersions()
             * .createdAt()
             * .modelId()
             * .plaintextName()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("activeVersions", activeVersions).map { it.toImmutable() },
                    checkRequired("createdAt", createdAt),
                    checkRequired("modelId", modelId),
                    checkRequired("plaintextName", plaintextName),
                    checkRequired("source", source),
                    attackMonitoringThreatLevel,
                    modelScanThreatLevel,
                    securityPosture,
                    tags,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            activeVersions()
            createdAt()
            modelId()
            plaintextName()
            source()
            attackMonitoringThreatLevel().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (activeVersions.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (modelId.asKnown().isPresent) 1 else 0) +
                (if (plaintextName.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (attackMonitoringThreatLevel.asKnown().getOrNull()?.validity() ?: 0) +
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [AttackMonitoringThreatLevel]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [AttackMonitoringThreatLevel] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SAFE,
                UNSAFE,
                SUSPICIOUS,
                NOT_AVAILABLE,
                /**
                 * An enum member indicating that [AttackMonitoringThreatLevel] was instantiated
                 * with an unknown value.
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
                    SAFE -> Value.SAFE
                    UNSAFE -> Value.UNSAFE
                    SUSPICIOUS -> Value.SUSPICIOUS
                    NOT_AVAILABLE -> Value.NOT_AVAILABLE
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

                return /* spotless:off */ other is AttackMonitoringThreatLevel && value == other.value /* spotless:on */
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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An instance of [ModelScanThreatLevel] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HiddenLayerInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SAFE -> Known.SAFE
                    UNSAFE -> Known.UNSAFE
                    SUSPICIOUS -> Known.SUSPICIOUS
                    NOT_AVAILABLE -> Known.NOT_AVAILABLE
                    else ->
                        throw HiddenLayerInvalidDataException(
                            "Unknown ModelScanThreatLevel: $value"
                        )
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

                return /* spotless:off */ other is ModelScanThreatLevel && value == other.value /* spotless:on */
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
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun attackMonitoring(): Optional<Boolean> =
                attackMonitoring.getOptional("attack_monitoring")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun modelScan(): Optional<Boolean> = modelScan.getOptional("model_scan")

            /**
             * Returns the raw JSON value of [attackMonitoring].
             *
             * Unlike [attackMonitoring], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("attack_monitoring")
            @ExcludeMissing
            fun _attackMonitoring(): JsonField<Boolean> = attackMonitoring

            /**
             * Returns the raw JSON value of [modelScan].
             *
             * Unlike [modelScan], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_scan")
            @ExcludeMissing
            fun _modelScan(): JsonField<Boolean> = modelScan

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
                 * You should usually call [Builder.attackMonitoring] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun attackMonitoring(attackMonitoring: JsonField<Boolean>) = apply {
                    this.attackMonitoring = attackMonitoring
                }

                fun modelScan(modelScan: Boolean) = modelScan(JsonField.of(modelScan))

                /**
                 * Sets [Builder.modelScan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelScan] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelScan(modelScan: JsonField<Boolean>) = apply { this.modelScan = modelScan }

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
                 * Returns an immutable instance of [SecurityPosture].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SecurityPosture =
                    SecurityPosture(
                        attackMonitoring,
                        modelScan,
                        additionalProperties.toMutableMap(),
                    )
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

                return /* spotless:off */ other is SecurityPosture && attackMonitoring == other.attackMonitoring && modelScan == other.modelScan && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attackMonitoring, modelScan, additionalProperties) }
            /* spotless:on */

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

                return /* spotless:off */ other is Tags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Tags{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && activeVersions == other.activeVersions && createdAt == other.createdAt && modelId == other.modelId && plaintextName == other.plaintextName && source == other.source && attackMonitoringThreatLevel == other.attackMonitoringThreatLevel && modelScanThreatLevel == other.modelScanThreatLevel && securityPosture == other.securityPosture && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(activeVersions, createdAt, modelId, plaintextName, source, attackMonitoringThreatLevel, modelScanThreatLevel, securityPosture, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{activeVersions=$activeVersions, createdAt=$createdAt, modelId=$modelId, plaintextName=$plaintextName, source=$source, attackMonitoringThreatLevel=$attackMonitoringThreatLevel, modelScanThreatLevel=$modelScanThreatLevel, securityPosture=$securityPosture, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListResponse && pageNumber == other.pageNumber && pageSize == other.pageSize && results == other.results && totalCount == other.totalCount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(pageNumber, pageSize, results, totalCount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardListResponse{pageNumber=$pageNumber, pageSize=$pageSize, results=$results, totalCount=$totalCount, additionalProperties=$additionalProperties}"
}
