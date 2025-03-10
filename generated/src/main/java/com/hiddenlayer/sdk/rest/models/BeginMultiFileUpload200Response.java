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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BeginMultiFileUpload200Response
 */
@JsonPropertyOrder({
  BeginMultiFileUpload200Response.JSON_PROPERTY_SCAN_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class BeginMultiFileUpload200Response {
  public static final String JSON_PROPERTY_SCAN_ID = "scan_id";
  private UUID scanId;

  public BeginMultiFileUpload200Response() { 
  }

  public BeginMultiFileUpload200Response scanId(UUID scanId) {
    this.scanId = scanId;
    return this;
  }

   /**
   * Request to resource is successful
   * @return scanId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getScanId() {
    return scanId;
  }


  @JsonProperty(JSON_PROPERTY_SCAN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScanId(UUID scanId) {
    this.scanId = scanId;
  }


  /**
   * Return true if this begin_multi_file_upload_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeginMultiFileUpload200Response beginMultiFileUpload200Response = (BeginMultiFileUpload200Response) o;
    return Objects.equals(this.scanId, beginMultiFileUpload200Response.scanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeginMultiFileUpload200Response {\n");
    sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
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

    // add `scan_id` to the URL query string
    if (getScanId() != null) {
      joiner.add(String.format("%sscan_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScanId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

