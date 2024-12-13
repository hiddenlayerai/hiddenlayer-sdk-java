

# ReportingConfiguration

Information about a rule or notification that can be configured at runtime.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Specifies whether the report may be produced during the scan. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | Specifies the failure level for the report. |  [optional] |
|**rank** | **BigDecimal** | Specifies the relative priority of the report. Used for analysis output only. |  [optional] |
|**parameters** | **PropertyBag** |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| NOTE | &quot;note&quot; |
| WARNING | &quot;warning&quot; |
| ERROR | &quot;error&quot; |



