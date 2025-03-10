

# ScanDetectionV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | detection description |  |
|**risk** | [**RiskEnum**](#RiskEnum) | detection risk |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | detection severity |  |
|**detectionId** | **String** | unique identifier for the detection |  |
|**impact** | **String** | detection impact |  [optional] |
|**likelihood** | **String** | detection likelihood |  [optional] |
|**ruleDetails** | [**List&lt;RuleDetailsInner&gt;**](RuleDetailsInner.md) |  |  [optional] |
|**ruleId** | **String** | unique identifier for the rule that sourced the detection |  |
|**category** | **String** | Vulnerability category for the detection |  |
|**mitreAtlas** | [**List&lt;MITREAtlasInner&gt;**](MITREAtlasInner.md) |  |  |
|**owasp** | **List&lt;String&gt;** |  |  |
|**cve** | **List&lt;String&gt;** |  |  [optional] |
|**cwe** | **String** |  |  [optional] |
|**cweHref** | **String** | CWE URL for the detection |  [optional] |
|**technicalBlogHref** | **String** | Hiddenlayer Technical Blog URL for the detection |  [optional] |



## Enum: RiskEnum

| Name | Value |
|---- | -----|
| MALICIOUS | &quot;MALICIOUS&quot; |
| SUSPICIOUS | &quot;SUSPICIOUS&quot; |
| BENIGN | &quot;BENIGN&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



