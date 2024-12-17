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
import org.openapitools.client.model.PropertyBag;
import org.openapitools.client.model.ToolComponentReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about how to locate a relevant reporting descriptor.
 */
@JsonPropertyOrder({
  ReportingDescriptorReference.JSON_PROPERTY_ID,
  ReportingDescriptorReference.JSON_PROPERTY_INDEX,
  ReportingDescriptorReference.JSON_PROPERTY_GUID,
  ReportingDescriptorReference.JSON_PROPERTY_TOOL_COMPONENT,
  ReportingDescriptorReference.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class ReportingDescriptorReference {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = -1;

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_TOOL_COMPONENT = "toolComponent";
  private ToolComponentReference toolComponent;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ReportingDescriptorReference() { 
  }

  public ReportingDescriptorReference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the descriptor.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ReportingDescriptorReference index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index into an array of descriptors in toolComponent.ruleDescriptors, toolComponent.notificationDescriptors, or toolComponent.taxonomyDescriptors, depending on context.
   * minimum: -1
   * @return index
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public ReportingDescriptorReference guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * A guid that uniquely identifies the descriptor.
   * @return guid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuid(String guid) {
    this.guid = guid;
  }


  public ReportingDescriptorReference toolComponent(ToolComponentReference toolComponent) {
    this.toolComponent = toolComponent;
    return this;
  }

   /**
   * Get toolComponent
   * @return toolComponent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOOL_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ToolComponentReference getToolComponent() {
    return toolComponent;
  }


  @JsonProperty(JSON_PROPERTY_TOOL_COMPONENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToolComponent(ToolComponentReference toolComponent) {
    this.toolComponent = toolComponent;
  }


  public ReportingDescriptorReference properties(PropertyBag properties) {
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
   * Return true if this reportingDescriptorReference object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingDescriptorReference reportingDescriptorReference = (ReportingDescriptorReference) o;
    return Objects.equals(this.id, reportingDescriptorReference.id) &&
        Objects.equals(this.index, reportingDescriptorReference.index) &&
        Objects.equals(this.guid, reportingDescriptorReference.guid) &&
        Objects.equals(this.toolComponent, reportingDescriptorReference.toolComponent) &&
        Objects.equals(this.properties, reportingDescriptorReference.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, index, guid, toolComponent, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingDescriptorReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    toolComponent: ").append(toIndentedString(toolComponent)).append("\n");
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

    return joiner.toString();
  }
}

