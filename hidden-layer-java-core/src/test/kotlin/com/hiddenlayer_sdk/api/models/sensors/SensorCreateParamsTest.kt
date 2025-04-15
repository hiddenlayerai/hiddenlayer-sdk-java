// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.hiddenlayer_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SensorCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SensorCreateParams.builder()
            .plaintextName("example_model")
            .active(true)
            .adhoc(true)
            .tags(
                SensorCreateParams.Tags.builder()
                    .putAdditionalProperty("0", JsonValue.from("bar"))
                    .build()
            )
            .version(1L)
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SensorCreateParams.builder()
                .plaintextName("example_model")
                .active(true)
                .adhoc(true)
                .tags(
                    SensorCreateParams.Tags.builder()
                        .putAdditionalProperty("0", JsonValue.from("bar"))
                        .build()
                )
                .version(1L)
                .build()

        val body = params._body()

        assertThat(body.plaintextName()).isEqualTo("example_model")
        assertThat(body.active()).contains(true)
        assertThat(body.adhoc()).contains(true)
        assertThat(body.tags())
            .contains(
                SensorCreateParams.Tags.builder()
                    .putAdditionalProperty("0", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.version()).contains(1L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = SensorCreateParams.builder().plaintextName("example_model").build()

        val body = params._body()

        assertThat(body.plaintextName()).isEqualTo("example_model")
    }
}
