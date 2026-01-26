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
import com.hiddenlayer.api.errors.HiddenLayerInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Status of a red team workflow. */
class RedTeamRetrieveStatusResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val runId: JsonField<String>,
    private val status: JsonField<String>,
    private val workflowId: JsonField<String>,
    private val activeSessions: JsonField<Int>,
    private val completedSessions: JsonField<Int>,
    private val elapsedSeconds: JsonField<Double>,
    private val error: JsonField<String>,
    private val etaSeconds: JsonField<Double>,
    private val failedSessions: JsonField<Int>,
    private val message: JsonField<String>,
    private val percentComplete: JsonField<Double>,
    private val phase: JsonField<String>,
    private val progressCompleted: JsonField<Int>,
    private val progressPercent: JsonField<Double>,
    private val progressTotal: JsonField<Int>,
    private val readyPromptsInQueue: JsonField<Int>,
    private val tenantId: JsonField<String>,
    private val totalSessions: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workflow_id")
        @ExcludeMissing
        workflowId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active_sessions")
        @ExcludeMissing
        activeSessions: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("completed_sessions")
        @ExcludeMissing
        completedSessions: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("elapsed_seconds")
        @ExcludeMissing
        elapsedSeconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("error") @ExcludeMissing error: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eta_seconds")
        @ExcludeMissing
        etaSeconds: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("failed_sessions")
        @ExcludeMissing
        failedSessions: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("percent_complete")
        @ExcludeMissing
        percentComplete: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("phase") @ExcludeMissing phase: JsonField<String> = JsonMissing.of(),
        @JsonProperty("progress_completed")
        @ExcludeMissing
        progressCompleted: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("progress_percent")
        @ExcludeMissing
        progressPercent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("progress_total")
        @ExcludeMissing
        progressTotal: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("ready_prompts_in_queue")
        @ExcludeMissing
        readyPromptsInQueue: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_sessions")
        @ExcludeMissing
        totalSessions: JsonField<Int> = JsonMissing.of(),
    ) : this(
        name,
        runId,
        status,
        workflowId,
        activeSessions,
        completedSessions,
        elapsedSeconds,
        error,
        etaSeconds,
        failedSessions,
        message,
        percentComplete,
        phase,
        progressCompleted,
        progressPercent,
        progressTotal,
        readyPromptsInQueue,
        tenantId,
        totalSessions,
        mutableMapOf(),
    )

    /**
     * Workflow name
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Run identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * Workflow status
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * Workflow identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workflowId(): String = workflowId.getRequired("workflow_id")

    /**
     * Number of active sessions
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activeSessions(): Optional<Int> = activeSessions.getOptional("active_sessions")

    /**
     * Number of completed sessions
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedSessions(): Optional<Int> = completedSessions.getOptional("completed_sessions")

    /**
     * Elapsed time in seconds
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun elapsedSeconds(): Optional<Double> = elapsedSeconds.getOptional("elapsed_seconds")

    /**
     * Error message if failed
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun error(): Optional<String> = error.getOptional("error")

    /**
     * Estimated time remaining in seconds
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun etaSeconds(): Optional<Double> = etaSeconds.getOptional("eta_seconds")

    /**
     * Number of failed sessions
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedSessions(): Optional<Int> = failedSessions.getOptional("failed_sessions")

    /**
     * Status message
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Percentage complete
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun percentComplete(): Optional<Double> = percentComplete.getOptional("percent_complete")

    /**
     * Current workflow phase
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phase(): Optional<String> = phase.getOptional("phase")

    /**
     * Completed progress items
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressCompleted(): Optional<Int> = progressCompleted.getOptional("progress_completed")

    /**
     * Progress percentage
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressPercent(): Optional<Double> = progressPercent.getOptional("progress_percent")

    /**
     * Total progress items
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun progressTotal(): Optional<Int> = progressTotal.getOptional("progress_total")

    /**
     * Number of prompts ready in queue
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readyPromptsInQueue(): Optional<Int> =
        readyPromptsInQueue.getOptional("ready_prompts_in_queue")

    /**
     * Tenant identifier
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Total number of sessions
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSessions(): Optional<Int> = totalSessions.getOptional("total_sessions")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [workflowId].
     *
     * Unlike [workflowId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workflow_id") @ExcludeMissing fun _workflowId(): JsonField<String> = workflowId

    /**
     * Returns the raw JSON value of [activeSessions].
     *
     * Unlike [activeSessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active_sessions")
    @ExcludeMissing
    fun _activeSessions(): JsonField<Int> = activeSessions

    /**
     * Returns the raw JSON value of [completedSessions].
     *
     * Unlike [completedSessions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completed_sessions")
    @ExcludeMissing
    fun _completedSessions(): JsonField<Int> = completedSessions

    /**
     * Returns the raw JSON value of [elapsedSeconds].
     *
     * Unlike [elapsedSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elapsed_seconds")
    @ExcludeMissing
    fun _elapsedSeconds(): JsonField<Double> = elapsedSeconds

    /**
     * Returns the raw JSON value of [error].
     *
     * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /**
     * Returns the raw JSON value of [etaSeconds].
     *
     * Unlike [etaSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eta_seconds") @ExcludeMissing fun _etaSeconds(): JsonField<Double> = etaSeconds

    /**
     * Returns the raw JSON value of [failedSessions].
     *
     * Unlike [failedSessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failed_sessions")
    @ExcludeMissing
    fun _failedSessions(): JsonField<Int> = failedSessions

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [percentComplete].
     *
     * Unlike [percentComplete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("percent_complete")
    @ExcludeMissing
    fun _percentComplete(): JsonField<Double> = percentComplete

    /**
     * Returns the raw JSON value of [phase].
     *
     * Unlike [phase], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phase") @ExcludeMissing fun _phase(): JsonField<String> = phase

    /**
     * Returns the raw JSON value of [progressCompleted].
     *
     * Unlike [progressCompleted], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("progress_completed")
    @ExcludeMissing
    fun _progressCompleted(): JsonField<Int> = progressCompleted

    /**
     * Returns the raw JSON value of [progressPercent].
     *
     * Unlike [progressPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress_percent")
    @ExcludeMissing
    fun _progressPercent(): JsonField<Double> = progressPercent

    /**
     * Returns the raw JSON value of [progressTotal].
     *
     * Unlike [progressTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("progress_total")
    @ExcludeMissing
    fun _progressTotal(): JsonField<Int> = progressTotal

    /**
     * Returns the raw JSON value of [readyPromptsInQueue].
     *
     * Unlike [readyPromptsInQueue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ready_prompts_in_queue")
    @ExcludeMissing
    fun _readyPromptsInQueue(): JsonField<Int> = readyPromptsInQueue

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [totalSessions].
     *
     * Unlike [totalSessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_sessions")
    @ExcludeMissing
    fun _totalSessions(): JsonField<Int> = totalSessions

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
         * [RedTeamRetrieveStatusResponse].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .runId()
         * .status()
         * .workflowId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedTeamRetrieveStatusResponse]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var runId: JsonField<String>? = null
        private var status: JsonField<String>? = null
        private var workflowId: JsonField<String>? = null
        private var activeSessions: JsonField<Int> = JsonMissing.of()
        private var completedSessions: JsonField<Int> = JsonMissing.of()
        private var elapsedSeconds: JsonField<Double> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var etaSeconds: JsonField<Double> = JsonMissing.of()
        private var failedSessions: JsonField<Int> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var percentComplete: JsonField<Double> = JsonMissing.of()
        private var phase: JsonField<String> = JsonMissing.of()
        private var progressCompleted: JsonField<Int> = JsonMissing.of()
        private var progressPercent: JsonField<Double> = JsonMissing.of()
        private var progressTotal: JsonField<Int> = JsonMissing.of()
        private var readyPromptsInQueue: JsonField<Int> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var totalSessions: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(redTeamRetrieveStatusResponse: RedTeamRetrieveStatusResponse) = apply {
            name = redTeamRetrieveStatusResponse.name
            runId = redTeamRetrieveStatusResponse.runId
            status = redTeamRetrieveStatusResponse.status
            workflowId = redTeamRetrieveStatusResponse.workflowId
            activeSessions = redTeamRetrieveStatusResponse.activeSessions
            completedSessions = redTeamRetrieveStatusResponse.completedSessions
            elapsedSeconds = redTeamRetrieveStatusResponse.elapsedSeconds
            error = redTeamRetrieveStatusResponse.error
            etaSeconds = redTeamRetrieveStatusResponse.etaSeconds
            failedSessions = redTeamRetrieveStatusResponse.failedSessions
            message = redTeamRetrieveStatusResponse.message
            percentComplete = redTeamRetrieveStatusResponse.percentComplete
            phase = redTeamRetrieveStatusResponse.phase
            progressCompleted = redTeamRetrieveStatusResponse.progressCompleted
            progressPercent = redTeamRetrieveStatusResponse.progressPercent
            progressTotal = redTeamRetrieveStatusResponse.progressTotal
            readyPromptsInQueue = redTeamRetrieveStatusResponse.readyPromptsInQueue
            tenantId = redTeamRetrieveStatusResponse.tenantId
            totalSessions = redTeamRetrieveStatusResponse.totalSessions
            additionalProperties = redTeamRetrieveStatusResponse.additionalProperties.toMutableMap()
        }

        /** Workflow name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Run identifier */
        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        /** Workflow status */
        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

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

        /** Number of active sessions */
        fun activeSessions(activeSessions: Int) = activeSessions(JsonField.of(activeSessions))

        /**
         * Sets [Builder.activeSessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activeSessions] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun activeSessions(activeSessions: JsonField<Int>) = apply {
            this.activeSessions = activeSessions
        }

        /** Number of completed sessions */
        fun completedSessions(completedSessions: Int) =
            completedSessions(JsonField.of(completedSessions))

        /**
         * Sets [Builder.completedSessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedSessions] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedSessions(completedSessions: JsonField<Int>) = apply {
            this.completedSessions = completedSessions
        }

        /** Elapsed time in seconds */
        fun elapsedSeconds(elapsedSeconds: Double) = elapsedSeconds(JsonField.of(elapsedSeconds))

        /**
         * Sets [Builder.elapsedSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elapsedSeconds] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun elapsedSeconds(elapsedSeconds: JsonField<Double>) = apply {
            this.elapsedSeconds = elapsedSeconds
        }

        /** Error message if failed */
        fun error(error: String) = error(JsonField.of(error))

        /**
         * Sets [Builder.error] to an arbitrary JSON value.
         *
         * You should usually call [Builder.error] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** Estimated time remaining in seconds */
        fun etaSeconds(etaSeconds: Double) = etaSeconds(JsonField.of(etaSeconds))

        /**
         * Sets [Builder.etaSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etaSeconds] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun etaSeconds(etaSeconds: JsonField<Double>) = apply { this.etaSeconds = etaSeconds }

        /** Number of failed sessions */
        fun failedSessions(failedSessions: Int) = failedSessions(JsonField.of(failedSessions))

        /**
         * Sets [Builder.failedSessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedSessions] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failedSessions(failedSessions: JsonField<Int>) = apply {
            this.failedSessions = failedSessions
        }

        /** Status message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Percentage complete */
        fun percentComplete(percentComplete: Double) =
            percentComplete(JsonField.of(percentComplete))

        /**
         * Sets [Builder.percentComplete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.percentComplete] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun percentComplete(percentComplete: JsonField<Double>) = apply {
            this.percentComplete = percentComplete
        }

        /** Current workflow phase */
        fun phase(phase: String) = phase(JsonField.of(phase))

        /**
         * Sets [Builder.phase] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phase] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun phase(phase: JsonField<String>) = apply { this.phase = phase }

        /** Completed progress items */
        fun progressCompleted(progressCompleted: Int) =
            progressCompleted(JsonField.of(progressCompleted))

        /**
         * Sets [Builder.progressCompleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressCompleted] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun progressCompleted(progressCompleted: JsonField<Int>) = apply {
            this.progressCompleted = progressCompleted
        }

        /** Progress percentage */
        fun progressPercent(progressPercent: Double) =
            progressPercent(JsonField.of(progressPercent))

        /**
         * Sets [Builder.progressPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressPercent] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun progressPercent(progressPercent: JsonField<Double>) = apply {
            this.progressPercent = progressPercent
        }

        /** Total progress items */
        fun progressTotal(progressTotal: Int) = progressTotal(JsonField.of(progressTotal))

        /**
         * Sets [Builder.progressTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.progressTotal] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun progressTotal(progressTotal: JsonField<Int>) = apply {
            this.progressTotal = progressTotal
        }

        /** Number of prompts ready in queue */
        fun readyPromptsInQueue(readyPromptsInQueue: Int) =
            readyPromptsInQueue(JsonField.of(readyPromptsInQueue))

        /**
         * Sets [Builder.readyPromptsInQueue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readyPromptsInQueue] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readyPromptsInQueue(readyPromptsInQueue: JsonField<Int>) = apply {
            this.readyPromptsInQueue = readyPromptsInQueue
        }

        /** Tenant identifier */
        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        /** Total number of sessions */
        fun totalSessions(totalSessions: Int) = totalSessions(JsonField.of(totalSessions))

        /**
         * Sets [Builder.totalSessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSessions] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalSessions(totalSessions: JsonField<Int>) = apply {
            this.totalSessions = totalSessions
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
         * Returns an immutable instance of [RedTeamRetrieveStatusResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .runId()
         * .status()
         * .workflowId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedTeamRetrieveStatusResponse =
            RedTeamRetrieveStatusResponse(
                checkRequired("name", name),
                checkRequired("runId", runId),
                checkRequired("status", status),
                checkRequired("workflowId", workflowId),
                activeSessions,
                completedSessions,
                elapsedSeconds,
                error,
                etaSeconds,
                failedSessions,
                message,
                percentComplete,
                phase,
                progressCompleted,
                progressPercent,
                progressTotal,
                readyPromptsInQueue,
                tenantId,
                totalSessions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RedTeamRetrieveStatusResponse = apply {
        if (validated) {
            return@apply
        }

        name()
        runId()
        status()
        workflowId()
        activeSessions()
        completedSessions()
        elapsedSeconds()
        error()
        etaSeconds()
        failedSessions()
        message()
        percentComplete()
        phase()
        progressCompleted()
        progressPercent()
        progressTotal()
        readyPromptsInQueue()
        tenantId()
        totalSessions()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (workflowId.asKnown().isPresent) 1 else 0) +
            (if (activeSessions.asKnown().isPresent) 1 else 0) +
            (if (completedSessions.asKnown().isPresent) 1 else 0) +
            (if (elapsedSeconds.asKnown().isPresent) 1 else 0) +
            (if (error.asKnown().isPresent) 1 else 0) +
            (if (etaSeconds.asKnown().isPresent) 1 else 0) +
            (if (failedSessions.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (percentComplete.asKnown().isPresent) 1 else 0) +
            (if (phase.asKnown().isPresent) 1 else 0) +
            (if (progressCompleted.asKnown().isPresent) 1 else 0) +
            (if (progressPercent.asKnown().isPresent) 1 else 0) +
            (if (progressTotal.asKnown().isPresent) 1 else 0) +
            (if (readyPromptsInQueue.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (totalSessions.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedTeamRetrieveStatusResponse &&
            name == other.name &&
            runId == other.runId &&
            status == other.status &&
            workflowId == other.workflowId &&
            activeSessions == other.activeSessions &&
            completedSessions == other.completedSessions &&
            elapsedSeconds == other.elapsedSeconds &&
            error == other.error &&
            etaSeconds == other.etaSeconds &&
            failedSessions == other.failedSessions &&
            message == other.message &&
            percentComplete == other.percentComplete &&
            phase == other.phase &&
            progressCompleted == other.progressCompleted &&
            progressPercent == other.progressPercent &&
            progressTotal == other.progressTotal &&
            readyPromptsInQueue == other.readyPromptsInQueue &&
            tenantId == other.tenantId &&
            totalSessions == other.totalSessions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            runId,
            status,
            workflowId,
            activeSessions,
            completedSessions,
            elapsedSeconds,
            error,
            etaSeconds,
            failedSessions,
            message,
            percentComplete,
            phase,
            progressCompleted,
            progressPercent,
            progressTotal,
            readyPromptsInQueue,
            tenantId,
            totalSessions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RedTeamRetrieveStatusResponse{name=$name, runId=$runId, status=$status, workflowId=$workflowId, activeSessions=$activeSessions, completedSessions=$completedSessions, elapsedSeconds=$elapsedSeconds, error=$error, etaSeconds=$etaSeconds, failedSessions=$failedSessions, message=$message, percentComplete=$percentComplete, phase=$phase, progressCompleted=$progressCompleted, progressPercent=$progressPercent, progressTotal=$progressTotal, readyPromptsInQueue=$readyPromptsInQueue, tenantId=$tenantId, totalSessions=$totalSessions, additionalProperties=$additionalProperties}"
}
