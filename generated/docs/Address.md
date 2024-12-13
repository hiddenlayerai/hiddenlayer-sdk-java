

# Address

A physical or virtual address, or a range of addresses, in an 'addressable region' (memory or a binary file).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**absoluteAddress** | **Integer** | The address expressed as a byte offset from the start of the addressable region. |  [optional] |
|**relativeAddress** | **Integer** | The address expressed as a byte offset from the absolute address of the top-most parent object. |  [optional] |
|**length** | **Integer** | The number of bytes in this range of addresses. |  [optional] |
|**kind** | **String** | An open-ended string that identifies the address kind. &#39;data&#39;, &#39;function&#39;, &#39;header&#39;,&#39;instruction&#39;, &#39;module&#39;, &#39;page&#39;, &#39;section&#39;, &#39;segment&#39;, &#39;stack&#39;, &#39;stackFrame&#39;, &#39;table&#39; are well-known values. |  [optional] |
|**name** | **String** | A name that is associated with the address, e.g., &#39;.text&#39;. |  [optional] |
|**fullyQualifiedName** | **String** | A human-readable fully qualified name that is associated with the address. |  [optional] |
|**offsetFromParent** | **Integer** | The byte offset of this address from the absolute or relative address of the parent object. |  [optional] |
|**index** | **Integer** | The index within run.addresses of the cached object for this address. |  [optional] |
|**parentIndex** | **Integer** | The index within run.addresses of the parent object. |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



