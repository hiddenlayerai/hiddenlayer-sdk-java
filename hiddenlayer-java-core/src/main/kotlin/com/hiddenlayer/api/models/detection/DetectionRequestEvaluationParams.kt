// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.detection

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.Params
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
 * Breaking changes may occur.
 *
 * Analyzes an LLM request payload for security threats before it is sent to the model.
 *
 * Accepts any valid provider request payload and returns:
 * - If detect or redact action: the request payload (potentially modified) in the provider's
 *   request format
 * - If block action: a canned block message in the provider's response format
 *
 * Use this endpoint inline in your LLM pipeline to evaluate prompts before they reach the model.
 *
 * Supported provider formats:
 * - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
 * - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
 * - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
 */
class DetectionRequestEvaluationParams
private constructor(
    private val hlProjectId: String?,
    private val hlRuntimeSessionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun hlProjectId(): Optional<String> = Optional.ofNullable(hlProjectId)

    fun hlRuntimeSessionId(): Optional<String> = Optional.ofNullable(hlRuntimeSessionId)

    /**
     * A pass-through payload in the native format of the LLM provider. Any valid provider request
     * or response payload is accepted as-is and returned in the same format.
     */
    fun body(): Body = body

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DetectionRequestEvaluationParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DetectionRequestEvaluationParams]. */
    class Builder internal constructor() {

        private var hlProjectId: String? = null
        private var hlRuntimeSessionId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(detectionRequestEvaluationParams: DetectionRequestEvaluationParams) =
            apply {
                hlProjectId = detectionRequestEvaluationParams.hlProjectId
                hlRuntimeSessionId = detectionRequestEvaluationParams.hlRuntimeSessionId
                body = detectionRequestEvaluationParams.body
                additionalHeaders = detectionRequestEvaluationParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    detectionRequestEvaluationParams.additionalQueryParams.toBuilder()
            }

        fun hlProjectId(hlProjectId: String?) = apply { this.hlProjectId = hlProjectId }

        /** Alias for calling [Builder.hlProjectId] with `hlProjectId.orElse(null)`. */
        fun hlProjectId(hlProjectId: Optional<String>) = hlProjectId(hlProjectId.getOrNull())

        fun hlRuntimeSessionId(hlRuntimeSessionId: String?) = apply {
            this.hlRuntimeSessionId = hlRuntimeSessionId
        }

        /**
         * Alias for calling [Builder.hlRuntimeSessionId] with `hlRuntimeSessionId.orElse(null)`.
         */
        fun hlRuntimeSessionId(hlRuntimeSessionId: Optional<String>) =
            hlRuntimeSessionId(hlRuntimeSessionId.getOrNull())

        /**
         * A pass-through payload in the native format of the LLM provider. Any valid provider
         * request or response payload is accepted as-is and returned in the same format.
         */
        fun body(body: Body) = apply { this.body = body }

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
         * Returns an immutable instance of [DetectionRequestEvaluationParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DetectionRequestEvaluationParams =
            DetectionRequestEvaluationParams(
                hlProjectId,
                hlRuntimeSessionId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                hlProjectId?.let { put("HL-Project-Id", it) }
                hlRuntimeSessionId?.let { put("HL-Runtime-Session-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A pass-through payload in the native format of the LLM provider. Any valid provider request
     * or response payload is accepted as-is and returned in the same format.
     */
    class Body
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

            return other is Body && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DetectionRequestEvaluationParams &&
            hlProjectId == other.hlProjectId &&
            hlRuntimeSessionId == other.hlRuntimeSessionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            hlProjectId,
            hlRuntimeSessionId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "DetectionRequestEvaluationParams{hlProjectId=$hlProjectId, hlRuntimeSessionId=$hlRuntimeSessionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
