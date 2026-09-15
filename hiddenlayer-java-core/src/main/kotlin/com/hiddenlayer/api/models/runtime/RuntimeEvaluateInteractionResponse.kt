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
import com.hiddenlayer.api.core.Enum
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.allMaxBy
import com.hiddenlayer.api.core.checkKnown
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.getOrThrow
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Response payload from synchronous evaluation of an LLM interaction. Contains metadata about the
 * call, the evaluation context (`evaluated_interaction`) that detection rules ran against, and the
 * policy outcome — which carries the enforcement action, threat level, detections, and the
 * effective payload the caller should forward (`outcome.effective_interaction`).
 *
 * `evaluated_interaction` is always the canonicalized form of the request, enriched per-message
 * with signals and findings from signal extraction — a uniform shape that detection rules target
 * regardless of which form the request supplied. `outcome.effective_interaction` mirrors the shape
 * of the request's `interaction` field — canonical or provider-native — with any redactions,
 * substitutions, or tool modifications from the outcome's action applied in place.
 */
class RuntimeEvaluateInteractionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val evaluatedInteraction: JsonField<EvaluatedInteraction>,
    private val metadata: JsonField<Metadata>,
    private val outcome: JsonField<Outcome>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("evaluated_interaction")
        @ExcludeMissing
        evaluatedInteraction: JsonField<EvaluatedInteraction> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
    ) : this(evaluatedInteraction, metadata, outcome, mutableMapOf())

    /**
     * The canonicalized interaction as seen by the evaluator — messages and tool catalog —
     * annotated per-message with signals and their findings. Used for `evaluated_interaction`
     * regardless of which form the request supplied: when the request used a native provider
     * payload, the evaluator canonicalizes it into this shape so detection rules can target a
     * uniform structure.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun evaluatedInteraction(): EvaluatedInteraction =
        evaluatedInteraction.getRequired("evaluated_interaction")

    /**
     * Metadata about the completed evaluation of the interactions.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * The policy outcome for the evaluated interactions. Carries the enforcement action, threat
     * level, any detections produced by detection rules against `evaluated_interaction`, and the
     * effective payload the caller should forward.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outcome(): Outcome = outcome.getRequired("outcome")

    /**
     * Returns the raw JSON value of [evaluatedInteraction].
     *
     * Unlike [evaluatedInteraction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("evaluated_interaction")
    @ExcludeMissing
    fun _evaluatedInteraction(): JsonField<EvaluatedInteraction> = evaluatedInteraction

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

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
         * [RuntimeEvaluateInteractionResponse].
         *
         * The following fields are required:
         * ```java
         * .evaluatedInteraction()
         * .metadata()
         * .outcome()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuntimeEvaluateInteractionResponse]. */
    class Builder internal constructor() {

        private var evaluatedInteraction: JsonField<EvaluatedInteraction>? = null
        private var metadata: JsonField<Metadata>? = null
        private var outcome: JsonField<Outcome>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runtimeEvaluateInteractionResponse: RuntimeEvaluateInteractionResponse) =
            apply {
                evaluatedInteraction = runtimeEvaluateInteractionResponse.evaluatedInteraction
                metadata = runtimeEvaluateInteractionResponse.metadata
                outcome = runtimeEvaluateInteractionResponse.outcome
                additionalProperties =
                    runtimeEvaluateInteractionResponse.additionalProperties.toMutableMap()
            }

        /**
         * The canonicalized interaction as seen by the evaluator — messages and tool catalog —
         * annotated per-message with signals and their findings. Used for `evaluated_interaction`
         * regardless of which form the request supplied: when the request used a native provider
         * payload, the evaluator canonicalizes it into this shape so detection rules can target a
         * uniform structure.
         */
        fun evaluatedInteraction(evaluatedInteraction: EvaluatedInteraction) =
            evaluatedInteraction(JsonField.of(evaluatedInteraction))

        /**
         * Sets [Builder.evaluatedInteraction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluatedInteraction] with a well-typed
         * [EvaluatedInteraction] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun evaluatedInteraction(evaluatedInteraction: JsonField<EvaluatedInteraction>) = apply {
            this.evaluatedInteraction = evaluatedInteraction
        }

        /** Metadata about the completed evaluation of the interactions. */
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
         * The policy outcome for the evaluated interactions. Carries the enforcement action, threat
         * level, any detections produced by detection rules against `evaluated_interaction`, and
         * the effective payload the caller should forward.
         */
        fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

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
         * Returns an immutable instance of [RuntimeEvaluateInteractionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .evaluatedInteraction()
         * .metadata()
         * .outcome()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuntimeEvaluateInteractionResponse =
            RuntimeEvaluateInteractionResponse(
                checkRequired("evaluatedInteraction", evaluatedInteraction),
                checkRequired("metadata", metadata),
                checkRequired("outcome", outcome),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RuntimeEvaluateInteractionResponse = apply {
        if (validated) {
            return@apply
        }

        evaluatedInteraction().validate()
        metadata().validate()
        outcome().validate()
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
        (evaluatedInteraction.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (outcome.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The canonicalized interaction as seen by the evaluator — messages and tool catalog —
     * annotated per-message with signals and their findings. Used for `evaluated_interaction`
     * regardless of which form the request supplied: when the request used a native provider
     * payload, the evaluator canonicalizes it into this shape so detection rules can target a
     * uniform structure.
     */
    class EvaluatedInteraction
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
         * Ordered sequence of canonicalized messages. Each message is annotated with the signals
         * that fired against it (and findings produced by those signals).
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * The canonicalized tool catalog that was in scope during evaluation. Present only when
         * tools were provided in the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun toolsAvailable(): Optional<List<ToolsAvailable>> =
            toolsAvailable.getOptional("tools_available")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [toolsAvailable].
         *
         * Unlike [toolsAvailable], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [EvaluatedInteraction].
             *
             * The following fields are required:
             * ```java
             * .messages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EvaluatedInteraction]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var toolsAvailable: JsonField<MutableList<ToolsAvailable>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(evaluatedInteraction: EvaluatedInteraction) = apply {
                messages = evaluatedInteraction.messages.map { it.toMutableList() }
                toolsAvailable = evaluatedInteraction.toolsAvailable.map { it.toMutableList() }
                additionalProperties = evaluatedInteraction.additionalProperties.toMutableMap()
            }

            /**
             * Ordered sequence of canonicalized messages. Each message is annotated with the
             * signals that fired against it (and findings produced by those signals).
             */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * The canonicalized tool catalog that was in scope during evaluation. Present only when
             * tools were provided in the request.
             */
            fun toolsAvailable(toolsAvailable: List<ToolsAvailable>) =
                toolsAvailable(JsonField.of(toolsAvailable))

            /**
             * Sets [Builder.toolsAvailable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolsAvailable] with a well-typed
             * `List<ToolsAvailable>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [EvaluatedInteraction].
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
            fun build(): EvaluatedInteraction =
                EvaluatedInteraction(
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): EvaluatedInteraction = apply {
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
            private val analysis: JsonField<Analysis>,
            private val timestamp: JsonField<Timestamp>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("content")
                @ExcludeMissing
                content: JsonField<List<Content>> = JsonMissing.of(),
                @JsonProperty("role") @ExcludeMissing role: JsonField<String> = JsonMissing.of(),
                @JsonProperty("analysis")
                @ExcludeMissing
                analysis: JsonField<Analysis> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<Timestamp> = JsonMissing.of(),
            ) : this(content, role, analysis, timestamp, mutableMapOf())

            /**
             * Array of content parts representing the message content. Each part has a `type` field
             * indicating the content type.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun content(): List<Content> = content.getRequired("content")

            /**
             * The role of the message sender. Standard roles include:
             * - `user`: End-user input
             * - `assistant`: LLM/agent response
             * - `system`: System instructions or context
             * - `tool`: Tool result message
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun role(): String = role.getRequired("role")

            /**
             * Per-message security analysis from signal extraction. `signals` mirrors the
             * production-signals dictionary fed into the policy evaluation context — each key is a
             * signal name (e.g., `prompt_injection`, `code`), each value is the opaque finding
             * object that signal produced.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun analysis(): Optional<Analysis> = analysis.getOptional("analysis")

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
             * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("content")
            @ExcludeMissing
            fun _content(): JsonField<List<Content>> = content

            /**
             * Returns the raw JSON value of [role].
             *
             * Unlike [role], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<String> = role

            /**
             * Returns the raw JSON value of [analysis].
             *
             * Unlike [analysis], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("analysis")
            @ExcludeMissing
            fun _analysis(): JsonField<Analysis> = analysis

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
                private var analysis: JsonField<Analysis> = JsonMissing.of()
                private var timestamp: JsonField<Timestamp> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(message: Message) = apply {
                    content = message.content.map { it.toMutableList() }
                    role = message.role
                    analysis = message.analysis
                    timestamp = message.timestamp
                    additionalProperties = message.additionalProperties.toMutableMap()
                }

                /**
                 * Array of content parts representing the message content. Each part has a `type`
                 * field indicating the content type.
                 */
                fun content(content: List<Content>) = content(JsonField.of(content))

                /**
                 * Sets [Builder.content] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.content] with a well-typed `List<Content>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                fun addContent(toolUse: Content.ToolUse) = addContent(Content.ofToolUse(toolUse))

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
                 * You should usually call [Builder.role] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun role(role: JsonField<String>) = apply { this.role = role }

                /**
                 * Per-message security analysis from signal extraction. `signals` mirrors the
                 * production-signals dictionary fed into the policy evaluation context — each key
                 * is a signal name (e.g., `prompt_injection`, `code`), each value is the opaque
                 * finding object that signal produced.
                 */
                fun analysis(analysis: Analysis) = analysis(JsonField.of(analysis))

                /**
                 * Sets [Builder.analysis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.analysis] with a well-typed [Analysis] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun analysis(analysis: JsonField<Analysis>) = apply { this.analysis = analysis }

                /**
                 * Optional timestamp for when this message was created. When supplied, `value` is
                 * required.
                 */
                fun timestamp(timestamp: Timestamp) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [Timestamp] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        analysis,
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
                analysis().ifPresent { it.validate() }
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
                    (analysis.asKnown().getOrNull()?.validity() ?: 0) +
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
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
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
                 * @throws HiddenLayerInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
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
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
                 * An interface that defines how to map each variant of [Content] to a value of type
                 * [T].
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
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
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
                        val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

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
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
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
                     * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * You should usually call [Builder.text] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun text(text: JsonField<String>) = apply { this.text = text }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("text")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
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
                         * Further updates to this [Builder] will not mutate the returned instance.
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("tool_input")
                        @ExcludeMissing
                        toolInput: JsonField<ToolInput> = JsonMissing.of(),
                    ) : this(id, toolName, type, toolInput, mutableMapOf())

                    /**
                     * Tool call identifier. Used to correlate tool invocations with their results.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * Name of the tool being invoked.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
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
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun toolInput(): Optional<ToolInput> = toolInput.getOptional("tool_input")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("tool_use")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        /** Tool arguments/input as a key-value object. */
                        fun toolInput(toolInput: ToolInput) = toolInput(JsonField.of(toolInput))

                        /**
                         * Sets [Builder.toolInput] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.toolInput] with a well-typed [ToolInput]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
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
                         * Further updates to this [Builder] will not mutate the returned instance.
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                                additionalProperties = toolInput.additionalProperties.toMutableMap()
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
                             * Returns an immutable instance of [ToolInput].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): ToolInput = ToolInput(additionalProperties.toImmutable())
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("success")
                        @ExcludeMissing
                        success: JsonField<Boolean> = JsonMissing.of(),
                    ) : this(id, result, type, success, mutableMapOf())

                    /**
                     * Tool call identifier. Used to correlate this result with the original tool
                     * invocation.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun id(): String = id.getRequired("id")

                    /**
                     * The tool execution result content.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
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
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun success(): Optional<Boolean> = success.getOptional("success")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                         * Returns a mutable builder for constructing an instance of [ToolResult].
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
                            additionalProperties = toolResult.additionalProperties.toMutableMap()
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
                         * You should usually call [Builder.result] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result(result: JsonField<String>) = apply { this.result = result }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("tool_result")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
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
                        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
                         * Further updates to this [Builder] will not mutate the returned instance.
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
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
             * Per-message security analysis from signal extraction. `signals` mirrors the
             * production-signals dictionary fed into the policy evaluation context — each key is a
             * signal name (e.g., `prompt_injection`, `code`), each value is the opaque finding
             * object that signal produced.
             */
            class Analysis
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val signals: JsonField<Signals>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("signals")
                    @ExcludeMissing
                    signals: JsonField<Signals> = JsonMissing.of()
                ) : this(signals, mutableMapOf())

                /**
                 * Production signal findings for this message, keyed by signal name. All known
                 * production signal types are always present (populated with schema defaults when
                 * nothing fired). Values are opaque finding objects whose internal shape may
                 * evolve.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun signals(): Signals = signals.getRequired("signals")

                /**
                 * Returns the raw JSON value of [signals].
                 *
                 * Unlike [signals], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("signals")
                @ExcludeMissing
                fun _signals(): JsonField<Signals> = signals

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
                     * .signals()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Analysis]. */
                class Builder internal constructor() {

                    private var signals: JsonField<Signals>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(analysis: Analysis) = apply {
                        signals = analysis.signals
                        additionalProperties = analysis.additionalProperties.toMutableMap()
                    }

                    /**
                     * Production signal findings for this message, keyed by signal name. All known
                     * production signal types are always present (populated with schema defaults
                     * when nothing fired). Values are opaque finding objects whose internal shape
                     * may evolve.
                     */
                    fun signals(signals: Signals) = signals(JsonField.of(signals))

                    /**
                     * Sets [Builder.signals] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.signals] with a well-typed [Signals] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun signals(signals: JsonField<Signals>) = apply { this.signals = signals }

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
                     * Returns an immutable instance of [Analysis].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .signals()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Analysis =
                        Analysis(
                            checkRequired("signals", signals),
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
                fun validate(): Analysis = apply {
                    if (validated) {
                        return@apply
                    }

                    signals().validate()
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
                internal fun validity(): Int = (signals.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Production signal findings for this message, keyed by signal name. All known
                 * production signal types are always present (populated with schema defaults when
                 * nothing fired). Values are opaque finding objects whose internal shape may
                 * evolve.
                 */
                class Signals
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

                        /** Returns a mutable builder for constructing an instance of [Signals]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Signals]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(signals: Signals) = apply {
                            additionalProperties = signals.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Signals].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Signals = Signals(additionalProperties.toImmutable())
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
                    fun validate(): Signals = apply {
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

                        return other is Signals &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Signals{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Analysis &&
                        signals == other.signals &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(signals, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Analysis{signals=$signals, additionalProperties=$additionalProperties}"
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
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                     * You should usually call [Builder.value] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun value(value: JsonField<OffsetDateTime>) = apply { this.value = value }

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
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
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
                    analysis == other.analysis &&
                    timestamp == other.timestamp &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(content, role, analysis, timestamp, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Message{content=$content, role=$role, analysis=$analysis, timestamp=$timestamp, additionalProperties=$additionalProperties}"
        }

        /**
         * Base schema for a tool definition available to the model. Represents the canonical form
         * of tool definitions across different LLM providers.
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
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Returns the raw JSON value of [parameters].
             *
             * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Human-readable description of what the tool does. */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * JSON Schema defining the tool's input parameters. Stored as a flexible object to
                 * support various schema formats.
                 */
                fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                /**
                 * Sets [Builder.parameters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parameters] with a well-typed [Parameters] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                    /** Returns a mutable builder for constructing an instance of [Parameters]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Parameters]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(parameters: Parameters) = apply {
                        additionalProperties = parameters.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Parameters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Parameters = Parameters(additionalProperties.toImmutable())
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

                    return other is Parameters && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
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

            return other is EvaluatedInteraction &&
                messages == other.messages &&
                toolsAvailable == other.toolsAvailable &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(messages, toolsAvailable, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EvaluatedInteraction{messages=$messages, toolsAvailable=$toolsAvailable, additionalProperties=$additionalProperties}"
    }

    /** Metadata about the completed evaluation of the interactions. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val evaluatedAt: JsonField<OffsetDateTime>,
        private val evaluationId: JsonField<String>,
        private val model: JsonField<String>,
        private val processingTimeMs: JsonField<Float>,
        private val project: JsonField<Project>,
        private val provider: JsonField<String>,
        private val requesterId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("evaluated_at")
            @ExcludeMissing
            evaluatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("evaluation_id")
            @ExcludeMissing
            evaluationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_time_ms")
            @ExcludeMissing
            processingTimeMs: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("project") @ExcludeMissing project: JsonField<Project> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requester_id")
            @ExcludeMissing
            requesterId: JsonField<String> = JsonMissing.of(),
        ) : this(
            evaluatedAt,
            evaluationId,
            model,
            processingTimeMs,
            project,
            provider,
            requesterId,
            mutableMapOf(),
        )

        /**
         * Timestamp when the evaluation was performed.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun evaluatedAt(): OffsetDateTime = evaluatedAt.getRequired("evaluated_at")

        /**
         * Server-generated unique identifier for this evaluation. Persisted on the stored
         * interaction record and referenced in structured logs for correlation.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun evaluationId(): String = evaluationId.getRequired("evaluation_id")

        /**
         * The model identifier from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * Total time taken to perform the evaluation, in milliseconds.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun processingTimeMs(): Float = processingTimeMs.getRequired("processing_time_ms")

        /**
         * Project context resolved for this evaluation.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun project(): Project = project.getRequired("project")

        /**
         * The LLM provider from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): String = provider.getRequired("provider")

        /**
         * The requester identifier from the request.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requesterId(): String = requesterId.getRequired("requester_id")

        /**
         * Returns the raw JSON value of [evaluatedAt].
         *
         * Unlike [evaluatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("evaluated_at")
        @ExcludeMissing
        fun _evaluatedAt(): JsonField<OffsetDateTime> = evaluatedAt

        /**
         * Returns the raw JSON value of [evaluationId].
         *
         * Unlike [evaluationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluation_id")
        @ExcludeMissing
        fun _evaluationId(): JsonField<String> = evaluationId

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
        fun _processingTimeMs(): JsonField<Float> = processingTimeMs

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
             * .evaluatedAt()
             * .evaluationId()
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

            private var evaluatedAt: JsonField<OffsetDateTime>? = null
            private var evaluationId: JsonField<String>? = null
            private var model: JsonField<String>? = null
            private var processingTimeMs: JsonField<Float>? = null
            private var project: JsonField<Project>? = null
            private var provider: JsonField<String>? = null
            private var requesterId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                evaluatedAt = metadata.evaluatedAt
                evaluationId = metadata.evaluationId
                model = metadata.model
                processingTimeMs = metadata.processingTimeMs
                project = metadata.project
                provider = metadata.provider
                requesterId = metadata.requesterId
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** Timestamp when the evaluation was performed. */
            fun evaluatedAt(evaluatedAt: OffsetDateTime) = evaluatedAt(JsonField.of(evaluatedAt))

            /**
             * Sets [Builder.evaluatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluatedAt(evaluatedAt: JsonField<OffsetDateTime>) = apply {
                this.evaluatedAt = evaluatedAt
            }

            /**
             * Server-generated unique identifier for this evaluation. Persisted on the stored
             * interaction record and referenced in structured logs for correlation.
             */
            fun evaluationId(evaluationId: String) = evaluationId(JsonField.of(evaluationId))

            /**
             * Sets [Builder.evaluationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evaluationId(evaluationId: JsonField<String>) = apply {
                this.evaluationId = evaluationId
            }

            /** The model identifier from the request. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Total time taken to perform the evaluation, in milliseconds. */
            fun processingTimeMs(processingTimeMs: Float) =
                processingTimeMs(JsonField.of(processingTimeMs))

            /**
             * Sets [Builder.processingTimeMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingTimeMs] with a well-typed [Float] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processingTimeMs(processingTimeMs: JsonField<Float>) = apply {
                this.processingTimeMs = processingTimeMs
            }

            /** Project context resolved for this evaluation. */
            fun project(project: Project) = project(JsonField.of(project))

            /**
             * Sets [Builder.project] to an arbitrary JSON value.
             *
             * You should usually call [Builder.project] with a well-typed [Project] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun project(project: JsonField<Project>) = apply { this.project = project }

            /** The LLM provider from the request. */
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

            /** The requester identifier from the request. */
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
             * .evaluatedAt()
             * .evaluationId()
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
                    checkRequired("evaluatedAt", evaluatedAt),
                    checkRequired("evaluationId", evaluationId),
                    checkRequired("model", model),
                    checkRequired("processingTimeMs", processingTimeMs),
                    checkRequired("project", project),
                    checkRequired("provider", provider),
                    checkRequired("requesterId", requesterId),
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

            evaluatedAt()
            evaluationId()
            model()
            processingTimeMs()
            project().validate()
            provider()
            requesterId()
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
            (if (evaluatedAt.asKnown().isPresent) 1 else 0) +
                (if (evaluationId.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (processingTimeMs.asKnown().isPresent) 1 else 0) +
                (project.asKnown().getOrNull()?.validity() ?: 0) +
                (if (provider.asKnown().isPresent) 1 else 0) +
                (if (requesterId.asKnown().isPresent) 1 else 0)

        /** Project context resolved for this evaluation. */
        class Project
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val configurationId: JsonField<String>,
            private val policyId: JsonField<String>,
            private val projectId: JsonField<String>,
            private val projectAlias: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("configuration_id")
                @ExcludeMissing
                configurationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("policy_id")
                @ExcludeMissing
                policyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_id")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project_alias")
                @ExcludeMissing
                projectAlias: JsonField<String> = JsonMissing.of(),
            ) : this(configurationId, policyId, projectId, projectAlias, mutableMapOf())

            /**
             * The unique identifier for the Configuration used during evaluation.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun configurationId(): String = configurationId.getRequired("configuration_id")

            /**
             * The unique identifier for the Policy applied to this interaction.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun policyId(): String = policyId.getRequired("policy_id")

            /**
             * The unique identifier for the Project.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun projectId(): String = projectId.getRequired("project_id")

            /**
             * A custom alias for the Project.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun projectAlias(): Optional<String> = projectAlias.getOptional("project_alias")

            /**
             * Returns the raw JSON value of [configurationId].
             *
             * Unlike [configurationId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("configuration_id")
            @ExcludeMissing
            fun _configurationId(): JsonField<String> = configurationId

            /**
             * Returns the raw JSON value of [policyId].
             *
             * Unlike [policyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("policy_id") @ExcludeMissing fun _policyId(): JsonField<String> = policyId

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
             * Returns the raw JSON value of [projectAlias].
             *
             * Unlike [projectAlias], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("project_alias")
            @ExcludeMissing
            fun _projectAlias(): JsonField<String> = projectAlias

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
                 * Returns a mutable builder for constructing an instance of [Project].
                 *
                 * The following fields are required:
                 * ```java
                 * .configurationId()
                 * .policyId()
                 * .projectId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Project]. */
            class Builder internal constructor() {

                private var configurationId: JsonField<String>? = null
                private var policyId: JsonField<String>? = null
                private var projectId: JsonField<String>? = null
                private var projectAlias: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(project: Project) = apply {
                    configurationId = project.configurationId
                    policyId = project.policyId
                    projectId = project.projectId
                    projectAlias = project.projectAlias
                    additionalProperties = project.additionalProperties.toMutableMap()
                }

                /** The unique identifier for the Configuration used during evaluation. */
                fun configurationId(configurationId: String) =
                    configurationId(JsonField.of(configurationId))

                /**
                 * Sets [Builder.configurationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.configurationId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun configurationId(configurationId: JsonField<String>) = apply {
                    this.configurationId = configurationId
                }

                /** The unique identifier for the Policy applied to this interaction. */
                fun policyId(policyId: String) = policyId(JsonField.of(policyId))

                /**
                 * Sets [Builder.policyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.policyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun policyId(policyId: JsonField<String>) = apply { this.policyId = policyId }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .configurationId()
                 * .policyId()
                 * .projectId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Project =
                    Project(
                        checkRequired("configurationId", configurationId),
                        checkRequired("policyId", policyId),
                        checkRequired("projectId", projectId),
                        projectAlias,
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
            fun validate(): Project = apply {
                if (validated) {
                    return@apply
                }

                configurationId()
                policyId()
                projectId()
                projectAlias()
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
                (if (configurationId.asKnown().isPresent) 1 else 0) +
                    (if (policyId.asKnown().isPresent) 1 else 0) +
                    (if (projectId.asKnown().isPresent) 1 else 0) +
                    (if (projectAlias.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Project &&
                    configurationId == other.configurationId &&
                    policyId == other.policyId &&
                    projectId == other.projectId &&
                    projectAlias == other.projectAlias &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    configurationId,
                    policyId,
                    projectId,
                    projectAlias,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Project{configurationId=$configurationId, policyId=$policyId, projectId=$projectId, projectAlias=$projectAlias, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                evaluatedAt == other.evaluatedAt &&
                evaluationId == other.evaluationId &&
                model == other.model &&
                processingTimeMs == other.processingTimeMs &&
                project == other.project &&
                provider == other.provider &&
                requesterId == other.requesterId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                evaluatedAt,
                evaluationId,
                model,
                processingTimeMs,
                project,
                provider,
                requesterId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{evaluatedAt=$evaluatedAt, evaluationId=$evaluationId, model=$model, processingTimeMs=$processingTimeMs, project=$project, provider=$provider, requesterId=$requesterId, additionalProperties=$additionalProperties}"
    }

    /**
     * The policy outcome for the evaluated interactions. Carries the enforcement action, threat
     * level, any detections produced by detection rules against `evaluated_interaction`, and the
     * effective payload the caller should forward.
     */
    class Outcome
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<Action>,
        private val detections: JsonField<List<Detection>>,
        private val effectiveInteraction: JsonField<EffectiveInteraction>,
        private val threatLevel: JsonField<ThreatLevel>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("detections")
            @ExcludeMissing
            detections: JsonField<List<Detection>> = JsonMissing.of(),
            @JsonProperty("effective_interaction")
            @ExcludeMissing
            effectiveInteraction: JsonField<EffectiveInteraction> = JsonMissing.of(),
            @JsonProperty("threat_level")
            @ExcludeMissing
            threatLevel: JsonField<ThreatLevel> = JsonMissing.of(),
        ) : this(action, detections, effectiveInteraction, threatLevel, mutableMapOf())

        /**
         * The action applied based on policy evaluation.
         *
         * `NONE` means policy evaluation produced no detections — either no rules fired or no
         * findings were emitted; the `detections` array is empty and the effective payload is
         * unchanged.
         *
         * `DETECT`, `REDACT`, and `BLOCK` all mean one or more detections were produced; they
         * differ in what the policy did with the payload. `DETECT` is an intentional observe-only
         * outcome (detections are surfaced but the effective payload is unchanged); `REDACT`
         * modifies the payload in place; `BLOCK` substitutes a canned block response.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * Security detections produced by detection rules running against the evaluation context.
         * Always present; an empty array means no rules triggered.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detections(): List<Detection> = detections.getRequired("detections")

        /**
         * The payload the caller should forward downstream. Mirrors the shape of the request's
         * `interaction` field: if the request supplied the canonical form (`CanonicalInteraction`),
         * the response returns the canonical form here; if the request supplied a native
         * LLM-provider payload (OpenAI Chat Completions, OpenAI Responses, or Anthropic Messages),
         * the response returns that same provider-native shape. Any redactions, substitutions, or
         * tool modifications from the outcome's `action` are applied in place.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveInteraction(): EffectiveInteraction =
            effectiveInteraction.getRequired("effective_interaction")

        /**
         * The highest threat level across all detections, based on interaction analysis and
         * configured tenant security rules. Values are ordered by severity from least to most:
         * NONE, LOW, MEDIUM, HIGH, CRITICAL.
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
         * Returns the raw JSON value of [detections].
         *
         * Unlike [detections], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detections")
        @ExcludeMissing
        fun _detections(): JsonField<List<Detection>> = detections

        /**
         * Returns the raw JSON value of [effectiveInteraction].
         *
         * Unlike [effectiveInteraction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("effective_interaction")
        @ExcludeMissing
        fun _effectiveInteraction(): JsonField<EffectiveInteraction> = effectiveInteraction

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
             * Returns a mutable builder for constructing an instance of [Outcome].
             *
             * The following fields are required:
             * ```java
             * .action()
             * .detections()
             * .effectiveInteraction()
             * .threatLevel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outcome]. */
        class Builder internal constructor() {

            private var action: JsonField<Action>? = null
            private var detections: JsonField<MutableList<Detection>>? = null
            private var effectiveInteraction: JsonField<EffectiveInteraction>? = null
            private var threatLevel: JsonField<ThreatLevel>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outcome: Outcome) = apply {
                action = outcome.action
                detections = outcome.detections.map { it.toMutableList() }
                effectiveInteraction = outcome.effectiveInteraction
                threatLevel = outcome.threatLevel
                additionalProperties = outcome.additionalProperties.toMutableMap()
            }

            /**
             * The action applied based on policy evaluation.
             *
             * `NONE` means policy evaluation produced no detections — either no rules fired or no
             * findings were emitted; the `detections` array is empty and the effective payload is
             * unchanged.
             *
             * `DETECT`, `REDACT`, and `BLOCK` all mean one or more detections were produced; they
             * differ in what the policy did with the payload. `DETECT` is an intentional
             * observe-only outcome (detections are surfaced but the effective payload is
             * unchanged); `REDACT` modifies the payload in place; `BLOCK` substitutes a canned
             * block response.
             */
            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /**
             * Security detections produced by detection rules running against the evaluation
             * context. Always present; an empty array means no rules triggered.
             */
            fun detections(detections: List<Detection>) = detections(JsonField.of(detections))

            /**
             * Sets [Builder.detections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detections] with a well-typed `List<Detection>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun detections(detections: JsonField<List<Detection>>) = apply {
                this.detections = detections.map { it.toMutableList() }
            }

            /**
             * Adds a single [Detection] to [detections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDetection(detection: Detection) = apply {
                detections =
                    (detections ?: JsonField.of(mutableListOf())).also {
                        checkKnown("detections", it).add(detection)
                    }
            }

            /**
             * The payload the caller should forward downstream. Mirrors the shape of the request's
             * `interaction` field: if the request supplied the canonical form
             * (`CanonicalInteraction`), the response returns the canonical form here; if the
             * request supplied a native LLM-provider payload (OpenAI Chat Completions, OpenAI
             * Responses, or Anthropic Messages), the response returns that same provider-native
             * shape. Any redactions, substitutions, or tool modifications from the outcome's
             * `action` are applied in place.
             */
            fun effectiveInteraction(effectiveInteraction: EffectiveInteraction) =
                effectiveInteraction(JsonField.of(effectiveInteraction))

            /**
             * Sets [Builder.effectiveInteraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveInteraction] with a well-typed
             * [EffectiveInteraction] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun effectiveInteraction(effectiveInteraction: JsonField<EffectiveInteraction>) =
                apply {
                    this.effectiveInteraction = effectiveInteraction
                }

            /**
             * Alias for calling [effectiveInteraction] with
             * `EffectiveInteraction.ofCanonical(canonical)`.
             */
            fun effectiveInteraction(canonical: EffectiveInteraction.CanonicalInteraction) =
                effectiveInteraction(EffectiveInteraction.ofCanonical(canonical))

            /**
             * Alias for calling [effectiveInteraction] with
             * `EffectiveInteraction.ofProviderPayload(providerPayload)`.
             */
            fun effectiveInteraction(providerPayload: EffectiveInteraction.ProviderPayload) =
                effectiveInteraction(EffectiveInteraction.ofProviderPayload(providerPayload))

            /**
             * The highest threat level across all detections, based on interaction analysis and
             * configured tenant security rules. Values are ordered by severity from least to most:
             * NONE, LOW, MEDIUM, HIGH, CRITICAL.
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
             * Returns an immutable instance of [Outcome].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .action()
             * .detections()
             * .effectiveInteraction()
             * .threatLevel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Outcome =
                Outcome(
                    checkRequired("action", action),
                    checkRequired("detections", detections).map { it.toImmutable() },
                    checkRequired("effectiveInteraction", effectiveInteraction),
                    checkRequired("threatLevel", threatLevel),
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
        fun validate(): Outcome = apply {
            if (validated) {
                return@apply
            }

            action().validate()
            detections().forEach { it.validate() }
            effectiveInteraction().validate()
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
                (detections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (effectiveInteraction.asKnown().getOrNull()?.validity() ?: 0) +
                (threatLevel.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The action applied based on policy evaluation.
         *
         * `NONE` means policy evaluation produced no detections — either no rules fired or no
         * findings were emitted; the `detections` array is empty and the effective payload is
         * unchanged.
         *
         * `DETECT`, `REDACT`, and `BLOCK` all mean one or more detections were produced; they
         * differ in what the policy did with the payload. `DETECT` is an intentional observe-only
         * outcome (detections are surfaced but the effective payload is unchanged); `REDACT`
         * modifies the payload in place; `BLOCK` substitutes a canned block response.
         */
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

                @JvmField val NONE = of("NONE")

                @JvmField val DETECT = of("DETECT")

                @JvmField val REDACT = of("REDACT")

                @JvmField val BLOCK = of("BLOCK")

                @JvmStatic fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                NONE,
                DETECT,
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
                NONE,
                DETECT,
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
                    NONE -> Value.NONE
                    DETECT -> Value.DETECT
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
                    NONE -> Known.NONE
                    DETECT -> Known.DETECT
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

        /**
         * A security detection from policy evaluation with risk assessment. Detections are
         * composite results produced by detection rules running against the evaluation context
         * (`evaluated_interaction`). Supporting evidence is not duplicated on the detection itself
         * — it is observable in `evaluated_interaction` via the signals and findings that the rule
         * matched.
         */
        class Detection
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val riskLevel: JsonField<RiskLevel>,
            private val ruleName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("risk_level")
                @ExcludeMissing
                riskLevel: JsonField<RiskLevel> = JsonMissing.of(),
                @JsonProperty("rule_name")
                @ExcludeMissing
                ruleName: JsonField<String> = JsonMissing.of(),
            ) : this(riskLevel, ruleName, mutableMapOf())

            /**
             * Categorical risk level for this detection.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun riskLevel(): RiskLevel = riskLevel.getRequired("risk_level")

            /**
             * The human-readable name of the detection rule (e.g., prompt_injection,
             * sensitive_pii_exposed).
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ruleName(): String = ruleName.getRequired("rule_name")

            /**
             * Returns the raw JSON value of [riskLevel].
             *
             * Unlike [riskLevel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("risk_level")
            @ExcludeMissing
            fun _riskLevel(): JsonField<RiskLevel> = riskLevel

            /**
             * Returns the raw JSON value of [ruleName].
             *
             * Unlike [ruleName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rule_name") @ExcludeMissing fun _ruleName(): JsonField<String> = ruleName

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
                 * Returns a mutable builder for constructing an instance of [Detection].
                 *
                 * The following fields are required:
                 * ```java
                 * .riskLevel()
                 * .ruleName()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Detection]. */
            class Builder internal constructor() {

                private var riskLevel: JsonField<RiskLevel>? = null
                private var ruleName: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(detection: Detection) = apply {
                    riskLevel = detection.riskLevel
                    ruleName = detection.ruleName
                    additionalProperties = detection.additionalProperties.toMutableMap()
                }

                /** Categorical risk level for this detection. */
                fun riskLevel(riskLevel: RiskLevel) = riskLevel(JsonField.of(riskLevel))

                /**
                 * Sets [Builder.riskLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.riskLevel] with a well-typed [RiskLevel] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun riskLevel(riskLevel: JsonField<RiskLevel>) = apply {
                    this.riskLevel = riskLevel
                }

                /**
                 * The human-readable name of the detection rule (e.g., prompt_injection,
                 * sensitive_pii_exposed).
                 */
                fun ruleName(ruleName: String) = ruleName(JsonField.of(ruleName))

                /**
                 * Sets [Builder.ruleName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ruleName(ruleName: JsonField<String>) = apply { this.ruleName = ruleName }

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
                 * Returns an immutable instance of [Detection].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .riskLevel()
                 * .ruleName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Detection =
                    Detection(
                        checkRequired("riskLevel", riskLevel),
                        checkRequired("ruleName", ruleName),
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
            fun validate(): Detection = apply {
                if (validated) {
                    return@apply
                }

                riskLevel().validate()
                ruleName()
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
                (riskLevel.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (ruleName.asKnown().isPresent) 1 else 0)

            /** Categorical risk level for this detection. */
            class RiskLevel @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LOW = of("LOW")

                    @JvmField val MEDIUM = of("MEDIUM")

                    @JvmField val HIGH = of("HIGH")

                    @JvmField val CRITICAL = of("CRITICAL")

                    @JvmStatic fun of(value: String) = RiskLevel(JsonField.of(value))
                }

                /** An enum containing [RiskLevel]'s known values. */
                enum class Known {
                    LOW,
                    MEDIUM,
                    HIGH,
                    CRITICAL,
                }

                /**
                 * An enum containing [RiskLevel]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RiskLevel] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LOW,
                    MEDIUM,
                    HIGH,
                    CRITICAL,
                    /**
                     * An enum member indicating that [RiskLevel] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
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
                        LOW -> Known.LOW
                        MEDIUM -> Known.MEDIUM
                        HIGH -> Known.HIGH
                        CRITICAL -> Known.CRITICAL
                        else -> throw HiddenLayerInvalidDataException("Unknown RiskLevel: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HiddenLayerInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HiddenLayerInvalidDataException("Value is not a String")
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
                fun validate(): RiskLevel = apply {
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

                    return other is RiskLevel && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Detection &&
                    riskLevel == other.riskLevel &&
                    ruleName == other.ruleName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(riskLevel, ruleName, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Detection{riskLevel=$riskLevel, ruleName=$ruleName, additionalProperties=$additionalProperties}"
        }

        /**
         * The payload the caller should forward downstream. Mirrors the shape of the request's
         * `interaction` field: if the request supplied the canonical form (`CanonicalInteraction`),
         * the response returns the canonical form here; if the request supplied a native
         * LLM-provider payload (OpenAI Chat Completions, OpenAI Responses, or Anthropic Messages),
         * the response returns that same provider-native shape. Any redactions, substitutions, or
         * tool modifications from the outcome's `action` are applied in place.
         */
        @JsonDeserialize(using = EffectiveInteraction.Deserializer::class)
        @JsonSerialize(using = EffectiveInteraction.Serializer::class)
        class EffectiveInteraction
        private constructor(
            private val canonical: CanonicalInteraction? = null,
            private val providerPayload: ProviderPayload? = null,
            private val _json: JsonValue? = null,
        ) {

            /**
             * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
             * messages, optionally with the tool catalog that was in scope. Use this form to
             * evaluate interactions independently of any specific provider's payload structure.
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
             * messages, optionally with the tool catalog that was in scope. Use this form to
             * evaluate interactions independently of any specific provider's payload structure.
             */
            fun asCanonical(): CanonicalInteraction = canonical.getOrThrow("canonical")

            /**
             * A pass-through payload in the native format of the LLM provider. Any valid provider
             * request or response payload is accepted as-is and returned in the same format.
             */
            fun asProviderPayload(): ProviderPayload = providerPayload.getOrThrow("providerPayload")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```java
             * import com.hiddenlayer.api.core.JsonValue;
             * import java.util.Optional;
             *
             * Optional<String> result = effectiveInteraction.accept(new EffectiveInteraction.Visitor<Optional<String>>() {
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
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): EffectiveInteraction = apply {
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

                return other is EffectiveInteraction &&
                    canonical == other.canonical &&
                    providerPayload == other.providerPayload
            }

            override fun hashCode(): Int = Objects.hash(canonical, providerPayload)

            override fun toString(): String =
                when {
                    canonical != null -> "EffectiveInteraction{canonical=$canonical}"
                    providerPayload != null ->
                        "EffectiveInteraction{providerPayload=$providerPayload}"
                    _json != null -> "EffectiveInteraction{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EffectiveInteraction")
                }

            companion object {

                /**
                 * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence
                 * of messages, optionally with the tool catalog that was in scope. Use this form to
                 * evaluate interactions independently of any specific provider's payload structure.
                 */
                @JvmStatic
                fun ofCanonical(canonical: CanonicalInteraction) =
                    EffectiveInteraction(canonical = canonical)

                /**
                 * A pass-through payload in the native format of the LLM provider. Any valid
                 * provider request or response payload is accepted as-is and returned in the same
                 * format.
                 */
                @JvmStatic
                fun ofProviderPayload(providerPayload: ProviderPayload) =
                    EffectiveInteraction(providerPayload = providerPayload)
            }

            /**
             * An interface that defines how to map each variant of [EffectiveInteraction] to a
             * value of type [T].
             */
            interface Visitor<out T> {

                /**
                 * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence
                 * of messages, optionally with the tool catalog that was in scope. Use this form to
                 * evaluate interactions independently of any specific provider's payload structure.
                 */
                fun visitCanonical(canonical: CanonicalInteraction): T

                /**
                 * A pass-through payload in the native format of the LLM provider. Any valid
                 * provider request or response payload is accepted as-is and returned in the same
                 * format.
                 */
                fun visitProviderPayload(providerPayload: ProviderPayload): T

                /**
                 * Maps an unknown variant of [EffectiveInteraction] to a value of type [T].
                 *
                 * An instance of [EffectiveInteraction] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws HiddenLayerInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw HiddenLayerInvalidDataException("Unknown EffectiveInteraction: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<EffectiveInteraction>(EffectiveInteraction::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EffectiveInteraction {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<CanonicalInteraction>())?.let {
                                    EffectiveInteraction(canonical = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<ProviderPayload>())?.let {
                                    EffectiveInteraction(providerPayload = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> EffectiveInteraction(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<EffectiveInteraction>(EffectiveInteraction::class) {

                override fun serialize(
                    value: EffectiveInteraction,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.canonical != null -> generator.writeObject(value.canonical)
                        value.providerPayload != null ->
                            generator.writeObject(value.providerPayload)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EffectiveInteraction")
                    }
                }
            }

            /**
             * The canonical (provider-agnostic) form of an LLM interaction: an ordered sequence of
             * messages, optionally with the tool catalog that was in scope. Use this form to
             * evaluate interactions independently of any specific provider's payload structure.
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
                 * combination of user input, assistant output, system prompts, and tool
                 * calls/results — and may be a single message or many. There is no requirement that
                 * the messages form a complete request/response pair.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                     * Returns a mutable builder for constructing an instance of
                     * [CanonicalInteraction].
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
                        toolsAvailable =
                            canonicalInteraction.toolsAvailable.map { it.toMutableList() }
                        additionalProperties =
                            canonicalInteraction.additionalProperties.toMutableMap()
                    }

                    /**
                     * Ordered sequence of messages to evaluate, in chronological order. May contain
                     * any combination of user input, assistant output, system prompts, and tool
                     * calls/results — and may be a single message or many. There is no requirement
                     * that the messages form a complete request/response pair.
                     */
                    fun messages(messages: List<Message>) = messages(JsonField.of(messages))

                    /**
                     * Sets [Builder.messages] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.messages] with a well-typed `List<Message>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * `List<ToolsAvailable>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
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
                 * Base schema for a conversation message in normalized/canonical form. Represents
                 * the unified representation of messages across different LLM providers.
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
                     * Array of content parts representing the message content. Each part has a
                     * `type` field indicating the content type.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun content(): List<Content> = content.getRequired("content")

                    /**
                     * The role of the message sender. Standard roles include:
                     * - `user`: End-user input
                     * - `assistant`: LLM/agent response
                     * - `system`: System instructions or context
                     * - `tool`: Tool result message
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun role(): String = role.getRequired("role")

                    /**
                     * Optional timestamp for when this message was created. When supplied, `value`
                     * is required.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun timestamp(): Optional<Timestamp> = timestamp.getOptional("timestamp")

                    /**
                     * Returns the raw JSON value of [content].
                     *
                     * Unlike [content], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                     * Unlike [timestamp], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * You should usually call [Builder.content] with a well-typed
                         * `List<Content>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun content(content: JsonField<List<Content>>) = apply {
                            this.content = content.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Content] to [Builder.content].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
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

                        /**
                         * Alias for calling [addContent] with `Content.ofToolResult(toolResult)`.
                         */
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
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun role(role: JsonField<String>) = apply { this.role = role }

                        /**
                         * Optional timestamp for when this message was created. When supplied,
                         * `value` is required.
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HiddenLayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
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
                         * Maps this instance's current variant to a value of type [T] using the
                         * given [visitor].
                         *
                         * Note that this method is _not_ forwards compatible with new variants from
                         * the API, unless [visitor] overrides [Visitor.unknown]. To handle variants
                         * not known to this version of the SDK gracefully, consider overriding
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
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                            fun ofToolResult(toolResult: ToolResult) =
                                Content(toolResult = toolResult)
                        }

                        /**
                         * An interface that defines how to map each variant of [Content] to a value
                         * of type [T].
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
                             * deserialized from data that doesn't match any known variant. For
                             * example, if the SDK is on an older version than the API, then the API
                             * may respond with new variants that the SDK is unaware of.
                             *
                             * @throws HiddenLayerInvalidDataException in the default
                             *   implementation.
                             */
                            fun unknown(json: JsonValue?): T {
                                throw HiddenLayerInvalidDataException("Unknown Content: $json")
                            }
                        }

                        internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                val json = JsonValue.fromJsonNode(node)
                                val type =
                                    json
                                        .asObject()
                                        .getOrNull()
                                        ?.get("type")
                                        ?.asString()
                                        ?.getOrNull()

                                when (type) {
                                    "text" -> {
                                        return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                                            Content(text = it, _json = json)
                                        } ?: Content(_json = json)
                                    }
                                    "tool_use" -> {
                                        return tryDeserialize(node, jacksonTypeRef<ToolUse>())
                                            ?.let { Content(toolUse = it, _json = json) }
                                            ?: Content(_json = json)
                                    }
                                    "tool_result" -> {
                                        return tryDeserialize(node, jacksonTypeRef<ToolResult>())
                                            ?.let { Content(toolResult = it, _json = json) }
                                            ?: Content(_json = json)
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
                                    value.toolResult != null ->
                                        generator.writeObject(value.toolResult)
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
                                @JsonProperty("type")
                                @ExcludeMissing
                                type: JsonValue = JsonMissing.of(),
                            ) : this(text, type, mutableMapOf())

                            /**
                             * The text content.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
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
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Returns the raw JSON value of [text].
                             *
                             * Unlike [text], this method doesn't throw if the JSON field has an
                             * unexpected type.
                             */
                            @JsonProperty("text")
                            @ExcludeMissing
                            fun _text(): JsonField<String> = text

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
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
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
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

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
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws HiddenLayerInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun id(): String = id.getRequired("id")

                            /**
                             * Name of the tool being invoked.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
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
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
                             */
                            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                            /**
                             * Tool arguments/input as a key-value object.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type (e.g. if the server responded with an unexpected
                             *   value).
                             */
                            fun toolInput(): Optional<ToolInput> =
                                toolInput.getOptional("tool_input")

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
                             * Unlike [toolInput], this method doesn't throw if the JSON field has
                             * an unexpected type.
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
                                 * Returns a mutable builder for constructing an instance of
                                 * [ToolUse].
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
                                    additionalProperties =
                                        toolUse.additionalProperties.toMutableMap()
                                }

                                /**
                                 * Tool call identifier. Used to correlate tool invocations with
                                 * their results.
                                 */
                                fun id(id: String) = id(JsonField.of(id))

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                /** Name of the tool being invoked. */
                                fun toolName(toolName: String) = toolName(JsonField.of(toolName))

                                /**
                                 * Sets [Builder.toolName] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.toolName] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
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
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                /** Tool arguments/input as a key-value object. */
                                fun toolInput(toolInput: ToolInput) =
                                    toolInput(JsonField.of(toolInput))

                                /**
                                 * Sets [Builder.toolInput] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.toolInput] with a well-typed
                                 * [ToolInput] value instead. This method is primarily for setting
                                 * the field to an undocumented or not yet supported value.
                                 */
                                fun toolInput(toolInput: JsonField<ToolInput>) = apply {
                                    this.toolInput = toolInput
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
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws HiddenLayerInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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

                                    private var additionalProperties:
                                        MutableMap<String, JsonValue> =
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

                                    fun putAdditionalProperty(key: String, value: JsonValue) =
                                        apply {
                                            additionalProperties.put(key, value)
                                        }

                                    fun putAllAdditionalProperties(
                                        additionalProperties: Map<String, JsonValue>
                                    ) = apply {
                                        this.additionalProperties.putAll(additionalProperties)
                                    }

                                    fun removeAdditionalProperty(key: String) = apply {
                                        additionalProperties.remove(key)
                                    }

                                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                        keys.forEach(::removeAdditionalProperty)
                                    }

                                    /**
                                     * Returns an immutable instance of [ToolInput].
                                     *
                                     * Further updates to this [Builder] will not mutate the
                                     * returned instance.
                                     */
                                    fun build(): ToolInput =
                                        ToolInput(additionalProperties.toImmutable())
                                }

                                private var validated: Boolean = false

                                /**
                                 * Validates that the types of all values in this object match their
                                 * expected types recursively.
                                 *
                                 * This method is _not_ forwards compatible with new types from the
                                 * API for existing fields.
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

                                private val hashCode: Int by lazy {
                                    Objects.hash(additionalProperties)
                                }

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
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
                             */
                            fun id(): String = id.getRequired("id")

                            /**
                             * The tool execution result content.
                             *
                             * @throws HiddenLayerInvalidDataException if the JSON field has an
                             *   unexpected type or is unexpectedly missing or null (e.g. if the
                             *   server responded with an unexpected value).
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
                             * However, this method can be useful for debugging and logging (e.g. if
                             * the server responded with an unexpected value).
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
                                 * Tool call identifier. Used to correlate this result with the
                                 * original tool invocation.
                                 */
                                fun id(id: String) = id(JsonField.of(id))

                                /**
                                 * Sets [Builder.id] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.id] with a well-typed [String]
                                 * value instead. This method is primarily for setting the field to
                                 * an undocumented or not yet supported value.
                                 */
                                fun id(id: JsonField<String>) = apply { this.id = id }

                                /** The tool execution result content. */
                                fun result(result: String) = result(JsonField.of(result))

                                /**
                                 * Sets [Builder.result] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.result] with a well-typed
                                 * [String] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun result(result: JsonField<String>) = apply {
                                    this.result = result
                                }

                                /**
                                 * Sets the field to an arbitrary JSON value.
                                 *
                                 * It is usually unnecessary to call this method because the field
                                 * defaults to the following:
                                 * ```java
                                 * JsonValue.from("tool_result")
                                 * ```
                                 *
                                 * This method is primarily for setting the field to an undocumented
                                 * or not yet supported value.
                                 */
                                fun type(type: JsonValue) = apply { this.type = type }

                                /** Whether the tool execution succeeded. */
                                fun success(success: Boolean) = success(JsonField.of(success))

                                /**
                                 * Sets [Builder.success] to an arbitrary JSON value.
                                 *
                                 * You should usually call [Builder.success] with a well-typed
                                 * [Boolean] value instead. This method is primarily for setting the
                                 * field to an undocumented or not yet supported value.
                                 */
                                fun success(success: JsonField<Boolean>) = apply {
                                    this.success = success
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
                             * This method is _not_ forwards compatible with new types from the API
                             * for existing fields.
                             *
                             * @throws HiddenLayerInvalidDataException if any value type in this
                             *   object doesn't match its expected type.
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
                             * Returns a score indicating how many valid values are contained in
                             * this object recursively.
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
                     * Optional timestamp for when this message was created. When supplied, `value`
                     * is required.
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
                         * @throws HiddenLayerInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun value(): OffsetDateTime = value.getRequired("value")

                        /**
                         * Returns the raw JSON value of [value].
                         *
                         * Unlike [value], this method doesn't throw if the JSON field has an
                         * unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [Timestamp].
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
                             * [OffsetDateTime] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun value(value: JsonField<OffsetDateTime>) = apply {
                                this.value = value
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
                             * Returns an immutable instance of [Timestamp].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

                        private val hashCode: Int by lazy {
                            Objects.hash(value, additionalProperties)
                        }

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
                 * Base schema for a tool definition available to the model. Represents the
                 * canonical form of tool definitions across different LLM providers.
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
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Human-readable description of what the tool does.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): Optional<String> = description.getOptional("description")

                    /**
                     * JSON Schema defining the tool's input parameters. Stored as a flexible object
                     * to support various schema formats.
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
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
                         * Returns a mutable builder for constructing an instance of
                         * [ToolsAvailable].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(toolsAvailable: ToolsAvailable) = apply {
                            name = toolsAvailable.name
                            description = toolsAvailable.description
                            parameters = toolsAvailable.parameters
                            additionalProperties =
                                toolsAvailable.additionalProperties.toMutableMap()
                        }

                        /** Name of the tool. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** Human-readable description of what the tool does. */
                        fun description(description: String) =
                            description(JsonField.of(description))

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
                         * JSON Schema defining the tool's input parameters. Stored as a flexible
                         * object to support various schema formats.
                         */
                        fun parameters(parameters: Parameters) =
                            parameters(JsonField.of(parameters))

                        /**
                         * Sets [Builder.parameters] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.parameters] with a well-typed
                         * [Parameters] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun parameters(parameters: JsonField<Parameters>) = apply {
                            this.parameters = parameters
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
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws HiddenLayerInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
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
                     * JSON Schema defining the tool's input parameters. Stored as a flexible object
                     * to support various schema formats.
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
                             * Returns a mutable builder for constructing an instance of
                             * [Parameters].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Parameters]. */
                        class Builder internal constructor() {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(parameters: Parameters) = apply {
                                additionalProperties =
                                    parameters.additionalProperties.toMutableMap()
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
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Parameters = Parameters(additionalProperties.toImmutable())
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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

                    /**
                     * Returns a mutable builder for constructing an instance of [ProviderPayload].
                     */
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
                    fun build(): ProviderPayload =
                        ProviderPayload(additionalProperties.toImmutable())
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ProviderPayload &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ProviderPayload{additionalProperties=$additionalProperties}"
            }
        }

        /**
         * The highest threat level across all detections, based on interaction analysis and
         * configured tenant security rules. Values are ordered by severity from least to most:
         * NONE, LOW, MEDIUM, HIGH, CRITICAL.
         */
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

                @JvmField val NONE = of("NONE")

                @JvmField val LOW = of("LOW")

                @JvmField val MEDIUM = of("MEDIUM")

                @JvmField val HIGH = of("HIGH")

                @JvmField val CRITICAL = of("CRITICAL")

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

            return other is Outcome &&
                action == other.action &&
                detections == other.detections &&
                effectiveInteraction == other.effectiveInteraction &&
                threatLevel == other.threatLevel &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                action,
                detections,
                effectiveInteraction,
                threatLevel,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Outcome{action=$action, detections=$detections, effectiveInteraction=$effectiveInteraction, threatLevel=$threatLevel, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuntimeEvaluateInteractionResponse &&
            evaluatedInteraction == other.evaluatedInteraction &&
            metadata == other.metadata &&
            outcome == other.outcome &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(evaluatedInteraction, metadata, outcome, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuntimeEvaluateInteractionResponse{evaluatedInteraction=$evaluatedInteraction, metadata=$metadata, outcome=$outcome, additionalProperties=$additionalProperties}"
}
