package com.hiddenlayer.api.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

final class ClientEnvironmentTest {
    private static final String ENVIRONMENT_TOKEN = "environment-token";

    private static ClientEnvironment environment(String... namesAndValues) {
        Map<String, String> variables = new HashMap<>();
        for (int i = 0; i < namesAndValues.length; i += 2) {
            variables.put(namesAndValues[i], namesAndValues[i + 1]);
        }
        return new ClientEnvironment(variables::get);
    }

    private static ClientEnvironment everyVariableSet() {
        return environment(
                ClientEnvironment.TOKEN, ENVIRONMENT_TOKEN,
                ClientEnvironment.CLIENT_ID, "environment-id",
                ClientEnvironment.CLIENT_SECRET, "environment-secret");
    }

    @Test
    void passedTokenWinsOverEverythingElse() {
        ClientEnvironment.Credentials credentials =
                everyVariableSet().credentials("passed-token", "passed-id", "passed-secret");

        assertEquals("passed-token", credentials.token());
        assertNull(credentials.clientId());
        assertNull(credentials.clientSecret());
    }

    @Test
    void passedClientCredentialsWinOverTheEnvironmentToken() {
        ClientEnvironment.Credentials credentials = everyVariableSet().credentials(null, "passed-id", "passed-secret");

        assertNull(credentials.token());
        assertEquals("passed-id", credentials.clientId());
        assertEquals("passed-secret", credentials.clientSecret());
    }

    @Test
    void passedClientIdIsCompletedWithTheEnvironmentSecret() {
        ClientEnvironment.Credentials credentials = everyVariableSet().credentials(null, "passed-id", null);

        assertNull(credentials.token());
        assertEquals("passed-id", credentials.clientId());
        assertEquals("environment-secret", credentials.clientSecret());
    }

    @Test
    void environmentTokenWinsOverEnvironmentClientCredentials() {
        ClientEnvironment.Credentials credentials = everyVariableSet().credentials(null, null, null);

        assertEquals(ENVIRONMENT_TOKEN, credentials.token());
        assertNull(credentials.clientId());
    }

    @Test
    void environmentClientCredentialsAreUsedWhenNothingElseIsSet() {
        ClientEnvironment.Credentials credentials = environment(
                        ClientEnvironment.CLIENT_ID, "environment-id",
                        ClientEnvironment.CLIENT_SECRET, "environment-secret")
                .credentials(null, null, null);

        assertNull(credentials.token());
        assertEquals("environment-id", credentials.clientId());
        assertEquals("environment-secret", credentials.clientSecret());
    }

    @Test
    void blankValuesCountAsNotPassed() {
        ClientEnvironment.Credentials credentials = everyVariableSet().credentials("   ", "", " ");

        assertEquals(ENVIRONMENT_TOKEN, credentials.token());
    }

    @Test
    void surroundingWhitespaceIsDropped() {
        assertEquals(
                "passed-token",
                environment().credentials(" passed-token\n", null, null).token());
    }

    @Test
    void halfAPairOfClientCredentialsIsNotEnough() {
        IllegalStateException failure = assertThrows(
                IllegalStateException.class,
                () -> environment(ClientEnvironment.CLIENT_ID, "environment-id").credentials(null, null, null));

        assertTrue(failure.getMessage().contains("HIDDENLAYER_TOKEN"), failure.getMessage());
        assertTrue(failure.getMessage().contains("HIDDENLAYER_CLIENT_SECRET"), failure.getMessage());
    }

    @Test
    void noCredentialsAtAllFailsWithoutEchoingAnyValue() {
        IllegalStateException failure =
                assertThrows(IllegalStateException.class, () -> environment().credentials(null, "only-an-id", null));

        assertTrue(failure.getMessage().startsWith("No HiddenLayer credentials"), failure.getMessage());
        assertTrue(!failure.getMessage().contains("only-an-id"), failure.getMessage());
    }

    @Test
    void baseUrlIsReadFromItsVariable() {
        assertEquals(
                "https://hiddenlayer.internal.example",
                environment(ClientEnvironment.BASE_URL, " https://hiddenlayer.internal.example ")
                        .baseUrl());
    }

    @Test
    void blankBaseUrlCountsAsUnset() {
        assertNull(environment(ClientEnvironment.BASE_URL, "  ").baseUrl());
        assertNull(environment().baseUrl());
    }
}
