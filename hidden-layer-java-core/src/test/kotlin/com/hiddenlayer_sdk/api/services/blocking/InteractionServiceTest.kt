// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer_sdk.api.models.interactions.InteractionsInput
import com.hiddenlayer_sdk.api.models.interactions.InteractionsOutput
import com.hiddenlayer_sdk.api.models.interactions.InteractionsTextContent
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
                        InteractionsInput.builder()
                            .addMessage(
                                InteractionsTextContent.builder()
                                    .content("content")
                                    .role("role")
                                    .build()
                            )
                            .build()
                    )
                    .output(
                        InteractionsOutput.builder()
                            .addMessage(
                                InteractionsTextContent.builder()
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
