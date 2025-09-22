// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionAnalyzeResponseTest {

    @Test
    fun create() {
        val interactionAnalyzeResponse =
            InteractionAnalyzeResponse.builder()
                .addAnalysis(
                    InteractionAnalyzeResponse.Analysis.builder()
                        .id("prompt_injection.5.input")
                        .configuration(
                            InteractionAnalyzeResponse.Analysis.Configuration.builder()
                                .putAdditionalProperty("enabled", JsonValue.from("bar"))
                                .putAdditionalProperty("scan_type", JsonValue.from("bar"))
                                .putAdditionalProperty("allow_overrides", JsonValue.from("bar"))
                                .putAdditionalProperty("block_overrides", JsonValue.from("bar"))
                                .build()
                        )
                        .detected(true)
                        .findings(
                            InteractionAnalyzeResponse.Analysis.Findings.builder()
                                .frameworks(
                                    InteractionAnalyzeResponse.Analysis.Findings.Frameworks
                                        .builder()
                                        .putAdditionalProperty(
                                            "mitre",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "AML.T0051",
                                                        "name" to "LLM Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "owasp",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "LLM01",
                                                        "name" to "Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "owasp:2025",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "LLM01:2025",
                                                        "name" to "Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .name("prompt_injection")
                        .phase("input")
                        .processingTimeMs(7.01)
                        .version("version")
                        .build()
                )
                .analyzedData(
                    InteractionAnalyzeResponse.AnalyzedData.builder()
                        .input(
                            InteractionAnalyzeResponse.AnalyzedData.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.AnalyzedData.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeResponse.AnalyzedData.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.AnalyzedData.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .metadata(
                    InteractionAnalyzeResponse.Metadata.builder()
                        .model("gpt-5")
                        .processingTimeMs(15.34)
                        .project(
                            InteractionAnalyzeResponse.Metadata.Project.builder()
                                .projectAlias("enterprise-search")
                                .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                                .rulesetId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                                .build()
                        )
                        .provider("openai")
                        .requesterId("user-1234")
                        .analyzedAt(OffsetDateTime.parse("2023-10-10T14:48:00.000Z"))
                        .eventId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                        .build()
                )
                .modifiedData(
                    InteractionAnalyzeResponse.ModifiedData.builder()
                        .input(
                            InteractionAnalyzeResponse.ModifiedData.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.ModifiedData.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeResponse.ModifiedData.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.ModifiedData.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(interactionAnalyzeResponse.analysis())
            .containsExactly(
                InteractionAnalyzeResponse.Analysis.builder()
                    .id("prompt_injection.5.input")
                    .configuration(
                        InteractionAnalyzeResponse.Analysis.Configuration.builder()
                            .putAdditionalProperty("enabled", JsonValue.from("bar"))
                            .putAdditionalProperty("scan_type", JsonValue.from("bar"))
                            .putAdditionalProperty("allow_overrides", JsonValue.from("bar"))
                            .putAdditionalProperty("block_overrides", JsonValue.from("bar"))
                            .build()
                    )
                    .detected(true)
                    .findings(
                        InteractionAnalyzeResponse.Analysis.Findings.builder()
                            .frameworks(
                                InteractionAnalyzeResponse.Analysis.Findings.Frameworks.builder()
                                    .putAdditionalProperty(
                                        "mitre",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "label" to "AML.T0051",
                                                    "name" to "LLM Prompt Injection",
                                                )
                                            )
                                        ),
                                    )
                                    .putAdditionalProperty(
                                        "owasp",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "label" to "LLM01",
                                                    "name" to "Prompt Injection",
                                                )
                                            )
                                        ),
                                    )
                                    .putAdditionalProperty(
                                        "owasp:2025",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "label" to "LLM01:2025",
                                                    "name" to "Prompt Injection",
                                                )
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .name("prompt_injection")
                    .phase("input")
                    .processingTimeMs(7.01)
                    .version("version")
                    .build()
            )
        assertThat(interactionAnalyzeResponse.analyzedData())
            .isEqualTo(
                InteractionAnalyzeResponse.AnalyzedData.builder()
                    .input(
                        InteractionAnalyzeResponse.AnalyzedData.Input.builder()
                            .addMessage(
                                InteractionAnalyzeResponse.AnalyzedData.Input.Message.builder()
                                    .content("What the largest moon of jupiter?")
                                    .role("user")
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        InteractionAnalyzeResponse.AnalyzedData.Output.builder()
                            .addMessage(
                                InteractionAnalyzeResponse.AnalyzedData.Output.Message.builder()
                                    .content("The largest moon of Jupiter is Ganymede.")
                                    .role("assistant")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(interactionAnalyzeResponse.metadata())
            .isEqualTo(
                InteractionAnalyzeResponse.Metadata.builder()
                    .model("gpt-5")
                    .processingTimeMs(15.34)
                    .project(
                        InteractionAnalyzeResponse.Metadata.Project.builder()
                            .projectAlias("enterprise-search")
                            .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                            .rulesetId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                            .build()
                    )
                    .provider("openai")
                    .requesterId("user-1234")
                    .analyzedAt(OffsetDateTime.parse("2023-10-10T14:48:00.000Z"))
                    .eventId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                    .build()
            )
        assertThat(interactionAnalyzeResponse.modifiedData())
            .isEqualTo(
                InteractionAnalyzeResponse.ModifiedData.builder()
                    .input(
                        InteractionAnalyzeResponse.ModifiedData.Input.builder()
                            .addMessage(
                                InteractionAnalyzeResponse.ModifiedData.Input.Message.builder()
                                    .content("What the largest moon of jupiter?")
                                    .role("user")
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        InteractionAnalyzeResponse.ModifiedData.Output.builder()
                            .addMessage(
                                InteractionAnalyzeResponse.ModifiedData.Output.Message.builder()
                                    .content("The largest moon of Jupiter is Ganymede.")
                                    .role("assistant")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionAnalyzeResponse =
            InteractionAnalyzeResponse.builder()
                .addAnalysis(
                    InteractionAnalyzeResponse.Analysis.builder()
                        .id("prompt_injection.5.input")
                        .configuration(
                            InteractionAnalyzeResponse.Analysis.Configuration.builder()
                                .putAdditionalProperty("enabled", JsonValue.from("bar"))
                                .putAdditionalProperty("scan_type", JsonValue.from("bar"))
                                .putAdditionalProperty("allow_overrides", JsonValue.from("bar"))
                                .putAdditionalProperty("block_overrides", JsonValue.from("bar"))
                                .build()
                        )
                        .detected(true)
                        .findings(
                            InteractionAnalyzeResponse.Analysis.Findings.builder()
                                .frameworks(
                                    InteractionAnalyzeResponse.Analysis.Findings.Frameworks
                                        .builder()
                                        .putAdditionalProperty(
                                            "mitre",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "AML.T0051",
                                                        "name" to "LLM Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "owasp",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "LLM01",
                                                        "name" to "Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .putAdditionalProperty(
                                            "owasp:2025",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "label" to "LLM01:2025",
                                                        "name" to "Prompt Injection",
                                                    )
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .name("prompt_injection")
                        .phase("input")
                        .processingTimeMs(7.01)
                        .version("version")
                        .build()
                )
                .analyzedData(
                    InteractionAnalyzeResponse.AnalyzedData.builder()
                        .input(
                            InteractionAnalyzeResponse.AnalyzedData.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.AnalyzedData.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeResponse.AnalyzedData.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.AnalyzedData.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .metadata(
                    InteractionAnalyzeResponse.Metadata.builder()
                        .model("gpt-5")
                        .processingTimeMs(15.34)
                        .project(
                            InteractionAnalyzeResponse.Metadata.Project.builder()
                                .projectAlias("enterprise-search")
                                .projectId("ca87b009-90bd-4724-91c2-f23326acd51a")
                                .rulesetId("b5d7d261-b7be-451a-b943-0d408ab88aab")
                                .build()
                        )
                        .provider("openai")
                        .requesterId("user-1234")
                        .analyzedAt(OffsetDateTime.parse("2023-10-10T14:48:00.000Z"))
                        .eventId("d290f1ee-6c54-4b01-90e6-d701748f0851")
                        .build()
                )
                .modifiedData(
                    InteractionAnalyzeResponse.ModifiedData.builder()
                        .input(
                            InteractionAnalyzeResponse.ModifiedData.Input.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.ModifiedData.Input.Message.builder()
                                        .content("What the largest moon of jupiter?")
                                        .role("user")
                                        .build()
                                )
                                .build()
                        )
                        .output(
                            InteractionAnalyzeResponse.ModifiedData.Output.builder()
                                .addMessage(
                                    InteractionAnalyzeResponse.ModifiedData.Output.Message.builder()
                                        .content("The largest moon of Jupiter is Ganymede.")
                                        .role("assistant")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedInteractionAnalyzeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionAnalyzeResponse),
                jacksonTypeRef<InteractionAnalyzeResponse>(),
            )

        assertThat(roundtrippedInteractionAnalyzeResponse).isEqualTo(interactionAnalyzeResponse)
    }
}
