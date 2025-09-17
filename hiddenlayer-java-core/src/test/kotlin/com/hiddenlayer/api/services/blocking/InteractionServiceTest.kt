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
                    .metadata(
                        InteractionAnalyzeParams.Metadata.builder()
                            .model("model")
                            .requesterId("requester_id")
                            .provider("provider")
                            .build()
                    )
                    .input(
                        InteractionAnalyzeParams.Input.builder()
                            .addMessage(
                                InteractionAnalyzeParams.Input.Message.builder()
                                    .content("content")
                                    .role("role")
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        InteractionAnalyzeParams.Output.builder()
                            .addMessage(
                                InteractionAnalyzeParams.Output.Message.builder()
                                    .content("content")
                                    .role("role")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
