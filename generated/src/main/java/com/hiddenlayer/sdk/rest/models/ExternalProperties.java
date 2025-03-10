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
import com.hiddenlayer.sdk.rest.models.Address;
import com.hiddenlayer.sdk.rest.models.Artifact;
import com.hiddenlayer.sdk.rest.models.Conversion;
import com.hiddenlayer.sdk.rest.models.Graph;
import com.hiddenlayer.sdk.rest.models.Invocation;
import com.hiddenlayer.sdk.rest.models.LogicalLocation;
import com.hiddenlayer.sdk.rest.models.PropertyBag;
import com.hiddenlayer.sdk.rest.models.Result;
import com.hiddenlayer.sdk.rest.models.ThreadFlowLocation;
import com.hiddenlayer.sdk.rest.models.ToolComponent;
import com.hiddenlayer.sdk.rest.models.WebRequest;
import com.hiddenlayer.sdk.rest.models.WebResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The top-level element of an external property file.
 */
@JsonPropertyOrder({
  ExternalProperties.JSON_PROPERTY_SCHEMA,
  ExternalProperties.JSON_PROPERTY_VERSION,
  ExternalProperties.JSON_PROPERTY_GUID,
  ExternalProperties.JSON_PROPERTY_RUN_GUID,
  ExternalProperties.JSON_PROPERTY_CONVERSION,
  ExternalProperties.JSON_PROPERTY_GRAPHS,
  ExternalProperties.JSON_PROPERTY_EXTERNALIZED_PROPERTIES,
  ExternalProperties.JSON_PROPERTY_ARTIFACTS,
  ExternalProperties.JSON_PROPERTY_INVOCATIONS,
  ExternalProperties.JSON_PROPERTY_LOGICAL_LOCATIONS,
  ExternalProperties.JSON_PROPERTY_THREAD_FLOW_LOCATIONS,
  ExternalProperties.JSON_PROPERTY_RESULTS,
  ExternalProperties.JSON_PROPERTY_TAXONOMIES,
  ExternalProperties.JSON_PROPERTY_DRIVER,
  ExternalProperties.JSON_PROPERTY_EXTENSIONS,
  ExternalProperties.JSON_PROPERTY_POLICIES,
  ExternalProperties.JSON_PROPERTY_TRANSLATIONS,
  ExternalProperties.JSON_PROPERTY_ADDRESSES,
  ExternalProperties.JSON_PROPERTY_WEB_REQUESTS,
  ExternalProperties.JSON_PROPERTY_WEB_RESPONSES,
  ExternalProperties.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-06T16:41:22.054858Z[GMT]", comments = "Generator version: 7.6.0")
public class ExternalProperties {
  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private URI schema;

  /**
   * The SARIF format version of this external properties object.
   */
  public enum VersionEnum {
    _2_1_0("2.1.0");

    private String value;

    VersionEnum(String value) {
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
    public static VersionEnum fromValue(String value) {
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

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_RUN_GUID = "runGuid";
  private String runGuid;

  public static final String JSON_PROPERTY_CONVERSION = "conversion";
  private Conversion conversion;

  public static final String JSON_PROPERTY_GRAPHS = "graphs";
  private Set<Graph> graphs = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_EXTERNALIZED_PROPERTIES = "externalizedProperties";
  private PropertyBag externalizedProperties;

  public static final String JSON_PROPERTY_ARTIFACTS = "artifacts";
  private Set<Artifact> artifacts = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_INVOCATIONS = "invocations";
  private List<Invocation> invocations = new ArrayList<>();

  public static final String JSON_PROPERTY_LOGICAL_LOCATIONS = "logicalLocations";
  private Set<LogicalLocation> logicalLocations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_THREAD_FLOW_LOCATIONS = "threadFlowLocations";
  private Set<ThreadFlowLocation> threadFlowLocations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<Result> results = new ArrayList<>();

  public static final String JSON_PROPERTY_TAXONOMIES = "taxonomies";
  private Set<ToolComponent> taxonomies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private ToolComponent driver;

  public static final String JSON_PROPERTY_EXTENSIONS = "extensions";
  private Set<ToolComponent> extensions = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_POLICIES = "policies";
  private Set<ToolComponent> policies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
  private Set<ToolComponent> translations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Address> addresses = new ArrayList<>();

  public static final String JSON_PROPERTY_WEB_REQUESTS = "webRequests";
  private Set<WebRequest> webRequests = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_WEB_RESPONSES = "webResponses";
  private Set<WebResponse> webResponses = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private PropertyBag properties;

  public ExternalProperties() { 
  }

  public ExternalProperties schema(URI schema) {
    this.schema = schema;
    return this;
  }

   /**
   * The URI of the JSON schema corresponding to the version of the external property file format.
   * @return schema
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(URI schema) {
    this.schema = schema;
  }


  public ExternalProperties version(VersionEnum version) {
    this.version = version;
    return this;
  }

   /**
   * The SARIF format version of this external properties object.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VersionEnum getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(VersionEnum version) {
    this.version = version;
  }


  public ExternalProperties guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * A stable, unique identifier for this external properties object, in the form of a GUID.
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


  public ExternalProperties runGuid(String runGuid) {
    this.runGuid = runGuid;
    return this;
  }

   /**
   * A stable, unique identifier for the run associated with this external properties object, in the form of a GUID.
   * @return runGuid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRunGuid() {
    return runGuid;
  }


  @JsonProperty(JSON_PROPERTY_RUN_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunGuid(String runGuid) {
    this.runGuid = runGuid;
  }


  public ExternalProperties conversion(Conversion conversion) {
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Conversion getConversion() {
    return conversion;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversion(Conversion conversion) {
    this.conversion = conversion;
  }


  public ExternalProperties graphs(Set<Graph> graphs) {
    this.graphs = graphs;
    return this;
  }

  public ExternalProperties addGraphsItem(Graph graphsItem) {
    if (this.graphs == null) {
      this.graphs = new LinkedHashSet<>();
    }
    this.graphs.add(graphsItem);
    return this;
  }

   /**
   * An array of graph objects that will be merged with a separate run.
   * @return graphs
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Graph> getGraphs() {
    return graphs;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_GRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraphs(Set<Graph> graphs) {
    this.graphs = graphs;
  }


  public ExternalProperties externalizedProperties(PropertyBag externalizedProperties) {
    this.externalizedProperties = externalizedProperties;
    return this;
  }

   /**
   * Get externalizedProperties
   * @return externalizedProperties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNALIZED_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PropertyBag getExternalizedProperties() {
    return externalizedProperties;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNALIZED_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalizedProperties(PropertyBag externalizedProperties) {
    this.externalizedProperties = externalizedProperties;
  }


  public ExternalProperties artifacts(Set<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public ExternalProperties addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new LinkedHashSet<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

   /**
   * An array of artifact objects that will be merged with a separate run.
   * @return artifacts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARTIFACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Artifact> getArtifacts() {
    return artifacts;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ARTIFACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifacts(Set<Artifact> artifacts) {
    this.artifacts = artifacts;
  }


  public ExternalProperties invocations(List<Invocation> invocations) {
    this.invocations = invocations;
    return this;
  }

  public ExternalProperties addInvocationsItem(Invocation invocationsItem) {
    if (this.invocations == null) {
      this.invocations = new ArrayList<>();
    }
    this.invocations.add(invocationsItem);
    return this;
  }

   /**
   * Describes the invocation of the analysis tool that will be merged with a separate run.
   * @return invocations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Invocation> getInvocations() {
    return invocations;
  }


  @JsonProperty(JSON_PROPERTY_INVOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvocations(List<Invocation> invocations) {
    this.invocations = invocations;
  }


  public ExternalProperties logicalLocations(Set<LogicalLocation> logicalLocations) {
    this.logicalLocations = logicalLocations;
    return this;
  }

  public ExternalProperties addLogicalLocationsItem(LogicalLocation logicalLocationsItem) {
    if (this.logicalLocations == null) {
      this.logicalLocations = new LinkedHashSet<>();
    }
    this.logicalLocations.add(logicalLocationsItem);
    return this;
  }

   /**
   * An array of logical locations such as namespaces, types or functions that will be merged with a separate run.
   * @return logicalLocations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGICAL_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<LogicalLocation> getLogicalLocations() {
    return logicalLocations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_LOGICAL_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalLocations(Set<LogicalLocation> logicalLocations) {
    this.logicalLocations = logicalLocations;
  }


  public ExternalProperties threadFlowLocations(Set<ThreadFlowLocation> threadFlowLocations) {
    this.threadFlowLocations = threadFlowLocations;
    return this;
  }

  public ExternalProperties addThreadFlowLocationsItem(ThreadFlowLocation threadFlowLocationsItem) {
    if (this.threadFlowLocations == null) {
      this.threadFlowLocations = new LinkedHashSet<>();
    }
    this.threadFlowLocations.add(threadFlowLocationsItem);
    return this;
  }

   /**
   * An array of threadFlowLocation objects that will be merged with a separate run.
   * @return threadFlowLocations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_FLOW_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ThreadFlowLocation> getThreadFlowLocations() {
    return threadFlowLocations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_THREAD_FLOW_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadFlowLocations(Set<ThreadFlowLocation> threadFlowLocations) {
    this.threadFlowLocations = threadFlowLocations;
  }


  public ExternalProperties results(List<Result> results) {
    this.results = results;
    return this;
  }

  public ExternalProperties addResultsItem(Result resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * An array of result objects that will be merged with a separate run.
   * @return results
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Result> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<Result> results) {
    this.results = results;
  }


  public ExternalProperties taxonomies(Set<ToolComponent> taxonomies) {
    this.taxonomies = taxonomies;
    return this;
  }

  public ExternalProperties addTaxonomiesItem(ToolComponent taxonomiesItem) {
    if (this.taxonomies == null) {
      this.taxonomies = new LinkedHashSet<>();
    }
    this.taxonomies.add(taxonomiesItem);
    return this;
  }

   /**
   * Tool taxonomies that will be merged with a separate run.
   * @return taxonomies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXONOMIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ToolComponent> getTaxonomies() {
    return taxonomies;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TAXONOMIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxonomies(Set<ToolComponent> taxonomies) {
    this.taxonomies = taxonomies;
  }


  public ExternalProperties driver(ToolComponent driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ToolComponent getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriver(ToolComponent driver) {
    this.driver = driver;
  }


  public ExternalProperties extensions(Set<ToolComponent> extensions) {
    this.extensions = extensions;
    return this;
  }

  public ExternalProperties addExtensionsItem(ToolComponent extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new LinkedHashSet<>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Tool extensions that will be merged with a separate run.
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


  public ExternalProperties policies(Set<ToolComponent> policies) {
    this.policies = policies;
    return this;
  }

  public ExternalProperties addPoliciesItem(ToolComponent policiesItem) {
    if (this.policies == null) {
      this.policies = new LinkedHashSet<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Tool policies that will be merged with a separate run.
   * @return policies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ToolComponent> getPolicies() {
    return policies;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicies(Set<ToolComponent> policies) {
    this.policies = policies;
  }


  public ExternalProperties translations(Set<ToolComponent> translations) {
    this.translations = translations;
    return this;
  }

  public ExternalProperties addTranslationsItem(ToolComponent translationsItem) {
    if (this.translations == null) {
      this.translations = new LinkedHashSet<>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * Tool translations that will be merged with a separate run.
   * @return translations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<ToolComponent> getTranslations() {
    return translations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TRANSLATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranslations(Set<ToolComponent> translations) {
    this.translations = translations;
  }


  public ExternalProperties addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ExternalProperties addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses that will be merged with a separate run.
   * @return addresses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Address> getAddresses() {
    return addresses;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  public ExternalProperties webRequests(Set<WebRequest> webRequests) {
    this.webRequests = webRequests;
    return this;
  }

  public ExternalProperties addWebRequestsItem(WebRequest webRequestsItem) {
    if (this.webRequests == null) {
      this.webRequests = new LinkedHashSet<>();
    }
    this.webRequests.add(webRequestsItem);
    return this;
  }

   /**
   * Requests that will be merged with a separate run.
   * @return webRequests
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<WebRequest> getWebRequests() {
    return webRequests;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_WEB_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebRequests(Set<WebRequest> webRequests) {
    this.webRequests = webRequests;
  }


  public ExternalProperties webResponses(Set<WebResponse> webResponses) {
    this.webResponses = webResponses;
    return this;
  }

  public ExternalProperties addWebResponsesItem(WebResponse webResponsesItem) {
    if (this.webResponses == null) {
      this.webResponses = new LinkedHashSet<>();
    }
    this.webResponses.add(webResponsesItem);
    return this;
  }

   /**
   * Responses that will be merged with a separate run.
   * @return webResponses
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<WebResponse> getWebResponses() {
    return webResponses;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_WEB_RESPONSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebResponses(Set<WebResponse> webResponses) {
    this.webResponses = webResponses;
  }


  public ExternalProperties properties(PropertyBag properties) {
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
   * Return true if this externalProperties object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalProperties externalProperties = (ExternalProperties) o;
    return Objects.equals(this.schema, externalProperties.schema) &&
        Objects.equals(this.version, externalProperties.version) &&
        Objects.equals(this.guid, externalProperties.guid) &&
        Objects.equals(this.runGuid, externalProperties.runGuid) &&
        Objects.equals(this.conversion, externalProperties.conversion) &&
        Objects.equals(this.graphs, externalProperties.graphs) &&
        Objects.equals(this.externalizedProperties, externalProperties.externalizedProperties) &&
        Objects.equals(this.artifacts, externalProperties.artifacts) &&
        Objects.equals(this.invocations, externalProperties.invocations) &&
        Objects.equals(this.logicalLocations, externalProperties.logicalLocations) &&
        Objects.equals(this.threadFlowLocations, externalProperties.threadFlowLocations) &&
        Objects.equals(this.results, externalProperties.results) &&
        Objects.equals(this.taxonomies, externalProperties.taxonomies) &&
        Objects.equals(this.driver, externalProperties.driver) &&
        Objects.equals(this.extensions, externalProperties.extensions) &&
        Objects.equals(this.policies, externalProperties.policies) &&
        Objects.equals(this.translations, externalProperties.translations) &&
        Objects.equals(this.addresses, externalProperties.addresses) &&
        Objects.equals(this.webRequests, externalProperties.webRequests) &&
        Objects.equals(this.webResponses, externalProperties.webResponses) &&
        Objects.equals(this.properties, externalProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, version, guid, runGuid, conversion, graphs, externalizedProperties, artifacts, invocations, logicalLocations, threadFlowLocations, results, taxonomies, driver, extensions, policies, translations, addresses, webRequests, webResponses, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalProperties {\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    runGuid: ").append(toIndentedString(runGuid)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    graphs: ").append(toIndentedString(graphs)).append("\n");
    sb.append("    externalizedProperties: ").append(toIndentedString(externalizedProperties)).append("\n");
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
    sb.append("    logicalLocations: ").append(toIndentedString(logicalLocations)).append("\n");
    sb.append("    threadFlowLocations: ").append(toIndentedString(threadFlowLocations)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    taxonomies: ").append(toIndentedString(taxonomies)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    webRequests: ").append(toIndentedString(webRequests)).append("\n");
    sb.append("    webResponses: ").append(toIndentedString(webResponses)).append("\n");
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

    // add `schema` to the URL query string
    if (getSchema() != null) {
      joiner.add(String.format("%sschema%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchema()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `guid` to the URL query string
    if (getGuid() != null) {
      joiner.add(String.format("%sguid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `runGuid` to the URL query string
    if (getRunGuid() != null) {
      joiner.add(String.format("%srunGuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRunGuid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `conversion` to the URL query string
    if (getConversion() != null) {
      joiner.add(getConversion().toUrlQueryString(prefix + "conversion" + suffix));
    }

    // add `graphs` to the URL query string
    if (getGraphs() != null) {
      int i = 0;
      for (Graph _item : getGraphs()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sgraphs%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `externalizedProperties` to the URL query string
    if (getExternalizedProperties() != null) {
      joiner.add(String.format("%sexternalizedProperties%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalizedProperties()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `artifacts` to the URL query string
    if (getArtifacts() != null) {
      int i = 0;
      for (Artifact _item : getArtifacts()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sartifacts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `invocations` to the URL query string
    if (getInvocations() != null) {
      for (int i = 0; i < getInvocations().size(); i++) {
        if (getInvocations().get(i) != null) {
          joiner.add(getInvocations().get(i).toUrlQueryString(String.format("%sinvocations%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `logicalLocations` to the URL query string
    if (getLogicalLocations() != null) {
      int i = 0;
      for (LogicalLocation _item : getLogicalLocations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slogicalLocations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `threadFlowLocations` to the URL query string
    if (getThreadFlowLocations() != null) {
      int i = 0;
      for (ThreadFlowLocation _item : getThreadFlowLocations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sthreadFlowLocations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `results` to the URL query string
    if (getResults() != null) {
      for (int i = 0; i < getResults().size(); i++) {
        if (getResults().get(i) != null) {
          joiner.add(getResults().get(i).toUrlQueryString(String.format("%sresults%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `taxonomies` to the URL query string
    if (getTaxonomies() != null) {
      int i = 0;
      for (ToolComponent _item : getTaxonomies()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxonomies%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

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

    // add `policies` to the URL query string
    if (getPolicies() != null) {
      int i = 0;
      for (ToolComponent _item : getPolicies()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%spolicies%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `translations` to the URL query string
    if (getTranslations() != null) {
      int i = 0;
      for (ToolComponent _item : getTranslations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%stranslations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `addresses` to the URL query string
    if (getAddresses() != null) {
      for (int i = 0; i < getAddresses().size(); i++) {
        if (getAddresses().get(i) != null) {
          joiner.add(getAddresses().get(i).toUrlQueryString(String.format("%saddresses%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `webRequests` to the URL query string
    if (getWebRequests() != null) {
      int i = 0;
      for (WebRequest _item : getWebRequests()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%swebRequests%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `webResponses` to the URL query string
    if (getWebResponses() != null) {
      int i = 0;
      for (WebResponse _item : getWebResponses()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%swebResponses%s%s", prefix, suffix,
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

