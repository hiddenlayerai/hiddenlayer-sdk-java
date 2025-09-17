// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.upload.file

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

class FileAddResponse
private constructor(
    private val parts: JsonField<List<Part>>,
    private val uploadId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("parts") @ExcludeMissing parts: JsonField<List<Part>> = JsonMissing.of(),
        @JsonProperty("upload_id") @ExcludeMissing uploadId: JsonField<String> = JsonMissing.of(),
    ) : this(parts, uploadId, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<Part> = parts.getRequired("parts")

    /**
     * UploadId for the current file
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadId(): String = uploadId.getRequired("upload_id")

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<Part>> = parts

    /**
     * Returns the raw JSON value of [uploadId].
     *
     * Unlike [uploadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upload_id") @ExcludeMissing fun _uploadId(): JsonField<String> = uploadId

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
         * Returns a mutable builder for constructing an instance of [FileAddResponse].
         *
         * The following fields are required:
         * ```java
         * .parts()
         * .uploadId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileAddResponse]. */
    class Builder internal constructor() {

        private var parts: JsonField<MutableList<Part>>? = null
        private var uploadId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileAddResponse: FileAddResponse) = apply {
            parts = fileAddResponse.parts.map { it.toMutableList() }
            uploadId = fileAddResponse.uploadId
            additionalProperties = fileAddResponse.additionalProperties.toMutableMap()
        }

        fun parts(parts: List<Part>) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<Part>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parts(parts: JsonField<List<Part>>) = apply {
            this.parts = parts.map { it.toMutableList() }
        }

        /**
         * Adds a single [Part] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: Part) = apply {
            parts =
                (parts ?: JsonField.of(mutableListOf())).also { checkKnown("parts", it).add(part) }
        }

        /** UploadId for the current file */
        fun uploadId(uploadId: String) = uploadId(JsonField.of(uploadId))

        /**
         * Sets [Builder.uploadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uploadId(uploadId: JsonField<String>) = apply { this.uploadId = uploadId }

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
         * Returns an immutable instance of [FileAddResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .parts()
         * .uploadId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileAddResponse =
            FileAddResponse(
                checkRequired("parts", parts).map { it.toImmutable() },
                checkRequired("uploadId", uploadId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileAddResponse = apply {
        if (validated) {
            return@apply
        }

        parts().forEach { it.validate() }
        uploadId()
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
        (parts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (uploadId.asKnown().isPresent) 1 else 0)

    class Part
    private constructor(
        private val endOffset: JsonField<Long>,
        private val partNumber: JsonField<Long>,
        private val startOffset: JsonField<Long>,
        private val uploadUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_offset")
            @ExcludeMissing
            endOffset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("part_number")
            @ExcludeMissing
            partNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("start_offset")
            @ExcludeMissing
            startOffset: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("upload_url")
            @ExcludeMissing
            uploadUrl: JsonField<String> = JsonMissing.of(),
        ) : this(endOffset, partNumber, startOffset, uploadUrl, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endOffset(): Optional<Long> = endOffset.getOptional("end_offset")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun partNumber(): Optional<Long> = partNumber.getOptional("part_number")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startOffset(): Optional<Long> = startOffset.getOptional("start_offset")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uploadUrl(): Optional<String> = uploadUrl.getOptional("upload_url")

        /**
         * Returns the raw JSON value of [endOffset].
         *
         * Unlike [endOffset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_offset") @ExcludeMissing fun _endOffset(): JsonField<Long> = endOffset

        /**
         * Returns the raw JSON value of [partNumber].
         *
         * Unlike [partNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("part_number") @ExcludeMissing fun _partNumber(): JsonField<Long> = partNumber

        /**
         * Returns the raw JSON value of [startOffset].
         *
         * Unlike [startOffset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_offset")
        @ExcludeMissing
        fun _startOffset(): JsonField<Long> = startOffset

        /**
         * Returns the raw JSON value of [uploadUrl].
         *
         * Unlike [uploadUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("upload_url") @ExcludeMissing fun _uploadUrl(): JsonField<String> = uploadUrl

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

            /** Returns a mutable builder for constructing an instance of [Part]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Part]. */
        class Builder internal constructor() {

            private var endOffset: JsonField<Long> = JsonMissing.of()
            private var partNumber: JsonField<Long> = JsonMissing.of()
            private var startOffset: JsonField<Long> = JsonMissing.of()
            private var uploadUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(part: Part) = apply {
                endOffset = part.endOffset
                partNumber = part.partNumber
                startOffset = part.startOffset
                uploadUrl = part.uploadUrl
                additionalProperties = part.additionalProperties.toMutableMap()
            }

            fun endOffset(endOffset: Long) = endOffset(JsonField.of(endOffset))

            /**
             * Sets [Builder.endOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endOffset] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endOffset(endOffset: JsonField<Long>) = apply { this.endOffset = endOffset }

            fun partNumber(partNumber: Long) = partNumber(JsonField.of(partNumber))

            /**
             * Sets [Builder.partNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partNumber] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partNumber(partNumber: JsonField<Long>) = apply { this.partNumber = partNumber }

            fun startOffset(startOffset: Long) = startOffset(JsonField.of(startOffset))

            /**
             * Sets [Builder.startOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startOffset] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startOffset(startOffset: JsonField<Long>) = apply { this.startOffset = startOffset }

            fun uploadUrl(uploadUrl: String) = uploadUrl(JsonField.of(uploadUrl))

            /**
             * Sets [Builder.uploadUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadUrl(uploadUrl: JsonField<String>) = apply { this.uploadUrl = uploadUrl }

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
             * Returns an immutable instance of [Part].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Part =
                Part(
                    endOffset,
                    partNumber,
                    startOffset,
                    uploadUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Part = apply {
            if (validated) {
                return@apply
            }

            endOffset()
            partNumber()
            startOffset()
            uploadUrl()
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
            (if (endOffset.asKnown().isPresent) 1 else 0) +
                (if (partNumber.asKnown().isPresent) 1 else 0) +
                (if (startOffset.asKnown().isPresent) 1 else 0) +
                (if (uploadUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Part &&
                endOffset == other.endOffset &&
                partNumber == other.partNumber &&
                startOffset == other.startOffset &&
                uploadUrl == other.uploadUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endOffset, partNumber, startOffset, uploadUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Part{endOffset=$endOffset, partNumber=$partNumber, startOffset=$startOffset, uploadUrl=$uploadUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileAddResponse &&
            parts == other.parts &&
            uploadId == other.uploadId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(parts, uploadId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileAddResponse{parts=$parts, uploadId=$uploadId, additionalProperties=$additionalProperties}"
}
