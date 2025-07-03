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

/** A region within an artifact where a result was detected. */
class Region
private constructor(
    private val byteLength: JsonField<Long>,
    private val byteOffset: JsonField<Long>,
    private val charLength: JsonField<Long>,
    private val charOffset: JsonField<Long>,
    private val endColumn: JsonField<Long>,
    private val endLine: JsonField<Long>,
    private val message: JsonField<Message>,
    private val properties: JsonField<PropertyBag>,
    private val snippet: JsonField<ArtifactContent>,
    private val sourceLanguage: JsonField<String>,
    private val startColumn: JsonField<Long>,
    private val startLine: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("byteLength") @ExcludeMissing byteLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("byteOffset") @ExcludeMissing byteOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("charLength") @ExcludeMissing charLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("charOffset") @ExcludeMissing charOffset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("endColumn") @ExcludeMissing endColumn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("endLine") @ExcludeMissing endLine: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<Message> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<PropertyBag> = JsonMissing.of(),
        @JsonProperty("snippet")
        @ExcludeMissing
        snippet: JsonField<ArtifactContent> = JsonMissing.of(),
        @JsonProperty("sourceLanguage")
        @ExcludeMissing
        sourceLanguage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startColumn")
        @ExcludeMissing
        startColumn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("startLine") @ExcludeMissing startLine: JsonField<Long> = JsonMissing.of(),
    ) : this(
        byteLength,
        byteOffset,
        charLength,
        charOffset,
        endColumn,
        endLine,
        message,
        properties,
        snippet,
        sourceLanguage,
        startColumn,
        startLine,
        mutableMapOf(),
    )

    /**
     * The length of the region in bytes.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun byteLength(): Optional<Long> = byteLength.getOptional("byteLength")

    /**
     * The zero-based offset from the beginning of the artifact of the first byte in the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun byteOffset(): Optional<Long> = byteOffset.getOptional("byteOffset")

    /**
     * The length of the region in characters.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun charLength(): Optional<Long> = charLength.getOptional("charLength")

    /**
     * The zero-based offset from the beginning of the artifact of the first character in the
     * region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun charOffset(): Optional<Long> = charOffset.getOptional("charOffset")

    /**
     * The column number of the character following the end of the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endColumn(): Optional<Long> = endColumn.getOptional("endColumn")

    /**
     * The line number of the last character in the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endLine(): Optional<Long> = endLine.getOptional("endLine")

    /**
     * A message relevant to the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<Message> = message.getOptional("message")

    /**
     * Key/value pairs that provide additional information about the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun properties(): Optional<PropertyBag> = properties.getOptional("properties")

    /**
     * The portion of the artifact contents within the specified region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun snippet(): Optional<ArtifactContent> = snippet.getOptional("snippet")

    /**
     * Specifies the source language, if any, of the portion of the artifact specified by the region
     * object.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceLanguage(): Optional<String> = sourceLanguage.getOptional("sourceLanguage")

    /**
     * The column number of the first character in the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startColumn(): Optional<Long> = startColumn.getOptional("startColumn")

    /**
     * The line number of the first character in the region.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startLine(): Optional<Long> = startLine.getOptional("startLine")

    /**
     * Returns the raw JSON value of [byteLength].
     *
     * Unlike [byteLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("byteLength") @ExcludeMissing fun _byteLength(): JsonField<Long> = byteLength

    /**
     * Returns the raw JSON value of [byteOffset].
     *
     * Unlike [byteOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("byteOffset") @ExcludeMissing fun _byteOffset(): JsonField<Long> = byteOffset

    /**
     * Returns the raw JSON value of [charLength].
     *
     * Unlike [charLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charLength") @ExcludeMissing fun _charLength(): JsonField<Long> = charLength

    /**
     * Returns the raw JSON value of [charOffset].
     *
     * Unlike [charOffset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charOffset") @ExcludeMissing fun _charOffset(): JsonField<Long> = charOffset

    /**
     * Returns the raw JSON value of [endColumn].
     *
     * Unlike [endColumn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endColumn") @ExcludeMissing fun _endColumn(): JsonField<Long> = endColumn

    /**
     * Returns the raw JSON value of [endLine].
     *
     * Unlike [endLine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLine") @ExcludeMissing fun _endLine(): JsonField<Long> = endLine

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<Message> = message

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<PropertyBag> = properties

    /**
     * Returns the raw JSON value of [snippet].
     *
     * Unlike [snippet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("snippet") @ExcludeMissing fun _snippet(): JsonField<ArtifactContent> = snippet

    /**
     * Returns the raw JSON value of [sourceLanguage].
     *
     * Unlike [sourceLanguage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceLanguage")
    @ExcludeMissing
    fun _sourceLanguage(): JsonField<String> = sourceLanguage

    /**
     * Returns the raw JSON value of [startColumn].
     *
     * Unlike [startColumn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startColumn") @ExcludeMissing fun _startColumn(): JsonField<Long> = startColumn

    /**
     * Returns the raw JSON value of [startLine].
     *
     * Unlike [startLine], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLine") @ExcludeMissing fun _startLine(): JsonField<Long> = startLine

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

        /** Returns a mutable builder for constructing an instance of [Region]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Region]. */
    class Builder internal constructor() {

        private var byteLength: JsonField<Long> = JsonMissing.of()
        private var byteOffset: JsonField<Long> = JsonMissing.of()
        private var charLength: JsonField<Long> = JsonMissing.of()
        private var charOffset: JsonField<Long> = JsonMissing.of()
        private var endColumn: JsonField<Long> = JsonMissing.of()
        private var endLine: JsonField<Long> = JsonMissing.of()
        private var message: JsonField<Message> = JsonMissing.of()
        private var properties: JsonField<PropertyBag> = JsonMissing.of()
        private var snippet: JsonField<ArtifactContent> = JsonMissing.of()
        private var sourceLanguage: JsonField<String> = JsonMissing.of()
        private var startColumn: JsonField<Long> = JsonMissing.of()
        private var startLine: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(region: Region) = apply {
            byteLength = region.byteLength
            byteOffset = region.byteOffset
            charLength = region.charLength
            charOffset = region.charOffset
            endColumn = region.endColumn
            endLine = region.endLine
            message = region.message
            properties = region.properties
            snippet = region.snippet
            sourceLanguage = region.sourceLanguage
            startColumn = region.startColumn
            startLine = region.startLine
            additionalProperties = region.additionalProperties.toMutableMap()
        }

        /** The length of the region in bytes. */
        fun byteLength(byteLength: Long) = byteLength(JsonField.of(byteLength))

        /**
         * Sets [Builder.byteLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.byteLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun byteLength(byteLength: JsonField<Long>) = apply { this.byteLength = byteLength }

        /**
         * The zero-based offset from the beginning of the artifact of the first byte in the region.
         */
        fun byteOffset(byteOffset: Long) = byteOffset(JsonField.of(byteOffset))

        /**
         * Sets [Builder.byteOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.byteOffset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun byteOffset(byteOffset: JsonField<Long>) = apply { this.byteOffset = byteOffset }

        /** The length of the region in characters. */
        fun charLength(charLength: Long) = charLength(JsonField.of(charLength))

        /**
         * Sets [Builder.charLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun charLength(charLength: JsonField<Long>) = apply { this.charLength = charLength }

        /**
         * The zero-based offset from the beginning of the artifact of the first character in the
         * region.
         */
        fun charOffset(charOffset: Long) = charOffset(JsonField.of(charOffset))

        /**
         * Sets [Builder.charOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.charOffset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun charOffset(charOffset: JsonField<Long>) = apply { this.charOffset = charOffset }

        /** The column number of the character following the end of the region. */
        fun endColumn(endColumn: Long) = endColumn(JsonField.of(endColumn))

        /**
         * Sets [Builder.endColumn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endColumn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endColumn(endColumn: JsonField<Long>) = apply { this.endColumn = endColumn }

        /** The line number of the last character in the region. */
        fun endLine(endLine: Long) = endLine(JsonField.of(endLine))

        /**
         * Sets [Builder.endLine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLine] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLine(endLine: JsonField<Long>) = apply { this.endLine = endLine }

        /** A message relevant to the region. */
        fun message(message: Message) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [Message] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<Message>) = apply { this.message = message }

        /** Key/value pairs that provide additional information about the region. */
        fun properties(properties: PropertyBag) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [PropertyBag] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<PropertyBag>) = apply { this.properties = properties }

        /** The portion of the artifact contents within the specified region. */
        fun snippet(snippet: ArtifactContent) = snippet(JsonField.of(snippet))

        /**
         * Sets [Builder.snippet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.snippet] with a well-typed [ArtifactContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun snippet(snippet: JsonField<ArtifactContent>) = apply { this.snippet = snippet }

        /**
         * Specifies the source language, if any, of the portion of the artifact specified by the
         * region object.
         */
        fun sourceLanguage(sourceLanguage: String) = sourceLanguage(JsonField.of(sourceLanguage))

        /**
         * Sets [Builder.sourceLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceLanguage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceLanguage(sourceLanguage: JsonField<String>) = apply {
            this.sourceLanguage = sourceLanguage
        }

        /** The column number of the first character in the region. */
        fun startColumn(startColumn: Long) = startColumn(JsonField.of(startColumn))

        /**
         * Sets [Builder.startColumn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startColumn] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startColumn(startColumn: JsonField<Long>) = apply { this.startColumn = startColumn }

        /** The line number of the first character in the region. */
        fun startLine(startLine: Long) = startLine(JsonField.of(startLine))

        /**
         * Sets [Builder.startLine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLine] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLine(startLine: JsonField<Long>) = apply { this.startLine = startLine }

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
         * Returns an immutable instance of [Region].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Region =
            Region(
                byteLength,
                byteOffset,
                charLength,
                charOffset,
                endColumn,
                endLine,
                message,
                properties,
                snippet,
                sourceLanguage,
                startColumn,
                startLine,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Region = apply {
        if (validated) {
            return@apply
        }

        byteLength()
        byteOffset()
        charLength()
        charOffset()
        endColumn()
        endLine()
        message().ifPresent { it.validate() }
        properties().ifPresent { it.validate() }
        snippet().ifPresent { it.validate() }
        sourceLanguage()
        startColumn()
        startLine()
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
        (if (byteLength.asKnown().isPresent) 1 else 0) +
            (if (byteOffset.asKnown().isPresent) 1 else 0) +
            (if (charLength.asKnown().isPresent) 1 else 0) +
            (if (charOffset.asKnown().isPresent) 1 else 0) +
            (if (endColumn.asKnown().isPresent) 1 else 0) +
            (if (endLine.asKnown().isPresent) 1 else 0) +
            (message.asKnown().getOrNull()?.validity() ?: 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (snippet.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sourceLanguage.asKnown().isPresent) 1 else 0) +
            (if (startColumn.asKnown().isPresent) 1 else 0) +
            (if (startLine.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Region && byteLength == other.byteLength && byteOffset == other.byteOffset && charLength == other.charLength && charOffset == other.charOffset && endColumn == other.endColumn && endLine == other.endLine && message == other.message && properties == other.properties && snippet == other.snippet && sourceLanguage == other.sourceLanguage && startColumn == other.startColumn && startLine == other.startLine && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(byteLength, byteOffset, charLength, charOffset, endColumn, endLine, message, properties, snippet, sourceLanguage, startColumn, startLine, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Region{byteLength=$byteLength, byteOffset=$byteOffset, charLength=$charLength, charOffset=$charOffset, endColumn=$endColumn, endLine=$endLine, message=$message, properties=$properties, snippet=$snippet, sourceLanguage=$sourceLanguage, startColumn=$startColumn, startLine=$startLine, additionalProperties=$additionalProperties}"
}
