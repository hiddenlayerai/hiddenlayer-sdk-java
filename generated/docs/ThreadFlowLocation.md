

# ThreadFlowLocation

A location visited by an analysis tool while simulating or monitoring the execution of a program.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index within the run threadFlowLocations array. |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**stack** | [**Stack**](Stack.md) |  |  [optional] |
|**kinds** | **Set&lt;String&gt;** | A set of distinct strings that categorize the thread flow location. Well-known kinds include &#39;acquire&#39;, &#39;release&#39;, &#39;enter&#39;, &#39;exit&#39;, &#39;call&#39;, &#39;return&#39;, &#39;branch&#39;, &#39;implicit&#39;, &#39;false&#39;, &#39;true&#39;, &#39;caution&#39;, &#39;danger&#39;, &#39;unknown&#39;, &#39;unreachable&#39;, &#39;taint&#39;, &#39;function&#39;, &#39;handler&#39;, &#39;lock&#39;, &#39;memory&#39;, &#39;resource&#39;, &#39;scope&#39; and &#39;value&#39;. |  [optional] |
|**taxa** | [**Set&lt;ReportingDescriptorReference&gt;**](ReportingDescriptorReference.md) | An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow location. |  [optional] |
|**module** | **String** | The name of the module that contains the code that is executing. |  [optional] |
|**state** | [**Map&lt;String, MultiformatMessageString&gt;**](MultiformatMessageString.md) | A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents the variable or expression value. For an annotation of kind &#39;continuation&#39;, for example, this dictionary might hold the current assumed values of a set of global variables. |  [optional] |
|**nestingLevel** | **Integer** | An integer representing a containment hierarchy within the thread flow. |  [optional] |
|**executionOrder** | **Integer** | An integer representing the temporal order in which execution reached this location. |  [optional] |
|**executionTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which this location was executed. |  [optional] |
|**importance** | [**ImportanceEnum**](#ImportanceEnum) | Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is \&quot;essential\&quot;, \&quot;important\&quot;, \&quot;unimportant\&quot;. Default: \&quot;important\&quot;. |  [optional] |
|**webRequest** | [**WebRequest**](WebRequest.md) |  |  [optional] |
|**webResponse** | [**WebResponse**](WebResponse.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: ImportanceEnum

| Name | Value |
|---- | -----|
| IMPORTANT | &quot;important&quot; |
| ESSENTIAL | &quot;essential&quot; |
| UNIMPORTANT | &quot;unimportant&quot; |



