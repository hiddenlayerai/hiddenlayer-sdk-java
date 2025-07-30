// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.promptanalyzer

import com.hiddenlayer_sdk.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptAnalyzerCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-LLM-Block-Guardrail-Detection", "true")
                    .put("X-LLM-Block-Input-Code-Detection", "true")
                    .put("X-LLM-Block-Input-DOS-Detection", "true")
                    .put("X-LLM-Block-Input-PII", "true")
                    .put("X-LLM-Block-Output-Code-Detection", "true")
                    .put("X-LLM-Block-Output-PII", "true")
                    .put("X-LLM-Block-Prompt-Injection", "true")
                    .put("X-LLM-Block-Unsafe", "true")
                    .put("X-LLM-Block-Unsafe-Input", "true")
                    .put("X-LLM-Block-Unsafe-Output", "true")
                    .put("X-LLM-Entity-Type", "strict")
                    .put(
                        "X-LLM-Input-DOS-Detection-Threshold",
                        "X-LLM-Input-DOS-Detection-Threshold",
                    )
                    .put("X-LLM-Prompt-Injection-Scan-Type", "quick")
                    .put("X-LLM-Redact-Input-PII", "true")
                    .put("X-LLM-Redact-Output-PII", "true")
                    .put("X-LLM-Redact-Type", "entity")
                    .put("X-LLM-Skip-Guardrail-Detection", "true")
                    .put("X-LLM-Skip-Input-Code-Detection", "true")
                    .put("X-LLM-Skip-Input-DOS-Detection", "true")
                    .put("X-LLM-Skip-Input-PII-Detection", "true")
                    .put("X-LLM-Skip-Input-URL-Detection", "true")
                    .put("X-LLM-Skip-Output-Code-Detection", "true")
                    .put("X-LLM-Skip-Output-PII-Detection", "true")
                    .put("X-LLM-Skip-Output-URL-Detection", "true")
                    .put("X-LLM-Skip-Prompt-Injection-Detection", "true")
                    .put("X-Requester-Id", "X-Requester-Id")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PromptAnalyzerCreateParams.builder().prompt("Hello World").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Hello World")
        assertThat(body.model()).contains("mistral-tiny")
        assertThat(body.output()).contains("Hello, how can I help you today?")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PromptAnalyzerCreateParams.builder().prompt("Hello World").build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("Hello World")
    }
}
