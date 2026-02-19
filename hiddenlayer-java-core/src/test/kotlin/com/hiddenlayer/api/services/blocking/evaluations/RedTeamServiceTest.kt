// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.evaluations

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedTeamServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        val redTeam =
            redTeamService.create(
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
            )

        redTeam.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveEvaluationResults() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        val response = redTeamService.retrieveEvaluationResults("workflow_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveNextAction() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        val response = redTeamService.retrieveNextAction("workflow_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        val response = redTeamService.retrieveStatus("workflow_id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitTargetResponse() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        val response =
            redTeamService.submitTargetResponse(
                RedTeamSubmitTargetResponseParams.builder()
                    .workflowId("workflow_id")
                    .sessionId("session_id")
                    .targetResponse("target_response")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun terminate() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val redTeamService = client.evaluations().redTeam()

        redTeamService.terminate("workflow_id")
    }
}
