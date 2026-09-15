// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamRetrieveNextActionResponseTest {

    @Test
    fun create() {
        val redTeamRetrieveNextActionResponse =
            RedTeamRetrieveNextActionResponse.builder()
                .isReady(true)
                .actionType("action_type")
                .attackPrompt("attack_prompt")
                .addHistory(
                    RedTeamRetrieveNextActionResponse.History.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isProcessing(true)
                .message("message")
                .sessionId("session_id")
                .targetSystemPrompt("target_system_prompt")
                .turn(0)
                .build()

        assertThat(redTeamRetrieveNextActionResponse.isReady()).isEqualTo(true)
        assertThat(redTeamRetrieveNextActionResponse.actionType()).contains("action_type")
        assertThat(redTeamRetrieveNextActionResponse.attackPrompt()).contains("attack_prompt")
        assertThat(redTeamRetrieveNextActionResponse.history().getOrNull())
            .containsExactly(
                RedTeamRetrieveNextActionResponse.History.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(redTeamRetrieveNextActionResponse.isProcessing()).contains(true)
        assertThat(redTeamRetrieveNextActionResponse.message()).contains("message")
        assertThat(redTeamRetrieveNextActionResponse.sessionId()).contains("session_id")
        assertThat(redTeamRetrieveNextActionResponse.targetSystemPrompt())
            .contains("target_system_prompt")
        assertThat(redTeamRetrieveNextActionResponse.turn()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redTeamRetrieveNextActionResponse =
            RedTeamRetrieveNextActionResponse.builder()
                .isReady(true)
                .actionType("action_type")
                .attackPrompt("attack_prompt")
                .addHistory(
                    RedTeamRetrieveNextActionResponse.History.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isProcessing(true)
                .message("message")
                .sessionId("session_id")
                .targetSystemPrompt("target_system_prompt")
                .turn(0)
                .build()

        val roundtrippedRedTeamRetrieveNextActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redTeamRetrieveNextActionResponse),
                jacksonTypeRef<RedTeamRetrieveNextActionResponse>(),
            )

        assertThat(roundtrippedRedTeamRetrieveNextActionResponse)
            .isEqualTo(redTeamRetrieveNextActionResponse)
    }
}
