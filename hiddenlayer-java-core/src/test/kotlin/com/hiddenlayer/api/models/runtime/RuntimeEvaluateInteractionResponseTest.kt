// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.runtime

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuntimeEvaluateInteractionResponseTest {

    @Test
    fun create() {
        val runtimeEvaluateInteractionResponse =
            RuntimeEvaluateInteractionResponse.builder()
                .evaluatedInteraction(
                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.builder()
                        .addMessage(
                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                .builder()
                                .addTextContent("Hello, how can I help you today?")
                                .role("user")
                                .analysis(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                        .Analysis
                                        .builder()
                                        .signals(
                                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction
                                                .Message
                                                .Analysis
                                                .Signals
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf("foo" to "bar")),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .timestamp(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                        .Timestamp
                                        .builder()
                                        .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                        .build()
                                )
                                .build()
                        )
                        .addToolsAvailable(
                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction.ToolsAvailable
                                .builder()
                                .name("web_search")
                                .description("Search the web for current information")
                                .parameters(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction
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
                    RuntimeEvaluateInteractionResponse.Metadata.builder()
                        .evaluatedAt(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .evaluationId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                        .model("gpt-4-turbo")
                        .processingTimeMs(15.34f)
                        .project(
                            RuntimeEvaluateInteractionResponse.Metadata.Project.builder()
                                .configurationId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                                .policyId("dfaf7f57-2290-435f-b14a-d0e4da4b4ce2")
                                .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                                .projectAlias("enterprise-search")
                                .build()
                        )
                        .provider("openai")
                        .requesterId("user-12345")
                        .build()
                )
                .outcome(
                    RuntimeEvaluateInteractionResponse.Outcome.builder()
                        .action(RuntimeEvaluateInteractionResponse.Outcome.Action.REDACT)
                        .addDetection(
                            RuntimeEvaluateInteractionResponse.Outcome.Detection.builder()
                                .riskLevel(
                                    RuntimeEvaluateInteractionResponse.Outcome.Detection.RiskLevel
                                        .HIGH
                                )
                                .ruleName("prompt_injection")
                                .build()
                        )
                        .effectiveInteraction(
                            RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                .CanonicalInteraction
                                .builder()
                                .addMessage(
                                    RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                        .CanonicalInteraction
                                        .Message
                                        .builder()
                                        .addTextContent("Hello, how can I help you today?")
                                        .role("user")
                                        .timestamp(
                                            RuntimeEvaluateInteractionResponse.Outcome
                                                .EffectiveInteraction
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
                                    RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                        .CanonicalInteraction
                                        .ToolsAvailable
                                        .builder()
                                        .name("web_search")
                                        .description("Search the web for current information")
                                        .parameters(
                                            RuntimeEvaluateInteractionResponse.Outcome
                                                .EffectiveInteraction
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
                        .threatLevel(RuntimeEvaluateInteractionResponse.Outcome.ThreatLevel.MEDIUM)
                        .build()
                )
                .build()

        assertThat(runtimeEvaluateInteractionResponse.evaluatedInteraction())
            .isEqualTo(
                RuntimeEvaluateInteractionResponse.EvaluatedInteraction.builder()
                    .addMessage(
                        RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message.builder()
                            .addTextContent("Hello, how can I help you today?")
                            .role("user")
                            .analysis(
                                RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                    .Analysis
                                    .builder()
                                    .signals(
                                        RuntimeEvaluateInteractionResponse.EvaluatedInteraction
                                            .Message
                                            .Analysis
                                            .Signals
                                            .builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf("foo" to "bar")),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .timestamp(
                                RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                    .Timestamp
                                    .builder()
                                    .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                    .build()
                            )
                            .build()
                    )
                    .addToolsAvailable(
                        RuntimeEvaluateInteractionResponse.EvaluatedInteraction.ToolsAvailable
                            .builder()
                            .name("web_search")
                            .description("Search the web for current information")
                            .parameters(
                                RuntimeEvaluateInteractionResponse.EvaluatedInteraction
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
        assertThat(runtimeEvaluateInteractionResponse.metadata())
            .isEqualTo(
                RuntimeEvaluateInteractionResponse.Metadata.builder()
                    .evaluatedAt(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                    .evaluationId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                    .model("gpt-4-turbo")
                    .processingTimeMs(15.34f)
                    .project(
                        RuntimeEvaluateInteractionResponse.Metadata.Project.builder()
                            .configurationId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                            .policyId("dfaf7f57-2290-435f-b14a-d0e4da4b4ce2")
                            .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                            .projectAlias("enterprise-search")
                            .build()
                    )
                    .provider("openai")
                    .requesterId("user-12345")
                    .build()
            )
        assertThat(runtimeEvaluateInteractionResponse.outcome())
            .isEqualTo(
                RuntimeEvaluateInteractionResponse.Outcome.builder()
                    .action(RuntimeEvaluateInteractionResponse.Outcome.Action.REDACT)
                    .addDetection(
                        RuntimeEvaluateInteractionResponse.Outcome.Detection.builder()
                            .riskLevel(
                                RuntimeEvaluateInteractionResponse.Outcome.Detection.RiskLevel.HIGH
                            )
                            .ruleName("prompt_injection")
                            .build()
                    )
                    .effectiveInteraction(
                        RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                            .CanonicalInteraction
                            .builder()
                            .addMessage(
                                RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                    .CanonicalInteraction
                                    .Message
                                    .builder()
                                    .addTextContent("Hello, how can I help you today?")
                                    .role("user")
                                    .timestamp(
                                        RuntimeEvaluateInteractionResponse.Outcome
                                            .EffectiveInteraction
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
                                RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                    .CanonicalInteraction
                                    .ToolsAvailable
                                    .builder()
                                    .name("web_search")
                                    .description("Search the web for current information")
                                    .parameters(
                                        RuntimeEvaluateInteractionResponse.Outcome
                                            .EffectiveInteraction
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
                    .threatLevel(RuntimeEvaluateInteractionResponse.Outcome.ThreatLevel.MEDIUM)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runtimeEvaluateInteractionResponse =
            RuntimeEvaluateInteractionResponse.builder()
                .evaluatedInteraction(
                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.builder()
                        .addMessage(
                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                .builder()
                                .addTextContent("Hello, how can I help you today?")
                                .role("user")
                                .analysis(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                        .Analysis
                                        .builder()
                                        .signals(
                                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction
                                                .Message
                                                .Analysis
                                                .Signals
                                                .builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from(mapOf("foo" to "bar")),
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .timestamp(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction.Message
                                        .Timestamp
                                        .builder()
                                        .value(OffsetDateTime.parse("2024-02-10T12:00:00Z"))
                                        .build()
                                )
                                .build()
                        )
                        .addToolsAvailable(
                            RuntimeEvaluateInteractionResponse.EvaluatedInteraction.ToolsAvailable
                                .builder()
                                .name("web_search")
                                .description("Search the web for current information")
                                .parameters(
                                    RuntimeEvaluateInteractionResponse.EvaluatedInteraction
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
                    RuntimeEvaluateInteractionResponse.Metadata.builder()
                        .evaluatedAt(OffsetDateTime.parse("2024-01-15T10:30:00.000Z"))
                        .evaluationId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                        .model("gpt-4-turbo")
                        .processingTimeMs(15.34f)
                        .project(
                            RuntimeEvaluateInteractionResponse.Metadata.Project.builder()
                                .configurationId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                                .policyId("dfaf7f57-2290-435f-b14a-d0e4da4b4ce2")
                                .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                                .projectAlias("enterprise-search")
                                .build()
                        )
                        .provider("openai")
                        .requesterId("user-12345")
                        .build()
                )
                .outcome(
                    RuntimeEvaluateInteractionResponse.Outcome.builder()
                        .action(RuntimeEvaluateInteractionResponse.Outcome.Action.REDACT)
                        .addDetection(
                            RuntimeEvaluateInteractionResponse.Outcome.Detection.builder()
                                .riskLevel(
                                    RuntimeEvaluateInteractionResponse.Outcome.Detection.RiskLevel
                                        .HIGH
                                )
                                .ruleName("prompt_injection")
                                .build()
                        )
                        .effectiveInteraction(
                            RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                .CanonicalInteraction
                                .builder()
                                .addMessage(
                                    RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                        .CanonicalInteraction
                                        .Message
                                        .builder()
                                        .addTextContent("Hello, how can I help you today?")
                                        .role("user")
                                        .timestamp(
                                            RuntimeEvaluateInteractionResponse.Outcome
                                                .EffectiveInteraction
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
                                    RuntimeEvaluateInteractionResponse.Outcome.EffectiveInteraction
                                        .CanonicalInteraction
                                        .ToolsAvailable
                                        .builder()
                                        .name("web_search")
                                        .description("Search the web for current information")
                                        .parameters(
                                            RuntimeEvaluateInteractionResponse.Outcome
                                                .EffectiveInteraction
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
                        .threatLevel(RuntimeEvaluateInteractionResponse.Outcome.ThreatLevel.MEDIUM)
                        .build()
                )
                .build()

        val roundtrippedRuntimeEvaluateInteractionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runtimeEvaluateInteractionResponse),
                jacksonTypeRef<RuntimeEvaluateInteractionResponse>(),
            )

        assertThat(roundtrippedRuntimeEvaluateInteractionResponse)
            .isEqualTo(runtimeEvaluateInteractionResponse)
    }
}
