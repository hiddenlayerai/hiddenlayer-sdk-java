// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.runtime

import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuntimeEvaluateInteractionParamsTest {

    @Test
    fun create() {
        RuntimeEvaluateInteractionParams.builder()
            .hlProjectId("internal-search-chatbot")
            .interaction(
                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.builder()
                    .addMessage(
                        RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.Message
                            .builder()
                            .addTextContent("What is the capital of France?")
                            .role("user")
                            .timestamp(
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                    .Message
                                    .Timestamp
                                    .builder()
                                    .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                    .build()
                            )
                            .build()
                    )
                    .addMessage(
                        RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.Message
                            .builder()
                            .addTextContent("The capital of France is Paris.")
                            .role("assistant")
                            .timestamp(
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
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
                                RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("HL-Project-Id", "internal-search-chatbot").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            RuntimeEvaluateInteractionParams.builder()
                .interaction(
                    RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.builder()
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("What is the capital of France?")
                                .role("user")
                                .build()
                        )
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("The capital of France is Paris.")
                                .role("assistant")
                                .build()
                        )
                        .build()
                )
                .metadata(
                    RuntimeEvaluateInteractionParams.Metadata.builder()
                        .model("gpt-4-turbo")
                        .provider("openai")
                        .requesterId("user-12345")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.interaction())
            .isEqualTo(
                RuntimeEvaluateInteractionParams.Interaction.ofCanonical(
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
            )
        assertThat(body.metadata())
            .isEqualTo(
                RuntimeEvaluateInteractionParams.Metadata.builder()
                    .model("gpt-4-turbo")
                    .provider("openai")
                    .requesterId("user-12345")
                    .externalSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RuntimeEvaluateInteractionParams.builder()
                .interaction(
                    RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.builder()
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("What is the capital of France?")
                                .role("user")
                                .build()
                        )
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("The capital of France is Paris.")
                                .role("assistant")
                                .build()
                        )
                        .build()
                )
                .metadata(
                    RuntimeEvaluateInteractionParams.Metadata.builder()
                        .model("gpt-4-turbo")
                        .provider("openai")
                        .requesterId("user-12345")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.interaction())
            .isEqualTo(
                RuntimeEvaluateInteractionParams.Interaction.ofCanonical(
                    RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction.builder()
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("What is the capital of France?")
                                .role("user")
                                .build()
                        )
                        .addMessage(
                            RuntimeEvaluateInteractionParams.Interaction.CanonicalInteraction
                                .Message
                                .builder()
                                .addTextContent("The capital of France is Paris.")
                                .role("assistant")
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.metadata())
            .isEqualTo(
                RuntimeEvaluateInteractionParams.Metadata.builder()
                    .model("gpt-4-turbo")
                    .provider("openai")
                    .requesterId("user-12345")
                    .build()
            )
    }
}
