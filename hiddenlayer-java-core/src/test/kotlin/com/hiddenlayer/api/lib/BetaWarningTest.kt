package com.hiddenlayer.api.lib

import java.util.Collections
import java.util.logging.Handler
import java.util.logging.LogRecord
import java.util.logging.Logger
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class BetaWarningTest {

    private val logRecords: MutableList<LogRecord> =
        Collections.synchronizedList(mutableListOf<LogRecord>())

    private val handler =
        object : Handler() {
            override fun publish(record: LogRecord) {
                logRecords.add(record)
            }

            override fun flush() {}

            override fun close() {}
        }

    private val logger = Logger.getLogger(BetaWarning::class.java.name)

    @BeforeEach
    fun setUp() {
        logRecords.clear()
        logger.addHandler(handler)
    }

    @AfterEach
    fun tearDown() {
        logger.removeHandler(handler)
        logRecords.clear()
    }

    @Test
    fun warnBeta_emitsWarningOnFirstCall() {
        BetaWarning.warnBeta("Test1.firstCall")

        val relevant = logRecords.filter { it.message.contains("Test1.firstCall") }
        assertThat(relevant).hasSize(1)
        assertThat(relevant[0].message)
            .isEqualTo(
                "[BETA] Test1.firstCall: This endpoint is not GA or Production ready and is" +
                    " subject to changes at any time. Breaking changes may occur."
            )
    }

    @Test
    fun warnBeta_doesNotEmitDuplicateWarnings() {
        BetaWarning.warnBeta("Test2.dedup")
        BetaWarning.warnBeta("Test2.dedup")
        BetaWarning.warnBeta("Test2.dedup")

        val relevant = logRecords.filter { it.message.contains("Test2.dedup") }
        assertThat(relevant).hasSize(1)
    }

    @Test
    fun warnBeta_emitsSeparateWarningsForDifferentMethods() {
        BetaWarning.warnBeta("Test3.alpha")
        BetaWarning.warnBeta("Test3.bravo")

        val alpha = logRecords.filter { it.message.contains("Test3.alpha") }
        val bravo = logRecords.filter { it.message.contains("Test3.bravo") }
        assertThat(alpha).hasSize(1)
        assertThat(bravo).hasSize(1)
    }
}
