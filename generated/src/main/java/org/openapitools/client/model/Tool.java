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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.client.model.PropertyBag;
import org.openapitools.client.model.ToolComponent;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The analysis tool that was run.
 */
@JsonPropertyOrder({
  Tool.JSON_PROPERTY_DRIVER,
  Tool.JSON_PROPERTY_EXTENSIONS,
  Tool.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-13T21:07:55.255008Z[GMT]", comments = "Generator version: 7.6.0")
public class Tool {
  public static final String JSON_PROPERTY_DRIVER = "driver";
  private ToolComponent driver;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Set<ToolComponent> extensions = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public Tool() { 
  }

  public Tool driver(ToolComponent driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ToolComponent getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDriver(ToolComponent driver) {
    this.driver = driver;
  }


  public Tool extensions(Set<ToolComponent> extensions) {
    this.extensions = extensions;
    return this;
  }

  public Tool addExtensionsItem(ToolComponent extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new LinkedHashSet<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Tool extensions that contributed to or reconfigured the analysis tool that was run.
   * @return extensions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ToolComponent> getExtensions() {
    return extensions;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_EXTENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtensions(Set<ToolComponent> extensions) {
    this.extensions = extensions;
  }


  public Tool properties(PropertyBag properties) {
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
   * Return true if this tool object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tool tool = (Tool) o;
    return Objects.equals(this.driver, tool.driver) &&
        Objects.equals(this.extensions, tool.extensions) &&
        Objects.equals(this.properties, tool.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, extensions, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tool {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

    // add `driver` to the URL query string
    if (getDriver() != null) {
      joiner.add(getDriver().toUrlQueryString(prefix + "driver" + suffix));
    }

    // add `extensions` to the URL query string
    if (getExtensions() != null) {
      int i = 0;
      for (ToolComponent _item : getExtensions()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sextensions%s%s", prefix, suffix,
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

