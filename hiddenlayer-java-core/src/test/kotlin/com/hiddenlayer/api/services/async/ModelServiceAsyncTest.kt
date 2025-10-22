// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.models.ModelDeleteParams
import com.hiddenlayer.api.models.models.ModelRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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
                    .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                    .build()
            )

        val model = modelFuture.get()
        model.validate()
    }

    @Disabled("Prism tests are disabled")
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
                    .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                    .build()
            )

        val response = future.get()
    }
}
