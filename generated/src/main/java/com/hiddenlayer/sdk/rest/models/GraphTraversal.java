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
import com.hiddenlayer.sdk.rest.models.EdgeTraversal;
import com.hiddenlayer.sdk.rest.models.Message;
import com.hiddenlayer.sdk.rest.models.MultiformatMessageString;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
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
 * Represents a path through a graph.
 */
@JsonPropertyOrder({
  GraphTraversal.JSON_PROPERTY_RUN_GRAPH_INDEX,
  GraphTraversal.JSON_PROPERTY_RESULT_GRAPH_INDEX,
  GraphTraversal.JSON_PROPERTY_DESCRIPTION,
  GraphTraversal.JSON_PROPERTY_INITIAL_STATE,
  GraphTraversal.JSON_PROPERTY_IMMUTABLE_STATE,
  GraphTraversal.JSON_PROPERTY_EDGE_TRAVERSALS,
  GraphTraversal.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-23T18:20:36.233399Z[GMT]", comments = "Generator version: 7.6.0")
public class GraphTraversal {
  public static final String JSON_PROPERTY_RUN_GRAPH_INDEX = "runGraphIndex";
  private Integer runGraphIndex = -1;

  public static final String JSON_PROPERTY_RESULT_GRAPH_INDEX = "resultGraphIndex";
  private Integer resultGraphIndex = -1;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<Message> description = JsonNullable.<Message>undefined();

  public static final String JSON_PROPERTY_INITIAL_STATE = "initialState";
  private Map<String, MultiformatMessageString> initialState = new HashMap<>();

  public static final String JSON_PROPERTY_IMMUTABLE_STATE = "immutableState";
  private Map<String, MultiformatMessageString> immutableState = new HashMap<>();

  public static final String JSON_PROPERTY_EDGE_TRAVERSALS = "edgeTraversals";
  private List<EdgeTraversal> edgeTraversals = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public GraphTraversal() { 
  }

  public GraphTraversal runGraphIndex(Integer runGraphIndex) {
    this.runGraphIndex = runGraphIndex;
    return this;
  }

   /**
   * The index within the run.graphs to be associated with the result.
   * minimum: -1
   * @return runGraphIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_GRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRunGraphIndex() {
    return runGraphIndex;
  }


  @JsonProperty(JSON_PROPERTY_RUN_GRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunGraphIndex(Integer runGraphIndex) {
    this.runGraphIndex = runGraphIndex;
  }


  public GraphTraversal resultGraphIndex(Integer resultGraphIndex) {
    this.resultGraphIndex = resultGraphIndex;
    return this;
  }

   /**
   * The index within the result.graphs to be associated with the result.
   * minimum: -1
   * @return resultGraphIndex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_GRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultGraphIndex() {
    return resultGraphIndex;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_GRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultGraphIndex(Integer resultGraphIndex) {
    this.resultGraphIndex = resultGraphIndex;
  }


  public GraphTraversal description(Message description) {
    this.description = JsonNullable.<Message>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Message getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Message> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<Message> description) {
    this.description = description;
  }

  public void setDescription(Message description) {
    this.description = JsonNullable.<Message>of(description);
  }


  public GraphTraversal initialState(Map<String, MultiformatMessageString> initialState) {
    this.initialState = initialState;
    return this;
  }

  public GraphTraversal putInitialStateItem(String key, MultiformatMessageString initialStateItem) {
    if (this.initialState == null) {
      this.initialState = new HashMap<>();
    }
    this.initialState.put(key, initialStateItem);
    return this;
  }

   /**
   * Values of relevant expressions at the start of the graph traversal that may change during graph traversal.
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


  public GraphTraversal immutableState(Map<String, MultiformatMessageString> immutableState) {
    this.immutableState = immutableState;
    return this;
  }

  public GraphTraversal putImmutableStateItem(String key, MultiformatMessageString immutableStateItem) {
    if (this.immutableState == null) {
      this.immutableState = new HashMap<>();
    }
    this.immutableState.put(key, immutableStateItem);
    return this;
  }

   /**
   * Values of relevant expressions at the start of the graph traversal that remain constant for the graph traversal.
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


  public GraphTraversal edgeTraversals(List<EdgeTraversal> edgeTraversals) {
    this.edgeTraversals = edgeTraversals;
    return this;
  }

  public GraphTraversal addEdgeTraversalsItem(EdgeTraversal edgeTraversalsItem) {
    if (this.edgeTraversals == null) {
      this.edgeTraversals = new ArrayList<>();
    }
    this.edgeTraversals.add(edgeTraversalsItem);
    return this;
  }

   /**
   * The sequences of edges traversed by this graph traversal.
   * @return edgeTraversals
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EDGE_TRAVERSALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EdgeTraversal> getEdgeTraversals() {
    return edgeTraversals;
  }


  @JsonProperty(JSON_PROPERTY_EDGE_TRAVERSALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdgeTraversals(List<EdgeTraversal> edgeTraversals) {
    this.edgeTraversals = edgeTraversals;
  }


  public GraphTraversal properties(PropertyBag properties) {
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
   * Return true if this graphTraversal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphTraversal graphTraversal = (GraphTraversal) o;
    return Objects.equals(this.runGraphIndex, graphTraversal.runGraphIndex) &&
        Objects.equals(this.resultGraphIndex, graphTraversal.resultGraphIndex) &&
        equalsNullable(this.description, graphTraversal.description) &&
        Objects.equals(this.initialState, graphTraversal.initialState) &&
        Objects.equals(this.immutableState, graphTraversal.immutableState) &&
        Objects.equals(this.edgeTraversals, graphTraversal.edgeTraversals) &&
        Objects.equals(this.properties, graphTraversal.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(runGraphIndex, resultGraphIndex, hashCodeNullable(description), initialState, immutableState, edgeTraversals, properties);
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
    sb.append("class GraphTraversal {\n");
    sb.append("    runGraphIndex: ").append(toIndentedString(runGraphIndex)).append("\n");
    sb.append("    resultGraphIndex: ").append(toIndentedString(resultGraphIndex)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    immutableState: ").append(toIndentedString(immutableState)).append("\n");
    sb.append("    edgeTraversals: ").append(toIndentedString(edgeTraversals)).append("\n");
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

