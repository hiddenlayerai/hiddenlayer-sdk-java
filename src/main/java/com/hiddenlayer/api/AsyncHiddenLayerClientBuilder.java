package com.hiddenlayer.api;

import com.hiddenlayer.api.core.ClientOptions;
import com.hiddenlayer.api.core.Environment;
import com.hiddenlayer.api.lib.BetaWarningInterceptor;
import com.hiddenlayer.api.lib.ClientEnvironment;
import com.hiddenlayer.api.lib.SdkIdentityInterceptor;

/**
 * Builds an {@link AsyncHiddenLayerClient}.
 *
 * <p>Credentials passed here win over the environment: {@link #token}, then {@link #clientId} and {@link
 * #clientSecret}, then {@code HIDDENLAYER_TOKEN}, then {@code HIDDENLAYER_CLIENT_ID} and {@code
 * HIDDENLAYER_CLIENT_SECRET}. The API's URL is {@link #environment} or {@link #url} when either is called, then
 * {@code HIDDENLAYER_BASE_URL}, then the US region.
 *
 * <pre>{@code
 * AsyncHiddenLayerClient client = new AsyncHiddenLayerClientBuilder()
 *         .environment(Environment.PROD_EU)
 *         .build();
 * }</pre>
 */
public class AsyncHiddenLayerClientBuilder extends AsyncBaseHiddenLayerClientBuilder<AsyncHiddenLayerClientBuilder> {
    private final ClientEnvironment processEnvironment = ClientEnvironment.process();

    private String token;

    private String clientId;

    private String clientSecret;

    private boolean isUrlSet;

    @Override
    protected AsyncHiddenLayerClientBuilder self() {
        return this;
    }

    /** Sets a bearer token, which is sent in place of any client ID and secret. */
    @Override
    public AsyncHiddenLayerClientBuilder token(String token) {
        this.token = token;
        return this;
    }

    /** Sets the client ID exchanged, with the client secret, for an access token. */
    @Override
    public AsyncHiddenLayerClientBuilder clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /** Sets the client secret exchanged, with the client ID, for an access token. */
    @Override
    public AsyncHiddenLayerClientBuilder clientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    @Override
    public AsyncHiddenLayerClientBuilder environment(Environment environment) {
        this.isUrlSet = true;
        return super.environment(environment);
    }

    @Override
    public AsyncHiddenLayerClientBuilder url(String url) {
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
    public AsyncHiddenLayerClient build() {
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
        return new AsyncHiddenLayerClient(buildClientOptions());
    }
}
