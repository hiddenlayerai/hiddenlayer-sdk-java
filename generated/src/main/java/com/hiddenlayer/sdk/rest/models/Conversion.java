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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hiddenlayer.sdk.rest.models.ArtifactLocation;
import com.hiddenlayer.sdk.rest.models.Invocation;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.Tool;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes how a converter transformed the output of a static analysis tool from the analysis tool&#39;s native output format into the SARIF format.
 */
@JsonPropertyOrder({
  Conversion.JSON_PROPERTY_TOOL,
  Conversion.JSON_PROPERTY_INVOCATION,
  Conversion.JSON_PROPERTY_ANALYSIS_TOOL_LOG_FILES,
  Conversion.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-30T18:04:47.686514Z[GMT]", comments = "Generator version: 7.6.0")
public class Conversion {
  public static final String JSON_PROPERTY_TOOL = "tool";
  private Tool tool;

  public static final String JSON_PROPERTY_INVOCATION = "invocation";
  private Invocation invocation;

  public static final String JSON_PROPERTY_ANALYSIS_TOOL_LOG_FILES = "analysisToolLogFiles";
  private Set<ArtifactLocation> analysisToolLogFiles = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Conversion() { 
  }

  public Conversion tool(Tool tool) {
    this.tool = tool;
    return this;
  }

   /**
   * Get tool
   * @return tool
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Tool getTool() {
    return tool;
  }


  @JsonProperty(JSON_PROPERTY_TOOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTool(Tool tool) {
    this.tool = tool;
  }


  public Conversion invocation(Invocation invocation) {
    this.invocation = invocation;
    return this;
  }

   /**
   * Get invocation
   * @return invocation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Invocation getInvocation() {
    return invocation;
  }


  @JsonProperty(JSON_PROPERTY_INVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvocation(Invocation invocation) {
    this.invocation = invocation;
  }


  public Conversion analysisToolLogFiles(Set<ArtifactLocation> analysisToolLogFiles) {
    this.analysisToolLogFiles = analysisToolLogFiles;
    return this;
  }

  public Conversion addAnalysisToolLogFilesItem(ArtifactLocation analysisToolLogFilesItem) {
    if (this.analysisToolLogFiles == null) {
      this.analysisToolLogFiles = new LinkedHashSet<>();
    }
    this.analysisToolLogFiles.add(analysisToolLogFilesItem);
    return this;
  }

   /**
   * The locations of the analysis tool&#39;s per-run log files.
   * @return analysisToolLogFiles
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANALYSIS_TOOL_LOG_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ArtifactLocation> getAnalysisToolLogFiles() {
    return analysisToolLogFiles;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ANALYSIS_TOOL_LOG_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalysisToolLogFiles(Set<ArtifactLocation> analysisToolLogFiles) {
    this.analysisToolLogFiles = analysisToolLogFiles;
  }


  public Conversion properties(PropertyBag properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyBag getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(PropertyBag properties) {
    this.properties = properties;
  }


  /**
   * Return true if this conversion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversion conversion = (Conversion) o;
    return Objects.equals(this.tool, conversion.tool) &&
        Objects.equals(this.invocation, conversion.invocation) &&
        Objects.equals(this.analysisToolLogFiles, conversion.analysisToolLogFiles) &&
        Objects.equals(this.properties, conversion.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tool, invocation, analysisToolLogFiles, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversion {\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
    sb.append("    invocation: ").append(toIndentedString(invocation)).append("\n");
    sb.append("    analysisToolLogFiles: ").append(toIndentedString(analysisToolLogFiles)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

    // add `tool` to the URL query string
    if (getTool() != null) {
      joiner.add(getTool().toUrlQueryString(prefix + "tool" + suffix));
    }

    // add `invocation` to the URL query string
    if (getInvocation() != null) {
      joiner.add(getInvocation().toUrlQueryString(prefix + "invocation" + suffix));
    }

    // add `analysisToolLogFiles` to the URL query string
    if (getAnalysisToolLogFiles() != null) {
      int i = 0;
      for (ArtifactLocation _item : getAnalysisToolLogFiles()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sanalysisToolLogFiles%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

