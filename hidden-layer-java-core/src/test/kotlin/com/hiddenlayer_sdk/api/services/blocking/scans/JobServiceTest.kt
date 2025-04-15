// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import com.hiddenlayer_sdk.api.models.scans.jobs.ScanJob
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobService = client.scans().jobs()

        val scanJob = jobService.list()

        scanJob.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun request() {
        val client =
            HiddenLayerOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val jobService = client.scans().jobs()

        val scanReport =
            jobService.request(
                JobRequestParams.builder()
                    .scanJob(
                        ScanJob.builder()
                            .access(
                                ScanJob.Access.builder()
                                    .source(ScanJob.Access.Source.HUGGING_FACE)
                                    .build()
                            )
                            .inventory(
                                ScanJob.Inventory.builder()
                                    .modelName("some-model")
                                    .modelVersion("main")
                                    .requestedScanLocation("owner/repo")
                                    .requestingEntity("some-user@example.com")
                                    .build()
                            )
                            .scanId("00000000-0000-0000-0000-000000000000")
                            .status(ScanJob.Status.PENDING)
                            .build()
                    )
                    .build()
            )

        scanReport.validate()
    }
}
