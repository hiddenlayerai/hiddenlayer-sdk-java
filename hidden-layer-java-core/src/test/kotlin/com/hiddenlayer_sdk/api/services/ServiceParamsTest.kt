// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services

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
import com.hiddenlayer_sdk.api.client.HiddenLayerClient
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val sensorService = client.sensors()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sensorService.create(
            SensorCreateParams.builder()
                .plaintextName("plaintext_name")
                .active(true)
                .adhoc(true)
                .tags(
                    SensorCreateParams.Tags.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .version(0L)
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
