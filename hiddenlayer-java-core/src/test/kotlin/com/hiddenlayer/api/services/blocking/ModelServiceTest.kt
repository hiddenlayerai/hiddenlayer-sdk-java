// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking

import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ModelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val modelService = client.models()

        val model = modelService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        model.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HiddenLayerOkHttpClient.builder().bearerToken("My Bearer Token").build()
        val modelService = client.models()

        modelService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
