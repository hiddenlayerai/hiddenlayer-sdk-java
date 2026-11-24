package com.hiddenlayer.api.lib;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Logs a one-time warning for each beta endpoint a client calls.
 *
 * <p>{@code HiddenLayerClientBuilder} and {@code AsyncHiddenLayerClientBuilder} add it to every client they build.
 */
public final class BetaWarningInterceptor implements Interceptor {
    private final BetaWarning warning;

    public BetaWarningInterceptor() {
        this(BetaWarning.shared());
    }

    BetaWarningInterceptor(BetaWarning warning) {
        this.warning = warning;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        try {
            warning.check(request.method(), request.url().pathSegments());
        } catch (RuntimeException ignored) {
            // A warning is advisory: nothing in it may fail the request it describes.
        }
        return chain.proceed(request);
    }
}
