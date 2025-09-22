// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InteractionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun analyze() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val interactionService = client.interactions()

        val response =
            interactionService.analyze(
                InteractionAnalyzeParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .metadata(
                        InteractionAnalyzeParams.Metadata.builder()
                            .model("gpt-5")
                            .requesterId("user-1234")
                            .provider("openai")
                            .build()
                    )
                    .input(
                        InteractionAnalyzeParams.Input.builder()
                            .addMessage(
                                InteractionAnalyzeParams.Input.Message.builder()
                                    .content("What the largest moon of jupiter?")
                                    .role("user")
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        InteractionAnalyzeParams.Output.builder()
                            .addMessage(
                                InteractionAnalyzeParams.Output.Message.builder()
                                    .content("The largest moon of Jupiter is Ganymede.")
                                    .role("assistant")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
