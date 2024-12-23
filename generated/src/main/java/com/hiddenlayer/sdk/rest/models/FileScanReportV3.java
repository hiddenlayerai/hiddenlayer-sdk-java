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
import com.hiddenlayer.sdk.rest.models.FileResultsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FileScanReportV3
 */
@JsonPropertyOrder({
  FileScanReportV3.JSON_PROPERTY_FILE_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:00:16.695354Z[GMT]", comments = "Generator version: 7.6.0")
public class FileScanReportV3 {
  public static final String JSON_PROPERTY_FILE_RESULTS = "file_results";
  private List<FileResultsInner> fileResults = new ArrayList<>();

  public FileScanReportV3() { 
  }

  public FileScanReportV3 fileResults(List<FileResultsInner> fileResults) {
    this.fileResults = fileResults;
    return this;
  }

  public FileScanReportV3 addFileResultsItem(FileResultsInner fileResultsItem) {
    if (this.fileResults == null) {
      this.fileResults = new ArrayList<>();
    }
    this.fileResults.add(fileResultsItem);
    return this;
  }

   /**
   * Get fileResults
   * @return fileResults
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FileResultsInner> getFileResults() {
    return fileResults;
  }


  @JsonProperty(JSON_PROPERTY_FILE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileResults(List<FileResultsInner> fileResults) {
    this.fileResults = fileResults;
  }


  /**
   * Return true if this FileScanReportV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileScanReportV3 fileScanReportV3 = (FileScanReportV3) o;
    return Objects.equals(this.fileResults, fileScanReportV3.fileResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileScanReportV3 {\n");
    sb.append("    fileResults: ").append(toIndentedString(fileResults)).append("\n");
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

    // add `file_results` to the URL query string
    if (getFileResults() != null) {
      for (int i = 0; i < getFileResults().size(); i++) {
        if (getFileResults().get(i) != null) {
          joiner.add(getFileResults().get(i).toUrlQueryString(String.format("%sfile_results%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

