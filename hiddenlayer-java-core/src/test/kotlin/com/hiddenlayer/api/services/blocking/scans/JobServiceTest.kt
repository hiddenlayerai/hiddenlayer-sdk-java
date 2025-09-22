// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.blocking.scans

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer.api.models.scans.jobs.JobListParams
import com.hiddenlayer.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer.api.models.scans.jobs.JobRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobService = client.scans().jobs()

        val scanReport =
            jobService.retrieve(
                JobRetrieveParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .hasDetections(true)
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        scanReport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobService = client.scans().jobs()

        val jobs =
            jobService.list(
                JobListParams.builder()
                    .addComplianceStatus(JobListParams.ComplianceStatus.COMPLIANT)
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
                    .addRequestSource(JobListParams.RequestSource.API_UPLOAD)
                    .scannerVersion("891.0.97194")
                    .addSeverity("string")
                    .sort("-start_time")
                    .source(
                        JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build()
                    )
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addStatus("string")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        jobs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun request() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobService = client.scans().jobs()

        val scanJob =
            jobService.request(
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

        scanJob.validate()
    }
}
