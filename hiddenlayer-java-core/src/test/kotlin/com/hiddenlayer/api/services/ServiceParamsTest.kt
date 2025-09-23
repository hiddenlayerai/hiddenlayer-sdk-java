// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.models.interactions.InteractionAnalyzeParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: HiddenLayerClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .bearerToken("My Bearer Token")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun analyze() {
        val interactionService = client.interactions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
