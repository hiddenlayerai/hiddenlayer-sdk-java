

# ExternalProperties

The top-level element of an external property file.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schema** | **URI** | The URI of the JSON schema corresponding to the version of the external property file format. |  [optional] |
|**version** | [**VersionEnum**](#VersionEnum) | The SARIF format version of this external properties object. |  [optional] |
|**guid** | **String** | A stable, unique identifier for this external properties object, in the form of a GUID. |  [optional] |
|**runGuid** | **String** | A stable, unique identifier for the run associated with this external properties object, in the form of a GUID. |  [optional] |
|**conversion** | [**Conversion**](Conversion.md) |  |  [optional] |
|**graphs** | [**Set&lt;Graph&gt;**](Graph.md) | An array of graph objects that will be merged with a separate run. |  [optional] |
|**externalizedProperties** | **PropertyBag** |  |  [optional] |
|**artifacts** | [**Set&lt;Artifact&gt;**](Artifact.md) | An array of artifact objects that will be merged with a separate run. |  [optional] |
|**invocations** | [**List&lt;Invocation&gt;**](Invocation.md) | Describes the invocation of the analysis tool that will be merged with a separate run. |  [optional] |
|**logicalLocations** | [**Set&lt;LogicalLocation&gt;**](LogicalLocation.md) | An array of logical locations such as namespaces, types or functions that will be merged with a separate run. |  [optional] |
|**threadFlowLocations** | [**Set&lt;ThreadFlowLocation&gt;**](ThreadFlowLocation.md) | An array of threadFlowLocation objects that will be merged with a separate run. |  [optional] |
|**results** | [**List&lt;Result&gt;**](Result.md) | An array of result objects that will be merged with a separate run. |  [optional] |
|**taxonomies** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | Tool taxonomies that will be merged with a separate run. |  [optional] |
|**driver** | [**ToolComponent**](ToolComponent.md) |  |  [optional] |
|**extensions** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | Tool extensions that will be merged with a separate run. |  [optional] |
|**policies** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | Tool policies that will be merged with a separate run. |  [optional] |
|**translations** | [**Set&lt;ToolComponent&gt;**](ToolComponent.md) | Tool translations that will be merged with a separate run. |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) | Addresses that will be merged with a separate run. |  [optional] |
|**webRequests** | [**Set&lt;WebRequest&gt;**](WebRequest.md) | Requests that will be merged with a separate run. |  [optional] |
|**webResponses** | [**Set&lt;WebResponse&gt;**](WebResponse.md) | Responses that will be merged with a separate run. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| _2_1_0 | &quot;2.1.0&quot; |



