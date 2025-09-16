// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelService = client.models()

        val model = modelService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        model.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelService = client.models()

        modelService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
