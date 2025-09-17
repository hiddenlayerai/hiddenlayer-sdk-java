// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.core.JsonValue
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.models.sensors.SensorCreateResponse
import java.time.OffsetDateTime
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
        assertThat(client.promptAnalyzer()).isNotNull()
        assertThat(client.interactions()).isNotNull()
        assertThat(client.sensors()).isNotNull()
        assertThat(client.scans()).isNotNull()
    }

    @Test
    fun sensorCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val sensorCreateResponse =
            SensorCreateResponse.builder()
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .plaintextName("plaintext_name")
                .sensorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tags(
                    SensorCreateResponse.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .adhoc(true)
                .version(0L)
                .build()

        val roundtrippedSensorCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sensorCreateResponse),
                jacksonTypeRef<SensorCreateResponse>(),
            )

        assertThat(roundtrippedSensorCreateResponse).isEqualTo(sensorCreateResponse)
    }
}
