package com.hiddenlayer.api.lib;

import com.hiddenlayer.api.core.HiddenLayerException;
import com.hiddenlayer.api.resources.scans.jobs.requests.ScanJobRequest;
import com.hiddenlayer.api.resources.scans.jobs.types.ScanJobRequestAccess;
import com.hiddenlayer.api.resources.scans.jobs.types.ScanJobRequestAccessSource;
import com.hiddenlayer.api.types.ScanJob;
import com.hiddenlayer.api.types.ScanJobInventory;
import com.hiddenlayer.api.types.ScanJobRequestSource;

/** What the synchronous and asynchronous community scanners share. */
final class CommunityScans {
    private CommunityScans() {}

    static ScanJobRequest jobRequest(CommunityScanOptions options) {
        return ScanJobRequest.builder()
                .inventory(ScanJobInventory.builder()
                        .modelName(options.getModelName())
                        .modelVersion(options.getModelVersion())
                        .requestingEntity(options.getRequestSource())
                        .origin(options.getOrigin())
                        .requestSource(ScanJobRequestSource.valueOf(options.getRequestSource()))
                        .requestedScanLocation(options.getModelPath())
                        .build())
                .access(ScanJobRequestAccess.builder()
                        .source(ScanJobRequestAccessSource.valueOf(options.getModelSource()))
                        .build())
                .build();
    }

    static String scanId(ScanJob scanJob) {
        return scanJob.getScanId()
                .orElseThrow(() -> new HiddenLayerException("Scan ID not returned from scan request"));
    }
}
