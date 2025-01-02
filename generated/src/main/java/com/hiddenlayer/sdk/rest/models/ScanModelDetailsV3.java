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
 * ScanModelDetailsV3
 */
@JsonPropertyOrder({
  ScanModelDetailsV3.JSON_PROPERTY_MODEL_NAME,
  ScanModelDetailsV3.JSON_PROPERTY_MODEL_VERSION,
  ScanModelDetailsV3.JSON_PROPERTY_MODEL_SOURCE,
  ScanModelDetailsV3.JSON_PROPERTY_REQUESTED_SCAN_LOCATION,
  ScanModelDetailsV3.JSON_PROPERTY_REQUESTING_ENTITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class ScanModelDetailsV3 {
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

  public ScanModelDetailsV3() { 
  }

  public ScanModelDetailsV3 modelName(String modelName) {
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


  public ScanModelDetailsV3 modelVersion(String modelVersion) {
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


  public ScanModelDetailsV3 modelSource(String modelSource) {
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


  public ScanModelDetailsV3 requestedScanLocation(String requestedScanLocation) {
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


  public ScanModelDetailsV3 requestingEntity(String requestingEntity) {
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


  /**
   * Return true if this ScanModelDetailsV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanModelDetailsV3 scanModelDetailsV3 = (ScanModelDetailsV3) o;
    return Objects.equals(this.modelName, scanModelDetailsV3.modelName) &&
        Objects.equals(this.modelVersion, scanModelDetailsV3.modelVersion) &&
        Objects.equals(this.modelSource, scanModelDetailsV3.modelSource) &&
        Objects.equals(this.requestedScanLocation, scanModelDetailsV3.requestedScanLocation) &&
        Objects.equals(this.requestingEntity, scanModelDetailsV3.requestingEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelVersion, modelSource, requestedScanLocation, requestingEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanModelDetailsV3 {\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelVersion: ").append(toIndentedString(modelVersion)).append("\n");
    sb.append("    modelSource: ").append(toIndentedString(modelSource)).append("\n");
    sb.append("    requestedScanLocation: ").append(toIndentedString(requestedScanLocation)).append("\n");
    sb.append("    requestingEntity: ").append(toIndentedString(requestingEntity)).append("\n");
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

    return joiner.toString();
  }
}

