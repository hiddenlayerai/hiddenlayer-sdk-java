// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.models.detection.DetectionRequestEvaluationParams
import com.hiddenlayer.api.models.detection.DetectionResponseEvaluationParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DetectionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestEvaluation() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val detectionServiceAsync = client.detection()

        val responseFuture =
            detectionServiceAsync.requestEvaluation(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun responseEvaluation() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val detectionServiceAsync = client.detection()

        val responseFuture =
            detectionServiceAsync.responseEvaluation(
                DetectionResponseEvaluationParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                    .body(
                        DetectionResponseEvaluationParams.Body.builder()
                            .putAdditionalProperty("id", JsonValue.from("bar"))
                            .putAdditionalProperty("object", JsonValue.from("bar"))
                            .putAdditionalProperty("created", JsonValue.from("bar"))
                            .putAdditionalProperty("model", JsonValue.from("bar"))
                            .putAdditionalProperty("choices", JsonValue.from("bar"))
                            .putAdditionalProperty("usage", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
