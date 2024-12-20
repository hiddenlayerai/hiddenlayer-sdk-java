package com.hiddenlayer;

public class Configuration {
    private String hlClientId;
    private String hlClientSecret;
    private String hlAuthUrl;
    private String hlApiUrl;

    public Configuration(String hlClientId, String hlClientSecret) {
        this.hlClientId = hlClientId;
        this.hlClientSecret = hlClientSecret;
        this.hlAuthUrl = "https://auth.hiddenlayer.ai";
        this.hlApiUrl = "https://api.hiddenlayer.ai";
    }

    public Configuration(String hlClientId, String hlClientSecret, String hlAuthUrl, String hlApiUrl) {
        this.hlClientId = hlClientId;
        this.hlClientSecret = hlClientSecret;
        this.hlAuthUrl = hlAuthUrl;
        this.hlApiUrl = hlApiUrl;
    }

    public String getHlClientId() {
        return hlClientId;
    }

    public String getHlClientSecret() {
        return hlClientSecret;
    } 

    public String getHlAuthUrl() {
        return hlAuthUrl;
    }

    public String getHlApiUrl() {
        return hlApiUrl;
    }

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
