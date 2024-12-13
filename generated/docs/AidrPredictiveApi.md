# AidrPredictiveApi

All URIs are relative to *https://api.hiddenlayer.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submitVectors**](AidrPredictiveApi.md#submitVectors) | **POST** /api/v2/submit | Submit vectors |
| [**submitVectorsWithHttpInfo**](AidrPredictiveApi.md#submitVectorsWithHttpInfo) | **POST** /api/v2/submit | Submit vectors |



## submitVectors

> SubmissionResponse submitVectors(submissionV2)

Submit vectors

### Example

```java
// Import classes:
import hiddenlayer.sdk.ApiClient;
import hiddenlayer.sdk.ApiException;
import hiddenlayer.sdk.Configuration;
import hiddenlayer.sdk.auth.*;
import hiddenlayer.sdk.models.*;
import hiddenlayer.sdk.rest.AidrPredictiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AidrPredictiveApi apiInstance = new AidrPredictiveApi(defaultClient);
        SubmissionV2 submissionV2 = new SubmissionV2(); // SubmissionV2 | 
        try {
            SubmissionResponse result = apiInstance.submitVectors(submissionV2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AidrPredictiveApi#submitVectors");
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
| **submissionV2** | [**SubmissionV2**](SubmissionV2.md)|  | |

### Return type

[**SubmissionResponse**](SubmissionResponse.md)


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## submitVectorsWithHttpInfo

> ApiResponse<SubmissionResponse> submitVectors submitVectorsWithHttpInfo(submissionV2)

Submit vectors

### Example

```java
// Import classes:
import hiddenlayer.sdk.ApiClient;
import hiddenlayer.sdk.ApiException;
import hiddenlayer.sdk.ApiResponse;
import hiddenlayer.sdk.Configuration;
import hiddenlayer.sdk.auth.*;
import hiddenlayer.sdk.models.*;
import hiddenlayer.sdk.rest.AidrPredictiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.hiddenlayer.ai");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        AidrPredictiveApi apiInstance = new AidrPredictiveApi(defaultClient);
        SubmissionV2 submissionV2 = new SubmissionV2(); // SubmissionV2 | 
        try {
            ApiResponse<SubmissionResponse> response = apiInstance.submitVectorsWithHttpInfo(submissionV2);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AidrPredictiveApi#submitVectors");
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
| **submissionV2** | [**SubmissionV2**](SubmissionV2.md)|  | |

### Return type

ApiResponse<[**SubmissionResponse**](SubmissionResponse.md)>


### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

