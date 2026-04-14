// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InteractionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun analyze() {
        val client = HiddenLayerOkHttpClientAsync.builder().bearerToken("My Bearer Token").build()
        val interactionServiceAsync = client.interactions()

        val responseFuture =
            interactionServiceAsync.analyze(
                InteractionAnalyzeParams.builder()
                    .hlProjectId("internal-search-chatbot")
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

        val response = responseFuture.get()
        response.validate()
    }
}
