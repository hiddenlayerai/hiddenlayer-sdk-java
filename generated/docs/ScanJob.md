

# ScanJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scanId** | **UUID** | unique identifier for the scan |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the scan |  [optional] [readonly] |
|**inventory** | [**ScanJobInventory**](ScanJobInventory.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| DONE | &quot;done&quot; |
| FAILED | &quot;failed&quot; |
| CANCELED | &quot;canceled&quot; |



