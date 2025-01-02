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

import com.hiddenlayer.sdk.rest.models.CreateSensorRequest;
import com.hiddenlayer.sdk.rest.models.GetMultipartUploadResponse;
import com.hiddenlayer.sdk.rest.models.Model;
import com.hiddenlayer.sdk.rest.models.ModelQueryResponse;
import com.hiddenlayer.sdk.rest.models.SensorSORModelCardQueryResponse;
import com.hiddenlayer.sdk.rest.models.SensorSORQueryRequest;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class SensorApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SensorApi() {
    this(new ApiClient());
  }

  public SensorApi(ApiClient apiClient) {
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
   * Begin Multipart Upload
   * 
   * @param sensorId  (required)
   * @param xContentLength The total size of multipart upload. (required)
   * @return GetMultipartUploadResponse
   * @throws ApiException if fails to make API call
   */
  public GetMultipartUploadResponse beginMultipartUpload(UUID sensorId, Long xContentLength) throws ApiException {
    ApiResponse<GetMultipartUploadResponse> localVarResponse = beginMultipartUploadWithHttpInfo(sensorId, xContentLength);
    return localVarResponse.getData();
  }

  /**
   * Begin Multipart Upload
   * 
   * @param sensorId  (required)
   * @param xContentLength The total size of multipart upload. (required)
   * @return ApiResponse&lt;GetMultipartUploadResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetMultipartUploadResponse> beginMultipartUploadWithHttpInfo(UUID sensorId, Long xContentLength) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = beginMultipartUploadRequestBuilder(sensorId, xContentLength);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("beginMultipartUpload", localVarResponse);
        }
        return new ApiResponse<GetMultipartUploadResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetMultipartUploadResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder beginMultipartUploadRequestBuilder(UUID sensorId, Long xContentLength) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling beginMultipartUpload");
    }
    // verify the required parameter 'xContentLength' is set
    if (xContentLength == null) {
      throw new ApiException(400, "Missing the required parameter 'xContentLength' when calling beginMultipartUpload");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/{sensor_id}/upload/begin"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (xContentLength != null) {
      localVarRequestBuilder.header("X-Content-Length", xContentLength.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Complete Multipart Upload
   * 
   * @param sensorId  (required)
   * @param uploadId  (required)
   * @throws ApiException if fails to make API call
   */
  public void completeMultipartUpload(UUID sensorId, String uploadId) throws ApiException {
    completeMultipartUploadWithHttpInfo(sensorId, uploadId);
  }

  /**
   * Complete Multipart Upload
   * 
   * @param sensorId  (required)
   * @param uploadId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> completeMultipartUploadWithHttpInfo(UUID sensorId, String uploadId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = completeMultipartUploadRequestBuilder(sensorId, uploadId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("completeMultipartUpload", localVarResponse);
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

  private HttpRequest.Builder completeMultipartUploadRequestBuilder(UUID sensorId, String uploadId) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling completeMultipartUpload");
    }
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling completeMultipartUpload");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/{sensor_id}/upload/{upload_id}/complete"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()))
        .replace("{upload_id}", ApiClient.urlEncode(uploadId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Create a Sensor
   * 
   * @param createSensorRequest Request body for create (required)
   * @return Model
   * @throws ApiException if fails to make API call
   */
  public Model createSensor(CreateSensorRequest createSensorRequest) throws ApiException {
    ApiResponse<Model> localVarResponse = createSensorWithHttpInfo(createSensorRequest);
    return localVarResponse.getData();
  }

  /**
   * Create a Sensor
   * 
   * @param createSensorRequest Request body for create (required)
   * @return ApiResponse&lt;Model&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Model> createSensorWithHttpInfo(CreateSensorRequest createSensorRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createSensorRequestBuilder(createSensorRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createSensor", localVarResponse);
        }
        return new ApiResponse<Model>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Model>() {}) // closes the InputStream
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

  private HttpRequest.Builder createSensorRequestBuilder(CreateSensorRequest createSensorRequest) throws ApiException {
    // verify the required parameter 'createSensorRequest' is set
    if (createSensorRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'createSensorRequest' when calling createSensor");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createSensorRequest);
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
   * Remove an Adhoc Sensor
   * 
   * @param sensorId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteModel(UUID sensorId) throws ApiException {
    deleteModelWithHttpInfo(sensorId);
  }

  /**
   * Remove an Adhoc Sensor
   * 
   * @param sensorId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteModelWithHttpInfo(UUID sensorId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = deleteModelRequestBuilder(sensorId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("deleteModel", localVarResponse);
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

  private HttpRequest.Builder deleteModelRequestBuilder(UUID sensorId) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling deleteModel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/{sensor_id}"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Get Model
   * 
   * @param sensorId  (required)
   * @return Model
   * @throws ApiException if fails to make API call
   */
  public Model getModel(UUID sensorId) throws ApiException {
    ApiResponse<Model> localVarResponse = getModelWithHttpInfo(sensorId);
    return localVarResponse.getData();
  }

  /**
   * Get Model
   * 
   * @param sensorId  (required)
   * @return ApiResponse&lt;Model&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Model> getModelWithHttpInfo(UUID sensorId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getModelRequestBuilder(sensorId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getModel", localVarResponse);
        }
        return new ApiResponse<Model>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Model>() {}) // closes the InputStream
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

  private HttpRequest.Builder getModelRequestBuilder(UUID sensorId) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling getModel");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/{sensor_id}"
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

  /**
   * Query a Sensor
   * 
   * @param sensorSORQueryRequest Request body for create (optional)
   * @return ModelQueryResponse
   * @throws ApiException if fails to make API call
   */
  public ModelQueryResponse querySensor(SensorSORQueryRequest sensorSORQueryRequest) throws ApiException {
    ApiResponse<ModelQueryResponse> localVarResponse = querySensorWithHttpInfo(sensorSORQueryRequest);
    return localVarResponse.getData();
  }

  /**
   * Query a Sensor
   * 
   * @param sensorSORQueryRequest Request body for create (optional)
   * @return ApiResponse&lt;ModelQueryResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ModelQueryResponse> querySensorWithHttpInfo(SensorSORQueryRequest sensorSORQueryRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = querySensorRequestBuilder(sensorSORQueryRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("querySensor", localVarResponse);
        }
        return new ApiResponse<ModelQueryResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ModelQueryResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder querySensorRequestBuilder(SensorSORQueryRequest sensorSORQueryRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/query";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(sensorSORQueryRequest);
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
   * List Model Cards
   * 
   * @param modelNameEq substring match on model name (optional)
   * @param modelNameContains substring match on model name (optional)
   * @param limit  (optional, default to 25)
   * @param offset  (optional, default to 0)
   * @param sort allow sorting by model name or created at timestamp, ascending (+) or the default descending (-) (optional, default to -created_at)
   * @return SensorSORModelCardQueryResponse
   * @throws ApiException if fails to make API call
   */
  public SensorSORModelCardQueryResponse sensorSorApiV3ModelCardsQueryGet(String modelNameEq, String modelNameContains, Integer limit, Integer offset, String sort) throws ApiException {
    ApiResponse<SensorSORModelCardQueryResponse> localVarResponse = sensorSorApiV3ModelCardsQueryGetWithHttpInfo(modelNameEq, modelNameContains, limit, offset, sort);
    return localVarResponse.getData();
  }

  /**
   * List Model Cards
   * 
   * @param modelNameEq substring match on model name (optional)
   * @param modelNameContains substring match on model name (optional)
   * @param limit  (optional, default to 25)
   * @param offset  (optional, default to 0)
   * @param sort allow sorting by model name or created at timestamp, ascending (+) or the default descending (-) (optional, default to -created_at)
   * @return ApiResponse&lt;SensorSORModelCardQueryResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SensorSORModelCardQueryResponse> sensorSorApiV3ModelCardsQueryGetWithHttpInfo(String modelNameEq, String modelNameContains, Integer limit, Integer offset, String sort) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = sensorSorApiV3ModelCardsQueryGetRequestBuilder(modelNameEq, modelNameContains, limit, offset, sort);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("sensorSorApiV3ModelCardsQueryGet", localVarResponse);
        }
        return new ApiResponse<SensorSORModelCardQueryResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SensorSORModelCardQueryResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder sensorSorApiV3ModelCardsQueryGetRequestBuilder(String modelNameEq, String modelNameContains, Integer limit, Integer offset, String sort) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/models/v3/cards";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "model_name[eq]";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("model_name[eq]", modelNameEq));
    localVarQueryParameterBaseName = "model_name[contains]";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("model_name[contains]", modelNameContains));
    localVarQueryParameterBaseName = "limit";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParameterBaseName = "offset";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("offset", offset));
    localVarQueryParameterBaseName = "sort";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("sort", sort));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

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

  /**
   * Upload part
   * 
   * @param sensorId  (required)
   * @param uploadId  (required)
   * @param part  (required)
   * @param body  (required)
   * @throws ApiException if fails to make API call
   */
  public void uploadModelPart(UUID sensorId, String uploadId, Integer part, Object body) throws ApiException {
    uploadModelPartWithHttpInfo(sensorId, uploadId, part, body);
  }

  /**
   * Upload part
   * 
   * @param sensorId  (required)
   * @param uploadId  (required)
   * @param part  (required)
   * @param body  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> uploadModelPartWithHttpInfo(UUID sensorId, String uploadId, Integer part, Object body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = uploadModelPartRequestBuilder(sensorId, uploadId, part, body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("uploadModelPart", localVarResponse);
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

  private HttpRequest.Builder uploadModelPartRequestBuilder(UUID sensorId, String uploadId, Integer part, Object body) throws ApiException {
    // verify the required parameter 'sensorId' is set
    if (sensorId == null) {
      throw new ApiException(400, "Missing the required parameter 'sensorId' when calling uploadModelPart");
    }
    // verify the required parameter 'uploadId' is set
    if (uploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'uploadId' when calling uploadModelPart");
    }
    // verify the required parameter 'part' is set
    if (part == null) {
      throw new ApiException(400, "Missing the required parameter 'part' when calling uploadModelPart");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling uploadModelPart");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v2/sensors/{sensor_id}/upload/{upload_id}/part/{part}"
        .replace("{sensor_id}", ApiClient.urlEncode(sensorId.toString()))
        .replace("{upload_id}", ApiClient.urlEncode(uploadId.toString()))
        .replace("{part}", ApiClient.urlEncode(part.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/octet-stream");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
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

}
