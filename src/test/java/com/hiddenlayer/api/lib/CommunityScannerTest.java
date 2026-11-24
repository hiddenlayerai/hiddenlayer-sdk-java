package com.hiddenlayer.api.lib;

import static com.hiddenlayer.api.lib.ScanFixtures.FILES_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.SCAN_ID;
import static com.hiddenlayer.api.lib.ScanFixtures.SUMMARY_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.filesPage;
import static com.hiddenlayer.api.lib.ScanFixtures.summary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.hiddenlayer.api.AsyncHiddenLayerClient;
import com.hiddenlayer.api.AsyncHiddenLayerClientBuilder;
import com.hiddenlayer.api.HiddenLayerClient;
import com.hiddenlayer.api.HiddenLayerClientBuilder;
import com.hiddenlayer.api.core.HiddenLayerApiException;
import com.hiddenlayer.api.core.HiddenLayerException;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import com.hiddenlayer.api.types.Status;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class CommunityScannerTest {
    private static final String JOBS_PATH = "/scan/v3/jobs";

    private static final String REPOSITORY = "ScanMe/test-models";

    private FakeApi api;

    private HiddenLayerClient client;

    private AsyncHiddenLayerClient asyncClient;

    @BeforeEach
    void start() throws IOException {
        api = new FakeApi();
        client = new HiddenLayerClientBuilder()
                .token("test-token")
                .url(api.url())
                .maxRetries(0)
                .build();
        asyncClient = new AsyncHiddenLayerClientBuilder()
                .token("test-token")
                .url(api.url())
                .maxRetries(0)
                .build();
    }

    @AfterEach
    void stop() {
        asyncClient.close();
        client.close();
        api.close();
    }

    private static String scanJob(String scanIdField) {
        return "{" + scanIdField + "\"status\":\"pending\",\"inventory\":{\"model_name\":\"test-models\","
                + "\"model_version\":\"main\",\"requesting_entity\":\"API Upload\"}}";
    }

    private void scriptFinishedScan() {
        api.reply("POST", JOBS_PATH, 201, scanJob("\"scan_id\":\"" + SCAN_ID + "\","));
        api.reply("GET", SUMMARY_PATH, 200, summary("done"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "pytorch_model.bin"));
    }

    @Test
    void communityScanRequestsTheScanAndReturnsItsReport() {
        scriptFinishedScan();

        ScanReportOfRecordV3 report =
                client.communityScanner().communityScan("test-models", REPOSITORY, CommunityScanSource.HUGGING_FACE);

        assertEquals(Status.DONE, report.getStatus());
        String requested = api.received("POST", JOBS_PATH).get(0).bodyText();
        assertTrue(requested.contains("\"source\":\"HUGGING_FACE\""), requested);
        assertTrue(requested.contains("\"model_name\":\"test-models\""), requested);
        assertTrue(requested.contains("\"model_version\":\"main\""), requested);
        assertTrue(requested.contains("\"requested_scan_location\":\"" + REPOSITORY + "\""), requested);
        assertTrue(requested.contains("\"request_source\":\"API Upload\""), requested);
        assertTrue(requested.contains("\"requesting_entity\":\"API Upload\""), requested);
    }

    @Test
    void optionsCarryEveryFieldIntoTheRequest() {
        scriptFinishedScan();

        client.communityScanner()
                .communityScan(CommunityScanOptions.builder()
                        .modelName("test-models")
                        .modelPath("https://models.example/presigned/model.bin")
                        .modelSource(CommunityScanSource.AWS_PRESIGNED)
                        .modelVersion("2026-11")
                        .requestSource("Integration")
                        .origin("model-registry")
                        .waitForResults(false)
                        .build());

        String requested = api.received("POST", JOBS_PATH).get(0).bodyText();
        assertTrue(requested.contains("\"source\":\"AWS_PRESIGNED\""), requested);
        assertTrue(requested.contains("\"model_version\":\"2026-11\""), requested);
        assertTrue(requested.contains("\"request_source\":\"Integration\""), requested);
        assertTrue(requested.contains("\"origin\":\"model-registry\""), requested);
    }

    @Test
    void apiErrorFromTheScanRequestReachesTheCallerAsItself() {
        api.reply("POST", JOBS_PATH, 422, "{\"detail\":\"repository not found\"}");

        HiddenLayerApiException failure = assertThrows(HiddenLayerApiException.class, () -> client.communityScanner()
                .communityScan("test-models", "ScanMe/no-such-repository", CommunityScanSource.HUGGING_FACE));

        assertEquals(422, failure.statusCode());
    }

    @Test
    void scanRequestAnsweredWithoutAScanIdFails() {
        api.reply("POST", JOBS_PATH, 201, scanJob(""));

        HiddenLayerException failure = assertThrows(HiddenLayerException.class, () -> client.communityScanner()
                .communityScan("test-models", REPOSITORY, CommunityScanSource.HUGGING_FACE));

        assertEquals("Scan ID not returned from scan request", failure.getMessage());
    }

    @Test
    void asyncCommunityScanCompletesWithTheReport() throws Exception {
        scriptFinishedScan();

        ScanReportOfRecordV3 report = asyncClient
                .communityScanner()
                .communityScan("test-models", REPOSITORY, CommunityScanSource.HUGGING_FACE, "main", false)
                .get(10, TimeUnit.SECONDS);

        assertEquals(Status.DONE, report.getStatus());
        assertEquals(1, api.received("POST", JOBS_PATH).size());
    }

    @Test
    void asyncApiErrorCompletesTheFutureWithTheErrorItself() {
        api.reply("POST", JOBS_PATH, 422, "{\"detail\":\"repository not found\"}");

        ExecutionException failure = assertThrows(ExecutionException.class, () -> asyncClient
                .communityScanner()
                .communityScan("test-models", "ScanMe/no-such-repository", CommunityScanSource.HUGGING_FACE)
                .get(10, TimeUnit.SECONDS));

        assertEquals(422, ((HiddenLayerApiException) failure.getCause()).statusCode());
    }

    @Test
    void asyncCommunityScanFailsItsFutureWhenTheTokenExchangeIsRefused() {
        api.reply("POST", "/oauth2/token", 401, "{\"error\":\"invalid_client\"}");

        try (AsyncHiddenLayerClient refused = new AsyncHiddenLayerClientBuilder()
                .clientId("service-account")
                .clientSecret("8d1f6b2e4c")
                .url(api.url())
                .maxRetries(0)
                .build()) {
            CompletableFuture<ScanReportOfRecordV3> scan = refused.communityScanner()
                    .communityScan("test-models", REPOSITORY, CommunityScanSource.HUGGING_FACE);

            ExecutionException failure = assertThrows(ExecutionException.class, () -> scan.get(10, TimeUnit.SECONDS));
            assertEquals(401, ((HiddenLayerApiException) failure.getCause()).statusCode());
        }
        assertTrue(api.received("POST", JOBS_PATH).isEmpty());
    }
}
