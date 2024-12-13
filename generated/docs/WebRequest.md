

# WebRequest

Describes an HTTP request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index within the run.webRequests array of the request object associated with this result. |  [optional] |
|**protocol** | **String** | The request protocol. Example: &#39;http&#39;. |  [optional] |
|**version** | **String** | The request version. Example: &#39;1.1&#39;. |  [optional] |
|**target** | **String** | The target of the request. |  [optional] |
|**method** | **String** | The HTTP method. Well-known values are &#39;GET&#39;, &#39;PUT&#39;, &#39;POST&#39;, &#39;DELETE&#39;, &#39;PATCH&#39;, &#39;HEAD&#39;, &#39;OPTIONS&#39;, &#39;TRACE&#39;, &#39;CONNECT&#39;. |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | The request headers. |  [optional] |
|**parameters** | **Map&lt;String, String&gt;** | The request parameters. |  [optional] |
|**body** | [**ArtifactContent**](ArtifactContent.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



