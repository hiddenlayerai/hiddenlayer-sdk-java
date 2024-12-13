

# Suppression

A suppression that is relevant to a result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**guid** | **String** | A stable, unique identifier for the suppression in the form of a GUID. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | A string that indicates where the suppression is persisted. |  |
|**status** | [**StatusEnum**](#StatusEnum) | A string that indicates the review status of the suppression. |  [optional] |
|**justification** | **String** | A string representing the justification for the suppression. |  [optional] |
|**location** | [**Location**](Location.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| INSOURCE | &quot;inSource&quot; |
| EXTERNAL | &quot;external&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| UNDERREVIEW | &quot;underReview&quot; |
| REJECTED | &quot;rejected&quot; |



