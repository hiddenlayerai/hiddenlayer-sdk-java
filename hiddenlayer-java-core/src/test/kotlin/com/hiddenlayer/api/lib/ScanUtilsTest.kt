package com.hiddenlayer.api.lib

import com.hiddenlayer.api.client.HiddenLayerClient
import com.hiddenlayer.api.core.jsonMapper
import com.hiddenlayer.api.models.scans.results.ResultListFilesPage
import com.hiddenlayer.api.models.scans.results.ResultListFilesPageResponse
import com.hiddenlayer.api.models.scans.results.ResultListFilesParams
import com.hiddenlayer.api.services.blocking.ScanService
import com.hiddenlayer.api.services.blocking.scans.ResultService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

internal class ScanUtilsTest {

    private val scanId = "c70523e0-6bf5-4405-acda-e30c4aece957"

    /** Builds a page from the wire shape so no model builder has to satisfy required fields. */
    private fun page(
        service: ResultService,
        paths: List<String>,
        next: String,
    ): ResultListFilesPage {
        val items = paths.joinToString(",") { """{"file_location":"$it"}""" }
        val json = """{"items":[$items],"next":$next,"prev":"","first":"first-cursor"}"""
        return ResultListFilesPage.builder()
            .service(service)
            .params(ResultListFilesParams.builder().scanId(scanId).build())
            .response(jsonMapper().readValue(json, ResultListFilesPageResponse::class.java))
            .build()
    }

    private fun client(results: ResultService): HiddenLayerClient {
        val scans = mock<ScanService>()
        whenever(scans.results()).thenReturn(results)
        val client = mock<HiddenLayerClient>()
        whenever(client.scans()).thenReturn(scans)
        return client
    }

    @ParameterizedTest
    @ValueSource(strings = ["\"\"", "\"   \"", "null"])
    fun `blank or null next cursor ends pagination`(next: String) {
        val results = mock<ResultService>()
        whenever(results.listFiles(any<ResultListFilesParams>()))
            .thenReturn(page(results, listOf("a.bin"), next))

        val collected = collectFileResults(client(results), scanId)

        assertThat(collected.map { it.fileLocation() }).containsExactly("a.bin")
        verify(results).listFiles(any<ResultListFilesParams>())
    }

    @Test
    fun `non-blank next cursor fetches the following page`() {
        val results = mock<ResultService>()
        whenever(results.listFiles(any<ResultListFilesParams>()))
            .thenReturn(
                page(results, listOf("a.bin"), "\"cursor-2\""),
                page(results, listOf("b.bin"), "\"\""),
            )

        val collected = collectFileResults(client(results), scanId)

        assertThat(collected.map { it.fileLocation() }).containsExactly("a.bin", "b.bin")
    }

    @Test
    fun `empty page ends pagination even with a cursor`() {
        val results = mock<ResultService>()
        whenever(results.listFiles(any<ResultListFilesParams>()))
            .thenReturn(page(results, emptyList(), "\"cursor-2\""))

        assertThat(collectFileResults(client(results), scanId)).isEmpty()
        verify(results).listFiles(any<ResultListFilesParams>())
    }
}
