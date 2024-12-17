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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.PropertyBag;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A function call within a stack trace.
 */
@JsonPropertyOrder({
  StackFrame.JSON_PROPERTY_LOCATION,
  StackFrame.JSON_PROPERTY_MODULE,
  StackFrame.JSON_PROPERTY_THREAD_ID,
  StackFrame.JSON_PROPERTY_PARAMETERS,
  StackFrame.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class StackFrame {
  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public static final String JSON_PROPERTY_MODULE = "module";
  private String module;

  public static final String JSON_PROPERTY_THREAD_ID = "threadId";
  private Integer threadId;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<String> parameters = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public StackFrame() { 
  }

  public StackFrame location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Location getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(Location location) {
    this.location = location;
  }


  public StackFrame module(String module) {
    this.module = module;
    return this;
  }

   /**
   * The name of the module that contains the code of this stack frame.
   * @return module
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModule(String module) {
    this.module = module;
  }


  public StackFrame threadId(Integer threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * The thread identifier of the stack frame.
   * @return threadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(Integer threadId) {
    this.threadId = threadId;
  }


  public StackFrame parameters(List<String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public StackFrame addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * The parameters of the call that is executing.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  public StackFrame properties(PropertyBag properties) {
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
   * Return true if this stackFrame object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackFrame stackFrame = (StackFrame) o;
    return Objects.equals(this.location, stackFrame.location) &&
        Objects.equals(this.module, stackFrame.module) &&
        Objects.equals(this.threadId, stackFrame.threadId) &&
        Objects.equals(this.parameters, stackFrame.parameters) &&
        Objects.equals(this.properties, stackFrame.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, module, threadId, parameters, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackFrame {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(getLocation().toUrlQueryString(prefix + "location" + suffix));
    }

    // add `module` to the URL query string
    if (getModule() != null) {
      joiner.add(String.format("%smodule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModule()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `threadId` to the URL query string
    if (getThreadId() != null) {
      joiner.add(String.format("%sthreadId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThreadId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      for (int i = 0; i < getParameters().size(); i++) {
        joiner.add(String.format("%sparameters%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(getParameters().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

