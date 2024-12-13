

# VersionControlDetails

Specifies the information necessary to retrieve a desired revision from a version control system.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**repositoryUri** | **URI** | The absolute URI of the repository. |  |
|**revisionId** | **String** | A string that uniquely and permanently identifies the revision within the repository. |  [optional] |
|**branch** | **String** | The name of a branch containing the revision. |  [optional] |
|**revisionTag** | **String** | A tag that has been applied to the revision. |  [optional] |
|**asOfTimeUtc** | **OffsetDateTime** | A Coordinated Universal Time (UTC) date and time that can be used to synchronize an enlistment to the state of the repository at that time. |  [optional] |
|**mappedTo** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



