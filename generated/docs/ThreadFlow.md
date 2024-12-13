

# ThreadFlow

Describes a sequence of code locations that specify a path through a single thread of execution such as an operating system or fiber.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | An string that uniquely identifies the threadFlow within the codeFlow in which it occurs. |  [optional] |
|**message** | [**Message**](Message.md) |  |  [optional] |
|**initialState** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | Values of relevant expressions at the start of the thread flow that may change during thread flow execution. |  [optional] |
|**immutableState** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | Values of relevant expressions at the start of the thread flow that remain constant. |  [optional] |
|**locations** | [**List&lt;ThreadFlowLocation&gt;**](ThreadFlowLocation.md) | A temporally ordered array of &#39;threadFlowLocation&#39; objects, each of which describes a location visited by the tool while producing the result. |  |
|**properties** | **PropertyBag** |  |  [optional] |



