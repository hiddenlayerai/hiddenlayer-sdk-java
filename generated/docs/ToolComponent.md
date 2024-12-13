

# ToolComponent

A component, such as a plug-in or the driver, of the analysis tool that was run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**guid** | **String** | A unique identifier for the tool component in the form of a GUID. |  [optional] |
|**name** | **String** | The name of the tool component. |  |
|**organization** | **String** | The organization or company that produced the tool component. |  [optional] |
|**product** | **String** | A product suite to which the tool component belongs. |  [optional] |
|**productSuite** | **String** | A localizable string containing the name of the suite of products to which the tool component belongs. |  [optional] |
|**shortDescription** | [**MultiformatMessageString**](MultiformatMessageString.md) |  |  [optional] |
|**fullDescription** | [**MultiformatMessageString**](MultiformatMessageString.md) |  |  [optional] |
|**fullName** | **String** | The name of the tool component along with its version and any other useful identifying information, such as its locale. |  [optional] |
|**version** | **String** | The tool component version, in whatever format the component natively provides. |  [optional] |
|**semanticVersion** | **String** | The tool component version in the format specified by Semantic Versioning 2.0. |  [optional] |
|**dottedQuadFileVersion** | **String** | The binary version of the tool component&#39;s primary executable file expressed as four non-negative integers separated by a period (for operating systems that express file versions in this way). |  [optional] |
|**releaseDateUtc** | **String** | A string specifying the UTC date (and optionally, the time) of the component&#39;s release. |  [optional] |
|**downloadUri** | **URI** | The absolute URI from which the tool component can be downloaded. |  [optional] |
|**informationUri** | **URI** | The absolute URI at which information about this version of the tool component can be found. |  [optional] |
|**globalMessageStrings** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments. |  [optional] |
|**notifications** | [**Set&lt;ReportingDescriptor&gt;**](ReportingDescriptor.md) | An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime execution of the tool component. |  [optional] |
|**rules** | [**Set&lt;ReportingDescriptor&gt;**](ReportingDescriptor.md) | An array of reportingDescriptor objects relevant to the analysis performed by the tool component. |  [optional] |
|**taxa** | [**Set&lt;ReportingDescriptor&gt;**](ReportingDescriptor.md) | An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined taxonomies. |  [optional] |
|**locations** | [**List&lt;ArtifactLocation&gt;**](ArtifactLocation.md) | An array of the artifactLocation objects associated with the tool component. |  [optional] |
|**language** | **String** | The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code associated with a country or region). The casing is recommended but not required (in order for this data to conform to RFC5646). |  [optional] |
|**contents** | [**Set&lt;ContentsEnum&gt;**](#Set&lt;ContentsEnum&gt;) | The kinds of data contained in this object. |  [optional] |
|**isComprehensive** | **Boolean** | Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for this component, as opposed to including only data that is relevant to the results persisted to this log file. |  [optional] |
|**localizedDataSemanticVersion** | **String** | The semantic version of the localized strings defined in this component; maintained by components that provide translations. |  [optional] |
|**minimumRequiredLocalizedDataSemanticVersion** | **String** | The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by components that consume translations. |  [optional] |
|**associatedComponent** | [**ToolComponentReference**](ToolComponentReference.md) |  |  [optional] |
|**translationMetadata** | [**TranslationMetadata**](TranslationMetadata.md) |  |  [optional] |
|**supportedTaxonomies** | [**Set&lt;ToolComponentReference&gt;**](ToolComponentReference.md) | An array of toolComponentReference objects to declare the taxonomies supported by the tool component. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: Set&lt;ContentsEnum&gt;

| Name | Value |
|---- | -----|
| LOCALIZEDDATA | &quot;localizedData&quot; |
| NONLOCALIZEDDATA | &quot;nonLocalizedData&quot; |



