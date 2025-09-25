// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.promptanalyzer

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
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PromptAnalyzerCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<Categories>,
    private val elapsedMs: JsonField<Double>,
    private val frameworks: JsonField<Frameworks>,
    private val model: JsonField<String>,
    private val policy: JsonField<Policy>,
    private val provider: JsonField<String>,
    private val response: JsonField<Response>,
    private val results: JsonField<Results>,
    private val upstreamElapsedMs: JsonField<Double>,
    private val verdict: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<Categories> = JsonMissing.of(),
        @JsonProperty("elapsed_ms") @ExcludeMissing elapsedMs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frameworks")
        @ExcludeMissing
        frameworks: JsonField<Frameworks> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("response") @ExcludeMissing response: JsonField<Response> = JsonMissing.of(),
        @JsonProperty("results") @ExcludeMissing results: JsonField<Results> = JsonMissing.of(),
        @JsonProperty("upstream_elapsed_ms")
        @ExcludeMissing
        upstreamElapsedMs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("verdict") @ExcludeMissing verdict: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        categories,
        elapsedMs,
        frameworks,
        model,
        policy,
        provider,
        response,
        results,
        upstreamElapsedMs,
        verdict,
        mutableMapOf(),
    )

    /**
     * The analysis detection categories
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<Categories> = categories.getOptional("categories")

    /**
     * The time in milliseconds it took to process the request
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

    /**
     * The framework labels identified during analysis
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameworks(): Optional<Frameworks> = frameworks.getOptional("frameworks")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * The policy used during analysis
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun policy(): Optional<Policy> = policy.getOptional("policy")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<String> = provider.getOptional("provider")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun response(): Optional<Response> = response.getOptional("response")

    /**
     * The analysis results
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<Results> = results.getOptional("results")

    /**
     * The time in milliseconds the upstream LLM took to process the request
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun upstreamElapsedMs(): Optional<Double> = upstreamElapsedMs.getOptional("upstream_elapsed_ms")

    /**
     * The overall verdict of the analysis
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<Categories> = categories

    /**
     * Returns the raw JSON value of [elapsedMs].
     *
     * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elapsed_ms") @ExcludeMissing fun _elapsedMs(): JsonField<Double> = elapsedMs

    /**
     * Returns the raw JSON value of [frameworks].
     *
     * Unlike [frameworks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frameworks")
    @ExcludeMissing
    fun _frameworks(): JsonField<Frameworks> = frameworks

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

    /**
     * Returns the raw JSON value of [response].
     *
     * Unlike [response], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response") @ExcludeMissing fun _response(): JsonField<Response> = response

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<Results> = results

    /**
     * Returns the raw JSON value of [upstreamElapsedMs].
     *
     * Unlike [upstreamElapsedMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("upstream_elapsed_ms")
    @ExcludeMissing
    fun _upstreamElapsedMs(): JsonField<Double> = upstreamElapsedMs

    /**
     * Returns the raw JSON value of [verdict].
     *
     * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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
         * Returns a mutable builder for constructing an instance of [PromptAnalyzerCreateResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptAnalyzerCreateResponse]. */
    class Builder internal constructor() {

        private var categories: JsonField<Categories> = JsonMissing.of()
        private var elapsedMs: JsonField<Double> = JsonMissing.of()
        private var frameworks: JsonField<Frameworks> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var policy: JsonField<Policy> = JsonMissing.of()
        private var provider: JsonField<String> = JsonMissing.of()
        private var response: JsonField<Response> = JsonMissing.of()
        private var results: JsonField<Results> = JsonMissing.of()
        private var upstreamElapsedMs: JsonField<Double> = JsonMissing.of()
        private var verdict: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptAnalyzerCreateResponse: PromptAnalyzerCreateResponse) = apply {
            categories = promptAnalyzerCreateResponse.categories
            elapsedMs = promptAnalyzerCreateResponse.elapsedMs
            frameworks = promptAnalyzerCreateResponse.frameworks
            model = promptAnalyzerCreateResponse.model
            policy = promptAnalyzerCreateResponse.policy
            provider = promptAnalyzerCreateResponse.provider
            response = promptAnalyzerCreateResponse.response
            results = promptAnalyzerCreateResponse.results
            upstreamElapsedMs = promptAnalyzerCreateResponse.upstreamElapsedMs
            verdict = promptAnalyzerCreateResponse.verdict
            additionalProperties = promptAnalyzerCreateResponse.additionalProperties.toMutableMap()
        }

        /** The analysis detection categories */
        fun categories(categories: Categories) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed [Categories] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<Categories>) = apply { this.categories = categories }

        /** The time in milliseconds it took to process the request */
        fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

        /**
         * Sets [Builder.elapsedMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elapsedMs] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

        /** The framework labels identified during analysis */
        fun frameworks(frameworks: Frameworks) = frameworks(JsonField.of(frameworks))

        /**
         * Sets [Builder.frameworks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameworks] with a well-typed [Frameworks] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frameworks(frameworks: JsonField<Frameworks>) = apply { this.frameworks = frameworks }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        /** The policy used during analysis */
        fun policy(policy: Policy) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

        fun provider(provider: String) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { this.provider = provider }

        fun response(response: Response) = response(JsonField.of(response))

        /**
         * Sets [Builder.response] to an arbitrary JSON value.
         *
         * You should usually call [Builder.response] with a well-typed [Response] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun response(response: JsonField<Response>) = apply { this.response = response }

        /** The analysis results */
        fun results(results: Results) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed [Results] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun results(results: JsonField<Results>) = apply { this.results = results }

        /** The time in milliseconds the upstream LLM took to process the request */
        fun upstreamElapsedMs(upstreamElapsedMs: Double) =
            upstreamElapsedMs(JsonField.of(upstreamElapsedMs))

        /**
         * Sets [Builder.upstreamElapsedMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upstreamElapsedMs] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun upstreamElapsedMs(upstreamElapsedMs: JsonField<Double>) = apply {
            this.upstreamElapsedMs = upstreamElapsedMs
        }

        /** The overall verdict of the analysis */
        fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

        /**
         * Sets [Builder.verdict] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verdict] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
         * Returns an immutable instance of [PromptAnalyzerCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PromptAnalyzerCreateResponse =
            PromptAnalyzerCreateResponse(
                categories,
                elapsedMs,
                frameworks,
                model,
                policy,
                provider,
                response,
                results,
                upstreamElapsedMs,
                verdict,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptAnalyzerCreateResponse = apply {
        if (validated) {
            return@apply
        }

        categories().ifPresent { it.validate() }
        elapsedMs()
        frameworks().ifPresent { it.validate() }
        model()
        policy().ifPresent { it.validate() }
        provider()
        response().ifPresent { it.validate() }
        results().ifPresent { it.validate() }
        upstreamElapsedMs()
        verdict()
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
        (categories.asKnown().getOrNull()?.validity() ?: 0) +
            (if (elapsedMs.asKnown().isPresent) 1 else 0) +
            (frameworks.asKnown().getOrNull()?.validity() ?: 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (policy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (provider.asKnown().isPresent) 1 else 0) +
            (response.asKnown().getOrNull()?.validity() ?: 0) +
            (results.asKnown().getOrNull()?.validity() ?: 0) +
            (if (upstreamElapsedMs.asKnown().isPresent) 1 else 0) +
            (if (verdict.asKnown().isPresent) 1 else 0)

    /** The analysis detection categories */
    class Categories
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val guardrail: JsonField<Boolean>,
        private val inputCode: JsonField<Boolean>,
        private val inputDos: JsonField<Boolean>,
        private val inputLanguage: JsonField<Boolean>,
        private val inputPii: JsonField<Boolean>,
        private val outputCode: JsonField<Boolean>,
        private val outputPii: JsonField<Boolean>,
        private val promptInjection: JsonField<Boolean>,
        private val unsafeInput: JsonField<Boolean>,
        private val unsafeOutput: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("guardrail")
            @ExcludeMissing
            guardrail: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("input_code")
            @ExcludeMissing
            inputCode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("input_dos")
            @ExcludeMissing
            inputDos: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("input_language")
            @ExcludeMissing
            inputLanguage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("input_pii")
            @ExcludeMissing
            inputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("output_code")
            @ExcludeMissing
            outputCode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("output_pii")
            @ExcludeMissing
            outputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("prompt_injection")
            @ExcludeMissing
            promptInjection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("unsafe_input")
            @ExcludeMissing
            unsafeInput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("unsafe_output")
            @ExcludeMissing
            unsafeOutput: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            guardrail,
            inputCode,
            inputDos,
            inputLanguage,
            inputPii,
            outputCode,
            outputPii,
            promptInjection,
            unsafeInput,
            unsafeOutput,
            mutableMapOf(),
        )

        /**
         * The input activated the upstream guardrails
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun guardrail(): Optional<Boolean> = guardrail.getOptional("guardrail")

        /**
         * The input contains code
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputCode(): Optional<Boolean> = inputCode.getOptional("input_code")

        /**
         * The input contains a denial of service attack
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputDos(): Optional<Boolean> = inputDos.getOptional("input_dos")

        /**
         * The input contains a disallowed language
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputLanguage(): Optional<Boolean> = inputLanguage.getOptional("input_language")

        /**
         * The input contains personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputPii(): Optional<Boolean> = inputPii.getOptional("input_pii")

        /**
         * The output contains code
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputCode(): Optional<Boolean> = outputCode.getOptional("output_code")

        /**
         * The output contains personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputPii(): Optional<Boolean> = outputPii.getOptional("output_pii")

        /**
         * The input contains prompt injection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptInjection(): Optional<Boolean> = promptInjection.getOptional("prompt_injection")

        /**
         * The input is unsafe
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unsafeInput(): Optional<Boolean> = unsafeInput.getOptional("unsafe_input")

        /**
         * The output is unsafe
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unsafeOutput(): Optional<Boolean> = unsafeOutput.getOptional("unsafe_output")

        /**
         * Returns the raw JSON value of [guardrail].
         *
         * Unlike [guardrail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("guardrail") @ExcludeMissing fun _guardrail(): JsonField<Boolean> = guardrail

        /**
         * Returns the raw JSON value of [inputCode].
         *
         * Unlike [inputCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_code") @ExcludeMissing fun _inputCode(): JsonField<Boolean> = inputCode

        /**
         * Returns the raw JSON value of [inputDos].
         *
         * Unlike [inputDos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_dos") @ExcludeMissing fun _inputDos(): JsonField<Boolean> = inputDos

        /**
         * Returns the raw JSON value of [inputLanguage].
         *
         * Unlike [inputLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_language")
        @ExcludeMissing
        fun _inputLanguage(): JsonField<Boolean> = inputLanguage

        /**
         * Returns the raw JSON value of [inputPii].
         *
         * Unlike [inputPii], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_pii") @ExcludeMissing fun _inputPii(): JsonField<Boolean> = inputPii

        /**
         * Returns the raw JSON value of [outputCode].
         *
         * Unlike [outputCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_code")
        @ExcludeMissing
        fun _outputCode(): JsonField<Boolean> = outputCode

        /**
         * Returns the raw JSON value of [outputPii].
         *
         * Unlike [outputPii], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output_pii") @ExcludeMissing fun _outputPii(): JsonField<Boolean> = outputPii

        /**
         * Returns the raw JSON value of [promptInjection].
         *
         * Unlike [promptInjection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_injection")
        @ExcludeMissing
        fun _promptInjection(): JsonField<Boolean> = promptInjection

        /**
         * Returns the raw JSON value of [unsafeInput].
         *
         * Unlike [unsafeInput], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unsafe_input")
        @ExcludeMissing
        fun _unsafeInput(): JsonField<Boolean> = unsafeInput

        /**
         * Returns the raw JSON value of [unsafeOutput].
         *
         * Unlike [unsafeOutput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unsafe_output")
        @ExcludeMissing
        fun _unsafeOutput(): JsonField<Boolean> = unsafeOutput

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

            /** Returns a mutable builder for constructing an instance of [Categories]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Categories]. */
        class Builder internal constructor() {

            private var guardrail: JsonField<Boolean> = JsonMissing.of()
            private var inputCode: JsonField<Boolean> = JsonMissing.of()
            private var inputDos: JsonField<Boolean> = JsonMissing.of()
            private var inputLanguage: JsonField<Boolean> = JsonMissing.of()
            private var inputPii: JsonField<Boolean> = JsonMissing.of()
            private var outputCode: JsonField<Boolean> = JsonMissing.of()
            private var outputPii: JsonField<Boolean> = JsonMissing.of()
            private var promptInjection: JsonField<Boolean> = JsonMissing.of()
            private var unsafeInput: JsonField<Boolean> = JsonMissing.of()
            private var unsafeOutput: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(categories: Categories) = apply {
                guardrail = categories.guardrail
                inputCode = categories.inputCode
                inputDos = categories.inputDos
                inputLanguage = categories.inputLanguage
                inputPii = categories.inputPii
                outputCode = categories.outputCode
                outputPii = categories.outputPii
                promptInjection = categories.promptInjection
                unsafeInput = categories.unsafeInput
                unsafeOutput = categories.unsafeOutput
                additionalProperties = categories.additionalProperties.toMutableMap()
            }

            /** The input activated the upstream guardrails */
            fun guardrail(guardrail: Boolean) = guardrail(JsonField.of(guardrail))

            /**
             * Sets [Builder.guardrail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrail] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun guardrail(guardrail: JsonField<Boolean>) = apply { this.guardrail = guardrail }

            /** The input contains code */
            fun inputCode(inputCode: Boolean) = inputCode(JsonField.of(inputCode))

            /**
             * Sets [Builder.inputCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputCode(inputCode: JsonField<Boolean>) = apply { this.inputCode = inputCode }

            /** The input contains a denial of service attack */
            fun inputDos(inputDos: Boolean) = inputDos(JsonField.of(inputDos))

            /**
             * Sets [Builder.inputDos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputDos] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputDos(inputDos: JsonField<Boolean>) = apply { this.inputDos = inputDos }

            /** The input contains a disallowed language */
            fun inputLanguage(inputLanguage: Boolean) = inputLanguage(JsonField.of(inputLanguage))

            /**
             * Sets [Builder.inputLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputLanguage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputLanguage(inputLanguage: JsonField<Boolean>) = apply {
                this.inputLanguage = inputLanguage
            }

            /** The input contains personally identifiable information */
            fun inputPii(inputPii: Boolean) = inputPii(JsonField.of(inputPii))

            /**
             * Sets [Builder.inputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputPii] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputPii(inputPii: JsonField<Boolean>) = apply { this.inputPii = inputPii }

            /** The output contains code */
            fun outputCode(outputCode: Boolean) = outputCode(JsonField.of(outputCode))

            /**
             * Sets [Builder.outputCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputCode(outputCode: JsonField<Boolean>) = apply { this.outputCode = outputCode }

            /** The output contains personally identifiable information */
            fun outputPii(outputPii: Boolean) = outputPii(JsonField.of(outputPii))

            /**
             * Sets [Builder.outputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputPii] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputPii(outputPii: JsonField<Boolean>) = apply { this.outputPii = outputPii }

            /** The input contains prompt injection */
            fun promptInjection(promptInjection: Boolean) =
                promptInjection(JsonField.of(promptInjection))

            /**
             * Sets [Builder.promptInjection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptInjection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptInjection(promptInjection: JsonField<Boolean>) = apply {
                this.promptInjection = promptInjection
            }

            /** The input is unsafe */
            fun unsafeInput(unsafeInput: Boolean) = unsafeInput(JsonField.of(unsafeInput))

            /**
             * Sets [Builder.unsafeInput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unsafeInput] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unsafeInput(unsafeInput: JsonField<Boolean>) = apply {
                this.unsafeInput = unsafeInput
            }

            /** The output is unsafe */
            fun unsafeOutput(unsafeOutput: Boolean) = unsafeOutput(JsonField.of(unsafeOutput))

            /**
             * Sets [Builder.unsafeOutput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unsafeOutput] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unsafeOutput(unsafeOutput: JsonField<Boolean>) = apply {
                this.unsafeOutput = unsafeOutput
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
             * Returns an immutable instance of [Categories].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Categories =
                Categories(
                    guardrail,
                    inputCode,
                    inputDos,
                    inputLanguage,
                    inputPii,
                    outputCode,
                    outputPii,
                    promptInjection,
                    unsafeInput,
                    unsafeOutput,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Categories = apply {
            if (validated) {
                return@apply
            }

            guardrail()
            inputCode()
            inputDos()
            inputLanguage()
            inputPii()
            outputCode()
            outputPii()
            promptInjection()
            unsafeInput()
            unsafeOutput()
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
            (if (guardrail.asKnown().isPresent) 1 else 0) +
                (if (inputCode.asKnown().isPresent) 1 else 0) +
                (if (inputDos.asKnown().isPresent) 1 else 0) +
                (if (inputLanguage.asKnown().isPresent) 1 else 0) +
                (if (inputPii.asKnown().isPresent) 1 else 0) +
                (if (outputCode.asKnown().isPresent) 1 else 0) +
                (if (outputPii.asKnown().isPresent) 1 else 0) +
                (if (promptInjection.asKnown().isPresent) 1 else 0) +
                (if (unsafeInput.asKnown().isPresent) 1 else 0) +
                (if (unsafeOutput.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Categories &&
                guardrail == other.guardrail &&
                inputCode == other.inputCode &&
                inputDos == other.inputDos &&
                inputLanguage == other.inputLanguage &&
                inputPii == other.inputPii &&
                outputCode == other.outputCode &&
                outputPii == other.outputPii &&
                promptInjection == other.promptInjection &&
                unsafeInput == other.unsafeInput &&
                unsafeOutput == other.unsafeOutput &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                guardrail,
                inputCode,
                inputDos,
                inputLanguage,
                inputPii,
                outputCode,
                outputPii,
                promptInjection,
                unsafeInput,
                unsafeOutput,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Categories{guardrail=$guardrail, inputCode=$inputCode, inputDos=$inputDos, inputLanguage=$inputLanguage, inputPii=$inputPii, outputCode=$outputCode, outputPii=$outputPii, promptInjection=$promptInjection, unsafeInput=$unsafeInput, unsafeOutput=$unsafeOutput, additionalProperties=$additionalProperties}"
    }

    /** The framework labels identified during analysis */
    class Frameworks
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val mitre: JsonField<List<Mitre>>,
        private val owasp: JsonField<List<Owasp>>,
        private val owasp2025: JsonField<List<Owasp2025>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("mitre") @ExcludeMissing mitre: JsonField<List<Mitre>> = JsonMissing.of(),
            @JsonProperty("owasp") @ExcludeMissing owasp: JsonField<List<Owasp>> = JsonMissing.of(),
            @JsonProperty("owasp:2025")
            @ExcludeMissing
            owasp2025: JsonField<List<Owasp2025>> = JsonMissing.of(),
        ) : this(mitre, owasp, owasp2025, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mitre(): Optional<List<Mitre>> = mitre.getOptional("mitre")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun owasp(): Optional<List<Owasp>> = owasp.getOptional("owasp")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun owasp2025(): Optional<List<Owasp2025>> = owasp2025.getOptional("owasp:2025")

        /**
         * Returns the raw JSON value of [mitre].
         *
         * Unlike [mitre], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mitre") @ExcludeMissing fun _mitre(): JsonField<List<Mitre>> = mitre

        /**
         * Returns the raw JSON value of [owasp].
         *
         * Unlike [owasp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owasp") @ExcludeMissing fun _owasp(): JsonField<List<Owasp>> = owasp

        /**
         * Returns the raw JSON value of [owasp2025].
         *
         * Unlike [owasp2025], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owasp:2025")
        @ExcludeMissing
        fun _owasp2025(): JsonField<List<Owasp2025>> = owasp2025

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

            /** Returns a mutable builder for constructing an instance of [Frameworks]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Frameworks]. */
        class Builder internal constructor() {

            private var mitre: JsonField<MutableList<Mitre>>? = null
            private var owasp: JsonField<MutableList<Owasp>>? = null
            private var owasp2025: JsonField<MutableList<Owasp2025>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(frameworks: Frameworks) = apply {
                mitre = frameworks.mitre.map { it.toMutableList() }
                owasp = frameworks.owasp.map { it.toMutableList() }
                owasp2025 = frameworks.owasp2025.map { it.toMutableList() }
                additionalProperties = frameworks.additionalProperties.toMutableMap()
            }

            fun mitre(mitre: List<Mitre>) = mitre(JsonField.of(mitre))

            /**
             * Sets [Builder.mitre] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mitre] with a well-typed `List<Mitre>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mitre(mitre: JsonField<List<Mitre>>) = apply {
                this.mitre = mitre.map { it.toMutableList() }
            }

            /**
             * Adds a single [Mitre] to [Builder.mitre].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMitre(mitre: Mitre) = apply {
                this.mitre =
                    (this.mitre ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mitre", it).add(mitre)
                    }
            }

            fun owasp(owasp: List<Owasp>) = owasp(JsonField.of(owasp))

            /**
             * Sets [Builder.owasp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owasp] with a well-typed `List<Owasp>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owasp(owasp: JsonField<List<Owasp>>) = apply {
                this.owasp = owasp.map { it.toMutableList() }
            }

            /**
             * Adds a single [Owasp] to [Builder.owasp].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOwasp(owasp: Owasp) = apply {
                this.owasp =
                    (this.owasp ?: JsonField.of(mutableListOf())).also {
                        checkKnown("owasp", it).add(owasp)
                    }
            }

            fun owasp2025(owasp2025: List<Owasp2025>) = owasp2025(JsonField.of(owasp2025))

            /**
             * Sets [Builder.owasp2025] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owasp2025] with a well-typed `List<Owasp2025>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owasp2025(owasp2025: JsonField<List<Owasp2025>>) = apply {
                this.owasp2025 = owasp2025.map { it.toMutableList() }
            }

            /**
             * Adds a single [Owasp2025] to [Builder.owasp2025].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOwasp2025(owasp2025: Owasp2025) = apply {
                this.owasp2025 =
                    (this.owasp2025 ?: JsonField.of(mutableListOf())).also {
                        checkKnown("owasp2025", it).add(owasp2025)
                    }
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
             * Returns an immutable instance of [Frameworks].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Frameworks =
                Frameworks(
                    (mitre ?: JsonMissing.of()).map { it.toImmutable() },
                    (owasp ?: JsonMissing.of()).map { it.toImmutable() },
                    (owasp2025 ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Frameworks = apply {
            if (validated) {
                return@apply
            }

            mitre().ifPresent { it.forEach { it.validate() } }
            owasp().ifPresent { it.forEach { it.validate() } }
            owasp2025().ifPresent { it.forEach { it.validate() } }
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
            (mitre.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (owasp.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (owasp2025.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The MITRE Atlas framework labels identified during analysis */
        class Mitre
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val label: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(label, name, mutableMapOf())

            /**
             * The label of the MITRE Atlas framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * The name of the MITRE Atlas framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Mitre]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mitre]. */
            class Builder internal constructor() {

                private var label: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mitre: Mitre) = apply {
                    label = mitre.label
                    name = mitre.name
                    additionalProperties = mitre.additionalProperties.toMutableMap()
                }

                /** The label of the MITRE Atlas framework label */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                /** The name of the MITRE Atlas framework label */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Mitre].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Mitre = Mitre(label, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Mitre = apply {
                if (validated) {
                    return@apply
                }

                label()
                name()
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
                (if (label.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mitre &&
                    label == other.label &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(label, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mitre{label=$label, name=$name, additionalProperties=$additionalProperties}"
        }

        /** The OWASP framework labels identified during analysis */
        class Owasp
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val label: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(label, name, mutableMapOf())

            /**
             * The label of the OWASP framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * The name of the OWASP framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Owasp]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Owasp]. */
            class Builder internal constructor() {

                private var label: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(owasp: Owasp) = apply {
                    label = owasp.label
                    name = owasp.name
                    additionalProperties = owasp.additionalProperties.toMutableMap()
                }

                /** The label of the OWASP framework label */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                /** The name of the OWASP framework label */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Owasp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Owasp = Owasp(label, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Owasp = apply {
                if (validated) {
                    return@apply
                }

                label()
                name()
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
                (if (label.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Owasp &&
                    label == other.label &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(label, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Owasp{label=$label, name=$name, additionalProperties=$additionalProperties}"
        }

        /** The OWASP:2025 framework labels identified during analysis */
        class Owasp2025
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val label: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(label, name, mutableMapOf())

            /**
             * The label of the OWASP:2025 framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * The name of the OWASP:2025 framework label
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

                /** Returns a mutable builder for constructing an instance of [Owasp2025]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Owasp2025]. */
            class Builder internal constructor() {

                private var label: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(owasp2025: Owasp2025) = apply {
                    label = owasp2025.label
                    name = owasp2025.name
                    additionalProperties = owasp2025.additionalProperties.toMutableMap()
                }

                /** The label of the OWASP:2025 framework label */
                fun label(label: String) = label(JsonField.of(label))

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                /** The name of the OWASP:2025 framework label */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Owasp2025].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Owasp2025 = Owasp2025(label, name, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Owasp2025 = apply {
                if (validated) {
                    return@apply
                }

                label()
                name()
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
                (if (label.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Owasp2025 &&
                    label == other.label &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(label, name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Owasp2025{label=$label, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Frameworks &&
                mitre == other.mitre &&
                owasp == other.owasp &&
                owasp2025 == other.owasp2025 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(mitre, owasp, owasp2025, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Frameworks{mitre=$mitre, owasp=$owasp, owasp2025=$owasp2025, additionalProperties=$additionalProperties}"
    }

    /** The policy used during analysis */
    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val blockGuardrailDetection: JsonField<Boolean>,
        private val blockInputCodeDetection: JsonField<Boolean>,
        private val blockInputDosDetection: JsonField<Boolean>,
        private val blockInputPii: JsonField<Boolean>,
        private val blockOutputCodeDetection: JsonField<Boolean>,
        private val blockOutputPii: JsonField<Boolean>,
        private val blockPromptInjection: JsonField<Boolean>,
        private val blockUnsafe: JsonField<Boolean>,
        private val blockUnsafeInput: JsonField<Boolean>,
        private val blockUnsafeOutput: JsonField<Boolean>,
        private val entityType: JsonField<EntityType>,
        private val inputDosDetectionThreshold: JsonField<Double>,
        private val promptInjectionScanType: JsonField<PromptInjectionScanType>,
        private val redactInputPii: JsonField<Boolean>,
        private val redactOutputPii: JsonField<Boolean>,
        private val redactType: JsonField<RedactType>,
        private val skipGuardrailDetection: JsonField<Boolean>,
        private val skipInputCodeDetection: JsonField<Boolean>,
        private val skipInputDosDetection: JsonField<Boolean>,
        private val skipInputPiiDetection: JsonField<Boolean>,
        private val skipInputUrlDetection: JsonField<Boolean>,
        private val skipOutputCodeDetection: JsonField<Boolean>,
        private val skipOutputPiiDetection: JsonField<Boolean>,
        private val skipOutputUrlDetection: JsonField<Boolean>,
        private val skipPromptInjectionDetection: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("block_guardrail_detection")
            @ExcludeMissing
            blockGuardrailDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_input_code_detection")
            @ExcludeMissing
            blockInputCodeDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_input_dos_detection")
            @ExcludeMissing
            blockInputDosDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_input_pii")
            @ExcludeMissing
            blockInputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_output_code_detection")
            @ExcludeMissing
            blockOutputCodeDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_output_pii")
            @ExcludeMissing
            blockOutputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_prompt_injection")
            @ExcludeMissing
            blockPromptInjection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_unsafe")
            @ExcludeMissing
            blockUnsafe: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_unsafe_input")
            @ExcludeMissing
            blockUnsafeInput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("block_unsafe_output")
            @ExcludeMissing
            blockUnsafeOutput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("entity_type")
            @ExcludeMissing
            entityType: JsonField<EntityType> = JsonMissing.of(),
            @JsonProperty("input_dos_detection_threshold")
            @ExcludeMissing
            inputDosDetectionThreshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("prompt_injection_scan_type")
            @ExcludeMissing
            promptInjectionScanType: JsonField<PromptInjectionScanType> = JsonMissing.of(),
            @JsonProperty("redact_input_pii")
            @ExcludeMissing
            redactInputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("redact_output_pii")
            @ExcludeMissing
            redactOutputPii: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("redact_type")
            @ExcludeMissing
            redactType: JsonField<RedactType> = JsonMissing.of(),
            @JsonProperty("skip_guardrail_detection")
            @ExcludeMissing
            skipGuardrailDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_input_code_detection")
            @ExcludeMissing
            skipInputCodeDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_input_dos_detection")
            @ExcludeMissing
            skipInputDosDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_input_pii_detection")
            @ExcludeMissing
            skipInputPiiDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_input_url_detection")
            @ExcludeMissing
            skipInputUrlDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_output_code_detection")
            @ExcludeMissing
            skipOutputCodeDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_output_pii_detection")
            @ExcludeMissing
            skipOutputPiiDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_output_url_detection")
            @ExcludeMissing
            skipOutputUrlDetection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("skip_prompt_injection_detection")
            @ExcludeMissing
            skipPromptInjectionDetection: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            blockGuardrailDetection,
            blockInputCodeDetection,
            blockInputDosDetection,
            blockInputPii,
            blockOutputCodeDetection,
            blockOutputPii,
            blockPromptInjection,
            blockUnsafe,
            blockUnsafeInput,
            blockUnsafeOutput,
            entityType,
            inputDosDetectionThreshold,
            promptInjectionScanType,
            redactInputPii,
            redactOutputPii,
            redactType,
            skipGuardrailDetection,
            skipInputCodeDetection,
            skipInputDosDetection,
            skipInputPiiDetection,
            skipInputUrlDetection,
            skipOutputCodeDetection,
            skipOutputPiiDetection,
            skipOutputUrlDetection,
            skipPromptInjectionDetection,
            mutableMapOf(),
        )

        /**
         * Block guardrail detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockGuardrailDetection(): Optional<Boolean> =
            blockGuardrailDetection.getOptional("block_guardrail_detection")

        /**
         * Block input code detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockInputCodeDetection(): Optional<Boolean> =
            blockInputCodeDetection.getOptional("block_input_code_detection")

        /**
         * Block input denial of service detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockInputDosDetection(): Optional<Boolean> =
            blockInputDosDetection.getOptional("block_input_dos_detection")

        /**
         * Block input personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockInputPii(): Optional<Boolean> = blockInputPii.getOptional("block_input_pii")

        /**
         * Block output code detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockOutputCodeDetection(): Optional<Boolean> =
            blockOutputCodeDetection.getOptional("block_output_code_detection")

        /**
         * Block output personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockOutputPii(): Optional<Boolean> = blockOutputPii.getOptional("block_output_pii")

        /**
         * Block prompt injection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockPromptInjection(): Optional<Boolean> =
            blockPromptInjection.getOptional("block_prompt_injection")

        /**
         * Block unsafe input and output
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockUnsafe(): Optional<Boolean> = blockUnsafe.getOptional("block_unsafe")

        /**
         * Block unsafe input
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockUnsafeInput(): Optional<Boolean> =
            blockUnsafeInput.getOptional("block_unsafe_input")

        /**
         * Block unsafe output
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun blockUnsafeOutput(): Optional<Boolean> =
            blockUnsafeOutput.getOptional("block_unsafe_output")

        /**
         * The type of entity to redact
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entityType(): Optional<EntityType> = entityType.getOptional("entity_type")

        /**
         * The threshold for input denial of service detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputDosDetectionThreshold(): Optional<Double> =
            inputDosDetectionThreshold.getOptional("input_dos_detection_threshold")

        /**
         * The type of prompt injection scan to use
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptInjectionScanType(): Optional<PromptInjectionScanType> =
            promptInjectionScanType.getOptional("prompt_injection_scan_type")

        /**
         * Redact input personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun redactInputPii(): Optional<Boolean> = redactInputPii.getOptional("redact_input_pii")

        /**
         * Redact output personally identifiable information
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun redactOutputPii(): Optional<Boolean> = redactOutputPii.getOptional("redact_output_pii")

        /**
         * The type of redaction to use
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun redactType(): Optional<RedactType> = redactType.getOptional("redact_type")

        /**
         * Skip guardrail detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipGuardrailDetection(): Optional<Boolean> =
            skipGuardrailDetection.getOptional("skip_guardrail_detection")

        /**
         * Skip input code detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipInputCodeDetection(): Optional<Boolean> =
            skipInputCodeDetection.getOptional("skip_input_code_detection")

        /**
         * Skip input denial of service detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipInputDosDetection(): Optional<Boolean> =
            skipInputDosDetection.getOptional("skip_input_dos_detection")

        /**
         * Skip input personally identifiable information detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipInputPiiDetection(): Optional<Boolean> =
            skipInputPiiDetection.getOptional("skip_input_pii_detection")

        /**
         * Skip input URL detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipInputUrlDetection(): Optional<Boolean> =
            skipInputUrlDetection.getOptional("skip_input_url_detection")

        /**
         * Skip output code detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipOutputCodeDetection(): Optional<Boolean> =
            skipOutputCodeDetection.getOptional("skip_output_code_detection")

        /**
         * Skip output personally identifiable information detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipOutputPiiDetection(): Optional<Boolean> =
            skipOutputPiiDetection.getOptional("skip_output_pii_detection")

        /**
         * Skip output URL detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipOutputUrlDetection(): Optional<Boolean> =
            skipOutputUrlDetection.getOptional("skip_output_url_detection")

        /**
         * Skip prompt injection detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun skipPromptInjectionDetection(): Optional<Boolean> =
            skipPromptInjectionDetection.getOptional("skip_prompt_injection_detection")

        /**
         * Returns the raw JSON value of [blockGuardrailDetection].
         *
         * Unlike [blockGuardrailDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("block_guardrail_detection")
        @ExcludeMissing
        fun _blockGuardrailDetection(): JsonField<Boolean> = blockGuardrailDetection

        /**
         * Returns the raw JSON value of [blockInputCodeDetection].
         *
         * Unlike [blockInputCodeDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("block_input_code_detection")
        @ExcludeMissing
        fun _blockInputCodeDetection(): JsonField<Boolean> = blockInputCodeDetection

        /**
         * Returns the raw JSON value of [blockInputDosDetection].
         *
         * Unlike [blockInputDosDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("block_input_dos_detection")
        @ExcludeMissing
        fun _blockInputDosDetection(): JsonField<Boolean> = blockInputDosDetection

        /**
         * Returns the raw JSON value of [blockInputPii].
         *
         * Unlike [blockInputPii], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("block_input_pii")
        @ExcludeMissing
        fun _blockInputPii(): JsonField<Boolean> = blockInputPii

        /**
         * Returns the raw JSON value of [blockOutputCodeDetection].
         *
         * Unlike [blockOutputCodeDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("block_output_code_detection")
        @ExcludeMissing
        fun _blockOutputCodeDetection(): JsonField<Boolean> = blockOutputCodeDetection

        /**
         * Returns the raw JSON value of [blockOutputPii].
         *
         * Unlike [blockOutputPii], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("block_output_pii")
        @ExcludeMissing
        fun _blockOutputPii(): JsonField<Boolean> = blockOutputPii

        /**
         * Returns the raw JSON value of [blockPromptInjection].
         *
         * Unlike [blockPromptInjection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("block_prompt_injection")
        @ExcludeMissing
        fun _blockPromptInjection(): JsonField<Boolean> = blockPromptInjection

        /**
         * Returns the raw JSON value of [blockUnsafe].
         *
         * Unlike [blockUnsafe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("block_unsafe")
        @ExcludeMissing
        fun _blockUnsafe(): JsonField<Boolean> = blockUnsafe

        /**
         * Returns the raw JSON value of [blockUnsafeInput].
         *
         * Unlike [blockUnsafeInput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("block_unsafe_input")
        @ExcludeMissing
        fun _blockUnsafeInput(): JsonField<Boolean> = blockUnsafeInput

        /**
         * Returns the raw JSON value of [blockUnsafeOutput].
         *
         * Unlike [blockUnsafeOutput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("block_unsafe_output")
        @ExcludeMissing
        fun _blockUnsafeOutput(): JsonField<Boolean> = blockUnsafeOutput

        /**
         * Returns the raw JSON value of [entityType].
         *
         * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_type")
        @ExcludeMissing
        fun _entityType(): JsonField<EntityType> = entityType

        /**
         * Returns the raw JSON value of [inputDosDetectionThreshold].
         *
         * Unlike [inputDosDetectionThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_dos_detection_threshold")
        @ExcludeMissing
        fun _inputDosDetectionThreshold(): JsonField<Double> = inputDosDetectionThreshold

        /**
         * Returns the raw JSON value of [promptInjectionScanType].
         *
         * Unlike [promptInjectionScanType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prompt_injection_scan_type")
        @ExcludeMissing
        fun _promptInjectionScanType(): JsonField<PromptInjectionScanType> = promptInjectionScanType

        /**
         * Returns the raw JSON value of [redactInputPii].
         *
         * Unlike [redactInputPii], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redact_input_pii")
        @ExcludeMissing
        fun _redactInputPii(): JsonField<Boolean> = redactInputPii

        /**
         * Returns the raw JSON value of [redactOutputPii].
         *
         * Unlike [redactOutputPii], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("redact_output_pii")
        @ExcludeMissing
        fun _redactOutputPii(): JsonField<Boolean> = redactOutputPii

        /**
         * Returns the raw JSON value of [redactType].
         *
         * Unlike [redactType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("redact_type")
        @ExcludeMissing
        fun _redactType(): JsonField<RedactType> = redactType

        /**
         * Returns the raw JSON value of [skipGuardrailDetection].
         *
         * Unlike [skipGuardrailDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_guardrail_detection")
        @ExcludeMissing
        fun _skipGuardrailDetection(): JsonField<Boolean> = skipGuardrailDetection

        /**
         * Returns the raw JSON value of [skipInputCodeDetection].
         *
         * Unlike [skipInputCodeDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_input_code_detection")
        @ExcludeMissing
        fun _skipInputCodeDetection(): JsonField<Boolean> = skipInputCodeDetection

        /**
         * Returns the raw JSON value of [skipInputDosDetection].
         *
         * Unlike [skipInputDosDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_input_dos_detection")
        @ExcludeMissing
        fun _skipInputDosDetection(): JsonField<Boolean> = skipInputDosDetection

        /**
         * Returns the raw JSON value of [skipInputPiiDetection].
         *
         * Unlike [skipInputPiiDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_input_pii_detection")
        @ExcludeMissing
        fun _skipInputPiiDetection(): JsonField<Boolean> = skipInputPiiDetection

        /**
         * Returns the raw JSON value of [skipInputUrlDetection].
         *
         * Unlike [skipInputUrlDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_input_url_detection")
        @ExcludeMissing
        fun _skipInputUrlDetection(): JsonField<Boolean> = skipInputUrlDetection

        /**
         * Returns the raw JSON value of [skipOutputCodeDetection].
         *
         * Unlike [skipOutputCodeDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_output_code_detection")
        @ExcludeMissing
        fun _skipOutputCodeDetection(): JsonField<Boolean> = skipOutputCodeDetection

        /**
         * Returns the raw JSON value of [skipOutputPiiDetection].
         *
         * Unlike [skipOutputPiiDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_output_pii_detection")
        @ExcludeMissing
        fun _skipOutputPiiDetection(): JsonField<Boolean> = skipOutputPiiDetection

        /**
         * Returns the raw JSON value of [skipOutputUrlDetection].
         *
         * Unlike [skipOutputUrlDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_output_url_detection")
        @ExcludeMissing
        fun _skipOutputUrlDetection(): JsonField<Boolean> = skipOutputUrlDetection

        /**
         * Returns the raw JSON value of [skipPromptInjectionDetection].
         *
         * Unlike [skipPromptInjectionDetection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("skip_prompt_injection_detection")
        @ExcludeMissing
        fun _skipPromptInjectionDetection(): JsonField<Boolean> = skipPromptInjectionDetection

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

            /** Returns a mutable builder for constructing an instance of [Policy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var blockGuardrailDetection: JsonField<Boolean> = JsonMissing.of()
            private var blockInputCodeDetection: JsonField<Boolean> = JsonMissing.of()
            private var blockInputDosDetection: JsonField<Boolean> = JsonMissing.of()
            private var blockInputPii: JsonField<Boolean> = JsonMissing.of()
            private var blockOutputCodeDetection: JsonField<Boolean> = JsonMissing.of()
            private var blockOutputPii: JsonField<Boolean> = JsonMissing.of()
            private var blockPromptInjection: JsonField<Boolean> = JsonMissing.of()
            private var blockUnsafe: JsonField<Boolean> = JsonMissing.of()
            private var blockUnsafeInput: JsonField<Boolean> = JsonMissing.of()
            private var blockUnsafeOutput: JsonField<Boolean> = JsonMissing.of()
            private var entityType: JsonField<EntityType> = JsonMissing.of()
            private var inputDosDetectionThreshold: JsonField<Double> = JsonMissing.of()
            private var promptInjectionScanType: JsonField<PromptInjectionScanType> =
                JsonMissing.of()
            private var redactInputPii: JsonField<Boolean> = JsonMissing.of()
            private var redactOutputPii: JsonField<Boolean> = JsonMissing.of()
            private var redactType: JsonField<RedactType> = JsonMissing.of()
            private var skipGuardrailDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipInputCodeDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipInputDosDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipInputPiiDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipInputUrlDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipOutputCodeDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipOutputPiiDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipOutputUrlDetection: JsonField<Boolean> = JsonMissing.of()
            private var skipPromptInjectionDetection: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(policy: Policy) = apply {
                blockGuardrailDetection = policy.blockGuardrailDetection
                blockInputCodeDetection = policy.blockInputCodeDetection
                blockInputDosDetection = policy.blockInputDosDetection
                blockInputPii = policy.blockInputPii
                blockOutputCodeDetection = policy.blockOutputCodeDetection
                blockOutputPii = policy.blockOutputPii
                blockPromptInjection = policy.blockPromptInjection
                blockUnsafe = policy.blockUnsafe
                blockUnsafeInput = policy.blockUnsafeInput
                blockUnsafeOutput = policy.blockUnsafeOutput
                entityType = policy.entityType
                inputDosDetectionThreshold = policy.inputDosDetectionThreshold
                promptInjectionScanType = policy.promptInjectionScanType
                redactInputPii = policy.redactInputPii
                redactOutputPii = policy.redactOutputPii
                redactType = policy.redactType
                skipGuardrailDetection = policy.skipGuardrailDetection
                skipInputCodeDetection = policy.skipInputCodeDetection
                skipInputDosDetection = policy.skipInputDosDetection
                skipInputPiiDetection = policy.skipInputPiiDetection
                skipInputUrlDetection = policy.skipInputUrlDetection
                skipOutputCodeDetection = policy.skipOutputCodeDetection
                skipOutputPiiDetection = policy.skipOutputPiiDetection
                skipOutputUrlDetection = policy.skipOutputUrlDetection
                skipPromptInjectionDetection = policy.skipPromptInjectionDetection
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

            /** Block guardrail detection */
            fun blockGuardrailDetection(blockGuardrailDetection: Boolean) =
                blockGuardrailDetection(JsonField.of(blockGuardrailDetection))

            /**
             * Sets [Builder.blockGuardrailDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockGuardrailDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun blockGuardrailDetection(blockGuardrailDetection: JsonField<Boolean>) = apply {
                this.blockGuardrailDetection = blockGuardrailDetection
            }

            /** Block input code detection */
            fun blockInputCodeDetection(blockInputCodeDetection: Boolean) =
                blockInputCodeDetection(JsonField.of(blockInputCodeDetection))

            /**
             * Sets [Builder.blockInputCodeDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockInputCodeDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun blockInputCodeDetection(blockInputCodeDetection: JsonField<Boolean>) = apply {
                this.blockInputCodeDetection = blockInputCodeDetection
            }

            /** Block input denial of service detection */
            fun blockInputDosDetection(blockInputDosDetection: Boolean) =
                blockInputDosDetection(JsonField.of(blockInputDosDetection))

            /**
             * Sets [Builder.blockInputDosDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockInputDosDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun blockInputDosDetection(blockInputDosDetection: JsonField<Boolean>) = apply {
                this.blockInputDosDetection = blockInputDosDetection
            }

            /** Block input personally identifiable information */
            fun blockInputPii(blockInputPii: Boolean) = blockInputPii(JsonField.of(blockInputPii))

            /**
             * Sets [Builder.blockInputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockInputPii] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockInputPii(blockInputPii: JsonField<Boolean>) = apply {
                this.blockInputPii = blockInputPii
            }

            /** Block output code detection */
            fun blockOutputCodeDetection(blockOutputCodeDetection: Boolean) =
                blockOutputCodeDetection(JsonField.of(blockOutputCodeDetection))

            /**
             * Sets [Builder.blockOutputCodeDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockOutputCodeDetection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun blockOutputCodeDetection(blockOutputCodeDetection: JsonField<Boolean>) = apply {
                this.blockOutputCodeDetection = blockOutputCodeDetection
            }

            /** Block output personally identifiable information */
            fun blockOutputPii(blockOutputPii: Boolean) =
                blockOutputPii(JsonField.of(blockOutputPii))

            /**
             * Sets [Builder.blockOutputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockOutputPii] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockOutputPii(blockOutputPii: JsonField<Boolean>) = apply {
                this.blockOutputPii = blockOutputPii
            }

            /** Block prompt injection */
            fun blockPromptInjection(blockPromptInjection: Boolean) =
                blockPromptInjection(JsonField.of(blockPromptInjection))

            /**
             * Sets [Builder.blockPromptInjection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockPromptInjection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun blockPromptInjection(blockPromptInjection: JsonField<Boolean>) = apply {
                this.blockPromptInjection = blockPromptInjection
            }

            /** Block unsafe input and output */
            fun blockUnsafe(blockUnsafe: Boolean) = blockUnsafe(JsonField.of(blockUnsafe))

            /**
             * Sets [Builder.blockUnsafe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockUnsafe] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockUnsafe(blockUnsafe: JsonField<Boolean>) = apply {
                this.blockUnsafe = blockUnsafe
            }

            /** Block unsafe input */
            fun blockUnsafeInput(blockUnsafeInput: Boolean) =
                blockUnsafeInput(JsonField.of(blockUnsafeInput))

            /**
             * Sets [Builder.blockUnsafeInput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockUnsafeInput] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockUnsafeInput(blockUnsafeInput: JsonField<Boolean>) = apply {
                this.blockUnsafeInput = blockUnsafeInput
            }

            /** Block unsafe output */
            fun blockUnsafeOutput(blockUnsafeOutput: Boolean) =
                blockUnsafeOutput(JsonField.of(blockUnsafeOutput))

            /**
             * Sets [Builder.blockUnsafeOutput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.blockUnsafeOutput] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun blockUnsafeOutput(blockUnsafeOutput: JsonField<Boolean>) = apply {
                this.blockUnsafeOutput = blockUnsafeOutput
            }

            /** The type of entity to redact */
            fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

            /**
             * Sets [Builder.entityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityType] with a well-typed [EntityType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityType(entityType: JsonField<EntityType>) = apply {
                this.entityType = entityType
            }

            /** The threshold for input denial of service detection */
            fun inputDosDetectionThreshold(inputDosDetectionThreshold: Double) =
                inputDosDetectionThreshold(JsonField.of(inputDosDetectionThreshold))

            /**
             * Sets [Builder.inputDosDetectionThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputDosDetectionThreshold] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inputDosDetectionThreshold(inputDosDetectionThreshold: JsonField<Double>) = apply {
                this.inputDosDetectionThreshold = inputDosDetectionThreshold
            }

            /** The type of prompt injection scan to use */
            fun promptInjectionScanType(promptInjectionScanType: PromptInjectionScanType) =
                promptInjectionScanType(JsonField.of(promptInjectionScanType))

            /**
             * Sets [Builder.promptInjectionScanType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptInjectionScanType] with a well-typed
             * [PromptInjectionScanType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun promptInjectionScanType(
                promptInjectionScanType: JsonField<PromptInjectionScanType>
            ) = apply { this.promptInjectionScanType = promptInjectionScanType }

            /** Redact input personally identifiable information */
            fun redactInputPii(redactInputPii: Boolean) =
                redactInputPii(JsonField.of(redactInputPii))

            /**
             * Sets [Builder.redactInputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redactInputPii] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redactInputPii(redactInputPii: JsonField<Boolean>) = apply {
                this.redactInputPii = redactInputPii
            }

            /** Redact output personally identifiable information */
            fun redactOutputPii(redactOutputPii: Boolean) =
                redactOutputPii(JsonField.of(redactOutputPii))

            /**
             * Sets [Builder.redactOutputPii] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redactOutputPii] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redactOutputPii(redactOutputPii: JsonField<Boolean>) = apply {
                this.redactOutputPii = redactOutputPii
            }

            /** The type of redaction to use */
            fun redactType(redactType: RedactType) = redactType(JsonField.of(redactType))

            /**
             * Sets [Builder.redactType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.redactType] with a well-typed [RedactType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun redactType(redactType: JsonField<RedactType>) = apply {
                this.redactType = redactType
            }

            /** Skip guardrail detection */
            fun skipGuardrailDetection(skipGuardrailDetection: Boolean) =
                skipGuardrailDetection(JsonField.of(skipGuardrailDetection))

            /**
             * Sets [Builder.skipGuardrailDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipGuardrailDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipGuardrailDetection(skipGuardrailDetection: JsonField<Boolean>) = apply {
                this.skipGuardrailDetection = skipGuardrailDetection
            }

            /** Skip input code detection */
            fun skipInputCodeDetection(skipInputCodeDetection: Boolean) =
                skipInputCodeDetection(JsonField.of(skipInputCodeDetection))

            /**
             * Sets [Builder.skipInputCodeDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipInputCodeDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipInputCodeDetection(skipInputCodeDetection: JsonField<Boolean>) = apply {
                this.skipInputCodeDetection = skipInputCodeDetection
            }

            /** Skip input denial of service detection */
            fun skipInputDosDetection(skipInputDosDetection: Boolean) =
                skipInputDosDetection(JsonField.of(skipInputDosDetection))

            /**
             * Sets [Builder.skipInputDosDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipInputDosDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipInputDosDetection(skipInputDosDetection: JsonField<Boolean>) = apply {
                this.skipInputDosDetection = skipInputDosDetection
            }

            /** Skip input personally identifiable information detection */
            fun skipInputPiiDetection(skipInputPiiDetection: Boolean) =
                skipInputPiiDetection(JsonField.of(skipInputPiiDetection))

            /**
             * Sets [Builder.skipInputPiiDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipInputPiiDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipInputPiiDetection(skipInputPiiDetection: JsonField<Boolean>) = apply {
                this.skipInputPiiDetection = skipInputPiiDetection
            }

            /** Skip input URL detection */
            fun skipInputUrlDetection(skipInputUrlDetection: Boolean) =
                skipInputUrlDetection(JsonField.of(skipInputUrlDetection))

            /**
             * Sets [Builder.skipInputUrlDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipInputUrlDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipInputUrlDetection(skipInputUrlDetection: JsonField<Boolean>) = apply {
                this.skipInputUrlDetection = skipInputUrlDetection
            }

            /** Skip output code detection */
            fun skipOutputCodeDetection(skipOutputCodeDetection: Boolean) =
                skipOutputCodeDetection(JsonField.of(skipOutputCodeDetection))

            /**
             * Sets [Builder.skipOutputCodeDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipOutputCodeDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipOutputCodeDetection(skipOutputCodeDetection: JsonField<Boolean>) = apply {
                this.skipOutputCodeDetection = skipOutputCodeDetection
            }

            /** Skip output personally identifiable information detection */
            fun skipOutputPiiDetection(skipOutputPiiDetection: Boolean) =
                skipOutputPiiDetection(JsonField.of(skipOutputPiiDetection))

            /**
             * Sets [Builder.skipOutputPiiDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipOutputPiiDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipOutputPiiDetection(skipOutputPiiDetection: JsonField<Boolean>) = apply {
                this.skipOutputPiiDetection = skipOutputPiiDetection
            }

            /** Skip output URL detection */
            fun skipOutputUrlDetection(skipOutputUrlDetection: Boolean) =
                skipOutputUrlDetection(JsonField.of(skipOutputUrlDetection))

            /**
             * Sets [Builder.skipOutputUrlDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipOutputUrlDetection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun skipOutputUrlDetection(skipOutputUrlDetection: JsonField<Boolean>) = apply {
                this.skipOutputUrlDetection = skipOutputUrlDetection
            }

            /** Skip prompt injection detection */
            fun skipPromptInjectionDetection(skipPromptInjectionDetection: Boolean) =
                skipPromptInjectionDetection(JsonField.of(skipPromptInjectionDetection))

            /**
             * Sets [Builder.skipPromptInjectionDetection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.skipPromptInjectionDetection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun skipPromptInjectionDetection(skipPromptInjectionDetection: JsonField<Boolean>) =
                apply {
                    this.skipPromptInjectionDetection = skipPromptInjectionDetection
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
             * Returns an immutable instance of [Policy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Policy =
                Policy(
                    blockGuardrailDetection,
                    blockInputCodeDetection,
                    blockInputDosDetection,
                    blockInputPii,
                    blockOutputCodeDetection,
                    blockOutputPii,
                    blockPromptInjection,
                    blockUnsafe,
                    blockUnsafeInput,
                    blockUnsafeOutput,
                    entityType,
                    inputDosDetectionThreshold,
                    promptInjectionScanType,
                    redactInputPii,
                    redactOutputPii,
                    redactType,
                    skipGuardrailDetection,
                    skipInputCodeDetection,
                    skipInputDosDetection,
                    skipInputPiiDetection,
                    skipInputUrlDetection,
                    skipOutputCodeDetection,
                    skipOutputPiiDetection,
                    skipOutputUrlDetection,
                    skipPromptInjectionDetection,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Policy = apply {
            if (validated) {
                return@apply
            }

            blockGuardrailDetection()
            blockInputCodeDetection()
            blockInputDosDetection()
            blockInputPii()
            blockOutputCodeDetection()
            blockOutputPii()
            blockPromptInjection()
            blockUnsafe()
            blockUnsafeInput()
            blockUnsafeOutput()
            entityType().ifPresent { it.validate() }
            inputDosDetectionThreshold()
            promptInjectionScanType().ifPresent { it.validate() }
            redactInputPii()
            redactOutputPii()
            redactType().ifPresent { it.validate() }
            skipGuardrailDetection()
            skipInputCodeDetection()
            skipInputDosDetection()
            skipInputPiiDetection()
            skipInputUrlDetection()
            skipOutputCodeDetection()
            skipOutputPiiDetection()
            skipOutputUrlDetection()
            skipPromptInjectionDetection()
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
            (if (blockGuardrailDetection.asKnown().isPresent) 1 else 0) +
                (if (blockInputCodeDetection.asKnown().isPresent) 1 else 0) +
                (if (blockInputDosDetection.asKnown().isPresent) 1 else 0) +
                (if (blockInputPii.asKnown().isPresent) 1 else 0) +
                (if (blockOutputCodeDetection.asKnown().isPresent) 1 else 0) +
                (if (blockOutputPii.asKnown().isPresent) 1 else 0) +
                (if (blockPromptInjection.asKnown().isPresent) 1 else 0) +
                (if (blockUnsafe.asKnown().isPresent) 1 else 0) +
                (if (blockUnsafeInput.asKnown().isPresent) 1 else 0) +
                (if (blockUnsafeOutput.asKnown().isPresent) 1 else 0) +
                (entityType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (inputDosDetectionThreshold.asKnown().isPresent) 1 else 0) +
                (promptInjectionScanType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (redactInputPii.asKnown().isPresent) 1 else 0) +
                (if (redactOutputPii.asKnown().isPresent) 1 else 0) +
                (redactType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (skipGuardrailDetection.asKnown().isPresent) 1 else 0) +
                (if (skipInputCodeDetection.asKnown().isPresent) 1 else 0) +
                (if (skipInputDosDetection.asKnown().isPresent) 1 else 0) +
                (if (skipInputPiiDetection.asKnown().isPresent) 1 else 0) +
                (if (skipInputUrlDetection.asKnown().isPresent) 1 else 0) +
                (if (skipOutputCodeDetection.asKnown().isPresent) 1 else 0) +
                (if (skipOutputPiiDetection.asKnown().isPresent) 1 else 0) +
                (if (skipOutputUrlDetection.asKnown().isPresent) 1 else 0) +
                (if (skipPromptInjectionDetection.asKnown().isPresent) 1 else 0)

        /** The type of entity to redact */
        class EntityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val STRICT = of("strict")

                @JvmField val ALL = of("all")

                @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
            }

            /** An enum containing [EntityType]'s known values. */
            enum class Known {
                STRICT,
                ALL,
            }

            /**
             * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EntityType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRICT,
                ALL,
                /**
                 * An enum member indicating that [EntityType] was instantiated with an unknown
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
                    STRICT -> Value.STRICT
                    ALL -> Value.ALL
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
                    STRICT -> Known.STRICT
                    ALL -> Known.ALL
                    else -> throw HiddenLayerInvalidDataException("Unknown EntityType: $value")
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

            fun validate(): EntityType = apply {
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

                return other is EntityType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of prompt injection scan to use */
        class PromptInjectionScanType
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

                @JvmField val QUICK = of("quick")

                @JvmField val FULL = of("full")

                @JvmStatic fun of(value: String) = PromptInjectionScanType(JsonField.of(value))
            }

            /** An enum containing [PromptInjectionScanType]'s known values. */
            enum class Known {
                QUICK,
                FULL,
            }

            /**
             * An enum containing [PromptInjectionScanType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PromptInjectionScanType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                QUICK,
                FULL,
                /**
                 * An enum member indicating that [PromptInjectionScanType] was instantiated with an
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
                    QUICK -> Value.QUICK
                    FULL -> Value.FULL
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
                    QUICK -> Known.QUICK
                    FULL -> Known.FULL
                    else ->
                        throw HiddenLayerInvalidDataException(
                            "Unknown PromptInjectionScanType: $value"
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

            fun validate(): PromptInjectionScanType = apply {
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

                return other is PromptInjectionScanType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of redaction to use */
        class RedactType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ENTITY = of("entity")

                @JvmField val STRICT = of("strict")

                @JvmStatic fun of(value: String) = RedactType(JsonField.of(value))
            }

            /** An enum containing [RedactType]'s known values. */
            enum class Known {
                ENTITY,
                STRICT,
            }

            /**
             * An enum containing [RedactType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RedactType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ENTITY,
                STRICT,
                /**
                 * An enum member indicating that [RedactType] was instantiated with an unknown
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
                    ENTITY -> Value.ENTITY
                    STRICT -> Value.STRICT
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
                    ENTITY -> Known.ENTITY
                    STRICT -> Known.STRICT
                    else -> throw HiddenLayerInvalidDataException("Unknown RedactType: $value")
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

            fun validate(): RedactType = apply {
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

                return other is RedactType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
                blockGuardrailDetection == other.blockGuardrailDetection &&
                blockInputCodeDetection == other.blockInputCodeDetection &&
                blockInputDosDetection == other.blockInputDosDetection &&
                blockInputPii == other.blockInputPii &&
                blockOutputCodeDetection == other.blockOutputCodeDetection &&
                blockOutputPii == other.blockOutputPii &&
                blockPromptInjection == other.blockPromptInjection &&
                blockUnsafe == other.blockUnsafe &&
                blockUnsafeInput == other.blockUnsafeInput &&
                blockUnsafeOutput == other.blockUnsafeOutput &&
                entityType == other.entityType &&
                inputDosDetectionThreshold == other.inputDosDetectionThreshold &&
                promptInjectionScanType == other.promptInjectionScanType &&
                redactInputPii == other.redactInputPii &&
                redactOutputPii == other.redactOutputPii &&
                redactType == other.redactType &&
                skipGuardrailDetection == other.skipGuardrailDetection &&
                skipInputCodeDetection == other.skipInputCodeDetection &&
                skipInputDosDetection == other.skipInputDosDetection &&
                skipInputPiiDetection == other.skipInputPiiDetection &&
                skipInputUrlDetection == other.skipInputUrlDetection &&
                skipOutputCodeDetection == other.skipOutputCodeDetection &&
                skipOutputPiiDetection == other.skipOutputPiiDetection &&
                skipOutputUrlDetection == other.skipOutputUrlDetection &&
                skipPromptInjectionDetection == other.skipPromptInjectionDetection &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                blockGuardrailDetection,
                blockInputCodeDetection,
                blockInputDosDetection,
                blockInputPii,
                blockOutputCodeDetection,
                blockOutputPii,
                blockPromptInjection,
                blockUnsafe,
                blockUnsafeInput,
                blockUnsafeOutput,
                entityType,
                inputDosDetectionThreshold,
                promptInjectionScanType,
                redactInputPii,
                redactOutputPii,
                redactType,
                skipGuardrailDetection,
                skipInputCodeDetection,
                skipInputDosDetection,
                skipInputPiiDetection,
                skipInputUrlDetection,
                skipOutputCodeDetection,
                skipOutputPiiDetection,
                skipOutputUrlDetection,
                skipPromptInjectionDetection,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Policy{blockGuardrailDetection=$blockGuardrailDetection, blockInputCodeDetection=$blockInputCodeDetection, blockInputDosDetection=$blockInputDosDetection, blockInputPii=$blockInputPii, blockOutputCodeDetection=$blockOutputCodeDetection, blockOutputPii=$blockOutputPii, blockPromptInjection=$blockPromptInjection, blockUnsafe=$blockUnsafe, blockUnsafeInput=$blockUnsafeInput, blockUnsafeOutput=$blockUnsafeOutput, entityType=$entityType, inputDosDetectionThreshold=$inputDosDetectionThreshold, promptInjectionScanType=$promptInjectionScanType, redactInputPii=$redactInputPii, redactOutputPii=$redactOutputPii, redactType=$redactType, skipGuardrailDetection=$skipGuardrailDetection, skipInputCodeDetection=$skipInputCodeDetection, skipInputDosDetection=$skipInputDosDetection, skipInputPiiDetection=$skipInputPiiDetection, skipInputUrlDetection=$skipInputUrlDetection, skipOutputCodeDetection=$skipOutputCodeDetection, skipOutputPiiDetection=$skipOutputPiiDetection, skipOutputUrlDetection=$skipOutputUrlDetection, skipPromptInjectionDetection=$skipPromptInjectionDetection, additionalProperties=$additionalProperties}"
    }

    class Response
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<String>,
        private val output: JsonField<String>,
        private val prompt: JsonField<String>,
        private val provider: JsonField<String>,
        private val unmodifiedOutput: JsonField<String>,
        private val unmodifiedPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unmodified_output")
            @ExcludeMissing
            unmodifiedOutput: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unmodified_prompt")
            @ExcludeMissing
            unmodifiedPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(
            model,
            output,
            prompt,
            provider,
            unmodifiedOutput,
            unmodifiedPrompt,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun output(): Optional<String> = output.getOptional("output")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun prompt(): Optional<String> = prompt.getOptional("prompt")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<String> = provider.getOptional("provider")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unmodifiedOutput(): Optional<String> = unmodifiedOutput.getOptional("unmodified_output")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unmodifiedPrompt(): Optional<String> = unmodifiedPrompt.getOptional("unmodified_prompt")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [output].
         *
         * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("output") @ExcludeMissing fun _output(): JsonField<String> = output

        /**
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

        /**
         * Returns the raw JSON value of [unmodifiedOutput].
         *
         * Unlike [unmodifiedOutput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unmodified_output")
        @ExcludeMissing
        fun _unmodifiedOutput(): JsonField<String> = unmodifiedOutput

        /**
         * Returns the raw JSON value of [unmodifiedPrompt].
         *
         * Unlike [unmodifiedPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unmodified_prompt")
        @ExcludeMissing
        fun _unmodifiedPrompt(): JsonField<String> = unmodifiedPrompt

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

            /** Returns a mutable builder for constructing an instance of [Response]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Response]. */
        class Builder internal constructor() {

            private var model: JsonField<String> = JsonMissing.of()
            private var output: JsonField<String> = JsonMissing.of()
            private var prompt: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<String> = JsonMissing.of()
            private var unmodifiedOutput: JsonField<String> = JsonMissing.of()
            private var unmodifiedPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(response: Response) = apply {
                model = response.model
                output = response.output
                prompt = response.prompt
                provider = response.provider
                unmodifiedOutput = response.unmodifiedOutput
                unmodifiedPrompt = response.unmodifiedPrompt
                additionalProperties = response.additionalProperties.toMutableMap()
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

            fun output(output: String) = output(JsonField.of(output))

            /**
             * Sets [Builder.output] to an arbitrary JSON value.
             *
             * You should usually call [Builder.output] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun output(output: JsonField<String>) = apply { this.output = output }

            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            fun unmodifiedOutput(unmodifiedOutput: String) =
                unmodifiedOutput(JsonField.of(unmodifiedOutput))

            /**
             * Sets [Builder.unmodifiedOutput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unmodifiedOutput] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unmodifiedOutput(unmodifiedOutput: JsonField<String>) = apply {
                this.unmodifiedOutput = unmodifiedOutput
            }

            fun unmodifiedPrompt(unmodifiedPrompt: String) =
                unmodifiedPrompt(JsonField.of(unmodifiedPrompt))

            /**
             * Sets [Builder.unmodifiedPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unmodifiedPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unmodifiedPrompt(unmodifiedPrompt: JsonField<String>) = apply {
                this.unmodifiedPrompt = unmodifiedPrompt
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
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(
                    model,
                    output,
                    prompt,
                    provider,
                    unmodifiedOutput,
                    unmodifiedPrompt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            model()
            output()
            prompt()
            provider()
            unmodifiedOutput()
            unmodifiedPrompt()
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
                (if (output.asKnown().isPresent) 1 else 0) +
                (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (unmodifiedOutput.asKnown().isPresent) 1 else 0) +
                (if (unmodifiedPrompt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                model == other.model &&
                output == other.output &&
                prompt == other.prompt &&
                provider == other.provider &&
                unmodifiedOutput == other.unmodifiedOutput &&
                unmodifiedPrompt == other.unmodifiedPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                model,
                output,
                prompt,
                provider,
                unmodifiedOutput,
                unmodifiedPrompt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Response{model=$model, output=$output, prompt=$prompt, provider=$provider, unmodifiedOutput=$unmodifiedOutput, unmodifiedPrompt=$unmodifiedPrompt, additionalProperties=$additionalProperties}"
    }

    /** The analysis results */
    class Results
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val guardrailResults: JsonField<GuardrailResults>,
        private val inputBlockListResults: JsonField<InputBlockListResults>,
        private val inputCodeResults: JsonField<InputCodeResults>,
        private val inputDosResults: JsonField<InputDosResults>,
        private val inputLanguageResults: JsonField<InputLanguageResults>,
        private val inputPiiResults: JsonField<InputPiiResults>,
        private val inputUrlResults: JsonField<InputUrlResults>,
        private val outputCodeResults: JsonField<OutputCodeResults>,
        private val outputPiiResults: JsonField<OutputPiiResults>,
        private val outputUrlResults: JsonField<OutputUrlResults>,
        private val promptInjectionClassifierResults:
            JsonField<List<PromptInjectionClassifierResult>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("guardrail_results")
            @ExcludeMissing
            guardrailResults: JsonField<GuardrailResults> = JsonMissing.of(),
            @JsonProperty("input_block_list_results")
            @ExcludeMissing
            inputBlockListResults: JsonField<InputBlockListResults> = JsonMissing.of(),
            @JsonProperty("input_code_results")
            @ExcludeMissing
            inputCodeResults: JsonField<InputCodeResults> = JsonMissing.of(),
            @JsonProperty("input_dos_results")
            @ExcludeMissing
            inputDosResults: JsonField<InputDosResults> = JsonMissing.of(),
            @JsonProperty("input_language_results")
            @ExcludeMissing
            inputLanguageResults: JsonField<InputLanguageResults> = JsonMissing.of(),
            @JsonProperty("input_pii_results")
            @ExcludeMissing
            inputPiiResults: JsonField<InputPiiResults> = JsonMissing.of(),
            @JsonProperty("input_url_results")
            @ExcludeMissing
            inputUrlResults: JsonField<InputUrlResults> = JsonMissing.of(),
            @JsonProperty("output_code_results")
            @ExcludeMissing
            outputCodeResults: JsonField<OutputCodeResults> = JsonMissing.of(),
            @JsonProperty("output_pii_results")
            @ExcludeMissing
            outputPiiResults: JsonField<OutputPiiResults> = JsonMissing.of(),
            @JsonProperty("output_url_results")
            @ExcludeMissing
            outputUrlResults: JsonField<OutputUrlResults> = JsonMissing.of(),
            @JsonProperty("prompt_injection_classifier_results")
            @ExcludeMissing
            promptInjectionClassifierResults: JsonField<List<PromptInjectionClassifierResult>> =
                JsonMissing.of(),
        ) : this(
            guardrailResults,
            inputBlockListResults,
            inputCodeResults,
            inputDosResults,
            inputLanguageResults,
            inputPiiResults,
            inputUrlResults,
            outputCodeResults,
            outputPiiResults,
            outputUrlResults,
            promptInjectionClassifierResults,
            mutableMapOf(),
        )

        /**
         * The guardrail results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun guardrailResults(): Optional<GuardrailResults> =
            guardrailResults.getOptional("guardrail_results")

        /**
         * The input block list results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputBlockListResults(): Optional<InputBlockListResults> =
            inputBlockListResults.getOptional("input_block_list_results")

        /**
         * The input code results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputCodeResults(): Optional<InputCodeResults> =
            inputCodeResults.getOptional("input_code_results")

        /**
         * The input denial of service results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputDosResults(): Optional<InputDosResults> =
            inputDosResults.getOptional("input_dos_results")

        /**
         * The input language results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputLanguageResults(): Optional<InputLanguageResults> =
            inputLanguageResults.getOptional("input_language_results")

        /**
         * The input personally identifiable information results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputPiiResults(): Optional<InputPiiResults> =
            inputPiiResults.getOptional("input_pii_results")

        /**
         * The input URL results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputUrlResults(): Optional<InputUrlResults> =
            inputUrlResults.getOptional("input_url_results")

        /**
         * The output code results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputCodeResults(): Optional<OutputCodeResults> =
            outputCodeResults.getOptional("output_code_results")

        /**
         * The output personally identifiable information results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputPiiResults(): Optional<OutputPiiResults> =
            outputPiiResults.getOptional("output_pii_results")

        /**
         * The output URL results
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputUrlResults(): Optional<OutputUrlResults> =
            outputUrlResults.getOptional("output_url_results")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptInjectionClassifierResults(): Optional<List<PromptInjectionClassifierResult>> =
            promptInjectionClassifierResults.getOptional("prompt_injection_classifier_results")

        /**
         * Returns the raw JSON value of [guardrailResults].
         *
         * Unlike [guardrailResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("guardrail_results")
        @ExcludeMissing
        fun _guardrailResults(): JsonField<GuardrailResults> = guardrailResults

        /**
         * Returns the raw JSON value of [inputBlockListResults].
         *
         * Unlike [inputBlockListResults], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_block_list_results")
        @ExcludeMissing
        fun _inputBlockListResults(): JsonField<InputBlockListResults> = inputBlockListResults

        /**
         * Returns the raw JSON value of [inputCodeResults].
         *
         * Unlike [inputCodeResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_code_results")
        @ExcludeMissing
        fun _inputCodeResults(): JsonField<InputCodeResults> = inputCodeResults

        /**
         * Returns the raw JSON value of [inputDosResults].
         *
         * Unlike [inputDosResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_dos_results")
        @ExcludeMissing
        fun _inputDosResults(): JsonField<InputDosResults> = inputDosResults

        /**
         * Returns the raw JSON value of [inputLanguageResults].
         *
         * Unlike [inputLanguageResults], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("input_language_results")
        @ExcludeMissing
        fun _inputLanguageResults(): JsonField<InputLanguageResults> = inputLanguageResults

        /**
         * Returns the raw JSON value of [inputPiiResults].
         *
         * Unlike [inputPiiResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_pii_results")
        @ExcludeMissing
        fun _inputPiiResults(): JsonField<InputPiiResults> = inputPiiResults

        /**
         * Returns the raw JSON value of [inputUrlResults].
         *
         * Unlike [inputUrlResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("input_url_results")
        @ExcludeMissing
        fun _inputUrlResults(): JsonField<InputUrlResults> = inputUrlResults

        /**
         * Returns the raw JSON value of [outputCodeResults].
         *
         * Unlike [outputCodeResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_code_results")
        @ExcludeMissing
        fun _outputCodeResults(): JsonField<OutputCodeResults> = outputCodeResults

        /**
         * Returns the raw JSON value of [outputPiiResults].
         *
         * Unlike [outputPiiResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_pii_results")
        @ExcludeMissing
        fun _outputPiiResults(): JsonField<OutputPiiResults> = outputPiiResults

        /**
         * Returns the raw JSON value of [outputUrlResults].
         *
         * Unlike [outputUrlResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("output_url_results")
        @ExcludeMissing
        fun _outputUrlResults(): JsonField<OutputUrlResults> = outputUrlResults

        /**
         * Returns the raw JSON value of [promptInjectionClassifierResults].
         *
         * Unlike [promptInjectionClassifierResults], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("prompt_injection_classifier_results")
        @ExcludeMissing
        fun _promptInjectionClassifierResults(): JsonField<List<PromptInjectionClassifierResult>> =
            promptInjectionClassifierResults

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

            /** Returns a mutable builder for constructing an instance of [Results]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Results]. */
        class Builder internal constructor() {

            private var guardrailResults: JsonField<GuardrailResults> = JsonMissing.of()
            private var inputBlockListResults: JsonField<InputBlockListResults> = JsonMissing.of()
            private var inputCodeResults: JsonField<InputCodeResults> = JsonMissing.of()
            private var inputDosResults: JsonField<InputDosResults> = JsonMissing.of()
            private var inputLanguageResults: JsonField<InputLanguageResults> = JsonMissing.of()
            private var inputPiiResults: JsonField<InputPiiResults> = JsonMissing.of()
            private var inputUrlResults: JsonField<InputUrlResults> = JsonMissing.of()
            private var outputCodeResults: JsonField<OutputCodeResults> = JsonMissing.of()
            private var outputPiiResults: JsonField<OutputPiiResults> = JsonMissing.of()
            private var outputUrlResults: JsonField<OutputUrlResults> = JsonMissing.of()
            private var promptInjectionClassifierResults:
                JsonField<MutableList<PromptInjectionClassifierResult>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(results: Results) = apply {
                guardrailResults = results.guardrailResults
                inputBlockListResults = results.inputBlockListResults
                inputCodeResults = results.inputCodeResults
                inputDosResults = results.inputDosResults
                inputLanguageResults = results.inputLanguageResults
                inputPiiResults = results.inputPiiResults
                inputUrlResults = results.inputUrlResults
                outputCodeResults = results.outputCodeResults
                outputPiiResults = results.outputPiiResults
                outputUrlResults = results.outputUrlResults
                promptInjectionClassifierResults =
                    results.promptInjectionClassifierResults.map { it.toMutableList() }
                additionalProperties = results.additionalProperties.toMutableMap()
            }

            /** The guardrail results */
            fun guardrailResults(guardrailResults: GuardrailResults) =
                guardrailResults(JsonField.of(guardrailResults))

            /**
             * Sets [Builder.guardrailResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.guardrailResults] with a well-typed
             * [GuardrailResults] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun guardrailResults(guardrailResults: JsonField<GuardrailResults>) = apply {
                this.guardrailResults = guardrailResults
            }

            /** The input block list results */
            fun inputBlockListResults(inputBlockListResults: InputBlockListResults) =
                inputBlockListResults(JsonField.of(inputBlockListResults))

            /**
             * Sets [Builder.inputBlockListResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputBlockListResults] with a well-typed
             * [InputBlockListResults] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun inputBlockListResults(inputBlockListResults: JsonField<InputBlockListResults>) =
                apply {
                    this.inputBlockListResults = inputBlockListResults
                }

            /** The input code results */
            fun inputCodeResults(inputCodeResults: InputCodeResults) =
                inputCodeResults(JsonField.of(inputCodeResults))

            /**
             * Sets [Builder.inputCodeResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputCodeResults] with a well-typed
             * [InputCodeResults] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inputCodeResults(inputCodeResults: JsonField<InputCodeResults>) = apply {
                this.inputCodeResults = inputCodeResults
            }

            /** The input denial of service results */
            fun inputDosResults(inputDosResults: InputDosResults) =
                inputDosResults(JsonField.of(inputDosResults))

            /**
             * Sets [Builder.inputDosResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputDosResults] with a well-typed [InputDosResults]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputDosResults(inputDosResults: JsonField<InputDosResults>) = apply {
                this.inputDosResults = inputDosResults
            }

            /** The input language results */
            fun inputLanguageResults(inputLanguageResults: InputLanguageResults) =
                inputLanguageResults(JsonField.of(inputLanguageResults))

            /**
             * Sets [Builder.inputLanguageResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputLanguageResults] with a well-typed
             * [InputLanguageResults] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun inputLanguageResults(inputLanguageResults: JsonField<InputLanguageResults>) =
                apply {
                    this.inputLanguageResults = inputLanguageResults
                }

            /** The input personally identifiable information results */
            fun inputPiiResults(inputPiiResults: InputPiiResults) =
                inputPiiResults(JsonField.of(inputPiiResults))

            /**
             * Sets [Builder.inputPiiResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputPiiResults] with a well-typed [InputPiiResults]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputPiiResults(inputPiiResults: JsonField<InputPiiResults>) = apply {
                this.inputPiiResults = inputPiiResults
            }

            /** The input URL results */
            fun inputUrlResults(inputUrlResults: InputUrlResults) =
                inputUrlResults(JsonField.of(inputUrlResults))

            /**
             * Sets [Builder.inputUrlResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputUrlResults] with a well-typed [InputUrlResults]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputUrlResults(inputUrlResults: JsonField<InputUrlResults>) = apply {
                this.inputUrlResults = inputUrlResults
            }

            /** The output code results */
            fun outputCodeResults(outputCodeResults: OutputCodeResults) =
                outputCodeResults(JsonField.of(outputCodeResults))

            /**
             * Sets [Builder.outputCodeResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputCodeResults] with a well-typed
             * [OutputCodeResults] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun outputCodeResults(outputCodeResults: JsonField<OutputCodeResults>) = apply {
                this.outputCodeResults = outputCodeResults
            }

            /** The output personally identifiable information results */
            fun outputPiiResults(outputPiiResults: OutputPiiResults) =
                outputPiiResults(JsonField.of(outputPiiResults))

            /**
             * Sets [Builder.outputPiiResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputPiiResults] with a well-typed
             * [OutputPiiResults] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun outputPiiResults(outputPiiResults: JsonField<OutputPiiResults>) = apply {
                this.outputPiiResults = outputPiiResults
            }

            /** The output URL results */
            fun outputUrlResults(outputUrlResults: OutputUrlResults) =
                outputUrlResults(JsonField.of(outputUrlResults))

            /**
             * Sets [Builder.outputUrlResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputUrlResults] with a well-typed
             * [OutputUrlResults] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun outputUrlResults(outputUrlResults: JsonField<OutputUrlResults>) = apply {
                this.outputUrlResults = outputUrlResults
            }

            fun promptInjectionClassifierResults(
                promptInjectionClassifierResults: List<PromptInjectionClassifierResult>
            ) = promptInjectionClassifierResults(JsonField.of(promptInjectionClassifierResults))

            /**
             * Sets [Builder.promptInjectionClassifierResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptInjectionClassifierResults] with a well-typed
             * `List<PromptInjectionClassifierResult>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun promptInjectionClassifierResults(
                promptInjectionClassifierResults: JsonField<List<PromptInjectionClassifierResult>>
            ) = apply {
                this.promptInjectionClassifierResults =
                    promptInjectionClassifierResults.map { it.toMutableList() }
            }

            /**
             * Adds a single [PromptInjectionClassifierResult] to
             * [promptInjectionClassifierResults].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPromptInjectionClassifierResult(
                promptInjectionClassifierResult: PromptInjectionClassifierResult
            ) = apply {
                promptInjectionClassifierResults =
                    (promptInjectionClassifierResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("promptInjectionClassifierResults", it)
                            .add(promptInjectionClassifierResult)
                    }
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
             * Returns an immutable instance of [Results].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Results =
                Results(
                    guardrailResults,
                    inputBlockListResults,
                    inputCodeResults,
                    inputDosResults,
                    inputLanguageResults,
                    inputPiiResults,
                    inputUrlResults,
                    outputCodeResults,
                    outputPiiResults,
                    outputUrlResults,
                    (promptInjectionClassifierResults ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Results = apply {
            if (validated) {
                return@apply
            }

            guardrailResults().ifPresent { it.validate() }
            inputBlockListResults().ifPresent { it.validate() }
            inputCodeResults().ifPresent { it.validate() }
            inputDosResults().ifPresent { it.validate() }
            inputLanguageResults().ifPresent { it.validate() }
            inputPiiResults().ifPresent { it.validate() }
            inputUrlResults().ifPresent { it.validate() }
            outputCodeResults().ifPresent { it.validate() }
            outputPiiResults().ifPresent { it.validate() }
            outputUrlResults().ifPresent { it.validate() }
            promptInjectionClassifierResults().ifPresent { it.forEach { it.validate() } }
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
            (guardrailResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputBlockListResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputCodeResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputDosResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputLanguageResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputPiiResults.asKnown().getOrNull()?.validity() ?: 0) +
                (inputUrlResults.asKnown().getOrNull()?.validity() ?: 0) +
                (outputCodeResults.asKnown().getOrNull()?.validity() ?: 0) +
                (outputPiiResults.asKnown().getOrNull()?.validity() ?: 0) +
                (outputUrlResults.asKnown().getOrNull()?.validity() ?: 0) +
                (promptInjectionClassifierResults.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0)

        /** The guardrail results */
        class GuardrailResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val refusalClassifierResults: JsonField<RefusalClassifierResults>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("refusal_classifier_results")
                @ExcludeMissing
                refusalClassifierResults: JsonField<RefusalClassifierResults> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, refusalClassifierResults, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the guardrail
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * The refusal classifier results
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun refusalClassifierResults(): Optional<RefusalClassifierResults> =
                refusalClassifierResults.getOptional("refusal_classifier_results")

            /**
             * The verdict of the guardrail analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [refusalClassifierResults].
             *
             * Unlike [refusalClassifierResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("refusal_classifier_results")
            @ExcludeMissing
            fun _refusalClassifierResults(): JsonField<RefusalClassifierResults> =
                refusalClassifierResults

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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

                /** Returns a mutable builder for constructing an instance of [GuardrailResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GuardrailResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var refusalClassifierResults: JsonField<RefusalClassifierResults> =
                    JsonMissing.of()
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(guardrailResults: GuardrailResults) = apply {
                    elapsedMs = guardrailResults.elapsedMs
                    refusalClassifierResults = guardrailResults.refusalClassifierResults
                    verdict = guardrailResults.verdict
                    additionalProperties = guardrailResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the guardrail */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                /** The refusal classifier results */
                fun refusalClassifierResults(refusalClassifierResults: RefusalClassifierResults) =
                    refusalClassifierResults(JsonField.of(refusalClassifierResults))

                /**
                 * Sets [Builder.refusalClassifierResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refusalClassifierResults] with a well-typed
                 * [RefusalClassifierResults] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun refusalClassifierResults(
                    refusalClassifierResults: JsonField<RefusalClassifierResults>
                ) = apply { this.refusalClassifierResults = refusalClassifierResults }

                /** The verdict of the guardrail analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [GuardrailResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GuardrailResults =
                    GuardrailResults(
                        elapsedMs,
                        refusalClassifierResults,
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GuardrailResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                refusalClassifierResults().ifPresent { it.validate() }
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (refusalClassifierResults.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            /** The refusal classifier results */
            class RefusalClassifierResults
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val elapsedMs: JsonField<Double>,
                private val probabilities: JsonField<List<Double>>,
                private val verdict: JsonField<Boolean>,
                private val version: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("elapsed_ms")
                    @ExcludeMissing
                    elapsedMs: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("probabilities")
                    @ExcludeMissing
                    probabilities: JsonField<List<Double>> = JsonMissing.of(),
                    @JsonProperty("verdict")
                    @ExcludeMissing
                    verdict: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("version")
                    @ExcludeMissing
                    version: JsonField<Double> = JsonMissing.of(),
                ) : this(elapsedMs, probabilities, verdict, version, mutableMapOf())

                /**
                 * The time in milliseconds it took to process the refusal classifier
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

                /**
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun probabilities(): Optional<List<Double>> =
                    probabilities.getOptional("probabilities")

                /**
                 * The verdict of the refusal classifier
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

                /**
                 * The version of the refusal classifier
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun version(): Optional<Double> = version.getOptional("version")

                /**
                 * Returns the raw JSON value of [elapsedMs].
                 *
                 * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                fun _elapsedMs(): JsonField<Double> = elapsedMs

                /**
                 * Returns the raw JSON value of [probabilities].
                 *
                 * Unlike [probabilities], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("probabilities")
                @ExcludeMissing
                fun _probabilities(): JsonField<List<Double>> = probabilities

                /**
                 * Returns the raw JSON value of [verdict].
                 *
                 * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("verdict")
                @ExcludeMissing
                fun _verdict(): JsonField<Boolean> = verdict

                /**
                 * Returns the raw JSON value of [version].
                 *
                 * Unlike [version], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Double> = version

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
                     * Returns a mutable builder for constructing an instance of
                     * [RefusalClassifierResults].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RefusalClassifierResults]. */
                class Builder internal constructor() {

                    private var elapsedMs: JsonField<Double> = JsonMissing.of()
                    private var probabilities: JsonField<MutableList<Double>>? = null
                    private var verdict: JsonField<Boolean> = JsonMissing.of()
                    private var version: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(refusalClassifierResults: RefusalClassifierResults) = apply {
                        elapsedMs = refusalClassifierResults.elapsedMs
                        probabilities =
                            refusalClassifierResults.probabilities.map { it.toMutableList() }
                        verdict = refusalClassifierResults.verdict
                        version = refusalClassifierResults.version
                        additionalProperties =
                            refusalClassifierResults.additionalProperties.toMutableMap()
                    }

                    /** The time in milliseconds it took to process the refusal classifier */
                    fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                    /**
                     * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun elapsedMs(elapsedMs: JsonField<Double>) = apply {
                        this.elapsedMs = elapsedMs
                    }

                    fun probabilities(probabilities: List<Double>) =
                        probabilities(JsonField.of(probabilities))

                    /**
                     * Sets [Builder.probabilities] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.probabilities] with a well-typed
                     * `List<Double>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun probabilities(probabilities: JsonField<List<Double>>) = apply {
                        this.probabilities = probabilities.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Double] to [probabilities].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addProbability(probability: Double) = apply {
                        probabilities =
                            (probabilities ?: JsonField.of(mutableListOf())).also {
                                checkKnown("probabilities", it).add(probability)
                            }
                    }

                    /** The verdict of the refusal classifier */
                    fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                    /**
                     * Sets [Builder.verdict] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

                    /** The version of the refusal classifier */
                    fun version(version: Double) = version(JsonField.of(version))

                    /**
                     * Sets [Builder.version] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.version] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun version(version: JsonField<Double>) = apply { this.version = version }

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
                     * Returns an immutable instance of [RefusalClassifierResults].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RefusalClassifierResults =
                        RefusalClassifierResults(
                            elapsedMs,
                            (probabilities ?: JsonMissing.of()).map { it.toImmutable() },
                            verdict,
                            version,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RefusalClassifierResults = apply {
                    if (validated) {
                        return@apply
                    }

                    elapsedMs()
                    probabilities()
                    verdict()
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
                    (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                        (probabilities.asKnown().getOrNull()?.size ?: 0) +
                        (if (verdict.asKnown().isPresent) 1 else 0) +
                        (if (version.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RefusalClassifierResults &&
                        elapsedMs == other.elapsedMs &&
                        probabilities == other.probabilities &&
                        verdict == other.verdict &&
                        version == other.version &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(elapsedMs, probabilities, verdict, version, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RefusalClassifierResults{elapsedMs=$elapsedMs, probabilities=$probabilities, verdict=$verdict, version=$version, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GuardrailResults &&
                    elapsedMs == other.elapsedMs &&
                    refusalClassifierResults == other.refusalClassifierResults &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, refusalClassifierResults, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GuardrailResults{elapsedMs=$elapsedMs, refusalClassifierResults=$refusalClassifierResults, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input block list results */
        class InputBlockListResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val matches: JsonField<List<String>>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("matches")
                @ExcludeMissing
                matches: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, matches, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the input block list
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun matches(): Optional<List<String>> = matches.getOptional("matches")

            /**
             * The verdict of the input block list analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [matches].
             *
             * Unlike [matches], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("matches")
            @ExcludeMissing
            fun _matches(): JsonField<List<String>> = matches

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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
                 * Returns a mutable builder for constructing an instance of
                 * [InputBlockListResults].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputBlockListResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var matches: JsonField<MutableList<String>>? = null
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputBlockListResults: InputBlockListResults) = apply {
                    elapsedMs = inputBlockListResults.elapsedMs
                    matches = inputBlockListResults.matches.map { it.toMutableList() }
                    verdict = inputBlockListResults.verdict
                    additionalProperties = inputBlockListResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the input block list */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun matches(matches: List<String>) = matches(JsonField.of(matches))

                /**
                 * Sets [Builder.matches] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.matches] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun matches(matches: JsonField<List<String>>) = apply {
                    this.matches = matches.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [matches].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMatch(match: String) = apply {
                    matches =
                        (matches ?: JsonField.of(mutableListOf())).also {
                            checkKnown("matches", it).add(match)
                        }
                }

                /** The verdict of the input block list analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [InputBlockListResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputBlockListResults =
                    InputBlockListResults(
                        elapsedMs,
                        (matches ?: JsonMissing.of()).map { it.toImmutable() },
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InputBlockListResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                matches()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (matches.asKnown().getOrNull()?.size ?: 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputBlockListResults &&
                    elapsedMs == other.elapsedMs &&
                    matches == other.matches &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, matches, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputBlockListResults{elapsedMs=$elapsedMs, matches=$matches, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input code results */
        class InputCodeResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the input code
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * The verdict of the input code analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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

                /** Returns a mutable builder for constructing an instance of [InputCodeResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputCodeResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputCodeResults: InputCodeResults) = apply {
                    elapsedMs = inputCodeResults.elapsedMs
                    verdict = inputCodeResults.verdict
                    additionalProperties = inputCodeResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the input code */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                /** The verdict of the input code analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [InputCodeResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputCodeResults =
                    InputCodeResults(elapsedMs, verdict, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): InputCodeResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputCodeResults &&
                    elapsedMs == other.elapsedMs &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputCodeResults{elapsedMs=$elapsedMs, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input denial of service results */
        class InputDosResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val embeddingsLength: JsonField<Double>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("embeddings_length")
                @ExcludeMissing
                embeddingsLength: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, embeddingsLength, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the input denial of service
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * The length of the embeddings analyzed
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun embeddingsLength(): Optional<Double> =
                embeddingsLength.getOptional("embeddings_length")

            /**
             * The verdict of the input denial of service analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [embeddingsLength].
             *
             * Unlike [embeddingsLength], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("embeddings_length")
            @ExcludeMissing
            fun _embeddingsLength(): JsonField<Double> = embeddingsLength

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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

                /** Returns a mutable builder for constructing an instance of [InputDosResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputDosResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var embeddingsLength: JsonField<Double> = JsonMissing.of()
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputDosResults: InputDosResults) = apply {
                    elapsedMs = inputDosResults.elapsedMs
                    embeddingsLength = inputDosResults.embeddingsLength
                    verdict = inputDosResults.verdict
                    additionalProperties = inputDosResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the input denial of service */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                /** The length of the embeddings analyzed */
                fun embeddingsLength(embeddingsLength: Double) =
                    embeddingsLength(JsonField.of(embeddingsLength))

                /**
                 * Sets [Builder.embeddingsLength] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.embeddingsLength] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun embeddingsLength(embeddingsLength: JsonField<Double>) = apply {
                    this.embeddingsLength = embeddingsLength
                }

                /** The verdict of the input denial of service analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [InputDosResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputDosResults =
                    InputDosResults(
                        elapsedMs,
                        embeddingsLength,
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InputDosResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                embeddingsLength()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (if (embeddingsLength.asKnown().isPresent) 1 else 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputDosResults &&
                    elapsedMs == other.elapsedMs &&
                    embeddingsLength == other.embeddingsLength &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, embeddingsLength, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputDosResults{elapsedMs=$elapsedMs, embeddingsLength=$embeddingsLength, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input language results */
        class InputLanguageResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val language: JsonField<String>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<String> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, language, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the input language detection
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * Language detected in the input
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun language(): Optional<String> = language.getOptional("language")

            /**
             * The verdict of the input language analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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
                 * Returns a mutable builder for constructing an instance of [InputLanguageResults].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputLanguageResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var language: JsonField<String> = JsonMissing.of()
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputLanguageResults: InputLanguageResults) = apply {
                    elapsedMs = inputLanguageResults.elapsedMs
                    language = inputLanguageResults.language
                    verdict = inputLanguageResults.verdict
                    additionalProperties = inputLanguageResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the input language detection */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                /** Language detected in the input */
                fun language(language: String) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<String>) = apply { this.language = language }

                /** The verdict of the input language analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [InputLanguageResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputLanguageResults =
                    InputLanguageResults(
                        elapsedMs,
                        language,
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InputLanguageResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                language()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (if (language.asKnown().isPresent) 1 else 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputLanguageResults &&
                    elapsedMs == other.elapsedMs &&
                    language == other.language &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, language, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputLanguageResults{elapsedMs=$elapsedMs, language=$language, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input personally identifiable information results */
        class InputPiiResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val entities: JsonField<List<String>>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entities")
                @ExcludeMissing
                entities: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, entities, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the input personally identifiable
             * information
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun entities(): Optional<List<String>> = entities.getOptional("entities")

            /**
             * The verdict of the input personally identifiable information analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [entities].
             *
             * Unlike [entities], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entities")
            @ExcludeMissing
            fun _entities(): JsonField<List<String>> = entities

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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

                /** Returns a mutable builder for constructing an instance of [InputPiiResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputPiiResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var entities: JsonField<MutableList<String>>? = null
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputPiiResults: InputPiiResults) = apply {
                    elapsedMs = inputPiiResults.elapsedMs
                    entities = inputPiiResults.entities.map { it.toMutableList() }
                    verdict = inputPiiResults.verdict
                    additionalProperties = inputPiiResults.additionalProperties.toMutableMap()
                }

                /**
                 * The time in milliseconds it took to process the input personally identifiable
                 * information
                 */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun entities(entities: List<String>) = entities(JsonField.of(entities))

                /**
                 * Sets [Builder.entities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entities] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entities(entities: JsonField<List<String>>) = apply {
                    this.entities = entities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [entities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntity(entity: String) = apply {
                    entities =
                        (entities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entities", it).add(entity)
                        }
                }

                /** The verdict of the input personally identifiable information analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [InputPiiResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputPiiResults =
                    InputPiiResults(
                        elapsedMs,
                        (entities ?: JsonMissing.of()).map { it.toImmutable() },
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InputPiiResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                entities()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (entities.asKnown().getOrNull()?.size ?: 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputPiiResults &&
                    elapsedMs == other.elapsedMs &&
                    entities == other.entities &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, entities, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputPiiResults{elapsedMs=$elapsedMs, entities=$entities, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The input URL results */
        class InputUrlResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val urls: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("urls")
                @ExcludeMissing
                urls: JsonField<List<String>> = JsonMissing.of(),
            ) : this(elapsedMs, urls, mutableMapOf())

            /**
             * The time in milliseconds it took to process the guardrail
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun urls(): Optional<List<String>> = urls.getOptional("urls")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [urls].
             *
             * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

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

                /** Returns a mutable builder for constructing an instance of [InputUrlResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InputUrlResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var urls: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inputUrlResults: InputUrlResults) = apply {
                    elapsedMs = inputUrlResults.elapsedMs
                    urls = inputUrlResults.urls.map { it.toMutableList() }
                    additionalProperties = inputUrlResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the guardrail */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun urls(urls: List<String>) = urls(JsonField.of(urls))

                /**
                 * Sets [Builder.urls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urls] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urls(urls: JsonField<List<String>>) = apply {
                    this.urls = urls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [urls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUrl(url: String) = apply {
                    urls =
                        (urls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("urls", it).add(url)
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
                 * Returns an immutable instance of [InputUrlResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InputUrlResults =
                    InputUrlResults(
                        elapsedMs,
                        (urls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InputUrlResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                urls()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (urls.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InputUrlResults &&
                    elapsedMs == other.elapsedMs &&
                    urls == other.urls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, urls, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InputUrlResults{elapsedMs=$elapsedMs, urls=$urls, additionalProperties=$additionalProperties}"
        }

        /** The output code results */
        class OutputCodeResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the output code
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * The verdict of the output code analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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
                 * Returns a mutable builder for constructing an instance of [OutputCodeResults].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OutputCodeResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outputCodeResults: OutputCodeResults) = apply {
                    elapsedMs = outputCodeResults.elapsedMs
                    verdict = outputCodeResults.verdict
                    additionalProperties = outputCodeResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the output code */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                /** The verdict of the output code analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [OutputCodeResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OutputCodeResults =
                    OutputCodeResults(elapsedMs, verdict, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): OutputCodeResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OutputCodeResults &&
                    elapsedMs == other.elapsedMs &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OutputCodeResults{elapsedMs=$elapsedMs, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The output personally identifiable information results */
        class OutputPiiResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val entities: JsonField<List<String>>,
            private val verdict: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("entities")
                @ExcludeMissing
                entities: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
            ) : this(elapsedMs, entities, verdict, mutableMapOf())

            /**
             * The time in milliseconds it took to process the output personally identifiable
             * information
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun entities(): Optional<List<String>> = entities.getOptional("entities")

            /**
             * The verdict of the output personally identifiable information analysis
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [entities].
             *
             * Unlike [entities], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entities")
            @ExcludeMissing
            fun _entities(): JsonField<List<String>> = entities

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

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

                /** Returns a mutable builder for constructing an instance of [OutputPiiResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OutputPiiResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var entities: JsonField<MutableList<String>>? = null
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outputPiiResults: OutputPiiResults) = apply {
                    elapsedMs = outputPiiResults.elapsedMs
                    entities = outputPiiResults.entities.map { it.toMutableList() }
                    verdict = outputPiiResults.verdict
                    additionalProperties = outputPiiResults.additionalProperties.toMutableMap()
                }

                /**
                 * The time in milliseconds it took to process the output personally identifiable
                 * information
                 */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun entities(entities: List<String>) = entities(JsonField.of(entities))

                /**
                 * Sets [Builder.entities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entities] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entities(entities: JsonField<List<String>>) = apply {
                    this.entities = entities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [entities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntity(entity: String) = apply {
                    entities =
                        (entities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entities", it).add(entity)
                        }
                }

                /** The verdict of the output personally identifiable information analysis */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

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
                 * Returns an immutable instance of [OutputPiiResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OutputPiiResults =
                    OutputPiiResults(
                        elapsedMs,
                        (entities ?: JsonMissing.of()).map { it.toImmutable() },
                        verdict,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OutputPiiResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                entities()
                verdict()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (entities.asKnown().getOrNull()?.size ?: 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OutputPiiResults &&
                    elapsedMs == other.elapsedMs &&
                    entities == other.entities &&
                    verdict == other.verdict &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, entities, verdict, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OutputPiiResults{elapsedMs=$elapsedMs, entities=$entities, verdict=$verdict, additionalProperties=$additionalProperties}"
        }

        /** The output URL results */
        class OutputUrlResults
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val elapsedMs: JsonField<Double>,
            private val urls: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("urls")
                @ExcludeMissing
                urls: JsonField<List<String>> = JsonMissing.of(),
            ) : this(elapsedMs, urls, mutableMapOf())

            /**
             * The time in milliseconds it took to process the guardrail
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun urls(): Optional<List<String>> = urls.getOptional("urls")

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [urls].
             *
             * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<String>> = urls

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

                /** Returns a mutable builder for constructing an instance of [OutputUrlResults]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OutputUrlResults]. */
            class Builder internal constructor() {

                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var urls: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(outputUrlResults: OutputUrlResults) = apply {
                    elapsedMs = outputUrlResults.elapsedMs
                    urls = outputUrlResults.urls.map { it.toMutableList() }
                    additionalProperties = outputUrlResults.additionalProperties.toMutableMap()
                }

                /** The time in milliseconds it took to process the guardrail */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun urls(urls: List<String>) = urls(JsonField.of(urls))

                /**
                 * Sets [Builder.urls] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.urls] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun urls(urls: JsonField<List<String>>) = apply {
                    this.urls = urls.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [urls].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUrl(url: String) = apply {
                    urls =
                        (urls ?: JsonField.of(mutableListOf())).also {
                            checkKnown("urls", it).add(url)
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
                 * Returns an immutable instance of [OutputUrlResults].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OutputUrlResults =
                    OutputUrlResults(
                        elapsedMs,
                        (urls ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OutputUrlResults = apply {
                if (validated) {
                    return@apply
                }

                elapsedMs()
                urls()
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
                (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (urls.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OutputUrlResults &&
                    elapsedMs == other.elapsedMs &&
                    urls == other.urls &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(elapsedMs, urls, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OutputUrlResults{elapsedMs=$elapsedMs, urls=$urls, additionalProperties=$additionalProperties}"
        }

        class PromptInjectionClassifierResult
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowOverride: JsonField<String>,
            private val blockOverride: JsonField<String>,
            private val elapsedMs: JsonField<Double>,
            private val probabilities: JsonField<List<Double>>,
            private val verdict: JsonField<Boolean>,
            private val version: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allow_override")
                @ExcludeMissing
                allowOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("block_override")
                @ExcludeMissing
                blockOverride: JsonField<String> = JsonMissing.of(),
                @JsonProperty("elapsed_ms")
                @ExcludeMissing
                elapsedMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("probabilities")
                @ExcludeMissing
                probabilities: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("verdict")
                @ExcludeMissing
                verdict: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<Double> = JsonMissing.of(),
            ) : this(
                allowOverride,
                blockOverride,
                elapsedMs,
                probabilities,
                verdict,
                version,
                mutableMapOf(),
            )

            /**
             * The allow override applied to the prompt
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun allowOverride(): Optional<String> = allowOverride.getOptional("allow_override")

            /**
             * The block override applied to the prompt
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun blockOverride(): Optional<String> = blockOverride.getOptional("block_override")

            /**
             * The time in milliseconds it took to process the prompt injection classifier
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun elapsedMs(): Optional<Double> = elapsedMs.getOptional("elapsed_ms")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun probabilities(): Optional<List<Double>> = probabilities.getOptional("probabilities")

            /**
             * The verdict of the prompt injection classifier
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun verdict(): Optional<Boolean> = verdict.getOptional("verdict")

            /**
             * The version of the prompt injection classifier
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun version(): Optional<Double> = version.getOptional("version")

            /**
             * Returns the raw JSON value of [allowOverride].
             *
             * Unlike [allowOverride], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allow_override")
            @ExcludeMissing
            fun _allowOverride(): JsonField<String> = allowOverride

            /**
             * Returns the raw JSON value of [blockOverride].
             *
             * Unlike [blockOverride], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("block_override")
            @ExcludeMissing
            fun _blockOverride(): JsonField<String> = blockOverride

            /**
             * Returns the raw JSON value of [elapsedMs].
             *
             * Unlike [elapsedMs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elapsed_ms")
            @ExcludeMissing
            fun _elapsedMs(): JsonField<Double> = elapsedMs

            /**
             * Returns the raw JSON value of [probabilities].
             *
             * Unlike [probabilities], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("probabilities")
            @ExcludeMissing
            fun _probabilities(): JsonField<List<Double>> = probabilities

            /**
             * Returns the raw JSON value of [verdict].
             *
             * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Boolean> = verdict

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Double> = version

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
                 * Returns a mutable builder for constructing an instance of
                 * [PromptInjectionClassifierResult].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PromptInjectionClassifierResult]. */
            class Builder internal constructor() {

                private var allowOverride: JsonField<String> = JsonMissing.of()
                private var blockOverride: JsonField<String> = JsonMissing.of()
                private var elapsedMs: JsonField<Double> = JsonMissing.of()
                private var probabilities: JsonField<MutableList<Double>>? = null
                private var verdict: JsonField<Boolean> = JsonMissing.of()
                private var version: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    promptInjectionClassifierResult: PromptInjectionClassifierResult
                ) = apply {
                    allowOverride = promptInjectionClassifierResult.allowOverride
                    blockOverride = promptInjectionClassifierResult.blockOverride
                    elapsedMs = promptInjectionClassifierResult.elapsedMs
                    probabilities =
                        promptInjectionClassifierResult.probabilities.map { it.toMutableList() }
                    verdict = promptInjectionClassifierResult.verdict
                    version = promptInjectionClassifierResult.version
                    additionalProperties =
                        promptInjectionClassifierResult.additionalProperties.toMutableMap()
                }

                /** The allow override applied to the prompt */
                fun allowOverride(allowOverride: String) =
                    allowOverride(JsonField.of(allowOverride))

                /**
                 * Sets [Builder.allowOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowOverride] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowOverride(allowOverride: JsonField<String>) = apply {
                    this.allowOverride = allowOverride
                }

                /** The block override applied to the prompt */
                fun blockOverride(blockOverride: String) =
                    blockOverride(JsonField.of(blockOverride))

                /**
                 * Sets [Builder.blockOverride] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockOverride] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockOverride(blockOverride: JsonField<String>) = apply {
                    this.blockOverride = blockOverride
                }

                /** The time in milliseconds it took to process the prompt injection classifier */
                fun elapsedMs(elapsedMs: Double) = elapsedMs(JsonField.of(elapsedMs))

                /**
                 * Sets [Builder.elapsedMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elapsedMs] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun elapsedMs(elapsedMs: JsonField<Double>) = apply { this.elapsedMs = elapsedMs }

                fun probabilities(probabilities: List<Double>) =
                    probabilities(JsonField.of(probabilities))

                /**
                 * Sets [Builder.probabilities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.probabilities] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun probabilities(probabilities: JsonField<List<Double>>) = apply {
                    this.probabilities = probabilities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [probabilities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProbability(probability: Double) = apply {
                    probabilities =
                        (probabilities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("probabilities", it).add(probability)
                        }
                }

                /** The verdict of the prompt injection classifier */
                fun verdict(verdict: Boolean) = verdict(JsonField.of(verdict))

                /**
                 * Sets [Builder.verdict] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verdict] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun verdict(verdict: JsonField<Boolean>) = apply { this.verdict = verdict }

                /** The version of the prompt injection classifier */
                fun version(version: Double) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun version(version: JsonField<Double>) = apply { this.version = version }

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
                 * Returns an immutable instance of [PromptInjectionClassifierResult].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PromptInjectionClassifierResult =
                    PromptInjectionClassifierResult(
                        allowOverride,
                        blockOverride,
                        elapsedMs,
                        (probabilities ?: JsonMissing.of()).map { it.toImmutable() },
                        verdict,
                        version,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PromptInjectionClassifierResult = apply {
                if (validated) {
                    return@apply
                }

                allowOverride()
                blockOverride()
                elapsedMs()
                probabilities()
                verdict()
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
                (if (allowOverride.asKnown().isPresent) 1 else 0) +
                    (if (blockOverride.asKnown().isPresent) 1 else 0) +
                    (if (elapsedMs.asKnown().isPresent) 1 else 0) +
                    (probabilities.asKnown().getOrNull()?.size ?: 0) +
                    (if (verdict.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PromptInjectionClassifierResult &&
                    allowOverride == other.allowOverride &&
                    blockOverride == other.blockOverride &&
                    elapsedMs == other.elapsedMs &&
                    probabilities == other.probabilities &&
                    verdict == other.verdict &&
                    version == other.version &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    allowOverride,
                    blockOverride,
                    elapsedMs,
                    probabilities,
                    verdict,
                    version,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PromptInjectionClassifierResult{allowOverride=$allowOverride, blockOverride=$blockOverride, elapsedMs=$elapsedMs, probabilities=$probabilities, verdict=$verdict, version=$version, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Results &&
                guardrailResults == other.guardrailResults &&
                inputBlockListResults == other.inputBlockListResults &&
                inputCodeResults == other.inputCodeResults &&
                inputDosResults == other.inputDosResults &&
                inputLanguageResults == other.inputLanguageResults &&
                inputPiiResults == other.inputPiiResults &&
                inputUrlResults == other.inputUrlResults &&
                outputCodeResults == other.outputCodeResults &&
                outputPiiResults == other.outputPiiResults &&
                outputUrlResults == other.outputUrlResults &&
                promptInjectionClassifierResults == other.promptInjectionClassifierResults &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                guardrailResults,
                inputBlockListResults,
                inputCodeResults,
                inputDosResults,
                inputLanguageResults,
                inputPiiResults,
                inputUrlResults,
                outputCodeResults,
                outputPiiResults,
                outputUrlResults,
                promptInjectionClassifierResults,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Results{guardrailResults=$guardrailResults, inputBlockListResults=$inputBlockListResults, inputCodeResults=$inputCodeResults, inputDosResults=$inputDosResults, inputLanguageResults=$inputLanguageResults, inputPiiResults=$inputPiiResults, inputUrlResults=$inputUrlResults, outputCodeResults=$outputCodeResults, outputPiiResults=$outputPiiResults, outputUrlResults=$outputUrlResults, promptInjectionClassifierResults=$promptInjectionClassifierResults, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PromptAnalyzerCreateResponse &&
            categories == other.categories &&
            elapsedMs == other.elapsedMs &&
            frameworks == other.frameworks &&
            model == other.model &&
            policy == other.policy &&
            provider == other.provider &&
            response == other.response &&
            results == other.results &&
            upstreamElapsedMs == other.upstreamElapsedMs &&
            verdict == other.verdict &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            elapsedMs,
            frameworks,
            model,
            policy,
            provider,
            response,
            results,
            upstreamElapsedMs,
            verdict,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptAnalyzerCreateResponse{categories=$categories, elapsedMs=$elapsedMs, frameworks=$frameworks, model=$model, policy=$policy, provider=$provider, response=$response, results=$results, upstreamElapsedMs=$upstreamElapsedMs, verdict=$verdict, additionalProperties=$additionalProperties}"
}
