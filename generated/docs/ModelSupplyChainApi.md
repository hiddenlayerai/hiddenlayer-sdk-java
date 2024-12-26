# ModelSupplyChainApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modelScanApiV3ScanModelVersionIdGet**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdGet) | **GET** /scan/v3/results/{scan_id} | Get Result of a Model Scan |
| [**modelScanApiV3ScanModelVersionIdGetWithHttpInfo**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdGetWithHttpInfo) | **GET** /scan/v3/results/{scan_id} | Get Result of a Model Scan |
| [**modelScanApiV3ScanModelVersionIdPatch**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdPatch) | **PATCH** /scan/v3/results/{scan_id} | Indicate part (file or files) of a model scan has completed |
| [**modelScanApiV3ScanModelVersionIdPatchWithHttpInfo**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdPatchWithHttpInfo) | **PATCH** /scan/v3/results/{scan_id} | Indicate part (file or files) of a model scan has completed |
| [**modelScanApiV3ScanModelVersionIdPost**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdPost) | **POST** /scan/v3/results/{scan_id} | Indicate model scan has started |
| [**modelScanApiV3ScanModelVersionIdPostWithHttpInfo**](ModelSupplyChainApi.md#modelScanApiV3ScanModelVersionIdPostWithHttpInfo) | **POST** /scan/v3/results/{scan_id} | Indicate model scan has started |
| [**modelScanApiV3ScanQuery**](ModelSupplyChainApi.md#modelScanApiV3ScanQuery) | **GET** /scan/v3/results | Get condensed reports for a Model Scan |
| [**modelScanApiV3ScanQueryWithHttpInfo**](ModelSupplyChainApi.md#modelScanApiV3ScanQueryWithHttpInfo) | **GET** /scan/v3/results | Get condensed reports for a Model Scan |
| [**modelscanApiV3GetScanResults**](ModelSupplyChainApi.md#modelscanApiV3GetScanResults) | **GET** /scans/v3/results/{scan_id} | Retrieve Model Scan Results |
| [**modelscanApiV3GetScanResultsWithHttpInfo**](ModelSupplyChainApi.md#modelscanApiV3GetScanResultsWithHttpInfo) | **GET** /scans/v3/results/{scan_id} | Retrieve Model Scan Results |
| [**modelscanApiV3PostScanResults**](ModelSupplyChainApi.md#modelscanApiV3PostScanResults) | **POST** /scans/v3/reports/{scan_id} | Engine Report Endpoint of Model Scan Results |
| [**modelscanApiV3PostScanResultsWithHttpInfo**](ModelSupplyChainApi.md#modelscanApiV3PostScanResultsWithHttpInfo) | **POST** /scans/v3/reports/{scan_id} | Engine Report Endpoint of Model Scan Results |
| [**modelscannerApiV3GetJobs**](ModelSupplyChainApi.md#modelscannerApiV3GetJobs) | **GET** /scans/v3/jobs | List all Model Scan Jobs |
| [**modelscannerApiV3GetJobsWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3GetJobsWithHttpInfo) | **GET** /scans/v3/jobs | List all Model Scan Jobs |
| [**modelscannerApiV3HealthCheck**](ModelSupplyChainApi.md#modelscannerApiV3HealthCheck) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3HealthCheckWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3HealthCheckWithHttpInfo) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3PostRequest**](ModelSupplyChainApi.md#modelscannerApiV3PostRequest) | **POST** /scans/v3/jobs | Request a Model Scan Job |
| [**modelscannerApiV3PostRequestWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3PostRequestWithHttpInfo) | **POST** /scans/v3/jobs | Request a Model Scan Job |
| [**modelscannerApiV3ReadinessCheck**](ModelSupplyChainApi.md#modelscannerApiV3ReadinessCheck) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3ReadinessCheckWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3ReadinessCheckWithHttpInfo) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |



## modelScanApiV3ScanModelVersionIdGet

> ScanReportV3 modelScanApiV3ScanModelVersionIdGet(scanId, hasDetections)

Get Result of a Model Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            ScanReportV3 result = apiInstance.modelScanApiV3ScanModelVersionIdGet(scanId, hasDetections);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdGet");
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
| **scanId** | **UUID**|  | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type

[**ScanReportV3**](ScanReportV3.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/sarif+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

## modelScanApiV3ScanModelVersionIdGetWithHttpInfo

> ApiResponse<ScanReportV3> modelScanApiV3ScanModelVersionIdGet modelScanApiV3ScanModelVersionIdGetWithHttpInfo(scanId, hasDetections)

Get Result of a Model Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            ApiResponse<ScanReportV3> response = apiInstance.modelScanApiV3ScanModelVersionIdGetWithHttpInfo(scanId, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdGet");
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
| **scanId** | **UUID**|  | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type

ApiResponse<[**ScanReportV3**](ScanReportV3.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/sarif+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |


## modelScanApiV3ScanModelVersionIdPatch

> ModelScanApiV3ScanModelVersionIdPatch200Response modelScanApiV3ScanModelVersionIdPatch(scanId, scanReportV3, hasDetections)

Indicate part (file or files) of a model scan has completed

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        ScanReportV3 scanReportV3 = new ScanReportV3(); // ScanReportV3 | Request body for partial update
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            ModelScanApiV3ScanModelVersionIdPatch200Response result = apiInstance.modelScanApiV3ScanModelVersionIdPatch(scanId, scanReportV3, hasDetections);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdPatch");
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
| **scanId** | **UUID**|  | |
| **scanReportV3** | [**ScanReportV3**](ScanReportV3.md)| Request body for partial update | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type

[**ModelScanApiV3ScanModelVersionIdPatch200Response**](ModelScanApiV3ScanModelVersionIdPatch200Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## modelScanApiV3ScanModelVersionIdPatchWithHttpInfo

> ApiResponse<ModelScanApiV3ScanModelVersionIdPatch200Response> modelScanApiV3ScanModelVersionIdPatch modelScanApiV3ScanModelVersionIdPatchWithHttpInfo(scanId, scanReportV3, hasDetections)

Indicate part (file or files) of a model scan has completed

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        ScanReportV3 scanReportV3 = new ScanReportV3(); // ScanReportV3 | Request body for partial update
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            ApiResponse<ModelScanApiV3ScanModelVersionIdPatch200Response> response = apiInstance.modelScanApiV3ScanModelVersionIdPatchWithHttpInfo(scanId, scanReportV3, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdPatch");
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
| **scanId** | **UUID**|  | |
| **scanReportV3** | [**ScanReportV3**](ScanReportV3.md)| Request body for partial update | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type

ApiResponse<[**ModelScanApiV3ScanModelVersionIdPatch200Response**](ModelScanApiV3ScanModelVersionIdPatch200Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## modelScanApiV3ScanModelVersionIdPost

> void modelScanApiV3ScanModelVersionIdPost(scanId, scanReportV3, hasDetections)

Indicate model scan has started

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        ScanReportV3 scanReportV3 = new ScanReportV3(); // ScanReportV3 | Request body for create
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            apiInstance.modelScanApiV3ScanModelVersionIdPost(scanId, scanReportV3, hasDetections);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdPost");
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
| **scanId** | **UUID**|  | |
| **scanReportV3** | [**ScanReportV3**](ScanReportV3.md)| Request body for create | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## modelScanApiV3ScanModelVersionIdPostWithHttpInfo

> ApiResponse<Void> modelScanApiV3ScanModelVersionIdPost modelScanApiV3ScanModelVersionIdPostWithHttpInfo(scanId, scanReportV3, hasDetections)

Indicate model scan has started

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.fromString("00000000-0000-0000-0000-000000000000"); // UUID | 
        ScanReportV3 scanReportV3 = new ScanReportV3(); // ScanReportV3 | Request body for create
        Boolean hasDetections = true; // Boolean | Filter file_results to only those that have detections (and parents)
        try {
            ApiResponse<Void> response = apiInstance.modelScanApiV3ScanModelVersionIdPostWithHttpInfo(scanId, scanReportV3, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanModelVersionIdPost");
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
| **scanId** | **UUID**|  | |
| **scanReportV3** | [**ScanReportV3**](ScanReportV3.md)| Request body for create | |
| **hasDetections** | **Boolean**| Filter file_results to only those that have detections (and parents) | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## modelScanApiV3ScanQuery

> ModelScanApiV3ScanQuery200Response modelScanApiV3ScanQuery(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly)

Get condensed reports for a Model Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        List<String> modelVersionIds = Arrays.asList(); // List<String> | Model Version ID
        List<String> modelIds = Arrays.asList(); // List<String> | Model ID
        OffsetDateTime startTime = OffsetDateTime.parse("2025-05-27T00:00:00Z"); // OffsetDateTime | Start Time
        OffsetDateTime endTime = OffsetDateTime.parse("2025-05-27T23:59:59Z"); // OffsetDateTime | End Time
        List<String> severity = Arrays.asList(); // List<String> | Severities
        List<String> status = Arrays.asList(); // List<String> | Statuses
        Integer limit = 25; // Integer | 
        Integer offset = 0; // Integer | 
        String sort = "-start_time"; // String | allow sorting by status, severity or created at, ascending (+) or the default descending (-)
        Boolean latestPerModelVersionOnly = false; // Boolean | only return latest result per model version
        try {
            ModelScanApiV3ScanQuery200Response result = apiInstance.modelScanApiV3ScanQuery(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanQuery");
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
| **modelVersionIds** | [**List&lt;String&gt;**](String.md)| Model Version ID | [optional] |
| **modelIds** | [**List&lt;String&gt;**](String.md)| Model ID | [optional] |
| **startTime** | **OffsetDateTime**| Start Time | [optional] |
| **endTime** | **OffsetDateTime**| End Time | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)| Severities | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| Statuses | [optional] |
| **limit** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **sort** | **String**| allow sorting by status, severity or created at, ascending (+) or the default descending (-) | [optional] [default to -start_time] |
| **latestPerModelVersionOnly** | **Boolean**| only return latest result per model version | [optional] [default to false] |

### Return type

[**ModelScanApiV3ScanQuery200Response**](ModelScanApiV3ScanQuery200Response.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

## modelScanApiV3ScanQueryWithHttpInfo

> ApiResponse<ModelScanApiV3ScanQuery200Response> modelScanApiV3ScanQuery modelScanApiV3ScanQueryWithHttpInfo(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly)

Get condensed reports for a Model Scan

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        List<String> modelVersionIds = Arrays.asList(); // List<String> | Model Version ID
        List<String> modelIds = Arrays.asList(); // List<String> | Model ID
        OffsetDateTime startTime = OffsetDateTime.parse("2025-05-27T00:00:00Z"); // OffsetDateTime | Start Time
        OffsetDateTime endTime = OffsetDateTime.parse("2025-05-27T23:59:59Z"); // OffsetDateTime | End Time
        List<String> severity = Arrays.asList(); // List<String> | Severities
        List<String> status = Arrays.asList(); // List<String> | Statuses
        Integer limit = 25; // Integer | 
        Integer offset = 0; // Integer | 
        String sort = "-start_time"; // String | allow sorting by status, severity or created at, ascending (+) or the default descending (-)
        Boolean latestPerModelVersionOnly = false; // Boolean | only return latest result per model version
        try {
            ApiResponse<ModelScanApiV3ScanQuery200Response> response = apiInstance.modelScanApiV3ScanQueryWithHttpInfo(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelScanApiV3ScanQuery");
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
| **modelVersionIds** | [**List&lt;String&gt;**](String.md)| Model Version ID | [optional] |
| **modelIds** | [**List&lt;String&gt;**](String.md)| Model ID | [optional] |
| **startTime** | **OffsetDateTime**| Start Time | [optional] |
| **endTime** | **OffsetDateTime**| End Time | [optional] |
| **severity** | [**List&lt;String&gt;**](String.md)| Severities | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| Statuses | [optional] |
| **limit** | **Integer**|  | [optional] [default to 25] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **sort** | **String**| allow sorting by status, severity or created at, ascending (+) or the default descending (-) | [optional] [default to -start_time] |
| **latestPerModelVersionOnly** | **Boolean**| only return latest result per model version | [optional] [default to false] |

### Return type

ApiResponse<[**ModelScanApiV3ScanQuery200Response**](ModelScanApiV3ScanQuery200Response.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |


## modelscanApiV3GetScanResults

> List<ScanResultsV2> modelscanApiV3GetScanResults(scanId)

Retrieve Model Scan Results

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.randomUUID(); // UUID | 
        try {
            List<ScanResultsV2> result = apiInstance.modelscanApiV3GetScanResults(scanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscanApiV3GetScanResults");
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
| **scanId** | **UUID**|  | [optional] |

### Return type

[**List&lt;ScanResultsV2&gt;**](ScanResultsV2.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan finished. Full results returned. |  -  |
| **202** | Scan still in progress. Partial results returned. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **422** | Validation Error |  -  |

## modelscanApiV3GetScanResultsWithHttpInfo

> ApiResponse<List<ScanResultsV2>> modelscanApiV3GetScanResults modelscanApiV3GetScanResultsWithHttpInfo(scanId)

Retrieve Model Scan Results

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<List<ScanResultsV2>> response = apiInstance.modelscanApiV3GetScanResultsWithHttpInfo(scanId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscanApiV3GetScanResults");
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
| **scanId** | **UUID**|  | [optional] |

### Return type

ApiResponse<[**List&lt;ScanResultsV2&gt;**](ScanResultsV2.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan finished. Full results returned. |  -  |
| **202** | Scan still in progress. Partial results returned. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **422** | Validation Error |  -  |


## modelscanApiV3PostScanResults

> void modelscanApiV3PostScanResults(scanId, scanCreateRequest)

Engine Report Endpoint of Model Scan Results

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.randomUUID(); // UUID | 
        ScanCreateRequest scanCreateRequest = new ScanCreateRequest(); // ScanCreateRequest | Request body for reporting a scan of one or more file results
        try {
            apiInstance.modelscanApiV3PostScanResults(scanId, scanCreateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscanApiV3PostScanResults");
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
| **scanId** | **UUID**|  | |
| **scanCreateRequest** | [**ScanCreateRequest**](ScanCreateRequest.md)| Request body for reporting a scan of one or more file results | |

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
| **204** | Report Successful |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## modelscanApiV3PostScanResultsWithHttpInfo

> ApiResponse<Void> modelscanApiV3PostScanResults modelscanApiV3PostScanResultsWithHttpInfo(scanId, scanCreateRequest)

Engine Report Endpoint of Model Scan Results

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        UUID scanId = UUID.randomUUID(); // UUID | 
        ScanCreateRequest scanCreateRequest = new ScanCreateRequest(); // ScanCreateRequest | Request body for reporting a scan of one or more file results
        try {
            ApiResponse<Void> response = apiInstance.modelscanApiV3PostScanResultsWithHttpInfo(scanId, scanCreateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscanApiV3PostScanResults");
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
| **scanId** | **UUID**|  | |
| **scanCreateRequest** | [**ScanCreateRequest**](ScanCreateRequest.md)| Request body for reporting a scan of one or more file results | |

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
| **204** | Report Successful |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## modelscannerApiV3GetJobs

> List<ScanJob> modelscannerApiV3GetJobs()

List all Model Scan Jobs

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            List<ScanJob> result = apiInstance.modelscannerApiV3GetJobs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3GetJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ScanJob&gt;**](ScanJob.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |

## modelscannerApiV3GetJobsWithHttpInfo

> ApiResponse<List<ScanJob>> modelscannerApiV3GetJobs modelscannerApiV3GetJobsWithHttpInfo()

List all Model Scan Jobs

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            ApiResponse<List<ScanJob>> response = apiInstance.modelscannerApiV3GetJobsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3GetJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;ScanJob&gt;**](ScanJob.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |


## modelscannerApiV3HealthCheck

> void modelscannerApiV3HealthCheck()

Health check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            apiInstance.modelscannerApiV3HealthCheck();
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3HealthCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | Healthy |  -  |
| **503** | Not Ready |  -  |

## modelscannerApiV3HealthCheckWithHttpInfo

> ApiResponse<Void> modelscannerApiV3HealthCheck modelscannerApiV3HealthCheckWithHttpInfo()

Health check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            ApiResponse<Void> response = apiInstance.modelscannerApiV3HealthCheckWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3HealthCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | Healthy |  -  |
| **503** | Not Ready |  -  |


## modelscannerApiV3PostRequest

> void modelscannerApiV3PostRequest(scanJob)

Request a Model Scan Job

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        ScanJob scanJob = new ScanJob(); // ScanJob | Request body for create scan request
        try {
            apiInstance.modelscannerApiV3PostRequest(scanJob);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3PostRequest");
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
| **scanJob** | [**ScanJob**](ScanJob.md)| Request body for create scan request | |

### Return type


null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8, application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |

## modelscannerApiV3PostRequestWithHttpInfo

> ApiResponse<Void> modelscannerApiV3PostRequest modelscannerApiV3PostRequestWithHttpInfo(scanJob)

Request a Model Scan Job

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        ScanJob scanJob = new ScanJob(); // ScanJob | Request body for create scan request
        try {
            ApiResponse<Void> response = apiInstance.modelscannerApiV3PostRequestWithHttpInfo(scanJob);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3PostRequest");
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
| **scanJob** | [**ScanJob**](ScanJob.md)| Request body for create scan request | |

### Return type


ApiResponse<Void>

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8, application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The resource was successfully created. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **422** | Validation Error |  -  |


## modelscannerApiV3ReadinessCheck

> void modelscannerApiV3ReadinessCheck()

Readiness check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            apiInstance.modelscannerApiV3ReadinessCheck();
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3ReadinessCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | Ready |  -  |
| **503** | Not Ready |  -  |

## modelscannerApiV3ReadinessCheckWithHttpInfo

> ApiResponse<Void> modelscannerApiV3ReadinessCheck modelscannerApiV3ReadinessCheckWithHttpInfo()

Readiness check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Configuration;
import com.hiddenlayer.sdk.rest.auth.*;
import com.hiddenlayer.sdk.rest.models.*;
import com.hiddenlayer.sdk.rest.api.ModelSupplyChainApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ModelSupplyChainApi apiInstance = new ModelSupplyChainApi(defaultClient);
        try {
            ApiResponse<Void> response = apiInstance.modelscannerApiV3ReadinessCheckWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#modelscannerApiV3ReadinessCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | Ready |  -  |
| **503** | Not Ready |  -  |

