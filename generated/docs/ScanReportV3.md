

# ScanReportV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileCount** | **Integer** | number of files scanned |  |
|**filesWithDetectionsCount** | **Integer** | number of files with detections found |  |
|**detectionCount** | **Integer** | number of detections found |  |
|**detectionCategories** | **List&lt;String&gt;** | list of detection categories found |  [optional] |
|**inventory** | [**ModelInventoryInfo**](ModelInventoryInfo.md) |  |  |
|**version** | **String** | scanner version |  |
|**scanId** | **String** | unique identifier for the scan |  |
|**startTime** | **OffsetDateTime** | time the scan started |  |
|**endTime** | **OffsetDateTime** | time the scan ended |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | status of the scan |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) | detection severity |  [optional] |
|**fileResults** | [**List&lt;FileScanReportV3&gt;**](FileScanReportV3.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| FAILED | &quot;failed&quot; |
| CANCELED | &quot;canceled&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |
| SAFE | &quot;safe&quot; |
| UNKNOWN | &quot;unknown&quot; |



