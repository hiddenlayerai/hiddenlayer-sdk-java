package com.hiddenlayer.sdk;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.URI;
import java.util.Base64;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Base class for all Hiddenlayer services
 */
class HiddenlayerService {

    /**
     * Configuration object for this service instance
     */
    protected Configuration config;

    /**
     * Constructor
     * @param config Configuration object for this service instance
     */
    HiddenlayerService(Configuration config) {
        this.config = config;
    }

    /**
     * Get a JWT token for the configured client from the configured client id, secret and authentication endpoint
     * @return JWT token
     * @throws Exception
     */
    protected String getJWT() throws Exception {
        return getJWT(config.getHlClientId(), config.getHlClientSecret(), config.getHlAuthUrl());
    }

    /**
     * Get a JWT token for the given client id and secret from the configured authentication endpoint
     * @param apiId Client ID
     * @param apiKey Client Secret
     * @return JWT token
     * @throws Exception
     */
    protected String getJWT(String apiId, String apiKey) throws Exception {
        return getJWT(apiId, apiKey, config.getHlAuthUrl());
    }

    /**
     * Get a JWT token for the given client id and secret from the given authentication endpoint
     * @param apiId Client ID
     * @param apiKey Client Secret
     * @param authUrl Authentication endpoint
     * @return JWT token
     * @throws Exception
     */
    protected String getJWT(String apiId, String apiKey, String authUrl) throws Exception{
        String encoding = Base64.getEncoder().encodeToString((apiId + ":" + apiKey).getBytes());
        String tokenUrl = authUrl + "/oauth2/token?grant_type=client_credentials";
        HttpClient httpclient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.noBody())
            .uri(URI.create(tokenUrl))
            .setHeader("Authorization", "Basic " + encoding)
            .build();
        HttpResponse<String> response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new Exception("Failed to get JWT token: " + response.statusCode() + ": " + response.body());
        }

        ObjectMapper mapper = new ObjectMapper();
        HashMap responseMap = mapper.readValue(response.body(), HashMap.class);

        return responseMap.get("access_token").toString();
    }
}
