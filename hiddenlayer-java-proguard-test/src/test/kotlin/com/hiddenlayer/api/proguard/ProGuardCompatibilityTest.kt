// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hiddenlayer-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.models()).isNotNull()
        assertThat(client.promptAnalyzer()).isNotNull()
        assertThat(client.interactions()).isNotNull()
        assertThat(client.sensors()).isNotNull()
        assertThat(client.scans()).isNotNull()
    }

    @Test
    fun interactionAnalyzeResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val interactionAnalyzeResponse =
            InteractionAnalyzeResponse.builder()
                .addAnalysis(
                    InteractionAnalyzeResponse.Analysis.builder()
                        .id("id")
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
