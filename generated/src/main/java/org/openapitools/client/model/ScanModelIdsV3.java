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


package org.openapitools.client.model;

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
 * ScanModelIdsV3
 */
@JsonPropertyOrder({
  ScanModelIdsV3.JSON_PROPERTY_MODEL_ID,
  ScanModelIdsV3.JSON_PROPERTY_MODEL_VERSION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class ScanModelIdsV3 {
  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_MODEL_VERSION_ID = "model_version_id";
  private String modelVersionId;

  public ScanModelIdsV3() { 
  }

  public ScanModelIdsV3 modelId(String modelId) {
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


  public ScanModelIdsV3 modelVersionId(String modelVersionId) {
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
   * Return true if this ScanModelIdsV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScanModelIdsV3 scanModelIdsV3 = (ScanModelIdsV3) o;
    return Objects.equals(this.modelId, scanModelIdsV3.modelId) &&
        Objects.equals(this.modelVersionId, scanModelIdsV3.modelVersionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, modelVersionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScanModelIdsV3 {\n");
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

