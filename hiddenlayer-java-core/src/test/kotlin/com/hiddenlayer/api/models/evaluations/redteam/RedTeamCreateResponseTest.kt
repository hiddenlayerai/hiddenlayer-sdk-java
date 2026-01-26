// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamCreateResponseTest {

    @Test
    fun create() {
        val redTeamCreateResponse =
            RedTeamCreateResponse.builder().runId("run_id").workflowId("workflow_id").build()

        assertThat(redTeamCreateResponse.runId()).isEqualTo("run_id")
        assertThat(redTeamCreateResponse.workflowId()).isEqualTo("workflow_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redTeamCreateResponse =
            RedTeamCreateResponse.builder().runId("run_id").workflowId("workflow_id").build()

        val roundtrippedRedTeamCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redTeamCreateResponse),
                jacksonTypeRef<RedTeamCreateResponse>(),
            )

        assertThat(roundtrippedRedTeamCreateResponse).isEqualTo(redTeamCreateResponse)
    }
}
