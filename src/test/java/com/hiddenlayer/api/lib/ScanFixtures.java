package com.hiddenlayer.api.lib;

/** The scan API's responses, as JSON, for the tests of the scan helpers. */
public final class ScanFixtures {
    public static final String SCAN_ID = "c70523e0-6bf5-4405-acda-e30c4aece957";

    public static final String SUMMARY_PATH = "/scan/v3/results/" + SCAN_ID + "/summary";

    public static final String FILES_PATH = "/scan/v3/results/" + SCAN_ID + "/files";

    public static final String NOT_FOUND = "{\"detail\":\"scan not found\"}";

    private static final ScanPacing IMMEDIATE = new ScanPacing() {
        @Override
        public long pageDelayMillis() {
            return 0;
        }

        @Override
        public long availabilityDelayMillis(int attempt) {
            return 0;
        }

        @Override
        public long pollDelayMillis(int attempt) {
            return 0;
        }
    };

    private ScanFixtures() {}

    static ScanPacing immediate() {
        return IMMEDIATE;
    }

    /** A scan summary of two files, one of them with a detection. */
    public static String summary(String status) {
        return "{\"version\":\"3\",\"scan_id\":\"" + SCAN_ID + "\",\"start_time\":\"2026-11-20T14:03:11Z\","
                + "\"status\":\"" + status + "\","
                + "\"inventory\":{\"model_name\":\"fraud-detector\",\"model_version\":\"7\","
                + "\"requested_scan_location\":\"/models/fraud-detector\","
                + "\"model_id\":\"8f2a1c9e-3b47-4f0d-9a51-6d2c8e7b4a10\","
                + "\"model_version_id\":\"1d9e4b7a-52c3-4e88-b0f6-3a7c9d2e5f41\"},"
                + "\"summary\":{\"detection_count\":1,\"file_count\":2,\"files_with_detections_count\":1,"
                + "\"detection_categories\":[\"Arbitrary Code Execution\"],\"severity\":\"high\"}}";
    }

    /** A page of file results at the given locations, followed by the page at {@code nextCursor}. */
    public static String filesPage(String nextCursor, String... fileLocations) {
        StringBuilder items = new StringBuilder();
        for (String fileLocation : fileLocations) {
            if (items.length() > 0) {
                items.append(',');
            }
            items.append("{\"file_instance_id\":\"instance-")
                    .append(fileLocation)
                    .append("\",\"file_location\":\"")
                    .append(fileLocation)
                    .append("\",\"start_time\":\"2026-11-20T14:03:12Z\",\"end_time\":\"2026-11-20T14:03:15Z\",")
                    .append("\"details\":{\"estimated_time\":\"3s\",\"sha256\":")
                    .append("\"9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08\",")
                    .append("\"file_type\":\"pickle\"},\"status\":\"done\",\"seen\":\"2026-11-20T14:03:12Z\",")
                    .append("\"compliance\":{\"status\":\"COMPLIANT\"}}");
        }
        return "{\"items\":[" + items + "],\"next\":\"" + nextCursor + "\",\"prev\":\"\",\"first\":\"first-cursor\"}";
    }
}
