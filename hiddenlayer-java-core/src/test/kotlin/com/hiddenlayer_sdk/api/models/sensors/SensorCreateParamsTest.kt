// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.hiddenlayer_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SensorCreateParamsTest {

    @Test
    fun create() {
        SensorCreateParams.builder()
            .plaintextName("plaintext_name")
            .active(true)
            .adhoc(true)
            .tags(
                SensorCreateParams.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .version(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SensorCreateParams.builder()
                .plaintextName("plaintext_name")
                .active(true)
                .adhoc(true)
                .tags(
                    SensorCreateParams.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version(0L)
                .build()

        val body = params._body()

        assertThat(body.plaintextName()).isEqualTo("plaintext_name")
        assertThat(body.active()).contains(true)
        assertThat(body.adhoc()).contains(true)
        assertThat(body.tags())
            .contains(
                SensorCreateParams.Tags.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.version()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SensorCreateParams.builder().plaintextName("plaintext_name").build()

        val body = params._body()

        assertThat(body.plaintextName()).isEqualTo("plaintext_name")
    }
}
