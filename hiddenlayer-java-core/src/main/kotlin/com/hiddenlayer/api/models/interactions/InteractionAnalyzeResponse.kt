// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.Enum
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
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val analysis: JsonField<List<Analysis>>,
    private val analyzedData: JsonField<AnalyzedData>,
    private val metadata: JsonField<Metadata>,
    private val modifiedData: JsonField<ModifiedData>,
    private val evaluation: JsonField<Evaluation>,
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
        @JsonProperty("evaluation")
        @ExcludeMissing
        evaluation: JsonField<Evaluation> = JsonMissing.of(),
    ) : this(analysis, analyzedData, metadata, modifiedData, evaluation, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun analysis(): List<Analysis> = analysis.getRequired("analysis")

    /**
     * The language model input and/or output that was analyzed.
     *
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
     * The potentially modified language model input and output after applying any redactions or
     * modifications based on the analysis.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiedData(): ModifiedData = modifiedData.getRequired("modified_data")

    /**
     * The evaluation of the analysis results.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluation(): Optional<Evaluation> = evaluation.getOptional("evaluation")

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

    /**
     * Returns the raw JSON value of [evaluation].
     *
     * Unlike [evaluation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evaluation")
    @ExcludeMissing
    fun _evaluation(): JsonField<Evaluation> = evaluation

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
        private var evaluation: JsonField<Evaluation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interactionAnalyzeResponse: InteractionAnalyzeResponse) = apply {
            analysis = interactionAnalyzeResponse.analysis.map { it.toMutableList() }
            analyzedData = interactionAnalyzeResponse.analyzedData
            metadata = interactionAnalyzeResponse.metadata
            modifiedData = interactionAnalyzeResponse.modifiedData
            evaluation = interactionAnalyzeResponse.evaluation
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

        /** The language model input and/or output that was analyzed. */
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

        /**
         * The potentially modified language model input and output after applying any redactions or
         * modifications based on the analysis.
         */
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

        /** The evaluation of the analysis results. */
        fun evaluation(evaluation: Evaluation) = evaluation(JsonField.of(evaluation))

        /**
         * Sets [Builder.evaluation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluation] with a well-typed [Evaluation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluation(evaluation: JsonField<Evaluation>) = apply { this.evaluation = evaluation }

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
                evaluation,
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
        evaluation().ifPresent { it.validate() }
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
            (modifiedData.asKnown().getOrNull()?.validity() ?: 0) +
            (evaluation.asKnown().getOrNull()?.validity() ?: 0)

    class Analysis
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * The unique identifier for the analyzer.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The configuration settings used for the analyzer.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun configuration(): Configuration = configuration.getRequired("configuration")

        /**
         * Indicates the analysis resulted in a detection.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detected(): Boolean = detected.getRequired("detected")

        /**
         * The frameworks and associated findings for the analysis.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun findings(): Findings = findings.getRequired("findings")

        /**
         * The name of the analysis performed.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The phase of the analysis (i.e. input or output).
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phase(): String = phase.getRequired("phase")

        /**
         * The time taken to perform this specific analysis.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun processingTimeMs(): Double = processingTimeMs.getRequired("processing_time_ms")

        /**
         * The version of the analysis performed.
         *
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

            /** The unique identifier for the analyzer. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The configuration settings used for the analyzer. */
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

            /** Indicates the analysis resulted in a detection. */
            fun detected(detected: Boolean) = detected(JsonField.of(detected))

            /**
             * Sets [Builder.detected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detected] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detected(detected: JsonField<Boolean>) = apply { this.detected = detected }

            /** The frameworks and associated findings for the analysis. */
            fun findings(findings: Findings) = findings(JsonField.of(findings))

            /**
             * Sets [Builder.findings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.findings] with a well-typed [Findings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun findings(findings: JsonField<Findings>) = apply { this.findings = findings }

            /** The name of the analysis performed. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The phase of the analysis (i.e. input or output). */
            fun phase(phase: String) = phase(JsonField.of(phase))

            /**
             * Sets [Builder.phase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phase] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phase(phase: JsonField<String>) = apply { this.phase = phase }

            /** The time taken to perform this specific analysis. */
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

            /** The version of the analysis performed. */
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

        /** The configuration settings used for the analyzer. */
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

        /** The frameworks and associated findings for the analysis. */
        class Findings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
             * The taxonomies for the detections.
             *
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

                /** The taxonomies for the detections. */
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

            /** The taxonomies for the detections. */
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

    /** The language model input and/or output that was analyzed. */
    class AnalyzedData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val input: JsonField<Input>,
        private val output: JsonField<Output>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonField<Output> = JsonMissing.of(),
        ) : this(input, output, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun input(): Input = input.getRequired("input")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun output(): Optional<Output> = output.getOptional("output")

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

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

            private var input: JsonField<Input>? = null
            private var output: JsonField<Output> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(analyzedData: AnalyzedData) = apply {
                input = analyzedData.input
                output = analyzedData.output
                additionalProperties = analyzedData.additionalProperties.toMutableMap()
            }

            fun input(input: Input) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed [Input] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun input(input: JsonField<Input>) = apply { this.input = input }

            fun output(output: Output) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [Output] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<Output>) = apply { this.output = output }

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

        class Input
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of()
            ) : this(messages, mutableMapOf())

            /**
             * The list of messages as input to a language model.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun messages(): Optional<List<Message>> = messages.getOptional("messages")

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

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

                /** Returns a mutable builder for constructing an instance of [Input]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Input]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(input: Input) = apply {
                    messages = input.messages.map { it.toMutableList() }
                    additionalProperties = input.additionalProperties.toMutableMap()
                }

                /** The list of messages as input to a language model. */
                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                /**
                 * Sets [Builder.messages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messages] with a well-typed `List<Message>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messages(messages: JsonField<List<Message>>) = apply {
                    this.messages = messages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Message] to [messages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMessage(message: Message) = apply {
                    messages =
                        (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
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
                 * Returns an immutable instance of [Input].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Input =
                    Input(
                        (messages ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Input = apply {
                if (validated) {
                    return@apply
                }

                messages().ifPresent { it.forEach { it.validate() } }
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val role: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, mutableMapOf())

                /**
                 * The textual content of the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * The role of the message sender (e.g., user, assistant, system).
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun role(): Optional<String> = role.getOptional("role")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var role: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /** The textual content of the message. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** The role of the message sender (e.g., user, assistant, system). */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            role,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        (if (role.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, role, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Input &&
                    messages == other.messages &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(messages, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Input{messages=$messages, additionalProperties=$additionalProperties}"
        }

        class Output
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of()
            ) : this(messages, mutableMapOf())

            /**
             * The list of messages as output from a language model.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun messages(): Optional<List<Message>> = messages.getOptional("messages")

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

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

                /** Returns a mutable builder for constructing an instance of [Output]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Output]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(output: Output) = apply {
                    messages = output.messages.map { it.toMutableList() }
                    additionalProperties = output.additionalProperties.toMutableMap()
                }

                /** The list of messages as output from a language model. */
                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                /**
                 * Sets [Builder.messages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messages] with a well-typed `List<Message>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messages(messages: JsonField<List<Message>>) = apply {
                    this.messages = messages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Message] to [messages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMessage(message: Message) = apply {
                    messages =
                        (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
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
                 * Returns an immutable instance of [Output].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Output =
                    Output(
                        (messages ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Output = apply {
                if (validated) {
                    return@apply
                }

                messages().ifPresent { it.forEach { it.validate() } }
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val role: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, mutableMapOf())

                /**
                 * The textual content of the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * The role of the message sender (e.g., user, assistant, system).
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun role(): Optional<String> = role.getOptional("role")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var role: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /** The textual content of the message. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** The role of the message sender (e.g., user, assistant, system). */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            role,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        (if (role.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, role, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Output &&
                    messages == other.messages &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(messages, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Output{messages=$messages, additionalProperties=$additionalProperties}"
        }

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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * The language model from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * The total time taken to perform the analysis.
         *
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
         * The provider of the language model from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * The identifier for the entity from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requesterId(): String = requesterId.getRequired("requester_id")

        /**
         * The timestamp when the analysis was performed.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun analyzedAt(): Optional<OffsetDateTime> = analyzedAt.getOptional("analyzed_at")

        /**
         * The unique identifier for the analysis event.
         *
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

            /** The language model from the request. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The total time taken to perform the analysis. */
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

            /** The provider of the language model from the request. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** The identifier for the entity from the request. */
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

            /** The timestamp when the analysis was performed. */
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

            /** The unique identifier for the analysis event. */
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
             * A custom alias for the Project.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun projectAlias(): Optional<String> = projectAlias.getOptional("project_alias")

            /**
             * The unique identifier for the Project.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun projectId(): Optional<String> = projectId.getOptional("project_id")

            /**
             * The unique identifier for the Ruleset associated with the Project.
             *
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

                /** A custom alias for the Project. */
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

                /** The unique identifier for the Project. */
                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                /** The unique identifier for the Ruleset associated with the Project. */
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

    /**
     * The potentially modified language model input and output after applying any redactions or
     * modifications based on the analysis.
     */
    class ModifiedData
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val input: JsonField<Input>,
        private val output: JsonField<Output>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("input") @ExcludeMissing input: JsonField<Input> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonField<Output> = JsonMissing.of(),
        ) : this(input, output, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun input(): Input = input.getRequired("input")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun output(): Output = output.getRequired("output")

        /**
         * Returns the raw JSON value of [input].
         *
         * Unlike [input], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input") @ExcludeMissing fun _input(): JsonField<Input> = input

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<Output> = output

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

            private var input: JsonField<Input>? = null
            private var output: JsonField<Output>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modifiedData: ModifiedData) = apply {
                input = modifiedData.input
                output = modifiedData.output
                additionalProperties = modifiedData.additionalProperties.toMutableMap()
            }

            fun input(input: Input) = input(JsonField.of(input))

            /**
             * Sets [Builder.input] to an arbitrary JSON value.
             *
             * You should usually call [Builder.input] with a well-typed [Input] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun input(input: JsonField<Input>) = apply { this.input = input }

            fun output(output: Output) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [Output] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<Output>) = apply { this.output = output }

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

        class Input
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of()
            ) : this(messages, mutableMapOf())

            /**
             * The list of messages as input to a language model.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun messages(): Optional<List<Message>> = messages.getOptional("messages")

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

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

                /** Returns a mutable builder for constructing an instance of [Input]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Input]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(input: Input) = apply {
                    messages = input.messages.map { it.toMutableList() }
                    additionalProperties = input.additionalProperties.toMutableMap()
                }

                /** The list of messages as input to a language model. */
                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                /**
                 * Sets [Builder.messages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messages] with a well-typed `List<Message>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messages(messages: JsonField<List<Message>>) = apply {
                    this.messages = messages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Message] to [messages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMessage(message: Message) = apply {
                    messages =
                        (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
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
                 * Returns an immutable instance of [Input].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Input =
                    Input(
                        (messages ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Input = apply {
                if (validated) {
                    return@apply
                }

                messages().ifPresent { it.forEach { it.validate() } }
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val role: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, mutableMapOf())

                /**
                 * The textual content of the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * The role of the message sender (e.g., user, assistant, system).
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun role(): Optional<String> = role.getOptional("role")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var role: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /** The textual content of the message. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** The role of the message sender (e.g., user, assistant, system). */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            role,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        (if (role.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, role, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Input &&
                    messages == other.messages &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(messages, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Input{messages=$messages, additionalProperties=$additionalProperties}"
        }

        class Output
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of()
            ) : this(messages, mutableMapOf())

            /**
             * The list of messages as output from a language model.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun messages(): Optional<List<Message>> = messages.getOptional("messages")

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

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

                /** Returns a mutable builder for constructing an instance of [Output]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Output]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(output: Output) = apply {
                    messages = output.messages.map { it.toMutableList() }
                    additionalProperties = output.additionalProperties.toMutableMap()
                }

                /** The list of messages as output from a language model. */
                fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                /**
                 * Sets [Builder.messages] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messages] with a well-typed `List<Message>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messages(messages: JsonField<List<Message>>) = apply {
                    this.messages = messages.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Message] to [messages].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMessage(message: Message) = apply {
                    messages =
                        (messages ?: JsonField.of(mutableListOf())).also {
                            checkKnown("messages", it).add(message)
                        }
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
                 * Returns an immutable instance of [Output].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Output =
                    Output(
                        (messages ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Output = apply {
                if (validated) {
                    return@apply
                }

                messages().ifPresent { it.forEach { it.validate() } }
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<String>,
                private val role: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                ) : this(content, role, mutableMapOf())

                /**
                 * The textual content of the message.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): String = content.getRequired("content")

                /**
                 * The role of the message sender (e.g., user, assistant, system).
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun role(): Optional<String> = role.getOptional("role")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

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
                     * Returns a mutable builder for constructing an instance of [Message].
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<String>? = null
                    private var role: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        content = message.content
                        role = message.role
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /** The textual content of the message. */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    /** The role of the message sender (e.g., user, assistant, system). */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content),
                            role,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content()
                    role()
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
                    (if (content.asKnown().isPresent) 1 else 0) +
                        (if (role.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, role, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Output &&
                    messages == other.messages &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(messages, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Output{messages=$messages, additionalProperties=$additionalProperties}"
        }

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

    /** The evaluation of the analysis results. */
    class Evaluation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val hasDetections: JsonField<Boolean>,
        private val threatLevel: JsonField<ThreatLevel>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("has_detections")
            @ExcludeMissing
            hasDetections: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("threat_level")
            @ExcludeMissing
            threatLevel: JsonField<ThreatLevel> = JsonMissing.of(),
        ) : this(action, hasDetections, threatLevel, mutableMapOf())

        /**
         * The action based on interaction analysis and configured tenant security rules.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * Indicates if any detections were found during the analysis.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hasDetections(): Boolean = hasDetections.getRequired("has_detections")

        /**
         * The threat level based on interaction analysis and configured tenant security rules.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun threatLevel(): ThreatLevel = threatLevel.getRequired("threat_level")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [hasDetections].
         *
         * Unlike [hasDetections], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("has_detections")
        @ExcludeMissing
        fun _hasDetections(): JsonField<Boolean> = hasDetections

        /**
         * Returns the raw JSON value of [threatLevel].
         *
         * Unlike [threatLevel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threat_level")
        @ExcludeMissing
        fun _threatLevel(): JsonField<ThreatLevel> = threatLevel

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
             * Returns a mutable builder for constructing an instance of [Evaluation].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .hasDetections()
             * .threatLevel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Evaluation]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var hasDetections: JsonField<Boolean>? = null
            private var threatLevel: JsonField<ThreatLevel>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evaluation: Evaluation) = apply {
                action = evaluation.action
                hasDetections = evaluation.hasDetections
                threatLevel = evaluation.threatLevel
                additionalProperties = evaluation.additionalProperties.toMutableMap()
            }

            /** The action based on interaction analysis and configured tenant security rules. */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** Indicates if any detections were found during the analysis. */
            fun hasDetections(hasDetections: Boolean) = hasDetections(JsonField.of(hasDetections))

            /**
             * Sets [Builder.hasDetections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasDetections] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasDetections(hasDetections: JsonField<Boolean>) = apply {
                this.hasDetections = hasDetections
            }

            /**
             * The threat level based on interaction analysis and configured tenant security rules.
             */
            fun threatLevel(threatLevel: ThreatLevel) = threatLevel(JsonField.of(threatLevel))

            /**
             * Sets [Builder.threatLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threatLevel] with a well-typed [ThreatLevel] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threatLevel(threatLevel: JsonField<ThreatLevel>) = apply {
                this.threatLevel = threatLevel
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
             * Returns an immutable instance of [Evaluation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .hasDetections()
             * .threatLevel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Evaluation =
                Evaluation(
                    checkRequired("action", action),
                    checkRequired("hasDetections", hasDetections),
                    checkRequired("threatLevel", threatLevel),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Evaluation = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            hasDetections()
            threatLevel().validate()
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
            (action.asKnown().getOrNull()?.validity() ?: 0) +
                (if (hasDetections.asKnown().isPresent) 1 else 0) +
                (threatLevel.asKnown().getOrNull()?.validity() ?: 0)

        /** The action based on interaction analysis and configured tenant security rules. */
        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ALLOW = of("Allow")

                @JvmField val ALERT = of("Alert")

                @JvmField val REDACT = of("Redact")

                @JvmField val BLOCK = of("Block")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                ALLOW,
                ALERT,
                REDACT,
                BLOCK,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALLOW,
                ALERT,
                REDACT,
                BLOCK,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
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
                    ALLOW -> Value.ALLOW
                    ALERT -> Value.ALERT
                    REDACT -> Value.REDACT
                    BLOCK -> Value.BLOCK
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
                    ALLOW -> Known.ALLOW
                    ALERT -> Known.ALERT
                    REDACT -> Known.REDACT
                    BLOCK -> Known.BLOCK
                    else -> throw HiddenLayerInvalidDataException("Unknown Action: $value")
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

            fun validate(): Action = apply {
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

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The threat level based on interaction analysis and configured tenant security rules. */
        class ThreatLevel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val NONE = of("None")

                @JvmField val LOW = of("Low")

                @JvmField val MEDIUM = of("Medium")

                @JvmField val HIGH = of("High")

                @JvmField val CRITICAL = of("Critical")

                @JvmStatic fun of(value: String) = ThreatLevel(JsonField.of(value))
            }

            /** An enum containing [ThreatLevel]'s known values. */
            enum class Known {
                NONE,
                LOW,
                MEDIUM,
                HIGH,
                CRITICAL,
            }

            /**
             * An enum containing [ThreatLevel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ThreatLevel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                LOW,
                MEDIUM,
                HIGH,
                CRITICAL,
                /**
                 * An enum member indicating that [ThreatLevel] was instantiated with an unknown
                 * value.
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
                    NONE -> Value.NONE
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
                    CRITICAL -> Value.CRITICAL
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
                    NONE -> Known.NONE
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    CRITICAL -> Known.CRITICAL
                    else -> throw HiddenLayerInvalidDataException("Unknown ThreatLevel: $value")
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

            fun validate(): ThreatLevel = apply {
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

                return other is ThreatLevel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Evaluation &&
                action == other.action &&
                hasDetections == other.hasDetections &&
                threatLevel == other.threatLevel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(action, hasDetections, threatLevel, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Evaluation{action=$action, hasDetections=$hasDetections, threatLevel=$threatLevel, additionalProperties=$additionalProperties}"
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
            evaluation == other.evaluation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            analysis,
            analyzedData,
            metadata,
            modifiedData,
            evaluation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InteractionAnalyzeResponse{analysis=$analysis, analyzedData=$analyzedData, metadata=$metadata, modifiedData=$modifiedData, evaluation=$evaluation, additionalProperties=$additionalProperties}"
}
