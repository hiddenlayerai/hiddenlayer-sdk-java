// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.hiddenlayer_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionAnalyzeParamsTest {

    @Test
    fun create() {
        InteractionAnalyzeParams.builder()
            .hlProjectId("internal-search-chatbot")
            .metadata(
                Metadata.builder()
                    .model("model")
                    .requesterId("requester_id")
                    .provider("provider")
                    .build()
            )
            .input(
                Input.builder()
                    .addMessage(TextContent.builder().content("content").role("role").build())
                    .build()
            )
            .output(
                Output.builder()
                    .addMessage(TextContent.builder().content("content").role("role").build())
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            InteractionAnalyzeParams.builder()
                .hlProjectId("internal-search-chatbot")
                .metadata(
                    Metadata.builder()
                        .model("model")
                        .requesterId("requester_id")
                        .provider("provider")
                        .build()
                )
                .input(
                    Input.builder()
                        .addMessage(TextContent.builder().content("content").role("role").build())
                        .build()
                )
                .output(
                    Output.builder()
                        .addMessage(TextContent.builder().content("content").role("role").build())
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("HL-Project-Id", "internal-search-chatbot").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            InteractionAnalyzeParams.builder()
                .metadata(Metadata.builder().model("model").requesterId("requester_id").build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            InteractionAnalyzeParams.builder()
                .hlProjectId("internal-search-chatbot")
                .metadata(
                    Metadata.builder()
                        .model("model")
                        .requesterId("requester_id")
                        .provider("provider")
                        .build()
                )
                .input(
                    Input.builder()
                        .addMessage(TextContent.builder().content("content").role("role").build())
                        .build()
                )
                .output(
                    Output.builder()
                        .addMessage(TextContent.builder().content("content").role("role").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder()
                    .model("model")
                    .requesterId("requester_id")
                    .provider("provider")
                    .build()
            )
        assertThat(body.input())
            .contains(
                Input.builder()
                    .addMessage(TextContent.builder().content("content").role("role").build())
                    .build()
            )
        assertThat(body.output())
            .contains(
                Output.builder()
                    .addMessage(TextContent.builder().content("content").role("role").build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InteractionAnalyzeParams.builder()
                .metadata(Metadata.builder().model("model").requesterId("requester_id").build())
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(Metadata.builder().model("model").requesterId("requester_id").build())
    }
}
