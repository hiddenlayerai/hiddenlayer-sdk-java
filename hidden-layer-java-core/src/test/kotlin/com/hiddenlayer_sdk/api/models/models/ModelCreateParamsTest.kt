// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models

import com.hiddenlayer_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ModelCreateParams.builder()
                .addBody(
                    ModelCreateParams.Body.builder()
                        .name("loan application")
                        .source("azure")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                ModelCreateParams.Body.builder().name("loan application").source("azure").build()
            )
    }
}
