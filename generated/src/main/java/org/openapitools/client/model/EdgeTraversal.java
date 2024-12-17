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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.MultiformatMessageString;
import org.openapitools.client.model.PropertyBag;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Represents the traversal of a single edge during a graph traversal.
 */
@JsonPropertyOrder({
  EdgeTraversal.JSON_PROPERTY_EDGE_ID,
  EdgeTraversal.JSON_PROPERTY_MESSAGE,
  EdgeTraversal.JSON_PROPERTY_FINAL_STATE,
  EdgeTraversal.JSON_PROPERTY_STEP_OVER_EDGE_COUNT,
  EdgeTraversal.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-17T20:22:10.182839Z[GMT]", comments = "Generator version: 7.6.0")
public class EdgeTraversal {
  public static final String JSON_PROPERTY_EDGE_ID = "edgeId";
  private String edgeId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<Message> message = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_FINAL_STATE = "finalState";
  private Map<String, MultiformatMessageString> finalState = new HashMap<>();

  public static final String JSON_PROPERTY_STEP_OVER_EDGE_COUNT = "stepOverEdgeCount";
  private Integer stepOverEdgeCount;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public EdgeTraversal() { 
  }

  public EdgeTraversal edgeId(String edgeId) {
    this.edgeId = edgeId;
    return this;
  }

   /**
   * Identifies the edge being traversed.
   * @return edgeId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EDGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEdgeId() {
    return edgeId;
  }


  @JsonProperty(JSON_PROPERTY_EDGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEdgeId(String edgeId) {
    this.edgeId = edgeId;
  }


  public EdgeTraversal message(Message message) {
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


  public EdgeTraversal finalState(Map<String, MultiformatMessageString> finalState) {
    this.finalState = finalState;
    return this;
  }

  public EdgeTraversal putFinalStateItem(String key, MultiformatMessageString finalStateItem) {
    if (this.finalState == null) {
      this.finalState = new HashMap<>();
    }
    this.finalState.put(key, finalStateItem);
    return this;
  }

   /**
   * The values of relevant expressions after the edge has been traversed.
   * @return finalState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, MultiformatMessageString> getFinalState() {
    return finalState;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalState(Map<String, MultiformatMessageString> finalState) {
    this.finalState = finalState;
  }


  public EdgeTraversal stepOverEdgeCount(Integer stepOverEdgeCount) {
    this.stepOverEdgeCount = stepOverEdgeCount;
    return this;
  }

   /**
   * The number of edge traversals necessary to return from a nested graph.
   * minimum: 0
   * @return stepOverEdgeCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_OVER_EDGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStepOverEdgeCount() {
    return stepOverEdgeCount;
  }


  @JsonProperty(JSON_PROPERTY_STEP_OVER_EDGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepOverEdgeCount(Integer stepOverEdgeCount) {
    this.stepOverEdgeCount = stepOverEdgeCount;
  }


  public EdgeTraversal properties(PropertyBag properties) {
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
   * Return true if this edgeTraversal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeTraversal edgeTraversal = (EdgeTraversal) o;
    return Objects.equals(this.edgeId, edgeTraversal.edgeId) &&
        equalsNullable(this.message, edgeTraversal.message) &&
        Objects.equals(this.finalState, edgeTraversal.finalState) &&
        Objects.equals(this.stepOverEdgeCount, edgeTraversal.stepOverEdgeCount) &&
        Objects.equals(this.properties, edgeTraversal.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeId, hashCodeNullable(message), finalState, stepOverEdgeCount, properties);
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
    sb.append("class EdgeTraversal {\n");
    sb.append("    edgeId: ").append(toIndentedString(edgeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    finalState: ").append(toIndentedString(finalState)).append("\n");
    sb.append("    stepOverEdgeCount: ").append(toIndentedString(stepOverEdgeCount)).append("\n");
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

    // add `edgeId` to the URL query string
    if (getEdgeId() != null) {
      joiner.add(String.format("%sedgeId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEdgeId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      joiner.add(getMessage().toUrlQueryString(prefix + "message" + suffix));
    }

    // add `finalState` to the URL query string
    if (getFinalState() != null) {
      for (String _key : getFinalState().keySet()) {
        if (getFinalState().get(_key) != null) {
          joiner.add(getFinalState().get(_key).toUrlQueryString(String.format("%sfinalState%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `stepOverEdgeCount` to the URL query string
    if (getStepOverEdgeCount() != null) {
      joiner.add(String.format("%sstepOverEdgeCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStepOverEdgeCount()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

