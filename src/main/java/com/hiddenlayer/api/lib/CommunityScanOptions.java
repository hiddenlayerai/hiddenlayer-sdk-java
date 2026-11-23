package com.hiddenlayer.api.lib;

import java.util.Objects;

/** Options for a community scan. */
public final class CommunityScanOptions {
    static final String DEFAULT_MODEL_VERSION = "main";

    static final boolean DEFAULT_WAIT_FOR_RESULTS = true;

    static final String DEFAULT_REQUEST_SOURCE = "API Upload";

    static final String DEFAULT_ORIGIN = "";

    private final String modelName;

    private final String modelPath;

    private final String modelSource;

    private final String modelVersion;

    private final boolean waitForResults;

    private final String requestSource;

    private final String origin;

    /**
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param modelPath Path to the model in the remote location, e.g. a presigned S3 URL
     * @param modelSource Type of remote location where the model is stored, see {@link CommunityScanSource}
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI
     * @param waitForResults Whether to wait for the scan to finish
     * @param requestSource Source that requested the scan
     * @param origin Origin platform where the model came from
     */
    public CommunityScanOptions(
            String modelName,
            String modelPath,
            String modelSource,
            String modelVersion,
            boolean waitForResults,
            String requestSource,
            String origin) {
        this.modelName = Objects.requireNonNull(modelName, "modelName");
        this.modelPath = Objects.requireNonNull(modelPath, "modelPath");
        this.modelSource = Objects.requireNonNull(modelSource, "modelSource");
        this.modelVersion = Objects.requireNonNull(modelVersion, "modelVersion");
        this.waitForResults = waitForResults;
        this.requestSource = Objects.requireNonNull(requestSource, "requestSource");
        this.origin = Objects.requireNonNull(origin, "origin");
    }

    /** Starts a builder with the defaults: version {@code "main"}, waiting for results, source {@code "API Upload"}. */
    public static Builder builder() {
        return new Builder();
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelPath() {
        return modelPath;
    }

    public String getModelSource() {
        return modelSource;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public boolean getWaitForResults() {
        return waitForResults;
    }

    public String getRequestSource() {
        return requestSource;
    }

    public String getOrigin() {
        return origin;
    }

    public static final class Builder {
        private String modelName;

        private String modelPath;

        private String modelSource;

        private String modelVersion = DEFAULT_MODEL_VERSION;

        private boolean waitForResults = DEFAULT_WAIT_FOR_RESULTS;

        private String requestSource = DEFAULT_REQUEST_SOURCE;

        private String origin = DEFAULT_ORIGIN;

        private Builder() {}

        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder modelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }

        public Builder modelSource(String modelSource) {
            this.modelSource = modelSource;
            return this;
        }

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        public Builder waitForResults(boolean waitForResults) {
            this.waitForResults = waitForResults;
            return this;
        }

        public Builder requestSource(String requestSource) {
            this.requestSource = requestSource;
            return this;
        }

        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /** @throws NullPointerException when the model's name, path or source wasn't set */
        public CommunityScanOptions build() {
            return new CommunityScanOptions(
                    modelName, modelPath, modelSource, modelVersion, waitForResults, requestSource, origin);
        }
    }
}
