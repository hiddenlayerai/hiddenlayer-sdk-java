package com.hiddenlayer.api.lib;

/** The kinds of remote location a community scan reads a model from. */
public final class CommunityScanSource {
    public static final String LOCAL = "LOCAL";

    public static final String AWS_PRESIGNED = "AWS_PRESIGNED";

    public static final String AWS_IAM_ROLE = "AWS_IAM_ROLE";

    public static final String AZURE_BLOB_SAS = "AZURE_BLOB_SAS";

    public static final String AZURE_BLOB_AD = "AZURE_BLOB_AD";

    public static final String GOOGLE_SIGNED = "GOOGLE_SIGNED";

    public static final String GOOGLE_OAUTH = "GOOGLE_OAUTH";

    public static final String HUGGING_FACE = "HUGGING_FACE";

    private CommunityScanSource() {}
}
