

# Location

A location within a programming artifact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Value that distinguishes this location from all other locations within a single result object. |  [optional] |
|**physicalLocation** | [**PhysicalLocation**](PhysicalLocation.md) |  |  [optional] |
|**logicalLocations** | [**Set&lt;LogicalLocation&gt;**](LogicalLocation.md) | The logical locations associated with the result. |  [optional] |
|**message** | [**Message**](Message.md) |  |  [optional] |
|**annotations** | [**Set&lt;Region&gt;**](Region.md) | A set of regions relevant to the location. |  [optional] |
|**relationships** | [**Set&lt;LocationRelationship&gt;**](LocationRelationship.md) | An array of objects that describe relationships between this location and others. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



