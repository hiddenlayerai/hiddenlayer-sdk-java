// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.models.scans.jobs.ScanJob
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hiddenlayer-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()

        assertThat(client).isNotNull()
        assertThat(client.models()).isNotNull()
        assertThat(client.evaluations()).isNotNull()
        assertThat(client.promptAnalyzer()).isNotNull()
        assertThat(client.interactions()).isNotNull()
        assertThat(client.sensors()).isNotNull()
        assertThat(client.scans()).isNotNull()
    }

    @Test
    fun scanJobRoundtrip() {
        val jsonMapper = jsonMapper()
        val scanJob =
            ScanJob.builder()
                .inventory(
                    ScanJob.Inventory.builder()
                        .modelName("keras-tf-2025-05-27")
                        .modelVersion("1.0.0")
                        .requestingEntity("requesting_entity")
                        .origin("Hugging Face")
                        .requestSource(ScanJob.Inventory.RequestSource.HYBRID_UPLOAD)
                        .requestedScanLocation("/files-to-scan")
                        .scanTarget(
                            ScanJob.Inventory.ScanTarget.builder()
                                .assetRegion("us-east-1")
                                .deepScan(
                                    ScanJob.Inventory.ScanTarget.DeepScan.builder()
                                        .fileLocation(
                                            "https://huggingface.co/meta-llama/Llama-3.1-8B"
                                        )
                                        .addFile(
                                            ScanJob.Inventory.ScanTarget.DeepScan.File.builder()
                                                .fileLocation(
                                                    "https://huggingface.co/meta-llama/Llama-3.1-8B/resolve/main/config.json"
                                                )
                                                .fileNameAlias("model-config.json")
                                                .build()
                                        )
                                        .build()
                                )
                                .providerDetails(
                                    ScanJob.Inventory.ScanTarget.ProviderDetails.builder()
                                        .provider(
                                            ScanJob.Inventory.ScanTarget.ProviderDetails.Provider
                                                .AWS_BEDROCK
                                        )
                                        .providerModelId(
                                            "anthropic.claude-3-5-sonnet-20241022-v2:0"
                                        )
                                        .country("US")
                                        .modelArn(
                                            "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .scanId("00000000-0000-0000-0000-000000000000")
                .status(ScanJob.Status.PENDING)
                .build()

        val roundtrippedScanJob =
            jsonMapper.readValue(jsonMapper.writeValueAsString(scanJob), jacksonTypeRef<ScanJob>())

        assertThat(roundtrippedScanJob).isEqualTo(scanJob)
    }
}
