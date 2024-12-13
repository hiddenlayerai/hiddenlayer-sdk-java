

# Sarif210

Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema: a standard format for the output of static analysis tools.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | The URI of the JSON schema corresponding to the version. |  [optional] |
|**version** | [**VersionEnum**](#VersionEnum) | The SARIF format version of this log file. |  |
|**runs** | [**List&lt;Run&gt;**](Run.md) | The set of runs contained in this log file. |  |
|**inlineExternalProperties** | [**Set&lt;ExternalProperties&gt;**](ExternalProperties.md) | References to external property files that share data between runs. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| _2_1_0 | &quot;2.1.0&quot; |



