// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamSubmitTargetResponseResponseTest {

    @Test
    fun create() {
        val redTeamSubmitTargetResponseResponse =
            RedTeamSubmitTargetResponseResponse.builder()
                .isOk(true)
                .message("message")
                .error("error")
                .build()

        assertThat(redTeamSubmitTargetResponseResponse.isOk()).isEqualTo(true)
        assertThat(redTeamSubmitTargetResponseResponse.message()).isEqualTo("message")
        assertThat(redTeamSubmitTargetResponseResponse.error()).contains("error")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val redTeamSubmitTargetResponseResponse =
            RedTeamSubmitTargetResponseResponse.builder()
                .isOk(true)
                .message("message")
                .error("error")
                .build()

        val roundtrippedRedTeamSubmitTargetResponseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(redTeamSubmitTargetResponseResponse),
                jacksonTypeRef<RedTeamSubmitTargetResponseResponse>(),
            )

        assertThat(roundtrippedRedTeamSubmitTargetResponseResponse)
            .isEqualTo(redTeamSubmitTargetResponseResponse)
    }
}
