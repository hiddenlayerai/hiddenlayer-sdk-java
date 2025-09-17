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
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InteractionsInput
private constructor(
    private val messages: JsonField<List<InteractionsTextContent>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("messages")
        @ExcludeMissing
        messages: JsonField<List<InteractionsTextContent>> = JsonMissing.of()
    ) : this(messages, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun messages(): Optional<List<InteractionsTextContent>> = messages.getOptional("messages")

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages")
    @ExcludeMissing
    fun _messages(): JsonField<List<InteractionsTextContent>> = messages

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

        /** Returns a mutable builder for constructing an instance of [InteractionsInput]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InteractionsInput]. */
    class Builder internal constructor() {

        private var messages: JsonField<MutableList<InteractionsTextContent>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interactionsInput: InteractionsInput) = apply {
            messages = interactionsInput.messages.map { it.toMutableList() }
            additionalProperties = interactionsInput.additionalProperties.toMutableMap()
        }

        fun messages(messages: List<InteractionsTextContent>) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed
         * `List<InteractionsTextContent>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun messages(messages: JsonField<List<InteractionsTextContent>>) = apply {
            this.messages = messages.map { it.toMutableList() }
        }

        /**
         * Adds a single [InteractionsTextContent] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: InteractionsTextContent) = apply {
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [InteractionsInput].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InteractionsInput =
            InteractionsInput(
                (messages ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InteractionsInput = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (messages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InteractionsInput &&
            messages == other.messages &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(messages, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InteractionsInput{messages=$messages, additionalProperties=$additionalProperties}"
}
