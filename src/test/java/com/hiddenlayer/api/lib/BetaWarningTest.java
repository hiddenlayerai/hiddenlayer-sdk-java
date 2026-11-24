package com.hiddenlayer.api.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class BetaWarningTest {
    private static final List<BetaWarning.Endpoint> ENDPOINTS = Arrays.asList(
            new BetaWarning.Endpoint("POST", "/evaluations/v1/red-team"),
            new BetaWarning.Endpoint("GET", "/evaluations/v1/red-team/{workflow_id}/status"),
            new BetaWarning.Endpoint("DELETE", "/evaluations/v1/red-team/{workflow_id}"));

    private LogCapture log;

    @BeforeEach
    void captureWarnings() {
        log = new LogCapture(BetaWarning.class.getName());
    }

    @AfterEach
    void releaseWarnings() {
        log.close();
    }

    @Test
    void warnsWithTheEndpointTheFirstTimeItIsCalled() {
        BetaWarning warning = new BetaWarning(ENDPOINTS);

        warning.check("POST", Arrays.asList("evaluations", "v1", "red-team"));

        assertEquals(
                Collections.singletonList(
                        "[BETA] POST /evaluations/v1/red-team: This endpoint is not GA or Production ready and is"
                                + " subject to changes at any time. Breaking changes may occur."),
                log.messages(Level.WARNING, "POST /evaluations/v1/red-team"));
    }

    @Test
    void warnsOncePerEndpointHoweverOftenItIsCalled() {
        BetaWarning warning = new BetaWarning(ENDPOINTS);

        warning.check("GET", Arrays.asList("evaluations", "v1", "red-team", "workflow-1", "status"));
        warning.check("GET", Arrays.asList("evaluations", "v1", "red-team", "workflow-2", "status"));
        warning.check("POST", Arrays.asList("evaluations", "v1", "red-team"));

        assertEquals(
                1,
                log.messages(Level.WARNING, "GET /evaluations/v1/red-team/{workflow_id}/status")
                        .size());
        assertEquals(
                1, log.messages(Level.WARNING, "POST /evaluations/v1/red-team:").size());
    }

    @Test
    void matchesAPathParameterAgainstAnySingleSegment() {
        BetaWarning warning = new BetaWarning(ENDPOINTS);

        assertEquals(
                "DELETE /evaluations/v1/red-team/{workflow_id}",
                warning.match("DELETE", Arrays.asList("evaluations", "v1", "red-team", "abc123")));
    }

    @Test
    void matchesBelowABaseUrlThatHasAPathOfItsOwn() {
        BetaWarning warning = new BetaWarning(ENDPOINTS);

        assertEquals(
                "POST /evaluations/v1/red-team",
                warning.match("post", Arrays.asList("hiddenlayer", "api", "evaluations", "v1", "red-team")));
    }

    @Test
    void doesNotMatchAnotherMethodOnTheSamePath() {
        assertNull(new BetaWarning(ENDPOINTS).match("GET", Arrays.asList("evaluations", "v1", "red-team")));
    }

    @Test
    void doesNotMatchWhenALiteralSegmentDiffers() {
        assertNull(new BetaWarning(ENDPOINTS)
                .match("GET", Arrays.asList("evaluations", "v1", "red-team", "abc123", "next-action")));
    }

    @Test
    void doesNotMatchALongerOrShorterPath() {
        BetaWarning warning = new BetaWarning(ENDPOINTS);

        assertNull(warning.match("GET", Arrays.asList("evaluations", "v1", "red-team", "abc123", "status", "extra")));
        assertNull(warning.match("POST", Arrays.asList("v1", "red-team")));
    }

    @Test
    void publicEntryPointWarnsOncePerName() {
        BetaWarning.warnBeta("GET /beta-warning-test/once-per-name");
        BetaWarning.warnBeta("GET /beta-warning-test/once-per-name");

        assertEquals(
                1,
                log.messages(Level.WARNING, "GET /beta-warning-test/once-per-name")
                        .size());
    }

    @Test
    void generatedEndpointListIsReadableWhateverItHolds() {
        for (BetaWarning.Endpoint endpoint : BetaWarning.loadEndpoints()) {
            String[] nameParts = endpoint.name.split(" ", 2);
            assertFalse(nameParts[0].isEmpty(), endpoint.name);
            assertTrue(nameParts[1].startsWith("/"), endpoint.name);
        }
    }

    @Test
    void interceptorWarnsForARequestToABetaEndpointAndLetsItThrough() throws IOException {
        try (FakeApi api = new FakeApi()) {
            api.reply("POST", "/evaluations/v1/red-team", 200, "{}");
            OkHttpClient http = new OkHttpClient.Builder()
                    .addInterceptor(new BetaWarningInterceptor(new BetaWarning(ENDPOINTS)))
                    .build();
            Request request = new Request.Builder()
                    .url(api.url() + "/evaluations/v1/red-team")
                    .post(okhttp3.RequestBody.create(new byte[0]))
                    .build();

            try (Response response = http.newCall(request).execute()) {
                assertEquals(200, response.code());
            }

            assertEquals(
                    1,
                    log.messages(Level.WARNING, "POST /evaluations/v1/red-team").size());
            assertEquals(1, api.received("POST", "/evaluations/v1/red-team").size());
        }
    }
}
