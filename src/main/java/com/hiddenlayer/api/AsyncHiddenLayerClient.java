package com.hiddenlayer.api;

import com.hiddenlayer.api.core.ClientOptions;
import com.hiddenlayer.api.lib.AsyncCommunityScanner;
import com.hiddenlayer.api.lib.AsyncModelScanner;

/**
 * The asynchronous HiddenLayer API client: the generated client plus the model and community scanners.
 *
 * <p>Build one with {@link AsyncHiddenLayerClientBuilder}, which reads credentials from the environment and logs a
 * warning the first time a beta endpoint is called. Close the client when done: the scanners run on threads of
 * their own, which keep the JVM alive until {@link #close()} stops them.
 *
 * <pre>{@code
 * try (AsyncHiddenLayerClient client = new AsyncHiddenLayerClientBuilder().build()) {
 *     ...
 * }
 * }</pre>
 */
public class AsyncHiddenLayerClient extends AsyncBaseHiddenLayerClient {
    private AsyncModelScanner modelScanner;

    private AsyncCommunityScanner communityScanner;

    public AsyncHiddenLayerClient(ClientOptions clientOptions) {
        super(clientOptions);
    }

    /** Scans local model files and folders: uploads them, then completes with the scan report. */
    public synchronized AsyncModelScanner modelScanner() {
        if (this.modelScanner == null) {
            this.modelScanner = new AsyncModelScanner(this);
        }
        return this.modelScanner;
    }

    /** Scans a model at a remote location, such as a Hugging Face repository or a presigned URL. */
    public synchronized AsyncCommunityScanner communityScanner() {
        if (this.communityScanner == null) {
            this.communityScanner = new AsyncCommunityScanner(this);
        }
        return this.communityScanner;
    }

    /** Stops the scanners' threads, then releases what the generated client owns. */
    @Override
    public synchronized void close() {
        if (this.modelScanner != null) {
            this.modelScanner.close();
        }
        if (this.communityScanner != null) {
            this.communityScanner.close();
        }
        super.close();
    }

    /**
     * @deprecated This builds an {@link AsyncBaseHiddenLayerClient}, which has no scanners, reads no token from the
     *     environment and logs no beta warnings. Use {@code new AsyncHiddenLayerClientBuilder()}.
     */
    @Deprecated
    public static AsyncBaseHiddenLayerClientBuilder.Impl builder() {
        return AsyncBaseHiddenLayerClient.builder();
    }
}
