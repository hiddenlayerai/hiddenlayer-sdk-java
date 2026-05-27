// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateInteractionParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateRequestParams
import com.hiddenlayer.api.models.runtime.RuntimeEvaluateResponseParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RuntimeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun evaluateInteraction() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val runtimeService = client.runtime()

        val response =
            runtimeService.evaluateInteraction(
                RuntimeEvaluateInteractionParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .interaction(
                        RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.builder()
                            .addMessage(
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                    .Message
                                    .builder()
                                    .addTextContent("What is the capital of France?")
                                    .role("user")
                                    .timestamp(
                                        RuntimeEvaluateInteractionParams.Interaction
                                            .CanonicalInteraction
                                            .Message
                                            .Timestamp
                                            .builder()
                                            .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                            .build()
                                    )
                                    .build()
                            )
                            .addMessage(
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                    .Message
                                    .builder()
                                    .addTextContent("The capital of France is Paris.")
                                    .role("assistant")
                                    .timestamp(
                                        RuntimeEvaluateInteractionParams.Interaction
                                            .CanonicalInteraction
                                            .Message
                                            .Timestamp
                                            .builder()
                                            .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                            .build()
                                    )
                                    .build()
                            )
                            .addToolsAvailable(
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                    .ToolsAvailable
                                    .builder()
                                    .name("web_search")
                                    .description("Search the web for current information")
                                    .parameters(
                                        RuntimeEvaluateInteractionParams.Interaction
                                            .CanonicalInteraction
                                            .ToolsAvailable
                                            .Parameters
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        RuntimeEvaluateInteractionParams.Metadata.builder()
                            .model("gpt-4-turbo")
                            .provider("openai")
                            .requesterId("user-12345")
                            .externalSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun evaluateRequest() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val runtimeService = client.runtime()

        val response =
            runtimeService.evaluateRequest(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun evaluateResponse() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val runtimeService = client.runtime()

        val response =
            runtimeService.evaluateResponse(
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

        response.validate()
    }
}
