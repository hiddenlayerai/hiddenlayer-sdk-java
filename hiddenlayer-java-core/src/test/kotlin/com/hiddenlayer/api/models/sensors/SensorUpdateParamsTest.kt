// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.sensors

import com.hiddenlayer.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorUpdateParamsTest {

    @Test
    fun create() {
        SensorUpdateParams.builder()
            .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .active(true)
            .plaintextName("plaintext_name")
            .tags(
                SensorUpdateParams.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SensorUpdateParams.builder().sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SensorUpdateParams.builder()
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .active(true)
                .plaintextName("plaintext_name")
                .tags(
                    SensorUpdateParams.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.active()).contains(true)
        assertThat(body.plaintextName()).contains("plaintext_name")
        assertThat(body.tags())
            .contains(
                SensorUpdateParams.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SensorUpdateParams.builder().sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
