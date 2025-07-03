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
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents the contents of an artifact. */
class ArtifactContent
private constructor(
    private val binary: JsonField<String>,
    private val properties: JsonField<PropertyBag>,
    private val rendered: JsonField<MultiformatMessageString>,
    private val text: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("binary") @ExcludeMissing binary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<PropertyBag> = JsonMissing.of(),
        @JsonProperty("rendered")
        @ExcludeMissing
        rendered: JsonField<MultiformatMessageString> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
    ) : this(binary, properties, rendered, text, mutableMapOf())

    /**
     * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original
     * encoding.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun binary(): Optional<String> = binary.getOptional("binary")

    /**
     * Key/value pairs that provide additional information about the artifact content.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

    /**
     * An alternate rendered representation of the artifact (e.g., a decompiled representation of a
     * binary region).
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rendered(): Optional<MultiformatMessageString> = rendered.getOptional("rendered")

    /**
     * UTF-8-encoded content from a text artifact.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = text.getOptional("text")

    /**
     * Returns the raw JSON value of [binary].
     *
     * Unlike [binary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("binary") @ExcludeMissing fun _binary(): JsonField<String> = binary

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<PropertyBag> = properties

    /**
     * Returns the raw JSON value of [rendered].
     *
     * Unlike [rendered], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rendered")
    @ExcludeMissing
    fun _rendered(): JsonField<MultiformatMessageString> = rendered

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

        /** Returns a mutable builder for constructing an instance of [ArtifactContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ArtifactContent]. */
    class Builder internal constructor() {

        private var binary: JsonField<String> = JsonMissing.of()
        private var properties: JsonField<PropertyBag> = JsonMissing.of()
        private var rendered: JsonField<MultiformatMessageString> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(artifactContent: ArtifactContent) = apply {
            binary = artifactContent.binary
            properties = artifactContent.properties
            rendered = artifactContent.rendered
            text = artifactContent.text
            additionalProperties = artifactContent.additionalProperties.toMutableMap()
        }

        /**
         * MIME Base64-encoded content from a binary artifact, or from a text artifact in its
         * original encoding.
         */
        fun binary(binary: String) = binary(JsonField.of(binary))

        /**
         * Sets [Builder.binary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.binary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun binary(binary: JsonField<String>) = apply { this.binary = binary }

        /** Key/value pairs that provide additional information about the artifact content. */
        fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [PropertyBag] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<PropertyBag>) = apply { this.properties = properties }

        /**
         * An alternate rendered representation of the artifact (e.g., a decompiled representation
         * of a binary region).
         */
        fun rendered(rendered: MultiformatMessageString) = rendered(JsonField.of(rendered))

        /**
         * Sets [Builder.rendered] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rendered] with a well-typed [MultiformatMessageString]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rendered(rendered: JsonField<MultiformatMessageString>) = apply {
            this.rendered = rendered
        }

        /** UTF-8-encoded content from a text artifact. */
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
         * Returns an immutable instance of [ArtifactContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ArtifactContent =
            ArtifactContent(binary, properties, rendered, text, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ArtifactContent = apply {
        if (validated) {
            return@apply
        }

        binary()
        properties().ifPresent { it.validate() }
        rendered().ifPresent { it.validate() }
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
        (if (binary.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (rendered.asKnown().getOrNull()?.validity() ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ArtifactContent && binary == other.binary && properties == other.properties && rendered == other.rendered && text == other.text && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(binary, properties, rendered, text, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ArtifactContent{binary=$binary, properties=$properties, rendered=$rendered, text=$text, additionalProperties=$additionalProperties}"
}
