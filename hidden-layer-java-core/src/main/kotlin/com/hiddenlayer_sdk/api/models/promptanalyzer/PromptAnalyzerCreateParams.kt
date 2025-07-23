// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.promptanalyzer

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.Enum
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Analyze LLM Prompt and Response */
class PromptAnalyzerCreateParams
private constructor(
    private val xLlmBlockGuardrailDetection: Boolean?,
    private val xLlmBlockInputCodeDetection: Boolean?,
    private val xLlmBlockInputDosDetection: Boolean?,
    private val xLlmBlockInputPii: Boolean?,
    private val xLlmBlockOutputCodeDetection: Boolean?,
    private val xLlmBlockOutputPii: Boolean?,
    private val xLlmBlockPromptInjection: Boolean?,
    private val xLlmBlockUnsafe: Boolean?,
    private val xLlmBlockUnsafeInput: Boolean?,
    private val xLlmBlockUnsafeOutput: Boolean?,
    private val xLlmEntityType: XLlmEntityType?,
    private val xLlmInputDosDetectionThreshold: String?,
    private val xLlmPromptInjectionScanType: XLlmPromptInjectionScanType?,
    private val xLlmRedactInputPii: Boolean?,
    private val xLlmRedactOutputPii: Boolean?,
    private val xLlmRedactType: XLlmRedactType?,
    private val xLlmSkipGuardrailDetection: Boolean?,
    private val xLlmSkipInputCodeDetection: Boolean?,
    private val xLlmSkipInputDosDetection: Boolean?,
    private val xLlmSkipInputPiiDetection: Boolean?,
    private val xLlmSkipInputUrlDetection: Boolean?,
    private val xLlmSkipOutputCodeDetection: Boolean?,
    private val xLlmSkipOutputPiiDetection: Boolean?,
    private val xLlmSkipOutputUrlDetection: Boolean?,
    private val xLlmSkipPromptInjectionDetection: Boolean?,
    private val xRequesterId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xLlmBlockGuardrailDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmBlockGuardrailDetection)

    fun xLlmBlockInputCodeDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmBlockInputCodeDetection)

    fun xLlmBlockInputDosDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmBlockInputDosDetection)

    fun xLlmBlockInputPii(): Optional<Boolean> = Optional.ofNullable(xLlmBlockInputPii)

    fun xLlmBlockOutputCodeDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmBlockOutputCodeDetection)

    fun xLlmBlockOutputPii(): Optional<Boolean> = Optional.ofNullable(xLlmBlockOutputPii)

    fun xLlmBlockPromptInjection(): Optional<Boolean> =
        Optional.ofNullable(xLlmBlockPromptInjection)

    fun xLlmBlockUnsafe(): Optional<Boolean> = Optional.ofNullable(xLlmBlockUnsafe)

    fun xLlmBlockUnsafeInput(): Optional<Boolean> = Optional.ofNullable(xLlmBlockUnsafeInput)

    fun xLlmBlockUnsafeOutput(): Optional<Boolean> = Optional.ofNullable(xLlmBlockUnsafeOutput)

    /** The type of entity to redact */
    fun xLlmEntityType(): Optional<XLlmEntityType> = Optional.ofNullable(xLlmEntityType)

    fun xLlmInputDosDetectionThreshold(): Optional<String> =
        Optional.ofNullable(xLlmInputDosDetectionThreshold)

    /** The type of prompt injection scan to use */
    fun xLlmPromptInjectionScanType(): Optional<XLlmPromptInjectionScanType> =
        Optional.ofNullable(xLlmPromptInjectionScanType)

    fun xLlmRedactInputPii(): Optional<Boolean> = Optional.ofNullable(xLlmRedactInputPii)

    fun xLlmRedactOutputPii(): Optional<Boolean> = Optional.ofNullable(xLlmRedactOutputPii)

    /** The type of redaction to use */
    fun xLlmRedactType(): Optional<XLlmRedactType> = Optional.ofNullable(xLlmRedactType)

    fun xLlmSkipGuardrailDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipGuardrailDetection)

    fun xLlmSkipInputCodeDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipInputCodeDetection)

    fun xLlmSkipInputDosDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipInputDosDetection)

    fun xLlmSkipInputPiiDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipInputPiiDetection)

    fun xLlmSkipInputUrlDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipInputUrlDetection)

    fun xLlmSkipOutputCodeDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipOutputCodeDetection)

    fun xLlmSkipOutputPiiDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipOutputPiiDetection)

    fun xLlmSkipOutputUrlDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipOutputUrlDetection)

    fun xLlmSkipPromptInjectionDetection(): Optional<Boolean> =
        Optional.ofNullable(xLlmSkipPromptInjectionDetection)

    fun xRequesterId(): Optional<String> = Optional.ofNullable(xRequesterId)

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prompt(): String = body.prompt()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun output(): Optional<String> = body.output()

    /**
     * Returns the raw JSON value of [prompt].
     *
     * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _prompt(): JsonField<String> = body._prompt()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [output].
     *
     * Unlike [output], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _output(): JsonField<String> = body._output()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PromptAnalyzerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .prompt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptAnalyzerCreateParams]. */
    class Builder internal constructor() {

        private var xLlmBlockGuardrailDetection: Boolean? = null
        private var xLlmBlockInputCodeDetection: Boolean? = null
        private var xLlmBlockInputDosDetection: Boolean? = null
        private var xLlmBlockInputPii: Boolean? = null
        private var xLlmBlockOutputCodeDetection: Boolean? = null
        private var xLlmBlockOutputPii: Boolean? = null
        private var xLlmBlockPromptInjection: Boolean? = null
        private var xLlmBlockUnsafe: Boolean? = null
        private var xLlmBlockUnsafeInput: Boolean? = null
        private var xLlmBlockUnsafeOutput: Boolean? = null
        private var xLlmEntityType: XLlmEntityType? = null
        private var xLlmInputDosDetectionThreshold: String? = null
        private var xLlmPromptInjectionScanType: XLlmPromptInjectionScanType? = null
        private var xLlmRedactInputPii: Boolean? = null
        private var xLlmRedactOutputPii: Boolean? = null
        private var xLlmRedactType: XLlmRedactType? = null
        private var xLlmSkipGuardrailDetection: Boolean? = null
        private var xLlmSkipInputCodeDetection: Boolean? = null
        private var xLlmSkipInputDosDetection: Boolean? = null
        private var xLlmSkipInputPiiDetection: Boolean? = null
        private var xLlmSkipInputUrlDetection: Boolean? = null
        private var xLlmSkipOutputCodeDetection: Boolean? = null
        private var xLlmSkipOutputPiiDetection: Boolean? = null
        private var xLlmSkipOutputUrlDetection: Boolean? = null
        private var xLlmSkipPromptInjectionDetection: Boolean? = null
        private var xRequesterId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(promptAnalyzerCreateParams: PromptAnalyzerCreateParams) = apply {
            xLlmBlockGuardrailDetection = promptAnalyzerCreateParams.xLlmBlockGuardrailDetection
            xLlmBlockInputCodeDetection = promptAnalyzerCreateParams.xLlmBlockInputCodeDetection
            xLlmBlockInputDosDetection = promptAnalyzerCreateParams.xLlmBlockInputDosDetection
            xLlmBlockInputPii = promptAnalyzerCreateParams.xLlmBlockInputPii
            xLlmBlockOutputCodeDetection = promptAnalyzerCreateParams.xLlmBlockOutputCodeDetection
            xLlmBlockOutputPii = promptAnalyzerCreateParams.xLlmBlockOutputPii
            xLlmBlockPromptInjection = promptAnalyzerCreateParams.xLlmBlockPromptInjection
            xLlmBlockUnsafe = promptAnalyzerCreateParams.xLlmBlockUnsafe
            xLlmBlockUnsafeInput = promptAnalyzerCreateParams.xLlmBlockUnsafeInput
            xLlmBlockUnsafeOutput = promptAnalyzerCreateParams.xLlmBlockUnsafeOutput
            xLlmEntityType = promptAnalyzerCreateParams.xLlmEntityType
            xLlmInputDosDetectionThreshold =
                promptAnalyzerCreateParams.xLlmInputDosDetectionThreshold
            xLlmPromptInjectionScanType = promptAnalyzerCreateParams.xLlmPromptInjectionScanType
            xLlmRedactInputPii = promptAnalyzerCreateParams.xLlmRedactInputPii
            xLlmRedactOutputPii = promptAnalyzerCreateParams.xLlmRedactOutputPii
            xLlmRedactType = promptAnalyzerCreateParams.xLlmRedactType
            xLlmSkipGuardrailDetection = promptAnalyzerCreateParams.xLlmSkipGuardrailDetection
            xLlmSkipInputCodeDetection = promptAnalyzerCreateParams.xLlmSkipInputCodeDetection
            xLlmSkipInputDosDetection = promptAnalyzerCreateParams.xLlmSkipInputDosDetection
            xLlmSkipInputPiiDetection = promptAnalyzerCreateParams.xLlmSkipInputPiiDetection
            xLlmSkipInputUrlDetection = promptAnalyzerCreateParams.xLlmSkipInputUrlDetection
            xLlmSkipOutputCodeDetection = promptAnalyzerCreateParams.xLlmSkipOutputCodeDetection
            xLlmSkipOutputPiiDetection = promptAnalyzerCreateParams.xLlmSkipOutputPiiDetection
            xLlmSkipOutputUrlDetection = promptAnalyzerCreateParams.xLlmSkipOutputUrlDetection
            xLlmSkipPromptInjectionDetection =
                promptAnalyzerCreateParams.xLlmSkipPromptInjectionDetection
            xRequesterId = promptAnalyzerCreateParams.xRequesterId
            body = promptAnalyzerCreateParams.body.toBuilder()
            additionalHeaders = promptAnalyzerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = promptAnalyzerCreateParams.additionalQueryParams.toBuilder()
        }

        fun xLlmBlockGuardrailDetection(xLlmBlockGuardrailDetection: Boolean?) = apply {
            this.xLlmBlockGuardrailDetection = xLlmBlockGuardrailDetection
        }

        /**
         * Alias for [Builder.xLlmBlockGuardrailDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockGuardrailDetection(xLlmBlockGuardrailDetection: Boolean) =
            xLlmBlockGuardrailDetection(xLlmBlockGuardrailDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockGuardrailDetection] with
         * `xLlmBlockGuardrailDetection.orElse(null)`.
         */
        fun xLlmBlockGuardrailDetection(xLlmBlockGuardrailDetection: Optional<Boolean>) =
            xLlmBlockGuardrailDetection(xLlmBlockGuardrailDetection.getOrNull())

        fun xLlmBlockInputCodeDetection(xLlmBlockInputCodeDetection: Boolean?) = apply {
            this.xLlmBlockInputCodeDetection = xLlmBlockInputCodeDetection
        }

        /**
         * Alias for [Builder.xLlmBlockInputCodeDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockInputCodeDetection(xLlmBlockInputCodeDetection: Boolean) =
            xLlmBlockInputCodeDetection(xLlmBlockInputCodeDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockInputCodeDetection] with
         * `xLlmBlockInputCodeDetection.orElse(null)`.
         */
        fun xLlmBlockInputCodeDetection(xLlmBlockInputCodeDetection: Optional<Boolean>) =
            xLlmBlockInputCodeDetection(xLlmBlockInputCodeDetection.getOrNull())

        fun xLlmBlockInputDosDetection(xLlmBlockInputDosDetection: Boolean?) = apply {
            this.xLlmBlockInputDosDetection = xLlmBlockInputDosDetection
        }

        /**
         * Alias for [Builder.xLlmBlockInputDosDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockInputDosDetection(xLlmBlockInputDosDetection: Boolean) =
            xLlmBlockInputDosDetection(xLlmBlockInputDosDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockInputDosDetection] with
         * `xLlmBlockInputDosDetection.orElse(null)`.
         */
        fun xLlmBlockInputDosDetection(xLlmBlockInputDosDetection: Optional<Boolean>) =
            xLlmBlockInputDosDetection(xLlmBlockInputDosDetection.getOrNull())

        fun xLlmBlockInputPii(xLlmBlockInputPii: Boolean?) = apply {
            this.xLlmBlockInputPii = xLlmBlockInputPii
        }

        /**
         * Alias for [Builder.xLlmBlockInputPii].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockInputPii(xLlmBlockInputPii: Boolean) =
            xLlmBlockInputPii(xLlmBlockInputPii as Boolean?)

        /** Alias for calling [Builder.xLlmBlockInputPii] with `xLlmBlockInputPii.orElse(null)`. */
        fun xLlmBlockInputPii(xLlmBlockInputPii: Optional<Boolean>) =
            xLlmBlockInputPii(xLlmBlockInputPii.getOrNull())

        fun xLlmBlockOutputCodeDetection(xLlmBlockOutputCodeDetection: Boolean?) = apply {
            this.xLlmBlockOutputCodeDetection = xLlmBlockOutputCodeDetection
        }

        /**
         * Alias for [Builder.xLlmBlockOutputCodeDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockOutputCodeDetection(xLlmBlockOutputCodeDetection: Boolean) =
            xLlmBlockOutputCodeDetection(xLlmBlockOutputCodeDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockOutputCodeDetection] with
         * `xLlmBlockOutputCodeDetection.orElse(null)`.
         */
        fun xLlmBlockOutputCodeDetection(xLlmBlockOutputCodeDetection: Optional<Boolean>) =
            xLlmBlockOutputCodeDetection(xLlmBlockOutputCodeDetection.getOrNull())

        fun xLlmBlockOutputPii(xLlmBlockOutputPii: Boolean?) = apply {
            this.xLlmBlockOutputPii = xLlmBlockOutputPii
        }

        /**
         * Alias for [Builder.xLlmBlockOutputPii].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockOutputPii(xLlmBlockOutputPii: Boolean) =
            xLlmBlockOutputPii(xLlmBlockOutputPii as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockOutputPii] with `xLlmBlockOutputPii.orElse(null)`.
         */
        fun xLlmBlockOutputPii(xLlmBlockOutputPii: Optional<Boolean>) =
            xLlmBlockOutputPii(xLlmBlockOutputPii.getOrNull())

        fun xLlmBlockPromptInjection(xLlmBlockPromptInjection: Boolean?) = apply {
            this.xLlmBlockPromptInjection = xLlmBlockPromptInjection
        }

        /**
         * Alias for [Builder.xLlmBlockPromptInjection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockPromptInjection(xLlmBlockPromptInjection: Boolean) =
            xLlmBlockPromptInjection(xLlmBlockPromptInjection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockPromptInjection] with
         * `xLlmBlockPromptInjection.orElse(null)`.
         */
        fun xLlmBlockPromptInjection(xLlmBlockPromptInjection: Optional<Boolean>) =
            xLlmBlockPromptInjection(xLlmBlockPromptInjection.getOrNull())

        fun xLlmBlockUnsafe(xLlmBlockUnsafe: Boolean?) = apply {
            this.xLlmBlockUnsafe = xLlmBlockUnsafe
        }

        /**
         * Alias for [Builder.xLlmBlockUnsafe].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockUnsafe(xLlmBlockUnsafe: Boolean) = xLlmBlockUnsafe(xLlmBlockUnsafe as Boolean?)

        /** Alias for calling [Builder.xLlmBlockUnsafe] with `xLlmBlockUnsafe.orElse(null)`. */
        fun xLlmBlockUnsafe(xLlmBlockUnsafe: Optional<Boolean>) =
            xLlmBlockUnsafe(xLlmBlockUnsafe.getOrNull())

        fun xLlmBlockUnsafeInput(xLlmBlockUnsafeInput: Boolean?) = apply {
            this.xLlmBlockUnsafeInput = xLlmBlockUnsafeInput
        }

        /**
         * Alias for [Builder.xLlmBlockUnsafeInput].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockUnsafeInput(xLlmBlockUnsafeInput: Boolean) =
            xLlmBlockUnsafeInput(xLlmBlockUnsafeInput as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockUnsafeInput] with
         * `xLlmBlockUnsafeInput.orElse(null)`.
         */
        fun xLlmBlockUnsafeInput(xLlmBlockUnsafeInput: Optional<Boolean>) =
            xLlmBlockUnsafeInput(xLlmBlockUnsafeInput.getOrNull())

        fun xLlmBlockUnsafeOutput(xLlmBlockUnsafeOutput: Boolean?) = apply {
            this.xLlmBlockUnsafeOutput = xLlmBlockUnsafeOutput
        }

        /**
         * Alias for [Builder.xLlmBlockUnsafeOutput].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmBlockUnsafeOutput(xLlmBlockUnsafeOutput: Boolean) =
            xLlmBlockUnsafeOutput(xLlmBlockUnsafeOutput as Boolean?)

        /**
         * Alias for calling [Builder.xLlmBlockUnsafeOutput] with
         * `xLlmBlockUnsafeOutput.orElse(null)`.
         */
        fun xLlmBlockUnsafeOutput(xLlmBlockUnsafeOutput: Optional<Boolean>) =
            xLlmBlockUnsafeOutput(xLlmBlockUnsafeOutput.getOrNull())

        /** The type of entity to redact */
        fun xLlmEntityType(xLlmEntityType: XLlmEntityType?) = apply {
            this.xLlmEntityType = xLlmEntityType
        }

        /** Alias for calling [Builder.xLlmEntityType] with `xLlmEntityType.orElse(null)`. */
        fun xLlmEntityType(xLlmEntityType: Optional<XLlmEntityType>) =
            xLlmEntityType(xLlmEntityType.getOrNull())

        fun xLlmInputDosDetectionThreshold(xLlmInputDosDetectionThreshold: String?) = apply {
            this.xLlmInputDosDetectionThreshold = xLlmInputDosDetectionThreshold
        }

        /**
         * Alias for calling [Builder.xLlmInputDosDetectionThreshold] with
         * `xLlmInputDosDetectionThreshold.orElse(null)`.
         */
        fun xLlmInputDosDetectionThreshold(xLlmInputDosDetectionThreshold: Optional<String>) =
            xLlmInputDosDetectionThreshold(xLlmInputDosDetectionThreshold.getOrNull())

        /** The type of prompt injection scan to use */
        fun xLlmPromptInjectionScanType(xLlmPromptInjectionScanType: XLlmPromptInjectionScanType?) =
            apply {
                this.xLlmPromptInjectionScanType = xLlmPromptInjectionScanType
            }

        /**
         * Alias for calling [Builder.xLlmPromptInjectionScanType] with
         * `xLlmPromptInjectionScanType.orElse(null)`.
         */
        fun xLlmPromptInjectionScanType(
            xLlmPromptInjectionScanType: Optional<XLlmPromptInjectionScanType>
        ) = xLlmPromptInjectionScanType(xLlmPromptInjectionScanType.getOrNull())

        fun xLlmRedactInputPii(xLlmRedactInputPii: Boolean?) = apply {
            this.xLlmRedactInputPii = xLlmRedactInputPii
        }

        /**
         * Alias for [Builder.xLlmRedactInputPii].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmRedactInputPii(xLlmRedactInputPii: Boolean) =
            xLlmRedactInputPii(xLlmRedactInputPii as Boolean?)

        /**
         * Alias for calling [Builder.xLlmRedactInputPii] with `xLlmRedactInputPii.orElse(null)`.
         */
        fun xLlmRedactInputPii(xLlmRedactInputPii: Optional<Boolean>) =
            xLlmRedactInputPii(xLlmRedactInputPii.getOrNull())

        fun xLlmRedactOutputPii(xLlmRedactOutputPii: Boolean?) = apply {
            this.xLlmRedactOutputPii = xLlmRedactOutputPii
        }

        /**
         * Alias for [Builder.xLlmRedactOutputPii].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmRedactOutputPii(xLlmRedactOutputPii: Boolean) =
            xLlmRedactOutputPii(xLlmRedactOutputPii as Boolean?)

        /**
         * Alias for calling [Builder.xLlmRedactOutputPii] with `xLlmRedactOutputPii.orElse(null)`.
         */
        fun xLlmRedactOutputPii(xLlmRedactOutputPii: Optional<Boolean>) =
            xLlmRedactOutputPii(xLlmRedactOutputPii.getOrNull())

        /** The type of redaction to use */
        fun xLlmRedactType(xLlmRedactType: XLlmRedactType?) = apply {
            this.xLlmRedactType = xLlmRedactType
        }

        /** Alias for calling [Builder.xLlmRedactType] with `xLlmRedactType.orElse(null)`. */
        fun xLlmRedactType(xLlmRedactType: Optional<XLlmRedactType>) =
            xLlmRedactType(xLlmRedactType.getOrNull())

        fun xLlmSkipGuardrailDetection(xLlmSkipGuardrailDetection: Boolean?) = apply {
            this.xLlmSkipGuardrailDetection = xLlmSkipGuardrailDetection
        }

        /**
         * Alias for [Builder.xLlmSkipGuardrailDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipGuardrailDetection(xLlmSkipGuardrailDetection: Boolean) =
            xLlmSkipGuardrailDetection(xLlmSkipGuardrailDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipGuardrailDetection] with
         * `xLlmSkipGuardrailDetection.orElse(null)`.
         */
        fun xLlmSkipGuardrailDetection(xLlmSkipGuardrailDetection: Optional<Boolean>) =
            xLlmSkipGuardrailDetection(xLlmSkipGuardrailDetection.getOrNull())

        fun xLlmSkipInputCodeDetection(xLlmSkipInputCodeDetection: Boolean?) = apply {
            this.xLlmSkipInputCodeDetection = xLlmSkipInputCodeDetection
        }

        /**
         * Alias for [Builder.xLlmSkipInputCodeDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipInputCodeDetection(xLlmSkipInputCodeDetection: Boolean) =
            xLlmSkipInputCodeDetection(xLlmSkipInputCodeDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipInputCodeDetection] with
         * `xLlmSkipInputCodeDetection.orElse(null)`.
         */
        fun xLlmSkipInputCodeDetection(xLlmSkipInputCodeDetection: Optional<Boolean>) =
            xLlmSkipInputCodeDetection(xLlmSkipInputCodeDetection.getOrNull())

        fun xLlmSkipInputDosDetection(xLlmSkipInputDosDetection: Boolean?) = apply {
            this.xLlmSkipInputDosDetection = xLlmSkipInputDosDetection
        }

        /**
         * Alias for [Builder.xLlmSkipInputDosDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipInputDosDetection(xLlmSkipInputDosDetection: Boolean) =
            xLlmSkipInputDosDetection(xLlmSkipInputDosDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipInputDosDetection] with
         * `xLlmSkipInputDosDetection.orElse(null)`.
         */
        fun xLlmSkipInputDosDetection(xLlmSkipInputDosDetection: Optional<Boolean>) =
            xLlmSkipInputDosDetection(xLlmSkipInputDosDetection.getOrNull())

        fun xLlmSkipInputPiiDetection(xLlmSkipInputPiiDetection: Boolean?) = apply {
            this.xLlmSkipInputPiiDetection = xLlmSkipInputPiiDetection
        }

        /**
         * Alias for [Builder.xLlmSkipInputPiiDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipInputPiiDetection(xLlmSkipInputPiiDetection: Boolean) =
            xLlmSkipInputPiiDetection(xLlmSkipInputPiiDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipInputPiiDetection] with
         * `xLlmSkipInputPiiDetection.orElse(null)`.
         */
        fun xLlmSkipInputPiiDetection(xLlmSkipInputPiiDetection: Optional<Boolean>) =
            xLlmSkipInputPiiDetection(xLlmSkipInputPiiDetection.getOrNull())

        fun xLlmSkipInputUrlDetection(xLlmSkipInputUrlDetection: Boolean?) = apply {
            this.xLlmSkipInputUrlDetection = xLlmSkipInputUrlDetection
        }

        /**
         * Alias for [Builder.xLlmSkipInputUrlDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipInputUrlDetection(xLlmSkipInputUrlDetection: Boolean) =
            xLlmSkipInputUrlDetection(xLlmSkipInputUrlDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipInputUrlDetection] with
         * `xLlmSkipInputUrlDetection.orElse(null)`.
         */
        fun xLlmSkipInputUrlDetection(xLlmSkipInputUrlDetection: Optional<Boolean>) =
            xLlmSkipInputUrlDetection(xLlmSkipInputUrlDetection.getOrNull())

        fun xLlmSkipOutputCodeDetection(xLlmSkipOutputCodeDetection: Boolean?) = apply {
            this.xLlmSkipOutputCodeDetection = xLlmSkipOutputCodeDetection
        }

        /**
         * Alias for [Builder.xLlmSkipOutputCodeDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipOutputCodeDetection(xLlmSkipOutputCodeDetection: Boolean) =
            xLlmSkipOutputCodeDetection(xLlmSkipOutputCodeDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipOutputCodeDetection] with
         * `xLlmSkipOutputCodeDetection.orElse(null)`.
         */
        fun xLlmSkipOutputCodeDetection(xLlmSkipOutputCodeDetection: Optional<Boolean>) =
            xLlmSkipOutputCodeDetection(xLlmSkipOutputCodeDetection.getOrNull())

        fun xLlmSkipOutputPiiDetection(xLlmSkipOutputPiiDetection: Boolean?) = apply {
            this.xLlmSkipOutputPiiDetection = xLlmSkipOutputPiiDetection
        }

        /**
         * Alias for [Builder.xLlmSkipOutputPiiDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipOutputPiiDetection(xLlmSkipOutputPiiDetection: Boolean) =
            xLlmSkipOutputPiiDetection(xLlmSkipOutputPiiDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipOutputPiiDetection] with
         * `xLlmSkipOutputPiiDetection.orElse(null)`.
         */
        fun xLlmSkipOutputPiiDetection(xLlmSkipOutputPiiDetection: Optional<Boolean>) =
            xLlmSkipOutputPiiDetection(xLlmSkipOutputPiiDetection.getOrNull())

        fun xLlmSkipOutputUrlDetection(xLlmSkipOutputUrlDetection: Boolean?) = apply {
            this.xLlmSkipOutputUrlDetection = xLlmSkipOutputUrlDetection
        }

        /**
         * Alias for [Builder.xLlmSkipOutputUrlDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipOutputUrlDetection(xLlmSkipOutputUrlDetection: Boolean) =
            xLlmSkipOutputUrlDetection(xLlmSkipOutputUrlDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipOutputUrlDetection] with
         * `xLlmSkipOutputUrlDetection.orElse(null)`.
         */
        fun xLlmSkipOutputUrlDetection(xLlmSkipOutputUrlDetection: Optional<Boolean>) =
            xLlmSkipOutputUrlDetection(xLlmSkipOutputUrlDetection.getOrNull())

        fun xLlmSkipPromptInjectionDetection(xLlmSkipPromptInjectionDetection: Boolean?) = apply {
            this.xLlmSkipPromptInjectionDetection = xLlmSkipPromptInjectionDetection
        }

        /**
         * Alias for [Builder.xLlmSkipPromptInjectionDetection].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun xLlmSkipPromptInjectionDetection(xLlmSkipPromptInjectionDetection: Boolean) =
            xLlmSkipPromptInjectionDetection(xLlmSkipPromptInjectionDetection as Boolean?)

        /**
         * Alias for calling [Builder.xLlmSkipPromptInjectionDetection] with
         * `xLlmSkipPromptInjectionDetection.orElse(null)`.
         */
        fun xLlmSkipPromptInjectionDetection(xLlmSkipPromptInjectionDetection: Optional<Boolean>) =
            xLlmSkipPromptInjectionDetection(xLlmSkipPromptInjectionDetection.getOrNull())

        fun xRequesterId(xRequesterId: String?) = apply { this.xRequesterId = xRequesterId }

        /** Alias for calling [Builder.xRequesterId] with `xRequesterId.orElse(null)`. */
        fun xRequesterId(xRequesterId: Optional<String>) = xRequesterId(xRequesterId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [prompt]
         * - [model]
         * - [output]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun prompt(prompt: String) = apply { body.prompt(prompt) }

        /**
         * Sets [Builder.prompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prompt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prompt(prompt: JsonField<String>) = apply { body.prompt(prompt) }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun output(output: String) = apply { body.output(output) }

        /**
         * Sets [Builder.output] to an arbitrary JSON value.
         *
         * You should usually call [Builder.output] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun output(output: JsonField<String>) = apply { body.output(output) }

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
         * Returns an immutable instance of [PromptAnalyzerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .prompt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptAnalyzerCreateParams =
            PromptAnalyzerCreateParams(
                xLlmBlockGuardrailDetection,
                xLlmBlockInputCodeDetection,
                xLlmBlockInputDosDetection,
                xLlmBlockInputPii,
                xLlmBlockOutputCodeDetection,
                xLlmBlockOutputPii,
                xLlmBlockPromptInjection,
                xLlmBlockUnsafe,
                xLlmBlockUnsafeInput,
                xLlmBlockUnsafeOutput,
                xLlmEntityType,
                xLlmInputDosDetectionThreshold,
                xLlmPromptInjectionScanType,
                xLlmRedactInputPii,
                xLlmRedactOutputPii,
                xLlmRedactType,
                xLlmSkipGuardrailDetection,
                xLlmSkipInputCodeDetection,
                xLlmSkipInputDosDetection,
                xLlmSkipInputPiiDetection,
                xLlmSkipInputUrlDetection,
                xLlmSkipOutputCodeDetection,
                xLlmSkipOutputPiiDetection,
                xLlmSkipOutputUrlDetection,
                xLlmSkipPromptInjectionDetection,
                xRequesterId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xLlmBlockGuardrailDetection?.let {
                    put("X-LLM-Block-Guardrail-Detection", it.toString())
                }
                xLlmBlockInputCodeDetection?.let {
                    put("X-LLM-Block-Input-Code-Detection", it.toString())
                }
                xLlmBlockInputDosDetection?.let {
                    put("X-LLM-Block-Input-DOS-Detection", it.toString())
                }
                xLlmBlockInputPii?.let { put("X-LLM-Block-Input-PII", it.toString()) }
                xLlmBlockOutputCodeDetection?.let {
                    put("X-LLM-Block-Output-Code-Detection", it.toString())
                }
                xLlmBlockOutputPii?.let { put("X-LLM-Block-Output-PII", it.toString()) }
                xLlmBlockPromptInjection?.let { put("X-LLM-Block-Prompt-Injection", it.toString()) }
                xLlmBlockUnsafe?.let { put("X-LLM-Block-Unsafe", it.toString()) }
                xLlmBlockUnsafeInput?.let { put("X-LLM-Block-Unsafe-Input", it.toString()) }
                xLlmBlockUnsafeOutput?.let { put("X-LLM-Block-Unsafe-Output", it.toString()) }
                xLlmEntityType?.let { put("X-LLM-Entity-Type", it.toString()) }
                xLlmInputDosDetectionThreshold?.let {
                    put("X-LLM-Input-DOS-Detection-Threshold", it)
                }
                xLlmPromptInjectionScanType?.let {
                    put("X-LLM-Prompt-Injection-Scan-Type", it.toString())
                }
                xLlmRedactInputPii?.let { put("X-LLM-Redact-Input-PII", it.toString()) }
                xLlmRedactOutputPii?.let { put("X-LLM-Redact-Output-PII", it.toString()) }
                xLlmRedactType?.let { put("X-LLM-Redact-Type", it.toString()) }
                xLlmSkipGuardrailDetection?.let {
                    put("X-LLM-Skip-Guardrail-Detection", it.toString())
                }
                xLlmSkipInputCodeDetection?.let {
                    put("X-LLM-Skip-Input-Code-Detection", it.toString())
                }
                xLlmSkipInputDosDetection?.let {
                    put("X-LLM-Skip-Input-DOS-Detection", it.toString())
                }
                xLlmSkipInputPiiDetection?.let {
                    put("X-LLM-Skip-Input-PII-Detection", it.toString())
                }
                xLlmSkipInputUrlDetection?.let {
                    put("X-LLM-Skip-Input-URL-Detection", it.toString())
                }
                xLlmSkipOutputCodeDetection?.let {
                    put("X-LLM-Skip-Output-Code-Detection", it.toString())
                }
                xLlmSkipOutputPiiDetection?.let {
                    put("X-LLM-Skip-Output-PII-Detection", it.toString())
                }
                xLlmSkipOutputUrlDetection?.let {
                    put("X-LLM-Skip-Output-URL-Detection", it.toString())
                }
                xLlmSkipPromptInjectionDetection?.let {
                    put("X-LLM-Skip-Prompt-Injection-Detection", it.toString())
                }
                xRequesterId?.let { put("X-Requester-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** The request to the prompt analyzer endpoint */
    class Body
    private constructor(
        private val prompt: JsonField<String>,
        private val model: JsonField<String>,
        private val output: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("prompt") @ExcludeMissing prompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("output") @ExcludeMissing output: JsonField<String> = JsonMissing.of(),
        ) : this(prompt, model, output, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prompt(): String = prompt.getRequired("prompt")

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
         * Returns the raw JSON value of [prompt].
         *
         * Unlike [prompt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt") @ExcludeMissing fun _prompt(): JsonField<String> = prompt

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .prompt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var prompt: JsonField<String>? = null
            private var model: JsonField<String> = JsonMissing.of()
            private var output: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                prompt = body.prompt
                model = body.model
                output = body.output
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun prompt(prompt: String) = prompt(JsonField.of(prompt))

            /**
             * Sets [Builder.prompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prompt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prompt(prompt: JsonField<String>) = apply { this.prompt = prompt }

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
             *
             * The following fields are required:
             * ```java
             * .prompt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("prompt", prompt),
                    model,
                    output,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            prompt()
            model()
            output()
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
            (if (prompt.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (output.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && prompt == other.prompt && model == other.model && output == other.output && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(prompt, model, output, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{prompt=$prompt, model=$model, output=$output, additionalProperties=$additionalProperties}"
    }

    /** The type of entity to redact */
    class XLlmEntityType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STRICT = of("strict")

            @JvmField val ALL = of("all")

            @JvmStatic fun of(value: String) = XLlmEntityType(JsonField.of(value))
        }

        /** An enum containing [XLlmEntityType]'s known values. */
        enum class Known {
            STRICT,
            ALL,
        }

        /**
         * An enum containing [XLlmEntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [XLlmEntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STRICT,
            ALL,
            /**
             * An enum member indicating that [XLlmEntityType] was instantiated with an unknown
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
                STRICT -> Value.STRICT
                ALL -> Value.ALL
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
                STRICT -> Known.STRICT
                ALL -> Known.ALL
                else -> throw HiddenLayerInvalidDataException("Unknown XLlmEntityType: $value")
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

        fun validate(): XLlmEntityType = apply {
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

            return /* spotless:off */ other is XLlmEntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of prompt injection scan to use */
    class XLlmPromptInjectionScanType
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

            @JvmField val QUICK = of("quick")

            @JvmField val FULL = of("full")

            @JvmStatic fun of(value: String) = XLlmPromptInjectionScanType(JsonField.of(value))
        }

        /** An enum containing [XLlmPromptInjectionScanType]'s known values. */
        enum class Known {
            QUICK,
            FULL,
        }

        /**
         * An enum containing [XLlmPromptInjectionScanType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [XLlmPromptInjectionScanType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUICK,
            FULL,
            /**
             * An enum member indicating that [XLlmPromptInjectionScanType] was instantiated with an
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
                QUICK -> Value.QUICK
                FULL -> Value.FULL
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
                QUICK -> Known.QUICK
                FULL -> Known.FULL
                else ->
                    throw HiddenLayerInvalidDataException(
                        "Unknown XLlmPromptInjectionScanType: $value"
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

        fun validate(): XLlmPromptInjectionScanType = apply {
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

            return /* spotless:off */ other is XLlmPromptInjectionScanType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of redaction to use */
    class XLlmRedactType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ENTITY = of("entity")

            @JvmField val STRICT = of("strict")

            @JvmStatic fun of(value: String) = XLlmRedactType(JsonField.of(value))
        }

        /** An enum containing [XLlmRedactType]'s known values. */
        enum class Known {
            ENTITY,
            STRICT,
        }

        /**
         * An enum containing [XLlmRedactType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [XLlmRedactType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ENTITY,
            STRICT,
            /**
             * An enum member indicating that [XLlmRedactType] was instantiated with an unknown
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
                ENTITY -> Value.ENTITY
                STRICT -> Value.STRICT
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
                ENTITY -> Known.ENTITY
                STRICT -> Known.STRICT
                else -> throw HiddenLayerInvalidDataException("Unknown XLlmRedactType: $value")
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

        fun validate(): XLlmRedactType = apply {
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

            return /* spotless:off */ other is XLlmRedactType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PromptAnalyzerCreateParams && xLlmBlockGuardrailDetection == other.xLlmBlockGuardrailDetection && xLlmBlockInputCodeDetection == other.xLlmBlockInputCodeDetection && xLlmBlockInputDosDetection == other.xLlmBlockInputDosDetection && xLlmBlockInputPii == other.xLlmBlockInputPii && xLlmBlockOutputCodeDetection == other.xLlmBlockOutputCodeDetection && xLlmBlockOutputPii == other.xLlmBlockOutputPii && xLlmBlockPromptInjection == other.xLlmBlockPromptInjection && xLlmBlockUnsafe == other.xLlmBlockUnsafe && xLlmBlockUnsafeInput == other.xLlmBlockUnsafeInput && xLlmBlockUnsafeOutput == other.xLlmBlockUnsafeOutput && xLlmEntityType == other.xLlmEntityType && xLlmInputDosDetectionThreshold == other.xLlmInputDosDetectionThreshold && xLlmPromptInjectionScanType == other.xLlmPromptInjectionScanType && xLlmRedactInputPii == other.xLlmRedactInputPii && xLlmRedactOutputPii == other.xLlmRedactOutputPii && xLlmRedactType == other.xLlmRedactType && xLlmSkipGuardrailDetection == other.xLlmSkipGuardrailDetection && xLlmSkipInputCodeDetection == other.xLlmSkipInputCodeDetection && xLlmSkipInputDosDetection == other.xLlmSkipInputDosDetection && xLlmSkipInputPiiDetection == other.xLlmSkipInputPiiDetection && xLlmSkipInputUrlDetection == other.xLlmSkipInputUrlDetection && xLlmSkipOutputCodeDetection == other.xLlmSkipOutputCodeDetection && xLlmSkipOutputPiiDetection == other.xLlmSkipOutputPiiDetection && xLlmSkipOutputUrlDetection == other.xLlmSkipOutputUrlDetection && xLlmSkipPromptInjectionDetection == other.xLlmSkipPromptInjectionDetection && xRequesterId == other.xRequesterId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlmBlockGuardrailDetection, xLlmBlockInputCodeDetection, xLlmBlockInputDosDetection, xLlmBlockInputPii, xLlmBlockOutputCodeDetection, xLlmBlockOutputPii, xLlmBlockPromptInjection, xLlmBlockUnsafe, xLlmBlockUnsafeInput, xLlmBlockUnsafeOutput, xLlmEntityType, xLlmInputDosDetectionThreshold, xLlmPromptInjectionScanType, xLlmRedactInputPii, xLlmRedactOutputPii, xLlmRedactType, xLlmSkipGuardrailDetection, xLlmSkipInputCodeDetection, xLlmSkipInputDosDetection, xLlmSkipInputPiiDetection, xLlmSkipInputUrlDetection, xLlmSkipOutputCodeDetection, xLlmSkipOutputPiiDetection, xLlmSkipOutputUrlDetection, xLlmSkipPromptInjectionDetection, xRequesterId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PromptAnalyzerCreateParams{xLlmBlockGuardrailDetection=$xLlmBlockGuardrailDetection, xLlmBlockInputCodeDetection=$xLlmBlockInputCodeDetection, xLlmBlockInputDosDetection=$xLlmBlockInputDosDetection, xLlmBlockInputPii=$xLlmBlockInputPii, xLlmBlockOutputCodeDetection=$xLlmBlockOutputCodeDetection, xLlmBlockOutputPii=$xLlmBlockOutputPii, xLlmBlockPromptInjection=$xLlmBlockPromptInjection, xLlmBlockUnsafe=$xLlmBlockUnsafe, xLlmBlockUnsafeInput=$xLlmBlockUnsafeInput, xLlmBlockUnsafeOutput=$xLlmBlockUnsafeOutput, xLlmEntityType=$xLlmEntityType, xLlmInputDosDetectionThreshold=$xLlmInputDosDetectionThreshold, xLlmPromptInjectionScanType=$xLlmPromptInjectionScanType, xLlmRedactInputPii=$xLlmRedactInputPii, xLlmRedactOutputPii=$xLlmRedactOutputPii, xLlmRedactType=$xLlmRedactType, xLlmSkipGuardrailDetection=$xLlmSkipGuardrailDetection, xLlmSkipInputCodeDetection=$xLlmSkipInputCodeDetection, xLlmSkipInputDosDetection=$xLlmSkipInputDosDetection, xLlmSkipInputPiiDetection=$xLlmSkipInputPiiDetection, xLlmSkipInputUrlDetection=$xLlmSkipInputUrlDetection, xLlmSkipOutputCodeDetection=$xLlmSkipOutputCodeDetection, xLlmSkipOutputPiiDetection=$xLlmSkipOutputPiiDetection, xLlmSkipOutputUrlDetection=$xLlmSkipOutputUrlDetection, xLlmSkipPromptInjectionDetection=$xLlmSkipPromptInjectionDetection, xRequesterId=$xRequesterId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
