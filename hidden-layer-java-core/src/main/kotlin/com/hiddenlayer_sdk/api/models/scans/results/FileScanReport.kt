// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.results

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.Enum
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FileScanReport
private constructor(
    private val details: JsonField<Details>,
    private val endTime: JsonField<OffsetDateTime>,
    private val fileInstanceId: JsonField<String>,
    private val fileLocation: JsonField<String>,
    private val seen: JsonField<OffsetDateTime>,
    private val startTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val detections: JsonField<List<Detection>>,
    private val fileResults: JsonField<List<FileScanReport>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("details") @ExcludeMissing details: JsonField<Details> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("file_instance_id")
        @ExcludeMissing
        fileInstanceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_location")
        @ExcludeMissing
        fileLocation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("seen") @ExcludeMissing seen: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("detections")
        @ExcludeMissing
        detections: JsonField<List<Detection>> = JsonMissing.of(),
        @JsonProperty("file_results")
        @ExcludeMissing
        fileResults: JsonField<List<FileScanReport>> = JsonMissing.of(),
    ) : this(
        details,
        endTime,
        fileInstanceId,
        fileLocation,
        seen,
        startTime,
        status,
        detections,
        fileResults,
        mutableMapOf(),
    )

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun details(): Details = details.getRequired("details")

    /**
     * time the scan ended
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = endTime.getRequired("end_time")

    /**
     * unique ID of the file
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileInstanceId(): String = fileInstanceId.getRequired("file_instance_id")

    /**
     * full file path
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileLocation(): String = fileLocation.getRequired("file_location")

    /**
     * time the scan was seen at
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seen(): OffsetDateTime = seen.getRequired("seen")

    /**
     * time the scan started
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    /**
     * status of the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detections(): Optional<List<Detection>> = detections.getOptional("detections")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileResults(): Optional<List<FileScanReport>> = fileResults.getOptional("file_results")

    /**
     * Returns the raw JSON value of [details].
     *
     * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<Details> = details

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [fileInstanceId].
     *
     * Unlike [fileInstanceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_instance_id")
    @ExcludeMissing
    fun _fileInstanceId(): JsonField<String> = fileInstanceId

    /**
     * Returns the raw JSON value of [fileLocation].
     *
     * Unlike [fileLocation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_location")
    @ExcludeMissing
    fun _fileLocation(): JsonField<String> = fileLocation

    /**
     * Returns the raw JSON value of [seen].
     *
     * Unlike [seen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seen") @ExcludeMissing fun _seen(): JsonField<OffsetDateTime> = seen

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [detections].
     *
     * Unlike [detections], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detections")
    @ExcludeMissing
    fun _detections(): JsonField<List<Detection>> = detections

    /**
     * Returns the raw JSON value of [fileResults].
     *
     * Unlike [fileResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_results")
    @ExcludeMissing
    fun _fileResults(): JsonField<List<FileScanReport>> = fileResults

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
         * Returns a mutable builder for constructing an instance of [FileScanReport].
         *
         * The following fields are required:
         * ```java
         * .details()
         * .endTime()
         * .fileInstanceId()
         * .fileLocation()
         * .seen()
         * .startTime()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileScanReport]. */
    class Builder internal constructor() {

        private var details: JsonField<Details>? = null
        private var endTime: JsonField<OffsetDateTime>? = null
        private var fileInstanceId: JsonField<String>? = null
        private var fileLocation: JsonField<String>? = null
        private var seen: JsonField<OffsetDateTime>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var detections: JsonField<MutableList<Detection>>? = null
        private var fileResults: JsonField<MutableList<FileScanReport>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileScanReport: FileScanReport) = apply {
            details = fileScanReport.details
            endTime = fileScanReport.endTime
            fileInstanceId = fileScanReport.fileInstanceId
            fileLocation = fileScanReport.fileLocation
            seen = fileScanReport.seen
            startTime = fileScanReport.startTime
            status = fileScanReport.status
            detections = fileScanReport.detections.map { it.toMutableList() }
            fileResults = fileScanReport.fileResults.map { it.toMutableList() }
            additionalProperties = fileScanReport.additionalProperties.toMutableMap()
        }

        fun details(details: Details) = details(JsonField.of(details))

        /**
         * Sets [Builder.details] to an arbitrary JSON value.
         *
         * You should usually call [Builder.details] with a well-typed [Details] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun details(details: JsonField<Details>) = apply { this.details = details }

        /** time the scan ended */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /** unique ID of the file */
        fun fileInstanceId(fileInstanceId: String) = fileInstanceId(JsonField.of(fileInstanceId))

        /**
         * Sets [Builder.fileInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fileInstanceId(fileInstanceId: JsonField<String>) = apply {
            this.fileInstanceId = fileInstanceId
        }

        /** full file path */
        fun fileLocation(fileLocation: String) = fileLocation(JsonField.of(fileLocation))

        /**
         * Sets [Builder.fileLocation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileLocation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileLocation(fileLocation: JsonField<String>) = apply {
            this.fileLocation = fileLocation
        }

        /** time the scan was seen at */
        fun seen(seen: OffsetDateTime) = seen(JsonField.of(seen))

        /**
         * Sets [Builder.seen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seen] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun seen(seen: JsonField<OffsetDateTime>) = apply { this.seen = seen }

        /** time the scan started */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** status of the scan */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun detections(detections: List<Detection>) = detections(JsonField.of(detections))

        /**
         * Sets [Builder.detections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detections] with a well-typed `List<Detection>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun fileResults(fileResults: List<FileScanReport>) = fileResults(JsonField.of(fileResults))

        /**
         * Sets [Builder.fileResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileResults] with a well-typed `List<FileScanReport>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fileResults(fileResults: JsonField<List<FileScanReport>>) = apply {
            this.fileResults = fileResults.map { it.toMutableList() }
        }

        /**
         * Adds a single [FileScanReport] to [fileResults].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileResult(fileResult: FileScanReport) = apply {
            fileResults =
                (fileResults ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fileResults", it).add(fileResult)
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
         * Returns an immutable instance of [FileScanReport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .details()
         * .endTime()
         * .fileInstanceId()
         * .fileLocation()
         * .seen()
         * .startTime()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileScanReport =
            FileScanReport(
                checkRequired("details", details),
                checkRequired("endTime", endTime),
                checkRequired("fileInstanceId", fileInstanceId),
                checkRequired("fileLocation", fileLocation),
                checkRequired("seen", seen),
                checkRequired("startTime", startTime),
                checkRequired("status", status),
                (detections ?: JsonMissing.of()).map { it.toImmutable() },
                (fileResults ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileScanReport = apply {
        if (validated) {
            return@apply
        }

        details().validate()
        endTime()
        fileInstanceId()
        fileLocation()
        seen()
        startTime()
        status().validate()
        detections().ifPresent { it.forEach { it.validate() } }
        fileResults().ifPresent { it.forEach { it.validate() } }
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
        (details.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (fileInstanceId.asKnown().isPresent) 1 else 0) +
            (if (fileLocation.asKnown().isPresent) 1 else 0) +
            (if (seen.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (detections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (fileResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Details
    private constructor(
        private val estimatedTime: JsonField<String>,
        private val fileType: JsonField<String>,
        private val sha256: JsonField<String>,
        private val fileSize: JsonField<String>,
        private val fileSizeBytes: JsonField<Long>,
        private val fileTypeDetails: JsonField<FileTypeDetails>,
        private val md5: JsonField<String>,
        private val tlsh: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("estimated_time")
            @ExcludeMissing
            estimatedTime: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_type")
            @ExcludeMissing
            fileType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_size")
            @ExcludeMissing
            fileSize: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_size_bytes")
            @ExcludeMissing
            fileSizeBytes: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("file_type_details")
            @ExcludeMissing
            fileTypeDetails: JsonField<FileTypeDetails> = JsonMissing.of(),
            @JsonProperty("md5") @ExcludeMissing md5: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tlsh") @ExcludeMissing tlsh: JsonField<String> = JsonMissing.of(),
        ) : this(
            estimatedTime,
            fileType,
            sha256,
            fileSize,
            fileSizeBytes,
            fileTypeDetails,
            md5,
            tlsh,
            mutableMapOf(),
        )

        /**
         * estimated time to scan the file
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun estimatedTime(): String = estimatedTime.getRequired("estimated_time")

        /**
         * type of the file
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileType(): String = fileType.getRequired("file_type")

        /**
         * hexadecimal sha256 hash of file
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sha256(): String = sha256.getRequired("sha256")

        /**
         * size of the file in human readable format
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileSize(): Optional<String> = fileSize.getOptional("file_size")

        /**
         * size of the file in bytes
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileSizeBytes(): Optional<Long> = fileSizeBytes.getOptional("file_size_bytes")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileTypeDetails(): Optional<FileTypeDetails> =
            fileTypeDetails.getOptional("file_type_details")

        /**
         * hexadecimal md5 hash of file
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun md5(): Optional<String> = md5.getOptional("md5")

        /**
         * TLSH hash of file
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tlsh(): Optional<String> = tlsh.getOptional("tlsh")

        /**
         * Returns the raw JSON value of [estimatedTime].
         *
         * Unlike [estimatedTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("estimated_time")
        @ExcludeMissing
        fun _estimatedTime(): JsonField<String> = estimatedTime

        /**
         * Returns the raw JSON value of [fileType].
         *
         * Unlike [fileType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_type") @ExcludeMissing fun _fileType(): JsonField<String> = fileType

        /**
         * Returns the raw JSON value of [sha256].
         *
         * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

        /**
         * Returns the raw JSON value of [fileSize].
         *
         * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_size") @ExcludeMissing fun _fileSize(): JsonField<String> = fileSize

        /**
         * Returns the raw JSON value of [fileSizeBytes].
         *
         * Unlike [fileSizeBytes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("file_size_bytes")
        @ExcludeMissing
        fun _fileSizeBytes(): JsonField<Long> = fileSizeBytes

        /**
         * Returns the raw JSON value of [fileTypeDetails].
         *
         * Unlike [fileTypeDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("file_type_details")
        @ExcludeMissing
        fun _fileTypeDetails(): JsonField<FileTypeDetails> = fileTypeDetails

        /**
         * Returns the raw JSON value of [md5].
         *
         * Unlike [md5], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("md5") @ExcludeMissing fun _md5(): JsonField<String> = md5

        /**
         * Returns the raw JSON value of [tlsh].
         *
         * Unlike [tlsh], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tlsh") @ExcludeMissing fun _tlsh(): JsonField<String> = tlsh

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
             * Returns a mutable builder for constructing an instance of [Details].
             *
             * The following fields are required:
             * ```java
             * .estimatedTime()
             * .fileType()
             * .sha256()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Details]. */
        class Builder internal constructor() {

            private var estimatedTime: JsonField<String>? = null
            private var fileType: JsonField<String>? = null
            private var sha256: JsonField<String>? = null
            private var fileSize: JsonField<String> = JsonMissing.of()
            private var fileSizeBytes: JsonField<Long> = JsonMissing.of()
            private var fileTypeDetails: JsonField<FileTypeDetails> = JsonMissing.of()
            private var md5: JsonField<String> = JsonMissing.of()
            private var tlsh: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(details: Details) = apply {
                estimatedTime = details.estimatedTime
                fileType = details.fileType
                sha256 = details.sha256
                fileSize = details.fileSize
                fileSizeBytes = details.fileSizeBytes
                fileTypeDetails = details.fileTypeDetails
                md5 = details.md5
                tlsh = details.tlsh
                additionalProperties = details.additionalProperties.toMutableMap()
            }

            /** estimated time to scan the file */
            fun estimatedTime(estimatedTime: String) = estimatedTime(JsonField.of(estimatedTime))

            /**
             * Sets [Builder.estimatedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estimatedTime] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun estimatedTime(estimatedTime: JsonField<String>) = apply {
                this.estimatedTime = estimatedTime
            }

            /** type of the file */
            fun fileType(fileType: String) = fileType(JsonField.of(fileType))

            /**
             * Sets [Builder.fileType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileType(fileType: JsonField<String>) = apply { this.fileType = fileType }

            /** hexadecimal sha256 hash of file */
            fun sha256(sha256: String) = sha256(JsonField.of(sha256))

            /**
             * Sets [Builder.sha256] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sha256] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

            /** size of the file in human readable format */
            fun fileSize(fileSize: String) = fileSize(JsonField.of(fileSize))

            /**
             * Sets [Builder.fileSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileSize] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileSize(fileSize: JsonField<String>) = apply { this.fileSize = fileSize }

            /** size of the file in bytes */
            fun fileSizeBytes(fileSizeBytes: Long) = fileSizeBytes(JsonField.of(fileSizeBytes))

            /**
             * Sets [Builder.fileSizeBytes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileSizeBytes] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileSizeBytes(fileSizeBytes: JsonField<Long>) = apply {
                this.fileSizeBytes = fileSizeBytes
            }

            fun fileTypeDetails(fileTypeDetails: FileTypeDetails) =
                fileTypeDetails(JsonField.of(fileTypeDetails))

            /**
             * Sets [Builder.fileTypeDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileTypeDetails] with a well-typed [FileTypeDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fileTypeDetails(fileTypeDetails: JsonField<FileTypeDetails>) = apply {
                this.fileTypeDetails = fileTypeDetails
            }

            /** hexadecimal md5 hash of file */
            fun md5(md5: String) = md5(JsonField.of(md5))

            /**
             * Sets [Builder.md5] to an arbitrary JSON value.
             *
             * You should usually call [Builder.md5] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun md5(md5: JsonField<String>) = apply { this.md5 = md5 }

            /** TLSH hash of file */
            fun tlsh(tlsh: String) = tlsh(JsonField.of(tlsh))

            /**
             * Sets [Builder.tlsh] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tlsh] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tlsh(tlsh: JsonField<String>) = apply { this.tlsh = tlsh }

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
             * Returns an immutable instance of [Details].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .estimatedTime()
             * .fileType()
             * .sha256()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Details =
                Details(
                    checkRequired("estimatedTime", estimatedTime),
                    checkRequired("fileType", fileType),
                    checkRequired("sha256", sha256),
                    fileSize,
                    fileSizeBytes,
                    fileTypeDetails,
                    md5,
                    tlsh,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Details = apply {
            if (validated) {
                return@apply
            }

            estimatedTime()
            fileType()
            sha256()
            fileSize()
            fileSizeBytes()
            fileTypeDetails().ifPresent { it.validate() }
            md5()
            tlsh()
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
            (if (estimatedTime.asKnown().isPresent) 1 else 0) +
                (if (fileType.asKnown().isPresent) 1 else 0) +
                (if (sha256.asKnown().isPresent) 1 else 0) +
                (if (fileSize.asKnown().isPresent) 1 else 0) +
                (if (fileSizeBytes.asKnown().isPresent) 1 else 0) +
                (fileTypeDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (md5.asKnown().isPresent) 1 else 0) +
                (if (tlsh.asKnown().isPresent) 1 else 0)

        class FileTypeDetails
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

                /** Returns a mutable builder for constructing an instance of [FileTypeDetails]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FileTypeDetails]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(fileTypeDetails: FileTypeDetails) = apply {
                    additionalProperties = fileTypeDetails.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [FileTypeDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FileTypeDetails = FileTypeDetails(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): FileTypeDetails = apply {
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

                return /* spotless:off */ other is FileTypeDetails && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "FileTypeDetails{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Details && estimatedTime == other.estimatedTime && fileType == other.fileType && sha256 == other.sha256 && fileSize == other.fileSize && fileSizeBytes == other.fileSizeBytes && fileTypeDetails == other.fileTypeDetails && md5 == other.md5 && tlsh == other.tlsh && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(estimatedTime, fileType, sha256, fileSize, fileSizeBytes, fileTypeDetails, md5, tlsh, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Details{estimatedTime=$estimatedTime, fileType=$fileType, sha256=$sha256, fileSize=$fileSize, fileSizeBytes=$fileSizeBytes, fileTypeDetails=$fileTypeDetails, md5=$md5, tlsh=$tlsh, additionalProperties=$additionalProperties}"
    }

    /** status of the scan */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SKIPPED = of("skipped")

            @JvmField val PENDING = of("pending")

            @JvmField val RUNNING = of("running")

            @JvmField val DONE = of("done")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SKIPPED,
            PENDING,
            RUNNING,
            DONE,
            FAILED,
            CANCELED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SKIPPED,
            PENDING,
            RUNNING,
            DONE,
            FAILED,
            CANCELED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SKIPPED -> Value.SKIPPED
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
                DONE -> Value.DONE
                FAILED -> Value.FAILED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HiddenLayerInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SKIPPED -> Known.SKIPPED
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
                DONE -> Known.DONE
                FAILED -> Known.FAILED
                CANCELED -> Known.CANCELED
                else -> throw HiddenLayerInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HiddenLayerInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                HiddenLayerInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Detection
    private constructor(
        private val category: JsonField<String>,
        private val description: JsonField<String>,
        private val detectionId: JsonField<String>,
        private val mitreAtlas: JsonField<List<MitreAtlas>>,
        private val owasp: JsonField<List<String>>,
        private val ruleId: JsonField<String>,
        private val severity: JsonField<Severity>,
        private val cve: JsonField<List<String>>,
        private val cwe: JsonField<String>,
        private val cweHref: JsonField<String>,
        private val impact: JsonField<String>,
        private val likelihood: JsonField<String>,
        private val risk: JsonField<Risk>,
        private val ruleDetails: JsonField<List<RuleDetail>>,
        private val technicalBlogHref: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("detection_id")
            @ExcludeMissing
            detectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mitre_atlas")
            @ExcludeMissing
            mitreAtlas: JsonField<List<MitreAtlas>> = JsonMissing.of(),
            @JsonProperty("owasp")
            @ExcludeMissing
            owasp: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rule_id") @ExcludeMissing ruleId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("cve") @ExcludeMissing cve: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("cwe") @ExcludeMissing cwe: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cwe_href") @ExcludeMissing cweHref: JsonField<String> = JsonMissing.of(),
            @JsonProperty("impact") @ExcludeMissing impact: JsonField<String> = JsonMissing.of(),
            @JsonProperty("likelihood")
            @ExcludeMissing
            likelihood: JsonField<String> = JsonMissing.of(),
            @JsonProperty("risk") @ExcludeMissing risk: JsonField<Risk> = JsonMissing.of(),
            @JsonProperty("rule_details")
            @ExcludeMissing
            ruleDetails: JsonField<List<RuleDetail>> = JsonMissing.of(),
            @JsonProperty("technical_blog_href")
            @ExcludeMissing
            technicalBlogHref: JsonField<String> = JsonMissing.of(),
        ) : this(
            category,
            description,
            detectionId,
            mitreAtlas,
            owasp,
            ruleId,
            severity,
            cve,
            cwe,
            cweHref,
            impact,
            likelihood,
            risk,
            ruleDetails,
            technicalBlogHref,
            mutableMapOf(),
        )

        /**
         * Vulnerability category for the detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): String = category.getRequired("category")

        /**
         * detection description
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * unique identifier for the detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detectionId(): String = detectionId.getRequired("detection_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mitreAtlas(): List<MitreAtlas> = mitreAtlas.getRequired("mitre_atlas")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun owasp(): List<String> = owasp.getRequired("owasp")

        /**
         * unique identifier for the rule that sourced the detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ruleId(): String = ruleId.getRequired("rule_id")

        /**
         * detection severity
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun severity(): Severity = severity.getRequired("severity")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cve(): Optional<List<String>> = cve.getOptional("cve")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cwe(): Optional<String> = cwe.getOptional("cwe")

        /**
         * CWE URL for the detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cweHref(): Optional<String> = cweHref.getOptional("cwe_href")

        /**
         * detection impact
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun impact(): Optional<String> = impact.getOptional("impact")

        /**
         * detection likelihood
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun likelihood(): Optional<String> = likelihood.getOptional("likelihood")

        /**
         * detection risk
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun risk(): Optional<Risk> = risk.getOptional("risk")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ruleDetails(): Optional<List<RuleDetail>> = ruleDetails.getOptional("rule_details")

        /**
         * Hiddenlayer Technical Blog URL for the detection
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun technicalBlogHref(): Optional<String> =
            technicalBlogHref.getOptional("technical_blog_href")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [detectionId].
         *
         * Unlike [detectionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detection_id")
        @ExcludeMissing
        fun _detectionId(): JsonField<String> = detectionId

        /**
         * Returns the raw JSON value of [mitreAtlas].
         *
         * Unlike [mitreAtlas], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mitre_atlas")
        @ExcludeMissing
        fun _mitreAtlas(): JsonField<List<MitreAtlas>> = mitreAtlas

        /**
         * Returns the raw JSON value of [owasp].
         *
         * Unlike [owasp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owasp") @ExcludeMissing fun _owasp(): JsonField<List<String>> = owasp

        /**
         * Returns the raw JSON value of [ruleId].
         *
         * Unlike [ruleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_id") @ExcludeMissing fun _ruleId(): JsonField<String> = ruleId

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [cve].
         *
         * Unlike [cve], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cve") @ExcludeMissing fun _cve(): JsonField<List<String>> = cve

        /**
         * Returns the raw JSON value of [cwe].
         *
         * Unlike [cwe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cwe") @ExcludeMissing fun _cwe(): JsonField<String> = cwe

        /**
         * Returns the raw JSON value of [cweHref].
         *
         * Unlike [cweHref], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cwe_href") @ExcludeMissing fun _cweHref(): JsonField<String> = cweHref

        /**
         * Returns the raw JSON value of [impact].
         *
         * Unlike [impact], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("impact") @ExcludeMissing fun _impact(): JsonField<String> = impact

        /**
         * Returns the raw JSON value of [likelihood].
         *
         * Unlike [likelihood], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("likelihood")
        @ExcludeMissing
        fun _likelihood(): JsonField<String> = likelihood

        /**
         * Returns the raw JSON value of [risk].
         *
         * Unlike [risk], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("risk") @ExcludeMissing fun _risk(): JsonField<Risk> = risk

        /**
         * Returns the raw JSON value of [ruleDetails].
         *
         * Unlike [ruleDetails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_details")
        @ExcludeMissing
        fun _ruleDetails(): JsonField<List<RuleDetail>> = ruleDetails

        /**
         * Returns the raw JSON value of [technicalBlogHref].
         *
         * Unlike [technicalBlogHref], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("technical_blog_href")
        @ExcludeMissing
        fun _technicalBlogHref(): JsonField<String> = technicalBlogHref

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
             * .category()
             * .description()
             * .detectionId()
             * .mitreAtlas()
             * .owasp()
             * .ruleId()
             * .severity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Detection]. */
        class Builder internal constructor() {

            private var category: JsonField<String>? = null
            private var description: JsonField<String>? = null
            private var detectionId: JsonField<String>? = null
            private var mitreAtlas: JsonField<MutableList<MitreAtlas>>? = null
            private var owasp: JsonField<MutableList<String>>? = null
            private var ruleId: JsonField<String>? = null
            private var severity: JsonField<Severity>? = null
            private var cve: JsonField<MutableList<String>>? = null
            private var cwe: JsonField<String> = JsonMissing.of()
            private var cweHref: JsonField<String> = JsonMissing.of()
            private var impact: JsonField<String> = JsonMissing.of()
            private var likelihood: JsonField<String> = JsonMissing.of()
            private var risk: JsonField<Risk> = JsonMissing.of()
            private var ruleDetails: JsonField<MutableList<RuleDetail>>? = null
            private var technicalBlogHref: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(detection: Detection) = apply {
                category = detection.category
                description = detection.description
                detectionId = detection.detectionId
                mitreAtlas = detection.mitreAtlas.map { it.toMutableList() }
                owasp = detection.owasp.map { it.toMutableList() }
                ruleId = detection.ruleId
                severity = detection.severity
                cve = detection.cve.map { it.toMutableList() }
                cwe = detection.cwe
                cweHref = detection.cweHref
                impact = detection.impact
                likelihood = detection.likelihood
                risk = detection.risk
                ruleDetails = detection.ruleDetails.map { it.toMutableList() }
                technicalBlogHref = detection.technicalBlogHref
                additionalProperties = detection.additionalProperties.toMutableMap()
            }

            /** Vulnerability category for the detection */
            fun category(category: String) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<String>) = apply { this.category = category }

            /** detection description */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** unique identifier for the detection */
            fun detectionId(detectionId: String) = detectionId(JsonField.of(detectionId))

            /**
             * Sets [Builder.detectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectionId(detectionId: JsonField<String>) = apply {
                this.detectionId = detectionId
            }

            fun mitreAtlas(mitreAtlas: List<MitreAtlas>) = mitreAtlas(JsonField.of(mitreAtlas))

            /**
             * Sets [Builder.mitreAtlas] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mitreAtlas] with a well-typed `List<MitreAtlas>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mitreAtlas(mitreAtlas: JsonField<List<MitreAtlas>>) = apply {
                this.mitreAtlas = mitreAtlas.map { it.toMutableList() }
            }

            /**
             * Adds a single [MitreAtlas] to [Builder.mitreAtlas].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMitreAtlas(mitreAtlas: MitreAtlas) = apply {
                this.mitreAtlas =
                    (this.mitreAtlas ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mitreAtlas", it).add(mitreAtlas)
                    }
            }

            fun owasp(owasp: List<String>) = owasp(JsonField.of(owasp))

            /**
             * Sets [Builder.owasp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owasp] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owasp(owasp: JsonField<List<String>>) = apply {
                this.owasp = owasp.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.owasp].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOwasp(owasp: String) = apply {
                this.owasp =
                    (this.owasp ?: JsonField.of(mutableListOf())).also {
                        checkKnown("owasp", it).add(owasp)
                    }
            }

            /** unique identifier for the rule that sourced the detection */
            fun ruleId(ruleId: String) = ruleId(JsonField.of(ruleId))

            /**
             * Sets [Builder.ruleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

            /** detection severity */
            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            fun cve(cve: List<String>) = cve(JsonField.of(cve))

            /**
             * Sets [Builder.cve] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cve] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cve(cve: JsonField<List<String>>) = apply {
                this.cve = cve.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.cve].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCve(cve: String) = apply {
                this.cve =
                    (this.cve ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cve", it).add(cve)
                    }
            }

            fun cwe(cwe: String) = cwe(JsonField.of(cwe))

            /**
             * Sets [Builder.cwe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cwe] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cwe(cwe: JsonField<String>) = apply { this.cwe = cwe }

            /** CWE URL for the detection */
            fun cweHref(cweHref: String) = cweHref(JsonField.of(cweHref))

            /**
             * Sets [Builder.cweHref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cweHref] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cweHref(cweHref: JsonField<String>) = apply { this.cweHref = cweHref }

            /** detection impact */
            fun impact(impact: String) = impact(JsonField.of(impact))

            /**
             * Sets [Builder.impact] to an arbitrary JSON value.
             *
             * You should usually call [Builder.impact] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun impact(impact: JsonField<String>) = apply { this.impact = impact }

            /** detection likelihood */
            fun likelihood(likelihood: String) = likelihood(JsonField.of(likelihood))

            /**
             * Sets [Builder.likelihood] to an arbitrary JSON value.
             *
             * You should usually call [Builder.likelihood] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun likelihood(likelihood: JsonField<String>) = apply { this.likelihood = likelihood }

            /** detection risk */
            fun risk(risk: Risk) = risk(JsonField.of(risk))

            /**
             * Sets [Builder.risk] to an arbitrary JSON value.
             *
             * You should usually call [Builder.risk] with a well-typed [Risk] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun risk(risk: JsonField<Risk>) = apply { this.risk = risk }

            fun ruleDetails(ruleDetails: List<RuleDetail>) = ruleDetails(JsonField.of(ruleDetails))

            /**
             * Sets [Builder.ruleDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleDetails] with a well-typed `List<RuleDetail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ruleDetails(ruleDetails: JsonField<List<RuleDetail>>) = apply {
                this.ruleDetails = ruleDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [RuleDetail] to [ruleDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRuleDetail(ruleDetail: RuleDetail) = apply {
                ruleDetails =
                    (ruleDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ruleDetails", it).add(ruleDetail)
                    }
            }

            /** Hiddenlayer Technical Blog URL for the detection */
            fun technicalBlogHref(technicalBlogHref: String) =
                technicalBlogHref(JsonField.of(technicalBlogHref))

            /**
             * Sets [Builder.technicalBlogHref] to an arbitrary JSON value.
             *
             * You should usually call [Builder.technicalBlogHref] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun technicalBlogHref(technicalBlogHref: JsonField<String>) = apply {
                this.technicalBlogHref = technicalBlogHref
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
             * Returns an immutable instance of [Detection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * .description()
             * .detectionId()
             * .mitreAtlas()
             * .owasp()
             * .ruleId()
             * .severity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Detection =
                Detection(
                    checkRequired("category", category),
                    checkRequired("description", description),
                    checkRequired("detectionId", detectionId),
                    checkRequired("mitreAtlas", mitreAtlas).map { it.toImmutable() },
                    checkRequired("owasp", owasp).map { it.toImmutable() },
                    checkRequired("ruleId", ruleId),
                    checkRequired("severity", severity),
                    (cve ?: JsonMissing.of()).map { it.toImmutable() },
                    cwe,
                    cweHref,
                    impact,
                    likelihood,
                    risk,
                    (ruleDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    technicalBlogHref,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Detection = apply {
            if (validated) {
                return@apply
            }

            category()
            description()
            detectionId()
            mitreAtlas().forEach { it.validate() }
            owasp()
            ruleId()
            severity().validate()
            cve()
            cwe()
            cweHref()
            impact()
            likelihood()
            risk().ifPresent { it.validate() }
            ruleDetails().ifPresent { it.forEach { it.validate() } }
            technicalBlogHref()
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
            (if (category.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (detectionId.asKnown().isPresent) 1 else 0) +
                (mitreAtlas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (owasp.asKnown().getOrNull()?.size ?: 0) +
                (if (ruleId.asKnown().isPresent) 1 else 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (cve.asKnown().getOrNull()?.size ?: 0) +
                (if (cwe.asKnown().isPresent) 1 else 0) +
                (if (cweHref.asKnown().isPresent) 1 else 0) +
                (if (impact.asKnown().isPresent) 1 else 0) +
                (if (likelihood.asKnown().isPresent) 1 else 0) +
                (risk.asKnown().getOrNull()?.validity() ?: 0) +
                (ruleDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (technicalBlogHref.asKnown().isPresent) 1 else 0)

        class MitreAtlas
        private constructor(
            private val tactic: JsonField<String>,
            private val technique: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("tactic")
                @ExcludeMissing
                tactic: JsonField<String> = JsonMissing.of(),
                @JsonProperty("technique")
                @ExcludeMissing
                technique: JsonField<String> = JsonMissing.of(),
            ) : this(tactic, technique, mutableMapOf())

            /**
             * MITRE Atlas Tactic
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tactic(): Optional<String> = tactic.getOptional("tactic")

            /**
             * MITRE Atlas Technique
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun technique(): Optional<String> = technique.getOptional("technique")

            /**
             * Returns the raw JSON value of [tactic].
             *
             * Unlike [tactic], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tactic") @ExcludeMissing fun _tactic(): JsonField<String> = tactic

            /**
             * Returns the raw JSON value of [technique].
             *
             * Unlike [technique], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("technique")
            @ExcludeMissing
            fun _technique(): JsonField<String> = technique

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

                /** Returns a mutable builder for constructing an instance of [MitreAtlas]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MitreAtlas]. */
            class Builder internal constructor() {

                private var tactic: JsonField<String> = JsonMissing.of()
                private var technique: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mitreAtlas: MitreAtlas) = apply {
                    tactic = mitreAtlas.tactic
                    technique = mitreAtlas.technique
                    additionalProperties = mitreAtlas.additionalProperties.toMutableMap()
                }

                /** MITRE Atlas Tactic */
                fun tactic(tactic: String) = tactic(JsonField.of(tactic))

                /**
                 * Sets [Builder.tactic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tactic] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tactic(tactic: JsonField<String>) = apply { this.tactic = tactic }

                /** MITRE Atlas Technique */
                fun technique(technique: String) = technique(JsonField.of(technique))

                /**
                 * Sets [Builder.technique] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.technique] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun technique(technique: JsonField<String>) = apply { this.technique = technique }

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
                 * Returns an immutable instance of [MitreAtlas].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MitreAtlas =
                    MitreAtlas(tactic, technique, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): MitreAtlas = apply {
                if (validated) {
                    return@apply
                }

                tactic()
                technique()
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
                (if (tactic.asKnown().isPresent) 1 else 0) +
                    (if (technique.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MitreAtlas && tactic == other.tactic && technique == other.technique && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tactic, technique, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MitreAtlas{tactic=$tactic, technique=$technique, additionalProperties=$additionalProperties}"
        }

        /** detection severity */
        class Severity @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val LOW = of("low")

                @JvmField val MEDIUM = of("medium")

                @JvmField val HIGH = of("high")

                @JvmField val CRITICAL = of("critical")

                @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
            }

            /** An enum containing [Severity]'s known values. */
            enum class Known {
                LOW,
                MEDIUM,
                HIGH,
                CRITICAL,
            }

            /**
             * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Severity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                CRITICAL,
                /**
                 * An enum member indicating that [Severity] was instantiated with an unknown value.
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
                    else -> throw HiddenLayerInvalidDataException("Unknown Severity: $value")
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

            fun validate(): Severity = apply {
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

                return /* spotless:off */ other is Severity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** detection risk */
        class Risk @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val MALICIOUS = of("MALICIOUS")

                @JvmField val SUSPICIOUS = of("SUSPICIOUS")

                @JvmField val BENIGN = of("BENIGN")

                @JvmStatic fun of(value: String) = Risk(JsonField.of(value))
            }

            /** An enum containing [Risk]'s known values. */
            enum class Known {
                MALICIOUS,
                SUSPICIOUS,
                BENIGN,
            }

            /**
             * An enum containing [Risk]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Risk] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MALICIOUS,
                SUSPICIOUS,
                BENIGN,
                /** An enum member indicating that [Risk] was instantiated with an unknown value. */
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
                    MALICIOUS -> Value.MALICIOUS
                    SUSPICIOUS -> Value.SUSPICIOUS
                    BENIGN -> Value.BENIGN
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
                    MALICIOUS -> Known.MALICIOUS
                    SUSPICIOUS -> Known.SUSPICIOUS
                    BENIGN -> Known.BENIGN
                    else -> throw HiddenLayerInvalidDataException("Unknown Risk: $value")
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

            fun validate(): Risk = apply {
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

                return /* spotless:off */ other is Risk && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RuleDetail
        private constructor(
            private val description: JsonField<String>,
            private val status: JsonField<Status>,
            private val statusAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("status_at")
                @ExcludeMissing
                statusAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(description, status, statusAt, mutableMapOf())

            /**
             * description of the deprecation
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * status
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * date-time when the details entry was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun statusAt(): Optional<OffsetDateTime> = statusAt.getOptional("status_at")

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
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [statusAt].
             *
             * Unlike [statusAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("status_at")
            @ExcludeMissing
            fun _statusAt(): JsonField<OffsetDateTime> = statusAt

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

                /** Returns a mutable builder for constructing an instance of [RuleDetail]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuleDetail]. */
            class Builder internal constructor() {

                private var description: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var statusAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleDetail: RuleDetail) = apply {
                    description = ruleDetail.description
                    status = ruleDetail.status
                    statusAt = ruleDetail.statusAt
                    additionalProperties = ruleDetail.additionalProperties.toMutableMap()
                }

                /** description of the deprecation */
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

                /** status */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** date-time when the details entry was created */
                fun statusAt(statusAt: OffsetDateTime) = statusAt(JsonField.of(statusAt))

                /**
                 * Sets [Builder.statusAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.statusAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun statusAt(statusAt: JsonField<OffsetDateTime>) = apply {
                    this.statusAt = statusAt
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
                 * Returns an immutable instance of [RuleDetail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RuleDetail =
                    RuleDetail(description, status, statusAt, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): RuleDetail = apply {
                if (validated) {
                    return@apply
                }

                description()
                status().ifPresent { it.validate() }
                statusAt()
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
                (if (description.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (statusAt.asKnown().isPresent) 1 else 0)

            /** status */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CREATED = of("created")

                    @JvmField val DEPRECATED = of("deprecated")

                    @JvmField val UPDATED = of("updated")

                    @JvmField val SUPERSEDED = of("superseded")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    CREATED,
                    DEPRECATED,
                    UPDATED,
                    SUPERSEDED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATED,
                    DEPRECATED,
                    UPDATED,
                    SUPERSEDED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
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
                        CREATED -> Value.CREATED
                        DEPRECATED -> Value.DEPRECATED
                        UPDATED -> Value.UPDATED
                        SUPERSEDED -> Value.SUPERSEDED
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
                        CREATED -> Known.CREATED
                        DEPRECATED -> Known.DEPRECATED
                        UPDATED -> Known.UPDATED
                        SUPERSEDED -> Known.SUPERSEDED
                        else -> throw HiddenLayerInvalidDataException("Unknown Status: $value")
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

                fun validate(): Status = apply {
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

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RuleDetail && description == other.description && status == other.status && statusAt == other.statusAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(description, status, statusAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleDetail{description=$description, status=$status, statusAt=$statusAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Detection && category == other.category && description == other.description && detectionId == other.detectionId && mitreAtlas == other.mitreAtlas && owasp == other.owasp && ruleId == other.ruleId && severity == other.severity && cve == other.cve && cwe == other.cwe && cweHref == other.cweHref && impact == other.impact && likelihood == other.likelihood && risk == other.risk && ruleDetails == other.ruleDetails && technicalBlogHref == other.technicalBlogHref && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, description, detectionId, mitreAtlas, owasp, ruleId, severity, cve, cwe, cweHref, impact, likelihood, risk, ruleDetails, technicalBlogHref, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Detection{category=$category, description=$description, detectionId=$detectionId, mitreAtlas=$mitreAtlas, owasp=$owasp, ruleId=$ruleId, severity=$severity, cve=$cve, cwe=$cwe, cweHref=$cweHref, impact=$impact, likelihood=$likelihood, risk=$risk, ruleDetails=$ruleDetails, technicalBlogHref=$technicalBlogHref, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileScanReport && details == other.details && endTime == other.endTime && fileInstanceId == other.fileInstanceId && fileLocation == other.fileLocation && seen == other.seen && startTime == other.startTime && status == other.status && detections == other.detections && fileResults == other.fileResults && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(details, endTime, fileInstanceId, fileLocation, seen, startTime, status, detections, fileResults, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileScanReport{details=$details, endTime=$endTime, fileInstanceId=$fileInstanceId, fileLocation=$fileLocation, seen=$seen, startTime=$startTime, status=$status, detections=$detections, fileResults=$fileResults, additionalProperties=$additionalProperties}"
}
