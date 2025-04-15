// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SensorQueryResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val sensorQueryResponse =
            SensorQueryResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    Sensor.builder()
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plaintextName("plaintext_name")
                        .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tags(
                            Sensor.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version(0L)
                        .build()
                )
                .totalCount(0L)
                .build()

        assertThat(sensorQueryResponse.pageNumber()).isEqualTo(0L)
        assertThat(sensorQueryResponse.pageSize()).isEqualTo(0L)
        assertThat(sensorQueryResponse.results())
            .containsExactly(
                Sensor.builder()
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .plaintextName("plaintext_name")
                    .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tags(
                        Sensor.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .version(0L)
                    .build()
            )
        assertThat(sensorQueryResponse.totalCount()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorQueryResponse =
            SensorQueryResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    Sensor.builder()
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .plaintextName("plaintext_name")
                        .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tags(
                            Sensor.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .version(0L)
                        .build()
                )
                .totalCount(0L)
                .build()

        val roundtrippedSensorQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorQueryResponse),
                jacksonTypeRef<SensorQueryResponse>(),
            )

        assertThat(roundtrippedSensorQueryResponse).isEqualTo(sensorQueryResponse)
    }
}
