

# SarifException

Describes a runtime exception encountered during the execution of an analysis tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**kind** | **String** | A string that identifies the kind of exception, for example, the fully qualified type name of an object that was thrown, or the symbolic name of a signal. |  [optional] |
|**message** | **String** | A message that describes the exception. |  [optional] |
|**stack** | [**Stack**](Stack.md) |  |  [optional] |
|**innerExceptions** | [**List&lt;SarifException&gt;**](SarifException.md) | An array of exception objects each of which is considered a cause of this exception. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



