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
import com.hiddenlayer.sdk.rest.models.Location;
import com.hiddenlayer.sdk.rest.models.MultiformatMessageString;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.ReportingDescriptorReference;
import com.hiddenlayer.sdk.rest.models.Stack;
import com.hiddenlayer.sdk.rest.models.WebRequest;
import com.hiddenlayer.sdk.rest.models.WebResponse;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A location visited by an analysis tool while simulating or monitoring the execution of a program.
 */
@JsonPropertyOrder({
  ThreadFlowLocation.JSON_PROPERTY_INDEX,
  ThreadFlowLocation.JSON_PROPERTY_LOCATION,
  ThreadFlowLocation.JSON_PROPERTY_STACK,
  ThreadFlowLocation.JSON_PROPERTY_KINDS,
  ThreadFlowLocation.JSON_PROPERTY_TAXA,
  ThreadFlowLocation.JSON_PROPERTY_MODULE,
  ThreadFlowLocation.JSON_PROPERTY_STATE,
  ThreadFlowLocation.JSON_PROPERTY_NESTING_LEVEL,
  ThreadFlowLocation.JSON_PROPERTY_EXECUTION_ORDER,
  ThreadFlowLocation.JSON_PROPERTY_EXECUTION_TIME_UTC,
  ThreadFlowLocation.JSON_PROPERTY_IMPORTANCE,
  ThreadFlowLocation.JSON_PROPERTY_WEB_REQUEST,
  ThreadFlowLocation.JSON_PROPERTY_WEB_RESPONSE,
  ThreadFlowLocation.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class ThreadFlowLocation {
  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index = -1;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Location location;

  public static final String JSON_PROPERTY_STACK = "stack";
  private Stack stack;

  public static final String JSON_PROPERTY_KINDS = "kinds";
  private Set<String> kinds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TAXA = "taxa";
  private Set<ReportingDescriptorReference> taxa = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_MODULE = "module";
  private String module;

  public static final String JSON_PROPERTY_STATE = "state";
  private Map<String, MultiformatMessageString> state = new HashMap<>();

  public static final String JSON_PROPERTY_NESTING_LEVEL = "nestingLevel";
  private Integer nestingLevel;

  public static final String JSON_PROPERTY_EXECUTION_ORDER = "executionOrder";
  private Integer executionOrder = -1;

  public static final String JSON_PROPERTY_EXECUTION_TIME_UTC = "executionTimeUtc";
  private OffsetDateTime executionTimeUtc;

  /**
   * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is \&quot;essential\&quot;, \&quot;important\&quot;, \&quot;unimportant\&quot;. Default: \&quot;important\&quot;.
   */
  public enum ImportanceEnum {
    IMPORTANT("important"),
    
    ESSENTIAL("essential"),
    
    UNIMPORTANT("unimportant");

    private String value;

    ImportanceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImportanceEnum fromValue(String value) {
      for (ImportanceEnum b : ImportanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IMPORTANCE = "importance";
  private ImportanceEnum importance = ImportanceEnum.IMPORTANT;

  public static final String JSON_PROPERTY_WEB_REQUEST = "webRequest";
  private WebRequest webRequest;

  public static final String JSON_PROPERTY_WEB_RESPONSE = "webResponse";
  private WebResponse webResponse;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ThreadFlowLocation() { 
  }

  public ThreadFlowLocation index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index within the run threadFlowLocations array.
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


  public ThreadFlowLocation location(Location location) {
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


  public ThreadFlowLocation stack(Stack stack) {
    this.stack = stack;
    return this;
  }

   /**
   * Get stack
   * @return stack
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Stack getStack() {
    return stack;
  }


  @JsonProperty(JSON_PROPERTY_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStack(Stack stack) {
    this.stack = stack;
  }


  public ThreadFlowLocation kinds(Set<String> kinds) {
    this.kinds = kinds;
    return this;
  }

  public ThreadFlowLocation addKindsItem(String kindsItem) {
    if (this.kinds == null) {
      this.kinds = new LinkedHashSet<>();
    }
    this.kinds.add(kindsItem);
    return this;
  }

   /**
   * A set of distinct strings that categorize the thread flow location. Well-known kinds include &#39;acquire&#39;, &#39;release&#39;, &#39;enter&#39;, &#39;exit&#39;, &#39;call&#39;, &#39;return&#39;, &#39;branch&#39;, &#39;implicit&#39;, &#39;false&#39;, &#39;true&#39;, &#39;caution&#39;, &#39;danger&#39;, &#39;unknown&#39;, &#39;unreachable&#39;, &#39;taint&#39;, &#39;function&#39;, &#39;handler&#39;, &#39;lock&#39;, &#39;memory&#39;, &#39;resource&#39;, &#39;scope&#39; and &#39;value&#39;.
   * @return kinds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KINDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getKinds() {
    return kinds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_KINDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKinds(Set<String> kinds) {
    this.kinds = kinds;
  }


  public ThreadFlowLocation taxa(Set<ReportingDescriptorReference> taxa) {
    this.taxa = taxa;
    return this;
  }

  public ThreadFlowLocation addTaxaItem(ReportingDescriptorReference taxaItem) {
    if (this.taxa == null) {
      this.taxa = new LinkedHashSet<>();
    }
    this.taxa.add(taxaItem);
    return this;
  }

   /**
   * An array of references to rule or taxonomy reporting descriptors that are applicable to the thread flow location.
   * @return taxa
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ReportingDescriptorReference> getTaxa() {
    return taxa;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAXA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxa(Set<ReportingDescriptorReference> taxa) {
    this.taxa = taxa;
  }


  public ThreadFlowLocation module(String module) {
    this.module = module;
    return this;
  }

   /**
   * The name of the module that contains the code that is executing.
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


  public ThreadFlowLocation state(Map<String, MultiformatMessageString> state) {
    this.state = state;
    return this;
  }

  public ThreadFlowLocation putStateItem(String key, MultiformatMessageString stateItem) {
    if (this.state == null) {
      this.state = new HashMap<>();
    }
    this.state.put(key, stateItem);
    return this;
  }

   /**
   * A dictionary, each of whose keys specifies a variable or expression, the associated value of which represents the variable or expression value. For an annotation of kind &#39;continuation&#39;, for example, this dictionary might hold the current assumed values of a set of global variables.
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, MultiformatMessageString> getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(Map<String, MultiformatMessageString> state) {
    this.state = state;
  }


  public ThreadFlowLocation nestingLevel(Integer nestingLevel) {
    this.nestingLevel = nestingLevel;
    return this;
  }

   /**
   * An integer representing a containment hierarchy within the thread flow.
   * minimum: 0
   * @return nestingLevel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NESTING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNestingLevel() {
    return nestingLevel;
  }


  @JsonProperty(JSON_PROPERTY_NESTING_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNestingLevel(Integer nestingLevel) {
    this.nestingLevel = nestingLevel;
  }


  public ThreadFlowLocation executionOrder(Integer executionOrder) {
    this.executionOrder = executionOrder;
    return this;
  }

   /**
   * An integer representing the temporal order in which execution reached this location.
   * minimum: -1
   * @return executionOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExecutionOrder() {
    return executionOrder;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionOrder(Integer executionOrder) {
    this.executionOrder = executionOrder;
  }


  public ThreadFlowLocation executionTimeUtc(OffsetDateTime executionTimeUtc) {
    this.executionTimeUtc = executionTimeUtc;
    return this;
  }

   /**
   * The Coordinated Universal Time (UTC) date and time at which this location was executed.
   * @return executionTimeUtc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXECUTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExecutionTimeUtc() {
    return executionTimeUtc;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_TIME_UTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionTimeUtc(OffsetDateTime executionTimeUtc) {
    this.executionTimeUtc = executionTimeUtc;
  }


  public ThreadFlowLocation importance(ImportanceEnum importance) {
    this.importance = importance;
    return this;
  }

   /**
   * Specifies the importance of this location in understanding the code flow in which it occurs. The order from most to least important is \&quot;essential\&quot;, \&quot;important\&quot;, \&quot;unimportant\&quot;. Default: \&quot;important\&quot;.
   * @return importance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImportanceEnum getImportance() {
    return importance;
  }


  @JsonProperty(JSON_PROPERTY_IMPORTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImportance(ImportanceEnum importance) {
    this.importance = importance;
  }


  public ThreadFlowLocation webRequest(WebRequest webRequest) {
    this.webRequest = webRequest;
    return this;
  }

   /**
   * Get webRequest
   * @return webRequest
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebRequest getWebRequest() {
    return webRequest;
  }


  @JsonProperty(JSON_PROPERTY_WEB_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebRequest(WebRequest webRequest) {
    this.webRequest = webRequest;
  }


  public ThreadFlowLocation webResponse(WebResponse webResponse) {
    this.webResponse = webResponse;
    return this;
  }

   /**
   * Get webResponse
   * @return webResponse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebResponse getWebResponse() {
    return webResponse;
  }


  @JsonProperty(JSON_PROPERTY_WEB_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebResponse(WebResponse webResponse) {
    this.webResponse = webResponse;
  }


  public ThreadFlowLocation properties(PropertyBag properties) {
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
   * Return true if this threadFlowLocation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadFlowLocation threadFlowLocation = (ThreadFlowLocation) o;
    return Objects.equals(this.index, threadFlowLocation.index) &&
        Objects.equals(this.location, threadFlowLocation.location) &&
        Objects.equals(this.stack, threadFlowLocation.stack) &&
        Objects.equals(this.kinds, threadFlowLocation.kinds) &&
        Objects.equals(this.taxa, threadFlowLocation.taxa) &&
        Objects.equals(this.module, threadFlowLocation.module) &&
        Objects.equals(this.state, threadFlowLocation.state) &&
        Objects.equals(this.nestingLevel, threadFlowLocation.nestingLevel) &&
        Objects.equals(this.executionOrder, threadFlowLocation.executionOrder) &&
        Objects.equals(this.executionTimeUtc, threadFlowLocation.executionTimeUtc) &&
        Objects.equals(this.importance, threadFlowLocation.importance) &&
        Objects.equals(this.webRequest, threadFlowLocation.webRequest) &&
        Objects.equals(this.webResponse, threadFlowLocation.webResponse) &&
        Objects.equals(this.properties, threadFlowLocation.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, location, stack, kinds, taxa, module, state, nestingLevel, executionOrder, executionTimeUtc, importance, webRequest, webResponse, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadFlowLocation {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    kinds: ").append(toIndentedString(kinds)).append("\n");
    sb.append("    taxa: ").append(toIndentedString(taxa)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    nestingLevel: ").append(toIndentedString(nestingLevel)).append("\n");
    sb.append("    executionOrder: ").append(toIndentedString(executionOrder)).append("\n");
    sb.append("    executionTimeUtc: ").append(toIndentedString(executionTimeUtc)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    webRequest: ").append(toIndentedString(webRequest)).append("\n");
    sb.append("    webResponse: ").append(toIndentedString(webResponse)).append("\n");
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

    // add `index` to the URL query string
    if (getIndex() != null) {
      joiner.add(String.format("%sindex%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `location` to the URL query string
    if (getLocation() != null) {
      joiner.add(getLocation().toUrlQueryString(prefix + "location" + suffix));
    }

    // add `stack` to the URL query string
    if (getStack() != null) {
      joiner.add(getStack().toUrlQueryString(prefix + "stack" + suffix));
    }

    // add `kinds` to the URL query string
    if (getKinds() != null) {
      int i = 0;
      for (String _item : getKinds()) {
        joiner.add(String.format("%skinds%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(String.valueOf(_item), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
      i++;
    }

    // add `taxa` to the URL query string
    if (getTaxa() != null) {
      int i = 0;
      for (ReportingDescriptorReference _item : getTaxa()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxa%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `module` to the URL query string
    if (getModule() != null) {
      joiner.add(String.format("%smodule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModule()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      for (String _key : getState().keySet()) {
        if (getState().get(_key) != null) {
          joiner.add(getState().get(_key).toUrlQueryString(String.format("%sstate%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `nestingLevel` to the URL query string
    if (getNestingLevel() != null) {
      joiner.add(String.format("%snestingLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNestingLevel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `executionOrder` to the URL query string
    if (getExecutionOrder() != null) {
      joiner.add(String.format("%sexecutionOrder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExecutionOrder()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `executionTimeUtc` to the URL query string
    if (getExecutionTimeUtc() != null) {
      joiner.add(String.format("%sexecutionTimeUtc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExecutionTimeUtc()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `importance` to the URL query string
    if (getImportance() != null) {
      joiner.add(String.format("%simportance%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImportance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `webRequest` to the URL query string
    if (getWebRequest() != null) {
      joiner.add(getWebRequest().toUrlQueryString(prefix + "webRequest" + suffix));
    }

    // add `webResponse` to the URL query string
    if (getWebResponse() != null) {
      joiner.add(getWebResponse().toUrlQueryString(prefix + "webResponse" + suffix));
    }

    // add `properties` to the URL query string
    if (getProperties() != null) {
      joiner.add(String.format("%sproperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

