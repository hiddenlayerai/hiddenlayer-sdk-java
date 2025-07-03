// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RegionTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val region =
            Region.builder()
                .byteLength(0L)
                .byteOffset(-1L)
                .charLength(0L)
                .charOffset(-1L)
                .endColumn(1L)
                .endLine(1L)
                .message(
                    Message.builder()
                        .id("id")
                        .addArgument("string")
                        .markdown("markdown")
                        .properties(PropertyBag.builder().addTag("string").build())
                        .text("text")
                        .build()
                )
                .properties(PropertyBag.builder().addTag("string").build())
                .snippet(
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
                )
                .sourceLanguage("sourceLanguage")
                .startColumn(1L)
                .startLine(1L)
                .build()

        assertThat(region.byteLength()).contains(0L)
        assertThat(region.byteOffset()).contains(-1L)
        assertThat(region.charLength()).contains(0L)
        assertThat(region.charOffset()).contains(-1L)
        assertThat(region.endColumn()).contains(1L)
        assertThat(region.endLine()).contains(1L)
        assertThat(region.message())
            .contains(
                Message.builder()
                    .id("id")
                    .addArgument("string")
                    .markdown("markdown")
                    .properties(PropertyBag.builder().addTag("string").build())
                    .text("text")
                    .build()
            )
        assertThat(region.properties()).contains(PropertyBag.builder().addTag("string").build())
        assertThat(region.snippet())
            .contains(
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
            )
        assertThat(region.sourceLanguage()).contains("sourceLanguage")
        assertThat(region.startColumn()).contains(1L)
        assertThat(region.startLine()).contains(1L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val region =
            Region.builder()
                .byteLength(0L)
                .byteOffset(-1L)
                .charLength(0L)
                .charOffset(-1L)
                .endColumn(1L)
                .endLine(1L)
                .message(
                    Message.builder()
                        .id("id")
                        .addArgument("string")
                        .markdown("markdown")
                        .properties(PropertyBag.builder().addTag("string").build())
                        .text("text")
                        .build()
                )
                .properties(PropertyBag.builder().addTag("string").build())
                .snippet(
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
                )
                .sourceLanguage("sourceLanguage")
                .startColumn(1L)
                .startLine(1L)
                .build()

        val roundtrippedRegion =
            jsonMapper.readValue(jsonMapper.writeValueAsString(region), jacksonTypeRef<Region>())

        assertThat(roundtrippedRegion).isEqualTo(region)
    }
}
