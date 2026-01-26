// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamSubmitTargetResponseParamsTest {

    @Test
    fun create() {
        RedTeamSubmitTargetResponseParams.builder()
            .workflowId("workflow_id")
            .sessionId("session_id")
            .targetResponse("target_response")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RedTeamSubmitTargetResponseParams.builder()
                .workflowId("workflow_id")
                .sessionId("session_id")
                .targetResponse("target_response")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("workflow_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RedTeamSubmitTargetResponseParams.builder()
                .workflowId("workflow_id")
                .sessionId("session_id")
                .targetResponse("target_response")
                .build()

        val body = params._body()

        assertThat(body.sessionId()).isEqualTo("session_id")
        assertThat(body.targetResponse()).isEqualTo("target_response")
    }
}
