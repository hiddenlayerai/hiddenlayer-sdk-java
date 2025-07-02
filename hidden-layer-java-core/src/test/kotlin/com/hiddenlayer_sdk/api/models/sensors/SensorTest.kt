// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SensorTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val sensor =
            Sensor.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0L)
                .tags(
                    Sensor.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(sensor.active()).isEqualTo(true)
        assertThat(sensor.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sensor.plaintextName()).isEqualTo("plaintext_name")
        assertThat(sensor.sensorId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensor.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sensor.version()).isEqualTo(0L)
        assertThat(sensor.tags())
            .contains(
                Sensor.Tags.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sensor =
            Sensor.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .version(0L)
                .tags(
                    Sensor.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedSensor =
            jsonMapper.readValue(jsonMapper.writeValueAsString(sensor), jacksonTypeRef<Sensor>())

        assertThat(roundtrippedSensor).isEqualTo(sensor)
    }
}
