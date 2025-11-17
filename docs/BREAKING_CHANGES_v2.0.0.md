# Breaking Changes: v1.1.1 to v2.0.0

This document outlines the breaking changes introduced in version 2.0.0 of the HiddenLayer Java SDK.

## Overview

Version 2.0.0 introduces significant API changes to align with updated backend specifications. The changes primarily affect:
- Scan job response models
- Scan request parameters
- Interaction analysis responses
- Model query parameters

## Summary of Critical Breaking Changes

| Area | Change | Impact | Action Required |
|------|--------|--------|-----------------|
| **ScanReport** | `summary()` now required (was Optional) | HIGH | Remove Optional unwrapping - always access directly |
| **JobListResponse** | `items()` returns `List<Item>` instead of `List<ScanReport>` | HIGH | Update type references and migrate to `summary()` for statistics |
| **Item/ScanReport** | Fields like `detectionCount()`, `severity()` deprecated | HIGH | Use `summary().detectionCount()`, `summary().highestSeverity()` |
| **JobRequestParams** | `requestedScanLocation()` now Optional | HIGH | Handle as Optional or use new `scanTarget()` |
| **Upload Responses** | `scanId()` now required (not Optional) | MEDIUM | Remove Optional unwrapping - simpler code |
| **InteractionAnalyzeResponse** | New `evaluation()` field added | MEDIUM | Add handling for new evaluation data |

## Breaking Changes by Category

### 1. JobListResponse Model Changes

**Impact:** HIGH - Affects all code that processes scan job lists

#### Type Changes
- **Changed:** `items()` return type changed from `List<ScanReport>` to `List<Item>`
  - The response now uses a new nested `Item` class instead of directly using `ScanReport`
  - `Item` is structurally similar to `ScanReport` but with deprecated fields and new summary structure

#### Deprecated Fields in Item Class
The following fields in the `Item` class (used in job list responses) are now deprecated:

- `detectionCount()` - **DEPRECATED**: Use `summary().detectionCount()` instead
- `fileCount()` - **DEPRECATED**: Use `summary().fileCount()` instead  
- `filesWithDetectionsCount()` - **DEPRECATED**: Use `summary().filesWithDetectionsCount()` instead
- `detectionCategories()` - **DEPRECATED**: Use `summary().detectionCategories()` instead
- `severity()` - **DEPRECATED**: Use `summary().highestSeverity()` instead

**Migration Path:**
```java
// Old (v1.1.1)
JobListResponse response = client.scans().jobs().list();
for (ScanReport report : response.items()) {
    long count = report.detectionCount();
    String severity = report.severity().asString();
}

// New (v2.0.0)
JobListResponse response = client.scans().jobs().list();
for (JobListResponse.Item item : response.items()) {
    // Use deprecated methods (will be removed in future)
    long count = item.detectionCount(); // Deprecated
    
    // Or migrate to new summary structure (recommended)
    long count = item.summary().detectionCount().orElse(0L);
    String severity = item.summary().highestSeverity()
        .map(s -> s.asString())
        .orElse("unknown");
}
```

#### New Fields in Item Class
- `summary()` - **NEW**: Returns a `Summary` object containing:
  - `detectionCategories()` - List of unique detection categories (Optional)
  - `detectionCount()` - Total number of detections (Optional)
  - `fileCount()` - Total number of files scanned (Optional)
  - `filesFailedToScan()` - Number of files that failed (Optional)
  - `filesWithDetectionsCount()` - Number of files with detections (Optional)
  - `highestSeverity()` - Highest severity (replaces top-level `severity`) (Optional)
  - `severity()` - Deprecated, use `highestSeverity()` (Optional)
  - `unknownFiles()` - Number of files with unknown type (Optional)

- `compliance()` - **NEW**: Optional compliance information
- `schemaVersion()` - **NEW**: Version of the scan report schema format (Optional)
- `hasGenealogy()` - **NEW**: Indicates if model genealogy info is available (Optional)

### 2. JobRequestParams Model Changes

**Impact:** HIGH - Affects scan job creation

#### Field Requirement Changes
- **Changed:** `requestedScanLocation()` is now **Optional** (was required)
  - Previously: `fun requestedScanLocation(): String`
  - Now: `fun requestedScanLocation(): Optional<String>`

#### New Fields
- **NEW:** `scanTarget()` - Optional `ScanTarget` object with nested structure:
  - `deepScan()` - Optional deep scan configuration
    - `fileLocation()` - Optional file location
    - `files()` - Optional list of `File` objects
      - `fileLocation()` - Required file location string
      - `fileNameAlias()` - Optional file name alias
  - `providerDetails()` - Optional provider details

**Migration Path:**
```java
// Old (v1.1.1)
JobRequestParams params = JobRequestParams.builder()
    .requestedScanLocation("/path/to/model")
    .build();

// New (v2.0.0)
// Option 1: Still use requestedScanLocation (now optional)
JobRequestParams params = JobRequestParams.builder()
    .requestedScanLocation("/path/to/model")
    .build();

// Option 2: Use new scanTarget structure
JobRequestParams params = JobRequestParams.builder()
    .scanTarget(
        JobRequestParams.ScanTarget.builder()
            .deepScan(
                JobRequestParams.ScanTarget.DeepScan.builder()
                    .fileLocation("/path/to/model")
                    .build()
            )
            .build()
    )
    .build();
```

### 3. ScanReport Model Changes

**Impact:** HIGH - Affects code that directly works with scan reports

The `ScanReport` model has undergone significant internal restructuring with similar changes to `JobListResponse.Item`:

#### Field Requirement Changes (BREAKING)
- **Changed:** `summary()` is now **required** (was Optional)
  - Previously: `fun summary(): Optional<Summary>`
  - Now: `fun summary(): Summary`

This is a **critical breaking change**. Code that previously checked if `summary()` was present must be updated.

**Migration Path:**
```java
// Old (v1.1.1)
ScanReport report = client.scans().results().sarif(params);
report.summary().ifPresent(summary -> {
    long count = summary.detectionCount().orElse(0L);
    // ... process summary
});

// New (v2.0.0)
ScanReport report = client.scans().results().sarif(params);
// summary() is always present - no Optional unwrapping
ScanReport.Summary summary = report.summary();
long count = summary.detectionCount().orElse(0L);
```

#### Deprecated Fields
- `detectionCount()` - **DEPRECATED**: Use `summary().detectionCount()` instead
- `fileCount()` - **DEPRECATED**: Use `summary().fileCount()` instead
- `filesWithDetectionsCount()` - **DEPRECATED**: Use `summary().filesWithDetectionsCount()` instead
- `detectionCategories()` - **DEPRECATED**: Use `summary().detectionCategories()` instead
- `severity()` - **DEPRECATED**: Use `summary().highestSeverity()` instead

#### New Fields
- `summary()` - **CHANGED**: Now required (was Optional); contains all scan statistics
- `compliance()` - **NEW**: Optional compliance information
- `schemaVersion()` - **NEW**: Schema version information
- `hasGenealogy()` - **NEW**: Genealogy availability flag

#### Removed Fields
- `highestSeverity()` - **REMOVED**: Moved into `summary().highestSeverity()`

### 4. InteractionAnalyzeResponse Model Changes

**Impact:** MEDIUM - Affects prompt analyzer integration

#### New Fields
- **NEW:** `evaluation()` - Optional `Evaluation` object containing:
  - `action()` - Required `Action` enum (ALLOW, BLOCK, WARN)
  - `hasDetections()` - Required boolean indicating if detections were found
  - `threatLevel()` - Required `ThreatLevel` enum (LOW, MEDIUM, HIGH, CRITICAL)

**Migration Path:**
```java
// Old (v1.1.1)
InteractionAnalyzeResponse response = client.interactions().analyze(params);
// No evaluation field existed

// New (v2.0.0)
InteractionAnalyzeResponse response = client.interactions().analyze(params);
response.evaluation().ifPresent(eval -> {
    boolean blocked = eval.action().known() == 
        InteractionAnalyzeResponse.Evaluation.Action.Known.BLOCK;
    boolean hasDetections = eval.hasDetections();
    String level = eval.threatLevel().asString();
});
```

### 5. Upload Response Model Changes

**Impact:** MEDIUM - Affects scan upload workflows

#### Field Requirement Changes
The `scanId()` field is now **required** (was Optional) in multiple upload-related response classes:

- `UploadStartResponse.scanId()`
- `UploadCompleteAllResponse.scanId()`
- `FileCompleteResponse.scanId()`

**Previous signature:** `fun scanId(): Optional<String>`  
**New signature:** `fun scanId(): String`

This is a **positive breaking change** that simplifies the API - `scanId` is always present in these responses.

**Migration Path:**
```java
// Old (v1.1.1)
UploadStartResponse response = client.scans().upload().start(params);
String scanId = response.scanId().orElseThrow(
    () -> new RuntimeException("Upload start did not return scan ID")
);

// New (v2.0.0) - Simpler!
UploadStartResponse response = client.scans().upload().start(params);
String scanId = response.scanId(); // No Optional unwrapping needed

// Same applies to:
// - UploadCompleteAllResponse.scanId()
// - FileCompleteResponse.scanId()
```

### 6. Query Parameter Changes

**Impact:** LOW to MEDIUM - Affects filtering and pagination

Multiple parameter classes now support additional query parameters. These are additive changes but may affect serialization/deserialization if you're using custom JSON handling.

#### Affected Files
- `ModelDeleteParams.kt`
- `ModelRetrieveParams.kt`
- `CardListParams.kt`
- `JobListParams.kt`
- `JobRetrieveParams.kt`
- `ResultSarifParams.kt`
- `UploadCompleteAllParams.kt`
- `UploadStartParams.kt`
- `FileCompleteParams.kt`
- `SensorCreateParams.kt`
- `SensorDeleteParams.kt`
- `SensorQueryParams.kt`
- `SensorRetrieveParams.kt`
- `SensorUpdateParams.kt`

Changes are primarily internal query parameter handling improvements.

## Non-Breaking Changes

### Additive Changes (Non-Breaking)
- New optional fields added to existing models (backward compatible)
- New enum values for extensibility
- Improved documentation strings

### Internal Changes
- Enhanced JSON field validation
- Better support for unknown/future enum values
- Improved builder patterns with validation

## Testing Changes

The test suite has been updated significantly:
- 80 files changed
- 12,615 insertions
- 8,188 deletions

Key test updates include:
- Updated test fixtures for new model structures
- Added tests for new `evaluation` field in interaction responses
- Updated tests for deprecated field handling
- New tests for `scanTarget` structure

## Recommendations

### Immediate Actions Required

1. **Update ScanReport processing (CRITICAL):**
   - **Breaking:** Remove Optional unwrapping for `summary()` - it's now always present
   - Change `report.summary().ifPresent(...)` to direct access: `report.summary()`
   - Migrate from deprecated fields to new `summary()` structure

2. **Update JobListResponse handling:**
   - Change code expecting `List<ScanReport>` to handle `List<JobListResponse.Item>`
   - Migrate from deprecated top-level statistics to `summary()` object

3. **Update JobRequestParams usage:**
   - Ensure code handles `requestedScanLocation()` as Optional
   - Consider migrating to new `scanTarget` structure for better flexibility

4. **Update Upload Response handling:**
   - Remove Optional unwrapping for `scanId()` in:
     - `UploadStartResponse.scanId()`
     - `UploadCompleteAllResponse.scanId()`
     - `FileCompleteResponse.scanId()`
   - This simplifies code as the field is always present

5. **Update InteractionAnalyzeResponse handling:**
   - Add support for new `evaluation()` field if using prompt analysis

### Migration Timeline

- **Deprecated fields** are still available but marked with `@Deprecated`
- Plan to remove deprecated fields in a future major version (likely v3.0.0)
- New code should use `summary()` structure instead of deprecated fields

### Validation

After upgrading, verify:
1. **Critical:** All `ScanReport.summary()` calls are updated to access directly (not as Optional)
2. All scan job list processing works correctly with new `Item` type
3. Scan job creation requests still function with Optional `requestedScanLocation()`
4. Statistics and detection counts are retrieved from correct location (within `summary()`)
5. Upload workflows work with required `scanId()` fields
6. Interaction analysis responses are properly handled
7. All tests pass

## Version Information

- **Old Version:** v1.1.1
- **New Version:** v2.0.0
