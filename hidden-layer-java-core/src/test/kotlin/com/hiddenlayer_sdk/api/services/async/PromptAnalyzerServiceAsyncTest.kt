// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.promptanalyzer.PromptAnalyzerCreateParams
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
                    .xLlmBlockGuardrailDetection(true)
                    .xLlmBlockInputCodeDetection(true)
                    .xLlmBlockInputDosDetection(true)
                    .xLlmBlockInputPii(true)
                    .xLlmBlockOutputCodeDetection(true)
                    .xLlmBlockOutputPii(true)
                    .xLlmBlockPromptInjection(true)
                    .xLlmBlockUnsafe(true)
                    .xLlmBlockUnsafeInput(true)
                    .xLlmBlockUnsafeOutput(true)
                    .xLlmEntityType(PromptAnalyzerCreateParams.XLlmEntityType.STRICT)
                    .xLlmInputDosDetectionThreshold("X-LLM-Input-DOS-Detection-Threshold")
                    .xLlmPromptInjectionScanType(
                        PromptAnalyzerCreateParams.XLlmPromptInjectionScanType.QUICK
                    )
                    .xLlmRedactInputPii(true)
                    .xLlmRedactOutputPii(true)
                    .xLlmRedactType(PromptAnalyzerCreateParams.XLlmRedactType.ENTITY)
                    .xLlmSkipGuardrailDetection(true)
                    .xLlmSkipInputCodeDetection(true)
                    .xLlmSkipInputDosDetection(true)
                    .xLlmSkipInputPiiDetection(true)
                    .xLlmSkipInputUrlDetection(true)
                    .xLlmSkipOutputCodeDetection(true)
                    .xLlmSkipOutputPiiDetection(true)
                    .xLlmSkipOutputUrlDetection(true)
                    .xLlmSkipPromptInjectionDetection(true)
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
