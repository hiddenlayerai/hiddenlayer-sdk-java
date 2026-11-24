package com.hiddenlayer.api.lib;

import java.util.function.Function;
import okhttp3.HttpUrl;

/**
 * What the client builders read from the process environment, and how it combines with what a caller passes.
 *
 * <p>{@code HiddenLayerClientBuilder} and {@code AsyncHiddenLayerClientBuilder} use this; it isn't meant to be used
 * directly.
 */
public final class ClientEnvironment {
    public static final String TOKEN = "HIDDENLAYER_TOKEN";

    public static final String CLIENT_ID = "HIDDENLAYER_CLIENT_ID";

    public static final String CLIENT_SECRET = "HIDDENLAYER_CLIENT_SECRET";

    public static final String BASE_URL = "HIDDENLAYER_BASE_URL";

    private final Function<String, String> variables;

    /** @param variables Looks an environment variable up by name, returning null when it isn't set */
    public ClientEnvironment(Function<String, String> variables) {
        this.variables = variables;
    }

    /** The environment of the running process. */
    public static ClientEnvironment process() {
        return new ClientEnvironment(System::getenv);
    }

    /**
     * {@code HIDDENLAYER_BASE_URL}, or null when it is unset or blank.
     *
     * @throws IllegalStateException when it is set to anything but an http or https URL
     */
    public String baseUrl() {
        String baseUrl = read(BASE_URL);
        if (baseUrl != null && !isHttpUrl(baseUrl)) {
            throw new IllegalStateException(
                    BASE_URL + " must be an http or https URL, such as https://api.us.hiddenlayer.ai");
        }
        return baseUrl;
    }

    /** Whether the client can send requests to {@code url}; without a scheme it can't. */
    public static boolean isHttpUrl(String url) {
        return url != null && HttpUrl.parse(url) != null;
    }

    /**
     * The credentials a client sends. What the caller passed wins over the environment: a passed token, then a
     * passed client ID and secret (either one completed from the environment), then {@code HIDDENLAYER_TOKEN}, then
     * {@code HIDDENLAYER_CLIENT_ID} and {@code HIDDENLAYER_CLIENT_SECRET}. A blank value counts as not passed.
     *
     * @throws IllegalStateException when neither a token nor both client credentials are available
     */
    public Credentials credentials(String token, String clientId, String clientSecret) {
        String passedToken = nonBlank(token);
        if (passedToken != null) {
            return Credentials.ofToken(passedToken);
        }
        String passedId = nonBlank(clientId);
        String passedSecret = nonBlank(clientSecret);
        String id = passedId != null ? passedId : read(CLIENT_ID);
        String secret = passedSecret != null ? passedSecret : read(CLIENT_SECRET);
        boolean hasClientCredentials = id != null && secret != null;
        if (hasClientCredentials && (passedId != null || passedSecret != null)) {
            return Credentials.ofClient(id, secret);
        }
        String environmentToken = read(TOKEN);
        if (environmentToken != null) {
            return Credentials.ofToken(environmentToken);
        }
        if (hasClientCredentials) {
            return Credentials.ofClient(id, secret);
        }
        throw new IllegalStateException("No HiddenLayer credentials: call token, or clientId and clientSecret, on the"
                + " client builder, or set " + TOKEN + ", or " + CLIENT_ID + " and " + CLIENT_SECRET + ".");
    }

    private String read(String name) {
        return nonBlank(variables.apply(name));
    }

    private static String nonBlank(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }

    /** Either a token, or a client ID and secret to exchange for one. */
    public static final class Credentials {
        private final String token;

        private final String clientId;

        private final String clientSecret;

        private Credentials(String token, String clientId, String clientSecret) {
            this.token = token;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        private static Credentials ofToken(String token) {
            return new Credentials(token, null, null);
        }

        private static Credentials ofClient(String clientId, String clientSecret) {
            return new Credentials(null, clientId, clientSecret);
        }

        /** The bearer token, or null when the client ID and secret are used. */
        public String token() {
            return token;
        }

        /** The client ID, or null when a token is used. */
        public String clientId() {
            return clientId;
        }

        /** The client secret, or null when a token is used. */
        public String clientSecret() {
            return clientSecret;
        }
    }
}
