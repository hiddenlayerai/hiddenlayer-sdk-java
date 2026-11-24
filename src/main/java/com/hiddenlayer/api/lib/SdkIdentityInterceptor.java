package com.hiddenlayer.api.lib;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Names this SDK in the {@code X-Fern-SDK-Name} and {@code User-Agent} headers of every request.
 *
 * <p>The generated client names itself after a placeholder Maven coordinate, because the artifact's real coordinate
 * is set by this repository's build rather than by code generation. {@code HiddenLayerClientBuilder} and {@code
 * AsyncHiddenLayerClientBuilder} add this interceptor to every client they build.
 */
public final class SdkIdentityInterceptor implements Interceptor {
    /** The Maven coordinate this SDK is published under. */
    public static final String SDK_NAME = "com.hiddenlayer.api:hiddenlayer-java";

    private static final String SDK_NAME_HEADER = "X-Fern-SDK-Name";

    // The generated client sends the version, which the release tooling keeps current.
    private static final String SDK_VERSION_HEADER = "X-Fern-SDK-Version";

    private static final String USER_AGENT_HEADER = "User-Agent";

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder identified = request.newBuilder().header(SDK_NAME_HEADER, SDK_NAME);
        String version = request.header(SDK_VERSION_HEADER);
        if (version != null && request.header(USER_AGENT_HEADER) == null) {
            identified.header(USER_AGENT_HEADER, SDK_NAME + "/" + version);
        }
        return chain.proceed(identified.build());
    }
}
