// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response from next-action polling endpoint. */
class RedTeamRetrieveNextActionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isReady: JsonField<Boolean>,
    private val actionType: JsonField<String>,
    private val attackPrompt: JsonField<String>,
    private val history: JsonField<List<History>>,
    private val isProcessing: JsonField<Boolean>,
    private val message: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val targetSystemPrompt: JsonField<String>,
    private val turn: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("is_ready") @ExcludeMissing isReady: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("action_type")
        @ExcludeMissing
        actionType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attack_prompt")
        @ExcludeMissing
        attackPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("history")
        @ExcludeMissing
        history: JsonField<List<History>> = JsonMissing.of(),
        @JsonProperty("is_processing")
        @ExcludeMissing
        isProcessing: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_system_prompt")
        @ExcludeMissing
        targetSystemPrompt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("turn") @ExcludeMissing turn: JsonField<Int> = JsonMissing.of(),
    ) : this(
        isReady,
        actionType,
        attackPrompt,
        history,
        isProcessing,
        message,
        sessionId,
        targetSystemPrompt,
        turn,
        mutableMapOf(),
    )

    /**
     * Whether an action is ready
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isReady(): Boolean = isReady.getRequired("is_ready")

    /**
     * Type of action (e.g., "attack", "complete")
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionType(): Optional<String> = actionType.getOptional("action_type")

    /**
     * Attack prompt to send to target
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attackPrompt(): Optional<String> = attackPrompt.getOptional("attack_prompt")

    /**
     * Conversation history
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun history(): Optional<List<History>> = history.getOptional("history")

    /**
     * Whether processing is in progress
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isProcessing(): Optional<Boolean> = isProcessing.getOptional("is_processing")

    /**
     * Status message
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Session identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * Target's system prompt
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetSystemPrompt(): Optional<String> =
        targetSystemPrompt.getOptional("target_system_prompt")

    /**
     * Current turn number
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun turn(): Optional<Int> = turn.getOptional("turn")

    /**
     * Returns the raw JSON value of [isReady].
     *
     * Unlike [isReady], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_ready") @ExcludeMissing fun _isReady(): JsonField<Boolean> = isReady

    /**
     * Returns the raw JSON value of [actionType].
     *
     * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_type") @ExcludeMissing fun _actionType(): JsonField<String> = actionType

    /**
     * Returns the raw JSON value of [attackPrompt].
     *
     * Unlike [attackPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attack_prompt")
    @ExcludeMissing
    fun _attackPrompt(): JsonField<String> = attackPrompt

    /**
     * Returns the raw JSON value of [history].
     *
     * Unlike [history], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("history") @ExcludeMissing fun _history(): JsonField<List<History>> = history

    /**
     * Returns the raw JSON value of [isProcessing].
     *
     * Unlike [isProcessing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_processing")
    @ExcludeMissing
    fun _isProcessing(): JsonField<Boolean> = isProcessing

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [targetSystemPrompt].
     *
     * Unlike [targetSystemPrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("target_system_prompt")
    @ExcludeMissing
    fun _targetSystemPrompt(): JsonField<String> = targetSystemPrompt

    /**
     * Returns the raw JSON value of [turn].
     *
     * Unlike [turn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turn") @ExcludeMissing fun _turn(): JsonField<Int> = turn

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
         * [RedTeamRetrieveNextActionResponse].
         *
         * The following fields are required:
         * ```java
         * .isReady()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedTeamRetrieveNextActionResponse]. */
    class Builder internal constructor() {

        private var isReady: JsonField<Boolean>? = null
        private var actionType: JsonField<String> = JsonMissing.of()
        private var attackPrompt: JsonField<String> = JsonMissing.of()
        private var history: JsonField<MutableList<History>>? = null
        private var isProcessing: JsonField<Boolean> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var targetSystemPrompt: JsonField<String> = JsonMissing.of()
        private var turn: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(redTeamRetrieveNextActionResponse: RedTeamRetrieveNextActionResponse) =
            apply {
                isReady = redTeamRetrieveNextActionResponse.isReady
                actionType = redTeamRetrieveNextActionResponse.actionType
                attackPrompt = redTeamRetrieveNextActionResponse.attackPrompt
                history = redTeamRetrieveNextActionResponse.history.map { it.toMutableList() }
                isProcessing = redTeamRetrieveNextActionResponse.isProcessing
                message = redTeamRetrieveNextActionResponse.message
                sessionId = redTeamRetrieveNextActionResponse.sessionId
                targetSystemPrompt = redTeamRetrieveNextActionResponse.targetSystemPrompt
                turn = redTeamRetrieveNextActionResponse.turn
                additionalProperties =
                    redTeamRetrieveNextActionResponse.additionalProperties.toMutableMap()
            }

        /** Whether an action is ready */
        fun isReady(isReady: Boolean) = isReady(JsonField.of(isReady))

        /**
         * Sets [Builder.isReady] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isReady] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isReady(isReady: JsonField<Boolean>) = apply { this.isReady = isReady }

        /** Type of action (e.g., "attack", "complete") */
        fun actionType(actionType: String) = actionType(JsonField.of(actionType))

        /**
         * Sets [Builder.actionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionType(actionType: JsonField<String>) = apply { this.actionType = actionType }

        /** Attack prompt to send to target */
        fun attackPrompt(attackPrompt: String) = attackPrompt(JsonField.of(attackPrompt))

        /**
         * Sets [Builder.attackPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attackPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attackPrompt(attackPrompt: JsonField<String>) = apply {
            this.attackPrompt = attackPrompt
        }

        /** Conversation history */
        fun history(history: List<History>) = history(JsonField.of(history))

        /**
         * Sets [Builder.history] to an arbitrary JSON value.
         *
         * You should usually call [Builder.history] with a well-typed `List<History>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun history(history: JsonField<List<History>>) = apply {
            this.history = history.map { it.toMutableList() }
        }

        /**
         * Adds a single [History] to [Builder.history].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHistory(history: History) = apply {
            this.history =
                (this.history ?: JsonField.of(mutableListOf())).also {
                    checkKnown("history", it).add(history)
                }
        }

        /** Whether processing is in progress */
        fun isProcessing(isProcessing: Boolean) = isProcessing(JsonField.of(isProcessing))

        /**
         * Sets [Builder.isProcessing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isProcessing] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isProcessing(isProcessing: JsonField<Boolean>) = apply {
            this.isProcessing = isProcessing
        }

        /** Status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Session identifier */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        /** Target's system prompt */
        fun targetSystemPrompt(targetSystemPrompt: String) =
            targetSystemPrompt(JsonField.of(targetSystemPrompt))

        /**
         * Sets [Builder.targetSystemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetSystemPrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetSystemPrompt(targetSystemPrompt: JsonField<String>) = apply {
            this.targetSystemPrompt = targetSystemPrompt
        }

        /** Current turn number */
        fun turn(turn: Int) = turn(JsonField.of(turn))

        /**
         * Sets [Builder.turn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turn] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun turn(turn: JsonField<Int>) = apply { this.turn = turn }

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
         * Returns an immutable instance of [RedTeamRetrieveNextActionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isReady()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedTeamRetrieveNextActionResponse =
            RedTeamRetrieveNextActionResponse(
                checkRequired("isReady", isReady),
                actionType,
                attackPrompt,
                (history ?: JsonMissing.of()).map { it.toImmutable() },
                isProcessing,
                message,
                sessionId,
                targetSystemPrompt,
                turn,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RedTeamRetrieveNextActionResponse = apply {
        if (validated) {
            return@apply
        }

        isReady()
        actionType()
        attackPrompt()
        history().ifPresent { it.forEach { it.validate() } }
        isProcessing()
        message()
        sessionId()
        targetSystemPrompt()
        turn()
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
        (if (isReady.asKnown().isPresent) 1 else 0) +
            (if (actionType.asKnown().isPresent) 1 else 0) +
            (if (attackPrompt.asKnown().isPresent) 1 else 0) +
            (history.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isProcessing.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (targetSystemPrompt.asKnown().isPresent) 1 else 0) +
            (if (turn.asKnown().isPresent) 1 else 0)

    class History
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

            /** Returns a mutable builder for constructing an instance of [History]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [History]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(history: History) = apply {
                additionalProperties = history.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [History].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): History = History(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): History = apply {
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

            return other is History && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "History{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedTeamRetrieveNextActionResponse &&
            isReady == other.isReady &&
            actionType == other.actionType &&
            attackPrompt == other.attackPrompt &&
            history == other.history &&
            isProcessing == other.isProcessing &&
            message == other.message &&
            sessionId == other.sessionId &&
            targetSystemPrompt == other.targetSystemPrompt &&
            turn == other.turn &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            isReady,
            actionType,
            attackPrompt,
            history,
            isProcessing,
            message,
            sessionId,
            targetSystemPrompt,
            turn,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RedTeamRetrieveNextActionResponse{isReady=$isReady, actionType=$actionType, attackPrompt=$attackPrompt, history=$history, isProcessing=$isProcessing, message=$message, sessionId=$sessionId, targetSystemPrompt=$targetSystemPrompt, turn=$turn, additionalProperties=$additionalProperties}"
}
