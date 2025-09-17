// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorCreateResponseTest {

    @Test
    fun create() {
        val sensorCreateResponse =
            SensorCreateResponse.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tags(
                    SensorCreateResponse.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adhoc(true)
                .version(0L)
                .build()

        assertThat(sensorCreateResponse.active()).isEqualTo(true)
        assertThat(sensorCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sensorCreateResponse.modelId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensorCreateResponse.plaintextName()).isEqualTo("plaintext_name")
        assertThat(sensorCreateResponse.sensorId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensorCreateResponse.tags())
            .isEqualTo(
                SensorCreateResponse.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(sensorCreateResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensorCreateResponse.adhoc()).contains(true)
        assertThat(sensorCreateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorCreateResponse =
            SensorCreateResponse.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tags(
                    SensorCreateResponse.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adhoc(true)
                .version(0L)
                .build()

        val roundtrippedSensorCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorCreateResponse),
                jacksonTypeRef<SensorCreateResponse>(),
            )

        assertThat(roundtrippedSensorCreateResponse).isEqualTo(sensorCreateResponse)
    }
}
