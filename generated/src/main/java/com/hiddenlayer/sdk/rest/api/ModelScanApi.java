/*
 * HiddenLayer ModelScan V2
 * HiddenLayer ModelScan API for scanning of models
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.hiddenlayer.sdk.rest.api;

import com.hiddenlayer.sdk.rest.ApiClient;
import com.hiddenlayer.sdk.rest.ApiException;
import com.hiddenlayer.sdk.rest.ApiResponse;
import com.hiddenlayer.sdk.rest.Pair;

import java.io.File;
import com.hiddenlayer.sdk.rest.models.ScanModelRequest;
import com.hiddenlayer.sdk.rest.models.ScanResultsV2;
import java.util.UUID;
import com.hiddenlayer.sdk.rest.models.ValidationErrorModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:20:36.233399Z[GMT]", comments = "Generator version: 7.6.0")
public class ModelScanApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ModelScanApi() {
    this(new ApiClient());
  }

  public ModelScanApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Scan a model
   * 
   * @param sensorId  (required)
   * @param scanModelRequest Request body for create (optional)
   * @throws ApiException if fails to make API call
   */
  public void scanModel(UUID sensorId, ScanModelRequest scanModelRequest) throws ApiException {
    scanModelWithHttpInfo(sensorId, scanModelRequest);
  }

  /**
   * Scan a model
   * 
   * @param sensorId  (required)
   * @param scanModelRequest Request body for create (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> scanModelWithHttpInfo(UUID sensorId, ScanModelRequest scanModelRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = scanModelRequestBuilder(sensorId, scanModelRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("scanModel", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder scanModelRequestBuilder(UUID sensorId, ScanModelRequest scanModelRequest) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling scanModel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/submit/sensors/{sensor_id}/scan"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(scanModelRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Get Status or Result of a Scan
   * 
   * @param sensorId  (required)
   * @return ScanResultsV2
   * @throws ApiException if fails to make API call
   */
  public ScanResultsV2 scanStatus(UUID sensorId) throws ApiException {
    ApiResponse<ScanResultsV2> localVarResponse = scanStatusWithHttpInfo(sensorId);
    return localVarResponse.getData();
  }

  /**
   * Get Status or Result of a Scan
   * 
   * @param sensorId  (required)
   * @return ApiResponse&lt;ScanResultsV2&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ScanResultsV2> scanStatusWithHttpInfo(UUID sensorId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = scanStatusRequestBuilder(sensorId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("scanStatus", localVarResponse);
        }
        return new ApiResponse<ScanResultsV2>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ScanResultsV2>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder scanStatusRequestBuilder(UUID sensorId) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling scanStatus");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/scan/status/{sensor_id}"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
