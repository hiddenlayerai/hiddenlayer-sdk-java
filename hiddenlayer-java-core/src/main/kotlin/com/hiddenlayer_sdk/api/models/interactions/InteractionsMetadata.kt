// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class InteractionsMetadata
private constructor(
    private val model: JsonField<String>,
    private val requesterId: JsonField<String>,
    private val provider: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requester_id")
        @ExcludeMissing
        requesterId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
    ) : this(model, requesterId, provider, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requesterId(): String = requesterId.getRequired("requester_id")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<String> = provider.getOptional("provider")

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [requesterId].
     *
     * Unlike [requesterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requester_id")
    @ExcludeMissing
    fun _requesterId(): JsonField<String> = requesterId

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
         * Returns a mutable builder for constructing an instance of [InteractionsMetadata].
         *
         * The following fields are required:
         * ```java
         * .model()
         * .requesterId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InteractionsMetadata]. */
    class Builder internal constructor() {

        private var model: JsonField<String>? = null
        private var requesterId: JsonField<String>? = null
        private var provider: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interactionsMetadata: InteractionsMetadata) = apply {
            model = interactionsMetadata.model
            requesterId = interactionsMetadata.requesterId
            provider = interactionsMetadata.provider
            additionalProperties = interactionsMetadata.additionalProperties.toMutableMap()
        }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun requesterId(requesterId: String) = requesterId(JsonField.of(requesterId))

        /**
         * Sets [Builder.requesterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requesterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requesterId(requesterId: JsonField<String>) = apply { this.requesterId = requesterId }

        fun provider(provider: String) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
         * Returns an immutable instance of [InteractionsMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .model()
         * .requesterId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InteractionsMetadata =
            InteractionsMetadata(
                checkRequired("model", model),
                checkRequired("requesterId", requesterId),
                provider,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InteractionsMetadata = apply {
        if (validated) {
            return@apply
        }

        model()
        requesterId()
        provider()
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
        (if (model.asKnown().isPresent) 1 else 0) +
            (if (requesterId.asKnown().isPresent) 1 else 0) +
            (if (provider.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InteractionsMetadata &&
            model == other.model &&
            requesterId == other.requesterId &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(model, requesterId, provider, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InteractionsMetadata{model=$model, requesterId=$requesterId, provider=$provider, additionalProperties=$additionalProperties}"
}
