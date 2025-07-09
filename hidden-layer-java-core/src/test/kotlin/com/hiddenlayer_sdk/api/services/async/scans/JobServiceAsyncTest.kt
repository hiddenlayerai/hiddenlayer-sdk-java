// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.async.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer_sdk.api.models.scans.jobs.JobListParams
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobServiceAsync = client.scans().jobs()

        val jobsFuture =
            jobServiceAsync.list(
                JobListParams.builder()
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .detectionCategory("detection_category")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latestPerModelVersionOnly(true)
                    .limit(1L)
                    .addModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .modelName(
                        JobListParams.ModelName.builder().contains("contains").eq("eq").build()
                    )
                    .addModelVersionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .offset(0L)
                    .scannerVersion("scanner_version")
                    .addSeverity("string")
                    .sort("sort")
                    .source(
                        JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build()
                    )
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addStatus("string")
                    .build()
            )

        val jobs = jobsFuture.get()
        jobs.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun request() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobServiceAsync = client.scans().jobs()

        val scanJobFuture =
            jobServiceAsync.request(
                JobRequestParams.builder()
                    .access(
                        JobRequestParams.Access.builder()
                            .source(JobRequestParams.Access.Source.HUGGING_FACE)
                            .build()
                    )
                    .inventory(
                        JobRequestParams.Inventory.builder()
                            .modelName("some-model")
                            .modelVersion("")
                            .requestedScanLocation("owner/repo")
                            .requestingEntity("some-user@example.com")
                            .origin("Hugging Face")
                            .requestSource(JobRequestParams.Inventory.RequestSource.API_UPLOAD)
                            .build()
                    )
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .status(JobRequestParams.Status.PENDING)
                    .build()
            )

        val scanJob = scanJobFuture.get()
        scanJob.validate()
    }
}
