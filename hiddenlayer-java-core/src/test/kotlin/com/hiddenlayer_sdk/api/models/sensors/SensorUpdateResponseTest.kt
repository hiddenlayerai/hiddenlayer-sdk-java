// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorUpdateResponseTest {

    @Test
    fun create() {
        val sensorUpdateResponse = SensorUpdateResponse.builder().detail("detail").build()

        assertThat(sensorUpdateResponse.detail()).isEqualTo("detail")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorUpdateResponse = SensorUpdateResponse.builder().detail("detail").build()

        val roundtrippedSensorUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorUpdateResponse),
                jacksonTypeRef<SensorUpdateResponse>(),
            )

        assertThat(roundtrippedSensorUpdateResponse).isEqualTo(sensorUpdateResponse)
    }
}
