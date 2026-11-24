package com.hiddenlayer.api.lib;

import java.util.concurrent.ThreadLocalRandom;

/** How long the scan helpers wait between reads of a scan. */
interface ScanPacing {
    long MAX_POLL_DELAY_MILLIS = 30_000;

    ScanPacing DEFAULT = new ScanPacing() {
        // Throttles reading a scan of many thousands of files, so the SDK never reads pages back to back.
        @Override
        public long pageDelayMillis() {
            return 250;
        }

        @Override
        public long availabilityDelayMillis(int attempt) {
            return 500L * attempt + ThreadLocalRandom.current().nextLong(500);
        }

        @Override
        public long pollDelayMillis(int attempt) {
            // 100ms doubled per attempt passes the cap at the ninth; shifting further would overflow.
            long backoff = attempt < 9 ? 100L << attempt : MAX_POLL_DELAY_MILLIS;
            return Math.min(backoff + ThreadLocalRandom.current().nextLong(1000), MAX_POLL_DELAY_MILLIS);
        }
    };

    /** The pause between two pages of a scan's file results. */
    long pageDelayMillis();

    /** The pause before reading again a scan that wasn't found, after {@code attempt} tries. */
    long availabilityDelayMillis(int attempt);

    /** The pause before polling again a scan that hasn't finished, after {@code attempt} polls. */
    long pollDelayMillis(int attempt);
}
