// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.promptanalyzer.PromptAnalyzerCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptAnalyzerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val promptAnalyzerService = client.promptAnalyzer()

        val promptAnalyzer =
            promptAnalyzerService.create(
                PromptAnalyzerCreateParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                    .xRequesterId("X-Requester-Id")
                    .prompt("Hello World")
                    .model("mistral-tiny")
                    .output("Hello, how can I help you today?")
                    .build()
            )

        promptAnalyzer.validate()
    }
}
