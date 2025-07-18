// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.models.models.ModelCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelServiceAsync = client.models()

        val modelFuture =
            modelServiceAsync.create(
                ModelCreateParams.builder()
                    .addBody(
                        ModelCreateParams.Body.builder()
                            .name("loan application")
                            .source("azure")
                            .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addVersion(
                                ModelCreateParams.Body.Version.builder()
                                    .version("1")
                                    .addDeployment(
                                        ModelCreateParams.Body.Version.Deployment.builder()
                                            .active(true)
                                            .path("path")
                                            .build()
                                    )
                                    .locations(
                                        ModelCreateParams.Body.Version.Locations.builder()
                                            .putAdditionalProperty("hl_s3", JsonValue.from("bar"))
                                            .putAdditionalProperty("azure", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .modelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .multiFile(true)
                                    .retrievable(true)
                                    .tags(
                                        ModelCreateParams.Body.Version.Tags.builder()
                                            .putAdditionalProperty("env", JsonValue.from("bar"))
                                            .putAdditionalProperty("owner", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val model = modelFuture.get()
        model.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val modelServiceAsync = client.models()

        val modelFuture = modelServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

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

        val future = modelServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
