

# ScanJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | [**ScanJobAccess**](ScanJobAccess.md) |  |  [optional] |
|**inventory** | [**ScanModelDetailsV31**](ScanModelDetailsV31.md) |  |  [optional] |
|**scanId** | **UUID** | unique identifier for the scan |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the scan |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| FAILED | &quot;failed&quot; |
| CANCELED | &quot;canceled&quot; |



