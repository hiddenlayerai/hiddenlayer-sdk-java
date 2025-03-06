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
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.ReportingConfiguration;
import com.hiddenlayer.sdk.rest.models.ReportingDescriptorReference;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about how a specific rule or notification was reconfigured at runtime.
 */
@JsonPropertyOrder({
  ConfigurationOverride.JSON_PROPERTY_CONFIGURATION,
  ConfigurationOverride.JSON_PROPERTY_DESCRIPTOR,
  ConfigurationOverride.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class ConfigurationOverride {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private ReportingConfiguration _configuration;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  private ReportingDescriptorReference descriptor;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ConfigurationOverride() { 
  }

  public ConfigurationOverride _configuration(ReportingConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReportingConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfiguration(ReportingConfiguration _configuration) {
    this._configuration = _configuration;
  }


  public ConfigurationOverride descriptor(ReportingDescriptorReference descriptor) {
    this.descriptor = descriptor;
    return this;
  }

   /**
   * Get descriptor
   * @return descriptor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReportingDescriptorReference getDescriptor() {
    return descriptor;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescriptor(ReportingDescriptorReference descriptor) {
    this.descriptor = descriptor;
  }


  public ConfigurationOverride properties(PropertyBag properties) {
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
   * Return true if this configurationOverride object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationOverride configurationOverride = (ConfigurationOverride) o;
    return Objects.equals(this._configuration, configurationOverride._configuration) &&
        Objects.equals(this.descriptor, configurationOverride.descriptor) &&
        Objects.equals(this.properties, configurationOverride.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, descriptor, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationOverride {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
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

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
    }

    // add `descriptor` to the URL query string
    if (getDescriptor() != null) {
      joiner.add(getDescriptor().toUrlQueryString(prefix + "descriptor" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

