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


package com.hiddenlayer.sdk.rest.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * information about model and version that this scan relates to
 */
@JsonPropertyOrder({
  ModelInventoryInfo.JSON_PROPERTY_MODEL_NAME,
  ModelInventoryInfo.JSON_PROPERTY_MODEL_VERSION,
  ModelInventoryInfo.JSON_PROPERTY_MODEL_SOURCE,
  ModelInventoryInfo.JSON_PROPERTY_REQUESTED_SCAN_LOCATION,
  ModelInventoryInfo.JSON_PROPERTY_REQUESTING_ENTITY,
  ModelInventoryInfo.JSON_PROPERTY_MODEL_ID,
  ModelInventoryInfo.JSON_PROPERTY_MODEL_VERSION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-19T23:42:19.631048Z[GMT]", comments = "Generator version: 7.6.0")
public class ModelInventoryInfo {
  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_MODEL_VERSION = "model_version";
  private String modelVersion;

  public static final String JSON_PROPERTY_MODEL_SOURCE = "model_source";
  private String modelSource;

  public static final String JSON_PROPERTY_REQUESTED_SCAN_LOCATION = "requested_scan_location";
  private String requestedScanLocation;

  public static final String JSON_PROPERTY_REQUESTING_ENTITY = "requesting_entity";
  private String requestingEntity;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_MODEL_VERSION_ID = "model_version_id";
  private String modelVersionId;

  public ModelInventoryInfo() { 
  }

  public ModelInventoryInfo modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * name of the model
   * @return modelName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelName() {
    return modelName;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }


  public ModelInventoryInfo modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

   /**
   * version of the model
   * @return modelVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelVersion() {
    return modelVersion;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
  }


  public ModelInventoryInfo modelSource(String modelSource) {
    this.modelSource = modelSource;
    return this;
  }

   /**
   * source (provider) info
   * @return modelSource
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelSource() {
    return modelSource;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelSource(String modelSource) {
    this.modelSource = modelSource;
  }


  public ModelInventoryInfo requestedScanLocation(String requestedScanLocation) {
    this.requestedScanLocation = requestedScanLocation;
    return this;
  }

   /**
   * Location to be scanned
   * @return requestedScanLocation
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUESTED_SCAN_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestedScanLocation() {
    return requestedScanLocation;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTED_SCAN_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestedScanLocation(String requestedScanLocation) {
    this.requestedScanLocation = requestedScanLocation;
  }


  public ModelInventoryInfo requestingEntity(String requestingEntity) {
    this.requestingEntity = requestingEntity;
    return this;
  }

   /**
   * Entity that requested the scan
   * @return requestingEntity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTING_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestingEntity() {
    return requestingEntity;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTING_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestingEntity(String requestingEntity) {
    this.requestingEntity = requestingEntity;
  }


  public ModelInventoryInfo modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Unique identifier for the model
   * @return modelId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelId() {
    return modelId;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelId(String modelId) {
    this.modelId = modelId;
  }


  public ModelInventoryInfo modelVersionId(String modelVersionId) {
    this.modelVersionId = modelVersionId;
    return this;
  }

   /**
   * unique identifier for the model version
   * @return modelVersionId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODEL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModelVersionId() {
    return modelVersionId;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModelVersionId(String modelVersionId) {
    this.modelVersionId = modelVersionId;
  }


  /**
   * Return true if this Model_Inventory_Info object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelInventoryInfo modelInventoryInfo = (ModelInventoryInfo) o;
    return Objects.equals(this.modelName, modelInventoryInfo.modelName) &&
        Objects.equals(this.modelVersion, modelInventoryInfo.modelVersion) &&
        Objects.equals(this.modelSource, modelInventoryInfo.modelSource) &&
        Objects.equals(this.requestedScanLocation, modelInventoryInfo.requestedScanLocation) &&
        Objects.equals(this.requestingEntity, modelInventoryInfo.requestingEntity) &&
        Objects.equals(this.modelId, modelInventoryInfo.modelId) &&
        Objects.equals(this.modelVersionId, modelInventoryInfo.modelVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, modelSource, requestedScanLocation, requestingEntity, modelId, modelVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelInventoryInfo {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    modelSource: ").append(toIndentedString(modelSource)).append("\n");
    sb.append("    requestedScanLocation: ").append(toIndentedString(requestedScanLocation)).append("\n");
    sb.append("    requestingEntity: ").append(toIndentedString(requestingEntity)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    modelVersionId: ").append(toIndentedString(modelVersionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `model_name` to the URL query string
    if (getModelName() != null) {
      joiner.add(String.format("%smodel_name%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `model_version` to the URL query string
    if (getModelVersion() != null) {
      joiner.add(String.format("%smodel_version%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `model_source` to the URL query string
    if (getModelSource() != null) {
      joiner.add(String.format("%smodel_source%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelSource()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `requested_scan_location` to the URL query string
    if (getRequestedScanLocation() != null) {
      joiner.add(String.format("%srequested_scan_location%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestedScanLocation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `requesting_entity` to the URL query string
    if (getRequestingEntity() != null) {
      joiner.add(String.format("%srequesting_entity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequestingEntity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `model_id` to the URL query string
    if (getModelId() != null) {
      joiner.add(String.format("%smodel_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `model_version_id` to the URL query string
    if (getModelVersionId() != null) {
      joiner.add(String.format("%smodel_version_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModelVersionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
