// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamRetrieveStatusResponseTest {

    @Test
    fun create() {
        val redTeamRetrieveStatusResponse =
            RedTeamRetrieveStatusResponse.builder()
                .name("name")
                .runId("run_id")
                .status("status")
                .workflowId("workflow_id")
                .activeSessions(0)
                .completedSessions(0)
                .elapsedSeconds(0.0)
                .error("error")
                .etaSeconds(0.0)
                .failedSessions(0)
                .message("message")
                .phase("phase")
                .progressCompleted(0)
                .progressTotal(0)
                .readyPromptsInQueue(0)
                .tenantId("tenant_id")
                .totalSessions(0)
                .build()

        assertThat(redTeamRetrieveStatusResponse.name()).isEqualTo("name")
        assertThat(redTeamRetrieveStatusResponse.runId()).isEqualTo("run_id")
        assertThat(redTeamRetrieveStatusResponse.status()).isEqualTo("status")
        assertThat(redTeamRetrieveStatusResponse.workflowId()).isEqualTo("workflow_id")
        assertThat(redTeamRetrieveStatusResponse.activeSessions()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.completedSessions()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.elapsedSeconds()).contains(0.0)
        assertThat(redTeamRetrieveStatusResponse.error()).contains("error")
        assertThat(redTeamRetrieveStatusResponse.etaSeconds()).contains(0.0)
        assertThat(redTeamRetrieveStatusResponse.failedSessions()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.message()).contains("message")
        assertThat(redTeamRetrieveStatusResponse.phase()).contains("phase")
        assertThat(redTeamRetrieveStatusResponse.progressCompleted()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.progressTotal()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.readyPromptsInQueue()).contains(0)
        assertThat(redTeamRetrieveStatusResponse.tenantId()).contains("tenant_id")
        assertThat(redTeamRetrieveStatusResponse.totalSessions()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redTeamRetrieveStatusResponse =
            RedTeamRetrieveStatusResponse.builder()
                .name("name")
                .runId("run_id")
                .status("status")
                .workflowId("workflow_id")
                .activeSessions(0)
                .completedSessions(0)
                .elapsedSeconds(0.0)
                .error("error")
                .etaSeconds(0.0)
                .failedSessions(0)
                .message("message")
                .phase("phase")
                .progressCompleted(0)
                .progressTotal(0)
                .readyPromptsInQueue(0)
                .tenantId("tenant_id")
                .totalSessions(0)
                .build()

        val roundtrippedRedTeamRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redTeamRetrieveStatusResponse),
                jacksonTypeRef<RedTeamRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedRedTeamRetrieveStatusResponse)
            .isEqualTo(redTeamRetrieveStatusResponse)
    }
}
