// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hiddenlayer_sdk.api.client.HiddenLayerClient
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.http.Headers
import com.hiddenlayer_sdk.api.core.jsonMapper
import com.hiddenlayer_sdk.api.errors.BadRequestException
import com.hiddenlayer_sdk.api.errors.HiddenLayerException
import com.hiddenlayer_sdk.api.errors.InternalServerException
import com.hiddenlayer_sdk.api.errors.NotFoundException
import com.hiddenlayer_sdk.api.errors.PermissionDeniedException
import com.hiddenlayer_sdk.api.errors.RateLimitException
import com.hiddenlayer_sdk.api.errors.UnauthorizedException
import com.hiddenlayer_sdk.api.errors.UnexpectedStatusCodeException
import com.hiddenlayer_sdk.api.errors.UnprocessableEntityException
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: HiddenLayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate400() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate400WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate401() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate401WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate403() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate403WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate404() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate404WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate422() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate422WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate429() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate429WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate500() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate500WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate999() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreate999WithRawResponse() {
        val sensorService = client.sensors().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sensorService.create(
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sensorsCreateInvalidJsonBody() {
        val sensorService = client.sensors()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<HiddenLayerException> {
                sensorService.create(
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
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
