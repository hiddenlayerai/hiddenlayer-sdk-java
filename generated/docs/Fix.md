

# Fix

A proposed fix for the problem represented by a result object. A fix specifies a set of artifacts to modify. For each artifact, it specifies a set of bytes to remove, and provides a set of new bytes to replace them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | [**Message**](Message.md) |  |  [optional] |
|**artifactChanges** | [**Set&lt;ArtifactChange&gt;**](ArtifactChange.md) | One or more artifact changes that comprise a fix for a result. |  |
|**properties** | **PropertyBag** |  |  [optional] |



