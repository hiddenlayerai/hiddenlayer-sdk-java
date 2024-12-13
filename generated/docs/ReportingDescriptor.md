

# ReportingDescriptor

Metadata that describes a specific report produced by the tool, as part of the analysis it provides or its runtime reporting.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A stable, opaque identifier for the report. |  |
|**deprecatedIds** | **Set&lt;String&gt;** | An array of stable, opaque identifiers by which this report was known in some previous version of the analysis tool. |  [optional] |
|**guid** | **String** | A unique identifier for the reporting descriptor in the form of a GUID. |  [optional] |
|**deprecatedGuids** | **Set&lt;String&gt;** | An array of unique identifies in the form of a GUID by which this report was known in some previous version of the analysis tool. |  [optional] |
|**name** | **String** | A report identifier that is understandable to an end user. |  [optional] |
|**deprecatedNames** | **Set&lt;String&gt;** | An array of readable identifiers by which this report was known in some previous version of the analysis tool. |  [optional] |
|**shortDescription** | [**MultiformatMessageString**](MultiformatMessageString.md) |  |  [optional] |
|**fullDescription** | [**MultiformatMessageString**](MultiformatMessageString.md) |  |  [optional] |
|**messageStrings** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can be used to construct a message in combination with an arbitrary number of additional string arguments. |  [optional] |
|**defaultConfiguration** | [**ReportingConfiguration**](ReportingConfiguration.md) |  |  [optional] |
|**helpUri** | **URI** | A URI where the primary documentation for the report can be found. |  [optional] |
|**help** | [**MultiformatMessageString**](MultiformatMessageString.md) |  |  [optional] |
|**relationships** | [**Set&lt;ReportingDescriptorRelationship&gt;**](ReportingDescriptorRelationship.md) | An array of objects that describe relationships between this reporting descriptor and others. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



