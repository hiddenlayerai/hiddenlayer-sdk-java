# ReadinessApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modelscannerApiV3ReadinessCheck**](ReadinessApi.md#modelscannerApiV3ReadinessCheck) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |
| [**modelscannerApiV3ReadinessCheckWithHttpInfo**](ReadinessApi.md#modelscannerApiV3ReadinessCheckWithHttpInfo) | **GET** /scans/v3/readiness | Readiness check endpoint for Model Supply Chain Services |



## modelscannerApiV3ReadinessCheck

> void modelscannerApiV3ReadinessCheck()

Readiness check endpoint for Model Supply Chain Services

### Example

```java
// Import classes:
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.ReadinessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ReadinessApi apiInstance = new ReadinessApi(defaultClient);
        try {
            apiInstance.modelscannerApiV3ReadinessCheck();
        } catch (ApiException e) {
            System.err.println("Exception when calling ReadinessApi#modelscannerApiV3ReadinessCheck");
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
import com.hiddenlayer.sdk.ApiClient;
import com.hiddenlayer.sdk.ApiException;
import com.hiddenlayer.sdk.ApiResponse;
import com.hiddenlayer.sdk.Configuration;
import com.hiddenlayer.sdk.auth.*;
import com.hiddenlayer.sdk.models.*;
import com.hiddenlayer.sdk.rest.ReadinessApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        ReadinessApi apiInstance = new ReadinessApi(defaultClient);
        try {
            ApiResponse<Void> response = apiInstance.modelscannerApiV3ReadinessCheckWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling ReadinessApi#modelscannerApiV3ReadinessCheck");
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

