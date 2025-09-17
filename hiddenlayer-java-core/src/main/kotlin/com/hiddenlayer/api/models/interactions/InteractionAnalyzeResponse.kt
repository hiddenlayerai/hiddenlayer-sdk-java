// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

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

class InteractionAnalyzeResponse
private constructor(
    private val analysis: JsonField<List<Analysis>>,
    private val analyzedData: JsonField<AnalyzedData>,
    private val metadata: JsonField<Metadata>,
    private val modifiedData: JsonField<ModifiedData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("analysis")
        @ExcludeMissing
        analysis: JsonField<List<Analysis>> = JsonMissing.of(),
        @JsonProperty("analyzed_data")
        @ExcludeMissing
        analyzedData: JsonField<AnalyzedData> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("modified_data")
        @ExcludeMissing
        modifiedData: JsonField<ModifiedData> = JsonMissing.of(),
    ) : this(analysis, analyzedData, metadata, modifiedData, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun analysis(): List<Analysis> = analysis.getRequired("analysis")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun analyzedData(): AnalyzedData = analyzedData.getRequired("analyzed_data")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiedData(): ModifiedData = modifiedData.getRequired("modified_data")

    /**
     * Returns the raw JSON value of [analysis].
     *
     * Unlike [analysis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("analysis") @ExcludeMissing fun _analysis(): JsonField<List<Analysis>> = analysis

    /**
     * Returns the raw JSON value of [analyzedData].
     *
     * Unlike [analyzedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("analyzed_data")
    @ExcludeMissing
    fun _analyzedData(): JsonField<AnalyzedData> = analyzedData

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [modifiedData].
     *
     * Unlike [modifiedData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_data")
    @ExcludeMissing
    fun _modifiedData(): JsonField<ModifiedData> = modifiedData

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
         * Returns a mutable builder for constructing an instance of [InteractionAnalyzeResponse].
         *
         * The following fields are required:
         * ```java
         * .analysis()
         * .analyzedData()
         * .metadata()
         * .modifiedData()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InteractionAnalyzeResponse]. */
    class Builder internal constructor() {

        private var analysis: JsonField<MutableList<Analysis>>? = null
        private var analyzedData: JsonField<AnalyzedData>? = null
        private var metadata: JsonField<Metadata>? = null
        private var modifiedData: JsonField<ModifiedData>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interactionAnalyzeResponse: InteractionAnalyzeResponse) = apply {
            analysis = interactionAnalyzeResponse.analysis.map { it.toMutableList() }
            analyzedData = interactionAnalyzeResponse.analyzedData
            metadata = interactionAnalyzeResponse.metadata
            modifiedData = interactionAnalyzeResponse.modifiedData
            additionalProperties = interactionAnalyzeResponse.additionalProperties.toMutableMap()
        }

        fun analysis(analysis: List<Analysis>) = analysis(JsonField.of(analysis))

        /**
         * Sets [Builder.analysis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analysis] with a well-typed `List<Analysis>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun analysis(analysis: JsonField<List<Analysis>>) = apply {
            this.analysis = analysis.map { it.toMutableList() }
        }

        /**
         * Adds a single [Analysis] to [Builder.analysis].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAnalysis(analysis: Analysis) = apply {
            this.analysis =
                (this.analysis ?: JsonField.of(mutableListOf())).also {
                    checkKnown("analysis", it).add(analysis)
                }
        }

        fun analyzedData(analyzedData: AnalyzedData) = analyzedData(JsonField.of(analyzedData))

        /**
         * Sets [Builder.analyzedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.analyzedData] with a well-typed [AnalyzedData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun analyzedData(analyzedData: JsonField<AnalyzedData>) = apply {
            this.analyzedData = analyzedData
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun modifiedData(modifiedData: ModifiedData) = modifiedData(JsonField.of(modifiedData))

        /**
         * Sets [Builder.modifiedData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedData] with a well-typed [ModifiedData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedData(modifiedData: JsonField<ModifiedData>) = apply {
            this.modifiedData = modifiedData
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
         * Returns an immutable instance of [InteractionAnalyzeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .analysis()
         * .analyzedData()
         * .metadata()
         * .modifiedData()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InteractionAnalyzeResponse =
            InteractionAnalyzeResponse(
                checkRequired("analysis", analysis).map { it.toImmutable() },
                checkRequired("analyzedData", analyzedData),
                checkRequired("metadata", metadata),
                checkRequired("modifiedData", modifiedData),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InteractionAnalyzeResponse = apply {
        if (validated) {
            return@apply
        }

        analysis().forEach { it.validate() }
        analyzedData().validate()
        metadata().validate()
        modifiedData().validate()
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
        (analysis.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (analyzedData.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (modifiedData.asKnown().getOrNull()?.validity() ?: 0)

    class Analysis
    private constructor(
        private val id: JsonField<String>,
        private val configuration: JsonField<Configuration>,
        private val detected: JsonField<Boolean>,
        private val findings: JsonField<Findings>,
        private val name: JsonField<String>,
        private val phase: JsonField<String>,
        private val processingTimeMs: JsonField<Double>,
        private val version: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("detected")
            @ExcludeMissing
            detected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("findings")
            @ExcludeMissing
            findings: JsonField<Findings> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phase") @ExcludeMissing phase: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_time_ms")
            @ExcludeMissing
            processingTimeMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            configuration,
            detected,
            findings,
            name,
            phase,
            processingTimeMs,
            version,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configuration(): Configuration = configuration.getRequired("configuration")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detected(): Boolean = detected.getRequired("detected")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun findings(): Findings = findings.getRequired("findings")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phase(): String = phase.getRequired("phase")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun processingTimeMs(): Double = processingTimeMs.getRequired("processing_time_ms")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): String = version.getRequired("version")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [detected].
         *
         * Unlike [detected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detected") @ExcludeMissing fun _detected(): JsonField<Boolean> = detected

        /**
         * Returns the raw JSON value of [findings].
         *
         * Unlike [findings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("findings") @ExcludeMissing fun _findings(): JsonField<Findings> = findings

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [phase].
         *
         * Unlike [phase], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<String> = phase

        /**
         * Returns the raw JSON value of [processingTimeMs].
         *
         * Unlike [processingTimeMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processing_time_ms")
        @ExcludeMissing
        fun _processingTimeMs(): JsonField<Double> = processingTimeMs

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
             * Returns a mutable builder for constructing an instance of [Analysis].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .configuration()
             * .detected()
             * .findings()
             * .name()
             * .phase()
             * .processingTimeMs()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Analysis]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var configuration: JsonField<Configuration>? = null
            private var detected: JsonField<Boolean>? = null
            private var findings: JsonField<Findings>? = null
            private var name: JsonField<String>? = null
            private var phase: JsonField<String>? = null
            private var processingTimeMs: JsonField<Double>? = null
            private var version: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(analysis: Analysis) = apply {
                id = analysis.id
                configuration = analysis.configuration
                detected = analysis.detected
                findings = analysis.findings
                name = analysis.name
                phase = analysis.phase
                processingTimeMs = analysis.processingTimeMs
                version = analysis.version
                additionalProperties = analysis.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            fun detected(detected: Boolean) = detected(JsonField.of(detected))

            /**
             * Sets [Builder.detected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detected] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detected(detected: JsonField<Boolean>) = apply { this.detected = detected }

            fun findings(findings: Findings) = findings(JsonField.of(findings))

            /**
             * Sets [Builder.findings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.findings] with a well-typed [Findings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun findings(findings: JsonField<Findings>) = apply { this.findings = findings }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun phase(phase: String) = phase(JsonField.of(phase))

            /**
             * Sets [Builder.phase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phase(phase: JsonField<String>) = apply { this.phase = phase }

            fun processingTimeMs(processingTimeMs: Double) =
                processingTimeMs(JsonField.of(processingTimeMs))

            /**
             * Sets [Builder.processingTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingTimeMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processingTimeMs(processingTimeMs: JsonField<Double>) = apply {
                this.processingTimeMs = processingTimeMs
            }

            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

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
             * Returns an immutable instance of [Analysis].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .configuration()
             * .detected()
             * .findings()
             * .name()
             * .phase()
             * .processingTimeMs()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Analysis =
                Analysis(
                    checkRequired("id", id),
                    checkRequired("configuration", configuration),
                    checkRequired("detected", detected),
                    checkRequired("findings", findings),
                    checkRequired("name", name),
                    checkRequired("phase", phase),
                    checkRequired("processingTimeMs", processingTimeMs),
                    checkRequired("version", version),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Analysis = apply {
            if (validated) {
                return@apply
            }

            id()
            configuration().validate()
            detected()
            findings().validate()
            name()
            phase()
            processingTimeMs()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (detected.asKnown().isPresent) 1 else 0) +
                (findings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (phase.asKnown().isPresent) 1 else 0) +
                (if (processingTimeMs.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        class Configuration
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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    additionalProperties = configuration.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Configuration = apply {
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

                return other is Configuration && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        class Findings
        private constructor(
            private val frameworks: JsonField<Frameworks>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("frameworks")
                @ExcludeMissing
                frameworks: JsonField<Frameworks> = JsonMissing.of()
            ) : this(frameworks, mutableMapOf())

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frameworks(): Frameworks = frameworks.getRequired("frameworks")

            /**
             * Returns the raw JSON value of [frameworks].
             *
             * Unlike [frameworks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frameworks")
            @ExcludeMissing
            fun _frameworks(): JsonField<Frameworks> = frameworks

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
                 * Returns a mutable builder for constructing an instance of [Findings].
                 *
                 * The following fields are required:
                 * ```java
                 * .frameworks()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Findings]. */
            class Builder internal constructor() {

                private var frameworks: JsonField<Frameworks>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(findings: Findings) = apply {
                    frameworks = findings.frameworks
                    additionalProperties = findings.additionalProperties.toMutableMap()
                }

                fun frameworks(frameworks: Frameworks) = frameworks(JsonField.of(frameworks))

                /**
                 * Sets [Builder.frameworks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frameworks] with a well-typed [Frameworks] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun frameworks(frameworks: JsonField<Frameworks>) = apply {
                    this.frameworks = frameworks
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
                 * Returns an immutable instance of [Findings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .frameworks()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Findings =
                    Findings(
                        checkRequired("frameworks", frameworks),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Findings = apply {
                if (validated) {
                    return@apply
                }

                frameworks().validate()
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
            internal fun validity(): Int = (frameworks.asKnown().getOrNull()?.validity() ?: 0)

            class Frameworks
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

                    /** Returns a mutable builder for constructing an instance of [Frameworks]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Frameworks]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(frameworks: Frameworks) = apply {
                        additionalProperties = frameworks.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Frameworks].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Frameworks = Frameworks(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Frameworks = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Frameworks && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Frameworks{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Findings &&
                    frameworks == other.frameworks &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(frameworks, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Findings{frameworks=$frameworks, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Analysis &&
                id == other.id &&
                configuration == other.configuration &&
                detected == other.detected &&
                findings == other.findings &&
                name == other.name &&
                phase == other.phase &&
                processingTimeMs == other.processingTimeMs &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                configuration,
                detected,
                findings,
                name,
                phase,
                processingTimeMs,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Analysis{id=$id, configuration=$configuration, detected=$detected, findings=$findings, name=$name, phase=$phase, processingTimeMs=$processingTimeMs, version=$version, additionalProperties=$additionalProperties}"
    }

    class AnalyzedData
    private constructor(
        private val input: JsonField<InteractionsInput>,
        private val output: JsonField<InteractionsOutput>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input")
            @ExcludeMissing
            input: JsonField<InteractionsInput> = JsonMissing.of(),
            @JsonProperty("output")
            @ExcludeMissing
            output: JsonField<InteractionsOutput> = JsonMissing.of(),
        ) : this(input, output, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun input(): InteractionsInput = input.getRequired("input")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun output(): Optional<InteractionsOutput> = output.getOptional("output")

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<InteractionsInput> = input

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output")
        @ExcludeMissing
        fun _output(): JsonField<InteractionsOutput> = output

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
             * Returns a mutable builder for constructing an instance of [AnalyzedData].
             *
             * The following fields are required:
             * ```java
             * .input()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AnalyzedData]. */
        class Builder internal constructor() {

            private var input: JsonField<InteractionsInput>? = null
            private var output: JsonField<InteractionsOutput> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(analyzedData: AnalyzedData) = apply {
                input = analyzedData.input
                output = analyzedData.output
                additionalProperties = analyzedData.additionalProperties.toMutableMap()
            }

            fun input(input: InteractionsInput) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed [InteractionsInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun input(input: JsonField<InteractionsInput>) = apply { this.input = input }

            fun output(output: InteractionsOutput) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [InteractionsOutput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<InteractionsOutput>) = apply { this.output = output }

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
             * Returns an immutable instance of [AnalyzedData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .input()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AnalyzedData =
                AnalyzedData(
                    checkRequired("input", input),
                    output,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AnalyzedData = apply {
            if (validated) {
                return@apply
            }

            input().validate()
            output().ifPresent { it.validate() }
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
            (input.asKnown().getOrNull()?.validity() ?: 0) +
                (output.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnalyzedData &&
                input == other.input &&
                output == other.output &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(input, output, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AnalyzedData{input=$input, output=$output, additionalProperties=$additionalProperties}"
    }

    class Metadata
    private constructor(
        private val model: JsonField<String>,
        private val processingTimeMs: JsonField<Double>,
        private val project: JsonField<Project>,
        private val provider: JsonField<String>,
        private val requesterId: JsonField<String>,
        private val analyzedAt: JsonField<OffsetDateTime>,
        private val eventId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_time_ms")
            @ExcludeMissing
            processingTimeMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("project") @ExcludeMissing project: JsonField<Project> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requester_id")
            @ExcludeMissing
            requesterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("analyzed_at")
            @ExcludeMissing
            analyzedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("event_id") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        ) : this(
            model,
            processingTimeMs,
            project,
            provider,
            requesterId,
            analyzedAt,
            eventId,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun processingTimeMs(): Double = processingTimeMs.getRequired("processing_time_ms")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun project(): Project = project.getRequired("project")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requesterId(): String = requesterId.getRequired("requester_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun analyzedAt(): Optional<OffsetDateTime> = analyzedAt.getOptional("analyzed_at")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun eventId(): Optional<String> = eventId.getOptional("event_id")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [processingTimeMs].
         *
         * Unlike [processingTimeMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("processing_time_ms")
        @ExcludeMissing
        fun _processingTimeMs(): JsonField<Double> = processingTimeMs

        /**
         * Returns the raw JSON value of [project].
         *
         * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<Project> = project

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [requesterId].
         *
         * Unlike [requesterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requester_id")
        @ExcludeMissing
        fun _requesterId(): JsonField<String> = requesterId

        /**
         * Returns the raw JSON value of [analyzedAt].
         *
         * Unlike [analyzedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("analyzed_at")
        @ExcludeMissing
        fun _analyzedAt(): JsonField<OffsetDateTime> = analyzedAt

        /**
         * Returns the raw JSON value of [eventId].
         *
         * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("event_id") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

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
             * Returns a mutable builder for constructing an instance of [Metadata].
             *
             * The following fields are required:
             * ```java
             * .model()
             * .processingTimeMs()
             * .project()
             * .provider()
             * .requesterId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var processingTimeMs: JsonField<Double>? = null
            private var project: JsonField<Project>? = null
            private var provider: JsonField<String>? = null
            private var requesterId: JsonField<String>? = null
            private var analyzedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                model = metadata.model
                processingTimeMs = metadata.processingTimeMs
                project = metadata.project
                provider = metadata.provider
                requesterId = metadata.requesterId
                analyzedAt = metadata.analyzedAt
                eventId = metadata.eventId
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun processingTimeMs(processingTimeMs: Double) =
                processingTimeMs(JsonField.of(processingTimeMs))

            /**
             * Sets [Builder.processingTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingTimeMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processingTimeMs(processingTimeMs: JsonField<Double>) = apply {
                this.processingTimeMs = processingTimeMs
            }

            fun project(project: Project) = project(JsonField.of(project))

            /**
             * Sets [Builder.project] to an arbitrary JSON value.
             *
             * You should usually call [Builder.project] with a well-typed [Project] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun project(project: JsonField<Project>) = apply { this.project = project }

            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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

            fun analyzedAt(analyzedAt: OffsetDateTime) = analyzedAt(JsonField.of(analyzedAt))

            /**
             * Sets [Builder.analyzedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.analyzedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun analyzedAt(analyzedAt: JsonField<OffsetDateTime>) = apply {
                this.analyzedAt = analyzedAt
            }

            fun eventId(eventId: String) = eventId(JsonField.of(eventId))

            /**
             * Sets [Builder.eventId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * .processingTimeMs()
             * .project()
             * .provider()
             * .requesterId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("model", model),
                    checkRequired("processingTimeMs", processingTimeMs),
                    checkRequired("project", project),
                    checkRequired("provider", provider),
                    checkRequired("requesterId", requesterId),
                    analyzedAt,
                    eventId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            model()
            processingTimeMs()
            project().validate()
            provider()
            requesterId()
            analyzedAt()
            eventId()
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
            (if (model.asKnown().isPresent) 1 else 0) +
                (if (processingTimeMs.asKnown().isPresent) 1 else 0) +
                (project.asKnown().getOrNull()?.validity() ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (requesterId.asKnown().isPresent) 1 else 0) +
                (if (analyzedAt.asKnown().isPresent) 1 else 0) +
                (if (eventId.asKnown().isPresent) 1 else 0)

        class Project
        private constructor(
            private val projectAlias: JsonField<String>,
            private val projectId: JsonField<String>,
            private val rulesetId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("project_alias")
                @ExcludeMissing
                projectAlias: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_id")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ruleset_id")
                @ExcludeMissing
                rulesetId: JsonField<String> = JsonMissing.of(),
            ) : this(projectAlias, projectId, rulesetId, mutableMapOf())

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun projectAlias(): Optional<String> = projectAlias.getOptional("project_alias")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun projectId(): Optional<String> = projectId.getOptional("project_id")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun rulesetId(): Optional<String> = rulesetId.getOptional("ruleset_id")

            /**
             * Returns the raw JSON value of [projectAlias].
             *
             * Unlike [projectAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_alias")
            @ExcludeMissing
            fun _projectAlias(): JsonField<String> = projectAlias

            /**
             * Returns the raw JSON value of [projectId].
             *
             * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_id")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            /**
             * Returns the raw JSON value of [rulesetId].
             *
             * Unlike [rulesetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ruleset_id")
            @ExcludeMissing
            fun _rulesetId(): JsonField<String> = rulesetId

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

                /** Returns a mutable builder for constructing an instance of [Project]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Project]. */
            class Builder internal constructor() {

                private var projectAlias: JsonField<String> = JsonMissing.of()
                private var projectId: JsonField<String> = JsonMissing.of()
                private var rulesetId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(project: Project) = apply {
                    projectAlias = project.projectAlias
                    projectId = project.projectId
                    rulesetId = project.rulesetId
                    additionalProperties = project.additionalProperties.toMutableMap()
                }

                fun projectAlias(projectAlias: String) = projectAlias(JsonField.of(projectAlias))

                /**
                 * Sets [Builder.projectAlias] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectAlias] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectAlias(projectAlias: JsonField<String>) = apply {
                    this.projectAlias = projectAlias
                }

                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                fun rulesetId(rulesetId: String) = rulesetId(JsonField.of(rulesetId))

                /**
                 * Sets [Builder.rulesetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rulesetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rulesetId(rulesetId: JsonField<String>) = apply { this.rulesetId = rulesetId }

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
                 * Returns an immutable instance of [Project].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Project =
                    Project(projectAlias, projectId, rulesetId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Project = apply {
                if (validated) {
                    return@apply
                }

                projectAlias()
                projectId()
                rulesetId()
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
                (if (projectAlias.asKnown().isPresent) 1 else 0) +
                    (if (projectId.asKnown().isPresent) 1 else 0) +
                    (if (rulesetId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Project &&
                    projectAlias == other.projectAlias &&
                    projectId == other.projectId &&
                    rulesetId == other.rulesetId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(projectAlias, projectId, rulesetId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Project{projectAlias=$projectAlias, projectId=$projectId, rulesetId=$rulesetId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                model == other.model &&
                processingTimeMs == other.processingTimeMs &&
                project == other.project &&
                provider == other.provider &&
                requesterId == other.requesterId &&
                analyzedAt == other.analyzedAt &&
                eventId == other.eventId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                model,
                processingTimeMs,
                project,
                provider,
                requesterId,
                analyzedAt,
                eventId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{model=$model, processingTimeMs=$processingTimeMs, project=$project, provider=$provider, requesterId=$requesterId, analyzedAt=$analyzedAt, eventId=$eventId, additionalProperties=$additionalProperties}"
    }

    class ModifiedData
    private constructor(
        private val input: JsonField<InteractionsInput>,
        private val output: JsonField<InteractionsOutput>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input")
            @ExcludeMissing
            input: JsonField<InteractionsInput> = JsonMissing.of(),
            @JsonProperty("output")
            @ExcludeMissing
            output: JsonField<InteractionsOutput> = JsonMissing.of(),
        ) : this(input, output, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun input(): InteractionsInput = input.getRequired("input")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun output(): InteractionsOutput = output.getRequired("output")

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<InteractionsInput> = input

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output")
        @ExcludeMissing
        fun _output(): JsonField<InteractionsOutput> = output

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
             * Returns a mutable builder for constructing an instance of [ModifiedData].
             *
             * The following fields are required:
             * ```java
             * .input()
             * .output()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModifiedData]. */
        class Builder internal constructor() {

            private var input: JsonField<InteractionsInput>? = null
            private var output: JsonField<InteractionsOutput>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modifiedData: ModifiedData) = apply {
                input = modifiedData.input
                output = modifiedData.output
                additionalProperties = modifiedData.additionalProperties.toMutableMap()
            }

            fun input(input: InteractionsInput) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed [InteractionsInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun input(input: JsonField<InteractionsInput>) = apply { this.input = input }

            fun output(output: InteractionsOutput) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [InteractionsOutput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<InteractionsOutput>) = apply { this.output = output }

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
             * Returns an immutable instance of [ModifiedData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .input()
             * .output()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ModifiedData =
                ModifiedData(
                    checkRequired("input", input),
                    checkRequired("output", output),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ModifiedData = apply {
            if (validated) {
                return@apply
            }

            input().validate()
            output().validate()
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
            (input.asKnown().getOrNull()?.validity() ?: 0) +
                (output.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModifiedData &&
                input == other.input &&
                output == other.output &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(input, output, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModifiedData{input=$input, output=$output, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InteractionAnalyzeResponse &&
            analysis == other.analysis &&
            analyzedData == other.analyzedData &&
            metadata == other.metadata &&
            modifiedData == other.modifiedData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(analysis, analyzedData, metadata, modifiedData, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InteractionAnalyzeResponse{analysis=$analysis, analyzedData=$analyzedData, metadata=$metadata, modifiedData=$modifiedData, additionalProperties=$additionalProperties}"
}
