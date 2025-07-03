// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.sensors

import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SensorCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        SensorCreateParams.builder()
            .xCorrelationId("00000000-0000-0000-0000-000000000000")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headers() {
        val params =
            SensorCreateParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SensorCreateParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .plaintextName("plaintext_name")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            SensorCreateParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SensorCreateParams.builder()
                .xCorrelationId("00000000-0000-0000-0000-000000000000")
                .plaintextName("plaintext_name")
                .build()

        val body = params._body()

        assertThat(body.plaintextName()).isEqualTo("plaintext_name")
    }
}
