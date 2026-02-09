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
import com.hiddenlayer.api.core.Params
import com.hiddenlayer.api.core.checkKnown
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Scan a remote model */
class JobRequestParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Access method for the location of files associated with the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun access(): Access = body.access()

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inventory(): Inventory = body.inventory()

    /**
     * unique identifier for the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scanId(): Optional<String> = body.scanId()

    /**
     * Status of the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = body.status()

    /**
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _access(): JsonField<Access> = body._access()

    /**
     * Returns the raw JSON value of [inventory].
     *
     * Unlike [inventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inventory(): JsonField<Inventory> = body._inventory()

    /**
     * Returns the raw JSON value of [scanId].
     *
     * Unlike [scanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scanId(): JsonField<String> = body._scanId()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobRequestParams].
         *
         * The following fields are required:
         * ```java
         * .access()
         * .inventory()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobRequestParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobRequestParams: JobRequestParams) = apply {
            body = jobRequestParams.body.toBuilder()
            additionalHeaders = jobRequestParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobRequestParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [access]
         * - [inventory]
         * - [scanId]
         * - [status]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Access method for the location of files associated with the scan */
        fun access(access: Access) = apply { body.access(access) }

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { body.access(access) }

        fun inventory(inventory: Inventory) = apply { body.inventory(inventory) }

        /**
         * Sets [Builder.inventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inventory] with a well-typed [Inventory] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inventory(inventory: JsonField<Inventory>) = apply { body.inventory(inventory) }

        /** unique identifier for the scan */
        fun scanId(scanId: String) = apply { body.scanId(scanId) }

        /**
         * Sets [Builder.scanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanId(scanId: JsonField<String>) = apply { body.scanId(scanId) }

        /** Status of the scan */
        fun status(status: Status) = apply { body.status(status) }

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [JobRequestParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .access()
         * .inventory()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobRequestParams =
            JobRequestParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * Access method for the location of files associated with the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun access(): Access = access.getRequired("access")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inventory(): Inventory = inventory.getRequired("inventory")

        /**
         * unique identifier for the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scanId(): Optional<String> = scanId.getOptional("scan_id")

        /**
         * Status of the scan
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .access()
             * .inventory()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var access: JsonField<Access>? = null
            private var inventory: JsonField<Inventory>? = null
            private var scanId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                access = body.access
                inventory = body.inventory
                scanId = body.scanId
                status = body.status
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Access method for the location of files associated with the scan */
            fun access(access: Access) = access(JsonField.of(access))

            /**
             * Sets [Builder.access] to an arbitrary JSON value.
             *
             * You should usually call [Builder.access] with a well-typed [Access] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun access(access: JsonField<Access>) = apply { this.access = access }

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

            /** Status of the scan */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .access()
             * .inventory()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("access", access),
                    checkRequired("inventory", inventory),
                    scanId,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            access().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (access.asKnown().getOrNull()?.validity() ?: 0) +
                (inventory.asKnown().getOrNull()?.validity() ?: 0) +
                (if (scanId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                access == other.access &&
                inventory == other.inventory &&
                scanId == other.scanId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(access, inventory, scanId, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{access=$access, inventory=$inventory, scanId=$scanId, status=$status, additionalProperties=$additionalProperties}"
    }

    /** Access method for the location of files associated with the scan */
    class Access
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

                @JvmField val NONE = of("NONE")

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
                NONE,
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
                NONE,
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
                    NONE -> Value.NONE
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
                    NONE -> Known.NONE
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Access &&
                source == other.source &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(source, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Access{source=$source, additionalProperties=$additionalProperties}"
    }

    class Inventory
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val requestingEntity: JsonField<String>,
        private val origin: JsonField<String>,
        private val requestSource: JsonField<RequestSource>,
        private val requestedScanLocation: JsonField<String>,
        private val scanTarget: JsonField<ScanTarget>,
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
            @JsonProperty("requesting_entity")
            @ExcludeMissing
            requestingEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_source")
            @ExcludeMissing
            requestSource: JsonField<RequestSource> = JsonMissing.of(),
            @JsonProperty("requested_scan_location")
            @ExcludeMissing
            requestedScanLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scan_target")
            @ExcludeMissing
            scanTarget: JsonField<ScanTarget> = JsonMissing.of(),
        ) : this(
            modelName,
            modelVersion,
            requestingEntity,
            origin,
            requestSource,
            requestedScanLocation,
            scanTarget,
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
         * **DEPRECATED**: Use `scan_target` instead. Location of files to be scanned. Maintained
         * for backwards compatibility. If both `requested_scan_location` and `scan_target` are
         * provided, `scan_target` takes precedence.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        @Deprecated("deprecated")
        fun requestedScanLocation(): Optional<String> =
            requestedScanLocation.getOptional("requested_scan_location")

        /**
         * Specifies what to scan. Must provide at least one of: deep_scan with file location
         * details, provider_details, or both.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scanTarget(): Optional<ScanTarget> = scanTarget.getOptional("scan_target")

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

        /**
         * Returns the raw JSON value of [requestedScanLocation].
         *
         * Unlike [requestedScanLocation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("requested_scan_location")
        @ExcludeMissing
        fun _requestedScanLocation(): JsonField<String> = requestedScanLocation

        /**
         * Returns the raw JSON value of [scanTarget].
         *
         * Unlike [scanTarget], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scan_target")
        @ExcludeMissing
        fun _scanTarget(): JsonField<ScanTarget> = scanTarget

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
             * .requestingEntity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inventory]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var modelVersion: JsonField<String>? = null
            private var requestingEntity: JsonField<String>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var requestSource: JsonField<RequestSource> = JsonMissing.of()
            private var requestedScanLocation: JsonField<String> = JsonMissing.of()
            private var scanTarget: JsonField<ScanTarget> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inventory: Inventory) = apply {
                modelName = inventory.modelName
                modelVersion = inventory.modelVersion
                requestingEntity = inventory.requestingEntity
                origin = inventory.origin
                requestSource = inventory.requestSource
                requestedScanLocation = inventory.requestedScanLocation
                scanTarget = inventory.scanTarget
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

            /**
             * **DEPRECATED**: Use `scan_target` instead. Location of files to be scanned.
             * Maintained for backwards compatibility. If both `requested_scan_location` and
             * `scan_target` are provided, `scan_target` takes precedence.
             */
            @Deprecated("deprecated")
            fun requestedScanLocation(requestedScanLocation: String) =
                requestedScanLocation(JsonField.of(requestedScanLocation))

            /**
             * Sets [Builder.requestedScanLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedScanLocation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            @Deprecated("deprecated")
            fun requestedScanLocation(requestedScanLocation: JsonField<String>) = apply {
                this.requestedScanLocation = requestedScanLocation
            }

            /**
             * Specifies what to scan. Must provide at least one of: deep_scan with file location
             * details, provider_details, or both.
             */
            fun scanTarget(scanTarget: ScanTarget) = scanTarget(JsonField.of(scanTarget))

            /**
             * Sets [Builder.scanTarget] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scanTarget] with a well-typed [ScanTarget] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scanTarget(scanTarget: JsonField<ScanTarget>) = apply {
                this.scanTarget = scanTarget
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
             * .requestingEntity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Inventory =
                Inventory(
                    checkRequired("modelName", modelName),
                    checkRequired("modelVersion", modelVersion),
                    checkRequired("requestingEntity", requestingEntity),
                    origin,
                    requestSource,
                    requestedScanLocation,
                    scanTarget,
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
            requestingEntity()
            origin()
            requestSource().ifPresent { it.validate() }
            requestedScanLocation()
            scanTarget().ifPresent { it.validate() }
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
                (if (requestingEntity.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (requestSource.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requestedScanLocation.asKnown().isPresent) 1 else 0) +
                (scanTarget.asKnown().getOrNull()?.validity() ?: 0)

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

        /**
         * Specifies what to scan. Must provide at least one of: deep_scan with file location
         * details, provider_details, or both.
         */
        class ScanTarget
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val assetRegion: JsonField<String>,
            private val deepScan: JsonField<DeepScan>,
            private val providerDetails: JsonField<ProviderDetails>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("asset_region")
                @ExcludeMissing
                assetRegion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deep_scan")
                @ExcludeMissing
                deepScan: JsonField<DeepScan> = JsonMissing.of(),
                @JsonProperty("provider_details")
                @ExcludeMissing
                providerDetails: JsonField<ProviderDetails> = JsonMissing.of(),
            ) : this(assetRegion, deepScan, providerDetails, mutableMapOf())

            /**
             * region of the discovered asset
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun assetRegion(): Optional<String> = assetRegion.getOptional("asset_region")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun deepScan(): Optional<DeepScan> = deepScan.getOptional("deep_scan")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun providerDetails(): Optional<ProviderDetails> =
                providerDetails.getOptional("provider_details")

            /**
             * Returns the raw JSON value of [assetRegion].
             *
             * Unlike [assetRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("asset_region")
            @ExcludeMissing
            fun _assetRegion(): JsonField<String> = assetRegion

            /**
             * Returns the raw JSON value of [deepScan].
             *
             * Unlike [deepScan], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deep_scan")
            @ExcludeMissing
            fun _deepScan(): JsonField<DeepScan> = deepScan

            /**
             * Returns the raw JSON value of [providerDetails].
             *
             * Unlike [providerDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("provider_details")
            @ExcludeMissing
            fun _providerDetails(): JsonField<ProviderDetails> = providerDetails

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

                /** Returns a mutable builder for constructing an instance of [ScanTarget]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ScanTarget]. */
            class Builder internal constructor() {

                private var assetRegion: JsonField<String> = JsonMissing.of()
                private var deepScan: JsonField<DeepScan> = JsonMissing.of()
                private var providerDetails: JsonField<ProviderDetails> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scanTarget: ScanTarget) = apply {
                    assetRegion = scanTarget.assetRegion
                    deepScan = scanTarget.deepScan
                    providerDetails = scanTarget.providerDetails
                    additionalProperties = scanTarget.additionalProperties.toMutableMap()
                }

                /** region of the discovered asset */
                fun assetRegion(assetRegion: String) = assetRegion(JsonField.of(assetRegion))

                /**
                 * Sets [Builder.assetRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assetRegion] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assetRegion(assetRegion: JsonField<String>) = apply {
                    this.assetRegion = assetRegion
                }

                fun deepScan(deepScan: DeepScan) = deepScan(JsonField.of(deepScan))

                /**
                 * Sets [Builder.deepScan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deepScan] with a well-typed [DeepScan] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun deepScan(deepScan: JsonField<DeepScan>) = apply { this.deepScan = deepScan }

                fun providerDetails(providerDetails: ProviderDetails) =
                    providerDetails(JsonField.of(providerDetails))

                /**
                 * Sets [Builder.providerDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providerDetails] with a well-typed
                 * [ProviderDetails] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun providerDetails(providerDetails: JsonField<ProviderDetails>) = apply {
                    this.providerDetails = providerDetails
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
                 * Returns an immutable instance of [ScanTarget].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ScanTarget =
                    ScanTarget(
                        assetRegion,
                        deepScan,
                        providerDetails,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ScanTarget = apply {
                if (validated) {
                    return@apply
                }

                assetRegion()
                deepScan().ifPresent { it.validate() }
                providerDetails().ifPresent { it.validate() }
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
                (if (assetRegion.asKnown().isPresent) 1 else 0) +
                    (deepScan.asKnown().getOrNull()?.validity() ?: 0) +
                    (providerDetails.asKnown().getOrNull()?.validity() ?: 0)

            class DeepScan
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val fileLocation: JsonField<String>,
                private val files: JsonField<List<File>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("file_location")
                    @ExcludeMissing
                    fileLocation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("files")
                    @ExcludeMissing
                    files: JsonField<List<File>> = JsonMissing.of(),
                ) : this(fileLocation, files, mutableMapOf())

                /**
                 * URL or path to the model files
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun fileLocation(): Optional<String> = fileLocation.getOptional("file_location")

                /**
                 * List of specific files to scan
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun files(): Optional<List<File>> = files.getOptional("files")

                /**
                 * Returns the raw JSON value of [fileLocation].
                 *
                 * Unlike [fileLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("file_location")
                @ExcludeMissing
                fun _fileLocation(): JsonField<String> = fileLocation

                /**
                 * Returns the raw JSON value of [files].
                 *
                 * Unlike [files], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("files") @ExcludeMissing fun _files(): JsonField<List<File>> = files

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

                    /** Returns a mutable builder for constructing an instance of [DeepScan]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DeepScan]. */
                class Builder internal constructor() {

                    private var fileLocation: JsonField<String> = JsonMissing.of()
                    private var files: JsonField<MutableList<File>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(deepScan: DeepScan) = apply {
                        fileLocation = deepScan.fileLocation
                        files = deepScan.files.map { it.toMutableList() }
                        additionalProperties = deepScan.additionalProperties.toMutableMap()
                    }

                    /** URL or path to the model files */
                    fun fileLocation(fileLocation: String) =
                        fileLocation(JsonField.of(fileLocation))

                    /**
                     * Sets [Builder.fileLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fileLocation] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fileLocation(fileLocation: JsonField<String>) = apply {
                        this.fileLocation = fileLocation
                    }

                    /** List of specific files to scan */
                    fun files(files: List<File>) = files(JsonField.of(files))

                    /**
                     * Sets [Builder.files] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.files] with a well-typed `List<File>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun files(files: JsonField<List<File>>) = apply {
                        this.files = files.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [File] to [files].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addFile(file: File) = apply {
                        files =
                            (files ?: JsonField.of(mutableListOf())).also {
                                checkKnown("files", it).add(file)
                            }
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
                     * Returns an immutable instance of [DeepScan].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DeepScan =
                        DeepScan(
                            fileLocation,
                            (files ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DeepScan = apply {
                    if (validated) {
                        return@apply
                    }

                    fileLocation()
                    files().ifPresent { it.forEach { it.validate() } }
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
                    (if (fileLocation.asKnown().isPresent) 1 else 0) +
                        (files.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class File
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val fileLocation: JsonField<String>,
                    private val fileNameAlias: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("file_location")
                        @ExcludeMissing
                        fileLocation: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("file_name_alias")
                        @ExcludeMissing
                        fileNameAlias: JsonField<String> = JsonMissing.of(),
                    ) : this(fileLocation, fileNameAlias, mutableMapOf())

                    /**
                     * URL or path to the specific file
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun fileLocation(): String = fileLocation.getRequired("file_location")

                    /**
                     * Optional alias for the file name
                     *
                     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun fileNameAlias(): Optional<String> =
                        fileNameAlias.getOptional("file_name_alias")

                    /**
                     * Returns the raw JSON value of [fileLocation].
                     *
                     * Unlike [fileLocation], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_location")
                    @ExcludeMissing
                    fun _fileLocation(): JsonField<String> = fileLocation

                    /**
                     * Returns the raw JSON value of [fileNameAlias].
                     *
                     * Unlike [fileNameAlias], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("file_name_alias")
                    @ExcludeMissing
                    fun _fileNameAlias(): JsonField<String> = fileNameAlias

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
                         * Returns a mutable builder for constructing an instance of [File].
                         *
                         * The following fields are required:
                         * ```java
                         * .fileLocation()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [File]. */
                    class Builder internal constructor() {

                        private var fileLocation: JsonField<String>? = null
                        private var fileNameAlias: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(file: File) = apply {
                            fileLocation = file.fileLocation
                            fileNameAlias = file.fileNameAlias
                            additionalProperties = file.additionalProperties.toMutableMap()
                        }

                        /** URL or path to the specific file */
                        fun fileLocation(fileLocation: String) =
                            fileLocation(JsonField.of(fileLocation))

                        /**
                         * Sets [Builder.fileLocation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileLocation] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun fileLocation(fileLocation: JsonField<String>) = apply {
                            this.fileLocation = fileLocation
                        }

                        /** Optional alias for the file name */
                        fun fileNameAlias(fileNameAlias: String) =
                            fileNameAlias(JsonField.of(fileNameAlias))

                        /**
                         * Sets [Builder.fileNameAlias] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.fileNameAlias] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun fileNameAlias(fileNameAlias: JsonField<String>) = apply {
                            this.fileNameAlias = fileNameAlias
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [File].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .fileLocation()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): File =
                            File(
                                checkRequired("fileLocation", fileLocation),
                                fileNameAlias,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): File = apply {
                        if (validated) {
                            return@apply
                        }

                        fileLocation()
                        fileNameAlias()
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
                        (if (fileLocation.asKnown().isPresent) 1 else 0) +
                            (if (fileNameAlias.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is File &&
                            fileLocation == other.fileLocation &&
                            fileNameAlias == other.fileNameAlias &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(fileLocation, fileNameAlias, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "File{fileLocation=$fileLocation, fileNameAlias=$fileNameAlias, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DeepScan &&
                        fileLocation == other.fileLocation &&
                        files == other.files &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(fileLocation, files, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DeepScan{fileLocation=$fileLocation, files=$files, additionalProperties=$additionalProperties}"
            }

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
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun provider(): Provider = provider.getRequired("provider")

                /**
                 * The provider's unique identifier for the model. Examples:
                 * - AWS Bedrock: "anthropic.claude-3-5-sonnet-20241022-v2:0"
                 * - Azure AI Foundry: "Claude-3-5-Sonnet"
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun providerModelId(): String = providerModelId.getRequired("provider_model_id")

                /**
                 * Optional country code (ISO 3166-1 alpha-2) for the location where the model
                 * provider is primarily based.
                 *
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun country(): Optional<String> = country.getOptional("country")

                /**
                 * Optional full ARN or resource identifier for the model. Used for provisioned
                 * models, custom deployments, or cross-account access.
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
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [modelArn].
                 *
                 * Unlike [modelArn], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("model_arn")
                @ExcludeMissing
                fun _modelArn(): JsonField<String> = modelArn

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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                class Provider
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val AWS_BEDROCK = of("AWS_BEDROCK")

                        @JvmField val AZURE_AI_FOUNDRY = of("AZURE_AI_FOUNDRY")

                        @JvmField val AWS_SAGEMAKER = of("AWS_SAGEMAKER")

                        @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
                    }

                    /** An enum containing [Provider]'s known values. */
                    enum class Known {
                        AWS_BEDROCK,
                        AZURE_AI_FOUNDRY,
                        AWS_SAGEMAKER,
                    }

                    /**
                     * An enum containing [Provider]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Provider] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AWS_BEDROCK,
                        AZURE_AI_FOUNDRY,
                        AWS_SAGEMAKER,
                        /**
                         * An enum member indicating that [Provider] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            AWS_BEDROCK -> Value.AWS_BEDROCK
                            AZURE_AI_FOUNDRY -> Value.AZURE_AI_FOUNDRY
                            AWS_SAGEMAKER -> Value.AWS_SAGEMAKER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws HiddenLayerInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            AWS_BEDROCK -> Known.AWS_BEDROCK
                            AZURE_AI_FOUNDRY -> Known.AZURE_AI_FOUNDRY
                            AWS_SAGEMAKER -> Known.AWS_SAGEMAKER
                            else ->
                                throw HiddenLayerInvalidDataException("Unknown Provider: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws HiddenLayerInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            HiddenLayerInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ScanTarget &&
                    assetRegion == other.assetRegion &&
                    deepScan == other.deepScan &&
                    providerDetails == other.providerDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(assetRegion, deepScan, providerDetails, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScanTarget{assetRegion=$assetRegion, deepScan=$deepScan, providerDetails=$providerDetails, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inventory &&
                modelName == other.modelName &&
                modelVersion == other.modelVersion &&
                requestingEntity == other.requestingEntity &&
                origin == other.origin &&
                requestSource == other.requestSource &&
                requestedScanLocation == other.requestedScanLocation &&
                scanTarget == other.scanTarget &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                modelName,
                modelVersion,
                requestingEntity,
                origin,
                requestSource,
                requestedScanLocation,
                scanTarget,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inventory{modelName=$modelName, modelVersion=$modelVersion, requestingEntity=$requestingEntity, origin=$origin, requestSource=$requestSource, requestedScanLocation=$requestedScanLocation, scanTarget=$scanTarget, additionalProperties=$additionalProperties}"
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

        return other is JobRequestParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JobRequestParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
