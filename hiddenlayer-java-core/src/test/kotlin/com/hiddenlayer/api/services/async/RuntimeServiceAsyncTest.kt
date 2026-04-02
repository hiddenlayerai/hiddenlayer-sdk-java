// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RuntimeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun evaluateRequest() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val runtimeServiceAsync = client.runtime()

        val responseFuture =
            runtimeServiceAsync.evaluateRequest(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun evaluateResponse() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val runtimeServiceAsync = client.runtime()

        val responseFuture =
            runtimeServiceAsync.evaluateResponse(
                RuntimeEvaluateResponseParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                    .body(
                        RuntimeEvaluateResponseParams.Body.builder()
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
