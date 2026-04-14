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
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Response from submitting a target response. */
class RedTeamSubmitTargetResponseResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val isOk: JsonField<Boolean>,
    private val message: JsonField<String>,
    private val error: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("is_ok") @ExcludeMissing isOk: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
    ) : this(isOk, message, error, mutableMapOf())

    /**
     * Whether the submission was successful
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOk(): Boolean = isOk.getRequired("is_ok")

    /**
     * Human-readable status message
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Error code if ok=false
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Returns the raw JSON value of [isOk].
     *
     * Unlike [isOk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_ok") @ExcludeMissing fun _isOk(): JsonField<Boolean> = isOk

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

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
         * [RedTeamSubmitTargetResponseResponse].
         *
         * The following fields are required:
         * ```java
         * .isOk()
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedTeamSubmitTargetResponseResponse]. */
    class Builder internal constructor() {

        private var isOk: JsonField<Boolean>? = null
        private var message: JsonField<String>? = null
        private var error: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            redTeamSubmitTargetResponseResponse: RedTeamSubmitTargetResponseResponse
        ) = apply {
            isOk = redTeamSubmitTargetResponseResponse.isOk
            message = redTeamSubmitTargetResponseResponse.message
            error = redTeamSubmitTargetResponseResponse.error
            additionalProperties =
                redTeamSubmitTargetResponseResponse.additionalProperties.toMutableMap()
        }

        /** Whether the submission was successful */
        fun isOk(isOk: Boolean) = isOk(JsonField.of(isOk))

        /**
         * Sets [Builder.isOk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOk] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isOk(isOk: JsonField<Boolean>) = apply { this.isOk = isOk }

        /** Human-readable status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Error code if ok=false */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

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
         * Returns an immutable instance of [RedTeamSubmitTargetResponseResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .isOk()
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedTeamSubmitTargetResponseResponse =
            RedTeamSubmitTargetResponseResponse(
                checkRequired("isOk", isOk),
                checkRequired("message", message),
                error,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RedTeamSubmitTargetResponseResponse = apply {
        if (validated) {
            return@apply
        }

        isOk()
        message()
        error()
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
        (if (isOk.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedTeamSubmitTargetResponseResponse &&
            isOk == other.isOk &&
            message == other.message &&
            error == other.error &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(isOk, message, error, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RedTeamSubmitTargetResponseResponse{isOk=$isOk, message=$message, error=$error, additionalProperties=$additionalProperties}"
}
