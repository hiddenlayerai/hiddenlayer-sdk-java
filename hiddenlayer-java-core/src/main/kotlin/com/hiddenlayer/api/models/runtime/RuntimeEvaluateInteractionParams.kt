// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.runtime

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.BaseDeserializer
import com.hiddenlayer.api.core.BaseSerializer
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.Params
import com.hiddenlayer.api.core.allMaxBy
import com.hiddenlayer.api.core.checkKnown
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.getOrThrow
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
 * Breaking changes may occur.
 *
 * Performs synchronous security evaluation on an LLM **interaction**. The interaction can be a
 * standalone user prompt, a standalone model response, a partial exchange, or a long multi-turn
 * message history. The endpoint imposes no requirement that the messages form a complete
 * request/response pair.
 *
 * The request carries `metadata` and an `interaction` payload. The `interaction` field accepts
 * either:
 * - the **canonical**, provider-agnostic form (`CanonicalInteraction`) — an ordered sequence of
 *   messages (user, assistant, system, tool) with their role and content parts, and optionally the
 *   tool catalog that was in scope; or
 * - a **native LLM-provider payload** passed through verbatim. Supported provider formats:
 *     - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
 *     - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
 *     - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
 *
 * Returns the evaluation context (`evaluated_interaction`): the canonicalized messages with
 * per-message signals and findings attached. Also returns the policy outcome, which carries the
 * enforcement action, threat level, any detections, and the effective payload the caller should
 * forward (`outcome.effective_interaction`).
 *
 * Use this endpoint when you need full evaluation results. For inline pass-through (provider
 * request/response payloads returned in the same provider format), use the request-evaluations and
 * response-evaluations endpoints instead.
 */
class RuntimeEvaluateInteractionParams
private constructor(
    private val hlProjectId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun hlProjectId(): Optional<String> = Optional.ofNullable(hlProjectId)

    /**
     * The interaction to evaluate. Accepts either the canonical form (`CanonicalInteraction` —
     * `messages` and optional `tools_available`) or a native LLM-provider payload passed through
     * verbatim. Supported provider formats are OpenAI Chat Completions, OpenAI Responses, and
     * Anthropic Messages. `ProviderPayload` is intentionally permissive (any JSON object) so
     * callers can supply provider-native shapes without schema constraints.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interaction(): Interaction = body.interaction()

    /**
     * Metadata about the LLM interactions being evaluated.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = body.metadata()

    /**
     * Returns the raw JSON value of [interaction].
     *
     * Unlike [interaction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _interaction(): JsonField<Interaction> = body._interaction()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RuntimeEvaluateInteractionParams].
         *
         * The following fields are required:
         * ```java
         * .interaction()
         * .metadata()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuntimeEvaluateInteractionParams]. */
    class Builder internal constructor() {

        private var hlProjectId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runtimeEvaluateInteractionParams: RuntimeEvaluateInteractionParams) =
            apply {
                hlProjectId = runtimeEvaluateInteractionParams.hlProjectId
                body = runtimeEvaluateInteractionParams.body.toBuilder()
                additionalHeaders = runtimeEvaluateInteractionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    runtimeEvaluateInteractionParams.additionalQueryParams.toBuilder()
            }

        fun hlProjectId(hlProjectId: String?) = apply { this.hlProjectId = hlProjectId }

        /** Alias for calling [Builder.hlProjectId] with `hlProjectId.orElse(null)`. */
        fun hlProjectId(hlProjectId: Optional<String>) = hlProjectId(hlProjectId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [interaction]
         * - [metadata]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The interaction to evaluate. Accepts either the canonical form (`CanonicalInteraction` —
         * `messages` and optional `tools_available`) or a native LLM-provider payload passed
         * through verbatim. Supported provider formats are OpenAI Chat Completions, OpenAI
         * Responses, and Anthropic Messages. `ProviderPayload` is intentionally permissive (any
         * JSON object) so callers can supply provider-native shapes without schema constraints.
         */
        fun interaction(interaction: Interaction) = apply { body.interaction(interaction) }

        /**
         * Sets [Builder.interaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interaction] with a well-typed [Interaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interaction(interaction: JsonField<Interaction>) = apply {
            body.interaction(interaction)
        }

        /** Alias for calling [interaction] with `Interaction.ofCanonical(canonical)`. */
        fun interaction(canonical: Interaction.CanonicalInteraction) = apply {
            body.interaction(canonical)
        }

        /**
         * Alias for calling [interaction] with `Interaction.ofProviderPayload(providerPayload)`.
         */
        fun interaction(providerPayload: Interaction.ProviderPayload) = apply {
            body.interaction(providerPayload)
        }

        /** Metadata about the LLM interactions being evaluated. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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
         * Returns an immutable instance of [RuntimeEvaluateInteractionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .interaction()
         * .metadata()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuntimeEvaluateInteractionParams =
            RuntimeEvaluateInteractionParams(
                hlProjectId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                hlProjectId?.let { put("HL-Project-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request payload for synchronous evaluation of an LLM interaction. The interaction a
     * standalone user prompt, a standalone model response, a partial exchange, or a long multi-turn
     * message history. There is no requirement that the messages form a complete request/response
     * pair.
     *
     * The `interaction` field accepts either the canonical, provider-agnostic form
     * (`CanonicalInteraction`) or a native LLM-provider payload passed through verbatim. Supported
     * provider formats are OpenAI Chat Completions, OpenAI Responses, and Anthropic Messages.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val interaction: JsonField<Interaction>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("interaction")
            @ExcludeMissing
            interaction: JsonField<Interaction> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(interaction, metadata, mutableMapOf())

        /**
         * The interaction to evaluate. Accepts either the canonical form (`CanonicalInteraction` —
         * `messages` and optional `tools_available`) or a native LLM-provider payload passed
         * through verbatim. Supported provider formats are OpenAI Chat Completions, OpenAI
         * Responses, and Anthropic Messages. `ProviderPayload` is intentionally permissive (any
         * JSON object) so callers can supply provider-native shapes without schema constraints.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun interaction(): Interaction = interaction.getRequired("interaction")

        /**
         * Metadata about the LLM interactions being evaluated.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * Returns the raw JSON value of [interaction].
         *
         * Unlike [interaction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("interaction")
        @ExcludeMissing
        fun _interaction(): JsonField<Interaction> = interaction

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * .interaction()
             * .metadata()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var interaction: JsonField<Interaction>? = null
            private var metadata: JsonField<Metadata>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                interaction = body.interaction
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The interaction to evaluate. Accepts either the canonical form
             * (`CanonicalInteraction` — `messages` and optional `tools_available`) or a native
             * LLM-provider payload passed through verbatim. Supported provider formats are OpenAI
             * Chat Completions, OpenAI Responses, and Anthropic Messages. `ProviderPayload` is
             * intentionally permissive (any JSON object) so callers can supply provider-native
             * shapes without schema constraints.
             */
            fun interaction(interaction: Interaction) = interaction(JsonField.of(interaction))

            /**
             * Sets [Builder.interaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interaction] with a well-typed [Interaction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interaction(interaction: JsonField<Interaction>) = apply {
                this.interaction = interaction
            }

            /** Alias for calling [interaction] with `Interaction.ofCanonical(canonical)`. */
            fun interaction(canonical: Interaction.CanonicalInteraction) =
                interaction(Interaction.ofCanonical(canonical))

            /**
             * Alias for calling [interaction] with
             * `Interaction.ofProviderPayload(providerPayload)`.
             */
            fun interaction(providerPayload: Interaction.ProviderPayload) =
                interaction(Interaction.ofProviderPayload(providerPayload))

            /** Metadata about the LLM interactions being evaluated. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
             * .interaction()
             * .metadata()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("interaction", interaction),
                    checkRequired("metadata", metadata),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            interaction().validate()
            metadata().validate()
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
            (interaction.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                interaction == other.interaction &&
                metadata == other.metadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(interaction, metadata, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{interaction=$interaction, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /**
     * The interaction to evaluate. Accepts either the canonical form (`CanonicalInteraction` —
     * `messages` and optional `tools_available`) or a native LLM-provider payload passed through
     * verbatim. Supported provider formats are OpenAI Chat Completions, OpenAI Responses, and
     * Anthropic Messages. `ProviderPayload` is intentionally permissive (any JSON object) so
     * callers can supply provider-native shapes without schema constraints.
     */
    @JsonDeserialize(using = Interaction.Deserializer::class)
    @JsonSerialize(using = Interaction.Serializer::class)
    class Interaction
    private constructor(
        private val canonical: CanonicalInteraction? = null,
        private val providerPayload: ProviderPayload? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
         * messages, optionally with the tool catalog that was in scope. Use this form to evaluate
         * interactions independently of any specific provider's payload structure.
         */
        fun canonical(): Optional<CanonicalInteraction> = Optional.ofNullable(canonical)

        /**
         * A pass-through payload in the native format of the LLM provider. Any valid provider
         * request or response payload is accepted as-is and returned in the same format.
         */
        fun providerPayload(): Optional<ProviderPayload> = Optional.ofNullable(providerPayload)

        fun isCanonical(): Boolean = canonical != null

        fun isProviderPayload(): Boolean = providerPayload != null

        /**
         * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
         * messages, optionally with the tool catalog that was in scope. Use this form to evaluate
         * interactions independently of any specific provider's payload structure.
         */
        fun asCanonical(): CanonicalInteraction = canonical.getOrThrow("canonical")

        /**
         * A pass-through payload in the native format of the LLM provider. Any valid provider
         * request or response payload is accepted as-is and returned in the same format.
         */
        fun asProviderPayload(): ProviderPayload = providerPayload.getOrThrow("providerPayload")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.hiddenlayer.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = interaction.accept(new Interaction.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitCanonical(CanonicalInteraction canonical) {
         *         return Optional.of(canonical.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws HiddenLayerInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                canonical != null -> visitor.visitCanonical(canonical)
                providerPayload != null -> visitor.visitProviderPayload(providerPayload)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Interaction = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCanonical(canonical: CanonicalInteraction) {
                        canonical.validate()
                    }

                    override fun visitProviderPayload(providerPayload: ProviderPayload) {
                        providerPayload.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitCanonical(canonical: CanonicalInteraction) =
                        canonical.validity()

                    override fun visitProviderPayload(providerPayload: ProviderPayload) =
                        providerPayload.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Interaction &&
                canonical == other.canonical &&
                providerPayload == other.providerPayload
        }

        override fun hashCode(): Int = Objects.hash(canonical, providerPayload)

        override fun toString(): String =
            when {
                canonical != null -> "Interaction{canonical=$canonical}"
                providerPayload != null -> "Interaction{providerPayload=$providerPayload}"
                _json != null -> "Interaction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Interaction")
            }

        companion object {

            /**
             * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
             * messages, optionally with the tool catalog that was in scope. Use this form to
             * evaluate interactions independently of any specific provider's payload structure.
             */
            @JvmStatic
            fun ofCanonical(canonical: CanonicalInteraction) = Interaction(canonical = canonical)

            /**
             * A pass-through payload in the native format of the LLM provider. Any valid provider
             * request or response payload is accepted as-is and returned in the same format.
             */
            @JvmStatic
            fun ofProviderPayload(providerPayload: ProviderPayload) =
                Interaction(providerPayload = providerPayload)
        }

        /**
         * An interface that defines how to map each variant of [Interaction] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /**
             * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
             * messages, optionally with the tool catalog that was in scope. Use this form to
             * evaluate interactions independently of any specific provider's payload structure.
             */
            fun visitCanonical(canonical: CanonicalInteraction): T

            /**
             * A pass-through payload in the native format of the LLM provider. Any valid provider
             * request or response payload is accepted as-is and returned in the same format.
             */
            fun visitProviderPayload(providerPayload: ProviderPayload): T

            /**
             * Maps an unknown variant of [Interaction] to a value of type [T].
             *
             * An instance of [Interaction] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HiddenLayerInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HiddenLayerInvalidDataException("Unknown Interaction: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Interaction>(Interaction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Interaction {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<CanonicalInteraction>())?.let {
                                Interaction(canonical = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ProviderPayload>())?.let {
                                Interaction(providerPayload = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Interaction(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Interaction>(Interaction::class) {

            override fun serialize(
                value: Interaction,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.canonical != null -> generator.writeObject(value.canonical)
                    value.providerPayload != null -> generator.writeObject(value.providerPayload)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Interaction")
                }
            }
        }

        /**
         * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
         * messages, optionally with the tool catalog that was in scope. Use this form to evaluate
         * interactions independently of any specific provider's payload structure.
         */
        class CanonicalInteraction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val messages: JsonField<List<Message>>,
            private val toolsAvailable: JsonField<List<ToolsAvailable>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("messages")
                @ExcludeMissing
                messages: JsonField<List<Message>> = JsonMissing.of(),
                @JsonProperty("tools_available")
                @ExcludeMissing
                toolsAvailable: JsonField<List<ToolsAvailable>> = JsonMissing.of(),
            ) : this(messages, toolsAvailable, mutableMapOf())

            /**
             * Ordered sequence of messages to evaluate, in chronological order. May contain any
             * combination of user input, assistant output, system prompts, and tool calls/results —
             * and may be a single message or many. There is no requirement that the messages form a
             * complete request/response pair.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun messages(): List<Message> = messages.getRequired("messages")

            /**
             * Tool definitions available to the model in the context of these messages.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun toolsAvailable(): Optional<List<ToolsAvailable>> =
                toolsAvailable.getOptional("tools_available")

            /**
             * Returns the raw JSON value of [messages].
             *
             * Unlike [messages], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("messages")
            @ExcludeMissing
            fun _messages(): JsonField<List<Message>> = messages

            /**
             * Returns the raw JSON value of [toolsAvailable].
             *
             * Unlike [toolsAvailable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("tools_available")
            @ExcludeMissing
            fun _toolsAvailable(): JsonField<List<ToolsAvailable>> = toolsAvailable

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
                 * Returns a mutable builder for constructing an instance of [CanonicalInteraction].
                 *
                 * The following fields are required:
                 * ```java
                 * .messages()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CanonicalInteraction]. */
            class Builder internal constructor() {

                private var messages: JsonField<MutableList<Message>>? = null
                private var toolsAvailable: JsonField<MutableList<ToolsAvailable>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(canonicalInteraction: CanonicalInteraction) = apply {
                    messages = canonicalInteraction.messages.map { it.toMutableList() }
                    toolsAvailable = canonicalInteraction.toolsAvailable.map { it.toMutableList() }
                    additionalProperties = canonicalInteraction.additionalProperties.toMutableMap()
                }

                /**
                 * Ordered sequence of messages to evaluate, in chronological order. May contain any
                 * combination of user input, assistant output, system prompts, and tool
                 * calls/results — and may be a single message or many. There is no requirement that
                 * the messages form a complete request/response pair.
                 */
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

                /** Tool definitions available to the model in the context of these messages. */
                fun toolsAvailable(toolsAvailable: List<ToolsAvailable>) =
                    toolsAvailable(JsonField.of(toolsAvailable))

                /**
                 * Sets [Builder.toolsAvailable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.toolsAvailable] with a well-typed
                 * `List<ToolsAvailable>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun toolsAvailable(toolsAvailable: JsonField<List<ToolsAvailable>>) = apply {
                    this.toolsAvailable = toolsAvailable.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ToolsAvailable] to [Builder.toolsAvailable].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addToolsAvailable(toolsAvailable: ToolsAvailable) = apply {
                    this.toolsAvailable =
                        (this.toolsAvailable ?: JsonField.of(mutableListOf())).also {
                            checkKnown("toolsAvailable", it).add(toolsAvailable)
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
                 * Returns an immutable instance of [CanonicalInteraction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .messages()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CanonicalInteraction =
                    CanonicalInteraction(
                        checkRequired("messages", messages).map { it.toImmutable() },
                        (toolsAvailable ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): CanonicalInteraction = apply {
                if (validated) {
                    return@apply
                }

                messages().forEach { it.validate() }
                toolsAvailable().ifPresent { it.forEach { it.validate() } }
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
                (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (toolsAvailable.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Base schema for a conversation message in normalized/canonical form. Represents the
             * unified representation of messages across different LLM providers.
             */
            class Message
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val content: JsonField<List<Content>>,
                private val role: JsonField<String>,
                private val timestamp: JsonField<Timestamp>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<List<Content>> = JsonMissing.of(),
                    @JsonProperty("role")
                    @ExcludeMissing
                    role: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<Timestamp> = JsonMissing.of(),
                ) : this(content, role, timestamp, mutableMapOf())

                /**
                 * Array of content parts representing the message content. Each part has a `type`
                 * field indicating the content type.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun content(): List<Content> = content.getRequired("content")

                /**
                 * The role of the message sender. Standard roles include:
                 * - `user`: End-user input
                 * - `assistant`: LLM/agent response
                 * - `system`: System instructions or context
                 * - `tool`: Tool result message
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun role(): String = role.getRequired("role")

                /**
                 * Optional timestamp for when this message was created. When supplied, `value` is
                 * required.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timestamp(): Optional<Timestamp> = timestamp.getOptional("timestamp")

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content")
                @ExcludeMissing
                fun _content(): JsonField<List<Content>> = content

                /**
                 * Returns the raw JSON value of [role].
                 *
                 * Unlike [role], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<Timestamp> = timestamp

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
                     * .role()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Message]. */
                class Builder internal constructor() {

                    private var content: JsonField<MutableList<Content>>? = null
                    private var role: JsonField<String>? = null
                    private var timestamp: JsonField<Timestamp> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(message: Message) = apply {
                        content = message.content.map { it.toMutableList() }
                        role = message.role
                        timestamp = message.timestamp
                        additionalProperties = message.additionalProperties.toMutableMap()
                    }

                    /**
                     * Array of content parts representing the message content. Each part has a
                     * `type` field indicating the content type.
                     */
                    fun content(content: List<Content>) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed `List<Content>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun content(content: JsonField<List<Content>>) = apply {
                        this.content = content.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Content] to [Builder.content].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addContent(content: Content) = apply {
                        this.content =
                            (this.content ?: JsonField.of(mutableListOf())).also {
                                checkKnown("content", it).add(content)
                            }
                    }

                    /** Alias for calling [addContent] with `Content.ofText(text)`. */
                    fun addContent(text: Content.Text) = addContent(Content.ofText(text))

                    /**
                     * Alias for calling [addContent] with the following:
                     * ```java
                     * Content.Text.builder()
                     *     .text(text)
                     *     .build()
                     * ```
                     */
                    fun addTextContent(text: String) =
                        addContent(Content.Text.builder().text(text).build())

                    /** Alias for calling [addContent] with `Content.ofToolUse(toolUse)`. */
                    fun addContent(toolUse: Content.ToolUse) =
                        addContent(Content.ofToolUse(toolUse))

                    /** Alias for calling [addContent] with `Content.ofToolResult(toolResult)`. */
                    fun addContent(toolResult: Content.ToolResult) =
                        addContent(Content.ofToolResult(toolResult))

                    /**
                     * The role of the message sender. Standard roles include:
                     * - `user`: End-user input
                     * - `assistant`: LLM/agent response
                     * - `system`: System instructions or context
                     * - `tool`: Tool result message
                     */
                    fun role(role: String) = role(JsonField.of(role))

                    /**
                     * Sets [Builder.role] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.role] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun role(role: JsonField<String>) = apply { this.role = role }

                    /**
                     * Optional timestamp for when this message was created. When supplied, `value`
                     * is required.
                     */
                    fun timestamp(timestamp: Timestamp) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [Timestamp]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<Timestamp>) = apply {
                        this.timestamp = timestamp
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
                     * Returns an immutable instance of [Message].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .content()
                     * .role()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Message =
                        Message(
                            checkRequired("content", content).map { it.toImmutable() },
                            checkRequired("role", role),
                            timestamp,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Message = apply {
                    if (validated) {
                        return@apply
                    }

                    content().forEach { it.validate() }
                    role()
                    timestamp().ifPresent { it.validate() }
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
                    (content.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (role.asKnown().isPresent) 1 else 0) +
                        (timestamp.asKnown().getOrNull()?.validity() ?: 0)

                /** A content part within an individual message. */
                @JsonDeserialize(using = Content.Deserializer::class)
                @JsonSerialize(using = Content.Serializer::class)
                class Content
                private constructor(
                    private val text: Text? = null,
                    private val toolUse: ToolUse? = null,
                    private val toolResult: ToolResult? = null,
                    private val _json: JsonValue? = null,
                ) {

                    /** A text content part within a message. */
                    fun text(): Optional<Text> = Optional.ofNullable(text)

                    /** A tool invocation part representing a tool call by the assistant. */
                    fun toolUse(): Optional<ToolUse> = Optional.ofNullable(toolUse)

                    /** A tool result part containing the output from a tool execution. */
                    fun toolResult(): Optional<ToolResult> = Optional.ofNullable(toolResult)

                    fun isText(): Boolean = text != null

                    fun isToolUse(): Boolean = toolUse != null

                    fun isToolResult(): Boolean = toolResult != null

                    /** A text content part within a message. */
                    fun asText(): Text = text.getOrThrow("text")

                    /** A tool invocation part representing a tool call by the assistant. */
                    fun asToolUse(): ToolUse = toolUse.getOrThrow("toolUse")

                    /** A tool result part containing the output from a tool execution. */
                    fun asToolResult(): ToolResult = toolResult.getOrThrow("toolResult")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    /**
                     * Maps this instance's current variant to a value of type [T] using the given
                     * [visitor].
                     *
                     * Note that this method is _not_ forwards compatible with new variants from the
                     * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not
                     * known to this version of the SDK gracefully, consider overriding
                     * [Visitor.unknown]:
                     * ```java
                     * import com.hiddenlayer.api.core.JsonValue;
                     * import java.util.Optional;
                     *
                     * Optional<String> result = content.accept(new Content.Visitor<Optional<String>>() {
                     *     @Override
                     *     public Optional<String> visitText(Text text) {
                     *         return Optional.of(text.toString());
                     *     }
                     *
                     *     // ...
                     *
                     *     @Override
                     *     public Optional<String> unknown(JsonValue json) {
                     *         // Or inspect the `json`.
                     *         return Optional.empty();
                     *     }
                     * });
                     * ```
                     *
                     * @throws HiddenLayerInvalidDataException if [Visitor.unknown] is not
                     *   overridden in [visitor] and the current variant is unknown.
                     */
                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            text != null -> visitor.visitText(text)
                            toolUse != null -> visitor.visitToolUse(toolUse)
                            toolResult != null -> visitor.visitToolResult(toolResult)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HiddenLayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Content = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitText(text: Text) {
                                    text.validate()
                                }

                                override fun visitToolUse(toolUse: ToolUse) {
                                    toolUse.validate()
                                }

                                override fun visitToolResult(toolResult: ToolResult) {
                                    toolResult.validate()
                                }
                            }
                        )
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
                        accept(
                            object : Visitor<Int> {
                                override fun visitText(text: Text) = text.validity()

                                override fun visitToolUse(toolUse: ToolUse) = toolUse.validity()

                                override fun visitToolResult(toolResult: ToolResult) =
                                    toolResult.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Content &&
                            text == other.text &&
                            toolUse == other.toolUse &&
                            toolResult == other.toolResult
                    }

                    override fun hashCode(): Int = Objects.hash(text, toolUse, toolResult)

                    override fun toString(): String =
                        when {
                            text != null -> "Content{text=$text}"
                            toolUse != null -> "Content{toolUse=$toolUse}"
                            toolResult != null -> "Content{toolResult=$toolResult}"
                            _json != null -> "Content{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid Content")
                        }

                    companion object {

                        /** A text content part within a message. */
                        @JvmStatic fun ofText(text: Text) = Content(text = text)

                        /** A tool invocation part representing a tool call by the assistant. */
                        @JvmStatic fun ofToolUse(toolUse: ToolUse) = Content(toolUse = toolUse)

                        /** A tool result part containing the output from a tool execution. */
                        @JvmStatic
                        fun ofToolResult(toolResult: ToolResult) = Content(toolResult = toolResult)
                    }

                    /**
                     * An interface that defines how to map each variant of [Content] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        /** A text content part within a message. */
                        fun visitText(text: Text): T

                        /** A tool invocation part representing a tool call by the assistant. */
                        fun visitToolUse(toolUse: ToolUse): T

                        /** A tool result part containing the output from a tool execution. */
                        fun visitToolResult(toolResult: ToolResult): T

                        /**
                         * Maps an unknown variant of [Content] to a value of type [T].
                         *
                         * An instance of [Content] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws HiddenLayerInvalidDataException in the default implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw HiddenLayerInvalidDataException("Unknown Content: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): Content {
                            val json = JsonValue.fromJsonNode(node)
                            val type =
                                json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                            when (type) {
                                "text" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                        Content(text = it, _json = json)
                                    } ?: Content(_json = json)
                                }
                                "tool_use" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ToolUse>())?.let {
                                        Content(toolUse = it, _json = json)
                                    } ?: Content(_json = json)
                                }
                                "tool_result" -> {
                                    return tryDeserialize(node, jacksonTypeRef<ToolResult>())?.let {
                                        Content(toolResult = it, _json = json)
                                    } ?: Content(_json = json)
                                }
                            }

                            return Content(_json = json)
                        }
                    }

                    internal class Serializer : BaseSerializer<Content>(Content::class) {

                        override fun serialize(
                            value: Content,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.text != null -> generator.writeObject(value.text)
                                value.toolUse != null -> generator.writeObject(value.toolUse)
                                value.toolResult != null -> generator.writeObject(value.toolResult)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }
                    }

                    /** A text content part within a message. */
                    class Text
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val text: JsonField<String>,
                        private val type: JsonValue,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("text")
                            @ExcludeMissing
                            text: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        ) : this(text, type, mutableMapOf())

                        /**
                         * The text content.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun text(): String = text.getRequired("text")

                        /**
                         * Content part type for text.
                         *
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("text")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Returns the raw JSON value of [text].
                         *
                         * Unlike [text], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                             * Returns a mutable builder for constructing an instance of [Text].
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Text]. */
                        class Builder internal constructor() {

                            private var text: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("text")
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(text: Text) = apply {
                                this.text = text.text
                                type = text.type
                                additionalProperties = text.additionalProperties.toMutableMap()
                            }

                            /** The text content. */
                            fun text(text: String) = text(JsonField.of(text))

                            /**
                             * Sets [Builder.text] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.text] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun text(text: JsonField<String>) = apply { this.text = text }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("text")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Text].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .text()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Text =
                                Text(
                                    checkRequired("text", text),
                                    type,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws HiddenLayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Text = apply {
                            if (validated) {
                                return@apply
                            }

                            text()
                            _type().let {
                                if (it != JsonValue.from("text")) {
                                    throw HiddenLayerInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (text.asKnown().isPresent) 1 else 0) +
                                type.let { if (it == JsonValue.from("text")) 1 else 0 }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Text &&
                                text == other.text &&
                                type == other.type &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(text, type, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
                    }

                    /** A tool invocation part representing a tool call by the assistant. */
                    class ToolUse
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val toolName: JsonField<String>,
                        private val type: JsonValue,
                        private val toolInput: JsonField<ToolInput>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("tool_name")
                            @ExcludeMissing
                            toolName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("tool_input")
                            @ExcludeMissing
                            toolInput: JsonField<ToolInput> = JsonMissing.of(),
                        ) : this(id, toolName, type, toolInput, mutableMapOf())

                        /**
                         * Tool call identifier. Used to correlate tool invocations with their
                         * results.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun id(): String = id.getRequired("id")

                        /**
                         * Name of the tool being invoked.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun toolName(): String = toolName.getRequired("tool_name")

                        /**
                         * Content part type for tool invocation.
                         *
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("tool_use")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Tool arguments/input as a key-value object.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun toolInput(): Optional<ToolInput> = toolInput.getOptional("tool_input")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [toolName].
                         *
                         * Unlike [toolName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tool_name")
                        @ExcludeMissing
                        fun _toolName(): JsonField<String> = toolName

                        /**
                         * Returns the raw JSON value of [toolInput].
                         *
                         * Unlike [toolInput], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("tool_input")
                        @ExcludeMissing
                        fun _toolInput(): JsonField<ToolInput> = toolInput

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
                             * Returns a mutable builder for constructing an instance of [ToolUse].
                             *
                             * The following fields are required:
                             * ```java
                             * .id()
                             * .toolName()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ToolUse]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String>? = null
                            private var toolName: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("tool_use")
                            private var toolInput: JsonField<ToolInput> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(toolUse: ToolUse) = apply {
                                id = toolUse.id
                                toolName = toolUse.toolName
                                type = toolUse.type
                                toolInput = toolUse.toolInput
                                additionalProperties = toolUse.additionalProperties.toMutableMap()
                            }

                            /**
                             * Tool call identifier. Used to correlate tool invocations with their
                             * results.
                             */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** Name of the tool being invoked. */
                            fun toolName(toolName: String) = toolName(JsonField.of(toolName))

                            /**
                             * Sets [Builder.toolName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.toolName] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun toolName(toolName: JsonField<String>) = apply {
                                this.toolName = toolName
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("tool_use")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            /** Tool arguments/input as a key-value object. */
                            fun toolInput(toolInput: ToolInput) = toolInput(JsonField.of(toolInput))

                            /**
                             * Sets [Builder.toolInput] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.toolInput] with a well-typed
                             * [ToolInput] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun toolInput(toolInput: JsonField<ToolInput>) = apply {
                                this.toolInput = toolInput
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ToolUse].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .id()
                             * .toolName()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ToolUse =
                                ToolUse(
                                    checkRequired("id", id),
                                    checkRequired("toolName", toolName),
                                    type,
                                    toolInput,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws HiddenLayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): ToolUse = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            toolName()
                            _type().let {
                                if (it != JsonValue.from("tool_use")) {
                                    throw HiddenLayerInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            toolInput().ifPresent { it.validate() }
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (toolName.asKnown().isPresent) 1 else 0) +
                                type.let { if (it == JsonValue.from("tool_use")) 1 else 0 } +
                                (toolInput.asKnown().getOrNull()?.validity() ?: 0)

                        /** Tool arguments/input as a key-value object. */
                        class ToolInput
                        @JsonCreator
                        private constructor(
                            @com.fasterxml.jackson.annotation.JsonValue
                            private val additionalProperties: Map<String, JsonValue>
                        ) {

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun toBuilder() = Builder().from(this)

                            companion object {

                                /**
                                 * Returns a mutable builder for constructing an instance of
                                 * [ToolInput].
                                 */
                                @JvmStatic fun builder() = Builder()
                            }

                            /** A builder for [ToolInput]. */
                            class Builder internal constructor() {

                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(toolInput: ToolInput) = apply {
                                    additionalProperties =
                                        toolInput.additionalProperties.toMutableMap()
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun removeAdditionalProperty(key: String) = apply {
                                    additionalProperties.remove(key)
                                }

                                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                    keys.forEach(::removeAdditionalProperty)
                                }

                                /**
                                 * Returns an immutable instance of [ToolInput].
                                 *
                                 * Further updates to this [Builder] will not mutate the returned
                                 * instance.
                                 */
                                fun build(): ToolInput =
                                    ToolInput(additionalProperties.toImmutable())
                            }

                            private var validated: Boolean = false

                            /**
                             * Validates that the types of all values in this object match their
                             * expected types recursively.
                             *
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws HiddenLayerInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
                             */
                            fun validate(): ToolInput = apply {
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                                return other is ToolInput &&
                                    additionalProperties == other.additionalProperties
                            }

                            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                            override fun hashCode(): Int = hashCode

                            override fun toString() =
                                "ToolInput{additionalProperties=$additionalProperties}"
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ToolUse &&
                                id == other.id &&
                                toolName == other.toolName &&
                                type == other.type &&
                                toolInput == other.toolInput &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(id, toolName, type, toolInput, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ToolUse{id=$id, toolName=$toolName, type=$type, toolInput=$toolInput, additionalProperties=$additionalProperties}"
                    }

                    /** A tool result part containing the output from a tool execution. */
                    class ToolResult
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val result: JsonField<String>,
                        private val type: JsonValue,
                        private val success: JsonField<Boolean>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("result")
                            @ExcludeMissing
                            result: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("success")
                            @ExcludeMissing
                            success: JsonField<Boolean> = JsonMissing.of(),
                        ) : this(id, result, type, success, mutableMapOf())

                        /**
                         * Tool call identifier. Used to correlate this result with the original
                         * tool invocation.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun id(): String = id.getRequired("id")

                        /**
                         * The tool execution result content.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun result(): String = result.getRequired("result")

                        /**
                         * Content part type for tool result.
                         *
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("tool_result")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Whether the tool execution succeeded.
                         *
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun success(): Optional<Boolean> = success.getOptional("success")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [result].
                         *
                         * Unlike [result], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun _result(): JsonField<String> = result

                        /**
                         * Returns the raw JSON value of [success].
                         *
                         * Unlike [success], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("success")
                        @ExcludeMissing
                        fun _success(): JsonField<Boolean> = success

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
                             * [ToolResult].
                             *
                             * The following fields are required:
                             * ```java
                             * .id()
                             * .result()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [ToolResult]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String>? = null
                            private var result: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("tool_result")
                            private var success: JsonField<Boolean> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(toolResult: ToolResult) = apply {
                                id = toolResult.id
                                result = toolResult.result
                                type = toolResult.type
                                success = toolResult.success
                                additionalProperties =
                                    toolResult.additionalProperties.toMutableMap()
                            }

                            /**
                             * Tool call identifier. Used to correlate this result with the original
                             * tool invocation.
                             */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** The tool execution result content. */
                            fun result(result: String) = result(JsonField.of(result))

                            /**
                             * Sets [Builder.result] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.result] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun result(result: JsonField<String>) = apply { this.result = result }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("tool_result")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            /** Whether the tool execution succeeded. */
                            fun success(success: Boolean) = success(JsonField.of(success))

                            /**
                             * Sets [Builder.success] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.success] with a well-typed [Boolean]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun success(success: JsonField<Boolean>) = apply {
                                this.success = success
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [ToolResult].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .id()
                             * .result()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): ToolResult =
                                ToolResult(
                                    checkRequired("id", id),
                                    checkRequired("result", result),
                                    type,
                                    success,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws HiddenLayerInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): ToolResult = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            result()
                            _type().let {
                                if (it != JsonValue.from("tool_result")) {
                                    throw HiddenLayerInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            success()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (result.asKnown().isPresent) 1 else 0) +
                                type.let { if (it == JsonValue.from("tool_result")) 1 else 0 } +
                                (if (success.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ToolResult &&
                                id == other.id &&
                                result == other.result &&
                                type == other.type &&
                                success == other.success &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(id, result, type, success, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ToolResult{id=$id, result=$result, type=$type, success=$success, additionalProperties=$additionalProperties}"
                    }
                }

                /**
                 * Optional timestamp for when this message was created. When supplied, `value` is
                 * required.
                 */
                class Timestamp
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val value: JsonField<OffsetDateTime>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<OffsetDateTime> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * The timestamp in ISO 8601 / RFC 3339 format.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun value(): OffsetDateTime = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value")
                    @ExcludeMissing
                    fun _value(): JsonField<OffsetDateTime> = value

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
                         * Returns a mutable builder for constructing an instance of [Timestamp].
                         *
                         * The following fields are required:
                         * ```java
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Timestamp]. */
                    class Builder internal constructor() {

                        private var value: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(timestamp: Timestamp) = apply {
                            value = timestamp.value
                            additionalProperties = timestamp.additionalProperties.toMutableMap()
                        }

                        /** The timestamp in ISO 8601 / RFC 3339 format. */
                        fun value(value: OffsetDateTime) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<OffsetDateTime>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Timestamp].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Timestamp =
                            Timestamp(
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HiddenLayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Timestamp = apply {
                        if (validated) {
                            return@apply
                        }

                        value()
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
                    internal fun validity(): Int = (if (value.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Timestamp &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Timestamp{value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Message &&
                        content == other.content &&
                        role == other.role &&
                        timestamp == other.timestamp &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(content, role, timestamp, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Message{content=$content, role=$role, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            /**
             * Base schema for a tool definition available to the model. Represents the canonical
             * form of tool definitions across different LLM providers.
             */
            class ToolsAvailable
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val description: JsonField<String>,
                private val parameters: JsonField<Parameters>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parameters")
                    @ExcludeMissing
                    parameters: JsonField<Parameters> = JsonMissing.of(),
                ) : this(name, description, parameters, mutableMapOf())

                /**
                 * Name of the tool.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Human-readable description of what the tool does.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun description(): Optional<String> = description.getOptional("description")

                /**
                 * JSON Schema defining the tool's input parameters. Stored as a flexible object to
                 * support various schema formats.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun parameters(): Optional<Parameters> = parameters.getOptional("parameters")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [parameters].
                 *
                 * Unlike [parameters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parameters")
                @ExcludeMissing
                fun _parameters(): JsonField<Parameters> = parameters

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
                     * Returns a mutable builder for constructing an instance of [ToolsAvailable].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ToolsAvailable]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var parameters: JsonField<Parameters> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(toolsAvailable: ToolsAvailable) = apply {
                        name = toolsAvailable.name
                        description = toolsAvailable.description
                        parameters = toolsAvailable.parameters
                        additionalProperties = toolsAvailable.additionalProperties.toMutableMap()
                    }

                    /** Name of the tool. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Human-readable description of what the tool does. */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * JSON Schema defining the tool's input parameters. Stored as a flexible object
                     * to support various schema formats.
                     */
                    fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                    /**
                     * Sets [Builder.parameters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parameters] with a well-typed [Parameters]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parameters(parameters: JsonField<Parameters>) = apply {
                        this.parameters = parameters
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
                     * Returns an immutable instance of [ToolsAvailable].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ToolsAvailable =
                        ToolsAvailable(
                            checkRequired("name", name),
                            description,
                            parameters,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ToolsAvailable = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    description()
                    parameters().ifPresent { it.validate() }
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (if (description.asKnown().isPresent) 1 else 0) +
                        (parameters.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * JSON Schema defining the tool's input parameters. Stored as a flexible object to
                 * support various schema formats.
                 */
                class Parameters
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Parameters].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Parameters]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(parameters: Parameters) = apply {
                            additionalProperties = parameters.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Parameters].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Parameters = Parameters(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HiddenLayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Parameters = apply {
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

                        return other is Parameters &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Parameters{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ToolsAvailable &&
                        name == other.name &&
                        description == other.description &&
                        parameters == other.parameters &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, description, parameters, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ToolsAvailable{name=$name, description=$description, parameters=$parameters, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CanonicalInteraction &&
                    messages == other.messages &&
                    toolsAvailable == other.toolsAvailable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(messages, toolsAvailable, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CanonicalInteraction{messages=$messages, toolsAvailable=$toolsAvailable, additionalProperties=$additionalProperties}"
        }

        /**
         * A pass-through payload in the native format of the LLM provider. Any valid provider
         * request or response payload is accepted as-is and returned in the same format.
         */
        class ProviderPayload
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

                /** Returns a mutable builder for constructing an instance of [ProviderPayload]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderPayload]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerPayload: ProviderPayload) = apply {
                    additionalProperties = providerPayload.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [ProviderPayload].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProviderPayload = ProviderPayload(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): ProviderPayload = apply {
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

                return other is ProviderPayload &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "ProviderPayload{additionalProperties=$additionalProperties}"
        }
    }

    /** Metadata about the LLM interactions being evaluated. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<String>,
        private val provider: JsonField<String>,
        private val requesterId: JsonField<String>,
        private val externalSessionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requester_id")
            @ExcludeMissing
            requesterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_session_id")
            @ExcludeMissing
            externalSessionId: JsonField<String> = JsonMissing.of(),
        ) : this(model, provider, requesterId, externalSessionId, mutableMapOf())

        /**
         * The model identifier used for the interaction.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * The LLM provider (e.g., openai, anthropic, azure, bedrock).
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * Identifier for the entity making the request. Could be a user ID, service account, or
         * agent identifier.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requesterId(): String = requesterId.getRequired("requester_id")

        /**
         * An externally-defined session identifier to group interactions into a single session. The
         * identifier should be unique across all sessions.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalSessionId(): Optional<String> =
            externalSessionId.getOptional("external_session_id")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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
         * Returns the raw JSON value of [externalSessionId].
         *
         * Unlike [externalSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_session_id")
        @ExcludeMissing
        fun _externalSessionId(): JsonField<String> = externalSessionId

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
             * .provider()
             * .requesterId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var requesterId: JsonField<String>? = null
            private var externalSessionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                model = metadata.model
                provider = metadata.provider
                requesterId = metadata.requesterId
                externalSessionId = metadata.externalSessionId
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** The model identifier used for the interaction. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The LLM provider (e.g., openai, anthropic, azure, bedrock). */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /**
             * Identifier for the entity making the request. Could be a user ID, service account, or
             * agent identifier.
             */
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

            /**
             * An externally-defined session identifier to group interactions into a single session.
             * The identifier should be unique across all sessions.
             */
            fun externalSessionId(externalSessionId: String) =
                externalSessionId(JsonField.of(externalSessionId))

            /**
             * Sets [Builder.externalSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalSessionId(externalSessionId: JsonField<String>) = apply {
                this.externalSessionId = externalSessionId
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * .provider()
             * .requesterId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Metadata =
                Metadata(
                    checkRequired("model", model),
                    checkRequired("provider", provider),
                    checkRequired("requesterId", requesterId),
                    externalSessionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            model()
            provider()
            requesterId()
            externalSessionId()
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
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (requesterId.asKnown().isPresent) 1 else 0) +
                (if (externalSessionId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                model == other.model &&
                provider == other.provider &&
                requesterId == other.requesterId &&
                externalSessionId == other.externalSessionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(model, provider, requesterId, externalSessionId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{model=$model, provider=$provider, requesterId=$requesterId, externalSessionId=$externalSessionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuntimeEvaluateInteractionParams &&
            hlProjectId == other.hlProjectId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(hlProjectId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RuntimeEvaluateInteractionParams{hlProjectId=$hlProjectId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
