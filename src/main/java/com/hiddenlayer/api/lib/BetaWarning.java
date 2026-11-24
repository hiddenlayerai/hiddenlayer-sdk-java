package com.hiddenlayer.api.lib;

import com.fasterxml.jackson.databind.JsonNode;
import com.hiddenlayer.api.core.ObjectMappers;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * Runtime beta warnings.
 *
 * <p>Logs one warning per beta endpoint, the first time it is called, so SDK consumers know the endpoint is not yet
 * GA. The beta endpoints come from the classpath resource {@code com/hiddenlayer/api/beta-endpoints.json}, which is
 * rewritten on every SDK generation.
 */
public final class BetaWarning {
    static final String ENDPOINTS_RESOURCE = "/com/hiddenlayer/api/beta-endpoints.json";

    private static final Logger LOGGER = Logger.getLogger(BetaWarning.class.getName());

    private static final BetaWarning SHARED = new BetaWarning(loadEndpoints());

    private final List<Endpoint> endpoints;

    private final Set<String> warned = ConcurrentHashMap.newKeySet();

    BetaWarning(List<Endpoint> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * Log a one-time warning that a beta endpoint was called.
     *
     * @param endpoint The endpoint, e.g. {@code "POST /evaluations/v1/red-team"}
     */
    public static void warnBeta(String endpoint) {
        SHARED.warn(endpoint);
    }

    /**
     * Log a one-time beta warning if the request matches a beta endpoint.
     *
     * <p>A {@code {param}} segment of an endpoint's path matches any single segment.
     *
     * @param method The request's HTTP method
     * @param pathSegments The request's path segments, e.g. {@code ["evaluations", "v1", "red-team"]}
     */
    public static void checkBetaEndpoint(String method, List<String> pathSegments) {
        SHARED.check(method, pathSegments);
    }

    static BetaWarning shared() {
        return SHARED;
    }

    void warn(String endpoint) {
        if (warned.add(endpoint)) {
            LOGGER.warning("[BETA] " + endpoint + ": This endpoint is not GA or Production ready and is subject to"
                    + " changes at any time. Breaking changes may occur.");
        }
    }

    void check(String method, List<String> pathSegments) {
        String endpoint = match(method, pathSegments);
        if (endpoint != null) {
            warn(endpoint);
        }
    }

    /** The beta endpoint the request matches, as {@code "METHOD /path/{param}"}, or null when it matches none. */
    String match(String method, List<String> pathSegments) {
        List<String> segments = withoutEmpty(pathSegments);
        for (Endpoint endpoint : endpoints) {
            if (endpoint.matches(method, segments)) {
                return endpoint.name;
            }
        }
        return null;
    }

    static List<Endpoint> loadEndpoints() {
        try (InputStream resource = BetaWarning.class.getResourceAsStream(ENDPOINTS_RESOURCE)) {
            if (resource == null) {
                return Collections.emptyList();
            }
            List<Endpoint> endpoints = new ArrayList<>();
            for (JsonNode entry : ObjectMappers.JSON_MAPPER.readTree(resource)) {
                endpoints.add(new Endpoint(
                        entry.path("method").asText(),
                        entry.path("path_pattern").asText()));
            }
            return Collections.unmodifiableList(endpoints);
        } catch (IOException | RuntimeException e) {
            // A warning is advisory: a list that can't be read must not stop the client from loading.
            LOGGER.fine("Beta endpoints could not be read, so no beta warnings are logged: " + e);
            return Collections.emptyList();
        }
    }

    private static List<String> withoutEmpty(List<String> segments) {
        List<String> kept = new ArrayList<>(segments.size());
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                kept.add(segment);
            }
        }
        return kept;
    }

    static final class Endpoint {
        final String name;

        private final String method;

        private final List<String> pattern;

        Endpoint(String method, String pathPattern) {
            this.method = method.toUpperCase(Locale.ROOT);
            this.pattern = withoutEmpty(Arrays.asList(pathPattern.split("/")));
            this.name = this.method + " " + pathPattern;
        }

        // Matched against the end of the path: a custom base URL may carry a path prefix of its own.
        boolean matches(String requestMethod, List<String> segments) {
            if (!method.equalsIgnoreCase(requestMethod) || pattern.size() > segments.size()) {
                return false;
            }
            int offset = segments.size() - pattern.size();
            for (int i = 0; i < pattern.size(); i++) {
                String expected = pattern.get(i);
                boolean isParameter = expected.startsWith("{") && expected.endsWith("}");
                if (!isParameter && !expected.equals(segments.get(offset + i))) {
                    return false;
                }
            }
            return true;
        }
    }
}
