// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer_sdk.api.core.ExcludeMissing
import com.hiddenlayer_sdk.api.core.JsonField
import com.hiddenlayer_sdk.api.core.JsonMissing
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class InteractionsProject
private constructor(
    private val projectAlias: JsonField<String>,
    private val projectId: JsonField<String>,
    private val rulesetId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("project_alias")
        @ExcludeMissing
        projectAlias: JsonField<String> = JsonMissing.of(),
        @JsonProperty("project_id") @ExcludeMissing projectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ruleset_id") @ExcludeMissing rulesetId: JsonField<String> = JsonMissing.of(),
    ) : this(projectAlias, projectId, rulesetId, mutableMapOf())

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectAlias(): Optional<String> = projectAlias.getOptional("project_alias")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = projectId.getOptional("project_id")

    /**
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rulesetId(): Optional<String> = rulesetId.getOptional("ruleset_id")

    /**
     * Returns the raw JSON value of [projectAlias].
     *
     * Unlike [projectAlias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_alias")
    @ExcludeMissing
    fun _projectAlias(): JsonField<String> = projectAlias

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("project_id") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

    /**
     * Returns the raw JSON value of [rulesetId].
     *
     * Unlike [rulesetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ruleset_id") @ExcludeMissing fun _rulesetId(): JsonField<String> = rulesetId

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

        /** Returns a mutable builder for constructing an instance of [InteractionsProject]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InteractionsProject]. */
    class Builder internal constructor() {

        private var projectAlias: JsonField<String> = JsonMissing.of()
        private var projectId: JsonField<String> = JsonMissing.of()
        private var rulesetId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(interactionsProject: InteractionsProject) = apply {
            projectAlias = interactionsProject.projectAlias
            projectId = interactionsProject.projectId
            rulesetId = interactionsProject.rulesetId
            additionalProperties = interactionsProject.additionalProperties.toMutableMap()
        }

        fun projectAlias(projectAlias: String) = projectAlias(JsonField.of(projectAlias))

        /**
         * Sets [Builder.projectAlias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectAlias] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectAlias(projectAlias: JsonField<String>) = apply {
            this.projectAlias = projectAlias
        }

        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

        fun rulesetId(rulesetId: String) = rulesetId(JsonField.of(rulesetId))

        /**
         * Sets [Builder.rulesetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rulesetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rulesetId(rulesetId: JsonField<String>) = apply { this.rulesetId = rulesetId }

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
         * Returns an immutable instance of [InteractionsProject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InteractionsProject =
            InteractionsProject(
                projectAlias,
                projectId,
                rulesetId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InteractionsProject = apply {
        if (validated) {
            return@apply
        }

        projectAlias()
        projectId()
        rulesetId()
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
        (if (projectAlias.asKnown().isPresent) 1 else 0) +
            (if (projectId.asKnown().isPresent) 1 else 0) +
            (if (rulesetId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InteractionsProject &&
            projectAlias == other.projectAlias &&
            projectId == other.projectId &&
            rulesetId == other.rulesetId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(projectAlias, projectId, rulesetId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InteractionsProject{projectAlias=$projectAlias, projectId=$projectId, rulesetId=$rulesetId, additionalProperties=$additionalProperties}"
}
