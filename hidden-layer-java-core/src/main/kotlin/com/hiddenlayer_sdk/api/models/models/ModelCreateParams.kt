// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.Params
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.http.QueryParams
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Upsert Models */
class ModelCreateParams
private constructor(
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ModelCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelCreateParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(modelCreateParams: ModelCreateParams) = apply {
            body = modelCreateParams.body.toMutableList()
            additionalHeaders = modelCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelCreateParams.additionalQueryParams.toBuilder()
        }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [ModelCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModelCreateParams =
            ModelCreateParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("model_id") @ExcludeMissing private val modelId: JsonField<String>,
        @JsonProperty("tenant_id") @ExcludeMissing private val tenantId: JsonField<String>,
        @JsonProperty("versions") @ExcludeMissing private val versions: JsonField<List<Version>>,
    ) {

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun modelId(): Optional<String> = modelId.getOptional("model_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun versions(): Optional<List<Version>> = versions.getOptional("versions")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /**
         * Returns the raw JSON value of [tenantId].
         *
         * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

        /**
         * Returns the raw JSON value of [versions].
         *
         * Unlike [versions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("versions")
        @ExcludeMissing
        fun _versions(): JsonField<List<Version>> = versions

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var modelId: JsonField<String> = JsonMissing.of()
            private var tenantId: JsonField<String> = JsonMissing.of()
            private var versions: JsonField<MutableList<Version>>? = null

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                source = body.source
                modelId = body.modelId
                tenantId = body.tenantId
                versions = body.versions.map { it.toMutableList() }
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

            /**
             * Sets [Builder.tenantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tenantId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

            fun versions(versions: List<Version>) = versions(JsonField.of(versions))

            /**
             * Sets [Builder.versions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.versions] with a well-typed `List<Version>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun versions(versions: JsonField<List<Version>>) = apply {
                this.versions = versions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Version] to [versions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVersion(version: Version) = apply {
                versions =
                    (versions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("versions", it).add(version)
                    }
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("source", source),
                    modelId,
                    tenantId,
                    (versions ?: JsonMissing.of()).map { it.toImmutable() },
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            source()
            modelId()
            tenantId()
            versions().ifPresent { it.forEach { it.validate() } }
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
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (modelId.asKnown().isPresent) 1 else 0) +
                (if (tenantId.asKnown().isPresent) 1 else 0) +
                (versions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Version
        private constructor(
            private val version: JsonField<String>,
            private val deployments: JsonField<List<Deployment>>,
            private val locations: JsonField<Locations>,
            private val modelVersionId: JsonField<String>,
            private val multiFile: JsonField<Boolean>,
            private val retrievable: JsonField<Boolean>,
            private val tags: JsonField<Tags>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
                @JsonProperty("deployments")
                @ExcludeMissing
                deployments: JsonField<List<Deployment>> = JsonMissing.of(),
                @JsonProperty("locations")
                @ExcludeMissing
                locations: JsonField<Locations> = JsonMissing.of(),
                @JsonProperty("model_version_id")
                @ExcludeMissing
                modelVersionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("multi_file")
                @ExcludeMissing
                multiFile: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("retrievable")
                @ExcludeMissing
                retrievable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tags") @ExcludeMissing tags: JsonField<Tags> = JsonMissing.of(),
            ) : this(
                version,
                deployments,
                locations,
                modelVersionId,
                multiFile,
                retrievable,
                tags,
                mutableMapOf(),
            )

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): String = version.getRequired("version")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun deployments(): Optional<List<Deployment>> = deployments.getOptional("deployments")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun locations(): Optional<Locations> = locations.getOptional("locations")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun modelVersionId(): Optional<String> = modelVersionId.getOptional("model_version_id")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun multiFile(): Optional<Boolean> = multiFile.getOptional("multi_file")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun retrievable(): Optional<Boolean> = retrievable.getOptional("retrievable")

            /**
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<Tags> = tags.getOptional("tags")

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

            /**
             * Returns the raw JSON value of [deployments].
             *
             * Unlike [deployments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deployments")
            @ExcludeMissing
            fun _deployments(): JsonField<List<Deployment>> = deployments

            /**
             * Returns the raw JSON value of [locations].
             *
             * Unlike [locations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("locations")
            @ExcludeMissing
            fun _locations(): JsonField<Locations> = locations

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
             * Returns the raw JSON value of [multiFile].
             *
             * Unlike [multiFile], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multi_file")
            @ExcludeMissing
            fun _multiFile(): JsonField<Boolean> = multiFile

            /**
             * Returns the raw JSON value of [retrievable].
             *
             * Unlike [retrievable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("retrievable")
            @ExcludeMissing
            fun _retrievable(): JsonField<Boolean> = retrievable

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Tags> = tags

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
                 * Returns a mutable builder for constructing an instance of [Version].
                 *
                 * The following fields are required:
                 * ```java
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Version]. */
            class Builder internal constructor() {

                private var version: JsonField<String>? = null
                private var deployments: JsonField<MutableList<Deployment>>? = null
                private var locations: JsonField<Locations> = JsonMissing.of()
                private var modelVersionId: JsonField<String> = JsonMissing.of()
                private var multiFile: JsonField<Boolean> = JsonMissing.of()
                private var retrievable: JsonField<Boolean> = JsonMissing.of()
                private var tags: JsonField<Tags> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(version: Version) = apply {
                    this.version = version.version
                    deployments = version.deployments.map { it.toMutableList() }
                    locations = version.locations
                    modelVersionId = version.modelVersionId
                    multiFile = version.multiFile
                    retrievable = version.retrievable
                    tags = version.tags
                    additionalProperties = version.additionalProperties.toMutableMap()
                }

                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun version(version: JsonField<String>) = apply { this.version = version }

                fun deployments(deployments: List<Deployment>) =
                    deployments(JsonField.of(deployments))

                /**
                 * Sets [Builder.deployments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deployments] with a well-typed
                 * `List<Deployment>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun deployments(deployments: JsonField<List<Deployment>>) = apply {
                    this.deployments = deployments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Deployment] to [deployments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDeployment(deployment: Deployment) = apply {
                    deployments =
                        (deployments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("deployments", it).add(deployment)
                        }
                }

                fun locations(locations: Locations) = locations(JsonField.of(locations))

                /**
                 * Sets [Builder.locations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locations] with a well-typed [Locations] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locations(locations: JsonField<Locations>) = apply {
                    this.locations = locations
                }

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

                fun multiFile(multiFile: Boolean) = multiFile(JsonField.of(multiFile))

                /**
                 * Sets [Builder.multiFile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiFile] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiFile(multiFile: JsonField<Boolean>) = apply { this.multiFile = multiFile }

                fun retrievable(retrievable: Boolean) = retrievable(JsonField.of(retrievable))

                /**
                 * Sets [Builder.retrievable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrievable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun retrievable(retrievable: JsonField<Boolean>) = apply {
                    this.retrievable = retrievable
                }

                fun tags(tags: Tags) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed [Tags] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun tags(tags: JsonField<Tags>) = apply { this.tags = tags }

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
                 * Returns an immutable instance of [Version].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Version =
                    Version(
                        checkRequired("version", version),
                        (deployments ?: JsonMissing.of()).map { it.toImmutable() },
                        locations,
                        modelVersionId,
                        multiFile,
                        retrievable,
                        tags,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Version = apply {
                if (validated) {
                    return@apply
                }

                version()
                deployments().ifPresent { it.forEach { it.validate() } }
                locations().ifPresent { it.validate() }
                modelVersionId()
                multiFile()
                retrievable()
                tags().ifPresent { it.validate() }
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
                (if (version.asKnown().isPresent) 1 else 0) +
                    (deployments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (locations.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (modelVersionId.asKnown().isPresent) 1 else 0) +
                    (if (multiFile.asKnown().isPresent) 1 else 0) +
                    (if (retrievable.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.validity() ?: 0)

            class Deployment
            private constructor(
                private val active: JsonField<Boolean>,
                private val path: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("active")
                    @ExcludeMissing
                    active: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
                ) : this(active, path, mutableMapOf())

                /**
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun active(): Optional<Boolean> = active.getOptional("active")

                /**
                 * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun path(): Optional<String> = path.getOptional("path")

                /**
                 * Returns the raw JSON value of [active].
                 *
                 * Unlike [active], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

                /**
                 * Returns the raw JSON value of [path].
                 *
                 * Unlike [path], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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

                    /** Returns a mutable builder for constructing an instance of [Deployment]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Deployment]. */
                class Builder internal constructor() {

                    private var active: JsonField<Boolean> = JsonMissing.of()
                    private var path: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(deployment: Deployment) = apply {
                        active = deployment.active
                        path = deployment.path
                        additionalProperties = deployment.additionalProperties.toMutableMap()
                    }

                    fun active(active: Boolean) = active(JsonField.of(active))

                    /**
                     * Sets [Builder.active] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.active] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun active(active: JsonField<Boolean>) = apply { this.active = active }

                    fun path(path: String) = path(JsonField.of(path))

                    /**
                     * Sets [Builder.path] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.path] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun path(path: JsonField<String>) = apply { this.path = path }

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
                     * Returns an immutable instance of [Deployment].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Deployment =
                        Deployment(active, path, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Deployment = apply {
                    if (validated) {
                        return@apply
                    }

                    active()
                    path()
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
                    (if (active.asKnown().isPresent) 1 else 0) +
                        (if (path.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Deployment && active == other.active && path == other.path && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(active, path, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Deployment{active=$active, path=$path, additionalProperties=$additionalProperties}"
            }

            class Locations
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

                    /** Returns a mutable builder for constructing an instance of [Locations]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Locations]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(locations: Locations) = apply {
                        additionalProperties = locations.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Locations].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Locations = Locations(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Locations = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Locations && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Locations{additionalProperties=$additionalProperties}"
            }

            class Tags
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

                    /** Returns a mutable builder for constructing an instance of [Tags]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tags]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tags: Tags) = apply {
                        additionalProperties = tags.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Tags].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Tags = Tags(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Tags = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tags && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Tags{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Version && version == other.version && deployments == other.deployments && locations == other.locations && modelVersionId == other.modelVersionId && multiFile == other.multiFile && retrievable == other.retrievable && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(version, deployments, locations, modelVersionId, multiFile, retrievable, tags, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Version{version=$version, deployments=$deployments, locations=$locations, modelVersionId=$modelVersionId, multiFile=$multiFile, retrievable=$retrievable, tags=$tags, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && source == other.source && modelId == other.modelId && tenantId == other.tenantId && versions == other.versions /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, source, modelId, tenantId, versions) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, source=$source, modelId=$modelId, tenantId=$tenantId, versions=$versions}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ModelCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
