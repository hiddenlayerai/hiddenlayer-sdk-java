// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SensorRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val sensorRetrieveResponse =
            SensorRetrieveResponse.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0L)
                .adhoc(true)
                .tags(
                    SensorRetrieveResponse.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(sensorRetrieveResponse.active()).isEqualTo(true)
        assertThat(sensorRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sensorRetrieveResponse.plaintextName()).isEqualTo("plaintext_name")
        assertThat(sensorRetrieveResponse.sensorId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensorRetrieveResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensorRetrieveResponse.version()).isEqualTo(0L)
        assertThat(sensorRetrieveResponse.adhoc()).contains(true)
        assertThat(sensorRetrieveResponse.tags())
            .contains(
                SensorRetrieveResponse.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorRetrieveResponse =
            SensorRetrieveResponse.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0L)
                .adhoc(true)
                .tags(
                    SensorRetrieveResponse.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedSensorRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorRetrieveResponse),
                jacksonTypeRef<SensorRetrieveResponse>(),
            )

        assertThat(roundtrippedSensorRetrieveResponse).isEqualTo(sensorRetrieveResponse)
    }
}
