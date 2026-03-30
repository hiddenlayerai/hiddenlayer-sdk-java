// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.detection

import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetectionRequestEvaluationParamsTest {

    @Test
    fun create() {
        DetectionRequestEvaluationParams.builder()
            .hlProjectId("internal-search-chatbot")
            .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
            .body(
                DetectionRequestEvaluationParams.Body.builder()
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
            DetectionRequestEvaluationParams.builder()
                .hlProjectId("internal-search-chatbot")
                .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                .body(
                    DetectionRequestEvaluationParams.Body.builder()
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
            DetectionRequestEvaluationParams.builder()
                .body(
                    DetectionRequestEvaluationParams.Body.builder()
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
            DetectionRequestEvaluationParams.builder()
                .hlProjectId("internal-search-chatbot")
                .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                .body(
                    DetectionRequestEvaluationParams.Body.builder()
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
                DetectionRequestEvaluationParams.Body.builder()
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
            DetectionRequestEvaluationParams.builder()
                .body(
                    DetectionRequestEvaluationParams.Body.builder()
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
                DetectionRequestEvaluationParams.Body.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("messages", JsonValue.from("bar"))
                    .putAdditionalProperty("max_tokens", JsonValue.from("bar"))
                    .putAdditionalProperty("temperature", JsonValue.from("bar"))
                    .build()
            )
    }
}
