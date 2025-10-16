// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.services.async.scans

import com.hiddenlayer.api.TestServerExtension
import com.hiddenlayer.api.client.okhttp.HiddenLayerOkHttpClientAsync
import com.hiddenlayer.api.models.scans.jobs.JobListParams
import com.hiddenlayer.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer.api.models.scans.jobs.JobRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            HiddenLayerOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobServiceAsync = client.scans().jobs()

        val jobFuture =
            jobServiceAsync.retrieve(
                JobRetrieveParams.builder()
                    .scanId("00000000-0000-0000-0000-000000000000")
                    .hasDetections(true)
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val job = jobFuture.get()
        job.validate()
    }

    @Disabled("Prism tests are disabled")
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
                    .addRequestSource(JobListParams.RequestSource.HYBRID_UPLOAD)
                    .scannerVersion("891.0.97194")
                    .severity(JobListParams.Severity.NOT_AVAILABLE)
                    .sort("-start_time")
                    .source(
                        JobListParams.Source.builder().eq(JobListParams.Source.Eq.ADHOC).build()
                    )
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addStatus("string")
                    .xCorrelationId("00000000-0000-0000-0000-000000000000")
                    .build()
            )

        val jobs = jobsFuture.get()
        jobs.validate()
    }

    @Disabled("Prism tests are disabled")
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
                            .requestingEntity("some-user@example.com")
                            .origin("Hugging Face")
                            .requestSource(JobRequestParams.Inventory.RequestSource.HYBRID_UPLOAD)
                            .requestedScanLocation("owner/repo")
                            .scanTarget(
                                JobRequestParams.Inventory.ScanTarget.builder()
                                    .fileLocation("https://huggingface.co/meta-llama/Llama-3.1-8B")
                                    .providerModel(
                                        JobRequestParams.Inventory.ScanTarget.ProviderModel
                                            .builder()
                                            .modelId("anthropic.claude-3-5-sonnet-20241022-v2:0")
                                            .provider(
                                                JobRequestParams.Inventory.ScanTarget.ProviderModel
                                                    .Provider
                                                    .AWS_BEDROCK
                                            )
                                            .modelArn(
                                                "arn:aws:bedrock:us-east-1:123456789012:provisioned-model/my-custom-model"
                                            )
                                            .build()
                                    )
                                    .build()
                            )
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
