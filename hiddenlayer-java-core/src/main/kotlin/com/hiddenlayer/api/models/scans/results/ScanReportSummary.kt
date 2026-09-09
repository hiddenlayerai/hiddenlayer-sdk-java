// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.results

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

/** A scan report summary containing header and aggregated statistics without file-level results. */
class ScanReportSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inventory: JsonField<Inventory>,
    private val scanId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val summary: JsonField<Summary>,
    private val version: JsonField<String>,
    private val schemaVersion: JsonField<String>,
    private val compliance: JsonField<Compliance>,
    private val endTime: JsonField<OffsetDateTime>,
    private val hasGenealogy: JsonField<Boolean>,
    private val intelligence: JsonField<Intelligence>,
    private val referencedModels: JsonField<List<String>>,
    private val scanError: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
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
        @JsonProperty("end_time")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("has_genealogy")
        @ExcludeMissing
        hasGenealogy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("intelligence")
        @ExcludeMissing
        intelligence: JsonField<Intelligence> = JsonMissing.of(),
        @JsonProperty("referenced_models")
        @ExcludeMissing
        referencedModels: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("scan_error")
        @ExcludeMissing
        scanError: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        inventory,
        scanId,
        startTime,
        status,
        summary,
        version,
        schemaVersion,
        compliance,
        endTime,
        hasGenealogy,
        intelligence,
        referencedModels,
        scanError,
        mutableMapOf(),
    )

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
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun schemaVersion(): Optional<String> = schemaVersion.getOptional("\$schema_version")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compliance(): Optional<Compliance> = compliance.getOptional("compliance")

    /**
     * time the scan ended
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("end_time")

    /**
     * if there is model geneaology info available
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasGenealogy(): Optional<Boolean> = hasGenealogy.getOptional("has_genealogy")

    /**
     * Intelligence metadata about a model including origin, licensing, and usage policies
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intelligence(): Optional<Intelligence> = intelligence.getOptional("intelligence")

    /**
     * URLs of model artifact files referenced in a NIM container's model_manifest.yaml. Only
     * present for NIM container scans.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedModels(): Optional<List<String>> =
        referencedModels.getOptional("referenced_models")

    /**
     * Error messages returned by the scanner
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanError(): Optional<List<String>> = scanError.getOptional("scan_error")

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
     * Unlike [schemaVersion], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [hasGenealogy].
     *
     * Unlike [hasGenealogy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_genealogy")
    @ExcludeMissing
    fun _hasGenealogy(): JsonField<Boolean> = hasGenealogy

    /**
     * Returns the raw JSON value of [intelligence].
     *
     * Unlike [intelligence], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intelligence")
    @ExcludeMissing
    fun _intelligence(): JsonField<Intelligence> = intelligence

    /**
     * Returns the raw JSON value of [referencedModels].
     *
     * Unlike [referencedModels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referenced_models")
    @ExcludeMissing
    fun _referencedModels(): JsonField<List<String>> = referencedModels

    /**
     * Returns the raw JSON value of [scanError].
     *
     * Unlike [scanError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scan_error")
    @ExcludeMissing
    fun _scanError(): JsonField<List<String>> = scanError

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
         * Returns a mutable builder for constructing an instance of [ScanReportSummary].
         *
         * The following fields are required:
         * ```java
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

    /** A builder for [ScanReportSummary]. */
    class Builder internal constructor() {

        private var inventory: JsonField<Inventory>? = null
        private var scanId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var summary: JsonField<Summary>? = null
        private var version: JsonField<String>? = null
        private var schemaVersion: JsonField<String> = JsonMissing.of()
        private var compliance: JsonField<Compliance> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hasGenealogy: JsonField<Boolean> = JsonMissing.of()
        private var intelligence: JsonField<Intelligence> = JsonMissing.of()
        private var referencedModels: JsonField<MutableList<String>>? = null
        private var scanError: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scanReportSummary: ScanReportSummary) = apply {
            inventory = scanReportSummary.inventory
            scanId = scanReportSummary.scanId
            startTime = scanReportSummary.startTime
            status = scanReportSummary.status
            summary = scanReportSummary.summary
            version = scanReportSummary.version
            schemaVersion = scanReportSummary.schemaVersion
            compliance = scanReportSummary.compliance
            endTime = scanReportSummary.endTime
            hasGenealogy = scanReportSummary.hasGenealogy
            intelligence = scanReportSummary.intelligence
            referencedModels = scanReportSummary.referencedModels.map { it.toMutableList() }
            scanError = scanReportSummary.scanError.map { it.toMutableList() }
            additionalProperties = scanReportSummary.additionalProperties.toMutableMap()
        }

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

        fun summary(summary: Summary) = summary(JsonField.of(summary))

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [Summary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<Summary>) = apply { this.summary = summary }

        /** scanner version */
        fun version(version: String) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** version of the scan report schema format */
        fun schemaVersion(schemaVersion: String) = schemaVersion(JsonField.of(schemaVersion))

        /**
         * Sets [Builder.schemaVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schemaVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
        fun compliance(compliance: JsonField<Compliance>) = apply { this.compliance = compliance }

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
         * You should usually call [Builder.hasGenealogy] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasGenealogy(hasGenealogy: JsonField<Boolean>) = apply {
            this.hasGenealogy = hasGenealogy
        }

        /** Intelligence metadata about a model including origin, licensing, and usage policies */
        fun intelligence(intelligence: Intelligence) = intelligence(JsonField.of(intelligence))

        /**
         * Sets [Builder.intelligence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intelligence] with a well-typed [Intelligence] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intelligence(intelligence: JsonField<Intelligence>) = apply {
            this.intelligence = intelligence
        }

        /**
         * URLs of model artifact files referenced in a NIM container's model_manifest.yaml. Only
         * present for NIM container scans.
         */
        fun referencedModels(referencedModels: List<String>) =
            referencedModels(JsonField.of(referencedModels))

        /**
         * Sets [Builder.referencedModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedModels] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedModels(referencedModels: JsonField<List<String>>) = apply {
            this.referencedModels = referencedModels.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [referencedModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferencedModel(referencedModel: String) = apply {
            referencedModels =
                (referencedModels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("referencedModels", it).add(referencedModel)
                }
        }

        /** Error messages returned by the scanner */
        fun scanError(scanError: List<String>) = scanError(JsonField.of(scanError))

        /**
         * Sets [Builder.scanError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanError] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scanError(scanError: JsonField<List<String>>) = apply {
            this.scanError = scanError.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.scanError].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScanError(scanError: String) = apply {
            this.scanError =
                (this.scanError ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scanError", it).add(scanError)
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
         * Returns an immutable instance of [ScanReportSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
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
        fun build(): ScanReportSummary =
            ScanReportSummary(
                checkRequired("inventory", inventory),
                checkRequired("scanId", scanId),
                checkRequired("startTime", startTime),
                checkRequired("status", status),
                checkRequired("summary", summary),
                checkRequired("version", version),
                schemaVersion,
                compliance,
                endTime,
                hasGenealogy,
                intelligence,
                (referencedModels ?: JsonMissing.of()).map { it.toImmutable() },
                (scanError ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ScanReportSummary = apply {
        if (validated) {
            return@apply
        }

        inventory().validate()
        scanId()
        startTime()
        status().validate()
        summary().validate()
        version()
        schemaVersion()
        compliance().ifPresent { it.validate() }
        endTime()
        hasGenealogy()
        intelligence().ifPresent { it.validate() }
        referencedModels()
        scanError()
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
        (inventory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scanId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (summary.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (schemaVersion.asKnown().isPresent) 1 else 0) +
            (compliance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (hasGenealogy.asKnown().isPresent) 1 else 0) +
            (intelligence.asKnown().getOrNull()?.validity() ?: 0) +
            (referencedModels.asKnown().getOrNull()?.size ?: 0) +
            (scanError.asKnown().getOrNull()?.size ?: 0)

    class Inventory
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelId: JsonField<String>,
        private val modelName: JsonField<String>,
        private val modelVersionId: JsonField<String>,
        private val requestedScanLocation: JsonField<String>,
        private val assetId: JsonField<String>,
        private val assetRegion: JsonField<String>,
        private val fileLocation: JsonField<String>,
        private val modelSource: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val origin: JsonField<String>,
        private val providerDetails: JsonField<ProviderDetails>,
        private val requestSource: JsonField<RequestSource>,
        private val requestingEntity: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model_id") @ExcludeMissing modelId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_version_id")
            @ExcludeMissing
            modelVersionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_scan_location")
            @ExcludeMissing
            requestedScanLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("asset_id") @ExcludeMissing assetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("asset_region")
            @ExcludeMissing
            assetRegion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_location")
            @ExcludeMissing
            fileLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_source")
            @ExcludeMissing
            modelSource: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_version")
            @ExcludeMissing
            modelVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_details")
            @ExcludeMissing
            providerDetails: JsonField<ProviderDetails> = JsonMissing.of(),
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
            assetId,
            assetRegion,
            fileLocation,
            modelSource,
            modelVersion,
            origin,
            providerDetails,
            requestSource,
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
         * Identifier of discovered asset
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assetId(): Optional<String> = assetId.getOptional("asset_id")

        /**
         * Region of discovered asset
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assetRegion(): Optional<String> = assetRegion.getOptional("asset_region")

        /**
         * URL or path to the model files, if available
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileLocation(): Optional<String> = fileLocation.getOptional("file_location")

        /**
         * source (provider) info
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelSource(): Optional<String> = modelSource.getOptional("model_source")

        /**
         * version of the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelVersion(): Optional<String> = modelVersion.getOptional("model_version")

        /**
         * Specifies the platform or service where the model originated before being scanned
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun providerDetails(): Optional<ProviderDetails> =
            providerDetails.getOptional("provider_details")

        /**
         * Identifies the system that requested the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requestSource(): Optional<RequestSource> = requestSource.getOptional("request_source")

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
         * Returns the raw JSON value of [assetId].
         *
         * Unlike [assetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_id") @ExcludeMissing fun _assetId(): JsonField<String> = assetId

        /**
         * Returns the raw JSON value of [assetRegion].
         *
         * Unlike [assetRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_region")
        @ExcludeMissing
        fun _assetRegion(): JsonField<String> = assetRegion

        /**
         * Returns the raw JSON value of [fileLocation].
         *
         * Unlike [fileLocation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("file_location")
        @ExcludeMissing
        fun _fileLocation(): JsonField<String> = fileLocation

        /**
         * Returns the raw JSON value of [modelSource].
         *
         * Unlike [modelSource], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns the raw JSON value of [providerDetails].
         *
         * Unlike [providerDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_details")
        @ExcludeMissing
        fun _providerDetails(): JsonField<ProviderDetails> = providerDetails

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
            private var assetId: JsonField<String> = JsonMissing.of()
            private var assetRegion: JsonField<String> = JsonMissing.of()
            private var fileLocation: JsonField<String> = JsonMissing.of()
            private var modelSource: JsonField<String> = JsonMissing.of()
            private var modelVersion: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var providerDetails: JsonField<ProviderDetails> = JsonMissing.of()
            private var requestSource: JsonField<RequestSource> = JsonMissing.of()
            private var requestingEntity: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inventory: Inventory) = apply {
                modelId = inventory.modelId
                modelName = inventory.modelName
                modelVersionId = inventory.modelVersionId
                requestedScanLocation = inventory.requestedScanLocation
                assetId = inventory.assetId
                assetRegion = inventory.assetRegion
                fileLocation = inventory.fileLocation
                modelSource = inventory.modelSource
                modelVersion = inventory.modelVersion
                origin = inventory.origin
                providerDetails = inventory.providerDetails
                requestSource = inventory.requestSource
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

            /** Identifier of discovered asset */
            fun assetId(assetId: String) = assetId(JsonField.of(assetId))

            /**
             * Sets [Builder.assetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetId(assetId: JsonField<String>) = apply { this.assetId = assetId }

            /** Region of discovered asset */
            fun assetRegion(assetRegion: String) = assetRegion(JsonField.of(assetRegion))

            /**
             * Sets [Builder.assetRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetRegion(assetRegion: JsonField<String>) = apply {
                this.assetRegion = assetRegion
            }

            /** URL or path to the model files, if available */
            fun fileLocation(fileLocation: String) = fileLocation(JsonField.of(fileLocation))

            /**
             * Sets [Builder.fileLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileLocation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileLocation(fileLocation: JsonField<String>) = apply {
                this.fileLocation = fileLocation
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

            /** Specifies the platform or service where the model originated before being scanned */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            fun providerDetails(providerDetails: ProviderDetails) =
                providerDetails(JsonField.of(providerDetails))

            /**
             * Sets [Builder.providerDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerDetails] with a well-typed [ProviderDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerDetails(providerDetails: JsonField<ProviderDetails>) = apply {
                this.providerDetails = providerDetails
            }

            /** Identifies the system that requested the scan */
            fun requestSource(requestSource: RequestSource) =
                requestSource(JsonField.of(requestSource))

            /**
             * Sets [Builder.requestSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestSource] with a well-typed [RequestSource]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
                    assetId,
                    assetRegion,
                    fileLocation,
                    modelSource,
                    modelVersion,
                    origin,
                    providerDetails,
                    requestSource,
                    requestingEntity,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Inventory = apply {
            if (validated) {
                return@apply
            }

            modelId()
            modelName()
            modelVersionId()
            requestedScanLocation()
            assetId()
            assetRegion()
            fileLocation()
            modelSource()
            modelVersion()
            origin()
            providerDetails().ifPresent { it.validate() }
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
                (if (assetId.asKnown().isPresent) 1 else 0) +
                (if (assetRegion.asKnown().isPresent) 1 else 0) +
                (if (fileLocation.asKnown().isPresent) 1 else 0) +
                (if (modelSource.asKnown().isPresent) 1 else 0) +
                (if (modelVersion.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (providerDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (requestSource.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requestingEntity.asKnown().isPresent) 1 else 0)

        class ProviderDetails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val provider: JsonField<Provider>,
            private val providerModelId: JsonField<String>,
            private val country: JsonField<String>,
            private val modelArn: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("provider")
                @ExcludeMissing
                provider: JsonField<Provider> = JsonMissing.of(),
                @JsonProperty("provider_model_id")
                @ExcludeMissing
                providerModelId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("model_arn")
                @ExcludeMissing
                modelArn: JsonField<String> = JsonMissing.of(),
            ) : this(provider, providerModelId, country, modelArn, mutableMapOf())

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun provider(): Provider = provider.getRequired("provider")

            /**
             * The provider's unique identifier for the model. Examples:
             * - AWS Bedrock: "anthropic.claude-3-5-sonnet-20241022-v2:0"
             * - Azure AI Foundry: "Claude-3-5-Sonnet"
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun providerModelId(): String = providerModelId.getRequired("provider_model_id")

            /**
             * Optional country code (ISO 3166-1 alpha-2) for the location where the model provider
             * is primarily based.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * Optional full ARN or resource identifier for the model. Used for provisioned models,
             * custom deployments, or cross-account access.
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun modelArn(): Optional<String> = modelArn.getOptional("model_arn")

            /**
             * Returns the raw JSON value of [provider].
             *
             * Unlike [provider], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("provider")
            @ExcludeMissing
            fun _provider(): JsonField<Provider> = provider

            /**
             * Returns the raw JSON value of [providerModelId].
             *
             * Unlike [providerModelId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("provider_model_id")
            @ExcludeMissing
            fun _providerModelId(): JsonField<String> = providerModelId

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [modelArn].
             *
             * Unlike [modelArn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("model_arn") @ExcludeMissing fun _modelArn(): JsonField<String> = modelArn

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
                 * Returns a mutable builder for constructing an instance of [ProviderDetails].
                 *
                 * The following fields are required:
                 * ```java
                 * .provider()
                 * .providerModelId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderDetails]. */
            class Builder internal constructor() {

                private var provider: JsonField<Provider>? = null
                private var providerModelId: JsonField<String>? = null
                private var country: JsonField<String> = JsonMissing.of()
                private var modelArn: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerDetails: ProviderDetails) = apply {
                    provider = providerDetails.provider
                    providerModelId = providerDetails.providerModelId
                    country = providerDetails.country
                    modelArn = providerDetails.modelArn
                    additionalProperties = providerDetails.additionalProperties.toMutableMap()
                }

                fun provider(provider: Provider) = provider(JsonField.of(provider))

                /**
                 * Sets [Builder.provider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.provider] with a well-typed [Provider] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

                /**
                 * The provider's unique identifier for the model. Examples:
                 * - AWS Bedrock: "anthropic.claude-3-5-sonnet-20241022-v2:0"
                 * - Azure AI Foundry: "Claude-3-5-Sonnet"
                 */
                fun providerModelId(providerModelId: String) =
                    providerModelId(JsonField.of(providerModelId))

                /**
                 * Sets [Builder.providerModelId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerModelId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun providerModelId(providerModelId: JsonField<String>) = apply {
                    this.providerModelId = providerModelId
                }

                /**
                 * Optional country code (ISO 3166-1 alpha-2) for the location where the model
                 * provider is primarily based.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /**
                 * Optional full ARN or resource identifier for the model. Used for provisioned
                 * models, custom deployments, or cross-account access.
                 */
                fun modelArn(modelArn: String) = modelArn(JsonField.of(modelArn))

                /**
                 * Sets [Builder.modelArn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modelArn] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun modelArn(modelArn: JsonField<String>) = apply { this.modelArn = modelArn }

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
                 * Returns an immutable instance of [ProviderDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .provider()
                 * .providerModelId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProviderDetails =
                    ProviderDetails(
                        checkRequired("provider", provider),
                        checkRequired("providerModelId", providerModelId),
                        country,
                        modelArn,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): ProviderDetails = apply {
                if (validated) {
                    return@apply
                }

                provider().validate()
                providerModelId()
                country()
                modelArn()
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
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (providerModelId.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (modelArn.asKnown().isPresent) 1 else 0)

            class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val AWS_BEDROCK = of("AWS_BEDROCK")

                    @JvmField val AWS_SAGEMAKER = of("AWS_SAGEMAKER")

                    @JvmField val AZURE_AI_FOUNDRY = of("AZURE_AI_FOUNDRY")

                    @JvmField val AZURE_ML = of("AZURE_ML")

                    @JvmField val DATABRICKS = of("DATABRICKS")

                    @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                }

                /** An enum containing [Provider]'s known values. */
                enum class Known {
                    AWS_BEDROCK,
                    AWS_SAGEMAKER,
                    AZURE_AI_FOUNDRY,
                    AZURE_ML,
                    DATABRICKS,
                }

                /**
                 * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Provider] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AWS_BEDROCK,
                    AWS_SAGEMAKER,
                    AZURE_AI_FOUNDRY,
                    AZURE_ML,
                    DATABRICKS,
                    /**
                     * An enum member indicating that [Provider] was instantiated with an unknown
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
                        AWS_BEDROCK -> Value.AWS_BEDROCK
                        AWS_SAGEMAKER -> Value.AWS_SAGEMAKER
                        AZURE_AI_FOUNDRY -> Value.AZURE_AI_FOUNDRY
                        AZURE_ML -> Value.AZURE_ML
                        DATABRICKS -> Value.DATABRICKS
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
                        AWS_BEDROCK -> Known.AWS_BEDROCK
                        AWS_SAGEMAKER -> Known.AWS_SAGEMAKER
                        AZURE_AI_FOUNDRY -> Known.AZURE_AI_FOUNDRY
                        AZURE_ML -> Known.AZURE_ML
                        DATABRICKS -> Known.DATABRICKS
                        else -> throw HiddenLayerInvalidDataException("Unknown Provider: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Provider = apply {
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

                    return other is Provider && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProviderDetails &&
                    provider == other.provider &&
                    providerModelId == other.providerModelId &&
                    country == other.country &&
                    modelArn == other.modelArn &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(provider, providerModelId, country, modelArn, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProviderDetails{provider=$provider, providerModelId=$providerModelId, country=$country, modelArn=$modelArn, additionalProperties=$additionalProperties}"
        }

        /** Identifies the system that requested the scan */
        class RequestSource @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * An enum containing [RequestSource]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RequestSource] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                HYBRID_UPLOAD,
                API_UPLOAD,
                INTEGRATION,
                UI_UPLOAD,
                AI_ASSET_DISCOVERY,
                /**
                 * An enum member indicating that [RequestSource] was instantiated with an unknown
                 * value.
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
                    else -> throw HiddenLayerInvalidDataException("Unknown RequestSource: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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
                assetId == other.assetId &&
                assetRegion == other.assetRegion &&
                fileLocation == other.fileLocation &&
                modelSource == other.modelSource &&
                modelVersion == other.modelVersion &&
                origin == other.origin &&
                providerDetails == other.providerDetails &&
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
                assetId,
                assetRegion,
                fileLocation,
                modelSource,
                modelVersion,
                origin,
                providerDetails,
                requestSource,
                requestingEntity,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inventory{modelId=$modelId, modelName=$modelName, modelVersionId=$modelVersionId, requestedScanLocation=$requestedScanLocation, assetId=$assetId, assetRegion=$assetRegion, fileLocation=$fileLocation, modelSource=$modelSource, modelVersion=$modelVersion, origin=$origin, providerDetails=$providerDetails, requestSource=$requestSource, requestingEntity=$requestingEntity, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
        private val advisoryCategories: JsonField<List<String>>,
        private val advisoryCount: JsonField<Long>,
        private val detectionCategories: JsonField<List<String>>,
        private val detectionCount: JsonField<Long>,
        private val fileCount: JsonField<Long>,
        private val filesFailedToScan: JsonField<Long>,
        private val filesWithDetectionsCount: JsonField<Long>,
        private val highestSeverity: JsonField<HighestSeverity>,
        private val mitreAtlas: JsonField<List<MitreAtlas>>,
        private val severity: JsonField<Severity>,
        private val unknownFiles: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("advisory_categories")
            @ExcludeMissing
            advisoryCategories: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("advisory_count")
            @ExcludeMissing
            advisoryCount: JsonField<Long> = JsonMissing.of(),
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
            @JsonProperty("mitre_atlas")
            @ExcludeMissing
            mitreAtlas: JsonField<List<MitreAtlas>> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("unknown_files")
            @ExcludeMissing
            unknownFiles: JsonField<Long> = JsonMissing.of(),
        ) : this(
            advisoryCategories,
            advisoryCount,
            detectionCategories,
            detectionCount,
            fileCount,
            filesFailedToScan,
            filesWithDetectionsCount,
            highestSeverity,
            mitreAtlas,
            severity,
            unknownFiles,
            mutableMapOf(),
        )

        /**
         * list of unique advisory categories found
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun advisoryCategories(): Optional<List<String>> =
            advisoryCategories.getOptional("advisory_categories")

        /**
         * total number of advisories found
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun advisoryCount(): Optional<Long> = advisoryCount.getOptional("advisory_count")

        /**
         * list of unique detection categories found
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun detectionCategories(): Optional<List<String>> =
            detectionCategories.getOptional("detection_categories")

        /**
         * total number of detections found
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun detectionCount(): Optional<Long> = detectionCount.getOptional("detection_count")

        /**
         * total number of files scanned
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileCount(): Optional<Long> = fileCount.getOptional("file_count")

        /**
         * number of files that failed during scanning
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filesFailedToScan(): Optional<Long> =
            filesFailedToScan.getOptional("files_failed_to_scan")

        /**
         * number of files that contain detections
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun filesWithDetectionsCount(): Optional<Long> =
            filesWithDetectionsCount.getOptional("files_with_detections_count")

        /**
         * The highest severity of any detections on the scan.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun highestSeverity(): Optional<HighestSeverity> =
            highestSeverity.getOptional("highest_severity")

        /**
         * deduped list of MITRE Atlas tactic/technique pairs across all detections in the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mitreAtlas(): Optional<List<MitreAtlas>> = mitreAtlas.getOptional("mitre_atlas")

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
         * number of files with unknown file type
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unknownFiles(): Optional<Long> = unknownFiles.getOptional("unknown_files")

        /**
         * Returns the raw JSON value of [advisoryCategories].
         *
         * Unlike [advisoryCategories], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("advisory_categories")
        @ExcludeMissing
        fun _advisoryCategories(): JsonField<List<String>> = advisoryCategories

        /**
         * Returns the raw JSON value of [advisoryCount].
         *
         * Unlike [advisoryCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("advisory_count")
        @ExcludeMissing
        fun _advisoryCount(): JsonField<Long> = advisoryCount

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
         * Unlike [detectionCount], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Returns the raw JSON value of [filesFailedToScan].
         *
         * Unlike [filesFailedToScan], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [highestSeverity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("highest_severity")
        @ExcludeMissing
        fun _highestSeverity(): JsonField<HighestSeverity> = highestSeverity

        /**
         * Returns the raw JSON value of [mitreAtlas].
         *
         * Unlike [mitreAtlas], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mitre_atlas")
        @ExcludeMissing
        fun _mitreAtlas(): JsonField<List<MitreAtlas>> = mitreAtlas

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
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

            private var advisoryCategories: JsonField<MutableList<String>>? = null
            private var advisoryCount: JsonField<Long> = JsonMissing.of()
            private var detectionCategories: JsonField<MutableList<String>>? = null
            private var detectionCount: JsonField<Long> = JsonMissing.of()
            private var fileCount: JsonField<Long> = JsonMissing.of()
            private var filesFailedToScan: JsonField<Long> = JsonMissing.of()
            private var filesWithDetectionsCount: JsonField<Long> = JsonMissing.of()
            private var highestSeverity: JsonField<HighestSeverity> = JsonMissing.of()
            private var mitreAtlas: JsonField<MutableList<MitreAtlas>>? = null
            private var severity: JsonField<Severity> = JsonMissing.of()
            private var unknownFiles: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(summary: Summary) = apply {
                advisoryCategories = summary.advisoryCategories.map { it.toMutableList() }
                advisoryCount = summary.advisoryCount
                detectionCategories = summary.detectionCategories.map { it.toMutableList() }
                detectionCount = summary.detectionCount
                fileCount = summary.fileCount
                filesFailedToScan = summary.filesFailedToScan
                filesWithDetectionsCount = summary.filesWithDetectionsCount
                highestSeverity = summary.highestSeverity
                mitreAtlas = summary.mitreAtlas.map { it.toMutableList() }
                severity = summary.severity
                unknownFiles = summary.unknownFiles
                additionalProperties = summary.additionalProperties.toMutableMap()
            }

            /** list of unique advisory categories found */
            fun advisoryCategories(advisoryCategories: List<String>) =
                advisoryCategories(JsonField.of(advisoryCategories))

            /**
             * Sets [Builder.advisoryCategories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advisoryCategories] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun advisoryCategories(advisoryCategories: JsonField<List<String>>) = apply {
                this.advisoryCategories = advisoryCategories.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [advisoryCategories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdvisoryCategory(advisoryCategory: String) = apply {
                advisoryCategories =
                    (advisoryCategories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("advisoryCategories", it).add(advisoryCategory)
                    }
            }

            /** total number of advisories found */
            fun advisoryCount(advisoryCount: Long) = advisoryCount(JsonField.of(advisoryCount))

            /**
             * Sets [Builder.advisoryCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.advisoryCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun advisoryCount(advisoryCount: JsonField<Long>) = apply {
                this.advisoryCount = advisoryCount
            }

            /** list of unique detection categories found */
            fun detectionCategories(detectionCategories: List<String>) =
                detectionCategories(JsonField.of(detectionCategories))

            /**
             * Sets [Builder.detectionCategories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionCategories] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
            fun detectionCount(detectionCount: Long) = detectionCount(JsonField.of(detectionCount))

            /**
             * Sets [Builder.detectionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectionCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectionCount(detectionCount: JsonField<Long>) = apply {
                this.detectionCount = detectionCount
            }

            /** total number of files scanned */
            fun fileCount(fileCount: Long) = fileCount(JsonField.of(fileCount))

            /**
             * Sets [Builder.fileCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileCount(fileCount: JsonField<Long>) = apply { this.fileCount = fileCount }

            /** number of files that failed during scanning */
            fun filesFailedToScan(filesFailedToScan: Long) =
                filesFailedToScan(JsonField.of(filesFailedToScan))

            /**
             * Sets [Builder.filesFailedToScan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filesFailedToScan] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.filesWithDetectionsCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.highestSeverity] with a well-typed [HighestSeverity]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun highestSeverity(highestSeverity: JsonField<HighestSeverity>) = apply {
                this.highestSeverity = highestSeverity
            }

            /**
             * deduped list of MITRE Atlas tactic/technique pairs across all detections in the scan
             */
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

            /** number of files with unknown file type */
            fun unknownFiles(unknownFiles: Long) = unknownFiles(JsonField.of(unknownFiles))

            /**
             * Sets [Builder.unknownFiles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unknownFiles] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
                    (advisoryCategories ?: JsonMissing.of()).map { it.toImmutable() },
                    advisoryCount,
                    (detectionCategories ?: JsonMissing.of()).map { it.toImmutable() },
                    detectionCount,
                    fileCount,
                    filesFailedToScan,
                    filesWithDetectionsCount,
                    highestSeverity,
                    (mitreAtlas ?: JsonMissing.of()).map { it.toImmutable() },
                    severity,
                    unknownFiles,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Summary = apply {
            if (validated) {
                return@apply
            }

            advisoryCategories()
            advisoryCount()
            detectionCategories()
            detectionCount()
            fileCount()
            filesFailedToScan()
            filesWithDetectionsCount()
            highestSeverity().ifPresent { it.validate() }
            mitreAtlas().ifPresent { it.forEach { it.validate() } }
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
            (advisoryCategories.asKnown().getOrNull()?.size ?: 0) +
                (if (advisoryCount.asKnown().isPresent) 1 else 0) +
                (detectionCategories.asKnown().getOrNull()?.size ?: 0) +
                (if (detectionCount.asKnown().isPresent) 1 else 0) +
                (if (fileCount.asKnown().isPresent) 1 else 0) +
                (if (filesFailedToScan.asKnown().isPresent) 1 else 0) +
                (if (filesWithDetectionsCount.asKnown().isPresent) 1 else 0) +
                (highestSeverity.asKnown().getOrNull()?.validity() ?: 0) +
                (mitreAtlas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (severity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unknownFiles.asKnown().isPresent) 1 else 0)

        /** The highest severity of any detections on the scan. */
        class HighestSeverity
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * An enum containing [HighestSeverity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [HighestSeverity] can contain an unknown value in a couple of cases:
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
                NONE,
                UNKNOWN,
                /**
                 * An enum member indicating that [HighestSeverity] was instantiated with an unknown
                 * value.
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
                    else -> throw HiddenLayerInvalidDataException("Unknown HighestSeverity: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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

        class MitreAtlas
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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

                return other is MitreAtlas &&
                    tactic == other.tactic &&
                    technique == other.technique &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(tactic, technique, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MitreAtlas{tactic=$tactic, technique=$technique, additionalProperties=$additionalProperties}"
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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
                advisoryCategories == other.advisoryCategories &&
                advisoryCount == other.advisoryCount &&
                detectionCategories == other.detectionCategories &&
                detectionCount == other.detectionCount &&
                fileCount == other.fileCount &&
                filesFailedToScan == other.filesFailedToScan &&
                filesWithDetectionsCount == other.filesWithDetectionsCount &&
                highestSeverity == other.highestSeverity &&
                mitreAtlas == other.mitreAtlas &&
                severity == other.severity &&
                unknownFiles == other.unknownFiles &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                advisoryCategories,
                advisoryCount,
                detectionCategories,
                detectionCount,
                fileCount,
                filesFailedToScan,
                filesWithDetectionsCount,
                highestSeverity,
                mitreAtlas,
                severity,
                unknownFiles,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Summary{advisoryCategories=$advisoryCategories, advisoryCount=$advisoryCount, detectionCategories=$detectionCategories, detectionCount=$detectionCount, fileCount=$fileCount, filesFailedToScan=$filesFailedToScan, filesWithDetectionsCount=$filesWithDetectionsCount, highestSeverity=$highestSeverity, mitreAtlas=$mitreAtlas, severity=$severity, unknownFiles=$unknownFiles, additionalProperties=$additionalProperties}"
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
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evaluatedAt(): Optional<OffsetDateTime> = evaluatedAt.getOptional("evaluated_at")

        /**
         * A list of non-default rule sets that were used when evaluating the scan result
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ruleSetIds(): Optional<List<String>> = ruleSetIds.getOptional("rule_set_ids")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [evaluatedAt].
         *
         * Unlike [evaluatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("evaluated_at")
        @ExcludeMissing
        fun _evaluatedAt(): JsonField<OffsetDateTime> = evaluatedAt

        /**
         * Returns the raw JSON value of [ruleSetIds].
         *
         * Unlike [ruleSetIds], this method doesn't throw if the JSON field has an unexpected type.
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
            fun evaluatedAt(evaluatedAt: OffsetDateTime) = evaluatedAt(JsonField.of(evaluatedAt))

            /**
             * Sets [Builder.evaluatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluatedAt(evaluatedAt: JsonField<OffsetDateTime>) = apply {
                this.evaluatedAt = evaluatedAt
            }

            /** A list of non-default rule sets that were used when evaluating the scan result */
            fun ruleSetIds(ruleSetIds: List<String>) = ruleSetIds(JsonField.of(ruleSetIds))

            /**
             * Sets [Builder.ruleSetIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleSetIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMPLIANT,
                NONCOMPLIANT,
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
             * @throws HiddenLayerInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HiddenLayerInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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

    /** Intelligence metadata about a model including origin, licensing, and usage policies */
    class Intelligence
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contributorTrustLevel: JsonField<String>,
        private val countryOfOrigin: JsonField<String>,
        private val geographicFootprint: JsonField<List<String>>,
        private val licenses: JsonField<List<License>>,
        private val usagePolicies: JsonField<List<UsagePolicy>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contributor_trust_level")
            @ExcludeMissing
            contributorTrustLevel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country_of_origin")
            @ExcludeMissing
            countryOfOrigin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("geographic_footprint")
            @ExcludeMissing
            geographicFootprint: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("licenses")
            @ExcludeMissing
            licenses: JsonField<List<License>> = JsonMissing.of(),
            @JsonProperty("usage_policies")
            @ExcludeMissing
            usagePolicies: JsonField<List<UsagePolicy>> = JsonMissing.of(),
        ) : this(
            contributorTrustLevel,
            countryOfOrigin,
            geographicFootprint,
            licenses,
            usagePolicies,
            mutableMapOf(),
        )

        /**
         * Trust level of the model contributor
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun contributorTrustLevel(): Optional<String> =
            contributorTrustLevel.getOptional("contributor_trust_level")

        /**
         * ISO 3166-1 alpha-2 country code of the model's primary origin
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun countryOfOrigin(): Optional<String> = countryOfOrigin.getOptional("country_of_origin")

        /**
         * List of countries where the model originated
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun geographicFootprint(): Optional<List<String>> =
            geographicFootprint.getOptional("geographic_footprint")

        /**
         * List of licenses associated with the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun licenses(): Optional<List<License>> = licenses.getOptional("licenses")

        /**
         * List of usage policies associated with the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun usagePolicies(): Optional<List<UsagePolicy>> =
            usagePolicies.getOptional("usage_policies")

        /**
         * Returns the raw JSON value of [contributorTrustLevel].
         *
         * Unlike [contributorTrustLevel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("contributor_trust_level")
        @ExcludeMissing
        fun _contributorTrustLevel(): JsonField<String> = contributorTrustLevel

        /**
         * Returns the raw JSON value of [countryOfOrigin].
         *
         * Unlike [countryOfOrigin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("country_of_origin")
        @ExcludeMissing
        fun _countryOfOrigin(): JsonField<String> = countryOfOrigin

        /**
         * Returns the raw JSON value of [geographicFootprint].
         *
         * Unlike [geographicFootprint], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("geographic_footprint")
        @ExcludeMissing
        fun _geographicFootprint(): JsonField<List<String>> = geographicFootprint

        /**
         * Returns the raw JSON value of [licenses].
         *
         * Unlike [licenses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("licenses")
        @ExcludeMissing
        fun _licenses(): JsonField<List<License>> = licenses

        /**
         * Returns the raw JSON value of [usagePolicies].
         *
         * Unlike [usagePolicies], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_policies")
        @ExcludeMissing
        fun _usagePolicies(): JsonField<List<UsagePolicy>> = usagePolicies

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

            /** Returns a mutable builder for constructing an instance of [Intelligence]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Intelligence]. */
        class Builder internal constructor() {

            private var contributorTrustLevel: JsonField<String> = JsonMissing.of()
            private var countryOfOrigin: JsonField<String> = JsonMissing.of()
            private var geographicFootprint: JsonField<MutableList<String>>? = null
            private var licenses: JsonField<MutableList<License>>? = null
            private var usagePolicies: JsonField<MutableList<UsagePolicy>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(intelligence: Intelligence) = apply {
                contributorTrustLevel = intelligence.contributorTrustLevel
                countryOfOrigin = intelligence.countryOfOrigin
                geographicFootprint = intelligence.geographicFootprint.map { it.toMutableList() }
                licenses = intelligence.licenses.map { it.toMutableList() }
                usagePolicies = intelligence.usagePolicies.map { it.toMutableList() }
                additionalProperties = intelligence.additionalProperties.toMutableMap()
            }

            /** Trust level of the model contributor */
            fun contributorTrustLevel(contributorTrustLevel: String) =
                contributorTrustLevel(JsonField.of(contributorTrustLevel))

            /**
             * Sets [Builder.contributorTrustLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contributorTrustLevel] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contributorTrustLevel(contributorTrustLevel: JsonField<String>) = apply {
                this.contributorTrustLevel = contributorTrustLevel
            }

            /** ISO 3166-1 alpha-2 country code of the model's primary origin */
            fun countryOfOrigin(countryOfOrigin: String) =
                countryOfOrigin(JsonField.of(countryOfOrigin))

            /**
             * Sets [Builder.countryOfOrigin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryOfOrigin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryOfOrigin(countryOfOrigin: JsonField<String>) = apply {
                this.countryOfOrigin = countryOfOrigin
            }

            /** List of countries where the model originated */
            fun geographicFootprint(geographicFootprint: List<String>) =
                geographicFootprint(JsonField.of(geographicFootprint))

            /**
             * Sets [Builder.geographicFootprint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geographicFootprint] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun geographicFootprint(geographicFootprint: JsonField<List<String>>) = apply {
                this.geographicFootprint = geographicFootprint.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.geographicFootprint].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGeographicFootprint(geographicFootprint: String) = apply {
                this.geographicFootprint =
                    (this.geographicFootprint ?: JsonField.of(mutableListOf())).also {
                        checkKnown("geographicFootprint", it).add(geographicFootprint)
                    }
            }

            /** List of licenses associated with the model */
            fun licenses(licenses: List<License>) = licenses(JsonField.of(licenses))

            /**
             * Sets [Builder.licenses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenses] with a well-typed `List<License>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenses(licenses: JsonField<List<License>>) = apply {
                this.licenses = licenses.map { it.toMutableList() }
            }

            /**
             * Adds a single [License] to [licenses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLicense(license: License) = apply {
                licenses =
                    (licenses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("licenses", it).add(license)
                    }
            }

            /** List of usage policies associated with the model */
            fun usagePolicies(usagePolicies: List<UsagePolicy>) =
                usagePolicies(JsonField.of(usagePolicies))

            /**
             * Sets [Builder.usagePolicies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usagePolicies] with a well-typed `List<UsagePolicy>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usagePolicies(usagePolicies: JsonField<List<UsagePolicy>>) = apply {
                this.usagePolicies = usagePolicies.map { it.toMutableList() }
            }

            /**
             * Adds a single [UsagePolicy] to [usagePolicies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsagePolicy(usagePolicy: UsagePolicy) = apply {
                usagePolicies =
                    (usagePolicies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usagePolicies", it).add(usagePolicy)
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
             * Returns an immutable instance of [Intelligence].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Intelligence =
                Intelligence(
                    contributorTrustLevel,
                    countryOfOrigin,
                    (geographicFootprint ?: JsonMissing.of()).map { it.toImmutable() },
                    (licenses ?: JsonMissing.of()).map { it.toImmutable() },
                    (usagePolicies ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HiddenLayerInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Intelligence = apply {
            if (validated) {
                return@apply
            }

            contributorTrustLevel()
            countryOfOrigin()
            geographicFootprint()
            licenses().ifPresent { it.forEach { it.validate() } }
            usagePolicies().ifPresent { it.forEach { it.validate() } }
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
            (if (contributorTrustLevel.asKnown().isPresent) 1 else 0) +
                (if (countryOfOrigin.asKnown().isPresent) 1 else 0) +
                (geographicFootprint.asKnown().getOrNull()?.size ?: 0) +
                (licenses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (usagePolicies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** License information for a model */
        class License
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val sha256: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            ) : this(name, sha256, mutableMapOf())

            /**
             * Name of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * SHA256 hash of the license file
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sha256(): String = sha256.getRequired("sha256")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [sha256].
             *
             * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

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
                 * Returns a mutable builder for constructing an instance of [License].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .sha256()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [License]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var sha256: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(license: License) = apply {
                    name = license.name
                    sha256 = license.sha256
                    additionalProperties = license.additionalProperties.toMutableMap()
                }

                /** Name of the license */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** SHA256 hash of the license file */
                fun sha256(sha256: String) = sha256(JsonField.of(sha256))

                /**
                 * Sets [Builder.sha256] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sha256] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

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
                 * Returns an immutable instance of [License].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .sha256()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): License =
                    License(
                        checkRequired("name", name),
                        checkRequired("sha256", sha256),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): License = apply {
                if (validated) {
                    return@apply
                }

                name()
                sha256()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (sha256.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is License &&
                    name == other.name &&
                    sha256 == other.sha256 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, sha256, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "License{name=$name, sha256=$sha256, additionalProperties=$additionalProperties}"
        }

        /** Usage policy information for a model */
        class UsagePolicy
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val sha256: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sha256") @ExcludeMissing sha256: JsonField<String> = JsonMissing.of(),
            ) : this(name, sha256, mutableMapOf())

            /**
             * Name of the usage policy
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * SHA256 hash of the policy document
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sha256(): String = sha256.getRequired("sha256")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [sha256].
             *
             * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

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
                 * Returns a mutable builder for constructing an instance of [UsagePolicy].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .sha256()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsagePolicy]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var sha256: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usagePolicy: UsagePolicy) = apply {
                    name = usagePolicy.name
                    sha256 = usagePolicy.sha256
                    additionalProperties = usagePolicy.additionalProperties.toMutableMap()
                }

                /** Name of the usage policy */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** SHA256 hash of the policy document */
                fun sha256(sha256: String) = sha256(JsonField.of(sha256))

                /**
                 * Sets [Builder.sha256] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sha256] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

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
                 * Returns an immutable instance of [UsagePolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * .sha256()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsagePolicy =
                    UsagePolicy(
                        checkRequired("name", name),
                        checkRequired("sha256", sha256),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws HiddenLayerInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): UsagePolicy = apply {
                if (validated) {
                    return@apply
                }

                name()
                sha256()
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
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (sha256.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UsagePolicy &&
                    name == other.name &&
                    sha256 == other.sha256 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, sha256, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsagePolicy{name=$name, sha256=$sha256, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Intelligence &&
                contributorTrustLevel == other.contributorTrustLevel &&
                countryOfOrigin == other.countryOfOrigin &&
                geographicFootprint == other.geographicFootprint &&
                licenses == other.licenses &&
                usagePolicies == other.usagePolicies &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contributorTrustLevel,
                countryOfOrigin,
                geographicFootprint,
                licenses,
                usagePolicies,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Intelligence{contributorTrustLevel=$contributorTrustLevel, countryOfOrigin=$countryOfOrigin, geographicFootprint=$geographicFootprint, licenses=$licenses, usagePolicies=$usagePolicies, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScanReportSummary &&
            inventory == other.inventory &&
            scanId == other.scanId &&
            startTime == other.startTime &&
            status == other.status &&
            summary == other.summary &&
            version == other.version &&
            schemaVersion == other.schemaVersion &&
            compliance == other.compliance &&
            endTime == other.endTime &&
            hasGenealogy == other.hasGenealogy &&
            intelligence == other.intelligence &&
            referencedModels == other.referencedModels &&
            scanError == other.scanError &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            inventory,
            scanId,
            startTime,
            status,
            summary,
            version,
            schemaVersion,
            compliance,
            endTime,
            hasGenealogy,
            intelligence,
            referencedModels,
            scanError,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScanReportSummary{inventory=$inventory, scanId=$scanId, startTime=$startTime, status=$status, summary=$summary, version=$version, schemaVersion=$schemaVersion, compliance=$compliance, endTime=$endTime, hasGenealogy=$hasGenealogy, intelligence=$intelligence, referencedModels=$referencedModels, scanError=$scanError, additionalProperties=$additionalProperties}"
}
