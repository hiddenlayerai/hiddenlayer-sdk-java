package com.hiddenlayer.sdk;

/**
 * Configuration class for HiddenLayer SDK
 * 
 * This class is used to store and pass the configuration for the HiddenLayer SDK Services.
 */
public class Configuration {
    private String hlClientId;
    private String hlClientSecret;
    private String hlAuthUrl;
    private String hlApiUrl;

    /**
     * Constructor for Configuration class
     * 
     * @param hlClientId API Key ID
     * @param hlClientSecret API Key Secret
     */
    public Configuration(String hlClientId, String hlClientSecret) {
        this.hlClientId = hlClientId;
        this.hlClientSecret = hlClientSecret;
        this.hlAuthUrl = "https://auth.hiddenlayer.ai";
        this.hlApiUrl = "https://api.hiddenlayer.ai";
    }

    /**
     * Constructor for Configuration class allowing use of regional API and Auth endpoints
     * 
     * @param hlClientId API Key ID
     * @param hlClientSecret API Key Secret
     * @param hlAuthUrl Hiddenlayer authentication API endpoint
     * @param hlApiUrl Hiddenlayer service API endpoint
     */
    public Configuration(String hlClientId, String hlClientSecret, String hlAuthUrl, String hlApiUrl) {
        this.hlClientId = hlClientId;
        this.hlClientSecret = hlClientSecret;
        this.hlAuthUrl = hlAuthUrl;
        this.hlApiUrl = hlApiUrl;
    }

    /**
     * Get the API Key ID
     * 
     * @return API Key ID
     */
    public String getHlClientId() {
        return hlClientId;
    }

    /**
     * Get the API Key Secret
     * 
     * @return API Key Secret
     */
    public String getHlClientSecret() {
        return hlClientSecret;
    } 

    /**
     * Get the HiddenLayer authentication API endpoint
     * 
     * @return HiddenLayer authentication API endpoint
     */
    public String getHlAuthUrl() {
        return hlAuthUrl;
    }

    /**
     * Get the HiddenLayer service API endpoint
     * 
     * @return HiddenLayer service API endpoint
     */
    public String getHlApiUrl() {
        return hlApiUrl;
    }

    /**
     * Create a Configuration object from environment variables.
     * 
     * Required environment variables:
     * - HL_CLIENT_ID: API Key ID
     * - HL_CLIENT_SECRET: API Key Secret
     * 
     * Optional environment variables:
     * - HL_AUTH_URL: HiddenLayer authentication API endpoint
     * - HL_API_URL: HiddenLayer service API endpoint
     * 
     * @return Configuration object
     * @throws IllegalArgumentException if required environment variables are not set
     */
    public static Configuration defaultFromEnvironment() throws IllegalArgumentException {
        String clientId = System.getenv("HL_CLIENT_ID");
        if (clientId == null) {
            throw new IllegalArgumentException("HL_CLIENT_ID environment variable not set");
        }
        String clientSecret = System.getenv("HL_CLIENT_SECRET");
        if (clientSecret == null) {
            throw new IllegalArgumentException("HL_CLIENT_SECRET environment variable not set");
        }
        String hlAuthUrl = System.getenv("HL_AUTH_URL");
        if (hlAuthUrl == null) {
            hlAuthUrl = "https://auth.hiddenlayer.ai";
        }
        String hlApiUrl = System.getenv("HL_API_URL");
        if (hlApiUrl == null) {
            hlApiUrl = "https://api.hiddenlayer.ai";
        }

        return new Configuration(clientId, clientSecret, hlAuthUrl, hlApiUrl);
    }
}
