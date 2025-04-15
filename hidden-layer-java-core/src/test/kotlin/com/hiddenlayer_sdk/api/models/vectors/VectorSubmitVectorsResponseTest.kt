// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.vectors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VectorSubmitVectorsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val vectorSubmitVectorsResponse =
            VectorSubmitVectorsResponse.builder()
                .eventTime("event_time")
                .groupId("group_id")
                .requesterId("requester_id")
                .sensorId("sensor_id")
                .tenantId("tenant_id")
                .build()

        assertThat(vectorSubmitVectorsResponse.eventTime()).isEqualTo("event_time")
        assertThat(vectorSubmitVectorsResponse.groupId()).isEqualTo("group_id")
        assertThat(vectorSubmitVectorsResponse.requesterId()).isEqualTo("requester_id")
        assertThat(vectorSubmitVectorsResponse.sensorId()).isEqualTo("sensor_id")
        assertThat(vectorSubmitVectorsResponse.tenantId()).isEqualTo("tenant_id")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorSubmitVectorsResponse =
            VectorSubmitVectorsResponse.builder()
                .eventTime("event_time")
                .groupId("group_id")
                .requesterId("requester_id")
                .sensorId("sensor_id")
                .tenantId("tenant_id")
                .build()

        val roundtrippedVectorSubmitVectorsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorSubmitVectorsResponse),
                jacksonTypeRef<VectorSubmitVectorsResponse>(),
            )

        assertThat(roundtrippedVectorSubmitVectorsResponse).isEqualTo(vectorSubmitVectorsResponse)
    }
}
