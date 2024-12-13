

# FileDetailsV3


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**estimatedTime** | **String** | estimated time to scan the file |  |
|**md5** | **String** | hexadecimal md5 hash of file |  |
|**sha256** | **String** | hexadecimal sha256 hash of file |  |
|**tlsh** | **String** | TLSH hash of file |  |
|**fileSize** | **String** | size of the file in human readable format |  [optional] |
|**fileSizeBytes** | **Integer** | size of the file in bytes |  [optional] |
|**fileType** | [**FileTypeEnum**](#FileTypeEnum) | type of the file |  |
|**fileTypeDetails** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: FileTypeEnum

| Name | Value |
|---- | -----|
| SAFETENSORS | &quot;safetensors&quot; |
| RDS | &quot;RDS&quot; |
| ONNX | &quot;onnx&quot; |
| TENSORFLOW | &quot;tensorflow&quot; |
| KERAS | &quot;keras&quot; |
| PYTORCH | &quot;pytorch&quot; |
| PICKLE | &quot;pickle&quot; |
| NEMO | &quot;NEMO&quot; |
| NUMPY | &quot;numpy&quot; |
| UNKNOWN | &quot;unknown&quot; |
| ZIP | &quot;ZIP&quot; |
| TAR | &quot;TAR&quot; |
| GGUF | &quot;gguf&quot; |



