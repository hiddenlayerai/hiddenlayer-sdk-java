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
import com.hiddenlayer.sdk.rest.models.SensorSORModelCardResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SensorSORModelCardQueryResponse
 */
@JsonPropertyOrder({
  SensorSORModelCardQueryResponse.JSON_PROPERTY_TOTAL_COUNT,
  SensorSORModelCardQueryResponse.JSON_PROPERTY_PAGE_SIZE,
  SensorSORModelCardQueryResponse.JSON_PROPERTY_PAGE_NUMBER,
  SensorSORModelCardQueryResponse.JSON_PROPERTY_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:00:16.695354Z[GMT]", comments = "Generator version: 7.6.0")
public class SensorSORModelCardQueryResponse {
  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Integer totalCount;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "page_number";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SensorSORModelCardResponse> results = new ArrayList<>();

  public SensorSORModelCardQueryResponse() { 
  }

  public SensorSORModelCardQueryResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public SensorSORModelCardQueryResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SensorSORModelCardQueryResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public SensorSORModelCardQueryResponse results(List<SensorSORModelCardResponse> results) {
    this.results = results;
    return this;
  }

  public SensorSORModelCardQueryResponse addResultsItem(SensorSORModelCardResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SensorSORModelCardResponse> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResults(List<SensorSORModelCardResponse> results) {
    this.results = results;
  }


  /**
   * Return true if this SensorSORModelCardQueryResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensorSORModelCardQueryResponse sensorSORModelCardQueryResponse = (SensorSORModelCardQueryResponse) o;
    return Objects.equals(this.totalCount, sensorSORModelCardQueryResponse.totalCount) &&
        Objects.equals(this.pageSize, sensorSORModelCardQueryResponse.pageSize) &&
        Objects.equals(this.pageNumber, sensorSORModelCardQueryResponse.pageNumber) &&
        Objects.equals(this.results, sensorSORModelCardQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, pageSize, pageNumber, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorSORModelCardQueryResponse {\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

    // add `total_count` to the URL query string
    if (getTotalCount() != null) {
      joiner.add(String.format("%stotal_count%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `page_size` to the URL query string
    if (getPageSize() != null) {
      joiner.add(String.format("%spage_size%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPageSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `page_number` to the URL query string
    if (getPageNumber() != null) {
      joiner.add(String.format("%spage_number%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPageNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `results` to the URL query string
    if (getResults() != null) {
      for (int i = 0; i < getResults().size(); i++) {
        if (getResults().get(i) != null) {
          joiner.add(getResults().get(i).toUrlQueryString(String.format("%sresults%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

