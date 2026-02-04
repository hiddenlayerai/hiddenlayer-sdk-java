// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hiddenlayer.api.core.ExcludeMissing
import com.hiddenlayer.api.core.JsonField
import com.hiddenlayer.api.core.JsonMissing
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.checkRequired
import com.hiddenlayer.api.core.toImmutable
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Complete result of a workflow. */
class RedTeamRetrieveEvaluationResultsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val result: JsonField<Result>,
    private val runId: JsonField<String>,
    private val workflowId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workflow_id")
        @ExcludeMissing
        workflowId: JsonField<String> = JsonMissing.of(),
    ) : this(result, runId, workflowId, mutableMapOf())

    /**
     * Full workflow result payload
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Run identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * Workflow identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflowId(): String = workflowId.getRequired("workflow_id")

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflow_id") @ExcludeMissing fun _workflowId(): JsonField<String> = workflowId

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
         * Returns a mutable builder for constructing an instance of
         * [RedTeamRetrieveEvaluationResultsResponse].
         *
         * The following fields are required:
         * ```java
         * .result()
         * .runId()
         * .workflowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedTeamRetrieveEvaluationResultsResponse]. */
    class Builder internal constructor() {

        private var result: JsonField<Result>? = null
        private var runId: JsonField<String>? = null
        private var workflowId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            redTeamRetrieveEvaluationResultsResponse: RedTeamRetrieveEvaluationResultsResponse
        ) = apply {
            result = redTeamRetrieveEvaluationResultsResponse.result
            runId = redTeamRetrieveEvaluationResultsResponse.runId
            workflowId = redTeamRetrieveEvaluationResultsResponse.workflowId
            additionalProperties =
                redTeamRetrieveEvaluationResultsResponse.additionalProperties.toMutableMap()
        }

        /** Full workflow result payload */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** Run identifier */
        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        /** Workflow identifier */
        fun workflowId(workflowId: String) = workflowId(JsonField.of(workflowId))

        /**
         * Sets [Builder.workflowId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workflowId(workflowId: JsonField<String>) = apply { this.workflowId = workflowId }

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
         * Returns an immutable instance of [RedTeamRetrieveEvaluationResultsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .result()
         * .runId()
         * .workflowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedTeamRetrieveEvaluationResultsResponse =
            RedTeamRetrieveEvaluationResultsResponse(
                checkRequired("result", result),
                checkRequired("runId", runId),
                checkRequired("workflowId", workflowId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RedTeamRetrieveEvaluationResultsResponse = apply {
        if (validated) {
            return@apply
        }

        result().validate()
        runId()
        workflowId()
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
        (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0)

    /** Full workflow result payload */
    class Result
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

            /** Returns a mutable builder for constructing an instance of [Result]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                additionalProperties = result.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Result = Result(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Result{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedTeamRetrieveEvaluationResultsResponse &&
            result == other.result &&
            runId == other.runId &&
            workflowId == other.workflowId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(result, runId, workflowId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RedTeamRetrieveEvaluationResultsResponse{result=$result, runId=$runId, workflowId=$workflowId, additionalProperties=$additionalProperties}"
}
