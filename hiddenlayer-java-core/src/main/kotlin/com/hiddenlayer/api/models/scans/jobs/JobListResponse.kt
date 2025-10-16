// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.Enum
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.checkKnown
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class JobListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val items: JsonField<List<Item>>,
    private val limit: JsonField<Long>,
    private val offset: JsonField<Long>,
    private val total: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("items") @ExcludeMissing items: JsonField<List<Item>> = JsonMissing.of(),
        @JsonProperty("limit") @ExcludeMissing limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
    ) : this(items, limit, offset, total, mutableMapOf())

    /**
     * List of items. If no matching items are found, then `[]` will be returned.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun items(): List<Item> = items.getRequired("items")

    /**
     * Maximum number of items to return
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun limit(): Long = limit.getRequired("limit")

    /**
     * Begin returning the results from this offset
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offset(): Long = offset.getRequired("offset")

    /**
     * Total number of items available based on the query criteria.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Double = total.getRequired("total")

    /**
     * Returns the raw JSON value of [items].
     *
     * Unlike [items], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("items") @ExcludeMissing fun _items(): JsonField<List<Item>> = items

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

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
         * Returns a mutable builder for constructing an instance of [JobListResponse].
         *
         * The following fields are required:
         * ```java
         * .items()
         * .limit()
         * .offset()
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobListResponse]. */
    class Builder internal constructor() {

        private var items: JsonField<MutableList<Item>>? = null
        private var limit: JsonField<Long>? = null
        private var offset: JsonField<Long>? = null
        private var total: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(jobListResponse: JobListResponse) = apply {
            items = jobListResponse.items.map { it.toMutableList() }
            limit = jobListResponse.limit
            offset = jobListResponse.offset
            total = jobListResponse.total
            additionalProperties = jobListResponse.additionalProperties.toMutableMap()
        }

        /** List of items. If no matching items are found, then `[]` will be returned. */
        fun items(items: List<Item>) = items(JsonField.of(items))

        /**
         * Sets [Builder.items] to an arbitrary JSON value.
         *
         * You should usually call [Builder.items] with a well-typed `List<Item>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun items(items: JsonField<List<Item>>) = apply {
            this.items = items.map { it.toMutableList() }
        }

        /**
         * Adds a single [Item] to [items].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItem(item: Item) = apply {
            items =
                (items ?: JsonField.of(mutableListOf())).also { checkKnown("items", it).add(item) }
        }

        /** Maximum number of items to return */
        fun limit(limit: Long) = limit(JsonField.of(limit))

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

        /** Begin returning the results from this offset */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

        /** Total number of items available based on the query criteria. */
        fun total(total: Double) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Double>) = apply { this.total = total }

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
         * Returns an immutable instance of [JobListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .items()
         * .limit()
         * .offset()
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobListResponse =
            JobListResponse(
                checkRequired("items", items).map { it.toImmutable() },
                checkRequired("limit", limit),
                checkRequired("offset", offset),
                checkRequired("total", total),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): JobListResponse = apply {
        if (validated) {
            return@apply
        }

        items().forEach { it.validate() }
        limit()
        offset()
        total()
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
        (items.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (limit.asKnown().isPresent) 1 else 0) +
            (if (offset.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    /** A scan report without any file results. */
    class Item
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val detectionCount: JsonField<Long>,
        private val fileCount: JsonField<Long>,
        private val filesWithDetectionsCount: JsonField<Long>,
        private val inventory: JsonField<Inventory>,
        private val scanId: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val summary: JsonField<Summary>,
        private val version: JsonField<String>,
        private val schemaVersion: JsonField<String>,
        private val compliance: JsonField<Compliance>,
        private val detectionCategories: JsonField<List<String>>,
        private val endTime: JsonField<OffsetDateTime>,
        private val hasGenealogy: JsonField<Boolean>,
        private val severity: JsonField<Severity>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("detection_count")
            @ExcludeMissing
            detectionCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("file_count")
            @ExcludeMissing
            fileCount: JsonField<Long> = JsonMissing.of(),
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
            @JsonProperty("summary") @ExcludeMissing summary: JsonField<Summary> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<String> = JsonMissing.of(),
            @JsonProperty("\$schema_version")
            @ExcludeMissing
            schemaVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("compliance")
            @ExcludeMissing
            compliance: JsonField<Compliance> = JsonMissing.of(),
            @JsonProperty("detection_categories")
            @ExcludeMissing
            detectionCategories: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("end_time")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("has_genealogy")
            @ExcludeMissing
            hasGenealogy: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
        ) : this(
            detectionCount,
            fileCount,
            filesWithDetectionsCount,
            inventory,
            scanId,
            startTime,
            status,
            summary,
            version,
            schemaVersion,
            compliance,
            detectionCategories,
            endTime,
            hasGenealogy,
            severity,
            mutableMapOf(),
        )

        /**
         * number of detections found; use `.summary.detection_count` instead
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun detectionCount(): Long = detectionCount.getRequired("detection_count")

        /**
         * number of files scanned; use `.summary.file_count` instead
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun fileCount(): Long = fileCount.getRequired("file_count")

        /**
         * number of files with detections found; use `.summary.files_with_detections_count` instead
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun filesWithDetectionsCount(): Long =
            filesWithDetectionsCount.getRequired("files_with_detections_count")

        /**
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
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun summary(): Summary = summary.getRequired("summary")

        /**
         * scanner version
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): String = version.getRequired("version")

        /**
         * version of the scan report schema format
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun schemaVersion(): Optional<String> = schemaVersion.getOptional("\$schema_version")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compliance(): Optional<Compliance> = compliance.getOptional("compliance")

        /**
         * list of detection categories found; use `.summary.detection_categories` instead
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun detectionCategories(): Optional<List<String>> =
            detectionCategories.getOptional("detection_categories")

        /**
         * time the scan ended
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

        /**
         * if there is model geneaology info available
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hasGenealogy(): Optional<Boolean> = hasGenealogy.getOptional("has_genealogy")

        /**
         * The highest severity of any detections on the scan, including "safe". Use
         * `.summary.highest_severity` instead.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun severity(): Optional<Severity> = severity.getOptional("severity")

        /**
         * Returns the raw JSON value of [detectionCount].
         *
         * Unlike [detectionCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @Deprecated("deprecated")
        @JsonProperty("detection_count")
        @ExcludeMissing
        fun _detectionCount(): JsonField<Long> = detectionCount

        /**
         * Returns the raw JSON value of [fileCount].
         *
         * Unlike [fileCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("file_count")
        @ExcludeMissing
        fun _fileCount(): JsonField<Long> = fileCount

        /**
         * Returns the raw JSON value of [filesWithDetectionsCount].
         *
         * Unlike [filesWithDetectionsCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("files_with_detections_count")
        @ExcludeMissing
        fun _filesWithDetectionsCount(): JsonField<Long> = filesWithDetectionsCount

        /**
         * Returns the raw JSON value of [inventory].
         *
         * Unlike [inventory], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inventory")
        @ExcludeMissing
        fun _inventory(): JsonField<Inventory> = inventory

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
         * Returns the raw JSON value of [summary].
         *
         * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<Summary> = summary

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

        /**
         * Returns the raw JSON value of [schemaVersion].
         *
         * Unlike [schemaVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("\$schema_version")
        @ExcludeMissing
        fun _schemaVersion(): JsonField<String> = schemaVersion

        /**
         * Returns the raw JSON value of [compliance].
         *
         * Unlike [compliance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("compliance")
        @ExcludeMissing
        fun _compliance(): JsonField<Compliance> = compliance

        /**
         * Returns the raw JSON value of [detectionCategories].
         *
         * Unlike [detectionCategories], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("detection_categories")
        @ExcludeMissing
        fun _detectionCategories(): JsonField<List<String>> = detectionCategories

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_time")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [hasGenealogy].
         *
         * Unlike [hasGenealogy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("has_genealogy")
        @ExcludeMissing
        fun _hasGenealogy(): JsonField<Boolean> = hasGenealogy

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("severity")
        @ExcludeMissing
        fun _severity(): JsonField<Severity> = severity

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
             * Returns a mutable builder for constructing an instance of [Item].
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
             * .summary()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Item]. */
        class Builder internal constructor() {

            private var detectionCount: JsonField<Long>? = null
            private var fileCount: JsonField<Long>? = null
            private var filesWithDetectionsCount: JsonField<Long>? = null
            private var inventory: JsonField<Inventory>? = null
            private var scanId: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var summary: JsonField<Summary>? = null
            private var version: JsonField<String>? = null
            private var schemaVersion: JsonField<String> = JsonMissing.of()
            private var compliance: JsonField<Compliance> = JsonMissing.of()
            private var detectionCategories: JsonField<MutableList<String>>? = null
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var hasGenealogy: JsonField<Boolean> = JsonMissing.of()
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(item: Item) = apply {
                detectionCount = item.detectionCount
                fileCount = item.fileCount
                filesWithDetectionsCount = item.filesWithDetectionsCount
                inventory = item.inventory
                scanId = item.scanId
                startTime = item.startTime
                status = item.status
                summary = item.summary
                version = item.version
                schemaVersion = item.schemaVersion
                compliance = item.compliance
                detectionCategories = item.detectionCategories.map { it.toMutableList() }
                endTime = item.endTime
                hasGenealogy = item.hasGenealogy
                severity = item.severity
                additionalProperties = item.additionalProperties.toMutableMap()
            }

            /** number of detections found; use `.summary.detection_count` instead */
            @Deprecated("deprecated")
            fun detectionCount(detectionCount: Long) = detectionCount(JsonField.of(detectionCount))

            /**
             * Sets [Builder.detectionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun detectionCount(detectionCount: JsonField<Long>) = apply {
                this.detectionCount = detectionCount
            }

            /** number of files scanned; use `.summary.file_count` instead */
            @Deprecated("deprecated")
            fun fileCount(fileCount: Long) = fileCount(JsonField.of(fileCount))

            /**
             * Sets [Builder.fileCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
            fun fileCount(fileCount: JsonField<Long>) = apply { this.fileCount = fileCount }

            /**
             * number of files with detections found; use `.summary.files_with_detections_count`
             * instead
             */
            @Deprecated("deprecated")
            fun filesWithDetectionsCount(filesWithDetectionsCount: Long) =
                filesWithDetectionsCount(JsonField.of(filesWithDetectionsCount))

            /**
             * Sets [Builder.filesWithDetectionsCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filesWithDetectionsCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun filesWithDetectionsCount(filesWithDetectionsCount: JsonField<Long>) = apply {
                this.filesWithDetectionsCount = filesWithDetectionsCount
            }

            fun inventory(inventory: Inventory) = inventory(JsonField.of(inventory))

            /**
             * Sets [Builder.inventory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inventory] with a well-typed [Inventory] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inventory(inventory: JsonField<Inventory>) = apply { this.inventory = inventory }

            /** unique identifier for the scan */
            fun scanId(scanId: String) = scanId(JsonField.of(scanId))

            /**
             * Sets [Builder.scanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scanId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            /** status of the scan */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun summary(summary: Summary) = summary(JsonField.of(summary))

            /**
             * Sets [Builder.summary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.summary] with a well-typed [Summary] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

            /** scanner version */
            fun version(version: String) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<String>) = apply { this.version = version }

            /** version of the scan report schema format */
            fun schemaVersion(schemaVersion: String) = schemaVersion(JsonField.of(schemaVersion))

            /**
             * Sets [Builder.schemaVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schemaVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schemaVersion(schemaVersion: JsonField<String>) = apply {
                this.schemaVersion = schemaVersion
            }

            fun compliance(compliance: Compliance) = compliance(JsonField.of(compliance))

            /**
             * Sets [Builder.compliance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compliance] with a well-typed [Compliance] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun compliance(compliance: JsonField<Compliance>) = apply {
                this.compliance = compliance
            }

            /** list of detection categories found; use `.summary.detection_categories` instead */
            @Deprecated("deprecated")
            fun detectionCategories(detectionCategories: List<String>) =
                detectionCategories(JsonField.of(detectionCategories))

            /**
             * Sets [Builder.detectionCategories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionCategories] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            @Deprecated("deprecated")
            fun detectionCategories(detectionCategories: JsonField<List<String>>) = apply {
                this.detectionCategories = detectionCategories.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [detectionCategories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            @Deprecated("deprecated")
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

            /** if there is model geneaology info available */
            fun hasGenealogy(hasGenealogy: Boolean) = hasGenealogy(JsonField.of(hasGenealogy))

            /**
             * Sets [Builder.hasGenealogy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hasGenealogy] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hasGenealogy(hasGenealogy: JsonField<Boolean>) = apply {
                this.hasGenealogy = hasGenealogy
            }

            /**
             * The highest severity of any detections on the scan, including "safe". Use
             * `.summary.highest_severity` instead.
             */
            @Deprecated("deprecated")
            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            @Deprecated("deprecated")
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
             * Returns an immutable instance of [Item].
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
             * .summary()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Item =
                Item(
                    checkRequired("detectionCount", detectionCount),
                    checkRequired("fileCount", fileCount),
                    checkRequired("filesWithDetectionsCount", filesWithDetectionsCount),
                    checkRequired("inventory", inventory),
                    checkRequired("scanId", scanId),
                    checkRequired("startTime", startTime),
                    checkRequired("status", status),
                    checkRequired("summary", summary),
                    checkRequired("version", version),
                    schemaVersion,
                    compliance,
                    (detectionCategories ?: JsonMissing.of()).map { it.toImmutable() },
                    endTime,
                    hasGenealogy,
                    severity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Item = apply {
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
            summary().validate()
            version()
            schemaVersion()
            compliance().ifPresent { it.validate() }
            detectionCategories()
            endTime()
            hasGenealogy()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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
                (summary.asKnown().getOrNull()?.validity() ?: 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (if (schemaVersion.asKnown().isPresent) 1 else 0) +
                (compliance.asKnown().getOrNull()?.validity() ?: 0) +
                (detectionCategories.asKnown().getOrNull()?.size ?: 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (hasGenealogy.asKnown().isPresent) 1 else 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0)

        class Inventory
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val modelId: JsonField<String>,
            private val modelName: JsonField<String>,
            private val modelVersionId: JsonField<String>,
            private val requestedScanLocation: JsonField<String>,
            private val modelSource: JsonField<String>,
            private val modelVersion: JsonField<String>,
            private val origin: JsonField<String>,
            private val requestSource: JsonField<RequestSource>,
            private val requestingEntity: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("model_id")
                @ExcludeMissing
                modelId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_name")
                @ExcludeMissing
                modelName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_version_id")
                @ExcludeMissing
                modelVersionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("requested_scan_location")
                @ExcludeMissing
                requestedScanLocation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_source")
                @ExcludeMissing
                modelSource: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_version")
                @ExcludeMissing
                modelVersion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<String> = JsonMissing.of(),
                @JsonProperty("request_source")
                @ExcludeMissing
                requestSource: JsonField<RequestSource> = JsonMissing.of(),
                @JsonProperty("requesting_entity")
                @ExcludeMissing
                requestingEntity: JsonField<String> = JsonMissing.of(),
            ) : this(
                modelId,
                modelName,
                modelVersionId,
                requestedScanLocation,
                modelSource,
                modelVersion,
                origin,
                requestSource,
                requestingEntity,
                mutableMapOf(),
            )

            /**
             * Unique identifier for the model
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun modelId(): String = modelId.getRequired("model_id")

            /**
             * name of the model
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun modelName(): String = modelName.getRequired("model_name")

            /**
             * unique identifier for the model version
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun modelVersionId(): String = modelVersionId.getRequired("model_version_id")

            /**
             * Location to be scanned
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requestedScanLocation(): String =
                requestedScanLocation.getRequired("requested_scan_location")

            /**
             * source (provider) info
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun modelSource(): Optional<String> = modelSource.getOptional("model_source")

            /**
             * version of the model
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun modelVersion(): Optional<String> = modelVersion.getOptional("model_version")

            /**
             * Specifies the platform or service where the model originated before being scanned
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun origin(): Optional<String> = origin.getOptional("origin")

            /**
             * Identifies the system that requested the scan
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun requestSource(): Optional<RequestSource> =
                requestSource.getOptional("request_source")

            /**
             * Entity that requested the scan
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun requestingEntity(): Optional<String> =
                requestingEntity.getOptional("requesting_entity")

            /**
             * Returns the raw JSON value of [modelId].
             *
             * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

            /**
             * Returns the raw JSON value of [modelName].
             *
             * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_name")
            @ExcludeMissing
            fun _modelName(): JsonField<String> = modelName

            /**
             * Returns the raw JSON value of [modelVersionId].
             *
             * Unlike [modelVersionId], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [modelSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_source")
            @ExcludeMissing
            fun _modelSource(): JsonField<String> = modelSource

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
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

            /**
             * Returns the raw JSON value of [requestSource].
             *
             * Unlike [requestSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("request_source")
            @ExcludeMissing
            fun _requestSource(): JsonField<RequestSource> = requestSource

            /**
             * Returns the raw JSON value of [requestingEntity].
             *
             * Unlike [requestingEntity], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                private var modelVersionId: JsonField<String>? = null
                private var requestedScanLocation: JsonField<String>? = null
                private var modelSource: JsonField<String> = JsonMissing.of()
                private var modelVersion: JsonField<String> = JsonMissing.of()
                private var origin: JsonField<String> = JsonMissing.of()
                private var requestSource: JsonField<RequestSource> = JsonMissing.of()
                private var requestingEntity: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inventory: Inventory) = apply {
                    modelId = inventory.modelId
                    modelName = inventory.modelName
                    modelVersionId = inventory.modelVersionId
                    requestedScanLocation = inventory.requestedScanLocation
                    modelSource = inventory.modelSource
                    modelVersion = inventory.modelVersion
                    origin = inventory.origin
                    requestSource = inventory.requestSource
                    requestingEntity = inventory.requestingEntity
                    additionalProperties = inventory.additionalProperties.toMutableMap()
                }

                /** Unique identifier for the model */
                fun modelId(modelId: String) = modelId(JsonField.of(modelId))

                /**
                 * Sets [Builder.modelId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

                /** name of the model */
                fun modelName(modelName: String) = modelName(JsonField.of(modelName))

                /**
                 * Sets [Builder.modelName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

                /** unique identifier for the model version */
                fun modelVersionId(modelVersionId: String) =
                    modelVersionId(JsonField.of(modelVersionId))

                /**
                 * Sets [Builder.modelVersionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelVersionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.requestedScanLocation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelSource(modelSource: JsonField<String>) = apply {
                    this.modelSource = modelSource
                }

                /** version of the model */
                fun modelVersion(modelVersion: String) = modelVersion(JsonField.of(modelVersion))

                /**
                 * Sets [Builder.modelVersion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelVersion] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelVersion(modelVersion: JsonField<String>) = apply {
                    this.modelVersion = modelVersion
                }

                /**
                 * Specifies the platform or service where the model originated before being scanned
                 */
                fun origin(origin: String) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<String>) = apply { this.origin = origin }

                /** Identifies the system that requested the scan */
                fun requestSource(requestSource: RequestSource) =
                    requestSource(JsonField.of(requestSource))

                /**
                 * Sets [Builder.requestSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestSource] with a well-typed [RequestSource]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requestSource(requestSource: JsonField<RequestSource>) = apply {
                    this.requestSource = requestSource
                }

                /** Entity that requested the scan */
                fun requestingEntity(requestingEntity: String) =
                    requestingEntity(JsonField.of(requestingEntity))

                /**
                 * Sets [Builder.requestingEntity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestingEntity] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Returns an immutable instance of [Inventory].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .modelId()
                 * .modelName()
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
                        checkRequired("modelVersionId", modelVersionId),
                        checkRequired("requestedScanLocation", requestedScanLocation),
                        modelSource,
                        modelVersion,
                        origin,
                        requestSource,
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
                modelVersionId()
                requestedScanLocation()
                modelSource()
                modelVersion()
                origin()
                requestSource().ifPresent { it.validate() }
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
                    (if (modelVersionId.asKnown().isPresent) 1 else 0) +
                    (if (requestedScanLocation.asKnown().isPresent) 1 else 0) +
                    (if (modelSource.asKnown().isPresent) 1 else 0) +
                    (if (modelVersion.asKnown().isPresent) 1 else 0) +
                    (if (origin.asKnown().isPresent) 1 else 0) +
                    (requestSource.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (requestingEntity.asKnown().isPresent) 1 else 0)

            /** Identifies the system that requested the scan */
            class RequestSource
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val HYBRID_UPLOAD = of("Hybrid Upload")

                    @JvmField val API_UPLOAD = of("API Upload")

                    @JvmField val INTEGRATION = of("Integration")

                    @JvmField val UI_UPLOAD = of("UI Upload")

                    @JvmField val AI_ASSET_DISCOVERY = of("AI Asset Discovery")

                    @JvmStatic fun of(value: String) = RequestSource(JsonField.of(value))
                }

                /** An enum containing [RequestSource]'s known values. */
                enum class Known {
                    HYBRID_UPLOAD,
                    API_UPLOAD,
                    INTEGRATION,
                    UI_UPLOAD,
                    AI_ASSET_DISCOVERY,
                }

                /**
                 * An enum containing [RequestSource]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RequestSource] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    HYBRID_UPLOAD,
                    API_UPLOAD,
                    INTEGRATION,
                    UI_UPLOAD,
                    AI_ASSET_DISCOVERY,
                    /**
                     * An enum member indicating that [RequestSource] was instantiated with an
                     * unknown value.
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
                        HYBRID_UPLOAD -> Value.HYBRID_UPLOAD
                        API_UPLOAD -> Value.API_UPLOAD
                        INTEGRATION -> Value.INTEGRATION
                        UI_UPLOAD -> Value.UI_UPLOAD
                        AI_ASSET_DISCOVERY -> Value.AI_ASSET_DISCOVERY
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
                        HYBRID_UPLOAD -> Known.HYBRID_UPLOAD
                        API_UPLOAD -> Known.API_UPLOAD
                        INTEGRATION -> Known.INTEGRATION
                        UI_UPLOAD -> Known.UI_UPLOAD
                        AI_ASSET_DISCOVERY -> Known.AI_ASSET_DISCOVERY
                        else ->
                            throw HiddenLayerInvalidDataException("Unknown RequestSource: $value")
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

                fun validate(): RequestSource = apply {
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

                    return other is RequestSource && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Inventory &&
                    modelId == other.modelId &&
                    modelName == other.modelName &&
                    modelVersionId == other.modelVersionId &&
                    requestedScanLocation == other.requestedScanLocation &&
                    modelSource == other.modelSource &&
                    modelVersion == other.modelVersion &&
                    origin == other.origin &&
                    requestSource == other.requestSource &&
                    requestingEntity == other.requestingEntity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    modelId,
                    modelName,
                    modelVersionId,
                    requestedScanLocation,
                    modelSource,
                    modelVersion,
                    origin,
                    requestSource,
                    requestingEntity,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Inventory{modelId=$modelId, modelName=$modelName, modelVersionId=$modelVersionId, requestedScanLocation=$requestedScanLocation, modelSource=$modelSource, modelVersion=$modelVersion, origin=$origin, requestSource=$requestSource, requestingEntity=$requestingEntity, additionalProperties=$additionalProperties}"
        }

        /** status of the scan */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                RUNNING,
                DONE,
                FAILED,
                CANCELED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HiddenLayerInvalidDataException if this class instance's value is a not a
             *   known member.
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Summary
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val detectionCategories: JsonField<List<String>>,
            private val detectionCount: JsonField<Long>,
            private val fileCount: JsonField<Long>,
            private val filesFailedToScan: JsonField<Long>,
            private val filesWithDetectionsCount: JsonField<Long>,
            private val highestSeverity: JsonField<HighestSeverity>,
            private val severity: JsonField<Severity>,
            private val unknownFiles: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("detection_categories")
                @ExcludeMissing
                detectionCategories: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("detection_count")
                @ExcludeMissing
                detectionCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("file_count")
                @ExcludeMissing
                fileCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("files_failed_to_scan")
                @ExcludeMissing
                filesFailedToScan: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("files_with_detections_count")
                @ExcludeMissing
                filesWithDetectionsCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("highest_severity")
                @ExcludeMissing
                highestSeverity: JsonField<HighestSeverity> = JsonMissing.of(),
                @JsonProperty("severity")
                @ExcludeMissing
                severity: JsonField<Severity> = JsonMissing.of(),
                @JsonProperty("unknown_files")
                @ExcludeMissing
                unknownFiles: JsonField<Long> = JsonMissing.of(),
            ) : this(
                detectionCategories,
                detectionCount,
                fileCount,
                filesFailedToScan,
                filesWithDetectionsCount,
                highestSeverity,
                severity,
                unknownFiles,
                mutableMapOf(),
            )

            /**
             * list of unique detection categories found
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun detectionCategories(): Optional<List<String>> =
                detectionCategories.getOptional("detection_categories")

            /**
             * total number of detections found
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun detectionCount(): Optional<Long> = detectionCount.getOptional("detection_count")

            /**
             * total number of files scanned
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fileCount(): Optional<Long> = fileCount.getOptional("file_count")

            /**
             * number of files that failed during scanning
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun filesFailedToScan(): Optional<Long> =
                filesFailedToScan.getOptional("files_failed_to_scan")

            /**
             * number of files that contain detections
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun filesWithDetectionsCount(): Optional<Long> =
                filesWithDetectionsCount.getOptional("files_with_detections_count")

            /**
             * The highest severity of any detections on the scan.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun highestSeverity(): Optional<HighestSeverity> =
                highestSeverity.getOptional("highest_severity")

            /**
             * The highest severity of any detections on the scan, including "safe". Use
             * `.summary.highest_severity` instead.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            @Deprecated("deprecated")
            fun severity(): Optional<Severity> = severity.getOptional("severity")

            /**
             * number of files with unknown file type
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun unknownFiles(): Optional<Long> = unknownFiles.getOptional("unknown_files")

            /**
             * Returns the raw JSON value of [detectionCategories].
             *
             * Unlike [detectionCategories], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detection_categories")
            @ExcludeMissing
            fun _detectionCategories(): JsonField<List<String>> = detectionCategories

            /**
             * Returns the raw JSON value of [detectionCount].
             *
             * Unlike [detectionCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("detection_count")
            @ExcludeMissing
            fun _detectionCount(): JsonField<Long> = detectionCount

            /**
             * Returns the raw JSON value of [fileCount].
             *
             * Unlike [fileCount], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("file_count")
            @ExcludeMissing
            fun _fileCount(): JsonField<Long> = fileCount

            /**
             * Returns the raw JSON value of [filesFailedToScan].
             *
             * Unlike [filesFailedToScan], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("files_failed_to_scan")
            @ExcludeMissing
            fun _filesFailedToScan(): JsonField<Long> = filesFailedToScan

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
             * Returns the raw JSON value of [highestSeverity].
             *
             * Unlike [highestSeverity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("highest_severity")
            @ExcludeMissing
            fun _highestSeverity(): JsonField<HighestSeverity> = highestSeverity

            /**
             * Returns the raw JSON value of [severity].
             *
             * Unlike [severity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @Deprecated("deprecated")
            @JsonProperty("severity")
            @ExcludeMissing
            fun _severity(): JsonField<Severity> = severity

            /**
             * Returns the raw JSON value of [unknownFiles].
             *
             * Unlike [unknownFiles], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unknown_files")
            @ExcludeMissing
            fun _unknownFiles(): JsonField<Long> = unknownFiles

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

                /** Returns a mutable builder for constructing an instance of [Summary]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Summary]. */
            class Builder internal constructor() {

                private var detectionCategories: JsonField<MutableList<String>>? = null
                private var detectionCount: JsonField<Long> = JsonMissing.of()
                private var fileCount: JsonField<Long> = JsonMissing.of()
                private var filesFailedToScan: JsonField<Long> = JsonMissing.of()
                private var filesWithDetectionsCount: JsonField<Long> = JsonMissing.of()
                private var highestSeverity: JsonField<HighestSeverity> = JsonMissing.of()
                private var severity: JsonField<Severity> = JsonMissing.of()
                private var unknownFiles: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(summary: Summary) = apply {
                    detectionCategories = summary.detectionCategories.map { it.toMutableList() }
                    detectionCount = summary.detectionCount
                    fileCount = summary.fileCount
                    filesFailedToScan = summary.filesFailedToScan
                    filesWithDetectionsCount = summary.filesWithDetectionsCount
                    highestSeverity = summary.highestSeverity
                    severity = summary.severity
                    unknownFiles = summary.unknownFiles
                    additionalProperties = summary.additionalProperties.toMutableMap()
                }

                /** list of unique detection categories found */
                fun detectionCategories(detectionCategories: List<String>) =
                    detectionCategories(JsonField.of(detectionCategories))

                /**
                 * Sets [Builder.detectionCategories] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectionCategories] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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

                /** total number of detections found */
                fun detectionCount(detectionCount: Long) =
                    detectionCount(JsonField.of(detectionCount))

                /**
                 * Sets [Builder.detectionCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.detectionCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun detectionCount(detectionCount: JsonField<Long>) = apply {
                    this.detectionCount = detectionCount
                }

                /** total number of files scanned */
                fun fileCount(fileCount: Long) = fileCount(JsonField.of(fileCount))

                /**
                 * Sets [Builder.fileCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileCount] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fileCount(fileCount: JsonField<Long>) = apply { this.fileCount = fileCount }

                /** number of files that failed during scanning */
                fun filesFailedToScan(filesFailedToScan: Long) =
                    filesFailedToScan(JsonField.of(filesFailedToScan))

                /**
                 * Sets [Builder.filesFailedToScan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filesFailedToScan] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun filesFailedToScan(filesFailedToScan: JsonField<Long>) = apply {
                    this.filesFailedToScan = filesFailedToScan
                }

                /** number of files that contain detections */
                fun filesWithDetectionsCount(filesWithDetectionsCount: Long) =
                    filesWithDetectionsCount(JsonField.of(filesWithDetectionsCount))

                /**
                 * Sets [Builder.filesWithDetectionsCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.filesWithDetectionsCount] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun filesWithDetectionsCount(filesWithDetectionsCount: JsonField<Long>) = apply {
                    this.filesWithDetectionsCount = filesWithDetectionsCount
                }

                /** The highest severity of any detections on the scan. */
                fun highestSeverity(highestSeverity: HighestSeverity) =
                    highestSeverity(JsonField.of(highestSeverity))

                /**
                 * Sets [Builder.highestSeverity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.highestSeverity] with a well-typed
                 * [HighestSeverity] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun highestSeverity(highestSeverity: JsonField<HighestSeverity>) = apply {
                    this.highestSeverity = highestSeverity
                }

                /**
                 * The highest severity of any detections on the scan, including "safe". Use
                 * `.summary.highest_severity` instead.
                 */
                @Deprecated("deprecated")
                fun severity(severity: Severity) = severity(JsonField.of(severity))

                /**
                 * Sets [Builder.severity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.severity] with a well-typed [Severity] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                @Deprecated("deprecated")
                fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

                /** number of files with unknown file type */
                fun unknownFiles(unknownFiles: Long) = unknownFiles(JsonField.of(unknownFiles))

                /**
                 * Sets [Builder.unknownFiles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unknownFiles] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unknownFiles(unknownFiles: JsonField<Long>) = apply {
                    this.unknownFiles = unknownFiles
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
                 * Returns an immutable instance of [Summary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Summary =
                    Summary(
                        (detectionCategories ?: JsonMissing.of()).map { it.toImmutable() },
                        detectionCount,
                        fileCount,
                        filesFailedToScan,
                        filesWithDetectionsCount,
                        highestSeverity,
                        severity,
                        unknownFiles,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Summary = apply {
                if (validated) {
                    return@apply
                }

                detectionCategories()
                detectionCount()
                fileCount()
                filesFailedToScan()
                filesWithDetectionsCount()
                highestSeverity().ifPresent { it.validate() }
                severity().ifPresent { it.validate() }
                unknownFiles()
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
                (detectionCategories.asKnown().getOrNull()?.size ?: 0) +
                    (if (detectionCount.asKnown().isPresent) 1 else 0) +
                    (if (fileCount.asKnown().isPresent) 1 else 0) +
                    (if (filesFailedToScan.asKnown().isPresent) 1 else 0) +
                    (if (filesWithDetectionsCount.asKnown().isPresent) 1 else 0) +
                    (highestSeverity.asKnown().getOrNull()?.validity() ?: 0) +
                    (severity.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (unknownFiles.asKnown().isPresent) 1 else 0)

            /** The highest severity of any detections on the scan. */
            class HighestSeverity
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val CRITICAL = of("critical")

                    @JvmField val HIGH = of("high")

                    @JvmField val MEDIUM = of("medium")

                    @JvmField val LOW = of("low")

                    @JvmField val NONE = of("none")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = HighestSeverity(JsonField.of(value))
                }

                /** An enum containing [HighestSeverity]'s known values. */
                enum class Known {
                    CRITICAL,
                    HIGH,
                    MEDIUM,
                    LOW,
                    NONE,
                    UNKNOWN,
                }

                /**
                 * An enum containing [HighestSeverity]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [HighestSeverity] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CRITICAL,
                    HIGH,
                    MEDIUM,
                    LOW,
                    NONE,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [HighestSeverity] was instantiated with an
                     * unknown value.
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
                        CRITICAL -> Value.CRITICAL
                        HIGH -> Value.HIGH
                        MEDIUM -> Value.MEDIUM
                        LOW -> Value.LOW
                        NONE -> Value.NONE
                        UNKNOWN -> Value.UNKNOWN
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
                        CRITICAL -> Known.CRITICAL
                        HIGH -> Known.HIGH
                        MEDIUM -> Known.MEDIUM
                        LOW -> Known.LOW
                        NONE -> Known.NONE
                        UNKNOWN -> Known.UNKNOWN
                        else ->
                            throw HiddenLayerInvalidDataException("Unknown HighestSeverity: $value")
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

                fun validate(): HighestSeverity = apply {
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

                    return other is HighestSeverity && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The highest severity of any detections on the scan, including "safe". Use
             * `.summary.highest_severity` instead.
             */
            @Deprecated("deprecated")
            class Severity @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CRITICAL = of("critical")

                    @JvmField val HIGH = of("high")

                    @JvmField val MEDIUM = of("medium")

                    @JvmField val LOW = of("low")

                    @JvmField val UNKNOWN = of("unknown")

                    @JvmField val SAFE = of("safe")

                    @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
                }

                /** An enum containing [Severity]'s known values. */
                enum class Known {
                    CRITICAL,
                    HIGH,
                    MEDIUM,
                    LOW,
                    UNKNOWN,
                    SAFE,
                }

                /**
                 * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Severity] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CRITICAL,
                    HIGH,
                    MEDIUM,
                    LOW,
                    UNKNOWN,
                    SAFE,
                    /**
                     * An enum member indicating that [Severity] was instantiated with an unknown
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
                        CRITICAL -> Value.CRITICAL
                        HIGH -> Value.HIGH
                        MEDIUM -> Value.MEDIUM
                        LOW -> Value.LOW
                        UNKNOWN -> Value.UNKNOWN
                        SAFE -> Value.SAFE
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
                        CRITICAL -> Known.CRITICAL
                        HIGH -> Known.HIGH
                        MEDIUM -> Known.MEDIUM
                        LOW -> Known.LOW
                        UNKNOWN -> Known.UNKNOWN
                        SAFE -> Known.SAFE
                        else -> throw HiddenLayerInvalidDataException("Unknown Severity: $value")
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

                    return other is Severity && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Summary &&
                    detectionCategories == other.detectionCategories &&
                    detectionCount == other.detectionCount &&
                    fileCount == other.fileCount &&
                    filesFailedToScan == other.filesFailedToScan &&
                    filesWithDetectionsCount == other.filesWithDetectionsCount &&
                    highestSeverity == other.highestSeverity &&
                    severity == other.severity &&
                    unknownFiles == other.unknownFiles &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    detectionCategories,
                    detectionCount,
                    fileCount,
                    filesFailedToScan,
                    filesWithDetectionsCount,
                    highestSeverity,
                    severity,
                    unknownFiles,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Summary{detectionCategories=$detectionCategories, detectionCount=$detectionCount, fileCount=$fileCount, filesFailedToScan=$filesFailedToScan, filesWithDetectionsCount=$filesWithDetectionsCount, highestSeverity=$highestSeverity, severity=$severity, unknownFiles=$unknownFiles, additionalProperties=$additionalProperties}"
        }

        class Compliance
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val evaluatedAt: JsonField<OffsetDateTime>,
            private val ruleSetIds: JsonField<List<String>>,
            private val status: JsonField<Status>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("evaluated_at")
                @ExcludeMissing
                evaluatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("rule_set_ids")
                @ExcludeMissing
                ruleSetIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            ) : this(evaluatedAt, ruleSetIds, status, mutableMapOf())

            /**
             * The datetime when the rule set was evaluated against the scan result
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun evaluatedAt(): Optional<OffsetDateTime> = evaluatedAt.getOptional("evaluated_at")

            /**
             * A list of non-default rule sets that were used when evaluating the scan result
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun ruleSetIds(): Optional<List<String>> = ruleSetIds.getOptional("rule_set_ids")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun status(): Optional<Status> = status.getOptional("status")

            /**
             * Returns the raw JSON value of [evaluatedAt].
             *
             * Unlike [evaluatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("evaluated_at")
            @ExcludeMissing
            fun _evaluatedAt(): JsonField<OffsetDateTime> = evaluatedAt

            /**
             * Returns the raw JSON value of [ruleSetIds].
             *
             * Unlike [ruleSetIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rule_set_ids")
            @ExcludeMissing
            fun _ruleSetIds(): JsonField<List<String>> = ruleSetIds

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

                /** Returns a mutable builder for constructing an instance of [Compliance]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Compliance]. */
            class Builder internal constructor() {

                private var evaluatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ruleSetIds: JsonField<MutableList<String>>? = null
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(compliance: Compliance) = apply {
                    evaluatedAt = compliance.evaluatedAt
                    ruleSetIds = compliance.ruleSetIds.map { it.toMutableList() }
                    status = compliance.status
                    additionalProperties = compliance.additionalProperties.toMutableMap()
                }

                /** The datetime when the rule set was evaluated against the scan result */
                fun evaluatedAt(evaluatedAt: OffsetDateTime) =
                    evaluatedAt(JsonField.of(evaluatedAt))

                /**
                 * Sets [Builder.evaluatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.evaluatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun evaluatedAt(evaluatedAt: JsonField<OffsetDateTime>) = apply {
                    this.evaluatedAt = evaluatedAt
                }

                /**
                 * A list of non-default rule sets that were used when evaluating the scan result
                 */
                fun ruleSetIds(ruleSetIds: List<String>) = ruleSetIds(JsonField.of(ruleSetIds))

                /**
                 * Sets [Builder.ruleSetIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleSetIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ruleSetIds(ruleSetIds: JsonField<List<String>>) = apply {
                    this.ruleSetIds = ruleSetIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [ruleSetIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRuleSetId(ruleSetId: String) = apply {
                    ruleSetIds =
                        (ruleSetIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ruleSetIds", it).add(ruleSetId)
                        }
                }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

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
                 * Returns an immutable instance of [Compliance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Compliance =
                    Compliance(
                        evaluatedAt,
                        (ruleSetIds ?: JsonMissing.of()).map { it.toImmutable() },
                        status,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Compliance = apply {
                if (validated) {
                    return@apply
                }

                evaluatedAt()
                ruleSetIds()
                status().ifPresent { it.validate() }
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
                (if (evaluatedAt.asKnown().isPresent) 1 else 0) +
                    (ruleSetIds.asKnown().getOrNull()?.size ?: 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0)

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

                    @JvmField val COMPLIANT = of("COMPLIANT")

                    @JvmField val NONCOMPLIANT = of("NONCOMPLIANT")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    COMPLIANT,
                    NONCOMPLIANT,
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
                    COMPLIANT,
                    NONCOMPLIANT,
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
                        COMPLIANT -> Value.COMPLIANT
                        NONCOMPLIANT -> Value.NONCOMPLIANT
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
                        COMPLIANT -> Known.COMPLIANT
                        NONCOMPLIANT -> Known.NONCOMPLIANT
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Compliance &&
                    evaluatedAt == other.evaluatedAt &&
                    ruleSetIds == other.ruleSetIds &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(evaluatedAt, ruleSetIds, status, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Compliance{evaluatedAt=$evaluatedAt, ruleSetIds=$ruleSetIds, status=$status, additionalProperties=$additionalProperties}"
        }

        /**
         * The highest severity of any detections on the scan, including "safe". Use
         * `.summary.highest_severity` instead.
         */
        @Deprecated("deprecated")
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

                @JvmField val CRITICAL = of("critical")

                @JvmField val HIGH = of("high")

                @JvmField val MEDIUM = of("medium")

                @JvmField val LOW = of("low")

                @JvmField val UNKNOWN = of("unknown")

                @JvmField val SAFE = of("safe")

                @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
            }

            /** An enum containing [Severity]'s known values. */
            enum class Known {
                CRITICAL,
                HIGH,
                MEDIUM,
                LOW,
                UNKNOWN,
                SAFE,
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
                CRITICAL,
                HIGH,
                MEDIUM,
                LOW,
                UNKNOWN,
                SAFE,
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
                    CRITICAL -> Value.CRITICAL
                    HIGH -> Value.HIGH
                    MEDIUM -> Value.MEDIUM
                    LOW -> Value.LOW
                    UNKNOWN -> Value.UNKNOWN
                    SAFE -> Value.SAFE
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
                    CRITICAL -> Known.CRITICAL
                    HIGH -> Known.HIGH
                    MEDIUM -> Known.MEDIUM
                    LOW -> Known.LOW
                    UNKNOWN -> Known.UNKNOWN
                    SAFE -> Known.SAFE
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

                return other is Severity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Item &&
                detectionCount == other.detectionCount &&
                fileCount == other.fileCount &&
                filesWithDetectionsCount == other.filesWithDetectionsCount &&
                inventory == other.inventory &&
                scanId == other.scanId &&
                startTime == other.startTime &&
                status == other.status &&
                summary == other.summary &&
                version == other.version &&
                schemaVersion == other.schemaVersion &&
                compliance == other.compliance &&
                detectionCategories == other.detectionCategories &&
                endTime == other.endTime &&
                hasGenealogy == other.hasGenealogy &&
                severity == other.severity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                detectionCount,
                fileCount,
                filesWithDetectionsCount,
                inventory,
                scanId,
                startTime,
                status,
                summary,
                version,
                schemaVersion,
                compliance,
                detectionCategories,
                endTime,
                hasGenealogy,
                severity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Item{detectionCount=$detectionCount, fileCount=$fileCount, filesWithDetectionsCount=$filesWithDetectionsCount, inventory=$inventory, scanId=$scanId, startTime=$startTime, status=$status, summary=$summary, version=$version, schemaVersion=$schemaVersion, compliance=$compliance, detectionCategories=$detectionCategories, endTime=$endTime, hasGenealogy=$hasGenealogy, severity=$severity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobListResponse &&
            items == other.items &&
            limit == other.limit &&
            offset == other.offset &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(items, limit, offset, total, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "JobListResponse{items=$items, limit=$limit, offset=$offset, total=$total, additionalProperties=$additionalProperties}"
}
