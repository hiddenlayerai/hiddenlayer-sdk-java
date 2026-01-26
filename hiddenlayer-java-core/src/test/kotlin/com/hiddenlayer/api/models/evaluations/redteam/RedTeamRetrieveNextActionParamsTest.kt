// File generated from our OpenAPI spec by Stainless.

package com.hiddenlayer.api.models.evaluations.redteam

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RedTeamRetrieveNextActionParamsTest {

    @Test
    fun create() {
        RedTeamRetrieveNextActionParams.builder().workflowId("workflow_id").build()
    }

    @Test
    fun pathParams() {
        val params = RedTeamRetrieveNextActionParams.builder().workflowId("workflow_id").build()

        assertThat(params._pathParam(0)).isEqualTo("workflow_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
