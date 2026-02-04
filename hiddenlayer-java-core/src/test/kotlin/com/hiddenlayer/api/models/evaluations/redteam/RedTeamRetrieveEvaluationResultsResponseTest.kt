// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamRetrieveEvaluationResultsResponseTest {

    @Test
    fun create() {
        val redTeamRetrieveEvaluationResultsResponse =
            RedTeamRetrieveEvaluationResultsResponse.builder()
                .result(
                    RedTeamRetrieveEvaluationResultsResponse.Result.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .runId("run_id")
                .workflowId("workflow_id")
                .build()

        assertThat(redTeamRetrieveEvaluationResultsResponse.result())
            .isEqualTo(
                RedTeamRetrieveEvaluationResultsResponse.Result.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(redTeamRetrieveEvaluationResultsResponse.runId()).isEqualTo("run_id")
        assertThat(redTeamRetrieveEvaluationResultsResponse.workflowId()).isEqualTo("workflow_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redTeamRetrieveEvaluationResultsResponse =
            RedTeamRetrieveEvaluationResultsResponse.builder()
                .result(
                    RedTeamRetrieveEvaluationResultsResponse.Result.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .runId("run_id")
                .workflowId("workflow_id")
                .build()

        val roundtrippedRedTeamRetrieveEvaluationResultsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redTeamRetrieveEvaluationResultsResponse),
                jacksonTypeRef<RedTeamRetrieveEvaluationResultsResponse>(),
            )

        assertThat(roundtrippedRedTeamRetrieveEvaluationResultsResponse)
            .isEqualTo(redTeamRetrieveEvaluationResultsResponse)
    }
}
