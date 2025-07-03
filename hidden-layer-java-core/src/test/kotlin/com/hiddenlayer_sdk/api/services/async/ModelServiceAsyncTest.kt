// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.models.ModelDeleteParams
import com.hiddenlayer_sdk.api.models.models.ModelRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelServiceAsync = client.models()

        val modelFuture =
            modelServiceAsync.retrieve(
                ModelRetrieveParams.builder()
                    .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val model = modelFuture.get()
        model.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun delete() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelServiceAsync = client.models()

        val future =
            modelServiceAsync.delete(
                ModelDeleteParams.builder()
                    .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val response = future.get()
    }
}
