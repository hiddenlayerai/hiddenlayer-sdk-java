

# FileResultV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileLocation** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**startTime** | **Long** |  |  [optional] |
|**endTime** | **Long** |  |  [optional] |
|**details** | **FileDetailsV3** |  |  [optional] |
|**seen** | **Long** |  |  [optional] |
|**detections** | [**List&lt;ScanDetectionV31&gt;**](ScanDetectionV31.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;done&quot; |
| RUNNING | &quot;running&quot; |
| FAILED | &quot;failed&quot; |
| PENDING | &quot;pending&quot; |
| CANCELED | &quot;canceled&quot; |
| SKIPPED | &quot;skipped&quot; |



