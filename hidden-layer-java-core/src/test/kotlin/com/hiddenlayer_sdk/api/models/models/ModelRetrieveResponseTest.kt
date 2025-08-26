// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelRetrieveResponseTest {

    @Test
    fun create() {
        val modelRetrieveResponse =
            ModelRetrieveResponse.builder()
                .name("loan application")
                .source("azure")
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addVersion(
                    ModelRetrieveResponse.Version.builder()
                        .version("1")
                        .addDeployment(
                            ModelRetrieveResponse.Version.Deployment.builder()
                                .active(true)
                                .path("path")
                                .build()
                        )
                        .locations(
                            ModelRetrieveResponse.Version.Locations.builder()
                                .putAdditionalProperty("hl_s3", JsonValue.from("bar"))
                                .putAdditionalProperty("azure", JsonValue.from("bar"))
                                .build()
                        )
                        .modelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .multiFile(true)
                        .retrievable(true)
                        .tags(
                            ModelRetrieveResponse.Version.Tags.builder()
                                .putAdditionalProperty("env", JsonValue.from("bar"))
                                .putAdditionalProperty("owner", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(modelRetrieveResponse.name()).isEqualTo("loan application")
        assertThat(modelRetrieveResponse.source()).isEqualTo("azure")
        assertThat(modelRetrieveResponse.modelId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(modelRetrieveResponse.tenantId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(modelRetrieveResponse.versions().getOrNull())
            .containsExactly(
                ModelRetrieveResponse.Version.builder()
                    .version("1")
                    .addDeployment(
                        ModelRetrieveResponse.Version.Deployment.builder()
                            .active(true)
                            .path("path")
                            .build()
                    )
                    .locations(
                        ModelRetrieveResponse.Version.Locations.builder()
                            .putAdditionalProperty("hl_s3", JsonValue.from("bar"))
                            .putAdditionalProperty("azure", JsonValue.from("bar"))
                            .build()
                    )
                    .modelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .multiFile(true)
                    .retrievable(true)
                    .tags(
                        ModelRetrieveResponse.Version.Tags.builder()
                            .putAdditionalProperty("env", JsonValue.from("bar"))
                            .putAdditionalProperty("owner", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelRetrieveResponse =
            ModelRetrieveResponse.builder()
                .name("loan application")
                .source("azure")
                .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addVersion(
                    ModelRetrieveResponse.Version.builder()
                        .version("1")
                        .addDeployment(
                            ModelRetrieveResponse.Version.Deployment.builder()
                                .active(true)
                                .path("path")
                                .build()
                        )
                        .locations(
                            ModelRetrieveResponse.Version.Locations.builder()
                                .putAdditionalProperty("hl_s3", JsonValue.from("bar"))
                                .putAdditionalProperty("azure", JsonValue.from("bar"))
                                .build()
                        )
                        .modelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .multiFile(true)
                        .retrievable(true)
                        .tags(
                            ModelRetrieveResponse.Version.Tags.builder()
                                .putAdditionalProperty("env", JsonValue.from("bar"))
                                .putAdditionalProperty("owner", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedModelRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelRetrieveResponse),
                jacksonTypeRef<ModelRetrieveResponse>(),
            )

        assertThat(roundtrippedModelRetrieveResponse).isEqualTo(modelRetrieveResponse)
    }
}
