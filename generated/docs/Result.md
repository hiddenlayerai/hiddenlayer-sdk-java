

# Result

A result produced by an analysis tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleId** | **String** | The stable, unique identifier of the rule, if any, to which this result is relevant. |  [optional] |
|**ruleIndex** | **Integer** | The index within the tool component rules array of the rule object associated with this result. |  [optional] |
|**rule** | [**ReportingDescriptorReference**](ReportingDescriptorReference.md) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | A value that categorizes results by evaluation state. |  [optional] |
|**level** | [**LevelEnum**](#LevelEnum) | A value specifying the severity level of the result. |  [optional] |
|**message** | [**Message**](Message.md) |  |  |
|**analysisTarget** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**locations** | [**List&lt;Location&gt;**](Location.md) | The set of locations where the result was detected. Specify only one location unless the problem indicated by the result can only be corrected by making a change at every specified location. |  [optional] |
|**guid** | **String** | A stable, unique identifier for the result in the form of a GUID. |  [optional] |
|**correlationGuid** | **String** | A stable, unique identifier for the equivalence class of logically identical results to which this result belongs, in the form of a GUID. |  [optional] |
|**occurrenceCount** | **Integer** | A positive integer specifying the number of times this logically unique result was observed in this run. |  [optional] |
|**partialFingerprints** | **Map&lt;String, String&gt;** | A set of strings that contribute to the stable, unique identity of the result. |  [optional] |
|**fingerprints** | **Map&lt;String, String&gt;** | A set of strings each of which individually defines a stable, unique identity for the result. |  [optional] |
|**stacks** | [**Set&lt;Stack&gt;**](Stack.md) | An array of &#39;stack&#39; objects relevant to the result. |  [optional] |
|**codeFlows** | [**List&lt;CodeFlow&gt;**](CodeFlow.md) | An array of &#39;codeFlow&#39; objects relevant to the result. |  [optional] |
|**graphs** | [**Set&lt;Graph&gt;**](Graph.md) | An array of zero or more unique graph objects associated with the result. |  [optional] |
|**graphTraversals** | [**Set&lt;GraphTraversal&gt;**](GraphTraversal.md) | An array of one or more unique &#39;graphTraversal&#39; objects. |  [optional] |
|**relatedLocations** | [**Set&lt;Location&gt;**](Location.md) | A set of locations relevant to this result. |  [optional] |
|**suppressions** | [**Set&lt;Suppression&gt;**](Suppression.md) | A set of suppressions relevant to this result. |  [optional] |
|**baselineState** | [**BaselineStateEnum**](#BaselineStateEnum) | The state of a result relative to a baseline of a previous run. |  [optional] |
|**rank** | **BigDecimal** | A number representing the priority or importance of the result. |  [optional] |
|**attachments** | [**Set&lt;Attachment&gt;**](Attachment.md) | A set of artifacts relevant to the result. |  [optional] |
|**hostedViewerUri** | **URI** | An absolute URI at which the result can be viewed. |  [optional] |
|**workItemUris** | **Set&lt;URI&gt;** | The URIs of the work items associated with this result. |  [optional] |
|**provenance** | [**ResultProvenance**](ResultProvenance.md) |  |  [optional] |
|**fixes** | [**Set&lt;Fix&gt;**](Fix.md) | An array of &#39;fix&#39; objects, each of which represents a proposed fix to the problem indicated by the result. |  [optional] |
|**taxa** | [**Set&lt;ReportingDescriptorReference&gt;**](ReportingDescriptorReference.md) | An array of references to taxonomy reporting descriptors that are applicable to the result. |  [optional] |
|**webRequest** | [**WebRequest**](WebRequest.md) |  |  [optional] |
|**webResponse** | [**WebResponse**](WebResponse.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| NOTAPPLICABLE | &quot;notApplicable&quot; |
| PASS | &quot;pass&quot; |
| FAIL | &quot;fail&quot; |
| REVIEW | &quot;review&quot; |
| OPEN | &quot;open&quot; |
| INFORMATIONAL | &quot;informational&quot; |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| NOTE | &quot;note&quot; |
| WARNING | &quot;warning&quot; |
| ERROR | &quot;error&quot; |



## Enum: BaselineStateEnum

| Name | Value |
|---- | -----|
| NEW | &quot;new&quot; |
| UNCHANGED | &quot;unchanged&quot; |
| UPDATED | &quot;updated&quot; |
| ABSENT | &quot;absent&quot; |



