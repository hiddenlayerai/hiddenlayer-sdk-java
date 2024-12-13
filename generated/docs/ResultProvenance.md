

# ResultProvenance

Contains information about how and when a result was detected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstDetectionTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the result was first detected. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format. |  [optional] |
|**lastDetectionTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the result was most recently detected. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format. |  [optional] |
|**firstDetectionRunGuid** | **String** | A GUID-valued string equal to the automationDetails.guid property of the run in which the result was first detected. |  [optional] |
|**lastDetectionRunGuid** | **String** | A GUID-valued string equal to the automationDetails.guid property of the run in which the result was most recently detected. |  [optional] |
|**invocationIndex** | **Integer** | The index within the run.invocations array of the invocation object which describes the tool invocation that detected the result. |  [optional] |
|**conversionSources** | [**Set&lt;PhysicalLocation&gt;**](PhysicalLocation.md) | An array of physicalLocation objects which specify the portions of an analysis tool&#39;s output that a converter transformed into the result. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



