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
 * MultipartUploadPart
 */
@JsonPropertyOrder({
  MultipartUploadPart.JSON_PROPERTY_PART_NUMBER,
  MultipartUploadPart.JSON_PROPERTY_START_OFFSET,
  MultipartUploadPart.JSON_PROPERTY_END_OFFSET,
  MultipartUploadPart.JSON_PROPERTY_UPLOAD_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class MultipartUploadPart {
  public static final String JSON_PROPERTY_PART_NUMBER = "part_number";
  private Integer partNumber;

  public static final String JSON_PROPERTY_START_OFFSET = "start_offset";
  private Long startOffset;

  public static final String JSON_PROPERTY_END_OFFSET = "end_offset";
  private Long endOffset;

  public static final String JSON_PROPERTY_UPLOAD_URL = "upload_url";
  private String uploadUrl;

  public MultipartUploadPart() { 
  }

  public MultipartUploadPart partNumber(Integer partNumber) {
    this.partNumber = partNumber;
    return this;
  }

   /**
   * Get partNumber
   * @return partNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PART_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPartNumber() {
    return partNumber;
  }


  @JsonProperty(JSON_PROPERTY_PART_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }


  public MultipartUploadPart startOffset(Long startOffset) {
    this.startOffset = startOffset;
    return this;
  }

   /**
   * Get startOffset
   * @return startOffset
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_START_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStartOffset() {
    return startOffset;
  }


  @JsonProperty(JSON_PROPERTY_START_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartOffset(Long startOffset) {
    this.startOffset = startOffset;
  }


  public MultipartUploadPart endOffset(Long endOffset) {
    this.endOffset = endOffset;
    return this;
  }

   /**
   * Get endOffset
   * @return endOffset
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_END_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getEndOffset() {
    return endOffset;
  }


  @JsonProperty(JSON_PROPERTY_END_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndOffset(Long endOffset) {
    this.endOffset = endOffset;
  }


  public MultipartUploadPart uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * only provided when part is to be directly uploaded to a cloud provider (adhoc)
   * @return uploadUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadUrl() {
    return uploadUrl;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  /**
   * Return true if this MultipartUploadPart object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipartUploadPart multipartUploadPart = (MultipartUploadPart) o;
    return Objects.equals(this.partNumber, multipartUploadPart.partNumber) &&
        Objects.equals(this.startOffset, multipartUploadPart.startOffset) &&
        Objects.equals(this.endOffset, multipartUploadPart.endOffset) &&
        Objects.equals(this.uploadUrl, multipartUploadPart.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, startOffset, endOffset, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartUploadPart {\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
    sb.append("    endOffset: ").append(toIndentedString(endOffset)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

    // add `part_number` to the URL query string
    if (getPartNumber() != null) {
      joiner.add(String.format("%spart_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `start_offset` to the URL query string
    if (getStartOffset() != null) {
      joiner.add(String.format("%sstart_offset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `end_offset` to the URL query string
    if (getEndOffset() != null) {
      joiner.add(String.format("%send_offset%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `upload_url` to the URL query string
    if (getUploadUrl() != null) {
      joiner.add(String.format("%supload_url%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUploadUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

