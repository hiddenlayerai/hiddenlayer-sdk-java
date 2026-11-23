package com.hiddenlayer.api.lib;

import static com.hiddenlayer.api.lib.ScanFixtures.FILES_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.NOT_FOUND;
import static com.hiddenlayer.api.lib.ScanFixtures.SCAN_ID;
import static com.hiddenlayer.api.lib.ScanFixtures.SUMMARY_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.filesPage;
import static com.hiddenlayer.api.lib.ScanFixtures.immediate;
import static com.hiddenlayer.api.lib.ScanFixtures.summary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.hiddenlayer.api.AsyncHiddenLayerClient;
import com.hiddenlayer.api.AsyncHiddenLayerClientBuilder;
import com.hiddenlayer.api.HiddenLayerClient;
import com.hiddenlayer.api.HiddenLayerClientBuilder;
import com.hiddenlayer.api.core.HiddenLayerApiException;
import com.hiddenlayer.api.types.ScanFileResultV3;
import com.hiddenlayer.api.types.ScanFileResultWithComplianceV3;
import com.hiddenlayer.api.types.ScanHighestDetectionSeverityWithSafe;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;
import com.hiddenlayer.api.types.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

final class ScanUtilsTest {
    private FakeApi api;

    private HiddenLayerClient client;

    private AsyncHiddenLayerClient asyncClient;

    private ScheduledExecutorService executor;

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
        executor = Executors.newScheduledThreadPool(2);
    }

    @AfterEach
    void stop() {
        executor.shutdownNow();
        asyncClient.close();
        client.close();
        api.close();
    }

    private static List<String> locations(List<ScanFileResultWithComplianceV3> fileResults) {
        List<String> locations = new ArrayList<>();
        for (ScanFileResultWithComplianceV3 fileResult : fileResults) {
            locations.add(fileResult.getFileLocation());
        }
        return locations;
    }

    private static <T> T await(CompletableFuture<T> future) throws Exception {
        return future.get(10, TimeUnit.SECONDS);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    void blankNextCursorEndsPagination(String next) {
        api.reply("GET", FILES_PATH, 200, filesPage(next, "weights.bin"));

        List<ScanFileResultWithComplianceV3> collected = ScanUtils.collectFileResults(client, SCAN_ID, immediate());

        assertEquals(Collections.singletonList("weights.bin"), locations(collected));
        assertEquals(1, api.received("GET", FILES_PATH).size());
    }

    @Test
    void nonBlankNextCursorFetchesTheFollowingPage() {
        api.reply("GET", FILES_PATH, 200, filesPage("cursor-2", "weights.bin"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "tokenizer.pkl"));

        List<ScanFileResultWithComplianceV3> collected = ScanUtils.collectFileResults(client, SCAN_ID, immediate());

        assertEquals(Arrays.asList("weights.bin", "tokenizer.pkl"), locations(collected));
        List<FakeApi.Received> requests = api.received("GET", FILES_PATH);
        assertEquals(2, requests.size());
        assertEquals("page_size=100", requests.get(0).query);
        assertEquals("page_size=100&cursor=cursor-2", requests.get(1).query);
    }

    @Test
    void emptyPageEndsPaginationEvenWithACursor() {
        api.reply("GET", FILES_PATH, 200, filesPage("cursor-2"));

        assertTrue(ScanUtils.collectFileResults(client, SCAN_ID, immediate()).isEmpty());
        assertEquals(1, api.received("GET", FILES_PATH).size());
    }

    @Test
    void reportCarriesTheFileResultsAndTheDeprecatedSummaryFields() {
        api.reply("GET", SUMMARY_PATH, 200, summary("done"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "weights.bin", "tokenizer.pkl"));

        ScanReportOfRecordV3 report = ScanUtils.getScanResults(client, SCAN_ID, immediate());

        assertEquals(SCAN_ID, report.getScanId());
        assertEquals(Status.DONE, report.getStatus());
        assertEquals(2, report.getFileCount());
        assertEquals(1, report.getFilesWithDetectionsCount());
        assertEquals(1, report.getDetectionCount());
        assertEquals(
                ScanHighestDetectionSeverityWithSafe.HIGH, report.getSeverity().get());
        assertEquals(
                Collections.singletonList("Arbitrary Code Execution"),
                report.getDetectionCategories().get());
        List<ScanFileResultV3> fileResults = report.getFileResults().get();
        assertEquals(2, fileResults.size());
        assertEquals("tokenizer.pkl", fileResults.get(1).getFileLocation());
        assertEquals("pickle", fileResults.get(1).getDetails().getFileType());
    }

    @Test
    void getScanResultsRetriesAScanThatIsNotFoundYet() {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);
        api.reply("GET", SUMMARY_PATH, 200, summary("running"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "weights.bin"));

        ScanReportOfRecordV3 report = ScanUtils.getScanResults(client, SCAN_ID, immediate());

        assertEquals(Status.RUNNING, report.getStatus());
        assertEquals(3, api.received("GET", SUMMARY_PATH).size());
    }

    @Test
    void getScanResultsGivesUpAfterFiveAttempts() {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);

        HiddenLayerApiException failure = assertThrows(
                HiddenLayerApiException.class, () -> ScanUtils.getScanResults(client, SCAN_ID, immediate()));

        assertEquals(404, failure.statusCode());
        assertEquals(5, api.received("GET", SUMMARY_PATH).size());
    }

    @Test
    void getScanResultsDoesNotRetryOtherApiErrors() {
        api.reply("GET", SUMMARY_PATH, 403, "{\"detail\":\"forbidden\"}");

        HiddenLayerApiException failure = assertThrows(
                HiddenLayerApiException.class, () -> ScanUtils.getScanResults(client, SCAN_ID, immediate()));

        assertEquals(403, failure.statusCode());
        assertEquals(1, api.received("GET", SUMMARY_PATH).size());
    }

    @Test
    void waitForScanResultsPollsUntilTheScanFinishes() {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);
        api.reply("GET", SUMMARY_PATH, 200, summary("pending"));
        api.reply("GET", SUMMARY_PATH, 200, summary("running"));
        api.reply("GET", SUMMARY_PATH, 200, summary("done"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "weights.bin"));

        ScanReportOfRecordV3 report = ScanUtils.waitForScanResults(client, SCAN_ID, immediate());

        assertEquals(Status.DONE, report.getStatus());
        assertEquals(4, api.received("GET", SUMMARY_PATH).size());
        assertEquals(1, api.received("GET", FILES_PATH).size());
    }

    @Test
    void waitForScanResultsReturnsTheReportOfAFailedScan() {
        api.reply("GET", SUMMARY_PATH, 200, summary("failed"));
        api.reply("GET", FILES_PATH, 200, filesPage(""));

        assertEquals(
                Status.FAILED,
                ScanUtils.waitForScanResults(client, SCAN_ID, immediate()).getStatus());
    }

    @Test
    void waitForScanResultsDoesNotRetryOtherApiErrors() {
        api.reply("GET", SUMMARY_PATH, 403, "{\"detail\":\"forbidden\"}");

        HiddenLayerApiException failure = assertThrows(
                HiddenLayerApiException.class, () -> ScanUtils.waitForScanResults(client, SCAN_ID, immediate()));

        assertEquals(403, failure.statusCode());
    }

    @Test
    void asyncGetScanResultsRetriesThenReadsEveryPage() throws Exception {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);
        api.reply("GET", SUMMARY_PATH, 200, summary("done"));
        api.reply("GET", FILES_PATH, 200, filesPage("cursor-2", "weights.bin"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "tokenizer.pkl"));

        ScanReportOfRecordV3 report = await(ScanUtils.getScanResultsAsync(asyncClient, SCAN_ID, executor, immediate()));

        assertEquals(2, report.getFileResults().get().size());
        assertEquals(2, api.received("GET", SUMMARY_PATH).size());
        assertEquals(
                "page_size=100&cursor=cursor-2", api.received("GET", FILES_PATH).get(1).query);
    }

    @Test
    void asyncGetScanResultsGivesUpAfterFiveAttempts() {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);

        ExecutionException failure = assertThrows(
                ExecutionException.class,
                () -> await(ScanUtils.getScanResultsAsync(asyncClient, SCAN_ID, executor, immediate())));

        assertEquals(404, ((HiddenLayerApiException) failure.getCause()).statusCode());
        assertEquals(5, api.received("GET", SUMMARY_PATH).size());
    }

    @Test
    void asyncWaitForScanResultsPollsUntilTheScanFinishes() throws Exception {
        api.reply("GET", SUMMARY_PATH, 404, NOT_FOUND);
        api.reply("GET", SUMMARY_PATH, 200, summary("running"));
        api.reply("GET", SUMMARY_PATH, 200, summary("canceled"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "weights.bin"));

        ScanReportOfRecordV3 report =
                await(ScanUtils.waitForScanResultsAsync(asyncClient, SCAN_ID, executor, immediate()));

        assertEquals(Status.CANCELED, report.getStatus());
        assertEquals(3, api.received("GET", SUMMARY_PATH).size());
    }

    @Test
    void asyncFailureIsTheApiErrorItself() {
        api.reply("GET", SUMMARY_PATH, 403, "{\"detail\":\"forbidden\"}");

        ExecutionException failure = assertThrows(
                ExecutionException.class,
                () -> await(ScanUtils.waitForScanResultsAsync(asyncClient, SCAN_ID, executor, immediate())));

        assertEquals(403, ((HiddenLayerApiException) failure.getCause()).statusCode());
    }

    @Test
    void asyncWaitFailsRatherThanHangsOnceItsExecutorIsShutDown() {
        api.reply("GET", SUMMARY_PATH, 200, summary("running"));
        executor.shutdown();

        ExecutionException failure = assertThrows(
                ExecutionException.class,
                () -> await(ScanUtils.waitForScanResultsAsync(asyncClient, SCAN_ID, executor, immediate())));

        assertTrue(failure.getCause() instanceof RejectedExecutionException, String.valueOf(failure.getCause()));
    }

    @Test
    void pollDelayDoublesFromTwoHundredMillisecondsAndIsCappedAtThirtySeconds() {
        for (int attempt = 1; attempt <= 200; attempt++) {
            long delay = ScanPacing.DEFAULT.pollDelayMillis(attempt);
            long backoff = attempt < 9 ? 100L << attempt : 30_000;
            assertTrue(delay >= Math.min(backoff, 30_000), "attempt " + attempt + ": " + delay);
            assertTrue(delay <= 30_000, "attempt " + attempt + ": " + delay);
        }
        assertTrue(ScanPacing.DEFAULT.pollDelayMillis(1) < 1_200);
    }

    @Test
    void availabilityDelayGrowsByHalfASecondPerAttempt() {
        for (int attempt = 1; attempt < ScanUtils.MAX_AVAILABILITY_ATTEMPTS; attempt++) {
            long delay = ScanPacing.DEFAULT.availabilityDelayMillis(attempt);
            assertTrue(delay >= 500L * attempt && delay < 500L * attempt + 500, "attempt " + attempt + ": " + delay);
        }
    }

    @Test
    void unwrapFindsTheFailureUnderTheFuturesOwnWrappers() {
        IllegalStateException failure = new IllegalStateException("scan failed");

        assertSame(failure, ScanUtils.unwrap(new CompletionException(new ExecutionException(failure))));
        assertSame(failure, ScanUtils.unwrap(failure));
    }
}
