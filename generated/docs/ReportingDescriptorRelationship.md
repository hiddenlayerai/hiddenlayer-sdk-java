

# ReportingDescriptorRelationship

Information about the relation of one reporting descriptor to another.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | [**ReportingDescriptorReference**](ReportingDescriptorReference.md) |  |  |
|**kinds** | **Set&lt;String&gt;** | A set of distinct strings that categorize the relationship. Well-known kinds include &#39;canPrecede&#39;, &#39;canFollow&#39;, &#39;willPrecede&#39;, &#39;willFollow&#39;, &#39;superset&#39;, &#39;subset&#39;, &#39;equal&#39;, &#39;disjoint&#39;, &#39;relevant&#39;, and &#39;incomparable&#39;. |  [optional] |
|**description** | [**Message**](Message.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



