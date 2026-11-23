package com.hiddenlayer.api;

import com.hiddenlayer.api.core.ClientOptions;
import com.hiddenlayer.api.core.Suppliers;
import com.hiddenlayer.api.lib.CommunityScanner;
import com.hiddenlayer.api.lib.ModelScanner;
import java.util.function.Supplier;

/**
 * The HiddenLayer API client: the generated client plus the model and community scanners.
 *
 * <p>Build one with {@link HiddenLayerClientBuilder}, which reads credentials from the environment and logs a
 * warning the first time a beta endpoint is called:
 *
 * <pre>{@code
 * HiddenLayerClient client = new HiddenLayerClientBuilder().build();
 * }</pre>
 */
public class HiddenLayerClient extends BaseHiddenLayerClient {
    private final Supplier<ModelScanner> modelScanner;

    private final Supplier<CommunityScanner> communityScanner;

    public HiddenLayerClient(ClientOptions clientOptions) {
        super(clientOptions);
        this.modelScanner = Suppliers.memoize(() -> new ModelScanner(this));
        this.communityScanner = Suppliers.memoize(() -> new CommunityScanner(this));
    }

    /** Scans local model files and folders: uploads them, then returns the scan report. */
    public ModelScanner modelScanner() {
        return this.modelScanner.get();
    }

    /** Scans a model at a remote location, such as a Hugging Face repository or a presigned URL. */
    public CommunityScanner communityScanner() {
        return this.communityScanner.get();
    }

    /**
     * @deprecated This builds a {@link BaseHiddenLayerClient}, which has no scanners, reads no token from the
     *     environment and logs no beta warnings. Use {@code new HiddenLayerClientBuilder()}.
     */
    @Deprecated
    public static BaseHiddenLayerClientBuilder.Impl builder() {
        return BaseHiddenLayerClient.builder();
    }
}
