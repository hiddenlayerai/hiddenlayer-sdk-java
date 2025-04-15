// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.scans.upload

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UploadStartParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UploadStartParams.builder()
            .modelName("model_name")
            .modelVersion("model_version")
            .requestingEntity("requesting_entity")
            .locationAlias("location_alias")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UploadStartParams.builder()
                .modelName("model_name")
                .modelVersion("model_version")
                .requestingEntity("requesting_entity")
                .locationAlias("location_alias")
                .build()

        val body = params._body()

        assertThat(body.modelName()).isEqualTo("model_name")
        assertThat(body.modelVersion()).isEqualTo("model_version")
        assertThat(body.requestingEntity()).isEqualTo("requesting_entity")
        assertThat(body.locationAlias()).contains("location_alias")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UploadStartParams.builder()
                .modelName("model_name")
                .modelVersion("model_version")
                .requestingEntity("requesting_entity")
                .build()

        val body = params._body()

        assertThat(body.modelName()).isEqualTo("model_name")
        assertThat(body.modelVersion()).isEqualTo("model_version")
        assertThat(body.requestingEntity()).isEqualTo("requesting_entity")
    }
}
