// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamCreateParamsTest {

    @Test
    fun create() {
        RedTeamCreateParams.builder()
            .name("name")
            .targetModel("target_model")
            .attackerMaxGenerationAttempts(0)
            .attackerModel("attacker_model")
            .evaluationReportModel("evaluation_report_model")
            .executionStrategyType("execution_strategy_type")
            .hlProjectId("hl_project_id")
            .maxParallelTechniques(0)
            .maxTurns(0)
            .nRandomTechniques(0)
            .addObjectiveId("string")
            .objectiveJudgeModel("objective_judge_model")
            .promptSetId("prompt_set_id")
            .refusalJudgeModel("refusal_judge_model")
            .sessionsPerTechnique(0)
            .targetSystemPrompt("target_system_prompt")
            .build()
    }

    @Test
    fun body() {
        val params =
            RedTeamCreateParams.builder()
                .name("name")
                .targetModel("target_model")
                .attackerMaxGenerationAttempts(0)
                .attackerModel("attacker_model")
                .evaluationReportModel("evaluation_report_model")
                .executionStrategyType("execution_strategy_type")
                .hlProjectId("hl_project_id")
                .maxParallelTechniques(0)
                .maxTurns(0)
                .nRandomTechniques(0)
                .addObjectiveId("string")
                .objectiveJudgeModel("objective_judge_model")
                .promptSetId("prompt_set_id")
                .refusalJudgeModel("refusal_judge_model")
                .sessionsPerTechnique(0)
                .targetSystemPrompt("target_system_prompt")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.targetModel()).isEqualTo("target_model")
        assertThat(body.attackerMaxGenerationAttempts()).contains(0)
        assertThat(body.attackerModel()).contains("attacker_model")
        assertThat(body.evaluationReportModel()).contains("evaluation_report_model")
        assertThat(body.executionStrategyType()).contains("execution_strategy_type")
        assertThat(body.hlProjectId()).contains("hl_project_id")
        assertThat(body.maxParallelTechniques()).contains(0)
        assertThat(body.maxTurns()).contains(0)
        assertThat(body.nRandomTechniques()).contains(0)
        assertThat(body.objectiveIds().getOrNull()).containsExactly("string")
        assertThat(body.objectiveJudgeModel()).contains("objective_judge_model")
        assertThat(body.promptSetId()).contains("prompt_set_id")
        assertThat(body.refusalJudgeModel()).contains("refusal_judge_model")
        assertThat(body.sessionsPerTechnique()).contains(0)
        assertThat(body.targetSystemPrompt()).contains("target_system_prompt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RedTeamCreateParams.builder().name("name").targetModel("target_model").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.targetModel()).isEqualTo("target_model")
    }
}
