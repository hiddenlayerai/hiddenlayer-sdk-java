

# Artifact

A single artifact. In some cases, this artifact might be nested within another artifact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | [**Message**](Message.md) |  |  [optional] |
|**location** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**parentIndex** | **Integer** | Identifies the index of the immediate parent of the artifact, if this artifact is nested. |  [optional] |
|**offset** | **Integer** | The offset in bytes of the artifact within its containing artifact. |  [optional] |
|**length** | **Integer** | The length of the artifact in bytes. |  [optional] |
|**roles** | [**Set&lt;RolesEnum&gt;**](#Set&lt;RolesEnum&gt;) | The role or roles played by the artifact in the analysis. |  [optional] |
|**mimeType** | **String** | The MIME type (RFC 2045) of the artifact. |  [optional] |
|**contents** | [**ArtifactContent**](ArtifactContent.md) |  |  [optional] |
|**encoding** | **String** | Specifies the encoding for an artifact object that refers to a text file. |  [optional] |
|**sourceLanguage** | **String** | Specifies the source language for any artifact object that refers to a text file that contains source code. |  [optional] |
|**hashes** | **Map&lt;String, String&gt;** | A dictionary, each of whose keys is the name of a hash function and each of whose values is the hashed value of the artifact produced by the specified hash function. |  [optional] |
|**lastModifiedTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the artifact was most recently modified. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: Set&lt;RolesEnum&gt;

| Name | Value |
|---- | -----|
| ANALYSISTARGET | &quot;analysisTarget&quot; |
| ATTACHMENT | &quot;attachment&quot; |
| RESPONSEFILE | &quot;responseFile&quot; |
| RESULTFILE | &quot;resultFile&quot; |
| STANDARDSTREAM | &quot;standardStream&quot; |
| TRACEDFILE | &quot;tracedFile&quot; |
| UNMODIFIED | &quot;unmodified&quot; |
| MODIFIED | &quot;modified&quot; |
| ADDED | &quot;added&quot; |
| DELETED | &quot;deleted&quot; |
| RENAMED | &quot;renamed&quot; |
| UNCONTROLLED | &quot;uncontrolled&quot; |
| DRIVER | &quot;driver&quot; |
| EXTENSION | &quot;extension&quot; |
| TRANSLATION | &quot;translation&quot; |
| TAXONOMY | &quot;taxonomy&quot; |
| POLICY | &quot;policy&quot; |
| REFERENCEDONCOMMANDLINE | &quot;referencedOnCommandLine&quot; |
| MEMORYCONTENTS | &quot;memoryContents&quot; |
| DIRECTORY | &quot;directory&quot; |
| USERSPECIFIEDCONFIGURATION | &quot;userSpecifiedConfiguration&quot; |
| TOOLSPECIFIEDCONFIGURATION | &quot;toolSpecifiedConfiguration&quot; |
| DEBUGOUTPUTFILE | &quot;debugOutputFile&quot; |



