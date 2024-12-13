

# Run

Describes a single run of an analysis tool, and contains the reported output of that run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tool** | [**Tool**](Tool.md) |  |  |
|**invocations** | [**List&lt;Invocation&gt;**](Invocation.md) | Describes the invocation of the analysis tool. |  [optional] |
|**conversion** | [**Conversion**](Conversion.md) |  |  [optional] |
|**language** | **String** | The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase culture code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646). |  [optional] |
|**versionControlProvenance** | [**Set&lt;VersionControlDetails&gt;**](VersionControlDetails.md) | Specifies the revision in version control of the artifacts that were scanned. |  [optional] |
|**originalUriBaseIds** | [**Map&lt;String, ArtifactLocation&gt;**](ArtifactLocation.md) | The artifact location specified by each uriBaseId symbol on the machine where the tool originally ran. |  [optional] |
|**artifacts** | [**Set&lt;Artifact&gt;**](Artifact.md) | An array of artifact objects relevant to the run. |  [optional] |
|**logicalLocations** | [**Set&lt;LogicalLocation&gt;**](LogicalLocation.md) | An array of logical locations such as namespaces, types or functions. |  [optional] |
|**graphs** | [**Set&lt;Graph&gt;**](Graph.md) | An array of zero or more unique graph objects associated with the run. |  [optional] |
|**results** | [**List&lt;Result&gt;**](Result.md) | The set of results contained in an SARIF log. The results array can be omitted when a run is solely exporting rules metadata. It must be present (but may be empty) if a log file represents an actual scan. |  [optional] |
|**automationDetails** | [**RunAutomationDetails**](RunAutomationDetails.md) |  |  [optional] |
|**runAggregates** | [**Set&lt;RunAutomationDetails&gt;**](RunAutomationDetails.md) | Automation details that describe the aggregate of runs to which this run belongs. |  [optional] |
|**baselineGuid** | **String** | The &#39;guid&#39; property of a previous SARIF &#39;run&#39; that comprises the baseline that was used to compute result &#39;baselineState&#39; properties for the run. |  [optional] |
|**redactionTokens** | **Set&lt;String&gt;** | An array of strings used to replace sensitive information in a redaction-aware property. |  [optional] |
|**defaultEncoding** | **String** | Specifies the default encoding for any artifact object that refers to a text file. |  [optional] |
|**defaultSourceLanguage** | **String** | Specifies the default source language for any artifact object that refers to a text file that contains source code. |  [optional] |
|**newlineSequences** | **Set&lt;String&gt;** | An ordered list of character sequences that were treated as line breaks when computing region information for the run. |  [optional] |
|**columnKind** | [**ColumnKindEnum**](#ColumnKindEnum) | Specifies the unit in which the tool measures columns. |  [optional] |
|**externalPropertyFileReferences** | [**ExternalPropertyFileReferences**](ExternalPropertyFileReferences.md) |  |  [optional] |
|**threadFlowLocations** | [**Set&lt;ThreadFlowLocation&gt;**](ThreadFlowLocation.md) | An array of threadFlowLocation objects cached at run level. |  [optional] |
|**taxonomies** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | An array of toolComponent objects relevant to a taxonomy in which results are categorized. |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) | Addresses associated with this run instance, if any. |  [optional] |
|**translations** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | The set of available translations of the localized data provided by the tool. |  [optional] |
|**policies** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | Contains configurations that may potentially override both reportingDescriptor.defaultConfiguration (the tool&#39;s default severities) and invocation.configurationOverrides (severities established at run-time from the command line). |  [optional] |
|**webRequests** | [**Set&lt;WebRequest&gt;**](WebRequest.md) | An array of request objects cached at run level. |  [optional] |
|**webResponses** | [**Set&lt;WebResponse&gt;**](WebResponse.md) | An array of response objects cached at run level. |  [optional] |
|**specialLocations** | [**SpecialLocations**](SpecialLocations.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: ColumnKindEnum

| Name | Value |
|---- | -----|
| UTF16CODEUNITS | &quot;utf16CodeUnits&quot; |
| UNICODECODEPOINTS | &quot;unicodeCodePoints&quot; |



