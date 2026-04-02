// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.runtime

import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuntimeEvaluateRequestParamsTest {

    @Test
    fun create() {
        RuntimeEvaluateRequestParams.builder()
            .hlProjectId("internal-search-chatbot")
            .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
            .body(
                RuntimeEvaluateRequestParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("messages", JsonValue.from("bar"))
                    .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("temperature", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            RuntimeEvaluateRequestParams.builder()
                .hlProjectId("internal-search-chatbot")
                .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                .body(
                    RuntimeEvaluateRequestParams.Body.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("temperature", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("HL-Project-Id", "internal-search-chatbot")
                    .put("HL-Runtime-Session-Id", "sess_4b8cde94604f4c389406a0b2f806069a")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            RuntimeEvaluateRequestParams.builder()
                .body(
                    RuntimeEvaluateRequestParams.Body.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("temperature", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            RuntimeEvaluateRequestParams.builder()
                .hlProjectId("internal-search-chatbot")
                .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                .body(
                    RuntimeEvaluateRequestParams.Body.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("temperature", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RuntimeEvaluateRequestParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("messages", JsonValue.from("bar"))
                    .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("temperature", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuntimeEvaluateRequestParams.builder()
                .body(
                    RuntimeEvaluateRequestParams.Body.builder()
                        .putAdditionalProperty("model", JsonValue.from("bar"))
                        .putAdditionalProperty("messages", JsonValue.from("bar"))
                        .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                        .putAdditionalProperty("temperature", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RuntimeEvaluateRequestParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("messages", JsonValue.from("bar"))
                    .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("temperature", JsonValue.from("bar"))
                    .build()
            )
    }
}
