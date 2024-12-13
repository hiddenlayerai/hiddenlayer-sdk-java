# HealthApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modelscannerApiV3HealthCheck**](HealthApi.md#modelscannerApiV3HealthCheck) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3HealthCheckWithHttpInfo**](HealthApi.md#modelscannerApiV3HealthCheckWithHttpInfo) | **GET** /scans/v3/health | Health check endpoint for Model Supply Chain Services |



## modelscannerApiV3HealthCheck

> void modelscannerApiV3HealthCheck()

Health check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import hiddenlayer.sdk.ApiClient;
import hiddenlayer.sdk.ApiException;
import hiddenlayer.sdk.Configuration;
import hiddenlayer.sdk.auth.*;
import hiddenlayer.sdk.models.*;
import hiddenlayer.sdk.rest.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HealthApi apiInstance = new HealthApi(defaultClient);
        try {
            apiInstance.modelscannerApiV3HealthCheck();
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#modelscannerApiV3HealthCheck");
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
import hiddenlayer.sdk.ApiClient;
import hiddenlayer.sdk.ApiException;
import hiddenlayer.sdk.ApiResponse;
import hiddenlayer.sdk.Configuration;
import hiddenlayer.sdk.auth.*;
import hiddenlayer.sdk.models.*;
import hiddenlayer.sdk.rest.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        HealthApi apiInstance = new HealthApi(defaultClient);
        try {
            ApiResponse<Void> response = apiInstance.modelscannerApiV3HealthCheckWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#modelscannerApiV3HealthCheck");
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

