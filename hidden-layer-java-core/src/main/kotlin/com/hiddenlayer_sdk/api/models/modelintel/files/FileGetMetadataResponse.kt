// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.modelintel.files

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class FileGetMetadataResponse
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val sha256: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val extension: JsonField<String>,
    private val fileType: JsonField<String>,
    private val mimeType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size_bytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extension") @ExcludeMissing extension: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_type") @ExcludeMissing fileType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mime_type") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
    ) : this(createdAt, sha256, sizeBytes, updatedAt, extension, fileType, mimeType, mutableMapOf())

    /**
     * Timestamp when the file was created
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * SHA256 hash of the file
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sha256(): String = sha256.getRequired("sha256")

    /**
     * File size in bytes
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sizeBytes(): Long = sizeBytes.getRequired("size_bytes")

    /**
     * Timestamp when the file was last updated
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * File extension
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extension(): Optional<String> = extension.getOptional("extension")

    /**
     * Type of the file
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileType(): Optional<String> = fileType.getOptional("file_type")

    /**
     * MIME type of the file
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mimeType(): Optional<String> = mimeType.getOptional("mime_type")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [sha256].
     *
     * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size_bytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [extension].
     *
     * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extension") @ExcludeMissing fun _extension(): JsonField<String> = extension

    /**
     * Returns the raw JSON value of [fileType].
     *
     * Unlike [fileType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_type") @ExcludeMissing fun _fileType(): JsonField<String> = fileType

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

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
         * Returns a mutable builder for constructing an instance of [FileGetMetadataResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .sha256()
         * .sizeBytes()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileGetMetadataResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var sha256: JsonField<String>? = null
        private var sizeBytes: JsonField<Long>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var extension: JsonField<String> = JsonMissing.of()
        private var fileType: JsonField<String> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileGetMetadataResponse: FileGetMetadataResponse) = apply {
            createdAt = fileGetMetadataResponse.createdAt
            sha256 = fileGetMetadataResponse.sha256
            sizeBytes = fileGetMetadataResponse.sizeBytes
            updatedAt = fileGetMetadataResponse.updatedAt
            extension = fileGetMetadataResponse.extension
            fileType = fileGetMetadataResponse.fileType
            mimeType = fileGetMetadataResponse.mimeType
            additionalProperties = fileGetMetadataResponse.additionalProperties.toMutableMap()
        }

        /** Timestamp when the file was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** SHA256 hash of the file */
        fun sha256(sha256: String) = sha256(JsonField.of(sha256))

        /**
         * Sets [Builder.sha256] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sha256] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

        /** File size in bytes */
        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        /** Timestamp when the file was last updated */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** File extension */
        fun extension(extension: String) = extension(JsonField.of(extension))

        /**
         * Sets [Builder.extension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extension] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extension(extension: JsonField<String>) = apply { this.extension = extension }

        /** Type of the file */
        fun fileType(fileType: String) = fileType(JsonField.of(fileType))

        /**
         * Sets [Builder.fileType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileType(fileType: JsonField<String>) = apply { this.fileType = fileType }

        /** MIME type of the file */
        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

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
         * Returns an immutable instance of [FileGetMetadataResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .sha256()
         * .sizeBytes()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileGetMetadataResponse =
            FileGetMetadataResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("sha256", sha256),
                checkRequired("sizeBytes", sizeBytes),
                checkRequired("updatedAt", updatedAt),
                extension,
                fileType,
                mimeType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileGetMetadataResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        sha256()
        sizeBytes()
        updatedAt()
        extension()
        fileType()
        mimeType()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (sha256.asKnown().isPresent) 1 else 0) +
            (if (sizeBytes.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (extension.asKnown().isPresent) 1 else 0) +
            (if (fileType.asKnown().isPresent) 1 else 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileGetMetadataResponse && createdAt == other.createdAt && sha256 == other.sha256 && sizeBytes == other.sizeBytes && updatedAt == other.updatedAt && extension == other.extension && fileType == other.fileType && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, sha256, sizeBytes, updatedAt, extension, fileType, mimeType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileGetMetadataResponse{createdAt=$createdAt, sha256=$sha256, sizeBytes=$sizeBytes, updatedAt=$updatedAt, extension=$extension, fileType=$fileType, mimeType=$mimeType, additionalProperties=$additionalProperties}"
}
