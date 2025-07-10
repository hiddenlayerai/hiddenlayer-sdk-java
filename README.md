# Hidden Layer Java API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.hiddenlayer_sdk.api/hidden-layer-java)](https://central.sonatype.com/artifact/com.hiddenlayer_sdk.api/hidden-layer-java/0.0.1-alpha.0)
[![javadoc](https://javadoc.io/badge2/com.hiddenlayer_sdk.api/hidden-layer-java/0.0.1-alpha.0/javadoc.svg)](https://javadoc.io/doc/com.hiddenlayer_sdk.api/hidden-layer-java/0.0.1-alpha.0)

The Hidden Layer Java SDK provides convenient access to the [Hidden Layer REST API](https://docs.hiddenlayer-sdk.com) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

The REST API documentation can be found on [docs.hiddenlayer-sdk.com](https://docs.hiddenlayer-sdk.com). Javadocs are available on [javadoc.io](https://javadoc.io/doc/com.hiddenlayer_sdk.api/hidden-layer-java/0.0.1-alpha.0).

## Installation

### Gradle

```kotlin
implementation("com.hiddenlayer_sdk.api:hidden-layer-java:0.0.1-alpha.0")
```

### Maven

```xml
<dependency>
  <groupId>com.hiddenlayer_sdk.api</groupId>
  <artifactId>hidden-layer-java</artifactId>
  <version>0.0.1-alpha.0</version>
</dependency>
```

## Requirements

This library requires Java 8 or later.

## Usage

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

// Configures using the `HIDDENLAYER_TOKEN`, `HIDDENLAYER_CLIENT_ID`, `HIDDENLAYER_CLIENT_SECRET` and `HIDDEN_LAYER_BASE_URL` environment variables
HiddenLayerClient client = HiddenLayerOkHttpClient.fromEnv();

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName("REPLACE_ME")
    .build();
SensorCreateResponse sensor = client.sensors().create(params);
```

## Client configuration

Configure the client using environment variables:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;

// Configures using the `HIDDENLAYER_TOKEN`, `HIDDENLAYER_CLIENT_ID`, `HIDDENLAYER_CLIENT_SECRET` and `HIDDEN_LAYER_BASE_URL` environment variables
HiddenLayerClient client = HiddenLayerOkHttpClient.fromEnv();
```

Or manually:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    .bearerToken("My Bearer Token")
    .build();
```

Or using a combination of the two approaches:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    // Configures using the `HIDDENLAYER_TOKEN`, `HIDDENLAYER_CLIENT_ID`, `HIDDENLAYER_CLIENT_SECRET` and `HIDDEN_LAYER_BASE_URL` environment variables
    .fromEnv()
    .bearerToken("My Bearer Token")
    .build();
```

See this table for the available options:

| Setter         | Environment variable        | Required | Default value                  |
| -------------- | --------------------------- | -------- | ------------------------------ |
| `bearerToken`  | `HIDDENLAYER_TOKEN`         | false    | -                              |
| `clientId`     | `HIDDENLAYER_CLIENT_ID`     | false    | -                              |
| `clientSecret` | `HIDDENLAYER_CLIENT_SECRET` | false    | -                              |
| `baseUrl`      | `HIDDEN_LAYER_BASE_URL`     | true     | `"https://api.hiddenlayer.ai"` |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;

HiddenLayerClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Hidden Layer API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.sensors().create(...)` should be called with an instance of `SensorCreateParams`, and it will return an instance of `SensorCreateResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `HIDDENLAYER_TOKEN`, `HIDDENLAYER_CLIENT_ID`, `HIDDENLAYER_CLIENT_SECRET` and `HIDDEN_LAYER_BASE_URL` environment variables
HiddenLayerClient client = HiddenLayerOkHttpClient.fromEnv();

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName("REPLACE_ME")
    .build();
CompletableFuture<SensorCreateResponse> sensor = client.async().sensors().create(params);
```

Or create an asynchronous client from the beginning:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClientAsync;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClientAsync;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;
import java.util.concurrent.CompletableFuture;

// Configures using the `HIDDENLAYER_TOKEN`, `HIDDENLAYER_CLIENT_ID`, `HIDDENLAYER_CLIENT_SECRET` and `HIDDEN_LAYER_BASE_URL` environment variables
HiddenLayerClientAsync client = HiddenLayerOkHttpClientAsync.fromEnv();

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName("REPLACE_ME")
    .build();
CompletableFuture<SensorCreateResponse> sensor = client.sensors().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import com.hiddenlayer_sdk.api.core.http.Headers;
import com.hiddenlayer_sdk.api.core.http.HttpResponseFor;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName("REPLACE_ME")
    .build();
HttpResponseFor<SensorCreateResponse> sensor = client.sensors().withRawResponse().create(params);

int statusCode = sensor.statusCode();
Headers headers = sensor.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

SensorCreateResponse parsedSensor = sensor.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`HiddenLayerServiceException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/HiddenLayerServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                                 |
  | ------ | ----------------------------------------------------------------------------------------------------------------------------------------- |
  | 400    | [`BadRequestException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/UnexpectedStatusCodeException.kt) |

- [`HiddenLayerIoException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/HiddenLayerIoException.kt): I/O networking errors.

- [`HiddenLayerInvalidDataException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/HiddenLayerInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`HiddenLayerException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/HiddenLayerException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `HIDDEN_LAYER_LOG` environment variable to `info`:

```sh
$ export HIDDEN_LAYER_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export HIDDEN_LAYER_LOG=debug
```

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`HiddenLayerOkHttpClient`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClient.kt) or [`HiddenLayerOkHttpClientAsync`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

SensorCreateResponse sensor = client.sensors().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;
import java.time.Duration;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `hidden-layer-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`HiddenLayerClient`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClient.kt), [`HiddenLayerClientAsync`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientAsync.kt), [`HiddenLayerClientImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientImpl.kt), and [`HiddenLayerClientAsyncImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientAsyncImpl.kt), all of which can work with any HTTP client
- `hidden-layer-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`HiddenLayerOkHttpClient`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClient.kt) and [`HiddenLayerOkHttpClientAsync`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClientAsync.kt), which provide a way to construct [`HiddenLayerClientImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientImpl.kt) and [`HiddenLayerClientAsyncImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientAsyncImpl.kt), respectively, using OkHttp
- `hidden-layer-java`
  - Depends on and exposes the APIs of both `hidden-layer-java-core` and `hidden-layer-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`hidden-layer-java` dependency](#installation) with `hidden-layer-java-core`
2. Copy `hidden-layer-java-client-okhttp`'s [`OkHttpClient`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`HiddenLayerClientImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientImpl.kt) or [`HiddenLayerClientAsyncImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientAsyncImpl.kt), similarly to [`HiddenLayerOkHttpClient`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClient.kt) or [`HiddenLayerOkHttpClientAsync`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`hidden-layer-java` dependency](#installation) with `hidden-layer-java-core`
2. Write a class that implements the [`HttpClient`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/core/http/HttpClient.kt) interface
3. Construct [`HiddenLayerClientImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientImpl.kt) or [`HiddenLayerClientAsyncImpl`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/client/HiddenLayerClientAsyncImpl.kt), similarly to [`HiddenLayerOkHttpClient`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClient.kt) or [`HiddenLayerOkHttpClientAsync`](hidden-layer-java-client-okhttp/src/main/kotlin/com/hiddenlayer_sdk/api/client/okhttp/HiddenLayerOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.hiddenlayer_sdk.api.core.JsonValue;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;

SensorCreateParams params = SensorCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.hiddenlayer_sdk.api.core.JsonValue;
import com.hiddenlayer_sdk.api.models.models.cards.CardListParams;

CardListParams params = CardListParams.builder()
    .modelCreated(CardListParams.ModelCreated.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/core/Values.kt) object to its setter:

```java
import com.hiddenlayer_sdk.api.core.JsonValue;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName(JsonValue.from(42))
    .build();
```

The most straightforward way to create a [`JsonValue`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/core/Values.kt) is using its `from(...)` method:

```java
import com.hiddenlayer_sdk.api.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/core/Values.kt):

```java
import com.hiddenlayer_sdk.api.core.JsonMissing;
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateParams;

SensorCreateParams params = SensorCreateParams.builder()
    .plaintextName(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.hiddenlayer_sdk.api.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.sensors().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.hiddenlayer_sdk.api.core.JsonField;
import java.util.Optional;

JsonField<String> plaintextName = client.sensors().create(params)._plaintextName();

if (plaintextName.isMissing()) {
  // The property is absent from the JSON response
} else if (plaintextName.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = plaintextName.asString();

  // Try to deserialize into a custom type
  MyClass myObject = plaintextName.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`HiddenLayerInvalidDataException`](hidden-layer-java-core/src/main/kotlin/com/hiddenlayer_sdk/api/errors/HiddenLayerInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

SensorCreateResponse sensor = client.sensors().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.hiddenlayer_sdk.api.models.sensors.SensorCreateResponse;

SensorCreateResponse sensor = client.sensors().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.hiddenlayer_sdk.api.client.HiddenLayerClient;
import com.hiddenlayer_sdk.api.client.okhttp.HiddenLayerOkHttpClient;

HiddenLayerClient client = HiddenLayerOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/hiddenlayer-sdk-java/issues) with questions, bugs, or suggestions.
