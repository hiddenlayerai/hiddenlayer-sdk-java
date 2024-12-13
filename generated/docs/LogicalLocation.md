

# LogicalLocation

A logical location of a construct that produced a result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Identifies the construct in which the result occurred. For example, this property might contain the name of a class or a method. |  [optional] |
|**index** | **Integer** | The index within the logical locations array. |  [optional] |
|**fullyQualifiedName** | **String** | The human-readable fully qualified name of the logical location. |  [optional] |
|**decoratedName** | **String** | The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler that encodes calling convention, return type and other details along with the function name. |  [optional] |
|**parentIndex** | **Integer** | Identifies the index of the immediate parent of the construct in which the result was detected. For example, this property might point to a logical location that represents the namespace that holds a type. |  [optional] |
|**kind** | **String** | The type of construct this logical location component refers to. Should be one of &#39;function&#39;, &#39;member&#39;, &#39;module&#39;, &#39;namespace&#39;, &#39;parameter&#39;, &#39;resource&#39;, &#39;returnType&#39;, &#39;type&#39;, &#39;variable&#39;, &#39;object&#39;, &#39;array&#39;, &#39;property&#39;, &#39;value&#39;, &#39;element&#39;, &#39;text&#39;, &#39;attribute&#39;, &#39;comment&#39;, &#39;declaration&#39;, &#39;dtd&#39; or &#39;processingInstruction&#39;, if any of those accurately describe the construct. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



