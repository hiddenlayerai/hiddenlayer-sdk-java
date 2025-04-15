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

class ScanReport
private constructor(
    private val detectionCount: JsonField<Long>,
    private val fileCount: JsonField<Long>,
    private val filesWithDetectionsCount: JsonField<Long>,
    private val inventory: JsonField<Inventory>,
    private val scanId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val version: JsonField<String>,
    private val detectionCategories: JsonField<List<String>>,
    private val endTime: JsonField<OffsetDateTime>,
    private val fileResults: JsonField<List<FileScanReport>>,
    private val severity: JsonField<Severity>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("detection_count")
        @ExcludeMissing
        detectionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_count") @ExcludeMissing fileCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("files_with_detections_count")
        @ExcludeMissing
        filesWithDetectionsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inventory")
        @ExcludeMissing
        inventory: JsonField<Inventory> = JsonMissing.of(),
        @JsonProperty("scan_id") @ExcludeMissing scanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
        @JsonProperty("detection_categories")
        @ExcludeMissing
        detectionCategories: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("file_results")
        @ExcludeMissing
        fileResults: JsonField<List<FileScanReport>> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
    ) : this(
        detectionCount,
        fileCount,
        filesWithDetectionsCount,
        inventory,
        scanId,
        startTime,
        status,
        version,
        detectionCategories,
        endTime,
        fileResults,
        severity,
        mutableMapOf(),
    )

    /**
     * number of detections found
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun detectionCount(): Long = detectionCount.getRequired("detection_count")

    /**
     * number of files scanned
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileCount(): Long = fileCount.getRequired("file_count")

    /**
     * number of files with detections found
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filesWithDetectionsCount(): Long =
        filesWithDetectionsCount.getRequired("files_with_detections_count")

    /**
     * information about model and version that this scan relates to
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inventory(): Inventory = inventory.getRequired("inventory")

    /**
     * unique identifier for the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scanId(): String = scanId.getRequired("scan_id")

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
     * scanner version
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): String = version.getRequired("version")

    /**
     * list of detection categories found
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detectionCategories(): Optional<List<String>> =
        detectionCategories.getOptional("detection_categories")

    /**
     * time the scan ended
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileResults(): Optional<List<FileScanReport>> = fileResults.getOptional("file_results")

    /**
     * detection severity
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<Severity> = severity.getOptional("severity")

    /**
     * Returns the raw JSON value of [detectionCount].
     *
     * Unlike [detectionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detection_count")
    @ExcludeMissing
    fun _detectionCount(): JsonField<Long> = detectionCount

    /**
     * Returns the raw JSON value of [fileCount].
     *
     * Unlike [fileCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_count") @ExcludeMissing fun _fileCount(): JsonField<Long> = fileCount

    /**
     * Returns the raw JSON value of [filesWithDetectionsCount].
     *
     * Unlike [filesWithDetectionsCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("files_with_detections_count")
    @ExcludeMissing
    fun _filesWithDetectionsCount(): JsonField<Long> = filesWithDetectionsCount

    /**
     * Returns the raw JSON value of [inventory].
     *
     * Unlike [inventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inventory") @ExcludeMissing fun _inventory(): JsonField<Inventory> = inventory

    /**
     * Returns the raw JSON value of [scanId].
     *
     * Unlike [scanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scan_id") @ExcludeMissing fun _scanId(): JsonField<String> = scanId

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
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

    /**
     * Returns the raw JSON value of [detectionCategories].
     *
     * Unlike [detectionCategories], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("detection_categories")
    @ExcludeMissing
    fun _detectionCategories(): JsonField<List<String>> = detectionCategories

    /**
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [fileResults].
     *
     * Unlike [fileResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_results")
    @ExcludeMissing
    fun _fileResults(): JsonField<List<FileScanReport>> = fileResults

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

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
         * Returns a mutable builder for constructing an instance of [ScanReport].
         *
         * The following fields are required:
         * ```java
         * .detectionCount()
         * .fileCount()
         * .filesWithDetectionsCount()
         * .inventory()
         * .scanId()
         * .startTime()
         * .status()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScanReport]. */
    class Builder internal constructor() {

        private var detectionCount: JsonField<Long>? = null
        private var fileCount: JsonField<Long>? = null
        private var filesWithDetectionsCount: JsonField<Long>? = null
        private var inventory: JsonField<Inventory>? = null
        private var scanId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var version: JsonField<String>? = null
        private var detectionCategories: JsonField<MutableList<String>>? = null
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fileResults: JsonField<MutableList<FileScanReport>>? = null
        private var severity: JsonField<Severity> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scanReport: ScanReport) = apply {
            detectionCount = scanReport.detectionCount
            fileCount = scanReport.fileCount
            filesWithDetectionsCount = scanReport.filesWithDetectionsCount
            inventory = scanReport.inventory
            scanId = scanReport.scanId
            startTime = scanReport.startTime
            status = scanReport.status
            version = scanReport.version
            detectionCategories = scanReport.detectionCategories.map { it.toMutableList() }
            endTime = scanReport.endTime
            fileResults = scanReport.fileResults.map { it.toMutableList() }
            severity = scanReport.severity
            additionalProperties = scanReport.additionalProperties.toMutableMap()
        }

        /** number of detections found */
        fun detectionCount(detectionCount: Long) = detectionCount(JsonField.of(detectionCount))

        /**
         * Sets [Builder.detectionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectionCount(detectionCount: JsonField<Long>) = apply {
            this.detectionCount = detectionCount
        }

        /** number of files scanned */
        fun fileCount(fileCount: Long) = fileCount(JsonField.of(fileCount))

        /**
         * Sets [Builder.fileCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileCount(fileCount: JsonField<Long>) = apply { this.fileCount = fileCount }

        /** number of files with detections found */
        fun filesWithDetectionsCount(filesWithDetectionsCount: Long) =
            filesWithDetectionsCount(JsonField.of(filesWithDetectionsCount))

        /**
         * Sets [Builder.filesWithDetectionsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesWithDetectionsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filesWithDetectionsCount(filesWithDetectionsCount: JsonField<Long>) = apply {
            this.filesWithDetectionsCount = filesWithDetectionsCount
        }

        /** information about model and version that this scan relates to */
        fun inventory(inventory: Inventory) = inventory(JsonField.of(inventory))

        /**
         * Sets [Builder.inventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inventory] with a well-typed [Inventory] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inventory(inventory: JsonField<Inventory>) = apply { this.inventory = inventory }

        /** unique identifier for the scan */
        fun scanId(scanId: String) = scanId(JsonField.of(scanId))

        /**
         * Sets [Builder.scanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanId(scanId: JsonField<String>) = apply { this.scanId = scanId }

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

        /** scanner version */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** list of detection categories found */
        fun detectionCategories(detectionCategories: List<String>) =
            detectionCategories(JsonField.of(detectionCategories))

        /**
         * Sets [Builder.detectionCategories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectionCategories] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun detectionCategories(detectionCategories: JsonField<List<String>>) = apply {
            this.detectionCategories = detectionCategories.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [detectionCategories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDetectionCategory(detectionCategory: String) = apply {
            detectionCategories =
                (detectionCategories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("detectionCategories", it).add(detectionCategory)
                }
        }

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

        /** detection severity */
        fun severity(severity: Severity) = severity(JsonField.of(severity))

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

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
         * Returns an immutable instance of [ScanReport].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .detectionCount()
         * .fileCount()
         * .filesWithDetectionsCount()
         * .inventory()
         * .scanId()
         * .startTime()
         * .status()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScanReport =
            ScanReport(
                checkRequired("detectionCount", detectionCount),
                checkRequired("fileCount", fileCount),
                checkRequired("filesWithDetectionsCount", filesWithDetectionsCount),
                checkRequired("inventory", inventory),
                checkRequired("scanId", scanId),
                checkRequired("startTime", startTime),
                checkRequired("status", status),
                checkRequired("version", version),
                (detectionCategories ?: JsonMissing.of()).map { it.toImmutable() },
                endTime,
                (fileResults ?: JsonMissing.of()).map { it.toImmutable() },
                severity,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScanReport = apply {
        if (validated) {
            return@apply
        }

        detectionCount()
        fileCount()
        filesWithDetectionsCount()
        inventory().validate()
        scanId()
        startTime()
        status().validate()
        version()
        detectionCategories()
        endTime()
        fileResults().ifPresent { it.forEach { it.validate() } }
        severity().ifPresent { it.validate() }
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
        (if (detectionCount.asKnown().isPresent) 1 else 0) +
            (if (fileCount.asKnown().isPresent) 1 else 0) +
            (if (filesWithDetectionsCount.asKnown().isPresent) 1 else 0) +
            (inventory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scanId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (detectionCategories.asKnown().getOrNull()?.size ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (fileResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0)

    /** information about model and version that this scan relates to */
    class Inventory
    private constructor(
        private val modelId: JsonField<String>,
        private val modelName: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val modelVersionId: JsonField<String>,
        private val requestedScanLocation: JsonField<String>,
        private val modelSource: JsonField<String>,
        private val requestingEntity: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_version")
            @ExcludeMissing
            modelVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_version_id")
            @ExcludeMissing
            modelVersionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_scan_location")
            @ExcludeMissing
            requestedScanLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_source")
            @ExcludeMissing
            modelSource: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requesting_entity")
            @ExcludeMissing
            requestingEntity: JsonField<String> = JsonMissing.of(),
        ) : this(
            modelId,
            modelName,
            modelVersion,
            modelVersionId,
            requestedScanLocation,
            modelSource,
            requestingEntity,
            mutableMapOf(),
        )

        /**
         * Unique identifier for the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /**
         * name of the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("model_name")

        /**
         * version of the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelVersion(): String = modelVersion.getRequired("model_version")

        /**
         * unique identifier for the model version
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelVersionId(): String = modelVersionId.getRequired("model_version_id")

        /**
         * Location to be scanned
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedScanLocation(): String =
            requestedScanLocation.getRequired("requested_scan_location")

        /**
         * source (provider) info
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelSource(): Optional<String> = modelSource.getOptional("model_source")

        /**
         * Entity that requested the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requestingEntity(): Optional<String> = requestingEntity.getOptional("requesting_entity")

        /**
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_name") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [modelVersion].
         *
         * Unlike [modelVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_version")
        @ExcludeMissing
        fun _modelVersion(): JsonField<String> = modelVersion

        /**
         * Returns the raw JSON value of [modelVersionId].
         *
         * Unlike [modelVersionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("model_version_id")
        @ExcludeMissing
        fun _modelVersionId(): JsonField<String> = modelVersionId

        /**
         * Returns the raw JSON value of [requestedScanLocation].
         *
         * Unlike [requestedScanLocation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requested_scan_location")
        @ExcludeMissing
        fun _requestedScanLocation(): JsonField<String> = requestedScanLocation

        /**
         * Returns the raw JSON value of [modelSource].
         *
         * Unlike [modelSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_source")
        @ExcludeMissing
        fun _modelSource(): JsonField<String> = modelSource

        /**
         * Returns the raw JSON value of [requestingEntity].
         *
         * Unlike [requestingEntity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requesting_entity")
        @ExcludeMissing
        fun _requestingEntity(): JsonField<String> = requestingEntity

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
             * Returns a mutable builder for constructing an instance of [Inventory].
             *
             * The following fields are required:
             * ```java
             * .modelId()
             * .modelName()
             * .modelVersion()
             * .modelVersionId()
             * .requestedScanLocation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inventory]. */
        class Builder internal constructor() {

            private var modelId: JsonField<String>? = null
            private var modelName: JsonField<String>? = null
            private var modelVersion: JsonField<String>? = null
            private var modelVersionId: JsonField<String>? = null
            private var requestedScanLocation: JsonField<String>? = null
            private var modelSource: JsonField<String> = JsonMissing.of()
            private var requestingEntity: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inventory: Inventory) = apply {
                modelId = inventory.modelId
                modelName = inventory.modelName
                modelVersion = inventory.modelVersion
                modelVersionId = inventory.modelVersionId
                requestedScanLocation = inventory.requestedScanLocation
                modelSource = inventory.modelSource
                requestingEntity = inventory.requestingEntity
                additionalProperties = inventory.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the model */
            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            /** name of the model */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** version of the model */
            fun modelVersion(modelVersion: String) = modelVersion(JsonField.of(modelVersion))

            /**
             * Sets [Builder.modelVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelVersion(modelVersion: JsonField<String>) = apply {
                this.modelVersion = modelVersion
            }

            /** unique identifier for the model version */
            fun modelVersionId(modelVersionId: String) =
                modelVersionId(JsonField.of(modelVersionId))

            /**
             * Sets [Builder.modelVersionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelVersionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelVersionId(modelVersionId: JsonField<String>) = apply {
                this.modelVersionId = modelVersionId
            }

            /** Location to be scanned */
            fun requestedScanLocation(requestedScanLocation: String) =
                requestedScanLocation(JsonField.of(requestedScanLocation))

            /**
             * Sets [Builder.requestedScanLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedScanLocation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestedScanLocation(requestedScanLocation: JsonField<String>) = apply {
                this.requestedScanLocation = requestedScanLocation
            }

            /** source (provider) info */
            fun modelSource(modelSource: String) = modelSource(JsonField.of(modelSource))

            /**
             * Sets [Builder.modelSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelSource] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelSource(modelSource: JsonField<String>) = apply {
                this.modelSource = modelSource
            }

            /** Entity that requested the scan */
            fun requestingEntity(requestingEntity: String) =
                requestingEntity(JsonField.of(requestingEntity))

            /**
             * Sets [Builder.requestingEntity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestingEntity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestingEntity(requestingEntity: JsonField<String>) = apply {
                this.requestingEntity = requestingEntity
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
             * Returns an immutable instance of [Inventory].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .modelId()
             * .modelName()
             * .modelVersion()
             * .modelVersionId()
             * .requestedScanLocation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Inventory =
                Inventory(
                    checkRequired("modelId", modelId),
                    checkRequired("modelName", modelName),
                    checkRequired("modelVersion", modelVersion),
                    checkRequired("modelVersionId", modelVersionId),
                    checkRequired("requestedScanLocation", requestedScanLocation),
                    modelSource,
                    requestingEntity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Inventory = apply {
            if (validated) {
                return@apply
            }

            modelId()
            modelName()
            modelVersion()
            modelVersionId()
            requestedScanLocation()
            modelSource()
            requestingEntity()
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
            (if (modelId.asKnown().isPresent) 1 else 0) +
                (if (modelName.asKnown().isPresent) 1 else 0) +
                (if (modelVersion.asKnown().isPresent) 1 else 0) +
                (if (modelVersionId.asKnown().isPresent) 1 else 0) +
                (if (requestedScanLocation.asKnown().isPresent) 1 else 0) +
                (if (modelSource.asKnown().isPresent) 1 else 0) +
                (if (requestingEntity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Inventory && modelId == other.modelId && modelName == other.modelName && modelVersion == other.modelVersion && modelVersionId == other.modelVersionId && requestedScanLocation == other.requestedScanLocation && modelSource == other.modelSource && requestingEntity == other.requestingEntity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(modelId, modelName, modelVersion, modelVersionId, requestedScanLocation, modelSource, requestingEntity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inventory{modelId=$modelId, modelName=$modelName, modelVersion=$modelVersion, modelVersionId=$modelVersionId, requestedScanLocation=$requestedScanLocation, modelSource=$modelSource, requestingEntity=$requestingEntity, additionalProperties=$additionalProperties}"
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

            @JvmField val PENDING = of("pending")

            @JvmField val RUNNING = of("running")

            @JvmField val DONE = of("done")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
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

    /** detection severity */
    class Severity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOW = of("low")

            @JvmField val MEDIUM = of("medium")

            @JvmField val HIGH = of("high")

            @JvmField val CRITICAL = of("critical")

            @JvmField val SAFE = of("safe")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
        }

        /** An enum containing [Severity]'s known values. */
        enum class Known {
            LOW,
            MEDIUM,
            HIGH,
            CRITICAL,
            SAFE,
            UNKNOWN,
        }

        /**
         * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Severity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOW,
            MEDIUM,
            HIGH,
            CRITICAL,
            SAFE,
            UNKNOWN,
            /** An enum member indicating that [Severity] was instantiated with an unknown value. */
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
                LOW -> Value.LOW
                MEDIUM -> Value.MEDIUM
                HIGH -> Value.HIGH
                CRITICAL -> Value.CRITICAL
                SAFE -> Value.SAFE
                UNKNOWN -> Value.UNKNOWN
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
                LOW -> Known.LOW
                MEDIUM -> Known.MEDIUM
                HIGH -> Known.HIGH
                CRITICAL -> Known.CRITICAL
                SAFE -> Known.SAFE
                UNKNOWN -> Known.UNKNOWN
                else -> throw HiddenLayerInvalidDataException("Unknown Severity: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScanReport && detectionCount == other.detectionCount && fileCount == other.fileCount && filesWithDetectionsCount == other.filesWithDetectionsCount && inventory == other.inventory && scanId == other.scanId && startTime == other.startTime && status == other.status && version == other.version && detectionCategories == other.detectionCategories && endTime == other.endTime && fileResults == other.fileResults && severity == other.severity && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(detectionCount, fileCount, filesWithDetectionsCount, inventory, scanId, startTime, status, version, detectionCategories, endTime, fileResults, severity, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScanReport{detectionCount=$detectionCount, fileCount=$fileCount, filesWithDetectionsCount=$filesWithDetectionsCount, inventory=$inventory, scanId=$scanId, startTime=$startTime, status=$status, version=$version, detectionCategories=$detectionCategories, endTime=$endTime, fileResults=$fileResults, severity=$severity, additionalProperties=$additionalProperties}"
}
