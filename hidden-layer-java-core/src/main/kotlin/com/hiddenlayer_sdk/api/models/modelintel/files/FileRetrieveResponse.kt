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
import com.hiddenlayer_sdk.api.core.checkKnown
import com.hiddenlayer_sdk.api.core.checkRequired
import com.hiddenlayer_sdk.api.core.toImmutable
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Cursor-based pagination navigation links */
class FileRetrieveResponse
private constructor(
    private val first: JsonField<String>,
    private val next: JsonField<String>,
    private val prev: JsonField<String>,
    private val fileInstances: JsonField<List<FileInstance>>,
    private val last: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("first") @ExcludeMissing first: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next") @ExcludeMissing next: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prev") @ExcludeMissing prev: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_instances")
        @ExcludeMissing
        fileInstances: JsonField<List<FileInstance>> = JsonMissing.of(),
        @JsonProperty("last") @ExcludeMissing last: JsonField<String> = JsonMissing.of(),
    ) : this(first, next, prev, fileInstances, last, mutableMapOf())

    /**
     * Pagination cursor pointing to the first page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun first(): String = first.getRequired("first")

    /**
     * Pagination cursor pointing to the next page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun next(): String = next.getRequired("next")

    /**
     * Pagination cursor pointing to the previous page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prev(): String = prev.getRequired("prev")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileInstances(): Optional<List<FileInstance>> = fileInstances.getOptional("file_instances")

    /**
     * Pagination cursor pointing to the last page.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun last(): Optional<String> = last.getOptional("last")

    /**
     * Returns the raw JSON value of [first].
     *
     * Unlike [first], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first") @ExcludeMissing fun _first(): JsonField<String> = first

    /**
     * Returns the raw JSON value of [next].
     *
     * Unlike [next], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next") @ExcludeMissing fun _next(): JsonField<String> = next

    /**
     * Returns the raw JSON value of [prev].
     *
     * Unlike [prev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev") @ExcludeMissing fun _prev(): JsonField<String> = prev

    /**
     * Returns the raw JSON value of [fileInstances].
     *
     * Unlike [fileInstances], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_instances")
    @ExcludeMissing
    fun _fileInstances(): JsonField<List<FileInstance>> = fileInstances

    /**
     * Returns the raw JSON value of [last].
     *
     * Unlike [last], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last") @ExcludeMissing fun _last(): JsonField<String> = last

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
         * Returns a mutable builder for constructing an instance of [FileRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .first()
         * .next()
         * .prev()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileRetrieveResponse]. */
    class Builder internal constructor() {

        private var first: JsonField<String>? = null
        private var next: JsonField<String>? = null
        private var prev: JsonField<String>? = null
        private var fileInstances: JsonField<MutableList<FileInstance>>? = null
        private var last: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileRetrieveResponse: FileRetrieveResponse) = apply {
            first = fileRetrieveResponse.first
            next = fileRetrieveResponse.next
            prev = fileRetrieveResponse.prev
            fileInstances = fileRetrieveResponse.fileInstances.map { it.toMutableList() }
            last = fileRetrieveResponse.last
            additionalProperties = fileRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Pagination cursor pointing to the first page. */
        fun first(first: String) = first(JsonField.of(first))

        /**
         * Sets [Builder.first] to an arbitrary JSON value.
         *
         * You should usually call [Builder.first] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun first(first: JsonField<String>) = apply { this.first = first }

        /** Pagination cursor pointing to the next page. */
        fun next(next: String) = next(JsonField.of(next))

        /**
         * Sets [Builder.next] to an arbitrary JSON value.
         *
         * You should usually call [Builder.next] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun next(next: JsonField<String>) = apply { this.next = next }

        /** Pagination cursor pointing to the previous page. */
        fun prev(prev: String) = prev(JsonField.of(prev))

        /**
         * Sets [Builder.prev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prev] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prev(prev: JsonField<String>) = apply { this.prev = prev }

        fun fileInstances(fileInstances: List<FileInstance>) =
            fileInstances(JsonField.of(fileInstances))

        /**
         * Sets [Builder.fileInstances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileInstances] with a well-typed `List<FileInstance>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fileInstances(fileInstances: JsonField<List<FileInstance>>) = apply {
            this.fileInstances = fileInstances.map { it.toMutableList() }
        }

        /**
         * Adds a single [FileInstance] to [fileInstances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileInstance(fileInstance: FileInstance) = apply {
            fileInstances =
                (fileInstances ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fileInstances", it).add(fileInstance)
                }
        }

        /** Pagination cursor pointing to the last page. */
        fun last(last: String) = last(JsonField.of(last))

        /**
         * Sets [Builder.last] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last(last: JsonField<String>) = apply { this.last = last }

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
         * Returns an immutable instance of [FileRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .first()
         * .next()
         * .prev()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FileRetrieveResponse =
            FileRetrieveResponse(
                checkRequired("first", first),
                checkRequired("next", next),
                checkRequired("prev", prev),
                (fileInstances ?: JsonMissing.of()).map { it.toImmutable() },
                last,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        first()
        next()
        prev()
        fileInstances().ifPresent { it.forEach { it.validate() } }
        last()
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
        (if (first.asKnown().isPresent) 1 else 0) +
            (if (next.asKnown().isPresent) 1 else 0) +
            (if (prev.asKnown().isPresent) 1 else 0) +
            (fileInstances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (last.asKnown().isPresent) 1 else 0)

    class FileInstance
    private constructor(
        private val instance: JsonField<Instance>,
        private val licenses: JsonField<List<License>>,
        private val repoOwner: JsonField<RepoOwner>,
        private val repoRevision: JsonField<RepoRevision>,
        private val repository: JsonField<Repository>,
        private val usePolicies: JsonField<List<UsePolicy>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instance")
            @ExcludeMissing
            instance: JsonField<Instance> = JsonMissing.of(),
            @JsonProperty("licenses")
            @ExcludeMissing
            licenses: JsonField<List<License>> = JsonMissing.of(),
            @JsonProperty("repo_owner")
            @ExcludeMissing
            repoOwner: JsonField<RepoOwner> = JsonMissing.of(),
            @JsonProperty("repo_revision")
            @ExcludeMissing
            repoRevision: JsonField<RepoRevision> = JsonMissing.of(),
            @JsonProperty("repository")
            @ExcludeMissing
            repository: JsonField<Repository> = JsonMissing.of(),
            @JsonProperty("use_policies")
            @ExcludeMissing
            usePolicies: JsonField<List<UsePolicy>> = JsonMissing.of(),
        ) : this(
            instance,
            licenses,
            repoOwner,
            repoRevision,
            repository,
            usePolicies,
            mutableMapOf(),
        )

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instance(): Instance = instance.getRequired("instance")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun licenses(): List<License> = licenses.getRequired("licenses")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repoOwner(): RepoOwner = repoOwner.getRequired("repo_owner")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repoRevision(): RepoRevision = repoRevision.getRequired("repo_revision")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun repository(): Repository = repository.getRequired("repository")

        /**
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun usePolicies(): List<UsePolicy> = usePolicies.getRequired("use_policies")

        /**
         * Returns the raw JSON value of [instance].
         *
         * Unlike [instance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instance") @ExcludeMissing fun _instance(): JsonField<Instance> = instance

        /**
         * Returns the raw JSON value of [licenses].
         *
         * Unlike [licenses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("licenses")
        @ExcludeMissing
        fun _licenses(): JsonField<List<License>> = licenses

        /**
         * Returns the raw JSON value of [repoOwner].
         *
         * Unlike [repoOwner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repo_owner")
        @ExcludeMissing
        fun _repoOwner(): JsonField<RepoOwner> = repoOwner

        /**
         * Returns the raw JSON value of [repoRevision].
         *
         * Unlike [repoRevision], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("repo_revision")
        @ExcludeMissing
        fun _repoRevision(): JsonField<RepoRevision> = repoRevision

        /**
         * Returns the raw JSON value of [repository].
         *
         * Unlike [repository], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("repository")
        @ExcludeMissing
        fun _repository(): JsonField<Repository> = repository

        /**
         * Returns the raw JSON value of [usePolicies].
         *
         * Unlike [usePolicies], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_policies")
        @ExcludeMissing
        fun _usePolicies(): JsonField<List<UsePolicy>> = usePolicies

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
             * Returns a mutable builder for constructing an instance of [FileInstance].
             *
             * The following fields are required:
             * ```java
             * .instance()
             * .licenses()
             * .repoOwner()
             * .repoRevision()
             * .repository()
             * .usePolicies()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FileInstance]. */
        class Builder internal constructor() {

            private var instance: JsonField<Instance>? = null
            private var licenses: JsonField<MutableList<License>>? = null
            private var repoOwner: JsonField<RepoOwner>? = null
            private var repoRevision: JsonField<RepoRevision>? = null
            private var repository: JsonField<Repository>? = null
            private var usePolicies: JsonField<MutableList<UsePolicy>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fileInstance: FileInstance) = apply {
                instance = fileInstance.instance
                licenses = fileInstance.licenses.map { it.toMutableList() }
                repoOwner = fileInstance.repoOwner
                repoRevision = fileInstance.repoRevision
                repository = fileInstance.repository
                usePolicies = fileInstance.usePolicies.map { it.toMutableList() }
                additionalProperties = fileInstance.additionalProperties.toMutableMap()
            }

            fun instance(instance: Instance) = instance(JsonField.of(instance))

            /**
             * Sets [Builder.instance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instance] with a well-typed [Instance] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instance(instance: JsonField<Instance>) = apply { this.instance = instance }

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

            fun repoOwner(repoOwner: RepoOwner) = repoOwner(JsonField.of(repoOwner))

            /**
             * Sets [Builder.repoOwner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoOwner] with a well-typed [RepoOwner] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoOwner(repoOwner: JsonField<RepoOwner>) = apply { this.repoOwner = repoOwner }

            fun repoRevision(repoRevision: RepoRevision) = repoRevision(JsonField.of(repoRevision))

            /**
             * Sets [Builder.repoRevision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repoRevision] with a well-typed [RepoRevision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repoRevision(repoRevision: JsonField<RepoRevision>) = apply {
                this.repoRevision = repoRevision
            }

            fun repository(repository: Repository) = repository(JsonField.of(repository))

            /**
             * Sets [Builder.repository] to an arbitrary JSON value.
             *
             * You should usually call [Builder.repository] with a well-typed [Repository] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun repository(repository: JsonField<Repository>) = apply {
                this.repository = repository
            }

            fun usePolicies(usePolicies: List<UsePolicy>) = usePolicies(JsonField.of(usePolicies))

            /**
             * Sets [Builder.usePolicies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usePolicies] with a well-typed `List<UsePolicy>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usePolicies(usePolicies: JsonField<List<UsePolicy>>) = apply {
                this.usePolicies = usePolicies.map { it.toMutableList() }
            }

            /**
             * Adds a single [UsePolicy] to [usePolicies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsePolicy(usePolicy: UsePolicy) = apply {
                usePolicies =
                    (usePolicies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usePolicies", it).add(usePolicy)
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
             * Returns an immutable instance of [FileInstance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instance()
             * .licenses()
             * .repoOwner()
             * .repoRevision()
             * .repository()
             * .usePolicies()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FileInstance =
                FileInstance(
                    checkRequired("instance", instance),
                    checkRequired("licenses", licenses).map { it.toImmutable() },
                    checkRequired("repoOwner", repoOwner),
                    checkRequired("repoRevision", repoRevision),
                    checkRequired("repository", repository),
                    checkRequired("usePolicies", usePolicies).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FileInstance = apply {
            if (validated) {
                return@apply
            }

            instance().validate()
            licenses().forEach { it.validate() }
            repoOwner().validate()
            repoRevision().validate()
            repository().validate()
            usePolicies().forEach { it.validate() }
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
            (instance.asKnown().getOrNull()?.validity() ?: 0) +
                (licenses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (repoOwner.asKnown().getOrNull()?.validity() ?: 0) +
                (repoRevision.asKnown().getOrNull()?.validity() ?: 0) +
                (repository.asKnown().getOrNull()?.validity() ?: 0) +
                (usePolicies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Instance
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val path: JsonField<String>,
            private val revisionId: JsonField<String>,
            private val sha256: JsonField<String>,
            private val source: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revision_id")
                @ExcludeMissing
                revisionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sha256")
                @ExcludeMissing
                sha256: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(createdAt, path, revisionId, sha256, source, tags, updatedAt, mutableMapOf())

            /**
             * Timestamp when the file instance was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * File path within the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun path(): String = path.getRequired("path")

            /**
             * UUID of the repository revision
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun revisionId(): String = revisionId.getRequired("revision_id")

            /**
             * SHA256 hash of the file
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sha256(): String = sha256.getRequired("sha256")

            /**
             * Source of the file instance
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * Tags associated with the file instance
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tags(): List<String> = tags.getRequired("tags")

            /**
             * Timestamp when the file instance was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [path].
             *
             * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

            /**
             * Returns the raw JSON value of [revisionId].
             *
             * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("revision_id")
            @ExcludeMissing
            fun _revisionId(): JsonField<String> = revisionId

            /**
             * Returns the raw JSON value of [sha256].
             *
             * Unlike [sha256], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("sha256") @ExcludeMissing fun _sha256(): JsonField<String> = sha256

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [Instance].
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .path()
                 * .revisionId()
                 * .sha256()
                 * .source()
                 * .tags()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Instance]. */
            class Builder internal constructor() {

                private var createdAt: JsonField<OffsetDateTime>? = null
                private var path: JsonField<String>? = null
                private var revisionId: JsonField<String>? = null
                private var sha256: JsonField<String>? = null
                private var source: JsonField<String>? = null
                private var tags: JsonField<MutableList<String>>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(instance: Instance) = apply {
                    createdAt = instance.createdAt
                    path = instance.path
                    revisionId = instance.revisionId
                    sha256 = instance.sha256
                    source = instance.source
                    tags = instance.tags.map { it.toMutableList() }
                    updatedAt = instance.updatedAt
                    additionalProperties = instance.additionalProperties.toMutableMap()
                }

                /** Timestamp when the file instance was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** File path within the repository */
                fun path(path: String) = path(JsonField.of(path))

                /**
                 * Sets [Builder.path] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.path] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun path(path: JsonField<String>) = apply { this.path = path }

                /** UUID of the repository revision */
                fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

                /**
                 * Sets [Builder.revisionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revisionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun revisionId(revisionId: JsonField<String>) = apply {
                    this.revisionId = revisionId
                }

                /** SHA256 hash of the file */
                fun sha256(sha256: String) = sha256(JsonField.of(sha256))

                /**
                 * Sets [Builder.sha256] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sha256] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

                /** Source of the file instance */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** Tags associated with the file instance */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /** Timestamp when the file instance was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
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
                 * Returns an immutable instance of [Instance].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .path()
                 * .revisionId()
                 * .sha256()
                 * .source()
                 * .tags()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Instance =
                    Instance(
                        checkRequired("createdAt", createdAt),
                        checkRequired("path", path),
                        checkRequired("revisionId", revisionId),
                        checkRequired("sha256", sha256),
                        checkRequired("source", source),
                        checkRequired("tags", tags).map { it.toImmutable() },
                        checkRequired("updatedAt", updatedAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Instance = apply {
                if (validated) {
                    return@apply
                }

                createdAt()
                path()
                revisionId()
                sha256()
                source()
                tags()
                updatedAt()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (path.asKnown().isPresent) 1 else 0) +
                    (if (revisionId.asKnown().isPresent) 1 else 0) +
                    (if (sha256.asKnown().isPresent) 1 else 0) +
                    (if (source.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Instance && createdAt == other.createdAt && path == other.path && revisionId == other.revisionId && sha256 == other.sha256 && source == other.source && tags == other.tags && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(createdAt, path, revisionId, sha256, source, tags, updatedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Instance{createdAt=$createdAt, path=$path, revisionId=$revisionId, sha256=$sha256, source=$source, tags=$tags, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class License
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val name: JsonField<String>,
            private val sha256: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val url: JsonField<String>,
            private val version: JsonField<String>,
            private val description: JsonField<String>,
            private val spdxId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sha256")
                @ExcludeMissing
                sha256: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("spdx_id")
                @ExcludeMissing
                spdxId: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                name,
                sha256,
                updatedAt,
                url,
                version,
                description,
                spdxId,
                mutableMapOf(),
            )

            /**
             * UUID of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Timestamp when the license was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Name of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * SHA256 hash of the license text
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sha256(): String = sha256.getRequired("sha256")

            /**
             * Timestamp when the license was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * URL of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Version of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): String = version.getRequired("version")

            /**
             * Description of the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * SPDX identifier for the license
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun spdxId(): Optional<String> = spdxId.getOptional("spdx_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<String> = version

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
             * Returns the raw JSON value of [spdxId].
             *
             * Unlike [spdxId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("spdx_id") @ExcludeMissing fun _spdxId(): JsonField<String> = spdxId

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
                 * .id()
                 * .createdAt()
                 * .name()
                 * .sha256()
                 * .updatedAt()
                 * .url()
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [License]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var name: JsonField<String>? = null
                private var sha256: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var url: JsonField<String>? = null
                private var version: JsonField<String>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var spdxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(license: License) = apply {
                    id = license.id
                    createdAt = license.createdAt
                    name = license.name
                    sha256 = license.sha256
                    updatedAt = license.updatedAt
                    url = license.url
                    version = license.version
                    description = license.description
                    spdxId = license.spdxId
                    additionalProperties = license.additionalProperties.toMutableMap()
                }

                /** UUID of the license */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Timestamp when the license was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
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

                /** SHA256 hash of the license text */
                fun sha256(sha256: String) = sha256(JsonField.of(sha256))

                /**
                 * Sets [Builder.sha256] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sha256] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

                /** Timestamp when the license was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /** URL of the license */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Version of the license */
                fun version(version: String) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun version(version: JsonField<String>) = apply { this.version = version }

                /** Description of the license */
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

                /** SPDX identifier for the license */
                fun spdxId(spdxId: String) = spdxId(JsonField.of(spdxId))

                /**
                 * Sets [Builder.spdxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spdxId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun spdxId(spdxId: JsonField<String>) = apply { this.spdxId = spdxId }

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
                 * .id()
                 * .createdAt()
                 * .name()
                 * .sha256()
                 * .updatedAt()
                 * .url()
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): License =
                    License(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("name", name),
                        checkRequired("sha256", sha256),
                        checkRequired("updatedAt", updatedAt),
                        checkRequired("url", url),
                        checkRequired("version", version),
                        description,
                        spdxId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): License = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                name()
                sha256()
                updatedAt()
                url()
                version()
                description()
                spdxId()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (sha256.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (version.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (spdxId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is License && id == other.id && createdAt == other.createdAt && name == other.name && sha256 == other.sha256 && updatedAt == other.updatedAt && url == other.url && version == other.version && description == other.description && spdxId == other.spdxId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, createdAt, name, sha256, updatedAt, url, version, description, spdxId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "License{id=$id, createdAt=$createdAt, name=$name, sha256=$sha256, updatedAt=$updatedAt, url=$url, version=$version, description=$description, spdxId=$spdxId, additionalProperties=$additionalProperties}"
        }

        class RepoOwner
        private constructor(
            private val id: JsonField<String>,
            private val country: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val handle: JsonField<String>,
            private val homepageUrl: JsonField<String>,
            private val kind: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val source: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val trustLevel: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val displayName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("handle")
                @ExcludeMissing
                handle: JsonField<String> = JsonMissing.of(),
                @JsonProperty("homepage_url")
                @ExcludeMissing
                homepageUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("trust_level")
                @ExcludeMissing
                trustLevel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("display_name")
                @ExcludeMissing
                displayName: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                country,
                createdAt,
                handle,
                homepageUrl,
                kind,
                metadata,
                source,
                tags,
                trustLevel,
                updatedAt,
                displayName,
                mutableMapOf(),
            )

            /**
             * UUID of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Country of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * Timestamp when the contributor was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Handle or username of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun handle(): String = handle.getRequired("handle")

            /**
             * Homepage URL of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun homepageUrl(): String = homepageUrl.getRequired("homepage_url")

            /**
             * Type of contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kind(): String = kind.getRequired("kind")

            /**
             * Additional metadata for the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * Source platform of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * Tags associated with the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tags(): List<String> = tags.getRequired("tags")

            /**
             * Trust level of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun trustLevel(): String = trustLevel.getRequired("trust_level")

            /**
             * Timestamp when the contributor was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Display name of the contributor
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun displayName(): Optional<String> = displayName.getOptional("display_name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [handle].
             *
             * Unlike [handle], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("handle") @ExcludeMissing fun _handle(): JsonField<String> = handle

            /**
             * Returns the raw JSON value of [homepageUrl].
             *
             * Unlike [homepageUrl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("homepage_url")
            @ExcludeMissing
            fun _homepageUrl(): JsonField<String> = homepageUrl

            /**
             * Returns the raw JSON value of [kind].
             *
             * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [trustLevel].
             *
             * Unlike [trustLevel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trust_level")
            @ExcludeMissing
            fun _trustLevel(): JsonField<String> = trustLevel

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [displayName].
             *
             * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("display_name")
            @ExcludeMissing
            fun _displayName(): JsonField<String> = displayName

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
                 * Returns a mutable builder for constructing an instance of [RepoOwner].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .country()
                 * .createdAt()
                 * .handle()
                 * .homepageUrl()
                 * .kind()
                 * .metadata()
                 * .source()
                 * .tags()
                 * .trustLevel()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RepoOwner]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var handle: JsonField<String>? = null
                private var homepageUrl: JsonField<String>? = null
                private var kind: JsonField<String>? = null
                private var metadata: JsonField<Metadata>? = null
                private var source: JsonField<String>? = null
                private var tags: JsonField<MutableList<String>>? = null
                private var trustLevel: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var displayName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(repoOwner: RepoOwner) = apply {
                    id = repoOwner.id
                    country = repoOwner.country
                    createdAt = repoOwner.createdAt
                    handle = repoOwner.handle
                    homepageUrl = repoOwner.homepageUrl
                    kind = repoOwner.kind
                    metadata = repoOwner.metadata
                    source = repoOwner.source
                    tags = repoOwner.tags.map { it.toMutableList() }
                    trustLevel = repoOwner.trustLevel
                    updatedAt = repoOwner.updatedAt
                    displayName = repoOwner.displayName
                    additionalProperties = repoOwner.additionalProperties.toMutableMap()
                }

                /** UUID of the contributor */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Country of the contributor */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Timestamp when the contributor was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Handle or username of the contributor */
                fun handle(handle: String) = handle(JsonField.of(handle))

                /**
                 * Sets [Builder.handle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.handle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun handle(handle: JsonField<String>) = apply { this.handle = handle }

                /** Homepage URL of the contributor */
                fun homepageUrl(homepageUrl: String) = homepageUrl(JsonField.of(homepageUrl))

                /**
                 * Sets [Builder.homepageUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.homepageUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun homepageUrl(homepageUrl: JsonField<String>) = apply {
                    this.homepageUrl = homepageUrl
                }

                /** Type of contributor */
                fun kind(kind: String) = kind(JsonField.of(kind))

                /**
                 * Sets [Builder.kind] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kind] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonField<String>) = apply { this.kind = kind }

                /** Additional metadata for the contributor */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Source platform of the contributor */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** Tags associated with the contributor */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /** Trust level of the contributor */
                fun trustLevel(trustLevel: String) = trustLevel(JsonField.of(trustLevel))

                /**
                 * Sets [Builder.trustLevel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trustLevel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun trustLevel(trustLevel: JsonField<String>) = apply {
                    this.trustLevel = trustLevel
                }

                /** Timestamp when the contributor was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /** Display name of the contributor */
                fun displayName(displayName: String) = displayName(JsonField.of(displayName))

                /**
                 * Sets [Builder.displayName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.displayName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun displayName(displayName: JsonField<String>) = apply {
                    this.displayName = displayName
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
                 * Returns an immutable instance of [RepoOwner].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .country()
                 * .createdAt()
                 * .handle()
                 * .homepageUrl()
                 * .kind()
                 * .metadata()
                 * .source()
                 * .tags()
                 * .trustLevel()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RepoOwner =
                    RepoOwner(
                        checkRequired("id", id),
                        checkRequired("country", country),
                        checkRequired("createdAt", createdAt),
                        checkRequired("handle", handle),
                        checkRequired("homepageUrl", homepageUrl),
                        checkRequired("kind", kind),
                        checkRequired("metadata", metadata),
                        checkRequired("source", source),
                        checkRequired("tags", tags).map { it.toImmutable() },
                        checkRequired("trustLevel", trustLevel),
                        checkRequired("updatedAt", updatedAt),
                        displayName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RepoOwner = apply {
                if (validated) {
                    return@apply
                }

                id()
                country()
                createdAt()
                handle()
                homepageUrl()
                kind()
                metadata().validate()
                source()
                tags()
                trustLevel()
                updatedAt()
                displayName()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (handle.asKnown().isPresent) 1 else 0) +
                    (if (homepageUrl.asKnown().isPresent) 1 else 0) +
                    (if (kind.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (source.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (trustLevel.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (displayName.asKnown().isPresent) 1 else 0)

            /** Additional metadata for the contributor */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RepoOwner && id == other.id && country == other.country && createdAt == other.createdAt && handle == other.handle && homepageUrl == other.homepageUrl && kind == other.kind && metadata == other.metadata && source == other.source && tags == other.tags && trustLevel == other.trustLevel && updatedAt == other.updatedAt && displayName == other.displayName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, country, createdAt, handle, homepageUrl, kind, metadata, source, tags, trustLevel, updatedAt, displayName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RepoOwner{id=$id, country=$country, createdAt=$createdAt, handle=$handle, homepageUrl=$homepageUrl, kind=$kind, metadata=$metadata, source=$source, tags=$tags, trustLevel=$trustLevel, updatedAt=$updatedAt, displayName=$displayName, additionalProperties=$additionalProperties}"
        }

        class RepoRevision
        private constructor(
            private val id: JsonField<String>,
            private val commitHash: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val fetchedAt: JsonField<OffsetDateTime>,
            private val metadata: JsonField<Metadata>,
            private val repositoryId: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("commit_hash")
                @ExcludeMissing
                commitHash: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fetched_at")
                @ExcludeMissing
                fetchedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("repository_id")
                @ExcludeMissing
                repositoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                id,
                commitHash,
                createdAt,
                fetchedAt,
                metadata,
                repositoryId,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * UUID of the repository revision
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Git commit hash
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun commitHash(): String = commitHash.getRequired("commit_hash")

            /**
             * Timestamp when the revision was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Timestamp when the revision was fetched
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fetchedAt(): OffsetDateTime = fetchedAt.getRequired("fetched_at")

            /**
             * Additional metadata for the revision
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * UUID of the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun repositoryId(): String = repositoryId.getRequired("repository_id")

            /**
             * Timestamp when the revision was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [commitHash].
             *
             * Unlike [commitHash], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commit_hash")
            @ExcludeMissing
            fun _commitHash(): JsonField<String> = commitHash

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [fetchedAt].
             *
             * Unlike [fetchedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fetched_at")
            @ExcludeMissing
            fun _fetchedAt(): JsonField<OffsetDateTime> = fetchedAt

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [repositoryId].
             *
             * Unlike [repositoryId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("repository_id")
            @ExcludeMissing
            fun _repositoryId(): JsonField<String> = repositoryId

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [RepoRevision].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commitHash()
                 * .createdAt()
                 * .fetchedAt()
                 * .metadata()
                 * .repositoryId()
                 * .updatedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RepoRevision]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var commitHash: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var fetchedAt: JsonField<OffsetDateTime>? = null
                private var metadata: JsonField<Metadata>? = null
                private var repositoryId: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(repoRevision: RepoRevision) = apply {
                    id = repoRevision.id
                    commitHash = repoRevision.commitHash
                    createdAt = repoRevision.createdAt
                    fetchedAt = repoRevision.fetchedAt
                    metadata = repoRevision.metadata
                    repositoryId = repoRevision.repositoryId
                    updatedAt = repoRevision.updatedAt
                    additionalProperties = repoRevision.additionalProperties.toMutableMap()
                }

                /** UUID of the repository revision */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Git commit hash */
                fun commitHash(commitHash: String) = commitHash(JsonField.of(commitHash))

                /**
                 * Sets [Builder.commitHash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commitHash] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commitHash(commitHash: JsonField<String>) = apply {
                    this.commitHash = commitHash
                }

                /** Timestamp when the revision was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Timestamp when the revision was fetched */
                fun fetchedAt(fetchedAt: OffsetDateTime) = fetchedAt(JsonField.of(fetchedAt))

                /**
                 * Sets [Builder.fetchedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fetchedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fetchedAt(fetchedAt: JsonField<OffsetDateTime>) = apply {
                    this.fetchedAt = fetchedAt
                }

                /** Additional metadata for the revision */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** UUID of the repository */
                fun repositoryId(repositoryId: String) = repositoryId(JsonField.of(repositoryId))

                /**
                 * Sets [Builder.repositoryId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.repositoryId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun repositoryId(repositoryId: JsonField<String>) = apply {
                    this.repositoryId = repositoryId
                }

                /** Timestamp when the revision was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
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
                 * Returns an immutable instance of [RepoRevision].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .commitHash()
                 * .createdAt()
                 * .fetchedAt()
                 * .metadata()
                 * .repositoryId()
                 * .updatedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RepoRevision =
                    RepoRevision(
                        checkRequired("id", id),
                        checkRequired("commitHash", commitHash),
                        checkRequired("createdAt", createdAt),
                        checkRequired("fetchedAt", fetchedAt),
                        checkRequired("metadata", metadata),
                        checkRequired("repositoryId", repositoryId),
                        checkRequired("updatedAt", updatedAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RepoRevision = apply {
                if (validated) {
                    return@apply
                }

                id()
                commitHash()
                createdAt()
                fetchedAt()
                metadata().validate()
                repositoryId()
                updatedAt()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (commitHash.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (fetchedAt.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (repositoryId.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0)

            /** Additional metadata for the revision */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RepoRevision && id == other.id && commitHash == other.commitHash && createdAt == other.createdAt && fetchedAt == other.fetchedAt && metadata == other.metadata && repositoryId == other.repositoryId && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, commitHash, createdAt, fetchedAt, metadata, repositoryId, updatedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RepoRevision{id=$id, commitHash=$commitHash, createdAt=$createdAt, fetchedAt=$fetchedAt, metadata=$metadata, repositoryId=$repositoryId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        class Repository
        private constructor(
            private val id: JsonField<String>,
            private val architectures: JsonField<List<String>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val metadata: JsonField<Metadata>,
            private val modalities: JsonField<List<String>>,
            private val ownerId: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val url: JsonField<String>,
            private val description: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("architectures")
                @ExcludeMissing
                architectures: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("modalities")
                @ExcludeMissing
                modalities: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("owner_id")
                @ExcludeMissing
                ownerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                architectures,
                createdAt,
                metadata,
                modalities,
                ownerId,
                tags,
                updatedAt,
                url,
                description,
                name,
                mutableMapOf(),
            )

            /**
             * UUID of the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Supported architectures
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun architectures(): List<String> = architectures.getRequired("architectures")

            /**
             * Timestamp when the repository was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * Additional metadata for the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metadata(): Metadata = metadata.getRequired("metadata")

            /**
             * Supported modalities
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun modalities(): List<String> = modalities.getRequired("modalities")

            /**
             * UUID of the repository owner
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerId(): String = ownerId.getRequired("owner_id")

            /**
             * Tags associated with the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun tags(): List<String> = tags.getRequired("tags")

            /**
             * Timestamp when the repository was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * URL of the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Description of the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Name of the repository
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [architectures].
             *
             * Unlike [architectures], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("architectures")
            @ExcludeMissing
            fun _architectures(): JsonField<List<String>> = architectures

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [modalities].
             *
             * Unlike [modalities], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("modalities")
            @ExcludeMissing
            fun _modalities(): JsonField<List<String>> = modalities

            /**
             * Returns the raw JSON value of [ownerId].
             *
             * Unlike [ownerId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("owner_id") @ExcludeMissing fun _ownerId(): JsonField<String> = ownerId

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [Repository].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .architectures()
                 * .createdAt()
                 * .metadata()
                 * .modalities()
                 * .ownerId()
                 * .tags()
                 * .updatedAt()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Repository]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var architectures: JsonField<MutableList<String>>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var metadata: JsonField<Metadata>? = null
                private var modalities: JsonField<MutableList<String>>? = null
                private var ownerId: JsonField<String>? = null
                private var tags: JsonField<MutableList<String>>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var url: JsonField<String>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(repository: Repository) = apply {
                    id = repository.id
                    architectures = repository.architectures.map { it.toMutableList() }
                    createdAt = repository.createdAt
                    metadata = repository.metadata
                    modalities = repository.modalities.map { it.toMutableList() }
                    ownerId = repository.ownerId
                    tags = repository.tags.map { it.toMutableList() }
                    updatedAt = repository.updatedAt
                    url = repository.url
                    description = repository.description
                    name = repository.name
                    additionalProperties = repository.additionalProperties.toMutableMap()
                }

                /** UUID of the repository */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Supported architectures */
                fun architectures(architectures: List<String>) =
                    architectures(JsonField.of(architectures))

                /**
                 * Sets [Builder.architectures] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.architectures] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun architectures(architectures: JsonField<List<String>>) = apply {
                    this.architectures = architectures.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [architectures].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addArchitecture(architecture: String) = apply {
                    architectures =
                        (architectures ?: JsonField.of(mutableListOf())).also {
                            checkKnown("architectures", it).add(architecture)
                        }
                }

                /** Timestamp when the repository was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Additional metadata for the repository */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** Supported modalities */
                fun modalities(modalities: List<String>) = modalities(JsonField.of(modalities))

                /**
                 * Sets [Builder.modalities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.modalities] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun modalities(modalities: JsonField<List<String>>) = apply {
                    this.modalities = modalities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [modalities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addModality(modality: String) = apply {
                    modalities =
                        (modalities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("modalities", it).add(modality)
                        }
                }

                /** UUID of the repository owner */
                fun ownerId(ownerId: String) = ownerId(JsonField.of(ownerId))

                /**
                 * Sets [Builder.ownerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ownerId(ownerId: JsonField<String>) = apply { this.ownerId = ownerId }

                /** Tags associated with the repository */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tags(tags: JsonField<List<String>>) = apply {
                    this.tags = tags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [tags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTag(tag: String) = apply {
                    tags =
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /** Timestamp when the repository was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /** URL of the repository */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Description of the repository */
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

                /** Name of the repository */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Repository].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .architectures()
                 * .createdAt()
                 * .metadata()
                 * .modalities()
                 * .ownerId()
                 * .tags()
                 * .updatedAt()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Repository =
                    Repository(
                        checkRequired("id", id),
                        checkRequired("architectures", architectures).map { it.toImmutable() },
                        checkRequired("createdAt", createdAt),
                        checkRequired("metadata", metadata),
                        checkRequired("modalities", modalities).map { it.toImmutable() },
                        checkRequired("ownerId", ownerId),
                        checkRequired("tags", tags).map { it.toImmutable() },
                        checkRequired("updatedAt", updatedAt),
                        checkRequired("url", url),
                        description,
                        name,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Repository = apply {
                if (validated) {
                    return@apply
                }

                id()
                architectures()
                createdAt()
                metadata().validate()
                modalities()
                ownerId()
                tags()
                updatedAt()
                url()
                description()
                name()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (architectures.asKnown().getOrNull()?.size ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (modalities.asKnown().getOrNull()?.size ?: 0) +
                    (if (ownerId.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            /** Additional metadata for the repository */
            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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

                    return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Repository && id == other.id && architectures == other.architectures && createdAt == other.createdAt && metadata == other.metadata && modalities == other.modalities && ownerId == other.ownerId && tags == other.tags && updatedAt == other.updatedAt && url == other.url && description == other.description && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, architectures, createdAt, metadata, modalities, ownerId, tags, updatedAt, url, description, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Repository{id=$id, architectures=$architectures, createdAt=$createdAt, metadata=$metadata, modalities=$modalities, ownerId=$ownerId, tags=$tags, updatedAt=$updatedAt, url=$url, description=$description, name=$name, additionalProperties=$additionalProperties}"
        }

        class UsePolicy
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val sha256: JsonField<String>,
            private val title: JsonField<String>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val url: JsonField<String>,
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("sha256")
                @ExcludeMissing
                sha256: JsonField<String> = JsonMissing.of(),
                @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of(),
            ) : this(id, createdAt, sha256, title, updatedAt, url, description, mutableMapOf())

            /**
             * UUID of the use policy
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Timestamp when the use policy was created
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * SHA256 hash of the policy text
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sha256(): String = sha256.getRequired("sha256")

            /**
             * Title of the use policy
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun title(): String = title.getRequired("title")

            /**
             * Timestamp when the use policy was last updated
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

            /**
             * URL of the use policy
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Description of the use policy
             *
             * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Returns the raw JSON value of [title].
             *
             * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [UsePolicy].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .sha256()
                 * .title()
                 * .updatedAt()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UsePolicy]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var sha256: JsonField<String>? = null
                private var title: JsonField<String>? = null
                private var updatedAt: JsonField<OffsetDateTime>? = null
                private var url: JsonField<String>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usePolicy: UsePolicy) = apply {
                    id = usePolicy.id
                    createdAt = usePolicy.createdAt
                    sha256 = usePolicy.sha256
                    title = usePolicy.title
                    updatedAt = usePolicy.updatedAt
                    url = usePolicy.url
                    description = usePolicy.description
                    additionalProperties = usePolicy.additionalProperties.toMutableMap()
                }

                /** UUID of the use policy */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Timestamp when the use policy was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** SHA256 hash of the policy text */
                fun sha256(sha256: String) = sha256(JsonField.of(sha256))

                /**
                 * Sets [Builder.sha256] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sha256] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sha256(sha256: JsonField<String>) = apply { this.sha256 = sha256 }

                /** Title of the use policy */
                fun title(title: String) = title(JsonField.of(title))

                /**
                 * Sets [Builder.title] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.title] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun title(title: JsonField<String>) = apply { this.title = title }

                /** Timestamp when the use policy was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                /** URL of the use policy */
                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                /** Description of the use policy */
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
                 * Returns an immutable instance of [UsePolicy].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .createdAt()
                 * .sha256()
                 * .title()
                 * .updatedAt()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UsePolicy =
                    UsePolicy(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("sha256", sha256),
                        checkRequired("title", title),
                        checkRequired("updatedAt", updatedAt),
                        checkRequired("url", url),
                        description,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): UsePolicy = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                sha256()
                title()
                updatedAt()
                url()
                description()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (sha256.asKnown().isPresent) 1 else 0) +
                    (if (title.asKnown().isPresent) 1 else 0) +
                    (if (updatedAt.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0) +
                    (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UsePolicy && id == other.id && createdAt == other.createdAt && sha256 == other.sha256 && title == other.title && updatedAt == other.updatedAt && url == other.url && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, createdAt, sha256, title, updatedAt, url, description, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UsePolicy{id=$id, createdAt=$createdAt, sha256=$sha256, title=$title, updatedAt=$updatedAt, url=$url, description=$description, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FileInstance && instance == other.instance && licenses == other.licenses && repoOwner == other.repoOwner && repoRevision == other.repoRevision && repository == other.repository && usePolicies == other.usePolicies && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(instance, licenses, repoOwner, repoRevision, repository, usePolicies, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FileInstance{instance=$instance, licenses=$licenses, repoOwner=$repoOwner, repoRevision=$repoRevision, repository=$repository, usePolicies=$usePolicies, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileRetrieveResponse && first == other.first && next == other.next && prev == other.prev && fileInstances == other.fileInstances && last == other.last && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(first, next, prev, fileInstances, last, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileRetrieveResponse{first=$first, next=$next, prev=$prev, fileInstances=$fileInstances, last=$last, additionalProperties=$additionalProperties}"
}
