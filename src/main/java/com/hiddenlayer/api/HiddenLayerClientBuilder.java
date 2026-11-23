package com.hiddenlayer.api;

import com.hiddenlayer.api.core.ClientOptions;
import com.hiddenlayer.api.core.Environment;
import com.hiddenlayer.api.lib.BetaWarningInterceptor;
import com.hiddenlayer.api.lib.ClientEnvironment;
import com.hiddenlayer.api.lib.SdkIdentityInterceptor;

/**
 * Builds a {@link HiddenLayerClient}.
 *
 * <p>Credentials passed here win over the environment: {@link #token}, then {@link #clientId} and {@link
 * #clientSecret}, then {@code HIDDENLAYER_TOKEN}, then {@code HIDDENLAYER_CLIENT_ID} and {@code
 * HIDDENLAYER_CLIENT_SECRET}. The API's URL is {@link #environment} or {@link #url} when either is called, then
 * {@code HIDDENLAYER_BASE_URL}, then the US region.
 *
 * <pre>{@code
 * HiddenLayerClient client = new HiddenLayerClientBuilder()
 *         .environment(Environment.PROD_EU)
 *         .build();
 * }</pre>
 */
public class HiddenLayerClientBuilder extends BaseHiddenLayerClientBuilder<HiddenLayerClientBuilder> {
    private final ClientEnvironment processEnvironment = ClientEnvironment.process();

    private String token;

    private String clientId;

    private String clientSecret;

    private boolean isUrlSet;

    @Override
    protected HiddenLayerClientBuilder self() {
        return this;
    }

    /** Sets a bearer token, which is sent in place of any client ID and secret. */
    @Override
    public HiddenLayerClientBuilder token(String token) {
        this.token = token;
        return this;
    }

    /** Sets the client ID exchanged, with the client secret, for an access token. */
    @Override
    public HiddenLayerClientBuilder clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /** Sets the client secret exchanged, with the client ID, for an access token. */
    @Override
    public HiddenLayerClientBuilder clientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    @Override
    public HiddenLayerClientBuilder environment(Environment environment) {
        this.isUrlSet = true;
        return super.environment(environment);
    }

    @Override
    public HiddenLayerClientBuilder url(String url) {
        this.isUrlSet = true;
        return super.url(url);
    }

    @Override
    protected void setInterceptors(ClientOptions.Builder builder) {
        super.setInterceptors(builder);
        builder.addInterceptor(new BetaWarningInterceptor());
        builder.addInterceptor(new SdkIdentityInterceptor());
    }

    /**
     * @throws IllegalStateException when neither a token nor both client credentials were passed or are in the
     *     environment
     */
    @Override
    public HiddenLayerClient build() {
        ClientEnvironment.Credentials credentials =
                this.processEnvironment.credentials(this.token, this.clientId, this.clientSecret);
        super.token(credentials.token());
        super.clientId(credentials.clientId());
        super.clientSecret(credentials.clientSecret());
        String baseUrl = this.processEnvironment.baseUrl();
        if (!this.isUrlSet && baseUrl != null) {
            super.url(baseUrl);
        }
        validateConfiguration();
        return new HiddenLayerClient(buildClientOptions());
    }
}
