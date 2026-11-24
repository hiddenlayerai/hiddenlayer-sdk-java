# HiddenLayer Java API Library

[![Maven Central](https://img.shields.io/maven-central/v/com.hiddenlayer.api/hiddenlayer-java)](https://central.sonatype.com/artifact/com.hiddenlayer.api/hiddenlayer-java)

This library provides access to the HiddenLayer REST API from Java 8 or later. The REST API documentation is on [dev.hiddenlayer.ai](https://dev.hiddenlayer.ai); every method of this library is in [reference.md](reference.md).

Upgrading from 2.x? [docs/BREAKING_CHANGES_v3.0.0.md](docs/BREAKING_CHANGES_v3.0.0.md) lists every change.

## Installation

### Gradle

```kotlin
implementation("com.hiddenlayer.api:hiddenlayer-java:3.0.0")
```

### Maven

```xml
<dependency>
  <groupId>com.hiddenlayer.api</groupId>
  <artifactId>hiddenlayer-java</artifactId>
  <version>3.0.0</version>
</dependency>
```

## Usage

```java
import com.hiddenlayer.api.HiddenLayerClient;
import com.hiddenlayer.api.HiddenLayerClientBuilder;
import com.hiddenlayer.api.core.Environment;
import com.hiddenlayer.api.resources.interactions.requests.InteractionsRequest;
import com.hiddenlayer.api.types.EnrichedResponse;
import com.hiddenlayer.api.types.InteractionsMetadata;

HiddenLayerClient client = new HiddenLayerClientBuilder()
    .environment(Environment.PROD_EU) // defaults to Environment.PROD_US
    .build();

EnrichedResponse response = client.interactions().analyze(InteractionsRequest.builder()
    .metadata(InteractionsMetadata.builder()
        .model("gpt-5")
        .requesterId("user-1234")
        .provider("openai")
        .build())
    .build());
```

Create one client and share it: each client has its own connection pool. `client.close()` releases it.

### Credentials

Give the builder a client ID and secret, created under Client Credentials in the HiddenLayer Console. The client exchanges them for an access token on its first call, reuses that token, and gets a new one two minutes before it expires:

```java
HiddenLayerClient client = new HiddenLayerClientBuilder()
    .clientId(System.getenv("HIDDENLAYER_CLIENT_ID"))
    .clientSecret(System.getenv("HIDDENLAYER_CLIENT_SECRET"))
    .build();
```

The client authenticates with the first of these it finds, the builder before the environment:

1. `token` on the builder: a Static API Key or a JWT, sent as a bearer token. The client never refreshes a token it's given.
2. `clientId` and `clientSecret` on the builder. Either one alone is completed from the environment.
3. The `HIDDENLAYER_TOKEN` environment variable.
4. The `HIDDENLAYER_CLIENT_ID` and `HIDDENLAYER_CLIENT_SECRET` environment variables.

With none of them, `build()` throws an `IllegalStateException`.

`client.oauth2().token` returns an access token itself, for a caller that needs the token. It sends the client ID and secret you pass it, whatever the client was built with:

```java
import com.hiddenlayer.api.types.AccessToken;
import com.hiddenlayer.api.types.AccessTokenRequest;
import com.hiddenlayer.api.types.AccessTokenRequestGrantType;

AccessToken token = client.oauth2().token(AccessTokenRequest.builder()
    .grantType(AccessTokenRequestGrantType.CLIENT_CREDENTIALS)
    .clientId(System.getenv("HIDDENLAYER_CLIENT_ID"))
    .clientSecret(System.getenv("HIDDENLAYER_CLIENT_SECRET"))
    .build());
System.out.println(token.getTokenType() + " " + token.getExpiresIn());
```

### Environments

`environment` takes a region, `Environment.PROD_US` or `Environment.PROD_EU`, and `url` takes any base URL. With neither, the client uses `HIDDENLAYER_BASE_URL` if it is set, and the US region otherwise.

### Asynchronous client

`AsyncHiddenLayerClient` has the same methods, each returning a `CompletableFuture`. Close it when you are done: its scanners run on threads of their own, which keep the JVM alive until `close()` stops them.

```java
import com.hiddenlayer.api.AsyncHiddenLayerClient;
import com.hiddenlayer.api.AsyncHiddenLayerClientBuilder;

try (AsyncHiddenLayerClient asyncClient = new AsyncHiddenLayerClientBuilder().build()) {
    asyncClient.scans().results().retrieveSummary(scanId)
        .thenAccept(summary -> System.out.println(summary.getStatus()))
        .join();
}
```

## Model scanning

```java
import com.hiddenlayer.api.lib.ScanFileOptions;
import com.hiddenlayer.api.types.ScanReportOfRecordV3;

ScanReportOfRecordV3 report = client.modelScanner().scanFile(ScanFileOptions.builder()
    .modelName("my-model")
    .modelPath("./models/model.pkl")
    .build());
System.out.println(report.getSummary().getSeverity());
```

`client.modelScanner()` also has `scanFolder`, which scans every file under a folder as one model, and `client.communityScanner().communityScan` scans a model the scanner fetches from a remote location, such as a Hugging Face repository:

```java
import com.hiddenlayer.api.lib.CommunityScanSource;

ScanReportOfRecordV3 report = client.communityScanner()
    .communityScan("my-model", "ScanMe/test-models", CommunityScanSource.HUGGING_FACE);
```

Each waits for the scan to finish unless told otherwise, with `waitForResults(false)` on the options or the `waitForResults` argument. A scan fails with a `HiddenLayerException` whose cause is what failed.

## Handling errors

A non-success status code throws a `HiddenLayerApiException`, or the subclass the API declares for that status, such as `NotFoundError`:

```java
import com.hiddenlayer.api.core.HiddenLayerApiException;

try {
    client.sensors().retrieve("unknown");
} catch (HiddenLayerApiException e) {
    System.out.println(e.statusCode() + " " + e.body());
}
```

A request that times out or can't connect throws a `HiddenLayerException` with the `IOException` as its cause. A missing credential throws an `IllegalStateException` when the client is built, and an invalid argument an `IllegalArgumentException`.

## Pagination

List methods return a `SyncPagingIterable`. Iterating it walks every item across pages:

```java
import com.hiddenlayer.api.types.ModelCardV4;

for (ModelCardV4 card : client.models().cards().list()) {
    System.out.println(card.getModelId());
}
```

`getItems()` holds the current page's items, and `hasNext()` and `nextPage()` move through pages by hand. The asynchronous client completes with the first page; reading further pages blocks.

## Retries and timeouts

408, 429 and 5xx responses are retried twice by default, with exponential backoff. A request that times out or loses its connection isn't retried, except while a scanner polls for a scan's results. Requests time out after 60 seconds. Retries and the timeout can be set for the client or per request:

```java
import com.hiddenlayer.api.core.RequestOptions;

HiddenLayerClient client = new HiddenLayerClientBuilder().maxRetries(0).timeout(20).build();

client.sensors().retrieve(sensorId, RequestOptions.builder().maxRetries(5).timeout(5).build());
```

## Raw responses

```java
import com.hiddenlayer.api.core.BaseHiddenLayerClientHttpResponse;
import com.hiddenlayer.api.types.SensorSorItemResponse;

BaseHiddenLayerClientHttpResponse<SensorSorItemResponse> response =
    client.sensors().withRawResponse().retrieve(sensorId);
response.headers().forEach((name, values) -> System.out.println(name + ": " + values));
SensorSorItemResponse sensor = response.body();
```

Header names keep the case the server sent them in.

## Custom HTTP client

The library sends through OkHttp. Pass your own `OkHttpClient` for a proxy, custom TLS or a shared connection pool, and add interceptors of your own with `addInterceptor`:

```java
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.OkHttpClient;

OkHttpClient httpClient = new OkHttpClient.Builder()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.example.com", 8080)))
    .build();

HiddenLayerClient client = new HiddenLayerClientBuilder().httpClient(httpClient).build();
```

The client you pass keeps the SDK's retries, and its own timeouts apply unless you call `timeout` on the builder. Two kinds of request don't go through it: the exchange of a client ID and secret for an access token, and the scanners' uploads of file parts to presigned URLs.

## Beta APIs

Some HiddenLayer APIs are marked **Beta**: not yet generally available or production ready. They can be used in production at your own risk; see the [Beta API Guidelines](https://dev.hiddenlayer.ai/docs/beta-api-faq).

- HiddenLayer makes no compatibility guarantees for Beta APIs. Breaking changes may occur at any time.
- Changes to Beta APIs don't count towards this library's semantic version.
- The first call to each beta endpoint logs a warning through `java.util.logging`, once per JVM, from the logger `com.hiddenlayer.api.lib.BetaWarning`.

## Requirements

Java 8 or later.

## Versioning and changelog

Releases follow [SemVer](https://semver.org/spec/v2.0.0.html), apart from Beta APIs. [CHANGELOG.md](CHANGELOG.md) lists each release.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md). A pull request that changes `src/` needs a changeset: run `npx changeset` and describe the change for the changelog.
