// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hiddenlayer_sdk.api.core.JsonValue
import com.hiddenlayer_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CardListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val cardListResponse =
            CardListResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    CardListResponse.Result.builder()
                        .addActiveVersion(0L)
                        .attackMonitoringThreatLevel(
                            CardListResponse.Result.AttackMonitoringThreatLevel.SAFE
                        )
                        .createdAt(0L)
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .modelScanThreatLevel(CardListResponse.Result.ModelScanThreatLevel.SAFE)
                        .plaintextName("Resnet-50")
                        .securityPosture(
                            CardListResponse.Result.SecurityPosture.builder()
                                .attackMonitoring(true)
                                .modelScan(true)
                                .build()
                        )
                        .source("azure:datascience-workspace")
                        .tags(
                            CardListResponse.Result.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .build()

        assertThat(cardListResponse.pageNumber()).isEqualTo(0L)
        assertThat(cardListResponse.pageSize()).isEqualTo(0L)
        assertThat(cardListResponse.results())
            .containsExactly(
                CardListResponse.Result.builder()
                    .addActiveVersion(0L)
                    .attackMonitoringThreatLevel(
                        CardListResponse.Result.AttackMonitoringThreatLevel.SAFE
                    )
                    .createdAt(0L)
                    .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .modelScanThreatLevel(CardListResponse.Result.ModelScanThreatLevel.SAFE)
                    .plaintextName("Resnet-50")
                    .securityPosture(
                        CardListResponse.Result.SecurityPosture.builder()
                            .attackMonitoring(true)
                            .modelScan(true)
                            .build()
                    )
                    .source("azure:datascience-workspace")
                    .tags(
                        CardListResponse.Result.Tags.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(cardListResponse.totalCount()).isEqualTo(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListResponse =
            CardListResponse.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .addResult(
                    CardListResponse.Result.builder()
                        .addActiveVersion(0L)
                        .attackMonitoringThreatLevel(
                            CardListResponse.Result.AttackMonitoringThreatLevel.SAFE
                        )
                        .createdAt(0L)
                        .modelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .modelScanThreatLevel(CardListResponse.Result.ModelScanThreatLevel.SAFE)
                        .plaintextName("Resnet-50")
                        .securityPosture(
                            CardListResponse.Result.SecurityPosture.builder()
                                .attackMonitoring(true)
                                .modelScan(true)
                                .build()
                        )
                        .source("azure:datascience-workspace")
                        .tags(
                            CardListResponse.Result.Tags.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .totalCount(0L)
                .build()

        val roundtrippedCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListResponse),
                jacksonTypeRef<CardListResponse>(),
            )

        assertThat(roundtrippedCardListResponse).isEqualTo(cardListResponse)
    }
}
