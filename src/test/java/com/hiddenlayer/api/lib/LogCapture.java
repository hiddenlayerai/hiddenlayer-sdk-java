package com.hiddenlayer.api.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/** Collects what a {@code java.util.logging} logger logs while a test runs. */
public final class LogCapture extends Handler implements AutoCloseable {
    private final Logger logger;

    private final List<LogRecord> records = Collections.synchronizedList(new ArrayList<LogRecord>());

    public LogCapture(String loggerName) {
        this.logger = Logger.getLogger(loggerName);
        this.logger.addHandler(this);
    }

    /** The messages logged at {@code level} that contain {@code text}. */
    public List<String> messages(Level level, String text) {
        List<String> matching = new ArrayList<>();
        synchronized (records) {
            for (LogRecord record : records) {
                if (record.getLevel().equals(level) && record.getMessage().contains(text)) {
                    matching.add(record.getMessage());
                }
            }
        }
        return matching;
    }

    @Override
    public void publish(LogRecord record) {
        records.add(record);
    }

    @Override
    public void flush() {}

    @Override
    public void close() {
        logger.removeHandler(this);
    }
}
