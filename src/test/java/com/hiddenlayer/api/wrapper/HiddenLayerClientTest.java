package com.hiddenlayer.api.wrapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.hiddenlayer.api.AsyncHiddenLayerClient;
import com.hiddenlayer.api.AsyncHiddenLayerClientBuilder;
import com.hiddenlayer.api.HiddenLayerClient;
import com.hiddenlayer.api.HiddenLayerClientBuilder;
import com.hiddenlayer.api.core.ObjectMappers;
import com.hiddenlayer.api.lib.AsyncModelScanner;
import com.hiddenlayer.api.lib.BetaWarning;
import com.hiddenlayer.api.lib.ClientEnvironment;
import com.hiddenlayer.api.lib.FakeApi;
import com.hiddenlayer.api.lib.LogCapture;
import com.hiddenlayer.api.lib.ScanFixtures;
import com.hiddenlayer.api.lib.SdkIdentityInterceptor;
import com.hiddenlayer.api.types.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class HiddenLayerClientTest {
    private static final String TOKEN_PATH = "/oauth2/token";

    // The discard port: nothing listens there, so a request sent to it fails.
    private static final String UNREACHABLE_URL = "http://127.0.0.1:9";

    private FakeApi api;

    @BeforeEach
    void start() throws IOException {
        api = new FakeApi();
        api.reply("GET", ScanFixtures.SUMMARY_PATH, 200, ScanFixtures.summary("done"));
    }

    @AfterEach
    void stop() {
        api.close();
    }

    private FakeApi.Received summaryRequest() {
        return api.received("GET", ScanFixtures.SUMMARY_PATH).get(0);
    }

    /** Exposes the HTTP client a wrapper builder assembles, so a test can send a request the SDK has no method for. */
    private static final class HttpClientProbe extends HiddenLayerClientBuilder {
        OkHttpClient assembledHttpClient() {
            return buildClientOptions().httpClient();
        }
    }

    private static final class AsyncHttpClientProbe extends AsyncHiddenLayerClientBuilder {
        OkHttpClient assembledHttpClient() {
            return buildClientOptions().httpClient();
        }
    }

    /** A builder that reads one variable's value in place of the process environment. */
    private static final class BuilderWithVariable extends HiddenLayerClientBuilder {
        BuilderWithVariable(String name, String value) {
            super(new ClientEnvironment(variable -> variable.equals(name) ? value : null));
        }
    }

    private static final class AsyncBuilderWithVariable extends AsyncHiddenLayerClientBuilder {
        AsyncBuilderWithVariable(String name, String value) {
            super(new ClientEnvironment(variable -> variable.equals(name) ? value : null));
        }
    }

    @Test
    void sendsThePassedTokenAsABearerToken() {
        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .build()) {
            assertEquals(
                    Status.DONE,
                    client.scans()
                            .results()
                            .retrieveSummary(ScanFixtures.SCAN_ID)
                            .getStatus());
        }

        assertEquals("Bearer 3c5e0a9d7f", summaryRequest().header("Authorization"));
        assertTrue(api.received("POST", TOKEN_PATH).isEmpty());
    }

    @Test
    void passedTokenIsSentInPlaceOfPassedClientCredentials() {
        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .clientId("service-account")
                .clientSecret("8d1f6b2e4c")
                .token("3c5e0a9d7f")
                .url(api.url())
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
        }

        assertEquals("Bearer 3c5e0a9d7f", summaryRequest().header("Authorization"));
        assertTrue(api.received("POST", TOKEN_PATH).isEmpty());
    }

    @Test
    void exchangesPassedClientCredentialsForAnAccessTokenOnce() {
        api.reply(
                "POST",
                TOKEN_PATH,
                200,
                "{\"access_token\":\"issued-access-token\",\"token_type\":\"Bearer\",\"expires_in\":3600}");

        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .clientId("service-account")
                .clientSecret("8d1f6b2e4c")
                .url(api.url())
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
        }

        assertEquals(1, api.received("POST", TOKEN_PATH).size());
        String exchanged = api.received("POST", TOKEN_PATH).get(0).bodyText();
        assertTrue(exchanged.contains("grant_type=client_credentials"), exchanged);
        assertTrue(exchanged.contains("client_id=service-account"), exchanged);
        assertTrue(exchanged.contains("client_secret=8d1f6b2e4c"), exchanged);
        assertEquals("Bearer issued-access-token", summaryRequest().header("Authorization"));
    }

    @Test
    void namesTheSdkByItsMavenCoordinateOnTheWire() {
        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
        }

        FakeApi.Received request = summaryRequest();
        String version = request.header("X-Fern-SDK-Version");
        assertNotNull(version);
        assertEquals("com.hiddenlayer.api:hiddenlayer-java", request.header("X-Fern-SDK-Name"));
        assertEquals("com.hiddenlayer.api:hiddenlayer-java/" + version, request.header("User-Agent"));
    }

    @Test
    void keepsAUserAgentTheCallerSet() throws IOException {
        OkHttpClient http = new OkHttpClient.Builder()
                .addInterceptor(new SdkIdentityInterceptor())
                .build();
        Request request = new Request.Builder()
                .url(api.url() + ScanFixtures.SUMMARY_PATH)
                .header("X-Fern-SDK-Version", "3.0.0")
                .header("User-Agent", "model-registry-sync/1.4")
                .build();

        try (Response response = http.newCall(request).execute()) {
            assertEquals(200, response.code());
        }

        assertEquals("model-registry-sync/1.4", summaryRequest().header("User-Agent"));
        assertEquals("com.hiddenlayer.api:hiddenlayer-java", summaryRequest().header("X-Fern-SDK-Name"));
    }

    /**
     * The beta endpoint at {@code position} among those no other test calls. Each test takes its own, since a
     * warning is logged once per endpoint in a JVM.
     */
    private static JsonNode betaEndpointOnlyOneTestCalls(int position) throws IOException {
        int found = 0;
        try (InputStream resource = BetaWarning.class.getResourceAsStream("/com/hiddenlayer/api/beta-endpoints.json")) {
            for (JsonNode endpoint : ObjectMappers.JSON_MAPPER.readTree(resource)) {
                String pattern = endpoint.get("path_pattern").asText();
                boolean isCalledElsewhere = pattern.startsWith("/scan/") || pattern.startsWith("/oauth2/");
                if (!isCalledElsewhere && found++ == position) {
                    return endpoint;
                }
            }
        }
        return null;
    }

    @Test
    void warnsOnceForABetaEndpointCalledThroughTheClient() throws IOException {
        HttpClientProbe probe = new HttpClientProbe();
        probe.url(api.url());

        assertWarnsOnce(probe.assembledHttpClient(), betaEndpointOnlyOneTestCalls(0));
    }

    @Test
    void asyncClientWarnsOnceForABetaEndpointToo() throws IOException {
        AsyncHttpClientProbe probe = new AsyncHttpClientProbe();
        probe.url(api.url());

        assertWarnsOnce(probe.assembledHttpClient(), betaEndpointOnlyOneTestCalls(1));
    }

    private void assertWarnsOnce(OkHttpClient http, JsonNode endpoint) throws IOException {
        assumeTrue(endpoint != null, "the API has no beta endpoint left to call");
        String method = endpoint.get("method").asText();
        String pattern = endpoint.get("path_pattern").asText();
        String path = pattern.replaceAll("\\{[^}]+}", "c70523e0");
        api.reply(method, path, 200, "{}");
        Request request = new Request.Builder()
                .url(api.url() + path)
                .method(method, method.equals("GET") ? null : RequestBody.create(new byte[0]))
                .build();

        try (LogCapture log = new LogCapture(BetaWarning.class.getName())) {
            for (int call = 0; call < 2; call++) {
                try (Response response = http.newCall(request).execute()) {
                    assertEquals(200, response.code());
                }
            }

            assertEquals(
                    1,
                    log.messages(Level.WARNING, "[BETA] " + method + " " + pattern + ":")
                            .size());
        }
        assertEquals(2, api.received(method, path).size());
    }

    @Test
    void scannersAreCreatedOnceAndUseTheClient() {
        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .build()) {
            assertSame(client.modelScanner(), client.modelScanner());
            assertSame(client.communityScanner(), client.communityScanner());
        }
    }

    @Test
    void asyncClientSendsThePassedTokenAndNamesTheSdk() throws Exception {
        try (AsyncHiddenLayerClient client = new AsyncHiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .build()) {
            assertEquals(
                    Status.DONE,
                    client.scans()
                            .results()
                            .retrieveSummary(ScanFixtures.SCAN_ID)
                            .get(10, TimeUnit.SECONDS)
                            .getStatus());
        }

        assertEquals("Bearer 3c5e0a9d7f", summaryRequest().header("Authorization"));
        assertEquals("com.hiddenlayer.api:hiddenlayer-java", summaryRequest().header("X-Fern-SDK-Name"));
    }

    @Test
    void closingTheAsyncClientStopsItsScanners() {
        AsyncHiddenLayerClient client = new AsyncHiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .build();
        AsyncModelScanner scanner = client.modelScanner();
        assertSame(scanner, client.modelScanner());

        client.close();

        assertThrows(RejectedExecutionException.class, () -> scanner.scanFile("fraud-detector", "weights.bin"));
    }

    @Test
    void baseUrlFromTheEnvironmentIsUsedWhenNoUrlIsPassed() {
        try (HiddenLayerClient client = new BuilderWithVariable(ClientEnvironment.BASE_URL, api.url())
                .token("3c5e0a9d7f")
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
        }

        assertEquals(1, api.received("GET", ScanFixtures.SUMMARY_PATH).size());
    }

    @Test
    void passedUrlWinsOverTheEnvironmentBaseUrl() {
        try (HiddenLayerClient client = new BuilderWithVariable(ClientEnvironment.BASE_URL, UNREACHABLE_URL)
                .token("3c5e0a9d7f")
                .url(api.url())
                .maxRetries(0)
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID);
        }

        assertEquals(1, api.received("GET", ScanFixtures.SUMMARY_PATH).size());
    }

    @Test
    void passedUrlWinsOverTheEnvironmentBaseUrlOnTheAsyncClient() throws Exception {
        try (AsyncHiddenLayerClient client = new AsyncBuilderWithVariable(ClientEnvironment.BASE_URL, UNREACHABLE_URL)
                .token("3c5e0a9d7f")
                .url(api.url())
                .maxRetries(0)
                .build()) {
            client.scans().results().retrieveSummary(ScanFixtures.SCAN_ID).get(10, TimeUnit.SECONDS);
        }

        assertEquals(1, api.received("GET", ScanFixtures.SUMMARY_PATH).size());
    }

    @Test
    void urlWithoutASchemeIsRefusedWhenItIsSet() {
        assertThrows(IllegalArgumentException.class, () -> new HiddenLayerClientBuilder().url("api.us.hiddenlayer.ai"));
        assertThrows(
                IllegalArgumentException.class, () -> new AsyncHiddenLayerClientBuilder().url("api.us.hiddenlayer.ai"));
    }

    @Test
    void retriesARequestSentWithAnHttpClientTheCallerPassed() {
        String busyThenDone = "/scan/v3/results/0b9f5d3c-busy/summary";
        api.reply("GET", busyThenDone, 503, "{\"detail\":\"try again\"}");
        api.reply("GET", busyThenDone, 200, ScanFixtures.summary("done"));

        try (HiddenLayerClient client = new HiddenLayerClientBuilder()
                .token("3c5e0a9d7f")
                .url(api.url())
                .httpClient(new OkHttpClient())
                .build()) {
            assertEquals(
                    Status.DONE,
                    client.scans().results().retrieveSummary("0b9f5d3c-busy").getStatus());
        }

        assertEquals(2, api.received("GET", busyThenDone).size());
    }
}
