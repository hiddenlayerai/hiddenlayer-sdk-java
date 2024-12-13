

# Notification

Describes a condition relevant to the tool itself, as opposed to being relevant to a target being analyzed by the tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**locations** | [**Set&lt;Location&gt;**](Location.md) | The locations relevant to this notification. |  [optional] |
|**message** | [**Message**](Message.md) |  |  |
|**level** | [**LevelEnum**](#LevelEnum) | A value specifying the severity level of the notification. |  [optional] |
|**threadId** | **Integer** | The thread identifier of the code that generated the notification. |  [optional] |
|**timeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification. |  [optional] |
|**exception** | [**SarifException**](SarifException.md) |  |  [optional] |
|**descriptor** | [**ReportingDescriptorReference**](ReportingDescriptorReference.md) |  |  [optional] |
|**associatedRule** | [**ReportingDescriptorReference**](ReportingDescriptorReference.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| NOTE | &quot;note&quot; |
| WARNING | &quot;warning&quot; |
| ERROR | &quot;error&quot; |



