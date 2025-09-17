// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import com.hiddenlayer.api.models.interactions.InteractionsInput
import com.hiddenlayer.api.models.interactions.InteractionsMetadata
import com.hiddenlayer.api.models.interactions.InteractionsOutput
import com.hiddenlayer.api.models.interactions.InteractionsTextContent
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InteractionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun analyze() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val interactionServiceAsync = client.interactions()

        val responseFuture =
            interactionServiceAsync.analyze(
                InteractionAnalyzeParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .metadata(
                        InteractionsMetadata.builder()
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

        val response = responseFuture.get()
        response.validate()
    }
}
