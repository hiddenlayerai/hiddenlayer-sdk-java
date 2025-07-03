// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResultServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        val scanReport =
            resultService.retrieve(
                ResultRetrieveParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .hasDetections(true)
                    .build()
            )

        scanReport.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultService = client.scans().results()

        val results =
            resultService.list(
                ResultListParams.builder()
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .detectionCategory("detection_category")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latestPerModelVersionOnly(true)
                    .limit(1L)
                    .addModelId("string")
                    .modelName(
                        ResultListParams.ModelName.builder().contains("contains").eq("eq").build()
                    )
                    .addModelVersionId("string")
                    .offset(0L)
                    .scannerVersion("scanner_version")
                    .addSeverity("string")
                    .sort("sort")
                    .source(
                        ResultListParams.Source.builder()
                            .eq(ResultListParams.Source.Eq.ADHOC)
                            .build()
                    )
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addStatus("string")
                    .build()
            )

        results.validate()
    }
}
