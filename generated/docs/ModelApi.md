# ModelApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteModel**](ModelApi.md#deleteModel) | **DELETE** /api/v2/models/{model_id} | Delete Adhoc Model |
| [**deleteModelWithHttpInfo**](ModelApi.md#deleteModelWithHttpInfo) | **DELETE** /api/v2/models/{model_id} | Delete Adhoc Model |
| [**getModel**](ModelApi.md#getModel) | **GET** /api/v2/models/{model_id} | Get Model |
| [**getModelWithHttpInfo**](ModelApi.md#getModelWithHttpInfo) | **GET** /api/v2/models/{model_id} | Get Model |



## deleteModel

> void deleteModel(modelId)

Delete Adhoc Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelApi apiInstance = new ModelApi(defaultClient);
        UUID modelId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.deleteModel(modelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelApi#deleteModel");
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
| **modelId** | **UUID**|  | |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful (No Available Content) |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **409** | The specified resource is in an incompatible state |  -  |
| **503** | The service is undergoing maintenance and is temporarily unavailable. |  -  |

## deleteModelWithHttpInfo

> ApiResponse<Void> deleteModel deleteModelWithHttpInfo(modelId)

Delete Adhoc Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelApi apiInstance = new ModelApi(defaultClient);
        UUID modelId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.deleteModelWithHttpInfo(modelId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelApi#deleteModel");
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
| **modelId** | **UUID**|  | |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful (No Available Content) |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **409** | The specified resource is in an incompatible state |  -  |
| **503** | The service is undergoing maintenance and is temporarily unavailable. |  -  |


## getModel

> Model getModel(modelId)

Get Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelApi apiInstance = new ModelApi(defaultClient);
        UUID modelId = UUID.randomUUID(); // UUID | 
        try {
            Model result = apiInstance.getModel(modelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelApi#getModel");
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
| **modelId** | **UUID**|  | |

### Return type

[**Model**](Model.md)


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

## getModelWithHttpInfo

> ApiResponse<Model> getModel getModelWithHttpInfo(modelId)

Get Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelApi apiInstance = new ModelApi(defaultClient);
        UUID modelId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Model> response = apiInstance.getModelWithHttpInfo(modelId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelApi#getModel");
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
| **modelId** | **UUID**|  | |

### Return type

ApiResponse<[**Model**](Model.md)>


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

