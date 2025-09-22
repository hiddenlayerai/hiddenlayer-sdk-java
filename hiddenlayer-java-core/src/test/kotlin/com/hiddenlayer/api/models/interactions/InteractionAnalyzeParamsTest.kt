// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionAnalyzeParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("HL-Project-Id", "internal-search-chatbot")
                    .put("X-Correlation-Id", "00000000-0000-0000-0000-000000000000")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InteractionAnalyzeParams.builder()
                .metadata(
                    InteractionAnalyzeParams.Metadata.builder()
                        .model("gpt-5")
                        .requesterId("user-1234")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                InteractionAnalyzeParams.Metadata.builder()
                    .model("gpt-5")
                    .requesterId("user-1234")
                    .provider("openai")
                    .build()
            )
        assertThat(body.input())
            .contains(
                InteractionAnalyzeParams.Input.builder()
                    .addMessage(
                        InteractionAnalyzeParams.Input.Message.builder()
                            .content("What the largest moon of jupiter?")
                            .role("user")
                            .build()
                    )
                    .build()
            )
        assertThat(body.output())
            .contains(
                InteractionAnalyzeParams.Output.builder()
                    .addMessage(
                        InteractionAnalyzeParams.Output.Message.builder()
                            .content("The largest moon of Jupiter is Ganymede.")
                            .role("assistant")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InteractionAnalyzeParams.builder()
                .metadata(
                    InteractionAnalyzeParams.Metadata.builder()
                        .model("gpt-5")
                        .requesterId("user-1234")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                InteractionAnalyzeParams.Metadata.builder()
                    .model("gpt-5")
                    .requesterId("user-1234")
                    .build()
            )
    }
}
