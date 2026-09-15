// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

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

/**
 * [BETA] This endpoint is not GA or Production ready and is subject to changes at any time.
 * Breaking changes may occur.
 *
 * Start a new red team client workflow. Auto-triggers planning phase. Client should then poll
 * /next-action.
 */
class RedTeamCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Name for this evaluation
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Optional intent-only natural-language text the operator supplies to focus the attacker LLM
     * within the configured APE objectives. Example: "try to get the model to recommend candy with
     * nuts to a user who's allergic to nuts."
     *
     * Sanitized server-side: input is NFKC-normalized, trimmed, and checked against a strict
     * character whitelist (ASCII letters, digits, spaces/newlines/tabs, and sentence-level
     * punctuation `. , ? ! ' " - : ; ( )`). Inputs containing XML/JSON/code/control/markdown
     * characters are rejected with 422.
     *
     * No-op for the `STATIC_PROMPT_SET` execution strategy.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attackerGuidance(): Optional<String> = body.attackerGuidance()

    /**
     * Internal override; service default applies if omitted. Maximum number of generation attempts
     * for the attacker model per turn.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attackerMaxGenerationAttempts(): Optional<Int> = body.attackerMaxGenerationAttempts()

    /**
     * Internal override; service default applies if omitted.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attackerModel(): Optional<String> = body.attackerModel()

    /**
     * Optional preset config (see /evaluations/v1/red-team/configs) to seed the workflow settings.
     * Any field also present in this body overrides the corresponding value from the config.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configId(): Optional<String> = body.configId()

    /**
     * Internal override; service default applies if omitted.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun evaluationReportModel(): Optional<String> = body.evaluationReportModel()

    /**
     * Execution strategy type
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionStrategyType(): Optional<ExecutionStrategyType> = body.executionStrategyType()

    /**
     * HiddenLayer project UUID or alias
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hlProjectId(): Optional<String> = body.hlProjectId()

    /**
     * Maximum parallel techniques
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxParallelTechniques(): Optional<Int> = body.maxParallelTechniques()

    /**
     * Maximum conversation turns
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxTurns(): Optional<Int> = body.maxTurns()

    /**
     * Number of random techniques to use
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nRandomTechniques(): Optional<Int> = body.nRandomTechniques()

    /**
     * Objective IDs to evaluate
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectiveIds(): Optional<List<String>> = body.objectiveIds()

    /**
     * Internal override; service default applies if omitted.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectiveJudgeModel(): Optional<String> = body.objectiveJudgeModel()

    /**
     * Prompt set UUID (built-in catalog or tenant DB)
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun promptSetId(): Optional<String> = body.promptSetId()

    /**
     * Internal override; service default applies if omitted.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refusalJudgeModel(): Optional<String> = body.refusalJudgeModel()

    /**
     * Number of sessions per technique
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionsPerTechnique(): Optional<Int> = body.sessionsPerTechnique()

    /**
     * Map from objective ID to a severity level. Determines the per-session severity derived from
     * the worst objective achieved during a red team session.
     *
     * Keys must be objective IDs known to this service; unknown keys are rejected at validation
     * time. Limited to 256 entries.
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severityMapping(): Optional<SeverityMapping> = body.severityMapping()

    /**
     * Target model identifier. Freeform for the client-driven workflow: the client owns and drives
     * its own target, so this is NOT validated against the servable-model catalog. (The simulated
     * start and config presets do validate against the catalog.)
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetModel(): Optional<String> = body.targetModel()

    /**
     * System prompt for the target
     *
     * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetSystemPrompt(): Optional<String> = body.targetSystemPrompt()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [attackerGuidance].
     *
     * Unlike [attackerGuidance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attackerGuidance(): JsonField<String> = body._attackerGuidance()

    /**
     * Returns the raw JSON value of [attackerMaxGenerationAttempts].
     *
     * Unlike [attackerMaxGenerationAttempts], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _attackerMaxGenerationAttempts(): JsonField<Int> = body._attackerMaxGenerationAttempts()

    /**
     * Returns the raw JSON value of [attackerModel].
     *
     * Unlike [attackerModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attackerModel(): JsonField<String> = body._attackerModel()

    /**
     * Returns the raw JSON value of [configId].
     *
     * Unlike [configId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _configId(): JsonField<String> = body._configId()

    /**
     * Returns the raw JSON value of [evaluationReportModel].
     *
     * Unlike [evaluationReportModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _evaluationReportModel(): JsonField<String> = body._evaluationReportModel()

    /**
     * Returns the raw JSON value of [executionStrategyType].
     *
     * Unlike [executionStrategyType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _executionStrategyType(): JsonField<ExecutionStrategyType> = body._executionStrategyType()

    /**
     * Returns the raw JSON value of [hlProjectId].
     *
     * Unlike [hlProjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hlProjectId(): JsonField<String> = body._hlProjectId()

    /**
     * Returns the raw JSON value of [maxParallelTechniques].
     *
     * Unlike [maxParallelTechniques], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxParallelTechniques(): JsonField<Int> = body._maxParallelTechniques()

    /**
     * Returns the raw JSON value of [maxTurns].
     *
     * Unlike [maxTurns], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxTurns(): JsonField<Int> = body._maxTurns()

    /**
     * Returns the raw JSON value of [nRandomTechniques].
     *
     * Unlike [nRandomTechniques], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _nRandomTechniques(): JsonField<Int> = body._nRandomTechniques()

    /**
     * Returns the raw JSON value of [objectiveIds].
     *
     * Unlike [objectiveIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _objectiveIds(): JsonField<List<String>> = body._objectiveIds()

    /**
     * Returns the raw JSON value of [objectiveJudgeModel].
     *
     * Unlike [objectiveJudgeModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _objectiveJudgeModel(): JsonField<String> = body._objectiveJudgeModel()

    /**
     * Returns the raw JSON value of [promptSetId].
     *
     * Unlike [promptSetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _promptSetId(): JsonField<String> = body._promptSetId()

    /**
     * Returns the raw JSON value of [refusalJudgeModel].
     *
     * Unlike [refusalJudgeModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _refusalJudgeModel(): JsonField<String> = body._refusalJudgeModel()

    /**
     * Returns the raw JSON value of [sessionsPerTechnique].
     *
     * Unlike [sessionsPerTechnique], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sessionsPerTechnique(): JsonField<Int> = body._sessionsPerTechnique()

    /**
     * Returns the raw JSON value of [severityMapping].
     *
     * Unlike [severityMapping], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _severityMapping(): JsonField<SeverityMapping> = body._severityMapping()

    /**
     * Returns the raw JSON value of [targetModel].
     *
     * Unlike [targetModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetModel(): JsonField<String> = body._targetModel()

    /**
     * Returns the raw JSON value of [targetSystemPrompt].
     *
     * Unlike [targetSystemPrompt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _targetSystemPrompt(): JsonField<String> = body._targetSystemPrompt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RedTeamCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RedTeamCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(redTeamCreateParams: RedTeamCreateParams) = apply {
            body = redTeamCreateParams.body.toBuilder()
            additionalHeaders = redTeamCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = redTeamCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [attackerGuidance]
         * - [attackerMaxGenerationAttempts]
         * - [attackerModel]
         * - [configId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Name for this evaluation */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Optional intent-only natural-language text the operator supplies to focus the attacker
         * LLM within the configured APE objectives. Example: "try to get the model to recommend
         * candy with nuts to a user who's allergic to nuts."
         *
         * Sanitized server-side: input is NFKC-normalized, trimmed, and checked against a strict
         * character whitelist (ASCII letters, digits, spaces/newlines/tabs, and sentence-level
         * punctuation `. , ? ! ' " - : ; ( )`). Inputs containing XML/JSON/code/control/markdown
         * characters are rejected with 422.
         *
         * No-op for the `STATIC_PROMPT_SET` execution strategy.
         */
        fun attackerGuidance(attackerGuidance: String) = apply {
            body.attackerGuidance(attackerGuidance)
        }

        /**
         * Sets [Builder.attackerGuidance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attackerGuidance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attackerGuidance(attackerGuidance: JsonField<String>) = apply {
            body.attackerGuidance(attackerGuidance)
        }

        /**
         * Internal override; service default applies if omitted. Maximum number of generation
         * attempts for the attacker model per turn.
         */
        fun attackerMaxGenerationAttempts(attackerMaxGenerationAttempts: Int) = apply {
            body.attackerMaxGenerationAttempts(attackerMaxGenerationAttempts)
        }

        /**
         * Sets [Builder.attackerMaxGenerationAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attackerMaxGenerationAttempts] with a well-typed [Int]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attackerMaxGenerationAttempts(attackerMaxGenerationAttempts: JsonField<Int>) = apply {
            body.attackerMaxGenerationAttempts(attackerMaxGenerationAttempts)
        }

        /** Internal override; service default applies if omitted. */
        fun attackerModel(attackerModel: String) = apply { body.attackerModel(attackerModel) }

        /**
         * Sets [Builder.attackerModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attackerModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun attackerModel(attackerModel: JsonField<String>) = apply {
            body.attackerModel(attackerModel)
        }

        /**
         * Optional preset config (see /evaluations/v1/red-team/configs) to seed the workflow
         * settings. Any field also present in this body overrides the corresponding value from the
         * config.
         */
        fun configId(configId: String) = apply { body.configId(configId) }

        /**
         * Sets [Builder.configId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun configId(configId: JsonField<String>) = apply { body.configId(configId) }

        /** Internal override; service default applies if omitted. */
        fun evaluationReportModel(evaluationReportModel: String) = apply {
            body.evaluationReportModel(evaluationReportModel)
        }

        /**
         * Sets [Builder.evaluationReportModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evaluationReportModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun evaluationReportModel(evaluationReportModel: JsonField<String>) = apply {
            body.evaluationReportModel(evaluationReportModel)
        }

        /** Execution strategy type */
        fun executionStrategyType(executionStrategyType: ExecutionStrategyType) = apply {
            body.executionStrategyType(executionStrategyType)
        }

        /**
         * Sets [Builder.executionStrategyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionStrategyType] with a well-typed
         * [ExecutionStrategyType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun executionStrategyType(executionStrategyType: JsonField<ExecutionStrategyType>) = apply {
            body.executionStrategyType(executionStrategyType)
        }

        /** HiddenLayer project UUID or alias */
        fun hlProjectId(hlProjectId: String) = apply { body.hlProjectId(hlProjectId) }

        /**
         * Sets [Builder.hlProjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hlProjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hlProjectId(hlProjectId: JsonField<String>) = apply { body.hlProjectId(hlProjectId) }

        /** Maximum parallel techniques */
        fun maxParallelTechniques(maxParallelTechniques: Int) = apply {
            body.maxParallelTechniques(maxParallelTechniques)
        }

        /**
         * Sets [Builder.maxParallelTechniques] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxParallelTechniques] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxParallelTechniques(maxParallelTechniques: JsonField<Int>) = apply {
            body.maxParallelTechniques(maxParallelTechniques)
        }

        /** Maximum conversation turns */
        fun maxTurns(maxTurns: Int) = apply { body.maxTurns(maxTurns) }

        /**
         * Sets [Builder.maxTurns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTurns] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTurns(maxTurns: JsonField<Int>) = apply { body.maxTurns(maxTurns) }

        /** Number of random techniques to use */
        fun nRandomTechniques(nRandomTechniques: Int) = apply {
            body.nRandomTechniques(nRandomTechniques)
        }

        /**
         * Sets [Builder.nRandomTechniques] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nRandomTechniques] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nRandomTechniques(nRandomTechniques: JsonField<Int>) = apply {
            body.nRandomTechniques(nRandomTechniques)
        }

        /** Objective IDs to evaluate */
        fun objectiveIds(objectiveIds: List<String>) = apply { body.objectiveIds(objectiveIds) }

        /**
         * Sets [Builder.objectiveIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectiveIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectiveIds(objectiveIds: JsonField<List<String>>) = apply {
            body.objectiveIds(objectiveIds)
        }

        /**
         * Adds a single [String] to [objectiveIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectiveId(objectiveId: String) = apply { body.addObjectiveId(objectiveId) }

        /** Internal override; service default applies if omitted. */
        fun objectiveJudgeModel(objectiveJudgeModel: String) = apply {
            body.objectiveJudgeModel(objectiveJudgeModel)
        }

        /**
         * Sets [Builder.objectiveJudgeModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectiveJudgeModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectiveJudgeModel(objectiveJudgeModel: JsonField<String>) = apply {
            body.objectiveJudgeModel(objectiveJudgeModel)
        }

        /** Prompt set UUID (built-in catalog or tenant DB) */
        fun promptSetId(promptSetId: String) = apply { body.promptSetId(promptSetId) }

        /**
         * Sets [Builder.promptSetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptSetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun promptSetId(promptSetId: JsonField<String>) = apply { body.promptSetId(promptSetId) }

        /** Internal override; service default applies if omitted. */
        fun refusalJudgeModel(refusalJudgeModel: String) = apply {
            body.refusalJudgeModel(refusalJudgeModel)
        }

        /**
         * Sets [Builder.refusalJudgeModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refusalJudgeModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refusalJudgeModel(refusalJudgeModel: JsonField<String>) = apply {
            body.refusalJudgeModel(refusalJudgeModel)
        }

        /** Number of sessions per technique */
        fun sessionsPerTechnique(sessionsPerTechnique: Int) = apply {
            body.sessionsPerTechnique(sessionsPerTechnique)
        }

        /**
         * Sets [Builder.sessionsPerTechnique] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionsPerTechnique] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessionsPerTechnique(sessionsPerTechnique: JsonField<Int>) = apply {
            body.sessionsPerTechnique(sessionsPerTechnique)
        }

        /**
         * Map from objective ID to a severity level. Determines the per-session severity derived
         * from the worst objective achieved during a red team session.
         *
         * Keys must be objective IDs known to this service; unknown keys are rejected at validation
         * time. Limited to 256 entries.
         */
        fun severityMapping(severityMapping: SeverityMapping) = apply {
            body.severityMapping(severityMapping)
        }

        /**
         * Sets [Builder.severityMapping] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severityMapping] with a well-typed [SeverityMapping]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun severityMapping(severityMapping: JsonField<SeverityMapping>) = apply {
            body.severityMapping(severityMapping)
        }

        /**
         * Target model identifier. Freeform for the client-driven workflow: the client owns and
         * drives its own target, so this is NOT validated against the servable-model catalog. (The
         * simulated start and config presets do validate against the catalog.)
         */
        fun targetModel(targetModel: String) = apply { body.targetModel(targetModel) }

        /**
         * Sets [Builder.targetModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetModel(targetModel: JsonField<String>) = apply { body.targetModel(targetModel) }

        /** System prompt for the target */
        fun targetSystemPrompt(targetSystemPrompt: String) = apply {
            body.targetSystemPrompt(targetSystemPrompt)
        }

        /**
         * Sets [Builder.targetSystemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetSystemPrompt] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetSystemPrompt(targetSystemPrompt: JsonField<String>) = apply {
            body.targetSystemPrompt(targetSystemPrompt)
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
         * Returns an immutable instance of [RedTeamCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RedTeamCreateParams =
            RedTeamCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request to start a client-driven red team workflow.
     *
     * `target_model` and `target_system_prompt` may be supplied directly or sourced from a
     * referenced `config_id`. If neither location supplies them, the start request is rejected
     * with 422.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val attackerGuidance: JsonField<String>,
        private val attackerMaxGenerationAttempts: JsonField<Int>,
        private val attackerModel: JsonField<String>,
        private val configId: JsonField<String>,
        private val evaluationReportModel: JsonField<String>,
        private val executionStrategyType: JsonField<ExecutionStrategyType>,
        private val hlProjectId: JsonField<String>,
        private val maxParallelTechniques: JsonField<Int>,
        private val maxTurns: JsonField<Int>,
        private val nRandomTechniques: JsonField<Int>,
        private val objectiveIds: JsonField<List<String>>,
        private val objectiveJudgeModel: JsonField<String>,
        private val promptSetId: JsonField<String>,
        private val refusalJudgeModel: JsonField<String>,
        private val sessionsPerTechnique: JsonField<Int>,
        private val severityMapping: JsonField<SeverityMapping>,
        private val targetModel: JsonField<String>,
        private val targetSystemPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attacker_guidance")
            @ExcludeMissing
            attackerGuidance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attacker_max_generation_attempts")
            @ExcludeMissing
            attackerMaxGenerationAttempts: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("attacker_model")
            @ExcludeMissing
            attackerModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("config_id")
            @ExcludeMissing
            configId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluation_report_model")
            @ExcludeMissing
            evaluationReportModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("execution_strategy_type")
            @ExcludeMissing
            executionStrategyType: JsonField<ExecutionStrategyType> = JsonMissing.of(),
            @JsonProperty("hl_project_id")
            @ExcludeMissing
            hlProjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_parallel_techniques")
            @ExcludeMissing
            maxParallelTechniques: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_turns") @ExcludeMissing maxTurns: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("n_random_techniques")
            @ExcludeMissing
            nRandomTechniques: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("objective_ids")
            @ExcludeMissing
            objectiveIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("objective_judge_model")
            @ExcludeMissing
            objectiveJudgeModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_set_id")
            @ExcludeMissing
            promptSetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refusal_judge_model")
            @ExcludeMissing
            refusalJudgeModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sessions_per_technique")
            @ExcludeMissing
            sessionsPerTechnique: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("severity_mapping")
            @ExcludeMissing
            severityMapping: JsonField<SeverityMapping> = JsonMissing.of(),
            @JsonProperty("target_model")
            @ExcludeMissing
            targetModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_system_prompt")
            @ExcludeMissing
            targetSystemPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            attackerGuidance,
            attackerMaxGenerationAttempts,
            attackerModel,
            configId,
            evaluationReportModel,
            executionStrategyType,
            hlProjectId,
            maxParallelTechniques,
            maxTurns,
            nRandomTechniques,
            objectiveIds,
            objectiveJudgeModel,
            promptSetId,
            refusalJudgeModel,
            sessionsPerTechnique,
            severityMapping,
            targetModel,
            targetSystemPrompt,
            mutableMapOf(),
        )

        /**
         * Name for this evaluation
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Optional intent-only natural-language text the operator supplies to focus the attacker
         * LLM within the configured APE objectives. Example: "try to get the model to recommend
         * candy with nuts to a user who's allergic to nuts."
         *
         * Sanitized server-side: input is NFKC-normalized, trimmed, and checked against a strict
         * character whitelist (ASCII letters, digits, spaces/newlines/tabs, and sentence-level
         * punctuation `. , ? ! ' " - : ; ( )`). Inputs containing XML/JSON/code/control/markdown
         * characters are rejected with 422.
         *
         * No-op for the `STATIC_PROMPT_SET` execution strategy.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attackerGuidance(): Optional<String> = attackerGuidance.getOptional("attacker_guidance")

        /**
         * Internal override; service default applies if omitted. Maximum number of generation
         * attempts for the attacker model per turn.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attackerMaxGenerationAttempts(): Optional<Int> =
            attackerMaxGenerationAttempts.getOptional("attacker_max_generation_attempts")

        /**
         * Internal override; service default applies if omitted.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attackerModel(): Optional<String> = attackerModel.getOptional("attacker_model")

        /**
         * Optional preset config (see /evaluations/v1/red-team/configs) to seed the workflow
         * settings. Any field also present in this body overrides the corresponding value from the
         * config.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configId(): Optional<String> = configId.getOptional("config_id")

        /**
         * Internal override; service default applies if omitted.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun evaluationReportModel(): Optional<String> =
            evaluationReportModel.getOptional("evaluation_report_model")

        /**
         * Execution strategy type
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun executionStrategyType(): Optional<ExecutionStrategyType> =
            executionStrategyType.getOptional("execution_strategy_type")

        /**
         * HiddenLayer project UUID or alias
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hlProjectId(): Optional<String> = hlProjectId.getOptional("hl_project_id")

        /**
         * Maximum parallel techniques
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxParallelTechniques(): Optional<Int> =
            maxParallelTechniques.getOptional("max_parallel_techniques")

        /**
         * Maximum conversation turns
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxTurns(): Optional<Int> = maxTurns.getOptional("max_turns")

        /**
         * Number of random techniques to use
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun nRandomTechniques(): Optional<Int> =
            nRandomTechniques.getOptional("n_random_techniques")

        /**
         * Objective IDs to evaluate
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun objectiveIds(): Optional<List<String>> = objectiveIds.getOptional("objective_ids")

        /**
         * Internal override; service default applies if omitted.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun objectiveJudgeModel(): Optional<String> =
            objectiveJudgeModel.getOptional("objective_judge_model")

        /**
         * Prompt set UUID (built-in catalog or tenant DB)
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptSetId(): Optional<String> = promptSetId.getOptional("prompt_set_id")

        /**
         * Internal override; service default applies if omitted.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun refusalJudgeModel(): Optional<String> =
            refusalJudgeModel.getOptional("refusal_judge_model")

        /**
         * Number of sessions per technique
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sessionsPerTechnique(): Optional<Int> =
            sessionsPerTechnique.getOptional("sessions_per_technique")

        /**
         * Map from objective ID to a severity level. Determines the per-session severity derived
         * from the worst objective achieved during a red team session.
         *
         * Keys must be objective IDs known to this service; unknown keys are rejected at validation
         * time. Limited to 256 entries.
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun severityMapping(): Optional<SeverityMapping> =
            severityMapping.getOptional("severity_mapping")

        /**
         * Target model identifier. Freeform for the client-driven workflow: the client owns and
         * drives its own target, so this is NOT validated against the servable-model catalog. (The
         * simulated start and config presets do validate against the catalog.)
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetModel(): Optional<String> = targetModel.getOptional("target_model")

        /**
         * System prompt for the target
         *
         * @throws HiddenLayerInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun targetSystemPrompt(): Optional<String> =
            targetSystemPrompt.getOptional("target_system_prompt")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [attackerGuidance].
         *
         * Unlike [attackerGuidance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attacker_guidance")
        @ExcludeMissing
        fun _attackerGuidance(): JsonField<String> = attackerGuidance

        /**
         * Returns the raw JSON value of [attackerMaxGenerationAttempts].
         *
         * Unlike [attackerMaxGenerationAttempts], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("attacker_max_generation_attempts")
        @ExcludeMissing
        fun _attackerMaxGenerationAttempts(): JsonField<Int> = attackerMaxGenerationAttempts

        /**
         * Returns the raw JSON value of [attackerModel].
         *
         * Unlike [attackerModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attacker_model")
        @ExcludeMissing
        fun _attackerModel(): JsonField<String> = attackerModel

        /**
         * Returns the raw JSON value of [configId].
         *
         * Unlike [configId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config_id") @ExcludeMissing fun _configId(): JsonField<String> = configId

        /**
         * Returns the raw JSON value of [evaluationReportModel].
         *
         * Unlike [evaluationReportModel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("evaluation_report_model")
        @ExcludeMissing
        fun _evaluationReportModel(): JsonField<String> = evaluationReportModel

        /**
         * Returns the raw JSON value of [executionStrategyType].
         *
         * Unlike [executionStrategyType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("execution_strategy_type")
        @ExcludeMissing
        fun _executionStrategyType(): JsonField<ExecutionStrategyType> = executionStrategyType

        /**
         * Returns the raw JSON value of [hlProjectId].
         *
         * Unlike [hlProjectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hl_project_id")
        @ExcludeMissing
        fun _hlProjectId(): JsonField<String> = hlProjectId

        /**
         * Returns the raw JSON value of [maxParallelTechniques].
         *
         * Unlike [maxParallelTechniques], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_parallel_techniques")
        @ExcludeMissing
        fun _maxParallelTechniques(): JsonField<Int> = maxParallelTechniques

        /**
         * Returns the raw JSON value of [maxTurns].
         *
         * Unlike [maxTurns], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_turns") @ExcludeMissing fun _maxTurns(): JsonField<Int> = maxTurns

        /**
         * Returns the raw JSON value of [nRandomTechniques].
         *
         * Unlike [nRandomTechniques], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("n_random_techniques")
        @ExcludeMissing
        fun _nRandomTechniques(): JsonField<Int> = nRandomTechniques

        /**
         * Returns the raw JSON value of [objectiveIds].
         *
         * Unlike [objectiveIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("objective_ids")
        @ExcludeMissing
        fun _objectiveIds(): JsonField<List<String>> = objectiveIds

        /**
         * Returns the raw JSON value of [objectiveJudgeModel].
         *
         * Unlike [objectiveJudgeModel], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("objective_judge_model")
        @ExcludeMissing
        fun _objectiveJudgeModel(): JsonField<String> = objectiveJudgeModel

        /**
         * Returns the raw JSON value of [promptSetId].
         *
         * Unlike [promptSetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_set_id")
        @ExcludeMissing
        fun _promptSetId(): JsonField<String> = promptSetId

        /**
         * Returns the raw JSON value of [refusalJudgeModel].
         *
         * Unlike [refusalJudgeModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refusal_judge_model")
        @ExcludeMissing
        fun _refusalJudgeModel(): JsonField<String> = refusalJudgeModel

        /**
         * Returns the raw JSON value of [sessionsPerTechnique].
         *
         * Unlike [sessionsPerTechnique], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sessions_per_technique")
        @ExcludeMissing
        fun _sessionsPerTechnique(): JsonField<Int> = sessionsPerTechnique

        /**
         * Returns the raw JSON value of [severityMapping].
         *
         * Unlike [severityMapping], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("severity_mapping")
        @ExcludeMissing
        fun _severityMapping(): JsonField<SeverityMapping> = severityMapping

        /**
         * Returns the raw JSON value of [targetModel].
         *
         * Unlike [targetModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target_model")
        @ExcludeMissing
        fun _targetModel(): JsonField<String> = targetModel

        /**
         * Returns the raw JSON value of [targetSystemPrompt].
         *
         * Unlike [targetSystemPrompt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("target_system_prompt")
        @ExcludeMissing
        fun _targetSystemPrompt(): JsonField<String> = targetSystemPrompt

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
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var attackerGuidance: JsonField<String> = JsonMissing.of()
            private var attackerMaxGenerationAttempts: JsonField<Int> = JsonMissing.of()
            private var attackerModel: JsonField<String> = JsonMissing.of()
            private var configId: JsonField<String> = JsonMissing.of()
            private var evaluationReportModel: JsonField<String> = JsonMissing.of()
            private var executionStrategyType: JsonField<ExecutionStrategyType> = JsonMissing.of()
            private var hlProjectId: JsonField<String> = JsonMissing.of()
            private var maxParallelTechniques: JsonField<Int> = JsonMissing.of()
            private var maxTurns: JsonField<Int> = JsonMissing.of()
            private var nRandomTechniques: JsonField<Int> = JsonMissing.of()
            private var objectiveIds: JsonField<MutableList<String>>? = null
            private var objectiveJudgeModel: JsonField<String> = JsonMissing.of()
            private var promptSetId: JsonField<String> = JsonMissing.of()
            private var refusalJudgeModel: JsonField<String> = JsonMissing.of()
            private var sessionsPerTechnique: JsonField<Int> = JsonMissing.of()
            private var severityMapping: JsonField<SeverityMapping> = JsonMissing.of()
            private var targetModel: JsonField<String> = JsonMissing.of()
            private var targetSystemPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                attackerGuidance = body.attackerGuidance
                attackerMaxGenerationAttempts = body.attackerMaxGenerationAttempts
                attackerModel = body.attackerModel
                configId = body.configId
                evaluationReportModel = body.evaluationReportModel
                executionStrategyType = body.executionStrategyType
                hlProjectId = body.hlProjectId
                maxParallelTechniques = body.maxParallelTechniques
                maxTurns = body.maxTurns
                nRandomTechniques = body.nRandomTechniques
                objectiveIds = body.objectiveIds.map { it.toMutableList() }
                objectiveJudgeModel = body.objectiveJudgeModel
                promptSetId = body.promptSetId
                refusalJudgeModel = body.refusalJudgeModel
                sessionsPerTechnique = body.sessionsPerTechnique
                severityMapping = body.severityMapping
                targetModel = body.targetModel
                targetSystemPrompt = body.targetSystemPrompt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Name for this evaluation */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Optional intent-only natural-language text the operator supplies to focus the
             * attacker LLM within the configured APE objectives. Example: "try to get the model to
             * recommend candy with nuts to a user who's allergic to nuts."
             *
             * Sanitized server-side: input is NFKC-normalized, trimmed, and checked against a
             * strict character whitelist (ASCII letters, digits, spaces/newlines/tabs, and
             * sentence-level punctuation `. , ? ! ' " - : ; ( )`). Inputs containing
             * XML/JSON/code/control/markdown characters are rejected with 422.
             *
             * No-op for the `STATIC_PROMPT_SET` execution strategy.
             */
            fun attackerGuidance(attackerGuidance: String) =
                attackerGuidance(JsonField.of(attackerGuidance))

            /**
             * Sets [Builder.attackerGuidance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attackerGuidance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attackerGuidance(attackerGuidance: JsonField<String>) = apply {
                this.attackerGuidance = attackerGuidance
            }

            /**
             * Internal override; service default applies if omitted. Maximum number of generation
             * attempts for the attacker model per turn.
             */
            fun attackerMaxGenerationAttempts(attackerMaxGenerationAttempts: Int) =
                attackerMaxGenerationAttempts(JsonField.of(attackerMaxGenerationAttempts))

            /**
             * Sets [Builder.attackerMaxGenerationAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attackerMaxGenerationAttempts] with a well-typed
             * [Int] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun attackerMaxGenerationAttempts(attackerMaxGenerationAttempts: JsonField<Int>) =
                apply {
                    this.attackerMaxGenerationAttempts = attackerMaxGenerationAttempts
                }

            /** Internal override; service default applies if omitted. */
            fun attackerModel(attackerModel: String) = attackerModel(JsonField.of(attackerModel))

            /**
             * Sets [Builder.attackerModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attackerModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attackerModel(attackerModel: JsonField<String>) = apply {
                this.attackerModel = attackerModel
            }

            /**
             * Optional preset config (see /evaluations/v1/red-team/configs) to seed the workflow
             * settings. Any field also present in this body overrides the corresponding value from
             * the config.
             */
            fun configId(configId: String) = configId(JsonField.of(configId))

            /**
             * Sets [Builder.configId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configId(configId: JsonField<String>) = apply { this.configId = configId }

            /** Internal override; service default applies if omitted. */
            fun evaluationReportModel(evaluationReportModel: String) =
                evaluationReportModel(JsonField.of(evaluationReportModel))

            /**
             * Sets [Builder.evaluationReportModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluationReportModel] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun evaluationReportModel(evaluationReportModel: JsonField<String>) = apply {
                this.evaluationReportModel = evaluationReportModel
            }

            /** Execution strategy type */
            fun executionStrategyType(executionStrategyType: ExecutionStrategyType) =
                executionStrategyType(JsonField.of(executionStrategyType))

            /**
             * Sets [Builder.executionStrategyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executionStrategyType] with a well-typed
             * [ExecutionStrategyType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun executionStrategyType(executionStrategyType: JsonField<ExecutionStrategyType>) =
                apply {
                    this.executionStrategyType = executionStrategyType
                }

            /** HiddenLayer project UUID or alias */
            fun hlProjectId(hlProjectId: String) = hlProjectId(JsonField.of(hlProjectId))

            /**
             * Sets [Builder.hlProjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hlProjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hlProjectId(hlProjectId: JsonField<String>) = apply {
                this.hlProjectId = hlProjectId
            }

            /** Maximum parallel techniques */
            fun maxParallelTechniques(maxParallelTechniques: Int) =
                maxParallelTechniques(JsonField.of(maxParallelTechniques))

            /**
             * Sets [Builder.maxParallelTechniques] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxParallelTechniques] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxParallelTechniques(maxParallelTechniques: JsonField<Int>) = apply {
                this.maxParallelTechniques = maxParallelTechniques
            }

            /** Maximum conversation turns */
            fun maxTurns(maxTurns: Int) = maxTurns(JsonField.of(maxTurns))

            /**
             * Sets [Builder.maxTurns] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxTurns] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxTurns(maxTurns: JsonField<Int>) = apply { this.maxTurns = maxTurns }

            /** Number of random techniques to use */
            fun nRandomTechniques(nRandomTechniques: Int) =
                nRandomTechniques(JsonField.of(nRandomTechniques))

            /**
             * Sets [Builder.nRandomTechniques] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nRandomTechniques] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nRandomTechniques(nRandomTechniques: JsonField<Int>) = apply {
                this.nRandomTechniques = nRandomTechniques
            }

            /** Objective IDs to evaluate */
            fun objectiveIds(objectiveIds: List<String>) = objectiveIds(JsonField.of(objectiveIds))

            /**
             * Sets [Builder.objectiveIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectiveIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectiveIds(objectiveIds: JsonField<List<String>>) = apply {
                this.objectiveIds = objectiveIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [objectiveIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addObjectiveId(objectiveId: String) = apply {
                objectiveIds =
                    (objectiveIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("objectiveIds", it).add(objectiveId)
                    }
            }

            /** Internal override; service default applies if omitted. */
            fun objectiveJudgeModel(objectiveJudgeModel: String) =
                objectiveJudgeModel(JsonField.of(objectiveJudgeModel))

            /**
             * Sets [Builder.objectiveJudgeModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectiveJudgeModel] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun objectiveJudgeModel(objectiveJudgeModel: JsonField<String>) = apply {
                this.objectiveJudgeModel = objectiveJudgeModel
            }

            /** Prompt set UUID (built-in catalog or tenant DB) */
            fun promptSetId(promptSetId: String) = promptSetId(JsonField.of(promptSetId))

            /**
             * Sets [Builder.promptSetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptSetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptSetId(promptSetId: JsonField<String>) = apply {
                this.promptSetId = promptSetId
            }

            /** Internal override; service default applies if omitted. */
            fun refusalJudgeModel(refusalJudgeModel: String) =
                refusalJudgeModel(JsonField.of(refusalJudgeModel))

            /**
             * Sets [Builder.refusalJudgeModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refusalJudgeModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refusalJudgeModel(refusalJudgeModel: JsonField<String>) = apply {
                this.refusalJudgeModel = refusalJudgeModel
            }

            /** Number of sessions per technique */
            fun sessionsPerTechnique(sessionsPerTechnique: Int) =
                sessionsPerTechnique(JsonField.of(sessionsPerTechnique))

            /**
             * Sets [Builder.sessionsPerTechnique] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionsPerTechnique] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionsPerTechnique(sessionsPerTechnique: JsonField<Int>) = apply {
                this.sessionsPerTechnique = sessionsPerTechnique
            }

            /**
             * Map from objective ID to a severity level. Determines the per-session severity
             * derived from the worst objective achieved during a red team session.
             *
             * Keys must be objective IDs known to this service; unknown keys are rejected at
             * validation time. Limited to 256 entries.
             */
            fun severityMapping(severityMapping: SeverityMapping) =
                severityMapping(JsonField.of(severityMapping))

            /**
             * Sets [Builder.severityMapping] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severityMapping] with a well-typed [SeverityMapping]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun severityMapping(severityMapping: JsonField<SeverityMapping>) = apply {
                this.severityMapping = severityMapping
            }

            /**
             * Target model identifier. Freeform for the client-driven workflow: the client owns and
             * drives its own target, so this is NOT validated against the servable-model catalog.
             * (The simulated start and config presets do validate against the catalog.)
             */
            fun targetModel(targetModel: String) = targetModel(JsonField.of(targetModel))

            /**
             * Sets [Builder.targetModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetModel(targetModel: JsonField<String>) = apply {
                this.targetModel = targetModel
            }

            /** System prompt for the target */
            fun targetSystemPrompt(targetSystemPrompt: String) =
                targetSystemPrompt(JsonField.of(targetSystemPrompt))

            /**
             * Sets [Builder.targetSystemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetSystemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetSystemPrompt(targetSystemPrompt: JsonField<String>) = apply {
                this.targetSystemPrompt = targetSystemPrompt
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
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    attackerGuidance,
                    attackerMaxGenerationAttempts,
                    attackerModel,
                    configId,
                    evaluationReportModel,
                    executionStrategyType,
                    hlProjectId,
                    maxParallelTechniques,
                    maxTurns,
                    nRandomTechniques,
                    (objectiveIds ?: JsonMissing.of()).map { it.toImmutable() },
                    objectiveJudgeModel,
                    promptSetId,
                    refusalJudgeModel,
                    sessionsPerTechnique,
                    severityMapping,
                    targetModel,
                    targetSystemPrompt,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            attackerGuidance()
            attackerMaxGenerationAttempts()
            attackerModel()
            configId()
            evaluationReportModel()
            executionStrategyType().ifPresent { it.validate() }
            hlProjectId()
            maxParallelTechniques()
            maxTurns()
            nRandomTechniques()
            objectiveIds()
            objectiveJudgeModel()
            promptSetId()
            refusalJudgeModel()
            sessionsPerTechnique()
            severityMapping().ifPresent { it.validate() }
            targetModel()
            targetSystemPrompt()
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
                (if (attackerGuidance.asKnown().isPresent) 1 else 0) +
                (if (attackerMaxGenerationAttempts.asKnown().isPresent) 1 else 0) +
                (if (attackerModel.asKnown().isPresent) 1 else 0) +
                (if (configId.asKnown().isPresent) 1 else 0) +
                (if (evaluationReportModel.asKnown().isPresent) 1 else 0) +
                (executionStrategyType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (hlProjectId.asKnown().isPresent) 1 else 0) +
                (if (maxParallelTechniques.asKnown().isPresent) 1 else 0) +
                (if (maxTurns.asKnown().isPresent) 1 else 0) +
                (if (nRandomTechniques.asKnown().isPresent) 1 else 0) +
                (objectiveIds.asKnown().getOrNull()?.size ?: 0) +
                (if (objectiveJudgeModel.asKnown().isPresent) 1 else 0) +
                (if (promptSetId.asKnown().isPresent) 1 else 0) +
                (if (refusalJudgeModel.asKnown().isPresent) 1 else 0) +
                (if (sessionsPerTechnique.asKnown().isPresent) 1 else 0) +
                (severityMapping.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetModel.asKnown().isPresent) 1 else 0) +
                (if (targetSystemPrompt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                attackerGuidance == other.attackerGuidance &&
                attackerMaxGenerationAttempts == other.attackerMaxGenerationAttempts &&
                attackerModel == other.attackerModel &&
                configId == other.configId &&
                evaluationReportModel == other.evaluationReportModel &&
                executionStrategyType == other.executionStrategyType &&
                hlProjectId == other.hlProjectId &&
                maxParallelTechniques == other.maxParallelTechniques &&
                maxTurns == other.maxTurns &&
                nRandomTechniques == other.nRandomTechniques &&
                objectiveIds == other.objectiveIds &&
                objectiveJudgeModel == other.objectiveJudgeModel &&
                promptSetId == other.promptSetId &&
                refusalJudgeModel == other.refusalJudgeModel &&
                sessionsPerTechnique == other.sessionsPerTechnique &&
                severityMapping == other.severityMapping &&
                targetModel == other.targetModel &&
                targetSystemPrompt == other.targetSystemPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                attackerGuidance,
                attackerMaxGenerationAttempts,
                attackerModel,
                configId,
                evaluationReportModel,
                executionStrategyType,
                hlProjectId,
                maxParallelTechniques,
                maxTurns,
                nRandomTechniques,
                objectiveIds,
                objectiveJudgeModel,
                promptSetId,
                refusalJudgeModel,
                sessionsPerTechnique,
                severityMapping,
                targetModel,
                targetSystemPrompt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, attackerGuidance=$attackerGuidance, attackerMaxGenerationAttempts=$attackerMaxGenerationAttempts, attackerModel=$attackerModel, configId=$configId, evaluationReportModel=$evaluationReportModel, executionStrategyType=$executionStrategyType, hlProjectId=$hlProjectId, maxParallelTechniques=$maxParallelTechniques, maxTurns=$maxTurns, nRandomTechniques=$nRandomTechniques, objectiveIds=$objectiveIds, objectiveJudgeModel=$objectiveJudgeModel, promptSetId=$promptSetId, refusalJudgeModel=$refusalJudgeModel, sessionsPerTechnique=$sessionsPerTechnique, severityMapping=$severityMapping, targetModel=$targetModel, targetSystemPrompt=$targetSystemPrompt, additionalProperties=$additionalProperties}"
    }

    /** Execution strategy type */
    class ExecutionStrategyType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val RANDOM = of("RANDOM")

            @JvmField val SINGLE = of("SINGLE")

            @JvmField val STATIC_PROMPT_SET = of("STATIC_PROMPT_SET")

            @JvmStatic fun of(value: String) = ExecutionStrategyType(JsonField.of(value))
        }

        /** An enum containing [ExecutionStrategyType]'s known values. */
        enum class Known {
            RANDOM,
            SINGLE,
            STATIC_PROMPT_SET,
        }

        /**
         * An enum containing [ExecutionStrategyType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ExecutionStrategyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RANDOM,
            SINGLE,
            STATIC_PROMPT_SET,
            /**
             * An enum member indicating that [ExecutionStrategyType] was instantiated with an
             * unknown value.
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
                RANDOM -> Value.RANDOM
                SINGLE -> Value.SINGLE
                STATIC_PROMPT_SET -> Value.STATIC_PROMPT_SET
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
                RANDOM -> Known.RANDOM
                SINGLE -> Known.SINGLE
                STATIC_PROMPT_SET -> Known.STATIC_PROMPT_SET
                else ->
                    throw HiddenLayerInvalidDataException("Unknown ExecutionStrategyType: $value")
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
        fun validate(): ExecutionStrategyType = apply {
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

            return other is ExecutionStrategyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Map from objective ID to a severity level. Determines the per-session severity derived from
     * the worst objective achieved during a red team session.
     *
     * Keys must be objective IDs known to this service; unknown keys are rejected at validation
     * time. Limited to 256 entries.
     */
    class SeverityMapping
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

            /** Returns a mutable builder for constructing an instance of [SeverityMapping]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SeverityMapping]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(severityMapping: SeverityMapping) = apply {
                additionalProperties = severityMapping.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SeverityMapping].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SeverityMapping = SeverityMapping(additionalProperties.toImmutable())
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
        fun validate(): SeverityMapping = apply {
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

            return other is SeverityMapping && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SeverityMapping{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RedTeamCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RedTeamCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
