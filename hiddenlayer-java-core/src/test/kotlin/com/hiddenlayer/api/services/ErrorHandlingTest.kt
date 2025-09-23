// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.http.Headers
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.errors.BadRequestException
import com.hiddenlayer.api.errors.HiddenLayerException
import com.hiddenlayer.api.errors.InternalServerException
import com.hiddenlayer.api.errors.NotFoundException
import com.hiddenlayer.api.errors.PermissionDeniedException
import com.hiddenlayer.api.errors.RateLimitException
import com.hiddenlayer.api.errors.UnauthorizedException
import com.hiddenlayer.api.errors.UnexpectedStatusCodeException
import com.hiddenlayer.api.errors.UnprocessableEntityException
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
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

    @Test
    fun interactionsAnalyze400() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze400WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze401() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze401WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze403() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze403WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze404() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze404WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze422() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze422WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze429() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze429WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze500() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze500WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze999() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyze999WithRawResponse() {
        val interactionService = client.interactions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun interactionsAnalyzeInvalidJsonBody() {
        val interactionService = client.interactions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<HiddenLayerException> {
                interactionService.analyze(
                    InteractionAnalyzeParams.builder()
                        .hlProjectId("internal-search-chatbot")
                        .xCorrelationId("00000000-0000-0000-0000-000000000000")
                        .metadata(
                            InteractionAnalyzeParams.Metadata.builder()
                                .model("gpt-5")
                                .requesterId("user-1234")
                                .provider("openai")
                                .build()
                        )
                        .input(
                            InteractionAnalyzeParams.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeParams.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeParams.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
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
