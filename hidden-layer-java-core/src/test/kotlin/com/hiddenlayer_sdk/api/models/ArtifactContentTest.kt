// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ArtifactContentTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val artifactContent =
            ArtifactContent.builder()
                .binary("binary")
                .properties(PropertyBag.builder().addTag("string").build())
                .rendered(
                    MultiformatMessageString.builder()
                        .text("text")
                        .markdown("markdown")
                        .properties(PropertyBag.builder().addTag("string").build())
                        .build()
                )
                .text("text")
                .build()

        assertThat(artifactContent.binary()).contains("binary")
        assertThat(artifactContent.properties())
            .contains(PropertyBag.builder().addTag("string").build())
        assertThat(artifactContent.rendered())
            .contains(
                MultiformatMessageString.builder()
                    .text("text")
                    .markdown("markdown")
                    .properties(PropertyBag.builder().addTag("string").build())
                    .build()
            )
        assertThat(artifactContent.text()).contains("text")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val artifactContent =
            ArtifactContent.builder()
                .binary("binary")
                .properties(PropertyBag.builder().addTag("string").build())
                .rendered(
                    MultiformatMessageString.builder()
                        .text("text")
                        .markdown("markdown")
                        .properties(PropertyBag.builder().addTag("string").build())
                        .build()
                )
                .text("text")
                .build()

        val roundtrippedArtifactContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(artifactContent),
                jacksonTypeRef<ArtifactContent>(),
            )

        assertThat(roundtrippedArtifactContent).isEqualTo(artifactContent)
    }
}
