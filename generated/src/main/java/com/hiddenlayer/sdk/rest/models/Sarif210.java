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
import com.hiddenlayer.sdk.rest.models.ExternalProperties;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.Run;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Static Analysis Results Format (SARIF) Version 2.1.0 JSON Schema: a standard format for the output of static analysis tools.
 */
@JsonPropertyOrder({
  Sarif210.JSON_PROPERTY_$_SCHEMA,
  Sarif210.JSON_PROPERTY_VERSION,
  Sarif210.JSON_PROPERTY_RUNS,
  Sarif210.JSON_PROPERTY_INLINE_EXTERNAL_PROPERTIES,
  Sarif210.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class Sarif210 {
  public static final String JSON_PROPERTY_$_SCHEMA = "$schema";
  private URI $schema;

  /**
   * The SARIF format version of this log file.
   */
  public enum VersionEnum {
    _2_1_0("2.1.0");

    private Object value;

    VersionEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VersionEnum fromValue(Object value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERSION = "version";
  private VersionEnum version;

  public static final String JSON_PROPERTY_RUNS = "runs";
  private List<Run> runs = new ArrayList<>();

  public static final String JSON_PROPERTY_INLINE_EXTERNAL_PROPERTIES = "inlineExternalProperties";
  private Set<ExternalProperties> inlineExternalProperties = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Sarif210() { 
  }

  public Sarif210 $schema(URI $schema) {
    this.$schema = $schema;
    return this;
  }

   /**
   * The URI of the JSON schema corresponding to the version.
   * @return $schema
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_$_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI get$Schema() {
    return $schema;
  }


  @JsonProperty(JSON_PROPERTY_$_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void set$Schema(URI $schema) {
    this.$schema = $schema;
  }


  public Sarif210 version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * The SARIF format version of this log file.
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VersionEnum getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  public Sarif210 runs(List<Run> runs) {
    this.runs = runs;
    return this;
  }

  public Sarif210 addRunsItem(Run runsItem) {
    if (this.runs == null) {
      this.runs = new ArrayList<>();
    }
    this.runs.add(runsItem);
    return this;
  }

   /**
   * The set of runs contained in this log file.
   * @return runs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RUNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Run> getRuns() {
    return runs;
  }


  @JsonProperty(JSON_PROPERTY_RUNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuns(List<Run> runs) {
    this.runs = runs;
  }


  public Sarif210 inlineExternalProperties(Set<ExternalProperties> inlineExternalProperties) {
    this.inlineExternalProperties = inlineExternalProperties;
    return this;
  }

  public Sarif210 addInlineExternalPropertiesItem(ExternalProperties inlineExternalPropertiesItem) {
    if (this.inlineExternalProperties == null) {
      this.inlineExternalProperties = new LinkedHashSet<>();
    }
    this.inlineExternalProperties.add(inlineExternalPropertiesItem);
    return this;
  }

   /**
   * References to external property files that share data between runs.
   * @return inlineExternalProperties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INLINE_EXTERNAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ExternalProperties> getInlineExternalProperties() {
    return inlineExternalProperties;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_INLINE_EXTERNAL_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInlineExternalProperties(Set<ExternalProperties> inlineExternalProperties) {
    this.inlineExternalProperties = inlineExternalProperties;
  }


  public Sarif210 properties(PropertyBag properties) {
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
   * Return true if this sarif-210 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sarif210 sarif210 = (Sarif210) o;
    return Objects.equals(this.$schema, sarif210.$schema) &&
        Objects.equals(this.version, sarif210.version) &&
        Objects.equals(this.runs, sarif210.runs) &&
        Objects.equals(this.inlineExternalProperties, sarif210.inlineExternalProperties) &&
        Objects.equals(this.properties, sarif210.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, version, runs, inlineExternalProperties, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sarif210 {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    inlineExternalProperties: ").append(toIndentedString(inlineExternalProperties)).append("\n");
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

    // add `$schema` to the URL query string
    if (get$Schema() != null) {
      joiner.add(String.format("%s$schema%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(get$Schema()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `runs` to the URL query string
    if (getRuns() != null) {
      for (int i = 0; i < getRuns().size(); i++) {
        if (getRuns().get(i) != null) {
          joiner.add(getRuns().get(i).toUrlQueryString(String.format("%sruns%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `inlineExternalProperties` to the URL query string
    if (getInlineExternalProperties() != null) {
      int i = 0;
      for (ExternalProperties _item : getInlineExternalProperties()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sinlineExternalProperties%s%s", prefix, suffix,
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

