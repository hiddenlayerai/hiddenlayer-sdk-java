# ModelSupplyChainApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beginMultiFileUpload**](ModelSupplyChainApi.md#beginMultiFileUpload) | **POST** /scan/v3/upload | Start V3 Upload |
| [**beginMultiFileUploadWithHttpInfo**](ModelSupplyChainApi.md#beginMultiFileUploadWithHttpInfo) | **POST** /scan/v3/upload | Start V3 Upload |
| [**beginMultipartFileUpload**](ModelSupplyChainApi.md#beginMultipartFileUpload) | **POST** /scan/v3/upload/{scan_id}/file | Add file to V3 Upload |
| [**beginMultipartFileUploadWithHttpInfo**](ModelSupplyChainApi.md#beginMultipartFileUploadWithHttpInfo) | **POST** /scan/v3/upload/{scan_id}/file | Add file to V3 Upload |
| [**completeMultiFileUpload**](ModelSupplyChainApi.md#completeMultiFileUpload) | **PATCH** /scan/v3/upload/{scan_id} | Indicate All files are uploaded and start the scan |
| [**completeMultiFileUploadWithHttpInfo**](ModelSupplyChainApi.md#completeMultiFileUploadWithHttpInfo) | **PATCH** /scan/v3/upload/{scan_id} | Indicate All files are uploaded and start the scan |
| [**completeMultipartFileUpload**](ModelSupplyChainApi.md#completeMultipartFileUpload) | **PATCH** /scan/v3/upload/{scan_id}/file/{file_id} | Indicate that upload is completed for {file_id} |
| [**completeMultipartFileUploadWithHttpInfo**](ModelSupplyChainApi.md#completeMultipartFileUploadWithHttpInfo) | **PATCH** /scan/v3/upload/{scan_id}/file/{file_id} | Indicate that upload is completed for {file_id} |
| [**createScanJob**](ModelSupplyChainApi.md#createScanJob) | **POST** /scans/v3/jobs | Request a Model Scan Job |
| [**createScanJobWithHttpInfo**](ModelSupplyChainApi.md#createScanJobWithHttpInfo) | **POST** /scans/v3/jobs | Request a Model Scan Job |
| [**getCondensedModelScanReports**](ModelSupplyChainApi.md#getCondensedModelScanReports) | **GET** /scan/v3/results | Get condensed reports for a Model Scan |
| [**getCondensedModelScanReportsWithHttpInfo**](ModelSupplyChainApi.md#getCondensedModelScanReportsWithHttpInfo) | **GET** /scan/v3/results | Get condensed reports for a Model Scan |
| [**getScanJobs**](ModelSupplyChainApi.md#getScanJobs) | **GET** /scans/v3/jobs | List all Model Scan Jobs |
| [**getScanJobsWithHttpInfo**](ModelSupplyChainApi.md#getScanJobsWithHttpInfo) | **GET** /scans/v3/jobs | List all Model Scan Jobs |
| [**getScanResults**](ModelSupplyChainApi.md#getScanResults) | **GET** /scan/v3/results/{scan_id} | Get Result of a Model Scan |
| [**getScanResultsWithHttpInfo**](ModelSupplyChainApi.md#getScanResultsWithHttpInfo) | **GET** /scan/v3/results/{scan_id} | Get Result of a Model Scan |
| [**getScanResults1**](ModelSupplyChainApi.md#getScanResults1) | **GET** /scans/v3/results/{scan_id} | Retrieve Model Scan Results |
| [**getScanResults1WithHttpInfo**](ModelSupplyChainApi.md#getScanResults1WithHttpInfo) | **GET** /scans/v3/results/{scan_id} | Retrieve Model Scan Results |
| [**modelscannerApiV3HealthCheck**](ModelSupplyChainApi.md#modelscannerApiV3HealthCheck) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3HealthCheckWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3HealthCheckWithHttpInfo) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3ReadinessCheck**](ModelSupplyChainApi.md#modelscannerApiV3ReadinessCheck) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3ReadinessCheckWithHttpInfo**](ModelSupplyChainApi.md#modelscannerApiV3ReadinessCheckWithHttpInfo) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |
| [**notifyModelScanCompleted**](ModelSupplyChainApi.md#notifyModelScanCompleted) | **PATCH** /scan/v3/results/{scan_id} | Indicate part (file or files) of a model scan has completed |
| [**notifyModelScanCompletedWithHttpInfo**](ModelSupplyChainApi.md#notifyModelScanCompletedWithHttpInfo) | **PATCH** /scan/v3/results/{scan_id} | Indicate part (file or files) of a model scan has completed |
| [**notifyModelScanStarted**](ModelSupplyChainApi.md#notifyModelScanStarted) | **POST** /scan/v3/results/{scan_id} | Indicate model scan has started |
| [**notifyModelScanStartedWithHttpInfo**](ModelSupplyChainApi.md#notifyModelScanStartedWithHttpInfo) | **POST** /scan/v3/results/{scan_id} | Indicate model scan has started |
| [**reportScanResults**](ModelSupplyChainApi.md#reportScanResults) | **POST** /scans/v3/reports/{scan_id} | Engine Report Endpoint of Model Scan Results |
| [**reportScanResultsWithHttpInfo**](ModelSupplyChainApi.md#reportScanResultsWithHttpInfo) | **POST** /scans/v3/reports/{scan_id} | Engine Report Endpoint of Model Scan Results |



## beginMultiFileUpload

> BeginMultiFileUpload200Response beginMultiFileUpload(multiFileUploadRequestV3)

Start V3 Upload

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
        MultiFileUploadRequestV3 multiFileUploadRequestV3 = new MultiFileUploadRequestV3(); // MultiFileUploadRequestV3 | Request body for create
        try {
            BeginMultiFileUpload200Response result = apiInstance.beginMultiFileUpload(multiFileUploadRequestV3);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#beginMultiFileUpload");
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
| **multiFileUploadRequestV3** | [**MultiFileUploadRequestV3**](MultiFileUploadRequestV3.md)| Request body for create | |

### Return type

[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)


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

## beginMultiFileUploadWithHttpInfo

> ApiResponse<BeginMultiFileUpload200Response> beginMultiFileUpload beginMultiFileUploadWithHttpInfo(multiFileUploadRequestV3)

Start V3 Upload

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
        MultiFileUploadRequestV3 multiFileUploadRequestV3 = new MultiFileUploadRequestV3(); // MultiFileUploadRequestV3 | Request body for create
        try {
            ApiResponse<BeginMultiFileUpload200Response> response = apiInstance.beginMultiFileUploadWithHttpInfo(multiFileUploadRequestV3);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#beginMultiFileUpload");
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
| **multiFileUploadRequestV3** | [**MultiFileUploadRequestV3**](MultiFileUploadRequestV3.md)| Request body for create | |

### Return type

ApiResponse<[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)>


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


## beginMultipartFileUpload

> BeginMultipartFileUpload200Response beginMultipartFileUpload(fileContentLength, fileName, scanId)

Add file to V3 Upload

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
        Integer fileContentLength = 12345; // Integer | Added file size in bytes
        String fileName = "exampleFile.txt"; // String | Added file name
        UUID scanId = UUID.randomUUID(); // UUID | 
        try {
            BeginMultipartFileUpload200Response result = apiInstance.beginMultipartFileUpload(fileContentLength, fileName, scanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#beginMultipartFileUpload");
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
| **fileContentLength** | **Integer**| Added file size in bytes | |
| **fileName** | **String**| Added file name | |
| **scanId** | **UUID**|  | |

### Return type

[**BeginMultipartFileUpload200Response**](BeginMultipartFileUpload200Response.md)


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
| **422** | Validation Error |  -  |

## beginMultipartFileUploadWithHttpInfo

> ApiResponse<BeginMultipartFileUpload200Response> beginMultipartFileUpload beginMultipartFileUploadWithHttpInfo(fileContentLength, fileName, scanId)

Add file to V3 Upload

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
        Integer fileContentLength = 12345; // Integer | Added file size in bytes
        String fileName = "exampleFile.txt"; // String | Added file name
        UUID scanId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<BeginMultipartFileUpload200Response> response = apiInstance.beginMultipartFileUploadWithHttpInfo(fileContentLength, fileName, scanId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#beginMultipartFileUpload");
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
| **fileContentLength** | **Integer**| Added file size in bytes | |
| **fileName** | **String**| Added file name | |
| **scanId** | **UUID**|  | |

### Return type

ApiResponse<[**BeginMultipartFileUpload200Response**](BeginMultipartFileUpload200Response.md)>


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
| **422** | Validation Error |  -  |


## completeMultiFileUpload

> BeginMultiFileUpload200Response completeMultiFileUpload(scanId)

Indicate All files are uploaded and start the scan

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
            BeginMultiFileUpload200Response result = apiInstance.completeMultiFileUpload(scanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#completeMultiFileUpload");
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

### Return type

[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)


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
| **422** | Validation Error |  -  |

## completeMultiFileUploadWithHttpInfo

> ApiResponse<BeginMultiFileUpload200Response> completeMultiFileUpload completeMultiFileUploadWithHttpInfo(scanId)

Indicate All files are uploaded and start the scan

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
            ApiResponse<BeginMultiFileUpload200Response> response = apiInstance.completeMultiFileUploadWithHttpInfo(scanId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#completeMultiFileUpload");
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

### Return type

ApiResponse<[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)>


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
| **422** | Validation Error |  -  |


## completeMultipartFileUpload

> BeginMultiFileUpload200Response completeMultipartFileUpload(scanId, fileId)

Indicate that upload is completed for {file_id}

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
        UUID fileId = UUID.randomUUID(); // UUID | 
        try {
            BeginMultiFileUpload200Response result = apiInstance.completeMultipartFileUpload(scanId, fileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#completeMultipartFileUpload");
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
| **fileId** | **UUID**|  | |

### Return type

[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)


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
| **422** | Validation Error |  -  |

## completeMultipartFileUploadWithHttpInfo

> ApiResponse<BeginMultiFileUpload200Response> completeMultipartFileUpload completeMultipartFileUploadWithHttpInfo(scanId, fileId)

Indicate that upload is completed for {file_id}

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
        UUID fileId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<BeginMultiFileUpload200Response> response = apiInstance.completeMultipartFileUploadWithHttpInfo(scanId, fileId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#completeMultipartFileUpload");
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
| **fileId** | **UUID**|  | |

### Return type

ApiResponse<[**BeginMultiFileUpload200Response**](BeginMultiFileUpload200Response.md)>


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
| **422** | Validation Error |  -  |


## createScanJob

> void createScanJob(scanJob)

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
            apiInstance.createScanJob(scanJob);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#createScanJob");
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

## createScanJobWithHttpInfo

> ApiResponse<Void> createScanJob createScanJobWithHttpInfo(scanJob)

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
            ApiResponse<Void> response = apiInstance.createScanJobWithHttpInfo(scanJob);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#createScanJob");
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


## getCondensedModelScanReports

> GetCondensedModelScanReports200Response getCondensedModelScanReports(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly)

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
            GetCondensedModelScanReports200Response result = apiInstance.getCondensedModelScanReports(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getCondensedModelScanReports");
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

[**GetCondensedModelScanReports200Response**](GetCondensedModelScanReports200Response.md)


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

## getCondensedModelScanReportsWithHttpInfo

> ApiResponse<GetCondensedModelScanReports200Response> getCondensedModelScanReports getCondensedModelScanReportsWithHttpInfo(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly)

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
            ApiResponse<GetCondensedModelScanReports200Response> response = apiInstance.getCondensedModelScanReportsWithHttpInfo(modelVersionIds, modelIds, startTime, endTime, severity, status, limit, offset, sort, latestPerModelVersionOnly);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getCondensedModelScanReports");
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

ApiResponse<[**GetCondensedModelScanReports200Response**](GetCondensedModelScanReports200Response.md)>


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


## getScanJobs

> List<ScanJob> getScanJobs()

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
            List<ScanJob> result = apiInstance.getScanJobs();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanJobs");
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

## getScanJobsWithHttpInfo

> ApiResponse<List<ScanJob>> getScanJobs getScanJobsWithHttpInfo()

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
            ApiResponse<List<ScanJob>> response = apiInstance.getScanJobsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanJobs");
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


## getScanResults

> ScanReportV3 getScanResults(scanId, hasDetections)

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
            ScanReportV3 result = apiInstance.getScanResults(scanId, hasDetections);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanResults");
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

## getScanResultsWithHttpInfo

> ApiResponse<ScanReportV3> getScanResults getScanResultsWithHttpInfo(scanId, hasDetections)

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
            ApiResponse<ScanReportV3> response = apiInstance.getScanResultsWithHttpInfo(scanId, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanResults");
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


## getScanResults1

> List<ScanResultsMapV3> getScanResults1(scanId, cursor, pageSize)

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
        String cursor = "cursor_example"; // String | 
        Integer pageSize = 25; // Integer | 
        try {
            List<ScanResultsMapV3> result = apiInstance.getScanResults1(scanId, cursor, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanResults1");
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
| **cursor** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |

### Return type

[**List&lt;ScanResultsMapV3&gt;**](ScanResultsMapV3.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan finished. Full results returned. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **405** | The specified method is not allowed. |  -  |

## getScanResults1WithHttpInfo

> ApiResponse<List<ScanResultsMapV3>> getScanResults1 getScanResults1WithHttpInfo(scanId, cursor, pageSize)

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
        String cursor = "cursor_example"; // String | 
        Integer pageSize = 25; // Integer | 
        try {
            ApiResponse<List<ScanResultsMapV3>> response = apiInstance.getScanResults1WithHttpInfo(scanId, cursor, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#getScanResults1");
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
| **cursor** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] [default to 25] |

### Return type

ApiResponse<[**List&lt;ScanResultsMapV3&gt;**](ScanResultsMapV3.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scan finished. Full results returned. |  -  |
| **400** | The request failed due to a client error, with one or more of the following possible causes: 1. The request required a tenant_id field, which was missing. 2. The request was malformed syntactically or semantically. |  -  |
| **404** | The specified resource was not found. |  -  |
| **405** | The specified method is not allowed. |  -  |


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


## notifyModelScanCompleted

> NotifyModelScanCompleted200Response notifyModelScanCompleted(scanId, scanReportV3, hasDetections)

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
            NotifyModelScanCompleted200Response result = apiInstance.notifyModelScanCompleted(scanId, scanReportV3, hasDetections);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#notifyModelScanCompleted");
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

[**NotifyModelScanCompleted200Response**](NotifyModelScanCompleted200Response.md)


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

## notifyModelScanCompletedWithHttpInfo

> ApiResponse<NotifyModelScanCompleted200Response> notifyModelScanCompleted notifyModelScanCompletedWithHttpInfo(scanId, scanReportV3, hasDetections)

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
            ApiResponse<NotifyModelScanCompleted200Response> response = apiInstance.notifyModelScanCompletedWithHttpInfo(scanId, scanReportV3, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#notifyModelScanCompleted");
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

ApiResponse<[**NotifyModelScanCompleted200Response**](NotifyModelScanCompleted200Response.md)>


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


## notifyModelScanStarted

> void notifyModelScanStarted(scanId, scanReportV3, hasDetections)

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
            apiInstance.notifyModelScanStarted(scanId, scanReportV3, hasDetections);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#notifyModelScanStarted");
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

## notifyModelScanStartedWithHttpInfo

> ApiResponse<Void> notifyModelScanStarted notifyModelScanStartedWithHttpInfo(scanId, scanReportV3, hasDetections)

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
            ApiResponse<Void> response = apiInstance.notifyModelScanStartedWithHttpInfo(scanId, scanReportV3, hasDetections);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#notifyModelScanStarted");
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


## reportScanResults

> void reportScanResults(scanId, scanCreateRequest)

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
            apiInstance.reportScanResults(scanId, scanCreateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#reportScanResults");
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

## reportScanResultsWithHttpInfo

> ApiResponse<Void> reportScanResults reportScanResultsWithHttpInfo(scanId, scanCreateRequest)

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
            ApiResponse<Void> response = apiInstance.reportScanResultsWithHttpInfo(scanId, scanCreateRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ModelSupplyChainApi#reportScanResults");
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

