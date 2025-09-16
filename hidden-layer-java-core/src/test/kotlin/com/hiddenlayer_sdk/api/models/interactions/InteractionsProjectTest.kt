// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.interactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InteractionsProjectTest {

    @Test
    fun create() {
        val interactionsProject =
            InteractionsProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        assertThat(interactionsProject.projectAlias()).contains("project_alias")
        assertThat(interactionsProject.projectId()).contains("project_id")
        assertThat(interactionsProject.rulesetId()).contains("ruleset_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val interactionsProject =
            InteractionsProject.builder()
                .projectAlias("project_alias")
                .projectId("project_id")
                .rulesetId("ruleset_id")
                .build()

        val roundtrippedInteractionsProject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interactionsProject),
                jacksonTypeRef<InteractionsProject>(),
            )

        assertThat(roundtrippedInteractionsProject).isEqualTo(interactionsProject)
    }
}
