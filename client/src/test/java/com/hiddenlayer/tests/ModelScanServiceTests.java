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

        stubFor(post(urlEqualTo("/api/v2/sensors/create")).withRequestBody(equalToJson("{\"plaintext_name\": \"test java SDK model\", \"active\": true, \"tags\": { }, \"adhoc\": true}"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"sensor_id\": \"12345678-1234-1234-1234-123456789012\"}")));
        
        stubFor(post(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/begin"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"upload_id\": \"5678\", \"parts\": [{\"part_number\": 0, \"start_offset\": 0, \"end_offset\": 10, \"upload_url\": \"http://localhost:8089/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/0\"}, {\"part_number\": 1, \"start_offset\": 10, \"end_offset\": 20, \"upload_url\": \"http://localhost:8089/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/1\"}]}")));

        stubFor(put(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/0"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(put(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/1"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(post(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/complete"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(post(urlEqualTo("/api/v2/submit/sensors/12345678-1234-1234-1234-123456789012/scan"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(get(urlEqualTo("/scan/v3/results?model_version_ids=12345678-1234-1234-1234-123456789012&latest_per_model_version_only=true"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(sampleMaliciousQueryResponse)));

        stubFor(get(urlEqualTo("/scan/v3/results/87654321-4321-4321-4321-210987654321"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(sampleMaliciousReport)));

        InputStream stream = GetResourceAsStream("malicious_model.pkl");
        Configuration config = new Configuration("test_key", "test_secret", "http://localhost:8089", "http://localhost:8089");
        ModelScanService modelScanService = new ModelScanService(config);
        ScanReportV3 report = modelScanService.scanStream(stream, stream.available(), "test java SDK model", false);
        assertEquals(report.getScanId(), "87654321-4321-4321-4321-210987654321");
        assertEquals(report.getStatus(), StatusEnum.DONE);
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

        stubFor(post(urlEqualTo("/api/v2/sensors/create")).withRequestBody(equalToJson("{\"plaintext_name\": \"test java SDK folder model\", \"active\": true, \"tags\": { }, \"adhoc\": true}"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"sensor_id\": \"12345678-1234-1234-1234-123456789012\"}")));
        
        stubFor(post(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/begin"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"upload_id\": \"5678\", \"parts\": [{\"part_number\": 0, \"start_offset\": 0, \"end_offset\": 10, \"upload_url\": \"http://localhost:8089/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/0\"}, {\"part_number\": 1, \"start_offset\": 10, \"end_offset\": 20, \"upload_url\": \"http://localhost:8089/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/1\"}]}")));

        stubFor(put(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/0"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(put(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/part/1"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")));

        stubFor(post(urlEqualTo("/api/v2/sensors/12345678-1234-1234-1234-123456789012/upload/5678/complete"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(post(urlEqualTo("/api/v2/submit/sensors/12345678-1234-1234-1234-123456789012/scan"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody("{\"status\": \"complete\"}")));

        stubFor(get(urlEqualTo("/scan/v3/results?model_version_ids=12345678-1234-1234-1234-123456789012&latest_per_model_version_only=true"))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(sampleMaliciousQueryResponse)));

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