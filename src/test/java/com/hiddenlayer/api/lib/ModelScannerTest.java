package com.hiddenlayer.api.lib;

import static com.hiddenlayer.api.lib.ScanFixtures.FILES_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.SCAN_ID;
import static com.hiddenlayer.api.lib.ScanFixtures.SUMMARY_PATH;
import static com.hiddenlayer.api.lib.ScanFixtures.filesPage;
import static com.hiddenlayer.api.lib.ScanFixtures.summary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

final class ModelScannerTest {
    private static final String UPLOAD_PATH = "/scan/v3/upload";

    private static final String SCAN_UPLOAD_PATH = UPLOAD_PATH + "/" + SCAN_ID;

    private static final String ADD_FILE_PATH = SCAN_UPLOAD_PATH + "/file";

    private static final String SIGNATURE = "X-Amz-Signature=3f9c1e7ab2d4";

    @TempDir
    Path folder;

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

    private Path write(String name, String content) throws IOException {
        Path file = folder.resolve(name);
        Files.createDirectories(file.getParent());
        Files.write(file, content.getBytes(StandardCharsets.UTF_8));
        return file;
    }

    /** Scripts a whole scan of files whose uploads are each split into two parts, at byte 4. */
    private void scriptScan(int fileSize) {
        api.reply("POST", UPLOAD_PATH, 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply(
                "POST",
                ADD_FILE_PATH,
                200,
                "{\"upload_id\":\"upload-1\",\"parts\":["
                        + "{\"part_number\":1,\"start_offset\":0,\"end_offset\":4,\"upload_url\":\"" + api.url()
                        + "/presigned/part-1?" + SIGNATURE + "\"},"
                        + "{\"part_number\":2,\"start_offset\":4,\"end_offset\":" + fileSize
                        + ",\"upload_url\":\"" + api.url() + "/presigned/part-2?" + SIGNATURE + "\"}]}");
        api.reply("PUT", "/presigned/part-1", 200, "");
        api.reply("PUT", "/presigned/part-2", 200, "");
        api.reply("PATCH", ADD_FILE_PATH + "/upload-1", 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply("PATCH", SCAN_UPLOAD_PATH, 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply("GET", SUMMARY_PATH, 200, summary("done"));
        api.reply("GET", FILES_PATH, 200, filesPage("", "weights.bin"));
    }

    private List<String> uploadedFileNames() {
        List<String> names = new ArrayList<>();
        for (FakeApi.Received request : api.received("POST", ADD_FILE_PATH)) {
            names.add(request.header("file-name"));
        }
        Collections.sort(names);
        return names;
    }

    @Test
    void scanFileUploadsTheFileInItsPartsAndReturnsTheReport() throws IOException {
        Path model = write("weights.bin", "0123456789");
        scriptScan(10);

        ScanReportOfRecordV3 report = client.modelScanner().scanFile("fraud-detector", model.toString(), "7");

        assertEquals(Status.DONE, report.getStatus());
        assertEquals(1, report.getFileResults().get().size());
        String started = api.received("POST", UPLOAD_PATH).get(0).bodyText();
        assertTrue(started.contains("\"model_name\":\"fraud-detector\""), started);
        assertTrue(started.contains("\"model_version\":\"7\""), started);
        assertTrue(started.contains("\"requesting_entity\":\"hiddenlayer-java-sdk\""), started);
        assertTrue(started.contains("\"request_source\":\"API Upload\""), started);
        FakeApi.Received added = api.received("POST", ADD_FILE_PATH).get(0);
        assertEquals("10", added.header("file-content-length"));
        assertEquals("weights.bin", added.header("file-name"));
        assertEquals("0123", api.received("PUT", "/presigned/part-1").get(0).bodyText());
        assertEquals("456789", api.received("PUT", "/presigned/part-2").get(0).bodyText());
        assertEquals(1, api.received("PATCH", ADD_FILE_PATH + "/upload-1").size());
        assertEquals(1, api.received("PATCH", SCAN_UPLOAD_PATH).size());
    }

    @Test
    void partUploadsCarryNoHiddenLayerCredentials() throws IOException {
        Path model = write("weights.bin", "0123456789");
        scriptScan(10);

        client.modelScanner().scanFile("fraud-detector", model.toString());

        assertNull(api.received("PUT", "/presigned/part-1").get(0).header("Authorization"));
    }

    @Test
    void scanFileRejectsAPathThatDoesNotExistBeforeCallingTheApi() {
        IllegalArgumentException failure = assertThrows(IllegalArgumentException.class, () -> client.modelScanner()
                .scanFile("fraud-detector", folder.resolve("missing.bin").toString()));

        assertTrue(failure.getMessage().startsWith("File does not exist: "), failure.getMessage());
        assertTrue(api.received().isEmpty());
    }

    @Test
    void scanFileRejectsAFolder() {
        IllegalArgumentException failure = assertThrows(IllegalArgumentException.class, () -> client.modelScanner()
                .scanFile("fraud-detector", folder.toString()));

        assertTrue(failure.getMessage().startsWith("Path is not a file: "), failure.getMessage());
    }

    @Test
    void failedPartUploadFailsTheScanWithoutLeakingThePresignedUrl() throws IOException {
        Path model = write("weights.bin", "0123456789");
        api.reply("POST", UPLOAD_PATH, 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply(
                "POST",
                ADD_FILE_PATH,
                200,
                "{\"upload_id\":\"upload-1\",\"parts\":[{\"part_number\":1,\"start_offset\":0,"
                        + "\"end_offset\":10,\"upload_url\":\"" + api.url() + "/presigned/part-1?" + SIGNATURE
                        + "\"}]}");
        api.reply("PUT", "/presigned/part-1", 403, "");

        HiddenLayerException failure = assertThrows(
                HiddenLayerException.class, () -> client.modelScanner().scanFile("fraud-detector", model.toString()));

        assertTrue(failure.getMessage().startsWith("File scan failed: Failed to upload part to "));
        assertTrue(failure.getMessage().endsWith("/presigned/part-1"), failure.getMessage());
        assertFalse(String.valueOf(failure.getCause()).contains(SIGNATURE));
        assertEquals(
                "Failed to upload part: HTTP 403", failure.getCause().getCause().getMessage());
        assertTrue(api.received("PATCH", SCAN_UPLOAD_PATH).isEmpty());
    }

    @Test
    void apiErrorWhenStartingTheUploadReachesTheCallerAsItself() throws IOException {
        Path model = write("weights.bin", "0123456789");
        api.reply("POST", UPLOAD_PATH, 422, "{\"detail\":\"model_name is too long\"}");

        HiddenLayerApiException failure = assertThrows(HiddenLayerApiException.class, () -> client.modelScanner()
                .scanFile("fraud-detector", model.toString()));

        assertEquals(422, failure.statusCode());
    }

    @Test
    void apiErrorAfterTheUploadStartedIsWrappedWithItsCause() throws IOException {
        Path model = write("weights.bin", "0123456789");
        api.reply("POST", UPLOAD_PATH, 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply("POST", ADD_FILE_PATH, 400, "{\"detail\":\"file-name is required\"}");

        HiddenLayerException failure = assertThrows(
                HiddenLayerException.class, () -> client.modelScanner().scanFile("fraud-detector", model.toString()));

        assertTrue(failure.getMessage().startsWith("File scan failed: "), failure.getMessage());
        assertEquals(400, ((HiddenLayerApiException) failure.getCause()).statusCode());
    }

    @Test
    void scanFolderUploadsEveryFileThePatternsSelect() throws IOException {
        write("weights.bin", "0123456789");
        write("nested/tokenizer.bin", "abcdefghij");
        write("nested/notes.log", "0123456789");
        scriptScan(10);

        ScanReportOfRecordV3 report = client.modelScanner()
                .scanFolder(
                        "fraud-detector",
                        folder.toString(),
                        "7",
                        Collections.singletonList("**/*.bin"),
                        Collections.singletonList("**/nested/**"));

        assertEquals(Status.DONE, report.getStatus());
        assertEquals(Collections.singletonList("weights.bin"), uploadedFileNames());
        assertEquals(1, api.received("PATCH", SCAN_UPLOAD_PATH).size());
    }

    @Test
    void scanFolderWithNoPatternsUploadsEveryFile() throws IOException {
        write("weights.bin", "0123456789");
        write("nested/tokenizer.bin", "abcdefghij");
        scriptScan(10);

        client.modelScanner()
                .scanFolder(new ScanFolderOptions(
                        "fraud-detector",
                        folder.toString(),
                        "7",
                        Collections.<String>emptyList(),
                        Collections.<String>emptyList(),
                        true,
                        "API Upload",
                        ""));

        assertEquals(Arrays.asList("tokenizer.bin", "weights.bin"), uploadedFileNames());
    }

    @Test
    void scanFolderRejectsAFolderWithNothingLeftToScan() throws IOException {
        write("weights.bin", "0123456789");

        IllegalArgumentException failure = assertThrows(IllegalArgumentException.class, () -> client.modelScanner()
                .scanFolder("fraud-detector", folder.toString(), "7", Collections.singletonList("**/*.pt")));

        assertTrue(failure.getMessage().startsWith("No files found to scan in directory: "), failure.getMessage());
        assertTrue(api.received().isEmpty());
    }

    @Test
    void scanFolderRejectsAPathThatIsNotAFolder() throws IOException {
        Path model = write("weights.bin", "0123456789");

        assertTrue(assertThrows(IllegalArgumentException.class, () -> client.modelScanner()
                        .scanFolder("fraud-detector", model.toString()))
                .getMessage()
                .startsWith("Path is not a directory: "));
        assertTrue(assertThrows(IllegalArgumentException.class, () -> client.modelScanner()
                        .scanFolder("fraud-detector", folder.resolve("missing").toString()))
                .getMessage()
                .startsWith("Directory does not exist: "));
    }

    @Test
    void patternsMatchTheWholePathWithStarsStoppingAtSeparators() {
        assertTrue(ScanUploads.matchesPattern("models/weights.bin", "models/*.bin"));
        assertTrue(ScanUploads.matchesPattern("models/nested/weights.bin", "**/*.bin"));
        assertTrue(ScanUploads.matchesPattern("models/.git/config", "**/.git/**"));
        assertTrue(ScanUploads.matchesPattern("weights.b1n", "weights.b?n"));
        assertFalse(ScanUploads.matchesPattern("models/nested/weights.bin", "models/*.bin"));
        assertFalse(ScanUploads.matchesPattern("models/weightsxbin", "models/*.bin"));
    }

    @Test
    void fileTooLargeForTheGeneratedClientIsRefusedBeforeItIsAdded() {
        HiddenLayerException failure = assertThrows(
                HiddenLayerException.class,
                () -> ScanUploads.addRequest(folder.resolve("weights.bin"), Integer.MAX_VALUE + 1L));

        assertTrue(failure.getMessage().contains("2147483648 bytes"), failure.getMessage());
        assertEquals(
                Integer.MAX_VALUE,
                ScanUploads.addRequest(folder.resolve("weights.bin"), Integer.MAX_VALUE)
                        .getFileContentLength());
    }

    @Test
    void asyncScanFileUploadsTheFileInItsPartsAndCompletesWithTheReport() throws Exception {
        Path model = write("weights.bin", "0123456789");
        scriptScan(10);

        ScanReportOfRecordV3 report = asyncClient
                .modelScanner()
                .scanFile("fraud-detector", model.toString(), "7")
                .get(10, TimeUnit.SECONDS);

        assertEquals(Status.DONE, report.getStatus());
        assertEquals("0123", api.received("PUT", "/presigned/part-1").get(0).bodyText());
        assertEquals("456789", api.received("PUT", "/presigned/part-2").get(0).bodyText());
        assertEquals(1, api.received("PATCH", ADD_FILE_PATH + "/upload-1").size());
        assertEquals(1, api.received("PATCH", SCAN_UPLOAD_PATH).size());
    }

    @Test
    void asyncScanFolderUploadsEveryFile() throws Exception {
        write("weights.bin", "0123456789");
        write("nested/tokenizer.bin", "abcdefghij");
        scriptScan(10);

        asyncClient
                .modelScanner()
                .scanFolder(
                        "fraud-detector",
                        folder.toString(),
                        "7",
                        Collections.<String>emptyList(),
                        Collections.<String>emptyList())
                .get(10, TimeUnit.SECONDS);

        assertEquals(Arrays.asList("tokenizer.bin", "weights.bin"), uploadedFileNames());
        assertEquals(2, api.received("PATCH", ADD_FILE_PATH + "/upload-1").size());
        assertEquals(1, api.received("PATCH", SCAN_UPLOAD_PATH).size());
    }

    @Test
    void asyncScanFileFailsItsFutureForAPathThatDoesNotExist() {
        ExecutionException failure = assertThrows(ExecutionException.class, () -> asyncClient
                .modelScanner()
                .scanFile("fraud-detector", folder.resolve("missing.bin").toString())
                .get(10, TimeUnit.SECONDS));

        assertTrue(failure.getCause() instanceof IllegalArgumentException, String.valueOf(failure.getCause()));
        assertTrue(failure.getCause().getMessage().startsWith("File does not exist: "));
    }

    @Test
    void asyncApiErrorCompletesTheFutureWithTheErrorItself() throws IOException {
        Path model = write("weights.bin", "0123456789");
        api.reply("POST", UPLOAD_PATH, 200, "{\"scan_id\":\"" + SCAN_ID + "\"}");
        api.reply("POST", ADD_FILE_PATH, 400, "{\"detail\":\"file-name is required\"}");

        ExecutionException failure = assertThrows(ExecutionException.class, () -> asyncClient
                .modelScanner()
                .scanFile("fraud-detector", model.toString())
                .get(10, TimeUnit.SECONDS));

        assertEquals(400, ((HiddenLayerApiException) failure.getCause()).statusCode());
    }
}
