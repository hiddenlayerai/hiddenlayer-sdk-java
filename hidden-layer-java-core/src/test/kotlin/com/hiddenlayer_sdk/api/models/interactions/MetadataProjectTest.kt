// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetadataProjectTest {

    @Test
    fun create() {
        val metadataProject =
            MetadataProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        assertThat(metadataProject.projectAlias()).contains("project_alias")
        assertThat(metadataProject.projectId()).contains("project_id")
        assertThat(metadataProject.rulesetId()).contains("ruleset_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metadataProject =
            MetadataProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        val roundtrippedMetadataProject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metadataProject),
                jacksonTypeRef<MetadataProject>(),
            )

        assertThat(roundtrippedMetadataProject).isEqualTo(metadataProject)
    }
}
