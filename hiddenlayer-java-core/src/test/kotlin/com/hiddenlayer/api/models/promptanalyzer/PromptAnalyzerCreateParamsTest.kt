// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.promptanalyzer

import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptAnalyzerCreateParamsTest {

    @Test
    fun create() {
        PromptAnalyzerCreateParams.builder()
            .hlProjectId("internal-search-chatbot")
            .xRequesterId("X-Requester-Id")
            .prompt("Hello World")
            .model("mistral-tiny")
            .output("Hello, how can I help you today?")
            .build()
    }

    @Test
    fun headers() {
        val params =
            PromptAnalyzerCreateParams.builder()
                .hlProjectId("internal-search-chatbot")
                .xRequesterId("X-Requester-Id")
                .prompt("Hello World")
                .model("mistral-tiny")
                .output("Hello, how can I help you today?")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("HL-Project-Id", "internal-search-chatbot")
                    .put("X-Requester-Id", "X-Requester-Id")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PromptAnalyzerCreateParams.builder().prompt("Hello World").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            PromptAnalyzerCreateParams.builder()
                .hlProjectId("internal-search-chatbot")
                .xRequesterId("X-Requester-Id")
                .prompt("Hello World")
                .model("mistral-tiny")
                .output("Hello, how can I help you today?")
                .build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Hello World")
        assertThat(body.model()).contains("mistral-tiny")
        assertThat(body.output()).contains("Hello, how can I help you today?")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PromptAnalyzerCreateParams.builder().prompt("Hello World").build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Hello World")
    }
}
