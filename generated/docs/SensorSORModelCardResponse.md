

# SensorSORModelCardResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelId** | **UUID** |  |  |
|**createdAt** | **Long** | Unix Nano Epoch |  |
|**plaintextName** | **String** |  |  |
|**activeVersions** | **List&lt;Integer&gt;** |  |  |
|**source** | **String** |  |  |
|**tags** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**modelScanThreatLevel** | [**ModelScanThreatLevelEnum**](#ModelScanThreatLevelEnum) |  |  [optional] |
|**attackMonitoringThreatLevel** | [**AttackMonitoringThreatLevelEnum**](#AttackMonitoringThreatLevelEnum) |  |  [optional] |
|**securityPosture** | [**SecurityPosture**](SecurityPosture.md) |  |  [optional] |



## Enum: ModelScanThreatLevelEnum

| Name | Value |
|---- | -----|
| SAFE | &quot;safe&quot; |
| UNSAFE | &quot;unsafe&quot; |
| SUSPICIOUS | &quot;suspicious&quot; |
| NOT_AVAILABLE | &quot;not available&quot; |



## Enum: AttackMonitoringThreatLevelEnum

| Name | Value |
|---- | -----|
| SAFE | &quot;safe&quot; |
| UNSAFE | &quot;unsafe&quot; |
| SUSPICIOUS | &quot;suspicious&quot; |
| NOT_AVAILABLE | &quot;not available&quot; |



