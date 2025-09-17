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
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScanJob
private constructor(
    private val inventory: JsonField<Inventory>,
    private val scanId: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inventory")
        @ExcludeMissing
        inventory: JsonField<Inventory> = JsonMissing.of(),
        @JsonProperty("scan_id") @ExcludeMissing scanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(inventory, scanId, status, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inventory(): Inventory = inventory.getRequired("inventory")

    /**
     * unique identifier for the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanId(): Optional<String> = scanId.getOptional("scan_id")

    /**
     * Status of the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

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

        /**
         * Returns a mutable builder for constructing an instance of [ScanJob].
         *
         * The following fields are required:
         * ```java
         * .inventory()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScanJob]. */
    class Builder internal constructor() {

        private var inventory: JsonField<Inventory>? = null
        private var scanId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scanJob: ScanJob) = apply {
            inventory = scanJob.inventory
            scanId = scanJob.scanId
            status = scanJob.status
            additionalProperties = scanJob.additionalProperties.toMutableMap()
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

        /** Status of the scan */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [ScanJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inventory()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScanJob =
            ScanJob(
                checkRequired("inventory", inventory),
                scanId,
                status,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScanJob = apply {
        if (validated) {
            return@apply
        }

        inventory().validate()
        scanId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (inventory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scanId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Inventory
    private constructor(
        private val modelName: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val requestedScanLocation: JsonField<String>,
        private val requestingEntity: JsonField<String>,
        private val origin: JsonField<String>,
        private val requestSource: JsonField<RequestSource>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model_name")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("model_version")
            @ExcludeMissing
            modelVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_scan_location")
            @ExcludeMissing
            requestedScanLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requesting_entity")
            @ExcludeMissing
            requestingEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_source")
            @ExcludeMissing
            requestSource: JsonField<RequestSource> = JsonMissing.of(),
        ) : this(
            modelName,
            modelVersion,
            requestedScanLocation,
            requestingEntity,
            origin,
            requestSource,
            mutableMapOf(),
        )

        /**
         * Name of the model
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("model_name")

        /**
         * If you do not provide a version, one will be generated for you.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelVersion(): String = modelVersion.getRequired("model_version")

        /**
         * Location to be scanned
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedScanLocation(): String =
            requestedScanLocation.getRequired("requested_scan_location")

        /**
         * Entity that requested the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestingEntity(): String = requestingEntity.getRequired("requesting_entity")

        /**
         * Specifies the platform or service where the model originated before being scanned
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * Identifies the system that requested the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requestSource(): Optional<RequestSource> = requestSource.getOptional("request_source")

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
         * Returns the raw JSON value of [requestedScanLocation].
         *
         * Unlike [requestedScanLocation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requested_scan_location")
        @ExcludeMissing
        fun _requestedScanLocation(): JsonField<String> = requestedScanLocation

        /**
         * Returns the raw JSON value of [requestingEntity].
         *
         * Unlike [requestingEntity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requesting_entity")
        @ExcludeMissing
        fun _requestingEntity(): JsonField<String> = requestingEntity

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
             * .modelName()
             * .modelVersion()
             * .requestedScanLocation()
             * .requestingEntity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inventory]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var modelVersion: JsonField<String>? = null
            private var requestedScanLocation: JsonField<String>? = null
            private var requestingEntity: JsonField<String>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var requestSource: JsonField<RequestSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inventory: Inventory) = apply {
                modelName = inventory.modelName
                modelVersion = inventory.modelVersion
                requestedScanLocation = inventory.requestedScanLocation
                requestingEntity = inventory.requestingEntity
                origin = inventory.origin
                requestSource = inventory.requestSource
                additionalProperties = inventory.additionalProperties.toMutableMap()
            }

            /** Name of the model */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** If you do not provide a version, one will be generated for you. */
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
             * .modelName()
             * .modelVersion()
             * .requestedScanLocation()
             * .requestingEntity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Inventory =
                Inventory(
                    checkRequired("modelName", modelName),
                    checkRequired("modelVersion", modelVersion),
                    checkRequired("requestedScanLocation", requestedScanLocation),
                    checkRequired("requestingEntity", requestingEntity),
                    origin,
                    requestSource,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Inventory = apply {
            if (validated) {
                return@apply
            }

            modelName()
            modelVersion()
            requestedScanLocation()
            requestingEntity()
            origin()
            requestSource().ifPresent { it.validate() }
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
            (if (modelName.asKnown().isPresent) 1 else 0) +
                (if (modelVersion.asKnown().isPresent) 1 else 0) +
                (if (requestedScanLocation.asKnown().isPresent) 1 else 0) +
                (if (requestingEntity.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (requestSource.asKnown().getOrNull()?.validity() ?: 0)

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

                @JvmStatic fun of(value: String) = RequestSource(JsonField.of(value))
            }

            /** An enum containing [RequestSource]'s known values. */
            enum class Known {
                HYBRID_UPLOAD,
                API_UPLOAD,
                INTEGRATION,
                UI_UPLOAD,
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
                modelName == other.modelName &&
                modelVersion == other.modelVersion &&
                requestedScanLocation == other.requestedScanLocation &&
                requestingEntity == other.requestingEntity &&
                origin == other.origin &&
                requestSource == other.requestSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                modelName,
                modelVersion,
                requestedScanLocation,
                requestingEntity,
                origin,
                requestSource,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inventory{modelName=$modelName, modelVersion=$modelVersion, requestedScanLocation=$requestedScanLocation, requestingEntity=$requestingEntity, origin=$origin, requestSource=$requestSource, additionalProperties=$additionalProperties}"
    }

    /** Status of the scan */
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScanJob &&
            inventory == other.inventory &&
            scanId == other.scanId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inventory, scanId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScanJob{inventory=$inventory, scanId=$scanId, status=$status, additionalProperties=$additionalProperties}"
}
