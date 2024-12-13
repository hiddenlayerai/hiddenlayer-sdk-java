

# Conversion

Describes how a converter transformed the output of a static analysis tool from the analysis tool's native output format into the SARIF format.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tool** | [**Tool**](Tool.md) |  |  |
|**invocation** | [**Invocation**](Invocation.md) |  |  [optional] |
|**analysisToolLogFiles** | [**Set&lt;ArtifactLocation&gt;**](ArtifactLocation.md) | The locations of the analysis tool&#39;s per-run log files. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



