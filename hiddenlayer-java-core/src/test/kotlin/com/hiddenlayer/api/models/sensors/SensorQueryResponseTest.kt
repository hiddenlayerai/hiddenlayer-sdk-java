// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorQueryResponseTest {

    @Test
    fun create() {
        val sensorQueryResponse =
            SensorQueryResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    SensorQueryResponse.Result.builder()
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .plaintextName("plaintext_name")
                        .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tags(
                            SensorQueryResponse.Result.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .adhoc(true)
                        .version(0L)
                        .build()
                )
                .totalCount(0L)
                .build()

        assertThat(sensorQueryResponse.pageNumber()).isEqualTo(0L)
        assertThat(sensorQueryResponse.pageSize()).isEqualTo(0L)
        assertThat(sensorQueryResponse.results())
            .containsExactly(
                SensorQueryResponse.Result.builder()
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .plaintextName("plaintext_name")
                    .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tags(
                        SensorQueryResponse.Result.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .adhoc(true)
                    .version(0L)
                    .build()
            )
        assertThat(sensorQueryResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensorQueryResponse =
            SensorQueryResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    SensorQueryResponse.Result.builder()
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .plaintextName("plaintext_name")
                        .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tags(
                            SensorQueryResponse.Result.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .adhoc(true)
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
