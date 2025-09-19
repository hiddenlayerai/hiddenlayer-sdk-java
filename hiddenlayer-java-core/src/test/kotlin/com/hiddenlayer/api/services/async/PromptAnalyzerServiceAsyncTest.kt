// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.promptanalyzer.PromptAnalyzerCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptAnalyzerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val promptAnalyzerServiceAsync = client.promptAnalyzer()

        val promptAnalyzerFuture =
            promptAnalyzerServiceAsync.create(
                PromptAnalyzerCreateParams.builder()
                    .hlProjectId("internal-search-chatbot")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .xRequesterId("X-Requester-Id")
                    .prompt("Hello World")
                    .model("mistral-tiny")
                    .output("Hello, how can I help you today?")
                    .build()
            )

        val promptAnalyzer = promptAnalyzerFuture.get()
        promptAnalyzer.validate()
    }
}
