// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.interactions.Input
import com.hiddenlayer_sdk.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer_sdk.api.models.interactions.Metadata
import com.hiddenlayer_sdk.api.models.interactions.Output
import com.hiddenlayer_sdk.api.models.interactions.TextContent
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
                        Metadata.builder()
                            .model("model")
                            .requesterId("requester_id")
                            .provider("provider")
                            .build()
                    )
                    .input(
                        Input.builder()
                            .addMessage(
                                TextContent.builder().content("content").role("role").build()
                            )
                            .build()
                    )
                    .output(
                        Output.builder()
                            .addMessage(
                                TextContent.builder().content("content").role("role").build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
