

# EdgeTraversal

Represents the traversal of a single edge during a graph traversal.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**edgeId** | **String** | Identifies the edge being traversed. |  |
|**message** | [**Message**](Message.md) |  |  [optional] |
|**finalState** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | The values of relevant expressions after the edge has been traversed. |  [optional] |
|**stepOverEdgeCount** | **Integer** | The number of edge traversals necessary to return from a nested graph. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



