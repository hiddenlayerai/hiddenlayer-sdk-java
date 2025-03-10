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
import com.hiddenlayer.sdk.rest.models.Message;
import com.hiddenlayer.sdk.rest.models.MultiformatMessageString;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.ThreadFlowLocation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a sequence of code locations that specify a path through a single thread of execution such as an operating system or fiber.
 */
@JsonPropertyOrder({
  ThreadFlow.JSON_PROPERTY_ID,
  ThreadFlow.JSON_PROPERTY_MESSAGE,
  ThreadFlow.JSON_PROPERTY_INITIAL_STATE,
  ThreadFlow.JSON_PROPERTY_IMMUTABLE_STATE,
  ThreadFlow.JSON_PROPERTY_LOCATIONS,
  ThreadFlow.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class ThreadFlow {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<Message> message = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_INITIAL_STATE = "initialState";
  private Map<String, MultiformatMessageString> initialState = new HashMap<>();

  public static final String JSON_PROPERTY_IMMUTABLE_STATE = "immutableState";
  private Map<String, MultiformatMessageString> immutableState = new HashMap<>();

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<ThreadFlowLocation> locations = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ThreadFlow() { 
  }

  public ThreadFlow id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
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


  public ThreadFlow message(Message message) {
    this.message = JsonNullable.<Message>of(message);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Message getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Message> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<Message> message) {
    this.message = message;
  }

  public void setMessage(Message message) {
    this.message = JsonNullable.<Message>of(message);
  }


  public ThreadFlow initialState(Map<String, MultiformatMessageString> initialState) {
    this.initialState = initialState;
    return this;
  }

  public ThreadFlow putInitialStateItem(String key, MultiformatMessageString initialStateItem) {
    if (this.initialState == null) {
      this.initialState = new HashMap<>();
    }
    this.initialState.put(key, initialStateItem);
    return this;
  }

   /**
   * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
   * @return initialState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, MultiformatMessageString> getInitialState() {
    return initialState;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialState(Map<String, MultiformatMessageString> initialState) {
    this.initialState = initialState;
  }


  public ThreadFlow immutableState(Map<String, MultiformatMessageString> immutableState) {
    this.immutableState = immutableState;
    return this;
  }

  public ThreadFlow putImmutableStateItem(String key, MultiformatMessageString immutableStateItem) {
    if (this.immutableState == null) {
      this.immutableState = new HashMap<>();
    }
    this.immutableState.put(key, immutableStateItem);
    return this;
  }

   /**
   * Values of relevant expressions at the start of the thread flow that remain constant.
   * @return immutableState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMMUTABLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, MultiformatMessageString> getImmutableState() {
    return immutableState;
  }


  @JsonProperty(JSON_PROPERTY_IMMUTABLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImmutableState(Map<String, MultiformatMessageString> immutableState) {
    this.immutableState = immutableState;
  }


  public ThreadFlow locations(List<ThreadFlowLocation> locations) {
    this.locations = locations;
    return this;
  }

  public ThreadFlow addLocationsItem(ThreadFlowLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * A temporally ordered array of &#39;threadFlowLocation&#39; objects, each of which describes a location visited by the tool while producing the result.
   * @return locations
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ThreadFlowLocation> getLocations() {
    return locations;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(List<ThreadFlowLocation> locations) {
    this.locations = locations;
  }


  public ThreadFlow properties(PropertyBag properties) {
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
   * Return true if this threadFlow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadFlow threadFlow = (ThreadFlow) o;
    return Objects.equals(this.id, threadFlow.id) &&
        equalsNullable(this.message, threadFlow.message) &&
        Objects.equals(this.initialState, threadFlow.initialState) &&
        Objects.equals(this.immutableState, threadFlow.immutableState) &&
        Objects.equals(this.locations, threadFlow.locations) &&
        Objects.equals(this.properties, threadFlow.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(message), initialState, immutableState, locations, properties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadFlow {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    immutableState: ").append(toIndentedString(immutableState)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
    }

    // add `initialState` to the URL query string
    if (getInitialState() != null) {
      for (String _key : getInitialState().keySet()) {
        if (getInitialState().get(_key) != null) {
          joiner.add(getInitialState().get(_key).toUrlQueryString(String.format("%sinitialState%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `immutableState` to the URL query string
    if (getImmutableState() != null) {
      for (String _key : getImmutableState().keySet()) {
        if (getImmutableState().get(_key) != null) {
          joiner.add(getImmutableState().get(_key).toUrlQueryString(String.format("%simmutableState%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `locations` to the URL query string
    if (getLocations() != null) {
      for (int i = 0; i < getLocations().size(); i++) {
        if (getLocations().get(i) != null) {
          joiner.add(getLocations().get(i).toUrlQueryString(String.format("%slocations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

