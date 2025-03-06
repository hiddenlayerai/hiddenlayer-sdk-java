package com.hiddenlayer.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.UUID;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.io.TempDir;

import com.hiddenlayer.sdk.rest.models.ScanReportV3;
import com.hiddenlayer.sdk.rest.models.ScanReportV3.StatusEnum;

import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.ModelScanService;

@WireMockTest(httpPort = 8089)
@TestInstance(Lifecycle.PER_CLASS)
public class ModelScanServiceTests {

    // at the present time not actually a malicious pickle, just the contents of it
    public final String MaliciousPickle = "import os; os.system('env')";

    String sampleMaliciousReport;
    String sampleMaliciousQueryResponse;

    protected String GetJsonResource(String resourceName) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(resourceName)) {
            if (is == null) {
                return "";
            }
            try (InputStreamReader isr = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    protected InputStream GetResourceAsStream(String resourceName) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        return classLoader.getResourceAsStream(resourceName);
    }

    @BeforeAll
    public void setUp() {
        sampleMaliciousReport = GetJsonResource("sample_malicious_modscan_v3_report.json");
        sampleMaliciousQueryResponse = GetJsonResource("sample_malicious_modscan_v3_query_response.json");
    }

    @Test
    public void testScanStreamMalicious(WireMockRuntimeInfo wmRuntimeInfo) throws Exception {

        stubFor(post(urlEqualTo("/oauth2/token?grant_type=client_credentials"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"access_token\": \"an_access_token\"}")));

        stubFor(post(urlEqualTo("/scan/v3/upload"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"scan_id\": \"87654321-4321-4321-4321-210987654321\"}")));
        
        stubFor(post(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"upload_id\": \"11111111-1111-1111-1111-111111111111\", \"parts\": [{\"part_number\": 0, \"start_offset\": 0, \"end_offset\": 10, \"upload_url\": \"http://localhost:8089/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/0\"}, {\"part_number\": 1, \"start_offset\": 10, \"end_offset\": 20, \"upload_url\": \"http://localhost:8089/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/1\"}]}")));

        stubFor(put(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/0"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(put(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/1"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        // complete file upload
        stubFor(patch(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));
        // complete upload, starts scan
        stubFor(patch(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(get(urlEqualTo("/scan/v3/results/87654321-4321-4321-4321-210987654321"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(sampleMaliciousReport)));

        InputStream stream = GetResourceAsStream("malicious_model.pkl");
        Configuration config = new Configuration("test_key", "test_secret", "http://localhost:8089", "http://localhost:8089");
        ModelScanService modelScanService = new ModelScanService(config);
        ScanReportV3 report = modelScanService.scanStream(stream, "malicious_model.pkl", stream.available(), "test java SDK model", false);
        assertEquals("87654321-4321-4321-4321-210987654321", report.getScanId());
        assertEquals(StatusEnum.DONE, report.getStatus());
    }

    @Test
    public void testScanFolderMalicious(@TempDir Path tempDir, WireMockRuntimeInfo wmRuntimeInfo) throws Exception {
        File tempFile = tempDir.resolve("malicious.py").toFile();
        try {
            java.nio.file.Files.write(tempFile.toPath(), MaliciousPickle.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        stubFor(post(urlEqualTo("/oauth2/token?grant_type=client_credentials"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"access_token\": \"an_access_token\"}")));

        stubFor(post(urlEqualTo("/scan/v3/upload"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"scan_id\": \"87654321-4321-4321-4321-210987654321\"}")));
        
        stubFor(post(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"upload_id\": \"11111111-1111-1111-1111-111111111111\", \"parts\": [{\"part_number\": 0, \"start_offset\": 0, \"end_offset\": 10, \"upload_url\": \"http://localhost:8089/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/0\"}, {\"part_number\": 1, \"start_offset\": 10, \"end_offset\": 20, \"upload_url\": \"http://localhost:8089/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/1\"}]}")));

        stubFor(put(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/0"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(put(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111/part/1"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        // complete file upload
        stubFor(patch(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321/file/11111111-1111-1111-1111-111111111111"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));
        // complete upload, starts scan
        stubFor(patch(urlEqualTo("/scan/v3/upload/87654321-4321-4321-4321-210987654321"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(get(urlEqualTo("/scan/v3/results/87654321-4321-4321-4321-210987654321"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(sampleMaliciousReport)));

        Configuration config = new Configuration("test_key", "test_secret", "http://localhost:8089", "http://localhost:8089");
        ModelScanService modelScanService = new ModelScanService(config);
        modelScanService.scanFolder(tempDir.toString(), "test java SDK folder model", false);
    }

}