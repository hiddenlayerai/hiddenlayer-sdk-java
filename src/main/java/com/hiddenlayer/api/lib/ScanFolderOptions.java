package com.hiddenlayer.api.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/** Options for scanning every file under a local folder. */
public final class ScanFolderOptions {
    /** The files a folder scan leaves out unless other ignore patterns are given. */
    public static final List<String> DEFAULT_IGNORE_FILE_PATTERNS = Collections.unmodifiableList(
            Arrays.asList("*.txt", "*.md", "*.lock", ".gitattributes", ".git", ".git/*", "*/.git", "**/.git/**"));

    private final String modelName;

    private final String path;

    private final String modelVersion;

    private final List<String> allowFilePatterns;

    private final List<String> ignoreFilePatterns;

    private final boolean waitForResults;

    private final String requestSource;

    private final String origin;

    /**
     * @param modelName Name of the model to be shown on the HiddenLayer UI
     * @param path Path of the local folder to scan
     * @param modelVersion Version of the model to be shown on the HiddenLayer UI
     * @param allowFilePatterns When not empty, only files matching one of these patterns are scanned
     * @param ignoreFilePatterns Files matching one of these patterns are not scanned
     * @param waitForResults Whether to wait for the scan to finish
     * @param requestSource Source that requested the scan
     * @param origin Origin platform where the model came from
     */
    public ScanFolderOptions(
            String modelName,
            String path,
            String modelVersion,
            List<String> allowFilePatterns,
            List<String> ignoreFilePatterns,
            boolean waitForResults,
            String requestSource,
            String origin) {
        this.modelName = Objects.requireNonNull(modelName, "modelName");
        this.path = Objects.requireNonNull(path, "path");
        this.modelVersion = Objects.requireNonNull(modelVersion, "modelVersion");
        this.allowFilePatterns = copyOf(Objects.requireNonNull(allowFilePatterns, "allowFilePatterns"));
        this.ignoreFilePatterns = copyOf(Objects.requireNonNull(ignoreFilePatterns, "ignoreFilePatterns"));
        this.waitForResults = waitForResults;
        this.requestSource = Objects.requireNonNull(requestSource, "requestSource");
        this.origin = Objects.requireNonNull(origin, "origin");
    }

    /**
     * Starts a builder with the defaults: version {@code "1"}, every file allowed, {@link
     * #DEFAULT_IGNORE_FILE_PATTERNS} ignored, waiting for results, source {@code "API Upload"}.
     */
    public static Builder builder() {
        return new Builder();
    }

    public String getModelName() {
        return modelName;
    }

    public String getPath() {
        return path;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public List<String> getAllowFilePatterns() {
        return allowFilePatterns;
    }

    public List<String> getIgnoreFilePatterns() {
        return ignoreFilePatterns;
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

    private static List<String> copyOf(List<String> patterns) {
        return Collections.unmodifiableList(new ArrayList<>(patterns));
    }

    public static final class Builder {
        private String modelName;

        private String path;

        private String modelVersion = ScanFileOptions.DEFAULT_MODEL_VERSION;

        private List<String> allowFilePatterns = Collections.emptyList();

        private List<String> ignoreFilePatterns = DEFAULT_IGNORE_FILE_PATTERNS;

        private boolean waitForResults = ScanFileOptions.DEFAULT_WAIT_FOR_RESULTS;

        private String requestSource = ScanFileOptions.DEFAULT_REQUEST_SOURCE;

        private String origin = ScanFileOptions.DEFAULT_ORIGIN;

        private Builder() {}

        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        public Builder allowFilePatterns(List<String> allowFilePatterns) {
            this.allowFilePatterns = allowFilePatterns;
            return this;
        }

        public Builder ignoreFilePatterns(List<String> ignoreFilePatterns) {
            this.ignoreFilePatterns = ignoreFilePatterns;
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

        /** @throws NullPointerException when the model's name or the folder's path wasn't set */
        public ScanFolderOptions build() {
            return new ScanFolderOptions(
                    modelName,
                    path,
                    modelVersion,
                    allowFilePatterns,
                    ignoreFilePatterns,
                    waitForResults,
                    requestSource,
                    origin);
        }
    }
}
