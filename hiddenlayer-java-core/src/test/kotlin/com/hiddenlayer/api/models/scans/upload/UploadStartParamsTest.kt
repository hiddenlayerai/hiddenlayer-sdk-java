// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.scans.upload

import com.hiddenlayer.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadStartParamsTest {

    @Test
    fun create() {
        UploadStartParams.builder()
            .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
            .modelName("model_name")
            .modelVersion("model_version")
            .requestingEntity("requesting_entity")
            .locationAlias("location_alias")
            .origin("Hugging Face")
            .requestSource(UploadStartParams.RequestSource.HYBRID_UPLOAD)
            .build()
    }

    @Test
    fun headers() {
        val params =
            UploadStartParams.builder()
                .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                .modelName("model_name")
                .modelVersion("model_version")
                .requestingEntity("requesting_entity")
                .locationAlias("location_alias")
                .origin("Hugging Face")
                .requestSource(UploadStartParams.RequestSource.HYBRID_UPLOAD)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Correlation-Id", "6f22d397-6ca2-4359-8074-3318ab471fdf")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            UploadStartParams.builder()
                .modelName("model_name")
                .modelVersion("model_version")
                .requestingEntity("requesting_entity")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            UploadStartParams.builder()
                .xCorrelationId("6f22d397-6ca2-4359-8074-3318ab471fdf")
                .modelName("model_name")
                .modelVersion("model_version")
                .requestingEntity("requesting_entity")
                .locationAlias("location_alias")
                .origin("Hugging Face")
                .requestSource(UploadStartParams.RequestSource.HYBRID_UPLOAD)
                .build()

        val body = params._body()

        assertThat(body.modelName()).isEqualTo("model_name")
        assertThat(body.modelVersion()).isEqualTo("model_version")
        assertThat(body.requestingEntity()).isEqualTo("requesting_entity")
        assertThat(body.locationAlias()).contains("location_alias")
        assertThat(body.origin()).contains("Hugging Face")
        assertThat(body.requestSource()).contains(UploadStartParams.RequestSource.HYBRID_UPLOAD)
    }

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
