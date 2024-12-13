

# GraphTraversal

Represents a path through a graph.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runGraphIndex** | **Integer** | The index within the run.graphs to be associated with the result. |  [optional] |
|**resultGraphIndex** | **Integer** | The index within the result.graphs to be associated with the result. |  [optional] |
|**description** | [**Message**](Message.md) |  |  [optional] |
|**initialState** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | Values of relevant expressions at the start of the graph traversal that may change during graph traversal. |  [optional] |
|**immutableState** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal. |  [optional] |
|**edgeTraversals** | [**List&lt;EdgeTraversal&gt;**](EdgeTraversal.md) | The sequences of edges traversed by this graph traversal. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



