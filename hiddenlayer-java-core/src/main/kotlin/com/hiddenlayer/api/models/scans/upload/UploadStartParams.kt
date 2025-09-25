// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.upload

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
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.http.QueryParams
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Start a model upload */
class UploadStartParams
private constructor(
    private val xCorrelationId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xCorrelationId(): Optional<String> = Optional.ofNullable(xCorrelationId)

    /**
     * Model name
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelName(): String = body.modelName()

    /**
     * Model version
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelVersion(): String = body.modelVersion()

    /**
     * Requesting entity
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestingEntity(): String = body.requestingEntity()

    /**
     * Requested location alias
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationAlias(): Optional<String> = body.locationAlias()

    /**
     * Specifies the platform or service where the model originated before being scanned
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun origin(): Optional<String> = body.origin()

    /**
     * Identifies the system that requested the scan
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestSource(): Optional<RequestSource> = body.requestSource()

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelName(): JsonField<String> = body._modelName()

    /**
     * Returns the raw JSON value of [modelVersion].
     *
     * Unlike [modelVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelVersion(): JsonField<String> = body._modelVersion()

    /**
     * Returns the raw JSON value of [requestingEntity].
     *
     * Unlike [requestingEntity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _requestingEntity(): JsonField<String> = body._requestingEntity()

    /**
     * Returns the raw JSON value of [locationAlias].
     *
     * Unlike [locationAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locationAlias(): JsonField<String> = body._locationAlias()

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _origin(): JsonField<String> = body._origin()

    /**
     * Returns the raw JSON value of [requestSource].
     *
     * Unlike [requestSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requestSource(): JsonField<RequestSource> = body._requestSource()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadStartParams].
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

    /** A builder for [UploadStartParams]. */
    class Builder internal constructor() {

        private var xCorrelationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadStartParams: UploadStartParams) = apply {
            xCorrelationId = uploadStartParams.xCorrelationId
            body = uploadStartParams.body.toBuilder()
            additionalHeaders = uploadStartParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadStartParams.additionalQueryParams.toBuilder()
        }

        fun xCorrelationId(xCorrelationId: String?) = apply { this.xCorrelationId = xCorrelationId }

        /** Alias for calling [Builder.xCorrelationId] with `xCorrelationId.orElse(null)`. */
        fun xCorrelationId(xCorrelationId: Optional<String>) =
            xCorrelationId(xCorrelationId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [modelName]
         * - [modelVersion]
         * - [requestingEntity]
         * - [locationAlias]
         * - [origin]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Model name */
        fun modelName(modelName: String) = apply { body.modelName(modelName) }

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { body.modelName(modelName) }

        /** Model version */
        fun modelVersion(modelVersion: String) = apply { body.modelVersion(modelVersion) }

        /**
         * Sets [Builder.modelVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelVersion(modelVersion: JsonField<String>) = apply {
            body.modelVersion(modelVersion)
        }

        /** Requesting entity */
        fun requestingEntity(requestingEntity: String) = apply {
            body.requestingEntity(requestingEntity)
        }

        /**
         * Sets [Builder.requestingEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestingEntity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestingEntity(requestingEntity: JsonField<String>) = apply {
            body.requestingEntity(requestingEntity)
        }

        /** Requested location alias */
        fun locationAlias(locationAlias: String) = apply { body.locationAlias(locationAlias) }

        /**
         * Sets [Builder.locationAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun locationAlias(locationAlias: JsonField<String>) = apply {
            body.locationAlias(locationAlias)
        }

        /** Specifies the platform or service where the model originated before being scanned */
        fun origin(origin: String) = apply { body.origin(origin) }

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { body.origin(origin) }

        /** Identifies the system that requested the scan */
        fun requestSource(requestSource: RequestSource) = apply {
            body.requestSource(requestSource)
        }

        /**
         * Sets [Builder.requestSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestSource] with a well-typed [RequestSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestSource(requestSource: JsonField<RequestSource>) = apply {
            body.requestSource(requestSource)
        }

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
         * Returns an immutable instance of [UploadStartParams].
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
        fun build(): UploadStartParams =
            UploadStartParams(
                xCorrelationId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xCorrelationId?.let { put("X-Correlation-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val modelVersion: JsonField<String>,
        private val requestingEntity: JsonField<String>,
        private val locationAlias: JsonField<String>,
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
            @JsonProperty("requesting_entity")
            @ExcludeMissing
            requestingEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location_alias")
            @ExcludeMissing
            locationAlias: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_source")
            @ExcludeMissing
            requestSource: JsonField<RequestSource> = JsonMissing.of(),
        ) : this(
            modelName,
            modelVersion,
            requestingEntity,
            locationAlias,
            origin,
            requestSource,
            mutableMapOf(),
        )

        /**
         * Model name
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("model_name")

        /**
         * Model version
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelVersion(): String = modelVersion.getRequired("model_version")

        /**
         * Requesting entity
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestingEntity(): String = requestingEntity.getRequired("requesting_entity")

        /**
         * Requested location alias
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun locationAlias(): Optional<String> = locationAlias.getOptional("location_alias")

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
         * Returns the raw JSON value of [requestingEntity].
         *
         * Unlike [requestingEntity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("requesting_entity")
        @ExcludeMissing
        fun _requestingEntity(): JsonField<String> = requestingEntity

        /**
         * Returns the raw JSON value of [locationAlias].
         *
         * Unlike [locationAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("location_alias")
        @ExcludeMissing
        fun _locationAlias(): JsonField<String> = locationAlias

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
             * Returns a mutable builder for constructing an instance of [Body].
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

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var modelVersion: JsonField<String>? = null
            private var requestingEntity: JsonField<String>? = null
            private var locationAlias: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var requestSource: JsonField<RequestSource> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                modelName = body.modelName
                modelVersion = body.modelVersion
                requestingEntity = body.requestingEntity
                locationAlias = body.locationAlias
                origin = body.origin
                requestSource = body.requestSource
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Model name */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** Model version */
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

            /** Requesting entity */
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

            /** Requested location alias */
            fun locationAlias(locationAlias: String) = locationAlias(JsonField.of(locationAlias))

            /**
             * Sets [Builder.locationAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationAlias] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationAlias(locationAlias: JsonField<String>) = apply {
                this.locationAlias = locationAlias
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("modelName", modelName),
                    checkRequired("modelVersion", modelVersion),
                    checkRequired("requestingEntity", requestingEntity),
                    locationAlias,
                    origin,
                    requestSource,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            modelName()
            modelVersion()
            requestingEntity()
            locationAlias()
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
                (if (requestingEntity.asKnown().isPresent) 1 else 0) +
                (if (locationAlias.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (requestSource.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                modelName == other.modelName &&
                modelVersion == other.modelVersion &&
                requestingEntity == other.requestingEntity &&
                locationAlias == other.locationAlias &&
                origin == other.origin &&
                requestSource == other.requestSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                modelName,
                modelVersion,
                requestingEntity,
                locationAlias,
                origin,
                requestSource,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{modelName=$modelName, modelVersion=$modelVersion, requestingEntity=$requestingEntity, locationAlias=$locationAlias, origin=$origin, requestSource=$requestSource, additionalProperties=$additionalProperties}"
    }

    /** Identifies the system that requested the scan */
    class RequestSource @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HiddenLayerInvalidDataException if this class instance's value is a not a known
         *   member.
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

        return other is UploadStartParams &&
            xCorrelationId == other.xCorrelationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xCorrelationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadStartParams{xCorrelationId=$xCorrelationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
