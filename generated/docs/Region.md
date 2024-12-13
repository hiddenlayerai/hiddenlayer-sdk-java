

# Region

A region within an artifact where a result was detected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startLine** | **Integer** | The line number of the first character in the region. |  [optional] |
|**startColumn** | **Integer** | The column number of the first character in the region. |  [optional] |
|**endLine** | **Integer** | The line number of the last character in the region. |  [optional] |
|**endColumn** | **Integer** | The column number of the character following the end of the region. |  [optional] |
|**charOffset** | **Integer** | The zero-based offset from the beginning of the artifact of the first character in the region. |  [optional] |
|**charLength** | **Integer** | The length of the region in characters. |  [optional] |
|**byteOffset** | **Integer** | The zero-based offset from the beginning of the artifact of the first byte in the region. |  [optional] |
|**byteLength** | **Integer** | The length of the region in bytes. |  [optional] |
|**snippet** | [**ArtifactContent**](ArtifactContent.md) |  |  [optional] |
|**message** | [**Message**](Message.md) |  |  [optional] |
|**sourceLanguage** | **String** | Specifies the source language, if any, of the portion of the artifact specified by the region object. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



