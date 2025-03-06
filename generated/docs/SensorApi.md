# SensorApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSensor**](SensorApi.md#createSensor) | **POST** /api/v2/sensors/create | Create a Sensor |
| [**createSensorWithHttpInfo**](SensorApi.md#createSensorWithHttpInfo) | **POST** /api/v2/sensors/create | Create a Sensor |
| [**deleteSensor**](SensorApi.md#deleteSensor) | **DELETE** /api/v2/sensors/{sensor_id} | Delete Sensor |
| [**deleteSensorWithHttpInfo**](SensorApi.md#deleteSensorWithHttpInfo) | **DELETE** /api/v2/sensors/{sensor_id} | Delete Sensor |
| [**getSensor**](SensorApi.md#getSensor) | **GET** /api/v2/sensors/{sensor_id} | Get Sensor |
| [**getSensorWithHttpInfo**](SensorApi.md#getSensorWithHttpInfo) | **GET** /api/v2/sensors/{sensor_id} | Get Sensor |
| [**querySensor**](SensorApi.md#querySensor) | **POST** /api/v2/sensors/query | Query a Sensor |
| [**querySensorWithHttpInfo**](SensorApi.md#querySensorWithHttpInfo) | **POST** /api/v2/sensors/query | Query a Sensor |
| [**sensorSorApiV3ModelCardsQueryGet**](SensorApi.md#sensorSorApiV3ModelCardsQueryGet) | **GET** /models/v3/cards | List Model Cards |
| [**sensorSorApiV3ModelCardsQueryGetWithHttpInfo**](SensorApi.md#sensorSorApiV3ModelCardsQueryGetWithHttpInfo) | **GET** /models/v3/cards | List Model Cards |



## createSensor

> Sensor createSensor(createSensorRequest)

Create a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            Sensor result = apiInstance.createSensor(createSensorRequest);
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

[**Sensor**](Sensor.md)


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

> ApiResponse<Sensor> createSensor createSensorWithHttpInfo(createSensorRequest)

Create a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            ApiResponse<Sensor> response = apiInstance.createSensorWithHttpInfo(createSensorRequest);
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

ApiResponse<[**Sensor**](Sensor.md)>


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


## deleteSensor

> void deleteSensor(sensorId)

Delete Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            apiInstance.deleteSensor(sensorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#deleteSensor");
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

## deleteSensorWithHttpInfo

> ApiResponse<Void> deleteSensor deleteSensorWithHttpInfo(sensorId)

Delete Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            ApiResponse<Void> response = apiInstance.deleteSensorWithHttpInfo(sensorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#deleteSensor");
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


## getSensor

> Sensor getSensor(sensorId)

Get Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            Sensor result = apiInstance.getSensor(sensorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#getSensor");
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

[**Sensor**](Sensor.md)


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

## getSensorWithHttpInfo

> ApiResponse<Sensor> getSensor getSensorWithHttpInfo(sensorId)

Get Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            ApiResponse<Sensor> response = apiInstance.getSensorWithHttpInfo(sensorId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SensorApi#getSensor");
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

ApiResponse<[**Sensor**](Sensor.md)>


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

> SensorQueryResponse querySensor(sensorSORQueryRequest)

Query a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            SensorQueryResponse result = apiInstance.querySensor(sensorSORQueryRequest);
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

[**SensorQueryResponse**](SensorQueryResponse.md)


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

> ApiResponse<SensorQueryResponse> querySensor querySensorWithHttpInfo(sensorSORQueryRequest)

Query a Sensor

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
            ApiResponse<SensorQueryResponse> response = apiInstance.querySensorWithHttpInfo(sensorSORQueryRequest);
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

ApiResponse<[**SensorQueryResponse**](SensorQueryResponse.md)>


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
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.SensorApi;

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

