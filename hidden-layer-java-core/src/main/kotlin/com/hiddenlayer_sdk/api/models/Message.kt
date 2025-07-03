// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Encapsulates a message intended to be read by the end user. */
class Message
private constructor(
    private val id: JsonField<String>,
    private val arguments: JsonField<List<String>>,
    private val markdown: JsonField<String>,
    private val properties: JsonField<PropertyBag>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arguments")
        @ExcludeMissing
        arguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("markdown") @ExcludeMissing markdown: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<PropertyBag> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(id, arguments, markdown, properties, text, mutableMapOf())

    /**
     * The identifier for this message.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * An array of strings to substitute into the message string.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

    /**
     * A Markdown message string.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markdown(): Optional<String> = markdown.getOptional("markdown")

    /**
     * Key/value pairs that provide additional information about the message.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

    /**
     * A plain text message string.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arguments") @ExcludeMissing fun _arguments(): JsonField<List<String>> = arguments

    /**
     * Returns the raw JSON value of [markdown].
     *
     * Unlike [markdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markdown") @ExcludeMissing fun _markdown(): JsonField<String> = markdown

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<PropertyBag> = properties

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [Message]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Message]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var arguments: JsonField<MutableList<String>>? = null
        private var markdown: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<PropertyBag> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(message: Message) = apply {
            id = message.id
            arguments = message.arguments.map { it.toMutableList() }
            markdown = message.markdown
            properties = message.properties
            text = message.text
            additionalProperties = message.additionalProperties.toMutableMap()
        }

        /** The identifier for this message. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** An array of strings to substitute into the message string. */
        fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

        /**
         * Sets [Builder.arguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arguments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arguments(arguments: JsonField<List<String>>) = apply {
            this.arguments = arguments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [arguments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArgument(argument: String) = apply {
            arguments =
                (arguments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("arguments", it).add(argument)
                }
        }

        /** A Markdown message string. */
        fun markdown(markdown: String) = markdown(JsonField.of(markdown))

        /**
         * Sets [Builder.markdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markdown] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun markdown(markdown: JsonField<String>) = apply { this.markdown = markdown }

        /** Key/value pairs that provide additional information about the message. */
        fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [PropertyBag] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<PropertyBag>) = apply { this.properties = properties }

        /** A plain text message string. */
        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

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
         * Returns an immutable instance of [Message].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Message =
            Message(
                id,
                (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                markdown,
                properties,
                text,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        id()
        arguments()
        markdown()
        properties().ifPresent { it.validate() }
        text()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (arguments.asKnown().getOrNull()?.size ?: 0) +
            (if (markdown.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Message && id == other.id && arguments == other.arguments && markdown == other.markdown && properties == other.properties && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, arguments, markdown, properties, text, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Message{id=$id, arguments=$arguments, markdown=$markdown, properties=$properties, text=$text, additionalProperties=$additionalProperties}"
}
