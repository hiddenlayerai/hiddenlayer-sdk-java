// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.jobs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.Enum
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ScanJob
private constructor(
    private val access: JsonField<Access>,
    private val inventory: JsonField<Inventory>,
    private val scanId: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("inventory")
        @ExcludeMissing
        inventory: JsonField<Inventory> = JsonMissing.of(),
        @JsonProperty("scan_id") @ExcludeMissing scanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(access, inventory, scanId, status, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun access(): Optional<Access> = access.getOptional("access")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inventory(): Optional<Inventory> = inventory.getOptional("inventory")

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
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

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

        /** Returns a mutable builder for constructing an instance of [ScanJob]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScanJob]. */
    class Builder internal constructor() {

        private var access: JsonField<Access> = JsonMissing.of()
        private var inventory: JsonField<Inventory> = JsonMissing.of()
        private var scanId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scanJob: ScanJob) = apply {
            access = scanJob.access
            inventory = scanJob.inventory
            scanId = scanJob.scanId
            status = scanJob.status
            additionalProperties = scanJob.additionalProperties.toMutableMap()
        }

        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

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
         */
        fun build(): ScanJob =
            ScanJob(access, inventory, scanId, status, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ScanJob = apply {
        if (validated) {
            return@apply
        }

        access().ifPresent { it.validate() }
        inventory().ifPresent { it.validate() }
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
        (access.asKnown().getOrNull()?.validity() ?: 0) +
            (inventory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scanId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0)

    class Access
    private constructor(
        private val source: JsonField<Source>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of()
        ) : this(source, mutableMapOf())

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun source(): Optional<Source> = source.getOptional("source")

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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

            /** Returns a mutable builder for constructing an instance of [Access]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Access]. */
        class Builder internal constructor() {

            private var source: JsonField<Source> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(access: Access) = apply {
                source = access.source
                additionalProperties = access.additionalProperties.toMutableMap()
            }

            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

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
             * Returns an immutable instance of [Access].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Access = Access(source, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Access = apply {
            if (validated) {
                return@apply
            }

            source().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (source.asKnown().getOrNull()?.validity() ?: 0)

        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val LOCAL = of("LOCAL")

                @JvmField val AWS_PRESIGNED = of("AWS_PRESIGNED")

                @JvmField val AWS_IAM_ROLE = of("AWS_IAM_ROLE")

                @JvmField val AZURE_BLOB_SAS = of("AZURE_BLOB_SAS")

                @JvmField val AZURE_BLOB_AD = of("AZURE_BLOB_AD")

                @JvmField val GOOGLE_SIGNED = of("GOOGLE_SIGNED")

                @JvmField val GOOGLE_OAUTH = of("GOOGLE_OAUTH")

                @JvmField val HUGGING_FACE = of("HUGGING_FACE")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                LOCAL,
                AWS_PRESIGNED,
                AWS_IAM_ROLE,
                AZURE_BLOB_SAS,
                AZURE_BLOB_AD,
                GOOGLE_SIGNED,
                GOOGLE_OAUTH,
                HUGGING_FACE,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                AWS_PRESIGNED,
                AWS_IAM_ROLE,
                AZURE_BLOB_SAS,
                AZURE_BLOB_AD,
                GOOGLE_SIGNED,
                GOOGLE_OAUTH,
                HUGGING_FACE,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    LOCAL -> Value.LOCAL
                    AWS_PRESIGNED -> Value.AWS_PRESIGNED
                    AWS_IAM_ROLE -> Value.AWS_IAM_ROLE
                    AZURE_BLOB_SAS -> Value.AZURE_BLOB_SAS
                    AZURE_BLOB_AD -> Value.AZURE_BLOB_AD
                    GOOGLE_SIGNED -> Value.GOOGLE_SIGNED
                    GOOGLE_OAUTH -> Value.GOOGLE_OAUTH
                    HUGGING_FACE -> Value.HUGGING_FACE
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
                    LOCAL -> Known.LOCAL
                    AWS_PRESIGNED -> Known.AWS_PRESIGNED
                    AWS_IAM_ROLE -> Known.AWS_IAM_ROLE
                    AZURE_BLOB_SAS -> Known.AZURE_BLOB_SAS
                    AZURE_BLOB_AD -> Known.AZURE_BLOB_AD
                    GOOGLE_SIGNED -> Known.GOOGLE_SIGNED
                    GOOGLE_OAUTH -> Known.GOOGLE_OAUTH
                    HUGGING_FACE -> Known.HUGGING_FACE
                    else -> throw HiddenLayerInvalidDataException("Unknown Source: $value")
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

            fun validate(): Source = apply {
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

                return /* spotless:off */ other is Source && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Access && source == other.source && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(source, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Access{source=$source, additionalProperties=$additionalProperties}"
    }

    class Inventory
    private constructor(
        private val modelName: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val requestedScanLocation: JsonField<String>,
        private val requestingEntity: JsonField<String>,
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
        ) : this(modelName, modelVersion, requestedScanLocation, requestingEntity, mutableMapOf())

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inventory: Inventory) = apply {
                modelName = inventory.modelName
                modelVersion = inventory.modelVersion
                requestedScanLocation = inventory.requestedScanLocation
                requestingEntity = inventory.requestingEntity
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
                (if (requestingEntity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Inventory && modelName == other.modelName && modelVersion == other.modelVersion && requestedScanLocation == other.requestedScanLocation && requestingEntity == other.requestingEntity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(modelName, modelVersion, requestedScanLocation, requestingEntity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inventory{modelName=$modelName, modelVersion=$modelVersion, requestedScanLocation=$requestedScanLocation, requestingEntity=$requestingEntity, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScanJob && access == other.access && inventory == other.inventory && scanId == other.scanId && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(access, inventory, scanId, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScanJob{access=$access, inventory=$inventory, scanId=$scanId, status=$status, additionalProperties=$additionalProperties}"
}
