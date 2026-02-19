// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.evaluations

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamCreateParams
import com.hiddenlayer.api.models.evaluations.redteam.RedTeamSubmitTargetResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RedTeamServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val redTeamFuture =
            redTeamServiceAsync.create(
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

        val redTeam = redTeamFuture.get()
        redTeam.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveEvaluationResults() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val responseFuture = redTeamServiceAsync.retrieveEvaluationResults("workflow_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveNextAction() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val responseFuture = redTeamServiceAsync.retrieveNextAction("workflow_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveStatus() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val responseFuture = redTeamServiceAsync.retrieveStatus("workflow_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun submitTargetResponse() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val responseFuture =
            redTeamServiceAsync.submitTargetResponse(
                RedTeamSubmitTargetResponseParams.builder()
                    .workflowId("workflow_id")
                    .sessionId("session_id")
                    .targetResponse("target_response")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun terminate() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val redTeamServiceAsync = client.evaluations().redTeam()

        val future = redTeamServiceAsync.terminate("workflow_id")

        val response = future.get()
    }
}
