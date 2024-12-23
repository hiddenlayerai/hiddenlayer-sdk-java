# ModelScanApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scanModel**](ModelScanApi.md#scanModel) | **POST** /api/v2/submit/sensors/{sensor_id}/scan | Scan a model |
| [**scanModelWithHttpInfo**](ModelScanApi.md#scanModelWithHttpInfo) | **POST** /api/v2/submit/sensors/{sensor_id}/scan | Scan a model |
| [**scanStatus**](ModelScanApi.md#scanStatus) | **GET** /api/v2/scan/status/{sensor_id} | Get Status or Result of a Scan |
| [**scanStatusWithHttpInfo**](ModelScanApi.md#scanStatusWithHttpInfo) | **GET** /api/v2/scan/status/{sensor_id} | Get Status or Result of a Scan |



## scanModel

> void scanModel(sensorId, scanModelRequest)

Scan a model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelScanApi apiInstance = new ModelScanApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        ScanModelRequest scanModelRequest = new ScanModelRequest(); // ScanModelRequest | Request body for create
        try {
            apiInstance.scanModel(sensorId, scanModelRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelScanApi#scanModel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sensorId** | **UUID**|  | |
| **scanModelRequest** | [**ScanModelRequest**](ScanModelRequest.md)| Request body for create | [optional] |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## scanModelWithHttpInfo

> ApiResponse<Void> scanModel scanModelWithHttpInfo(sensorId, scanModelRequest)

Scan a model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelScanApi apiInstance = new ModelScanApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        ScanModelRequest scanModelRequest = new ScanModelRequest(); // ScanModelRequest | Request body for create
        try {
            ApiResponse<Void> response = apiInstance.scanModelWithHttpInfo(sensorId, scanModelRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelScanApi#scanModel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sensorId** | **UUID**|  | |
| **scanModelRequest** | [**ScanModelRequest**](ScanModelRequest.md)| Request body for create | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json, application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## scanStatus

> ScanResultsV2 scanStatus(sensorId)

Get Status or Result of a Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelScanApi apiInstance = new ModelScanApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            ScanResultsV2 result = apiInstance.scanStatus(sensorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelScanApi#scanStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sensorId** | **UUID**|  | |

### Return type

[**ScanResultsV2**](ScanResultsV2.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

## scanStatusWithHttpInfo

> ApiResponse<ScanResultsV2> scanStatus scanStatusWithHttpInfo(sensorId)

Get Status or Result of a Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelScanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelScanApi apiInstance = new ModelScanApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<ScanResultsV2> response = apiInstance.scanStatusWithHttpInfo(sensorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelScanApi#scanStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sensorId** | **UUID**|  | |

### Return type

ApiResponse<[**ScanResultsV2**](ScanResultsV2.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

