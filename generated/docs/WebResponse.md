

# WebResponse

Describes the response to an HTTP request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index within the run.webResponses array of the response object associated with this result. |  [optional] |
|**protocol** | **String** | The response protocol. Example: &#39;http&#39;. |  [optional] |
|**version** | **String** | The response version. Example: &#39;1.1&#39;. |  [optional] |
|**statusCode** | **Integer** | The response status code. Example: 451. |  [optional] |
|**reasonPhrase** | **String** | The response reason. Example: &#39;Not found&#39;. |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | The response headers. |  [optional] |
|**body** | [**ArtifactContent**](ArtifactContent.md) |  |  [optional] |
|**noResponseReceived** | **Boolean** | Specifies whether a response was received from the server. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



