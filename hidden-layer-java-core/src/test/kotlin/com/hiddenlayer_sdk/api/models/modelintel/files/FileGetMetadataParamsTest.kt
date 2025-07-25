// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer_sdk.api.models.modelintel.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileGetMetadataParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        FileGetMetadataParams.builder()
            .sha256("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params =
            FileGetMetadataParams.builder()
                .sha256("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
