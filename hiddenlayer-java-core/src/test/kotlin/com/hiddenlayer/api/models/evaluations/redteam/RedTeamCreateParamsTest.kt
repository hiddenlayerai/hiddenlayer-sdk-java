// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.hiddenlayer.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamCreateParamsTest {

    @Test
    fun create() {
        RedTeamCreateParams.builder()
            .name("name")
            .attackerGuidance("attacker_guidance")
            .attackerMaxGenerationAttempts(1)
            .attackerModel("attacker_model")
            .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evaluationReportModel("evaluation_report_model")
            .executionStrategyType(RedTeamCreateParams.ExecutionStrategyType.RANDOM)
            .hlProjectId("hl_project_id")
            .maxParallelTechniques(0)
            .maxTurns(0)
            .nRandomTechniques(0)
            .addObjectiveId("string")
            .objectiveJudgeModel("objective_judge_model")
            .promptSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .refusalJudgeModel("refusal_judge_model")
            .sessionsPerTechnique(1)
            .severityMapping(
                RedTeamCreateParams.SeverityMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("CRITICAL"))
                    .build()
            )
            .targetModel("target_model")
            .targetSystemPrompt("target_system_prompt")
            .build()
    }

    @Test
    fun body() {
        val params =
            RedTeamCreateParams.builder()
                .name("name")
                .attackerGuidance("attacker_guidance")
                .attackerMaxGenerationAttempts(1)
                .attackerModel("attacker_model")
                .configId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluationReportModel("evaluation_report_model")
                .executionStrategyType(RedTeamCreateParams.ExecutionStrategyType.RANDOM)
                .hlProjectId("hl_project_id")
                .maxParallelTechniques(0)
                .maxTurns(0)
                .nRandomTechniques(0)
                .addObjectiveId("string")
                .objectiveJudgeModel("objective_judge_model")
                .promptSetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .refusalJudgeModel("refusal_judge_model")
                .sessionsPerTechnique(1)
                .severityMapping(
                    RedTeamCreateParams.SeverityMapping.builder()
                        .putAdditionalProperty("foo", JsonValue.from("CRITICAL"))
                        .build()
                )
                .targetModel("target_model")
                .targetSystemPrompt("target_system_prompt")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.attackerGuidance()).contains("attacker_guidance")
        assertThat(body.attackerMaxGenerationAttempts()).contains(1)
        assertThat(body.attackerModel()).contains("attacker_model")
        assertThat(body.configId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.evaluationReportModel()).contains("evaluation_report_model")
        assertThat(body.executionStrategyType())
            .contains(RedTeamCreateParams.ExecutionStrategyType.RANDOM)
        assertThat(body.hlProjectId()).contains("hl_project_id")
        assertThat(body.maxParallelTechniques()).contains(0)
        assertThat(body.maxTurns()).contains(0)
        assertThat(body.nRandomTechniques()).contains(0)
        assertThat(body.objectiveIds().getOrNull()).containsExactly("string")
        assertThat(body.objectiveJudgeModel()).contains("objective_judge_model")
        assertThat(body.promptSetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.refusalJudgeModel()).contains("refusal_judge_model")
        assertThat(body.sessionsPerTechnique()).contains(1)
        assertThat(body.severityMapping())
            .contains(
                RedTeamCreateParams.SeverityMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("CRITICAL"))
                    .build()
            )
        assertThat(body.targetModel()).contains("target_model")
        assertThat(body.targetSystemPrompt()).contains("target_system_prompt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RedTeamCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
