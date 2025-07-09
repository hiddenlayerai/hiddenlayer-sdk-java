// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.services.blocking.scans

import com.hiddenlayer_sdk.api.TestServerExtension
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient
import com.hiddenlayer_sdk.api.models.scans.jobs.JobRequestParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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
