

# ScanResultsV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scanId** | **UUID** |  |  [optional] |
|**startTime** | **Long** |  |  [optional] |
|**endTime** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**inventory** | **InventoryV3** |  |  [optional] |
|**fileResults** | [**List&lt;FileResultV3&gt;**](FileResultV3.md) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DONE | &quot;done&quot; |
| RUNNING | &quot;running&quot; |
| FAILED | &quot;failed&quot; |
| PENDING | &quot;pending&quot; |
| CANCELED | &quot;canceled&quot; |



