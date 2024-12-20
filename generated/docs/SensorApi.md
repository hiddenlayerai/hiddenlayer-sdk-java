# SensorApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beginMultipartUpload**](SensorApi.md#beginMultipartUpload) | **POST** /api/v2/sensors/{sensor_id}/upload/begin | Begin Multipart Upload |
| [**beginMultipartUploadWithHttpInfo**](SensorApi.md#beginMultipartUploadWithHttpInfo) | **POST** /api/v2/sensors/{sensor_id}/upload/begin | Begin Multipart Upload |
| [**completeMultipartUpload**](SensorApi.md#completeMultipartUpload) | **POST** /api/v2/sensors/{sensor_id}/upload/{upload_id}/complete | Complete Multipart Upload |
| [**completeMultipartUploadWithHttpInfo**](SensorApi.md#completeMultipartUploadWithHttpInfo) | **POST** /api/v2/sensors/{sensor_id}/upload/{upload_id}/complete | Complete Multipart Upload |
| [**createSensor**](SensorApi.md#createSensor) | **POST** /api/v2/sensors/create | Create a Sensor |
| [**createSensorWithHttpInfo**](SensorApi.md#createSensorWithHttpInfo) | **POST** /api/v2/sensors/create | Create a Sensor |
| [**deleteModel**](SensorApi.md#deleteModel) | **DELETE** /api/v2/sensors/{sensor_id} | Remove an Adhoc Sensor |
| [**deleteModelWithHttpInfo**](SensorApi.md#deleteModelWithHttpInfo) | **DELETE** /api/v2/sensors/{sensor_id} | Remove an Adhoc Sensor |
| [**getModel**](SensorApi.md#getModel) | **GET** /api/v2/sensors/{sensor_id} | Get Model |
| [**getModelWithHttpInfo**](SensorApi.md#getModelWithHttpInfo) | **GET** /api/v2/sensors/{sensor_id} | Get Model |
| [**querySensor**](SensorApi.md#querySensor) | **POST** /api/v2/sensors/query | Query a Sensor |
| [**querySensorWithHttpInfo**](SensorApi.md#querySensorWithHttpInfo) | **POST** /api/v2/sensors/query | Query a Sensor |
| [**sensorSorApiV3ModelCardsQueryGet**](SensorApi.md#sensorSorApiV3ModelCardsQueryGet) | **GET** /models/v3/cards | List Model Cards |
| [**sensorSorApiV3ModelCardsQueryGetWithHttpInfo**](SensorApi.md#sensorSorApiV3ModelCardsQueryGetWithHttpInfo) | **GET** /models/v3/cards | List Model Cards |
| [**uploadModelPart**](SensorApi.md#uploadModelPart) | **PUT** /api/v2/sensors/{sensor_id}/upload/{upload_id}/part/{part} | Upload part |
| [**uploadModelPartWithHttpInfo**](SensorApi.md#uploadModelPartWithHttpInfo) | **PUT** /api/v2/sensors/{sensor_id}/upload/{upload_id}/part/{part} | Upload part |



## beginMultipartUpload

> GetMultipartUploadResponse beginMultipartUpload(sensorId, xContentLength)

Begin Multipart Upload

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        Long xContentLength = 56L; // Long | The total size of multipart upload.
        try {
            GetMultipartUploadResponse result = apiInstance.beginMultipartUpload(sensorId, xContentLength);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#beginMultipartUpload");
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
| **xContentLength** | **Long**| The total size of multipart upload. | |

### Return type

[**GetMultipartUploadResponse**](GetMultipartUploadResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |

## beginMultipartUploadWithHttpInfo

> ApiResponse<GetMultipartUploadResponse> beginMultipartUpload beginMultipartUploadWithHttpInfo(sensorId, xContentLength)

Begin Multipart Upload

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        Long xContentLength = 56L; // Long | The total size of multipart upload.
        try {
            ApiResponse<GetMultipartUploadResponse> response = apiInstance.beginMultipartUploadWithHttpInfo(sensorId, xContentLength);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#beginMultipartUpload");
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
| **xContentLength** | **Long**| The total size of multipart upload. | |

### Return type

ApiResponse<[**GetMultipartUploadResponse**](GetMultipartUploadResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |


## completeMultipartUpload

> void completeMultipartUpload(sensorId, uploadId)

Complete Multipart Upload

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        String uploadId = "uploadId_example"; // String | 
        try {
            apiInstance.completeMultipartUpload(sensorId, uploadId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#completeMultipartUpload");
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
| **uploadId** | **String**|  | |

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
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |

## completeMultipartUploadWithHttpInfo

> ApiResponse<Void> completeMultipartUpload completeMultipartUploadWithHttpInfo(sensorId, uploadId)

Complete Multipart Upload

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        String uploadId = "uploadId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.completeMultipartUploadWithHttpInfo(sensorId, uploadId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#completeMultipartUpload");
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
| **uploadId** | **String**|  | |

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
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |


## createSensor

> Model createSensor(createSensorRequest)

Create a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        CreateSensorRequest createSensorRequest = new CreateSensorRequest(); // CreateSensorRequest | Request body for create
        try {
            Model result = apiInstance.createSensor(createSensorRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#createSensor");
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
| **createSensorRequest** | [**CreateSensorRequest**](CreateSensorRequest.md)| Request body for create | |

### Return type

[**Model**](Model.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## createSensorWithHttpInfo

> ApiResponse<Model> createSensor createSensorWithHttpInfo(createSensorRequest)

Create a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        CreateSensorRequest createSensorRequest = new CreateSensorRequest(); // CreateSensorRequest | Request body for create
        try {
            ApiResponse<Model> response = apiInstance.createSensorWithHttpInfo(createSensorRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#createSensor");
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
| **createSensorRequest** | [**CreateSensorRequest**](CreateSensorRequest.md)| Request body for create | |

### Return type

ApiResponse<[**Model**](Model.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## deleteModel

> void deleteModel(sensorId)

Remove an Adhoc Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.deleteModel(sensorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#deleteModel");
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


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

## deleteModelWithHttpInfo

> ApiResponse<Void> deleteModel deleteModelWithHttpInfo(sensorId)

Remove an Adhoc Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Void> response = apiInstance.deleteModelWithHttpInfo(sensorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#deleteModel");
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


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |


## getModel

> Model getModel(sensorId)

Get Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            Model result = apiInstance.getModel(sensorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#getModel");
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

> ApiResponse<Model> getModel getModelWithHttpInfo(sensorId)

Get Model

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<Model> response = apiInstance.getModelWithHttpInfo(sensorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#getModel");
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


## querySensor

> ModelQueryResponse querySensor(sensorSORQueryRequest)

Query a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        SensorSORQueryRequest sensorSORQueryRequest = new SensorSORQueryRequest(); // SensorSORQueryRequest | Request body for create
        try {
            ModelQueryResponse result = apiInstance.querySensor(sensorSORQueryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#querySensor");
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
| **sensorSORQueryRequest** | [**SensorSORQueryRequest**](SensorSORQueryRequest.md)| Request body for create | [optional] |

### Return type

[**ModelQueryResponse**](ModelQueryResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |

## querySensorWithHttpInfo

> ApiResponse<ModelQueryResponse> querySensor querySensorWithHttpInfo(sensorSORQueryRequest)

Query a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        SensorSORQueryRequest sensorSORQueryRequest = new SensorSORQueryRequest(); // SensorSORQueryRequest | Request body for create
        try {
            ApiResponse<ModelQueryResponse> response = apiInstance.querySensorWithHttpInfo(sensorSORQueryRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#querySensor");
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
| **sensorSORQueryRequest** | [**SensorSORQueryRequest**](SensorSORQueryRequest.md)| Request body for create | [optional] |

### Return type

ApiResponse<[**ModelQueryResponse**](ModelQueryResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |


## sensorSorApiV3ModelCardsQueryGet

> SensorSORModelCardQueryResponse sensorSorApiV3ModelCardsQueryGet(modelNameEq, modelNameContains, limit, offset, sort)

List Model Cards

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        String modelNameEq = "modelNameEq_example"; // String | substring match on model name
        String modelNameContains = "modelNameContains_example"; // String | substring match on model name
        Integer limit = 25; // Integer | 
        Integer offset = 0; // Integer | 
        String sort = "-created_at"; // String | allow sorting by model name or created at timestamp, ascending (+) or the default descending (-)
        try {
            SensorSORModelCardQueryResponse result = apiInstance.sensorSorApiV3ModelCardsQueryGet(modelNameEq, modelNameContains, limit, offset, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#sensorSorApiV3ModelCardsQueryGet");
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
| **modelNameEq** | **String**| substring match on model name | [optional] |
| **modelNameContains** | **String**| substring match on model name | [optional] |
| **limit** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **sort** | **String**| allow sorting by model name or created at timestamp, ascending (+) or the default descending (-) | [optional] [default to -created_at] |

### Return type

[**SensorSORModelCardQueryResponse**](SensorSORModelCardQueryResponse.md)


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

## sensorSorApiV3ModelCardsQueryGetWithHttpInfo

> ApiResponse<SensorSORModelCardQueryResponse> sensorSorApiV3ModelCardsQueryGet sensorSorApiV3ModelCardsQueryGetWithHttpInfo(modelNameEq, modelNameContains, limit, offset, sort)

List Model Cards

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        String modelNameEq = "modelNameEq_example"; // String | substring match on model name
        String modelNameContains = "modelNameContains_example"; // String | substring match on model name
        Integer limit = 25; // Integer | 
        Integer offset = 0; // Integer | 
        String sort = "-created_at"; // String | allow sorting by model name or created at timestamp, ascending (+) or the default descending (-)
        try {
            ApiResponse<SensorSORModelCardQueryResponse> response = apiInstance.sensorSorApiV3ModelCardsQueryGetWithHttpInfo(modelNameEq, modelNameContains, limit, offset, sort);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#sensorSorApiV3ModelCardsQueryGet");
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
| **modelNameEq** | **String**| substring match on model name | [optional] |
| **modelNameContains** | **String**| substring match on model name | [optional] |
| **limit** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **sort** | **String**| allow sorting by model name or created at timestamp, ascending (+) or the default descending (-) | [optional] [default to -created_at] |

### Return type

ApiResponse<[**SensorSORModelCardQueryResponse**](SensorSORModelCardQueryResponse.md)>


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


## uploadModelPart

> void uploadModelPart(sensorId, uploadId, part, body)

Upload part

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        String uploadId = "uploadId_example"; // String | 
        Integer part = 56; // Integer | 
        Object body = null; // Object | 
        try {
            apiInstance.uploadModelPart(sensorId, uploadId, part, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#uploadModelPart");
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
| **uploadId** | **String**|  | |
| **part** | **Integer**|  | |
| **body** | **Object**|  | |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |

## uploadModelPartWithHttpInfo

> ApiResponse<Void> uploadModelPart uploadModelPartWithHttpInfo(sensorId, uploadId, part, body)

Upload part

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.SensorApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SensorApi apiInstance = new SensorApi(defaultClient);
        UUID sensorId = UUID.randomUUID(); // UUID | 
        String uploadId = "uploadId_example"; // String | 
        Integer part = 56; // Integer | 
        Object body = null; // Object | 
        try {
            ApiResponse<Void> response = apiInstance.uploadModelPartWithHttpInfo(sensorId, uploadId, part, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#uploadModelPart");
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
| **uploadId** | **String**|  | |
| **part** | **Integer**|  | |
| **body** | **Object**|  | |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |

