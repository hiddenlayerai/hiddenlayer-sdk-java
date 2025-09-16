// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsMetadataProjectTest {

    @Test
    fun create() {
        val interactionsMetadataProject =
            InteractionsMetadataProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        assertThat(interactionsMetadataProject.projectAlias()).contains("project_alias")
        assertThat(interactionsMetadataProject.projectId()).contains("project_id")
        assertThat(interactionsMetadataProject.rulesetId()).contains("ruleset_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsMetadataProject =
            InteractionsMetadataProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        val roundtrippedInteractionsMetadataProject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsMetadataProject),
                jacksonTypeRef<InteractionsMetadataProject>(),
            )

        assertThat(roundtrippedInteractionsMetadataProject).isEqualTo(interactionsMetadataProject)
    }
}
