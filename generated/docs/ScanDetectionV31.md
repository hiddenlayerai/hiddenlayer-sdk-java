

# ScanDetectionV31


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**detectionId** | **UUID** | unique identifier for the detection |  |
|**ruleId** | **String** | unique identifier for the rule that sourced the detection |  |
|**risk** | [**RiskEnum**](#RiskEnum) | detection risk |  |
|**category** | **String** | Vulnerability category for the detection |  |
|**description** | **String** | detection description |  |
|**likelihood** | **String** | detection likelihood |  |
|**impact** | **String** | detection impact |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) | detection severity |  |
|**ruleDetails** | [**List&lt;RuleDetailsInner&gt;**](RuleDetailsInner.md) |  |  [optional] |
|**mitreAtlas** | [**List&lt;MITREAtlasInner&gt;**](MITREAtlasInner.md) |  |  |
|**owasp** | **List&lt;String&gt;** |  |  |
|**cve** | **List&lt;String&gt;** |  |  |
|**cwe** | **String** |  |  |
|**cweHref** | **String** | CWE URL for the detection |  |
|**technicalBlogHrefs** | **List&lt;String&gt;** | Hiddenlayer Technical Blog URLs for the detection |  [optional] |
|**technicalBlogHref** | **String** | Hiddenlayer Technical Blog URL for the detection |  [optional] |



## Enum: RiskEnum

| Name | Value |
|---- | -----|
| MALICIOUS | &quot;MALICIOUS&quot; |
| SUSPICIOUS | &quot;SUSPICIOUS&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| CRITICAL | &quot;critical&quot; |



