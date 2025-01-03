

# FileScanReportV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileInstanceId** | **String** | unique ID of the file |  |
|**fileLocation** | **String** | full file path |  |
|**startTime** | **OffsetDateTime** | time the scan started |  |
|**endTime** | **OffsetDateTime** | time the scan ended |  |
|**details** | [**FileDetailsV3**](FileDetailsV3.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | status of the scan |  |
|**seen** | **OffsetDateTime** | time the scan was seen at |  |
|**detections** | [**List&lt;ScanDetectionV3&gt;**](ScanDetectionV3.md) |  |  [optional] |
|**fileResults** | [**List&lt;FileScanReportV3&gt;**](FileScanReportV3.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SKIPPED | &quot;skipped&quot; |
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| FAILED | &quot;failed&quot; |
| CANCELED | &quot;canceled&quot; |



