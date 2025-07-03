// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.scans.results.ResultListParams
import com.hiddenlayer_sdk.api.models.scans.results.ResultRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResultServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultServiceAsync = client.scans().results()

        val scanReportFuture =
            resultServiceAsync.retrieve(
                ResultRetrieveParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .hasDetections(true)
                    .build()
            )

        val scanReport = scanReportFuture.get()
        scanReport.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val resultServiceAsync = client.scans().results()

        val resultsFuture =
            resultServiceAsync.list(
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

        val results = resultsFuture.get()
        results.validate()
    }
}
