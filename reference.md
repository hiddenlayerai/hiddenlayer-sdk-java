# Reference
## EulaResponses
<details><summary><code>client.eulaResponses.self() -> SelfEulaResponsesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves the current EULA acceptance status for the authenticated user's tenant, including the version responded to and when it was last updated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.eulaResponses().self();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Credentials
<details><summary><code>client.credentials.list() -> ListCredentialsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Lists all API credentials for the requester's tenant. API credentials can be used to authenticate automated processes and integrations with the HiddenLayer API. The list includes both active and inactive credentials, along with their associated metadata. If the `embed` parameter is used with `created_by_user`, the response will also include details about the user who created each credential. The response includes up to 1000 items.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credentials().list(
    ListCredentialsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**embed:** `Optional<String>` — A comma-separated list of optional fields to embed in the response. Currently, the only supported value is `created_by_user`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.credentials.create(request) -> CredentialsWithSecret</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new API credential for authenticating automated processes and integrations with the HiddenLayer API. The credential consists of an immutable client ID and client secret pair.

If no expiry is provided, the credential will automatically expire one year from creation. In accordance with standard industry best practices, it is not recommended to set an expiration date-time more than 365 days in the future.
If an expiration date is set more than 365 days in the future, the request will be rejected with a 422 Unprocessable Entity response.

By default, if no permissions are specified, the credential will be granted all available permissions. To restrict the credential to specific permissions, provide a list of permission identifiers (scopes).
The available permissions can be found by calling [`GET /api/v2/permissions`](#operation/list_permissions_api_v2_permissions_get).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credentials().create(
    CredentialsCreateRequestV2
        .builder()
        .name("some-name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` 

If no expiry is provided, the credentials will automatically expire one year from creation.
In accordance with standard industry best practices, it is not recommended to set an expiration date-time
more than 365 days in the future.
    
</dd>
</dl>

<dl>
<dd>

**permissions:** `Optional<List<String>>` — Specifies permissions granted to the credential. If this property is omitted, then the credential will effectively have administrator permissions.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.credentials.delete(id)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Permanently deletes an API credential. Once deleted, the credential can no longer be used to authenticate with the HiddenLayer API.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.credentials().delete(
    "00000000-0000-0000-0000-000000000000",
    DeleteCredentialsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Permissions
<details><summary><code>client.permissions.list() -> ListPermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets a list of valid permissions that can be assigned to users or API credentials.

HiddenLayer permissions follow a `{area}:{action}` format, where:
- The area name uses kebab-case (e.g., `model-version`)
- The action specifies what can be done with the resource area (e.g., r/read, w/write, or d/delete)
- Area and action are separated by a colon (:)

Hypothetical Example: `model-version:read` would grant permission to read model versions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Roles
<details><summary><code>client.roles.list() -> ListRolesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a list of roles that can be assigned to users. The platform provides several predefined roles, each with its own set of permissions:

**Admin**
- Full system access with broad privileges
- Can manage integrations, model assets, detections, and users
- Has create, delete, edit, and configuration capabilities

**Analyst**
- Focused on model scanning and detection workflows
- Can submit and update scan results
- Can review details, add notes, and close detections

**Viewer**
- Read-only access to system resources
- Can view assets, results, models, and detections
- Cannot create, edit, or delete resources

**User Admin**
- Specialized in user management
- Can create, edit, and delete users
- Limited to user administration tasks

Note: Some resources are restricted to specific service integrations and are not accessible through these roles.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users
<details><summary><code>client.users.list() -> ListUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns all users belonging to the authenticated user's tenant. The response includes up to 1000 items. **Deprecated** — use [List Users (paginated)](#tag/Users/operation/list_users_access_v2_users_get) instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.create(request) -> CreateUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates a new user in the tenant. The user's email address must be unique within the tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().create(
    UserBase
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `UserBase` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.get(id) -> GetUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves details for the specified user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().get(
    "00000000-0000-0000-0000-000000000000",
    GetUsersRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.update(id, request) -> User</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates details for the specified user. The user's email address must remain unique within the tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().update(
    "00000000-0000-0000-0000-000000000000",
    UpdateUsersRequest
        .builder()
        .body(
            UserBase
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**request:** `UserBase` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.delete(id)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Permanently removes the specified user from the tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().delete(
    "00000000-0000-0000-0000-000000000000",
    DeleteUsersRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.reset(request) -> ResetUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Initiates a password reset for the specified user by sending a password reset email.
The user must complete the reset workflow themselves via the link in the email.
The `password` field in the response is deprecated and included only for backwards compatibility.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().reset(
    ResetUsersRequest
        .builder()
        .email("email")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**email:** `String` — A user email address
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.me() -> MeUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves profile and role details for the currently authenticated user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().me();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## SsoIntegrations
<details><summary><code>client.ssoIntegrations.list() -> ListSsoIntegrationsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the list of SSO integrations associated with the requester's tenant. The results will be sorted by age in descending order (i.e. newest to oldest).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ssoIntegrations().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ssoIntegrations.create(request) -> SsoIntegrationSamlV2</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates an SSO integration record that can be used to authenticate users with HiddenLayer. SSO integrations
cannot be enabled until all required information is populated to form a trusted connection between the HiddenLayer
and the Identity Provider (IdP).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ssoIntegrations().create(
    SsoIntegrationsCreateRequest
        .builder()
        .type(SsoIntegrationsCreateRequestType.SAML_V2)
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `SsoIntegrationsCreateRequestType` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ssoIntegrations.get(id) -> SsoIntegrationSamlV2</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get SSO Integration
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ssoIntegrations().get(
    "00000000-0000-0000-0000-000000000000",
    GetSsoIntegrationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ssoIntegrations.update(id, request) -> SsoIntegrationSamlV2</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an existing SSO integration record that can be used to authenticate users with HiddenLayer. SSO integrations
cannot be enabled until all required information is populated to form a trusted connection between the HiddenLayer
and the Identity Provider (IdP).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ssoIntegrations().update(
    "00000000-0000-0000-0000-000000000000",
    SsoIntegrationsUpdateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**isEnabled:** `Optional<Boolean>` — Indicates whether or not the SSO integration is enabled
    
</dd>
</dl>

<dl>
<dd>

**requestSigning:** `Optional<SsoIntegrationRequestSigning>` 
    
</dd>
</dl>

<dl>
<dd>

**managedDomains:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**identityProvider:** `Optional<SamlIdentityProvider>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Interactions
<details><summary><code>client.interactions.analyze(request) -> EnrichedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Performs a detailed security analysis of the input and/or output of LLM interactions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.interactions().analyze(
    InteractionsRequest
        .builder()
        .metadata(
            InteractionsMetadata
                .builder()
                .model("gpt-5")
                .requesterId("user-1234")
                .provider("openai")
                .build()
        )
        .hlProjectId("internal-search-chatbot")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — The ID or alias for the Project to govern the request processing.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `InteractionsMetadata` 
    
</dd>
</dl>

<dl>
<dd>

**input:** `Optional<InteractionsInput>` 
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<InteractionsOutput>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## PromptAnalyzer
<details><summary><code>client.promptAnalyzer.create(request) -> HiddenLayerPromptAnalyzerResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Analyze LLM Prompt and Response
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.promptAnalyzer().create(
    PromptAnalyzerRequest
        .builder()
        .prompt("Hello World")
        .hlProjectId("internal-search-chatbot")
        .output("Hello, how can I help you today?")
        .model("mistral-tiny")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — The ID or alias for the Project to govern the request processing.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — The identifier for the requester to be used if MLDR is enabled
    
</dd>
</dl>

<dl>
<dd>

**prompt:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**model:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Runtime
<details><summary><code>client.runtime.evaluateInteraction(request) -> InteractionEvaluationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Performs synchronous security evaluation on an LLM **interaction**. The
interaction can be a standalone user prompt, a standalone model response,
a partial exchange, or a long multi-turn message history. The endpoint 
imposes no requirement that the messages form a complete request/response pair.

The request carries `metadata` and an `interaction` payload. The `interaction`
field accepts either:

- the **canonical**, provider-agnostic form (`CanonicalInteraction`) —
  an ordered sequence of messages (user, assistant, system, tool) with their
  role and content parts, and optionally the tool catalog that was in scope; or
- a **native LLM-provider payload** passed through verbatim. Supported
  provider formats:
  - [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
  - [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
  - [Anthropic Messages](https://docs.anthropic.com/en/api/messages)

Returns the evaluation context (`evaluated_interaction`): the canonicalized messages
with per-message signals and findings attached. Also returns the policy
outcome, which carries the enforcement action, threat level, any detections,
and the effective payload the caller should forward (`outcome.effective_interaction`).

Use this endpoint when you need full evaluation results. For inline pass-through
(provider request/response payloads returned in the same provider format), use
the request-evaluations and response-evaluations endpoints instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.runtime().evaluateInteraction(
    InteractionEvaluationRequest
        .builder()
        .metadata(
            InteractionEvaluationRequestMetadata
                .builder()
                .model("gpt-4-turbo")
                .requesterId("user-12345")
                .provider("openai")
                .externalSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
                .build()
        )
        .interaction(
            InteractionEvaluationRequestInteraction.of(
                CanonicalInteraction
                    .builder()
                    .messages(
                        Arrays.asList(
                            CanonicalInteractionMessage
                                .builder()
                                .role("user")
                                .content(
                                    Arrays.asList(
                                        ContentPart.text(
                                            TextPart
                                                .builder()
                                                .text("Hello, how can I help you today?")
                                                .build()
                                        )
                                    )
                                )
                                .build(),
                            CanonicalInteractionMessage
                                .builder()
                                .role("assistant")
                                .content(
                                    Arrays.asList(
                                        ContentPart.text(
                                            TextPart
                                                .builder()
                                                .text("Hello, how can I help you today?")
                                                .build()
                                        )
                                    )
                                )
                                .build()
                        )
                    )
                    .build()
            )
        )
        .hlProjectId("internal-search-chatbot")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — The ID or alias for the Project to govern the request processing.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `InteractionEvaluationRequestMetadata` 
    
</dd>
</dl>

<dl>
<dd>

**interaction:** `InteractionEvaluationRequestInteraction` 

The interaction to evaluate. Accepts either the canonical form
(`CanonicalInteraction` — `messages` and optional `tools_available`)
or a native LLM-provider payload passed through verbatim. Supported
provider formats are OpenAI Chat Completions, OpenAI Responses, and
Anthropic Messages. `ProviderPayload` is intentionally permissive
(any JSON object) so callers can supply provider-native shapes
without schema constraints.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.runtime.evaluateRequest(request) -> Map&amp;lt;String, Object&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Analyzes an LLM request payload for security threats before it is sent to the model.

Accepts any valid provider request payload and returns:
- If detect or redact action: the request payload (potentially modified) in the provider's request format
- If block action: a canned block message in the provider's response format

If the project is in monitor mode, the endpoint does not block or redact. It returns the
request payload unchanged.

Use this endpoint inline in your LLM pipeline to evaluate prompts before they reach the model.

Supported provider formats:
- [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
- [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
- [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.runtime().evaluateRequest(
    EvaluateRequestRuntimeRequest
        .builder()
        .body(
            new HashMap<String, Object>() {{
                put("model", "gpt-4");
                put("messages", new ArrayList<Object>(Arrays.asList(new 
                HashMap<String, Object>() {{put("role", "system");
                    put("content", "You are a helpful assistant.");
                }}, new 
                HashMap<String, Object>() {{put("role", "user");
                    put("content", "What is the capital of France?");
                }})));
                put("max_tokens", 1000);
                put("temperature", 0.7);
            }}
        )
        .hlProjectId("internal-search-chatbot")
        .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — The ID or alias for the Project to govern the request processing.
    
</dd>
</dl>

<dl>
<dd>

**hlRuntimeSessionId:** `Optional<String>` 

An externally-defined session identifier to group interactions in separate requests into a
single session. The identifier should be unique across the all sessions.
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.runtime.evaluateResponse(request) -> Map&amp;lt;String, Object&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Analyzes an LLM response payload for security threats after it is received from the model.

Accepts any valid provider response payload and returns:
- If detect or redact action: the response payload (potentially modified) in the provider's response format
- If block action: a canned block message in the provider's response format

If the project is in monitor mode, the endpoint does not block or redact. It returns the
response payload unchanged.

Use this endpoint inline in your LLM pipeline to evaluate model outputs before returning them to users.

Supported provider formats:
- [OpenAI Chat Completions](https://platform.openai.com/docs/api-reference/chat)
- [OpenAI Responses](https://platform.openai.com/docs/api-reference/responses)
- [Anthropic Messages](https://docs.anthropic.com/en/api/messages)
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.runtime().evaluateResponse(
    EvaluateResponseRuntimeRequest
        .builder()
        .body(
            new HashMap<String, Object>() {{
                put("id", "chatcmpl-abc123");
                put("object", "chat.completion");
                put("created", 1704067200);
                put("model", "gpt-4");
                put("choices", new ArrayList<Object>(Arrays.asList(new 
                HashMap<String, Object>() {{put("index", 0);
                    put("message", new 
                    HashMap<String, Object>() {{put("role", "assistant");
                        put("content", "The capital of France is Paris.");
                    }});
                    put("finish_reason", "stop");
                }})));
                put("usage", new 
                HashMap<String, Object>() {{put("prompt_tokens", 25);
                    put("completion_tokens", 10);
                    put("total_tokens", 35);
                }});
            }}
        )
        .hlProjectId("internal-search-chatbot")
        .hlRuntimeSessionId("sess_4b8cde94604f4c389406a0b2f806069a")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — The ID or alias for the Project to govern the request processing.
    
</dd>
</dl>

<dl>
<dd>

**hlRuntimeSessionId:** `Optional<String>` 

An externally-defined session identifier to group interactions in separate requests into a
single session. The identifier should be unique across the all sessions.
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Sensors
<details><summary><code>client.sensors.create(request) -> SensorSorItemResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().create(
    SensorSorItemCreateRequest
        .builder()
        .plaintextName("plaintext_name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**plaintextName:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**version:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**tags:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**adhoc:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sensors.retrieve(sensorId) -> SensorSorItemResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().retrieve(
    "sensor_id",
    RetrieveSensorsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sensorId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sensors.update(sensorId, request) -> SensorSorUpdateResponseModel</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().update(
    "sensor_id",
    SensorSorItemUpdateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sensorId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**plaintextName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**active:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**tags:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sensors.delete(sensorId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().delete(
    "sensor_id",
    DeleteSensorsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sensorId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sensors.queryLegacy(request) -> SyncPagingIterable&amp;lt;SensorSorItemResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().queryLegacy(
    SensorSorQueryRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `SensorSorQueryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sensors.query(request) -> SyncPagingIterable&amp;lt;SensorSorItemResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

⚠️ **DEPRECATED**: This endpoint will be removed after April 13, 2026.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sensors().query(
    SensorSorQueryRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `SensorSorQueryRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Models
<details><summary><code>client.models.retrieve(modelId) -> SensorSorModel</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().retrieve(
    "model_id",
    RetrieveModelsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.delete(modelId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().delete(
    "model_id",
    DeleteModelsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.list() -> List&amp;lt;SensorSorModel&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.update(request) -> UpdateModelsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().update(
    Arrays.asList(
        SensorSorModel
            .builder()
            .name("loan application")
            .source("azure")
            .build()
    )
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `List<SensorSorModel>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Access Users
<details><summary><code>client.access.users.list() -> SyncPagingIterable&amp;lt;User&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the list of users belonging to the authenticated user's tenant. Use the `cursor` parameter to navigate through pages of results. Replaces the deprecated `GET /api/v2/users` endpoint.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.access().users().list(
    ListUsersRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by email or created_at, ascending (+ or no prefix) or descending (-). Ignored when a cursor is supplied — the cursor preserves the sort from the page it was issued on.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Access Permissions
<details><summary><code>client.access.permissions.list() -> ListPermissionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns permissions grouped by platform area, ready for rendering in a UI permission selector.

Use this endpoint when building interfaces that let users choose permissions — for example,
an API key creation modal. Each area group represents a platform capability (such as **AI Portfolio**
or **Runtime Security**) and contains the individual permission area elements — and the permissions
available on each — within it.

If you need a flat list of all permissions, use
[`GET /api/v2/permissions`](#operation/list_permissions_api_v2_permissions_get) instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.access().permissions().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Access Tokens
<details><summary><code>client.access.tokens.shortLived() -> ShortLivedTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Exchange a valid user access token for a short-lived JWT with minimal scopes. This endpoint is suitable for scenarios where a long-lived or broad-scope token is inappropriate. A typical use case is authenticating WebSocket connections, where the token may be passed via query parameters.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.access().tokens().shortLived();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Assets
<details><summary><code>client.assetInventory.assets.listV1() -> ListV1AssetsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().listV1(
    ListV1AssetsRequest
        .builder()
        .sort("+discovered_at")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**provider:** `Optional<ListV1AssetsRequestProvider>` — Filter by service provider (providers are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**accountId:** `Optional<ListV1AssetsRequestAccountId>` — Filter by account ID
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<ListV1AssetsRequestRegion>` — Filter by region
    
</dd>
</dl>

<dl>
<dd>

**service:** `Optional<ListV1AssetsRequestService>` — Filter by service (services are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**assetType:** `Optional<ListV1AssetsRequestAssetType>` — Filter by asset type
    
</dd>
</dl>

<dl>
<dd>

**isPublic:** `Optional<ListV1AssetsRequestIsPublic>` — Filter by public status
    
</dd>
</dl>

<dl>
<dd>

**isRetrievable:** `Optional<ListV1AssetsRequestIsRetrievable>` — Filter by retrievability status
    
</dd>
</dl>

<dl>
<dd>

**hlResourceType:** `Optional<ListV1AssetsRequestHlResourceType>` — Filter by AI Asset being linked to a HiddenLayer resource
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<ListV1AssetsRequestPolicyStatus>` — Filter by policy status
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `Optional<TagNameFilter>` — Filter by tag name regardless of source. Matches across both custom and discovered tags.
    
</dd>
</dl>

<dl>
<dd>

**tagDef:** `Optional<TagDefFilter>` — Filter by tag definition (source + name). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag names by source.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<TagValueFilter>` — Filter by tag (source + name + value). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag name/value pairs by source.
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<Embed>` — Sub-resources to include in the response
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by discovery timestamp or last sync time, ascending (+) or the default descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.getV1(assetId) -> AiAsset</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().getV1(
    "asset_id",
    GetV1AssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the AI asset
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<Embed>` — Sub-resources to include in the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.graph(assetId) -> AiAssetInventoryV1AssetGraphNode</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().graph(
    "asset_id",
    GraphAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the root AI asset
    
</dd>
</dl>

<dl>
<dd>

**depth:** `Optional<Integer>` — The depth of the graph to return
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.filtersV1() -> FiltersV1AssetsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the available filter fields and their values. Tag names are included as a filter field.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().filtersV1();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.tagsV1(assetId) -> AiAssetInventoryV1AssetTagMap</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns all custom and discovered tags assigned to the given asset.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().tagsV1(
    "asset_id",
    TagsV1AssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the AI asset
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.list() -> SyncPagingIterable&amp;lt;Asset&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Search and list the AI assets in your inventory. Provide a
full-text search query with `q`, and optionally narrow the
results with the available filters such as provider, cloud
account, region, service, asset type, policy status, tags
(`tag_name`, `tag_def`, and `tag`), relationship to another
asset (`related_to`), membership in a project (`project_id`),
and — for MODEL assets — the model id
(`model_id`), model name (`model_name`), or the latest scan's
start time (`scan_started_at`).
Results are returned in cursor-paginated pages of `page_size`
items; follow the `next` cursor to retrieve subsequent pages.
See the `sort` parameter for available sort fields. Filtering by
`project_id` or embedding `projects` additionally requires the
`project:read` scope.

To discover the filterable fields and their available values for
your tenant, call
[`GET /asset-inventory/v2/assets/filters`](/api/assets-and-integrations/ai-asset-inventory/v2/ai-asset-inventory/inventory/get_ai_asset_filters_v2).

The underlying query runs under a configurable server-side
statement timeout. A filter or sort combination expensive
enough to exceed it — typically an arbitrary-attribute filter or
sort over a very large tenant — receives `422 Unprocessable
Entity` with a "query exceeds allowed cost/time limit" message
suggesting index-backed sort fields to retry with.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().list(
    ListAssetsRequest
        .builder()
        .pageSize(50)
        .sort("-created_at")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `Optional<String>` — Search query string
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>

<dl>
<dd>

**annotatingService:** `Optional<ListAssetsRequestAnnotatingService>` 

Filter by annotating service; returns only assets that carry at least one
annotation from the given service(s). Multiple values are OR'ed.
The annotating service is a free-form identifier (for example, `discovery`).

When sorting by an annotation attribute (`sort=attributes.*`), this
parameter must specify exactly one service.
    
</dd>
</dl>

<dl>
<dd>

**attributes:** `Optional<Map<String, AttributeCondition>>` 

Filter by annotation attributes. Each key is a dotted path
into an annotation's `attributes` map (for example, `provider`
or `configuration.model.layers`); its value is a set of
comparison operators (`eq`, `in`, `gt`, `gte`, `lt`, `lte`,
`contains`) applied to the value at that path. Attribute names
and paths are not fixed by this API — any attribute a
contributing service records can be filtered on.

All conditions are combined with AND: across different paths,
and across multiple operators on the same path (so `gte` and
`lte` together form a range). The only OR available is `in`,
which matches a single path against any of several values;
there is no OR or grouping across different paths.

Serialized as a deepObject. A scalar operator carries a single
value (for example, `attributes[configuration.model.layers][gte]=5`),
while `in` carries a comma-separated list (for example,
`attributes[provider][in]=AWS,AZURE`).
    
</dd>
</dl>

<dl>
<dd>

**assetType:** `Optional<ListAssetsRequestAssetType>` — Filter by asset type (free-form string); multiple values are OR'ed
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<ListAssetsRequestPolicyStatus>` — Filter by policy status
    
</dd>
</dl>

<dl>
<dd>

**scanStartedAt:** `Optional<ListAssetsRequestScanStartedAt>` 

Filter MODEL assets by the start time of their latest
supply-chain scan. Combine a `gt`/`gte` bound with a
`lt`/`lte` bound to express a range. Assets with no
supply-chain scan data are excluded when this filter is
applied.

This is the indexed, purpose-built filter for scan start
time — prefer it over the equivalent
`attributes[latest_scan.start_time]` path on the generic
`attributes` filter, which reaches the same data without
index support.
    
</dd>
</dl>

<dl>
<dd>

**modelId:** `Optional<ListAssetsRequestModelId>` 

Filter MODEL assets by the model id assigned by the scanning
pipeline (the supply-chain annotation's own identifier, returned
as that annotation's `key`). Assets with no supply-chain scan
data are excluded when this filter is applied.
    
</dd>
</dl>

<dl>
<dd>

**modelName:** `Optional<ListAssetsRequestModelName>` 

Filter MODEL assets by the name reported by their latest
supply-chain scan. Use `eq` for an exact match or `contains`
for a substring match. Assets with no supply-chain scan data
are excluded when this filter is applied.

This is the indexed, purpose-built filter for model name —
prefer it over the equivalent
`attributes[model_card.name]` path on the generic `attributes`
filter, whose `contains` is not index-backed.
    
</dd>
</dl>

<dl>
<dd>

**relatedTo:** `Optional<ListAssetsRequestRelatedTo>` 

Filter to assets directly related to the given asset. An asset
matches when a relationship connects it to the given asset ID,
in either direction (as source or target). Only direct
(one-hop) relationships are considered.
    
</dd>
</dl>

<dl>
<dd>

**projectId:** `Optional<ListAssetsRequestProjectId>` 

Filter to the members of one project. Requires the `project:read`
scope in addition to `asset:read`. A project with no members, or
one inventory has never seen, matches nothing.
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `Optional<TagNameFilter>` — Filter by tag name regardless of source. Matches across both custom and discovered tags.
    
</dd>
</dl>

<dl>
<dd>

**tagDef:** `Optional<TagDefFilter>` — Filter by tag definition (source + name). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag names by source.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<TagValueFilter>` — Filter by tag (source + name + value). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag name/value pairs by source.
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` 

Sort by field, ascending (+) or descending (-).

Sort on a top-level field (`created_at`, `updated_at`,
`first_synced_at`, `asset_type`, `policy_status`) or on an annotation attribute by
prefixing a dotted path into the `attributes` map with
`attributes.` — for example, `attributes.provider` or
`attributes.configuration.model.layers`. This mirrors the
`attributes` filter: the same dotted paths that can be filtered
on can also be sorted on. Attribute names and paths are not
fixed by this API, so the set of sortable paths grows with your
data; attribute values are ordered as strings.

For the supply-chain view (`annotating_service[in]=supply-chain`),
`attributes.scan_started_at` and `attributes.model_name` are
curated field names, not literal attribute paths — they resolve
to that annotation's `latest_scan.start_time` and
`model_card.name` respectively.

Ordering semantics: an asset whose annotation does not carry
the sorted attribute is still returned — the missing value
sorts as the empty string, placing the asset first ascending
and last descending. Assets with equal sort values are
ordered by asset `id` ascending, so the overall order (and
cursor pagination over it) is deterministic.

Sorting by an annotation attribute (`attributes.*`) requires
`annotating_service[in]` to specify **exactly one** service. An
asset can carry annotations from multiple services, each with its
own `attributes` map; without a single-service constraint the sort
key is ambiguous. Requests that combine an `attributes.*` sort with
zero or multiple annotating services are rejected with
`422 Unprocessable Entity`.

When `annotating_service[in]=supply-chain` and no `sort` is
given, results default to `attributes.scan_started_at`
descending (most recently scanned first).
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<ListAssetsRequestEmbedItem>` — Sub-resources to include in the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.suggestions() -> SuggestionsAssetsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Return typeahead suggestions for a partial search term, to help
build asset search queries as the user types. The same filters
available on the asset list endpoint can be applied to scope the
suggestions. Filtering by `project_id` additionally requires the
`project:read` scope.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().suggestions(
    SuggestionsAssetsRequest
        .builder()
        .q("q")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `String` — Prefix text to get suggestions for
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Maximum number of suggestions to return
    
</dd>
</dl>

<dl>
<dd>

**annotatingService:** `Optional<SuggestionsAssetsRequestAnnotatingService>` 

Filter by annotating service; returns only assets that carry at least one
annotation from the given service(s). Multiple values are OR'ed.
The annotating service is a free-form identifier (for example, `discovery`).
    
</dd>
</dl>

<dl>
<dd>

**attributes:** `Optional<Map<String, AttributeCondition>>` 

Filter by annotation attributes. Each key is a dotted path
into an annotation's `attributes` map (for example, `provider`
or `configuration.model.layers`); its value is a set of
comparison operators (`eq`, `in`, `gt`, `gte`, `lt`, `lte`,
`contains`) applied to the value at that path. Attribute names
and paths are not fixed by this API — any attribute a
contributing service records can be filtered on.

All conditions are combined with AND: across different paths,
and across multiple operators on the same path (so `gte` and
`lte` together form a range). The only OR available is `in`,
which matches a single path against any of several values;
there is no OR or grouping across different paths.

Serialized as a deepObject. A scalar operator carries a single
value (for example, `attributes[configuration.model.layers][gte]=5`),
while `in` carries a comma-separated list (for example,
`attributes[provider][in]=AWS,AZURE`).
    
</dd>
</dl>

<dl>
<dd>

**assetType:** `Optional<SuggestionsAssetsRequestAssetType>` — Filter by asset type (free-form string); multiple values are OR'ed
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<SuggestionsAssetsRequestPolicyStatus>` — Filter by policy status
    
</dd>
</dl>

<dl>
<dd>

**scanStartedAt:** `Optional<SuggestionsAssetsRequestScanStartedAt>` 

Filter MODEL assets by the start time of their latest
supply-chain scan. Combine a `gt`/`gte` bound with a
`lt`/`lte` bound to express a range. Assets with no
supply-chain scan data are excluded when this filter is
applied.

This is the indexed, purpose-built filter for scan start
time — prefer it over the equivalent
`attributes[latest_scan.start_time]` path on the generic
`attributes` filter, which reaches the same data without
index support.
    
</dd>
</dl>

<dl>
<dd>

**modelId:** `Optional<SuggestionsAssetsRequestModelId>` 

Filter MODEL assets by the model id assigned by the scanning
pipeline (the supply-chain annotation's own identifier, returned
as that annotation's `key`). Assets with no supply-chain scan
data are excluded when this filter is applied.
    
</dd>
</dl>

<dl>
<dd>

**modelName:** `Optional<SuggestionsAssetsRequestModelName>` 

Filter MODEL assets by the name reported by their latest
supply-chain scan. Use `eq` for an exact match or `contains`
for a substring match. Assets with no supply-chain scan data
are excluded when this filter is applied.

This is the indexed, purpose-built filter for model name —
prefer it over the equivalent
`attributes[model_card.name]` path on the generic `attributes`
filter, whose `contains` is not index-backed.
    
</dd>
</dl>

<dl>
<dd>

**relatedTo:** `Optional<SuggestionsAssetsRequestRelatedTo>` 

Filter to assets directly related to the given asset. An asset
matches when a relationship connects it to the given asset ID,
in either direction (as source or target). Only direct
(one-hop) relationships are considered.
    
</dd>
</dl>

<dl>
<dd>

**projectId:** `Optional<SuggestionsAssetsRequestProjectId>` 

Filter to the members of one project. Requires the `project:read`
scope in addition to `asset:read`. A project with no members, or
one inventory has never seen, matches nothing.
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `Optional<TagNameFilter>` — Filter by tag name regardless of source. Matches across both custom and discovered tags.
    
</dd>
</dl>

<dl>
<dd>

**tagDef:** `Optional<TagDefFilter>` — Filter by tag definition (source + name). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag names by source.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<TagValueFilter>` — Filter by tag (source + name + value). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag name/value pairs by source.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.filters() -> FilterFacetsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Return the filterable fields of the
[asset list endpoint](/api/assets-and-integrations/ai-asset-inventory/v2/ai-asset-inventory/inventory/list_ai_assets_v2)
together with their available values for your tenant, for
building a filter UI. Each facet identifies the exact list
filter it maps to: apply a selection by sending the facet's
`param` with the chosen `values` to
`GET /asset-inventory/v2/assets` — no field-name translation
layer required.

- **Unscoped** (no parameters) — returns the service-independent
  facets: `asset_type`, `policy_status`, and
  `annotating_service`. The `annotating_service` facet lists the
  services that have annotated assets in your tenant, so it
  doubles as the bootstrap for the scoped call.
- **Scoped** (`annotating_service[eq]` naming one service) —
  additionally returns that service's annotation attribute
  facets (for example, `attributes.provider` for the `discovery`
  service), with values enumerated from that service's
  annotations only. The attribute facets a service exposes are
  server-defined and evolve as annotating services register
  them; a service exposing none returns just the
  service-independent facets.
- The scope takes the scalar `[eq]` operator because it is a
  single service; the list endpoint's many-valued
  `annotating_service[in]` filter form is rejected here with
  `422 Unprocessable Entity`. (An `annotating_service` facet
  selection still round-trips to the list endpoint via `[in]`,
  as its `param` states.)
- **Project** (`project_id[eq]`) — limits every facet's values to
  the project's members. Requires the `project:read` scope in
  addition to `asset:read`.

The underlying query runs under a configurable server-side
statement timeout; a tenant whose data exceeds it receives
`422 Unprocessable Entity` with a
"query exceeds allowed cost/time limit" message rather than an
unbounded query.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().filters(
    FiltersAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**annotatingService:** `Optional<FiltersAssetsRequestAnnotatingService>` 

Scope the facets to a single annotating service: the
response additionally includes that service's annotation
attribute facets. The scope is one service, so it takes the
scalar `[eq]` operator (`annotating_service[eq]=discovery`);
the list endpoint's many-valued `[in]` form is rejected
with `422 Unprocessable Entity`. Omit to receive only the
service-independent facets.

This and `project_id` are the only parameters the endpoint
honors. Other list endpoint filter parameters are accepted
for wire compatibility but do not narrow the facet values
(malformed ones are still rejected with
`422 Unprocessable Entity`).
    
</dd>
</dl>

<dl>
<dd>

**projectId:** `Optional<FiltersAssetsRequestProjectId>` 

Filter to the members of one project. Requires the `project:read`
scope in addition to `asset:read`. A project with no members, or
one inventory has never seen, matches nothing.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.get(assetId) -> Asset</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Retrieve a single asset by its unique ID. The response contains
the full asset, including its creation and last-updated
timestamps and its current set of annotations. Each annotation
carries its `annotating_service` and an `attributes` property
map holding the details that service observed.

Embedding `projects` additionally requires the `project:read` scope.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().get(
    "asset_id",
    GetAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The server-assigned UUID of the asset.
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<GetAssetsRequestEmbedItem>` — Sub-resources to include in the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.discoveredGraph(assetId) -> AssetGraphNode</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Retrieve the relationship graph for an AI asset, starting from that
asset and following its relationships to the assets it connects to.
Use this to show how an asset relates to others — for example, the
models an endpoint serves, or the assets derived from a given model.

The asset is identified by its `asset_id`. The response is a tree
rooted at that asset: each node lists its outgoing `relationships`,
and each relationship gives its `relationship_type`, optional
`metadata`, and the target `asset` it points to. Only outgoing
relationships are followed, and traversal stops once `depth` levels
have been reached.

Requires the `asset:read` scope.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().discoveredGraph(
    "asset_id",
    DiscoveredGraphAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The server-assigned UUID of the asset at the root of the graph.
    
</dd>
</dl>

<dl>
<dd>

**depth:** `Optional<Integer>` 

Maximum number of outbound hops to traverse from the root
asset.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.tags(assetId) -> AssetTagMap</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns all custom and discovered tags assigned to the given asset.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().tags(
    "asset_id",
    TagsAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The server-assigned UUID of the asset.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Relationships
<details><summary><code>client.assetInventory.relationships.get(relationshipId) -> AiAssetInventoryV1AssetRelationship</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().relationships().get(
    "relationship_id",
    GetRelationshipsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**relationshipId:** `String` — The ID of the AI asset relationship
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Metrics
<details><summary><code>client.assetInventory.metrics.providerCountsV1() -> AiAssetInventoryV1ProviderCounts</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().providerCountsV1();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.metrics.regionCountsV1() -> AiAssetInventoryV1RegionCounts</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().regionCountsV1();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.metrics.assetTypeCountsV1() -> AiAssetInventoryV1AssetTypeCounts</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().assetTypeCountsV1();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.metrics.providerCounts() -> ProviderCounts</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Return the number of AI assets in your inventory grouped by
cloud provider (for example, AWS, Azure, GCP, and Databricks).
Assets from providers outside this set are counted under
`other`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().providerCounts();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.metrics.regionCounts() -> RegionCounts</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Return the number of AI assets in your inventory grouped by
geographic location, broken down both by country and by
higher-level geographic region (for example, North America or
Europe).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().regionCounts();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.metrics.assetTypeCounts() -> Map&amp;lt;String, Integer&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Return the number of AI assets in your inventory grouped by
asset type (for example, model, endpoint, or agent).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().metrics().assetTypeCounts();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Resources
<details><summary><code>client.assetInventory.resources.list() -> SyncPagingIterable&amp;lt;ListResourcesResponseItemsItem&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().resources().list(
    ListResourcesRequest
        .builder()
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<ListResourcesRequestType>` — The type of HiddenLayer resource
    
</dd>
</dl>

<dl>
<dd>

**resourceId:** `Optional<ListResourcesRequestResourceId>` — The ID of the HiddenLayer resource
    
</dd>
</dl>

<dl>
<dd>

**linkedAt:** `Optional<ListResourcesRequestLinkedAt>` — The datetime when the HiddenLayer resource was linked to the AI asset
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — The field to sort by
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Scans
<details><summary><code>client.assetInventory.scans.get(scanId) -> AssetScan</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().scans().get(
    "00000000-0000-0000-0000-000000000000",
    GetScansRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Tags
<details><summary><code>client.assetInventory.tags.listV1() -> SyncPagingIterable&amp;lt;AiAssetInventoryV1TagDefinition&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of tag definitions. Optionally filter by source.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().tags().listV1(
    ListV1TagsRequest
        .builder()
        .sort("+name")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**source:** `Optional<ListV1TagsRequestSource>` — Filter by tag source
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag names
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +name for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.tags.list() -> SyncPagingIterable&amp;lt;TagDefinition&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns a cursor-paginated list of tag definitions. Optionally filter by source.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().tags().list(
    ListTagsRequest
        .builder()
        .sort("+name")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**source:** `Optional<ListTagsRequestSource>` — Filter by tag source.
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag names.
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +name for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory CustomTags
<details><summary><code>client.assetInventory.customTags.updateV1(tagName, request) -> AiAssetInventoryV1TagDefinition</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates a tag definition. Only the name can be changed at this time.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().customTags().updateV1(
    "tag_name",
    AiAssetInventoryV1TagDefinitionUpdate
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The current tag name
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — The new tag name
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.customTags.valuesV1(tagName) -> SyncPagingIterable&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of values for a given custom tag name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().customTags().valuesV1(
    "tag_name",
    ValuesV1CustomTagsRequest
        .builder()
        .sort("+value")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The custom tag name
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +value for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag values
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.customTags.update(tagName, request) -> TagDefinition</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Updates a tag definition. Only the name can be changed at this time.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().customTags().update(
    "tag_name",
    TagDefinitionUpdate
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The current tag name.
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — The new tag name.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.customTags.values(tagName) -> SyncPagingIterable&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns a cursor-paginated list of values for a given custom tag name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().customTags().values(
    "tag_name",
    ValuesCustomTagsRequest
        .builder()
        .sort("+value")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The custom tag name.
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +value for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag values.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory DiscoveredTags
<details><summary><code>client.assetInventory.discoveredTags.valuesV1(tagName) -> SyncPagingIterable&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of values for a given discovered tag name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().discoveredTags().valuesV1(
    "tag_name",
    ValuesV1DiscoveredTagsRequest
        .builder()
        .sort("+value")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The discovered tag name
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +value for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag values
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.discoveredTags.values(tagName) -> SyncPagingIterable&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns a cursor-paginated list of values for a given discovered tag name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().discoveredTags().values(
    "tag_name",
    ValuesDiscoveredTagsRequest
        .builder()
        .sort("+value")
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tagName:** `String` — The discovered tag name.
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by field, ascending (+) or descending (-). Defaults to +value for a stable alphabetical order.
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Prefix text to match against tag values.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Annotations
<details><summary><code>client.assetInventory.annotations.get(annotatingService, annotatingServiceKey) -> Asset</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Resolve an asset by the pair of `annotating_service` and that service's
`key`. Use this when the producer's identifier is known but the
server-generated asset ID is not.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().annotations().get(
    "annotating_service",
    "annotating_service_key",
    GetAnnotationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**annotatingService:** `String` 

The service that contributed the annotation used to resolve the asset.
Must be URL-encoded if it contains special characters.
    
</dd>
</dl>

<dl>
<dd>

**annotatingServiceKey:** `String` 

The contributing service's stable key for the asset. Must be
URL-encoded if it contains special characters, including `/`.
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<GetAnnotationsRequestEmbedItem>` — Sub-resources to include in the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Jobs
<details><summary><code>client.assetInventory.jobs.customTags(request) -> CustomTagsJobsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Apply a custom-tag change to every asset matching a filter in one request, instead of calling the single-asset tag endpoints once per asset. The `action` (`PUT` or `DELETE`) is applied to each matched asset exactly as `PUT /asset-inventory/v2/assets/{asset_id}/custom-tags/{tag_name}` or `DELETE /asset-inventory/v2/assets/{asset_id}/custom-tags/{tag_name}` would apply it.
The filter accepts the same criteria as `GET /asset-inventory/v2/assets`, so you can preview exactly which assets a job will touch by running that search first.
The request is processed synchronously: the response is the finished `Job`, always in a terminal state (`COMPLETED` or `FAILED`), with `matched_count`, `succeeded_count`, `failed_count`, and per-asset `failures[]` filled in. A filter that matches no assets returns `COMPLETED` with `matched_count: 0`. Jobs are not stored, so there is no job ID to poll — the response is the only report of the outcome.
A job matches at most 10,000 assets; a filter that would match more is rejected with `422 Unprocessable Entity`. Narrow the filter and retry.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().jobs().customTags(
    BulkCustomTagJobRequestV2
        .builder()
        .filter(
            BulkCustomTagJobRequestV2Filter
                .builder()
                .assets(
                    AssetFilterV2
                        .builder()
                        .assetType(
                            AssetFilterV2AssetType
                                .builder()
                                .in(
                                    Optional.of(
                                        Arrays.asList("MODEL", "ENDPOINT")
                                    )
                                )
                                .build()
                        )
                        .annotatingService(
                            AssetFilterV2AnnotatingService
                                .builder()
                                .in(
                                    Optional.of(
                                        Arrays.asList("discovery")
                                    )
                                )
                                .build()
                        )
                        .attributes(
                            new HashMap<String, AttributeCondition>() {{
                                put("provider", AttributeCondition
                                    .builder()
                                    .eq(Optional.of("AWS"))
                                    .build());
                                put("region", AttributeCondition
                                    .builder()
                                    .in(
                                        Optional.of(
                                            Arrays.asList("us-east-1", "eu-west-1")
                                        )
                                    )
                                    .build());
                            }}
                        )
                        .build()
                )
                .build()
        )
        .action(BulkCustomTagJobRequestV2Action.PUT)
        .body(
            BulkCustomTagJobRequestV2Body.of(
                new HashMap<String, String>() {{
                    put("team", "ml-platform");
                    put("environment", "production");
                    put("cost-center", "ai-inference");
                    put("managed-by", "terraform");
                    put("data-classification", "confidential");
                }}
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**filter:** `BulkCustomTagJobRequestV2Filter` — Filter criteria identifying the target assets.
    
</dd>
</dl>

<dl>
<dd>

**action:** `BulkCustomTagJobRequestV2Action` — Per-asset operation to perform. `PUT` applies `PUT /asset-inventory/v2/assets/{asset_id}/custom-tags/{tag_name}` to each matched asset; `DELETE` applies `DELETE /asset-inventory/v2/assets/{asset_id}/custom-tags/{tag_name}`.
    
</dd>
</dl>

<dl>
<dd>

**body:** `BulkCustomTagJobRequestV2Body` — Shape depends on `action`. For `PUT`: an object of custom tag name → value pairs to set on every matched asset (upsert semantics). For `DELETE`: an array of custom tag names to remove from every matched asset (tags not present on an asset are silently ignored).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Assets Search
<details><summary><code>client.assetInventory.assets.search.list() -> SyncPagingIterable&amp;lt;SearchResult&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().search().list(
    ListSearchRequest
        .builder()
        .q("q")
        .sort("+discovered_at")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `String` — Search query string
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Long>` — Maximum number of items to return
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` — Number of items to skip before starting to collect the result set
    
</dd>
</dl>

<dl>
<dd>

**banditArmOverride:** `Optional<Long>` — Optional bandit arm to force for this search
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<ListSearchRequestProvider>` — Filter by service provider (providers are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**accountId:** `Optional<ListSearchRequestAccountId>` — Filter by account ID
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<ListSearchRequestRegion>` — Filter by region
    
</dd>
</dl>

<dl>
<dd>

**service:** `Optional<ListSearchRequestService>` — Filter by service (services are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**assetType:** `Optional<ListSearchRequestAssetType>` — Filter by asset type
    
</dd>
</dl>

<dl>
<dd>

**isPublic:** `Optional<ListSearchRequestIsPublic>` — Filter by public status
    
</dd>
</dl>

<dl>
<dd>

**isRetrievable:** `Optional<ListSearchRequestIsRetrievable>` — Filter by retrievability status
    
</dd>
</dl>

<dl>
<dd>

**hlResourceType:** `Optional<ListSearchRequestHlResourceType>` — Filter by AI Asset being linked to a HiddenLayer resource
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<ListSearchRequestPolicyStatus>` — Filter by policy status
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `Optional<TagNameFilter>` — Filter by tag name regardless of source. Matches across both custom and discovered tags.
    
</dd>
</dl>

<dl>
<dd>

**tagDef:** `Optional<TagDefFilter>` — Filter by tag definition (source + name). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag names by source.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<TagValueFilter>` — Filter by tag (source + name + value). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag name/value pairs by source.
    
</dd>
</dl>

<dl>
<dd>

**embed:** `Optional<Embed>` — Sub-resources to include in the response
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by listed fields, ascending (+) or descending (-); multiple fields may be comma-separated
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.search.suggestions() -> SearchSuggestionsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().search().suggestions(
    SuggestionsSearchRequest
        .builder()
        .q("q")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `String` — Prefix text to get suggestions for
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Long>` — Maximum number of suggestions to return
    
</dd>
</dl>

<dl>
<dd>

**banditArmOverride:** `Optional<Long>` — Optional bandit arm to force for suggestions threshold
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<SuggestionsSearchRequestProvider>` — Filter by service provider (providers are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**accountId:** `Optional<SuggestionsSearchRequestAccountId>` — Filter by account ID
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<SuggestionsSearchRequestRegion>` — Filter by region
    
</dd>
</dl>

<dl>
<dd>

**service:** `Optional<SuggestionsSearchRequestService>` — Filter by service (services are OR'ed)
    
</dd>
</dl>

<dl>
<dd>

**assetType:** `Optional<SuggestionsSearchRequestAssetType>` — Filter by asset type
    
</dd>
</dl>

<dl>
<dd>

**isPublic:** `Optional<SuggestionsSearchRequestIsPublic>` — Filter by public status
    
</dd>
</dl>

<dl>
<dd>

**isRetrievable:** `Optional<SuggestionsSearchRequestIsRetrievable>` — Filter by retrievability status
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<SuggestionsSearchRequestPolicyStatus>` — Filter by policy status
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `Optional<TagNameFilter>` — Filter by tag name regardless of source. Matches across both custom and discovered tags.
    
</dd>
</dl>

<dl>
<dd>

**tagDef:** `Optional<TagDefFilter>` — Filter by tag definition (source + name). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag names by source.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<TagValueFilter>` — Filter by tag (source + name + value). The top-level operator (`in` or `all`) governs how all entries across sources are combined. Within each operator, use `custom` and/or `discovered` keys to specify tag name/value pairs by source.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AssetInventory Assets CustomTags
<details><summary><code>client.assetInventory.assets.customTags.updateV1(assetId, tagName, request) -> AiAssetInventoryV1TagValue</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Assigns a custom tag to an asset. If the tag already exists on the asset, its value is updated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().customTags().updateV1(
    "asset_id",
    "tag_name",
    UpdateV1CustomTagsRequest
        .builder()
        .body(
            AiAssetInventoryV1TagValue
                .builder()
                .value("value")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the AI asset
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `String` — The tag name
    
</dd>
</dl>

<dl>
<dd>

**request:** `AiAssetInventoryV1TagValue` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.customTags.deleteV1(assetId, tagName)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes a custom tag assignment from an asset.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().customTags().deleteV1(
    "asset_id",
    "tag_name",
    DeleteV1CustomTagsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the AI asset
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `String` — The tag name
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.customTags.update(assetId, tagName, request) -> TagValue</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Assigns a custom tag to an asset. If the tag already exists on the asset, its value is updated.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().customTags().update(
    "asset_id",
    "tag_name",
    UpdateCustomTagsRequest
        .builder()
        .body(
            TagValue
                .builder()
                .value("value")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The server-assigned UUID of the asset.
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `String` — The custom tag name.
    
</dd>
</dl>

<dl>
<dd>

**request:** `TagValue` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.assetInventory.assets.customTags.delete(assetId, tagName)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Removes a custom tag assignment from an asset.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.assetInventory().assets().customTags().delete(
    "asset_id",
    "tag_name",
    DeleteCustomTagsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The server-assigned UUID of the asset.
    
</dd>
</dl>

<dl>
<dd>

**tagName:** `String` — The custom tag name.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Audit Entries
<details><summary><code>client.audit.entries.list() -> SyncPagingIterable&amp;lt;AuditEntry&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns audit log entries for the tenant, sorted by time with the most recent first. Results can be filtered by time range, actor, role, action, and resource type, or searched by free text.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audit().entries().list(
    ListEntriesRequest
        .builder()
        .startTime(OffsetDateTime.parse("2025-05-27T00:00:00Z"))
        .endTime(OffsetDateTime.parse("2025-05-27T23:59:59Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTime:** `Optional<OffsetDateTime>` — Filter audit entries by time range
    
</dd>
</dl>

<dl>
<dd>

**endTime:** `Optional<OffsetDateTime>` — Filter audit entries by time range
    
</dd>
</dl>

<dl>
<dd>

**role:** `Optional<String>` — Filter audit entries by role
    
</dd>
</dl>

<dl>
<dd>

**action:** `Optional<String>` — Filter audit entries by action
    
</dd>
</dl>

<dl>
<dd>

**resourceType:** `Optional<String>` — Filter audit entries by resource_type
    
</dd>
</dl>

<dl>
<dd>

**actorType:** `Optional<ActorType>` — Filter audit entries by actor_type
    
</dd>
</dl>

<dl>
<dd>

**search:** `Optional<String>` — Search for audit entries by text (searches user, role, action, resource type)
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Audit ActivityTypes
<details><summary><code>client.audit.activityTypes.list() -> ActivityTypeList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the list of all auditable activity types. Use this to understand what actions are tracked and to build filters when querying audit entries.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audit().activityTypes().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Compliance Projects
<details><summary><code>client.compliance.projects.list() -> SyncPagingIterable&amp;lt;GetProjectItem&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().projects().list(
    ListProjectsRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `Optional<ListProjectsRequestName>` — filter by the name
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Default search parameter for general searching
    
</dd>
</dl>

<dl>
<dd>

**default_:** `Optional<String>` — Return only the default project for the querying tenant
    
</dd>
</dl>

<dl>
<dd>

**ruleSetId:** `Optional<ListProjectsRequestRuleSetId>` — filter by rule set ID
    
</dd>
</dl>

<dl>
<dd>

**policyId:** `Optional<ListProjectsRequestPolicyId>` — filter by policy ID
    
</dd>
</dl>

<dl>
<dd>

**policyPackId:** `Optional<ListProjectsRequestPolicyPackId>` — filter by policy pack ID
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by name or modified_at, ascending (+) or the default descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.projects.create(request) -> ProjectId</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the new project ID; retrieve the project by ID to read its settings.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().projects().create(
    CreateProjectsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.projects.get(id) -> GetProjectsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().projects().get(
    "00000000-0000-0000-0000-000000000000",
    GetProjectsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A project ID or alias in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.projects.update(id, request) -> ProjectId</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Updates an existing project and returns its ID; retrieve the project by ID to read its settings. A missing project returns 404.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().projects().update(
    "00000000-0000-0000-0000-000000000000",
    UpdateProjectsRequest
        .builder()
        .ifUnmodifiedSince("Sat, 29 Oct 1994 19:43:31 GMT")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A project ID or alias in the request URI
    
</dd>
</dl>

<dl>
<dd>

**ifUnmodifiedSince:** `Optional<String>` 

The "If-Unmodified-Since" header field makes the request method
conditional on the selected representation's last modification date
being earlier than or equal to the date provided in the field-value.
This field accomplishes the same purpose as If-Match for cases where
the user agent does not have an entity-tag for the representation.

https://www.rfc-editor.org/rfc/rfc7232.html#section-3.4
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.projects.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().projects().delete(
    "00000000-0000-0000-0000-000000000000",
    DeleteProjectsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Compliance RuleSets
<details><summary><code>client.compliance.ruleSets.list() -> SyncPagingIterable&amp;lt;GetRuleSetItem&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().list(
    ListRuleSetsRequest
        .builder()
        .limit(50)
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `Optional<ListRuleSetsRequestName>` — filter by the name
    
</dd>
</dl>

<dl>
<dd>

**q:** `Optional<String>` — Default search parameter for general searching
    
</dd>
</dl>

<dl>
<dd>

**feature:** `Optional<ListRuleSetsRequestFeature>` — Select cursor pagination for this endpoint. Required for cursor pagination while the legacy list response remains available.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Deprecated alias for `limit`; use `limit` instead.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by name, ascending (+) or the default descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.create(request) -> GetRuleSetItem</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().create(
    RuleSetDetails
        .builder()
        .name("name")
        .description("description")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `RuleSetDetails` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.get(id) -> GetRuleSetItem</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().get(
    "00000000-0000-0000-0000-000000000000",
    GetRuleSetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.update(id, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().update(
    "00000000-0000-0000-0000-000000000000",
    UpdateRuleSetsRequest
        .builder()
        .body(
            RuleSetDetails
                .builder()
                .name("name")
                .description("description")
                .build()
        )
        .ifUnmodifiedSince("Sat, 29 Oct 1994 19:43:31 GMT")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**ifUnmodifiedSince:** `Optional<String>` 

The "If-Unmodified-Since" header field makes the request method
conditional on the selected representation's last modification date
being earlier than or equal to the date provided in the field-value.
This field accomplishes the same purpose as If-Match for cases where
the user agent does not have an entity-tag for the representation.

https://www.rfc-editor.org/rfc/rfc7232.html#section-3.4
    
</dd>
</dl>

<dl>
<dd>

**request:** `RuleSetDetails` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().delete(
    "00000000-0000-0000-0000-000000000000",
    DeleteRuleSetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Compliance RuleSets Settings
<details><summary><code>client.compliance.ruleSets.settings.list() -> ListSettingsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().settings().list(
    ListSettingsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**category:** `Optional<ListSettingsRequestCategory>` — filter by settings category name as a query parameter
    
</dd>
</dl>

<dl>
<dd>

**overlay:** `Optional<String>` 

specify that settings response is enriched with a JSON schema that details the
constraints that apply for the entire object in the settings property
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.settings.create(id, request) -> SettingsId</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().settings().create(
    "00000000-0000-0000-0000-000000000000",
    CreateSettingsRequest
        .builder()
        .settingsId("settings_id")
        .settings(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.settings.get(id, settingsId) -> SettingsDetailsWithSchema</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().settings().get(
    "00000000-0000-0000-0000-000000000000",
    "00000000-0000-0000-0000-000000000000",
    GetSettingsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**settingsId:** `String` — A settings ID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**overlay:** `Optional<String>` 

specify that settings response is enriched with a JSON schema that details the
constraints that apply for the entire object in the settings property
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.settings.update(id, settingsId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().settings().update(
    "00000000-0000-0000-0000-000000000000",
    "00000000-0000-0000-0000-000000000000",
    UpdateSettingsRequest
        .builder()
        .body(
            Settings
                .builder()
                .settings(
                    new HashMap<String, Object>() {{
                        put("key", "value");
                    }}
                )
                .build()
        )
        .ifMatch("\"7da7a728-f910-11e6-942a-68f728c1ba70\"")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**settingsId:** `String` — A settings ID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**ifMatch:** `Optional<String>` 

The "If-Match" header field makes the request method conditional on
the recipient origin server either having at least one current
representation of the target resource, when the field-value is "*",
or having a current representation of the target resource that has an
entity-tag matching a member of the list of entity-tags provided in
the field-value.

https://www.rfc-editor.org/rfc/rfc7232.html#section-3.1
    
</dd>
</dl>

<dl>
<dd>

**request:** `Settings` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.compliance.ruleSets.settings.delete(id, settingsId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.compliance().ruleSets().settings().delete(
    "00000000-0000-0000-0000-000000000000",
    "00000000-0000-0000-0000-000000000000",
    DeleteSettingsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` — A UUID in the request URI
    
</dd>
</dl>

<dl>
<dd>

**settingsId:** `String` — A settings ID in the request URI
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Evaluations RedTeam
<details><summary><code>client.evaluations.redTeam.list() -> SyncPagingIterable&amp;lt;RedTeamResultItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

List completed red team workflow results with filtering and bidirectional pagination.

Results are ordered by completed_at DESC (newest first).
Returns metadata only - use GET /evaluations/v1/red-team/{workflow_id} for full payload.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().list(
    ListRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**targetModel:** `Optional<String>` — Filter by target model
    
</dd>
</dl>

<dl>
<dd>

**workflowType:** `Optional<String>` — Filter by workflow type
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<String>` — Filter by workflow status
    
</dd>
</dl>

<dl>
<dd>

**startTimeFrom:** `Optional<OffsetDateTime>` — Filter for results started after this time
    
</dd>
</dl>

<dl>
<dd>

**startTimeTo:** `Optional<OffsetDateTime>` — Filter for results started before this time
    
</dd>
</dl>

<dl>
<dd>

**projectId:** `Optional<ListRedTeamRequestProjectId>` 

Filter to evaluations started under any of the given HiddenLayer
projects. Evaluations without a project never match.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Maximum number of results to return
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Deprecated alias for `limit`. Use `limit` instead. Will be removed after SDK regen.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Pagination cursor from previous response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.create(request) -> StartWorkflowResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Start a new red team client workflow.
Auto-triggers planning phase. Client should then poll /next-action.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().create(
    ClientRedTeamBody
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` — Name for this evaluation
    
</dd>
</dl>

<dl>
<dd>

**configId:** `Optional<String>` 

Optional preset config (see /evaluations/v1/red-team/configs) to seed the
workflow settings. Any field also present in this body overrides the
corresponding value from the config.
    
</dd>
</dl>

<dl>
<dd>

**targetModel:** `Optional<String>` 

Target model identifier. Freeform for the client-driven workflow: the
client owns and drives its own target, so this is NOT validated against
the servable-model catalog. (The simulated start and config presets do
validate against the catalog.)
    
</dd>
</dl>

<dl>
<dd>

**targetSystemPrompt:** `Optional<String>` — System prompt for the target
    
</dd>
</dl>

<dl>
<dd>

**objectiveIds:** `Optional<List<String>>` — Objective IDs to evaluate
    
</dd>
</dl>

<dl>
<dd>

**severityMapping:** `Optional<Map<String, HighestSeverity>>` 
    
</dd>
</dl>

<dl>
<dd>

**executionStrategyType:** `Optional<ClientRedTeamBodyExecutionStrategyType>` — Execution strategy type
    
</dd>
</dl>

<dl>
<dd>

**nRandomTechniques:** `Optional<Integer>` — Number of random techniques to use
    
</dd>
</dl>

<dl>
<dd>

**maxParallelTechniques:** `Optional<Integer>` — Maximum parallel techniques
    
</dd>
</dl>

<dl>
<dd>

**maxTurns:** `Optional<Integer>` — Maximum conversation turns
    
</dd>
</dl>

<dl>
<dd>

**attackerMaxGenerationAttempts:** `Optional<Integer>` 

Internal override; service default applies if omitted. Maximum number of
generation attempts for the attacker model per turn.
    
</dd>
</dl>

<dl>
<dd>

**refusalJudgeModel:** `Optional<String>` — Internal override; service default applies if omitted.
    
</dd>
</dl>

<dl>
<dd>

**objectiveJudgeModel:** `Optional<String>` — Internal override; service default applies if omitted.
    
</dd>
</dl>

<dl>
<dd>

**evaluationReportModel:** `Optional<String>` — Internal override; service default applies if omitted.
    
</dd>
</dl>

<dl>
<dd>

**attackerModel:** `Optional<String>` — Internal override; service default applies if omitted.
    
</dd>
</dl>

<dl>
<dd>

**hlProjectId:** `Optional<String>` — HiddenLayer project UUID or alias
    
</dd>
</dl>

<dl>
<dd>

**promptSetId:** `Optional<String>` — Prompt set UUID (built-in catalog or tenant DB)
    
</dd>
</dl>

<dl>
<dd>

**sessionsPerTechnique:** `Optional<Integer>` — Number of sessions per technique
    
</dd>
</dl>

<dl>
<dd>

**attackerGuidance:** `Optional<String>` 

Optional intent-only natural-language text the operator supplies to
focus the attacker LLM within the configured APE objectives. Example:
"try to get the model to recommend candy with nuts to a user who's
allergic to nuts."

Sanitized server-side: input is NFKC-normalized, trimmed, and
checked against a strict character whitelist (ASCII letters, digits,
spaces/newlines/tabs, and sentence-level punctuation `. , ? ! ' " - : ; ( )`).
Inputs containing XML/JSON/code/control/markdown characters are
rejected with 422.

No-op for the `STATIC_PROMPT_SET` execution strategy.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.retrieveStatus(workflowId) -> WorkflowStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Get current status of a red team workflow.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().retrieveStatus(
    "workflow_id",
    RetrieveStatusRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.retrieveNextAction(workflowId) -> NextActionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Poll for next action - CLIENT'S MAIN POLLING ENDPOINT.

This endpoint is designed to be polled repeatedly by the client.
Returns immediately with current state:
- If attack ready: Returns attack_task with prompt
- If processing: Returns processing=true (client continues polling)
- If complete: Returns action_type=complete
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().retrieveNextAction(
    "workflow_id",
    RetrieveNextActionRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.submitTargetResponse(workflowId, request) -> SubmitTargetResponseResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Submit target's response.

This triggers the ProcessTargetResponseWorkflow child workflow
for the specified session. Returns immediately.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().submitTargetResponse(
    "workflow_id",
    SubmitTargetResponseBody
        .builder()
        .sessionId("session_id")
        .targetResponse("target_response")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>

<dl>
<dd>

**sessionId:** `String` — Session identifier
    
</dd>
</dl>

<dl>
<dd>

**targetResponse:** `String` — Target's response text
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.retrieveEvaluationResults(workflowId) -> WorkflowResultResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Get the complete result of a red team workflow.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().retrieveEvaluationResults(
    "workflow_id",
    RetrieveEvaluationResultsRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.delete(workflowId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Delete a red team workflow result from storage.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().delete(
    "workflow_id",
    DeleteRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.terminate(workflowId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Terminate a running workflow job.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().terminate(
    "workflow_id",
    TerminateRedTeamRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The workflow identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Evaluations RedTeam RuleSuggestions
<details><summary><code>client.evaluations.redTeam.ruleSuggestions.list(workflowId) -> SyncPagingIterable&amp;lt;RuleSuggestionListItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

List rule suggestion runs generated for a red team evaluation, newest first.

Each run is independent - triggering a new run does not replace or affect prior runs.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().ruleSuggestions().list(
    "workflow_id",
    ListRuleSuggestionsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The source red team evaluation's workflow identifier
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Maximum number of results to return
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Pagination cursor from previous response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.ruleSuggestions.create(workflowId, request) -> StartRuleSuggestionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Start a new rule suggestion run for a completed red team evaluation. Analyzes the
evaluation's successful attacks and generates a detection rule suggestion that can be
reviewed and added to a project's runtime security policy.

Callable multiple times for the same evaluation; each call starts an independent run.
The response's `suggestion_id` identifies the new run - use it in the status, result,
and list endpoints (the `{workflow_id}` path segment continues to identify the source
red team evaluation). Client should poll /status, then fetch the full result once
complete.

An empty JSON object `{}` is the minimal valid request body.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().ruleSuggestions().create(
    "workflow_id",
    StartRuleSuggestionBody
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The source red team evaluation's workflow identifier
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Optional name for this rule suggestion run. When omitted, the server derives one from the source evaluation (e.g. "Rule suggestions for {evaluation name}").
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.ruleSuggestions.status(workflowId, suggestionId) -> RuleSuggestionStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Get current status of a rule suggestion run (polling endpoint).
Returns immediately with current state.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().ruleSuggestions().status(
    "workflow_id",
    "suggestion_id",
    StatusRuleSuggestionsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The source red team evaluation's workflow identifier
    
</dd>
</dl>

<dl>
<dd>

**suggestionId:** `String` — The rule suggestion run identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.evaluations.redTeam.ruleSuggestions.get(workflowId, suggestionId) -> RuleSuggestionResultResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Get the complete result of a rule suggestion run, including any generated rules.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.evaluations().redTeam().ruleSuggestions().get(
    "workflow_id",
    "suggestion_id",
    GetRuleSuggestionsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**workflowId:** `String` — The source red team evaluation's workflow identifier
    
</dd>
</dl>

<dl>
<dd>

**suggestionId:** `String` — The rule suggestion run identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance Evaluations
<details><summary><code>client.governance.evaluations.list() -> Map&amp;lt;String, EvaluationResult&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve the governance evaluation results for multiple artifacts by their unique identifiers.
Each artifact will have a corresponding status to indicate whether evaluation results exist for that ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().evaluations().list(
    ListEvaluationsRequest
        .builder()
        .artifactIds(
            Arrays.asList("artifact_ids")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**artifactIds:** `Optional<String>` — list of unique artifact identifiers to retrieve evaluation results for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.evaluations.get(artifactId) -> EvaluationResult</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve the governance evaluation results for a specific artifact by its unique identifier.
The response includes whether the artifact is compliant with the defined policies and an explanation of the evaluation.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().evaluations().get(
    "artifact_id",
    GetEvaluationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**artifactId:** `String` — Unique identifier for the artifact to retrieve evaluation results for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance Licenses
<details><summary><code>client.governance.licenses.list() -> ListLicensesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns every license value a `license` condition accepts, including `unknown` and `custom`
alongside the named licenses. Rules store each license's `id`; `name` is for display only.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().licenses().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance RuleSets
<details><summary><code>client.governance.ruleSets.list() -> SyncPagingIterable&amp;lt;RuleSet&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve a list of rule sets that can be used to evaluate artifacts against governance policies.
This endpoint supports pagination with the `page_size` and `cursor` parameters.
Rule sets are ordered by their creation time, with the oldest rule sets listed first.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().list(
    ListRuleSetsRequest
        .builder()
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**includeDisabled:** `Optional<Boolean>` — When `true`, each returned rule set's `rules` includes disabled rules alongside enabled ones. Defaults to `false`, which returns only enabled rules.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.ruleSets.create(request) -> RuleSet</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a new rule set for evaluating artifacts against governance policies.
Rule sets can contain multiple rules, each with a set of conditions to evaluate.
This endpoint allows you to create a new set of rules with their compliance criteria.
Order matters; later rules may override earlier ones. Each rule's `is_disabled` value is
honored as submitted, so a rule set can be created with some of its rules already disabled.

When `replace_active_policy` is `true`, creating a rule set also disables whichever
custom rule set is currently enabled for the tenant, so the newly created rule set
becomes the tenant's sole active custom policy. The default rule set is never disabled
by this operation.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().create(
    CreateRuleSetsRequest
        .builder()
        .body(
            RuleSet
                .builder()
                .displayName("display_name")
                .rules(
                    Arrays.asList(
                        Rule
                            .builder()
                            .isCompliantWhenConditionsMet(true)
                            .conditions(
                                Arrays.asList(
                                    Condition
                                        .builder()
                                        .field("field")
                                        .conditionOperator(ConditionConditionOperator.EQUALS)
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**replaceActivePolicy:** `Optional<Boolean>` — When `true`, disables the tenant's currently active custom rule set as part of creating this one, so this rule set becomes the tenant's sole active custom policy. Defaults to `false`, which leaves any currently active custom rule set untouched.
    
</dd>
</dl>

<dl>
<dd>

**request:** `RuleSet` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.ruleSets.get(ruleSetId) -> RuleSet</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve a specific rule set by its unique identifier. This endpoint returns the details of the rule set, including its rules and compliance criteria.
The response includes the rule set's ID, display name, and the list of rules it contains.
If the rule set does not exist, a 404 Not Found error is returned.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().get(
    "rule_set_id",
    GetRuleSetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**ruleSetId:** `String` — Unique identifier for the rule set to retrieve
    
</dd>
</dl>

<dl>
<dd>

**includeDisabled:** `Optional<Boolean>` — When `true`, the returned rule set's `rules` includes disabled rules alongside enabled ones. Defaults to `false`, which returns only enabled rules.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.ruleSets.delete(ruleSetId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a rule set by its unique identifier. This operation disables the rule set so it cannot be applied to artifacts during evaluation.
If the rule set does not exist, a 404 Not Found error is returned.
This operation is irreversible; once deleted, the rule set cannot be recovered.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().delete(
    "rule_set_id",
    DeleteRuleSetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**ruleSetId:** `String` — Unique identifier for the rule set to delete
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance PolicyPacks
<details><summary><code>client.governance.policyPacks.list() -> SyncPagingIterable&amp;lt;PolicyPackSummary&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Returns pack summaries without `settings` or `detection_rules`. To read those, get the policy pack by ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().list(
    ListPolicyPacksRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `Optional<String>` — Search policy pack name and description
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<ListPolicyPacksRequestType>` — Filter policy packs by type
    
</dd>
</dl>

<dl>
<dd>

**isEnabled:** `Optional<ListPolicyPacksRequestIsEnabled>` — Filter policy packs by whether at least one project in the tenant uses the pack
    
</dd>
</dl>

<dl>
<dd>

**detectionRuleId:** `Optional<ListPolicyPacksRequestDetectionRuleId>` — Filter to policy definitions or policy packs that reference detection rule(s)
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by name, ascending (+) or descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.policyPacks.create(request) -> PolicyPack</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

The pack must assign at least one detection rule through `rule_pack_ids` or `individual_rules`; otherwise returns 422.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().create(
    PolicyPackWriteRequest
        .builder()
        .name("name")
        .settings(
            Arrays.asList(
                PolicyPackWriteRequestSettingsItem
                    .builder()
                    .settingsId("settings_id")
                    .settings(
                        new HashMap<String, Object>() {{
                            put("key", "value");
                        }}
                    )
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `PolicyPackWriteRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.policyPacks.recommendations(request) -> PolicyPackRecommendation</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

To apply the recommendation, set the returned `id` as the project's `policy_pack_id`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().recommendations(
    PolicyPackRecommendationRequest
        .builder()
        .applicationType(PolicyPackApplicationType.GENERAL)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**applicationType:** `PolicyPackApplicationType` 
    
</dd>
</dl>

<dl>
<dd>

**exposure:** `Optional<PolicyPackApplicationExposure>` — Needed unless `application_type` is CODING_HARNESS, which ignores it; omitting it when needed returns 422. An empty string is the same as an omitted value.
    
</dd>
</dl>

<dl>
<dd>

**deploymentStage:** `Optional<PolicyPackDeploymentStage>` — Needed only when `application_type` is GENERAL and `exposure` is INTERNET_FACING, and ignored otherwise; omitting it when needed returns 422. An empty string is the same as an omitted value.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.policyPacks.get(policyPackId) -> PolicyPack</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().get(
    "policy_pack_id",
    GetPolicyPacksRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**policyPackId:** `String` — Unique identifier for the policy pack
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.policyPacks.update(policyPackId, request) -> PolicyPack</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Replaces the entire pack, including `settings`; omitted optional fields are cleared.
- **403** when the pack is HiddenLayer-authored; only custom packs can be modified.
- **422** when the pack would assign no detection rules.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().update(
    "policy_pack_id",
    UpdatePolicyPacksRequest
        .builder()
        .body(
            PolicyPackWriteRequest
                .builder()
                .name("name")
                .settings(
                    Arrays.asList(
                        PolicyPackWriteRequestSettingsItem
                            .builder()
                            .settingsId("settings_id")
                            .settings(
                                new HashMap<String, Object>() {{
                                    put("key", "value");
                                }}
                            )
                            .build()
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**policyPackId:** `String` — Unique identifier for the policy pack
    
</dd>
</dl>

<dl>
<dd>

**request:** `PolicyPackWriteRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.policyPacks.delete(policyPackId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Projects using the pack are moved to the pack assigned to the tenant's default project. The pack's policy, ruleset, and ruleset settings are also deleted unless another project or pack still references them.
Returns 403 when the pack is HiddenLayer-authored; only custom packs can be deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().policyPacks().delete(
    "policy_pack_id",
    DeletePolicyPacksRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**policyPackId:** `String` — Unique identifier for the policy pack
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance RulePacks
<details><summary><code>client.governance.rulePacks.list() -> SyncPagingIterable&amp;lt;RulePack&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().rulePacks().list(
    ListRulePacksRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `Optional<ListRulePacksRequestType>` — Filter rule packs by type
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — Sort by name, ascending (+) or descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Governance RuleSets Rules
<details><summary><code>client.governance.ruleSets.rules.create(ruleSetId, request) -> RuleSet</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Add a new rule to an existing rule set. This endpoint allows you to define a rule with its compliance criteria and conditions.
The new rule will be appended to the existing rules in the specified rule set.
If the rule set does not exist, a 404 Not Found error is returned.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().rules().create(
    "rule_set_id",
    CreateRulesRequest
        .builder()
        .body(
            Rule
                .builder()
                .isCompliantWhenConditionsMet(true)
                .conditions(
                    Arrays.asList(
                        Condition
                            .builder()
                            .field("field")
                            .conditionOperator(ConditionConditionOperator.EQUALS)
                            .build()
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**ruleSetId:** `String` — Unique identifier for the rule set to append the rule to
    
</dd>
</dl>

<dl>
<dd>

**request:** `Rule` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.ruleSets.rules.update(ruleSetId, ruleId, request) -> RuleSet</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Replace an existing rule in a rule set with a new definition. This endpoint allows you to update the compliance criteria and conditions of a rule, preserving
 the rule's order in the rule set. If the rule set or the rule does not exist, a 404 Not Found error is returned.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().rules().update(
    "rule_set_id",
    "rule_id",
    UpdateRulesRequest
        .builder()
        .body(
            Rule
                .builder()
                .isCompliantWhenConditionsMet(true)
                .conditions(
                    Arrays.asList(
                        Condition
                            .builder()
                            .field("field")
                            .conditionOperator(ConditionConditionOperator.EQUALS)
                            .build()
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**ruleSetId:** `String` — Unique identifier for the rule set to which the rule belongs
    
</dd>
</dl>

<dl>
<dd>

**ruleId:** `String` — Unique identifier for the rule to modify/replace
    
</dd>
</dl>

<dl>
<dd>

**request:** `Rule` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.governance.ruleSets.rules.delete(ruleSetId, ruleId) -> RuleSet</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Disable a rule in a rule set. This endpoint allows you to remove a rule. It will no longer affect artifact evaluations.
If the rule set or the rule does not exist, a 404 Not Found error is returned.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.governance().ruleSets().rules().delete(
    "rule_set_id",
    "rule_id",
    DeleteRulesRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**ruleSetId:** `String` — Unique identifier for the rule set to which the rule belongs
    
</dd>
</dl>

<dl>
<dd>

**ruleId:** `String` — Unique identifier for the rule to disable/remove
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Integrations Assets
<details><summary><code>client.integrations.assets.scans(assetId) -> AssetScanTriggerResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Triggers an on-demand retrieval and scan workflow for a discovered AI asset. This endpoint validates the asset exists and has a matching integration, then sends a message to initiate the asset retrieval and scanning process.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.integrations().assets().scans(
    "asset_id",
    ScansAssetsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**assetId:** `String` — The ID of the AI asset to scan
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Metrics TimeseriesInferences
<details><summary><code>client.metrics.timeseriesInferences.listV2() -> InferenceTimeseriesResponseV2</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesInferences().listV2(
    ListV2TimeseriesInferencesRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.metrics.timeseriesInferences.list() -> InferenceTimeseriesResponseV3</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesInferences().list(
    ListTimeseriesInferencesRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Metrics TimeseriesIncidents
<details><summary><code>client.metrics.timeseriesIncidents.listV2() -> IncidentTimeseriesResponseV2</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesIncidents().listV2(
    ListV2TimeseriesIncidentsRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.metrics.timeseriesIncidents.list() -> IncidentTimeseriesResponseV3</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesIncidents().list(
    ListTimeseriesIncidentsRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Metrics TimeseriesConvictions
<details><summary><code>client.metrics.timeseriesConvictions.listV2() -> IncidentTimeseriesResponseV2</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesConvictions().listV2(
    ListV2TimeseriesConvictionsRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.metrics.timeseriesConvictions.list() -> ConvictionTimeseriesResponseV3</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesConvictions().list(
    ListTimeseriesConvictionsRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Metrics TimeseriesScans
<details><summary><code>client.metrics.timeseriesScans.listV2() -> ScanTimeseriesResponseV2</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesScans().listV2(
    ListV2TimeseriesScansRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.metrics.timeseriesScans.list() -> ScanTimeseriesResponseV3</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.metrics().timeseriesScans().list(
    ListTimeseriesScansRequest
        .builder()
        .startTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .endTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**startTimestamp:** `OffsetDateTime` 

The point in time to start the time series. The specified time must be 90 days or less from the current time.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**endTimestamp:** `Optional<OffsetDateTime>` 

The point in time to end the time series. If not provided, the current time is used.

[ISO-8601](https://www.w3.org/TR/NOTE-datetime) formatted string.
    
</dd>
</dl>

<dl>
<dd>

**requesterId:** `Optional<String>` — Filters results to only inferences that are associated with the specified requester ID.
    
</dd>
</dl>

<dl>
<dd>

**binSize:** `Optional<ListTimeseriesScansRequestBinSize>` — Controls the granularity of the time series aggregation. If not provided, the bin size is determined using the date range.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Mitre Atlas Tactics
<details><summary><code>client.mitre.atlas.tactics.get(tacticId) -> MitreAtlasTacticV1</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.mitre().atlas().tactics().get(
    "AML.TA0001",
    GetTacticsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tacticId:** `String` — MITRE Atlas Tactic ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Mitre Atlas Techniques
<details><summary><code>client.mitre.atlas.techniques.get(techniqueId) -> GetTechniquesResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.mitre().atlas().techniques().get(
    "AML.T0043",
    GetTechniquesRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**techniqueId:** `String` — MITRE Atlas (Sub)Technique ID
    
</dd>
</dl>

<dl>
<dd>

**includeSubTechniques:** `Optional<Boolean>` — Include sub-techniques
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ModelIntel File
<details><summary><code>client.modelIntel.file.get(sha256) -> GetFileResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve detailed file information including all associated instances, repositories, and metadata
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.modelIntel().file().get(
    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855",
    GetFileRequest
        .builder()
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sha256:** `String` — SHA256 hash of the file (64 hexadecimal characters)
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.modelIntel.file.metadata(sha256) -> File</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve file information such as filetype, file size in bytes, and MIME type
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.modelIntel().file().metadata(
    "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855",
    MetadataFileRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sha256:** `String` — SHA256 hash of the file (64 hexadecimal characters)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Models Cards
<details><summary><code>client.models.cards.listV3() -> SyncPagingIterable&amp;lt;ModelCardV3&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().cards().listV3(
    ListV3CardsRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelName:** `Optional<ListV3CardsRequestModelName>` — substring match on model name
    
</dd>
</dl>

<dl>
<dd>

**modelCreated:** `Optional<ListV3CardsRequestModelCreated>` — match on models created between dates
    
</dd>
</dl>

<dl>
<dd>

**aidrSeverity:** `Optional<ListV3CardsRequestAidrSeverityItem>` — Deprecated - use ModelCardAIDRThreatLevel(aidr_threat_level) instead
    
</dd>
</dl>

<dl>
<dd>

**aidrThreatLevel:** `Optional<ListV3CardsRequestAidrThreatLevelItem>` 
    
</dd>
</dl>

<dl>
<dd>

**aidrStatus:** `Optional<AidrStatus>` — filter by aidr enabled
    
</dd>
</dl>

<dl>
<dd>

**modscanSeverity:** `Optional<ModelCardScanSafeUnsafe>` 
    
</dd>
</dl>

<dl>
<dd>

**modscanStatus:** `Optional<AidrStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<ListV3CardsRequestSource>` — substring and full match on model source
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<ListV3CardsRequestProviderItem>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` — Begin returning the results from this offset
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by model name or created at timestamp, ascending (+) or the default descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.cards.list() -> SyncPagingIterable&amp;lt;ModelCardV4&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deprecated in favor of `GET /asset-inventory/v2/assets`
(`asset_type[in]=MODEL`), which returns the same model-card data —
scan status/timing and findings from the `supply-chain` annotation —
alongside the rest of an asset's data, with matching filters
(`model_id[eq]`, `scan_started_at[gt/gte/lt/lte]`) and sorts
(`model_name`, `scan_started_at`).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().cards().list(
    ListCardsRequest
        .builder()
        .limit(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelName:** `Optional<ListCardsRequestModelName>` — substring match on model name
    
</dd>
</dl>

<dl>
<dd>

**modelCreated:** `Optional<ListCardsRequestModelCreated>` — match on models created between dates
    
</dd>
</dl>

<dl>
<dd>

**aidrSeverity:** `Optional<ListCardsRequestAidrSeverityItem>` — Deprecated - use ModelCardAIDRThreatLevel(aidr_threat_level) instead
    
</dd>
</dl>

<dl>
<dd>

**aidrStatus:** `Optional<AidrStatus>` — filter by aidr enabled
    
</dd>
</dl>

<dl>
<dd>

**modscanSeverity:** `Optional<ListCardsRequestModscanSeverityItem>` 
    
</dd>
</dl>

<dl>
<dd>

**policyStatus:** `Optional<PolicyStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**modscanStatus:** `Optional<AidrStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<ListCardsRequestSource>` — substring and full match on model source
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<ListCardsRequestProviderItem>` 
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Limit the number of items returned
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` — Begin returning the results from this offset
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by model name or created at timestamp, ascending (+) or the default descending (-)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.cards.suggestions() -> SuggestionsCardsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().cards().suggestions(
    SuggestionsCardsRequest
        .builder()
        .q("tes")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**q:** `String` — The prefix from which to suggest completions
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — The number of suggestions to return
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Models PolicyCompliance
<details><summary><code>client.models.policyCompliance.update(modelId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Override the policy compliance status for a model. Send {"compliant": true} to mark as compliant, or {"compliant": false} to mark as noncompliant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().policyCompliance().update(
    "model_id",
    OverridePolicyComplianceRequest
        .builder()
        .compliant(true)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**compliant:** `Boolean` — Set to true to mark the model as compliant, or false to mark it as noncompliant. This overrides the policy-derived status.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.policyCompliance.delete(modelId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Remove the manual policy compliance override for a model, reverting to the policy-derived compliance status.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().policyCompliance().delete(
    "model_id",
    DeletePolicyComplianceRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Models Versions Location
<details><summary><code>client.models.versions.location.internal(versionId) -> InternalLocationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().versions().location().internal(
    "version_id",
    InternalLocationRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**versionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Models Versions Locations
<details><summary><code>client.models.versions.locations.get(versionId, key) -> GetLocationsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().versions().locations().get(
    "version_id",
    "key",
    GetLocationsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**versionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.models.versions.locations.update(versionId, key, request) -> UpdateLocationsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.models().versions().locations().update(
    "version_id",
    "key",
    UpdateLocationsRequest
        .builder()
        .body("string")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**versionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**key:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ScanIndices Submission
<details><summary><code>client.scanIndices.submission.create(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scanIndices().submission().create(
    ScanSubmission
        .builder()
        .scannerType("hl_model_scanner")
        .source(
            ScanSubmissionSource
                .builder()
                .saas(
                    ScanSubmissionSourceSaas
                        .builder()
                        .requesterId("someone@hiddenlayer.com")
                        .build()
                )
                .build()
        )
        .scanResult(
            new HashMap<String, Object>() {{
                put("file_results", new ArrayList<Object>(Arrays.asList(new 
                HashMap<String, Object>() {{put("status", "done");
                    put("details", new 
                    HashMap<String, Object>() {{put("sha256", "fae6d75cb56ba5d9bf898b5b49a83d635668cf726f0a1b25cf7dbb1b299101d6");
                    }});
                }})));
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scannerType:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**source:** `ScanSubmissionSource` 
    
</dd>
</dl>

<dl>
<dd>

**scanResult:** `Map<String, Object>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Jobs
<details><summary><code>client.scans.jobs.request(request) -> ScanJob</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().jobs().request(
    ScanJobRequest
        .builder()
        .inventory(
            ScanJobInventory
                .builder()
                .modelName("some-model")
                .modelVersion("")
                .requestingEntity("some-user@example.com")
                .build()
        )
        .access(
            ScanJobRequestAccess
                .builder()
                .source(ScanJobRequestAccessSource.HUGGING_FACE)
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**access:** `ScanJobRequestAccess` — Access method for the location of files associated with the scan
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.jobs.retrieve(scanId) -> ScanReportOfRecordV3</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().jobs().retrieve(
    "00000000-0000-0000-0000-000000000000",
    RetrieveJobsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>

<dl>
<dd>

**hasDetections:** `Optional<Boolean>` — Filter file_results to only those that have detections (and parents)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.jobs.list() -> SyncPagingIterable&amp;lt;ScanReportOfRecordV3Summary&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().jobs().list(
    ListJobsRequest
        .builder()
        .startTime(OffsetDateTime.parse("2025-05-27T00:00:00Z"))
        .endTime(OffsetDateTime.parse("2025-05-27T23:59:59Z"))
        .scannerVersion("1.0.0")
        .detectionCategory("Embedded Payloads")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelVersionIds:** `Optional<String>` — Model Version IDs
    
</dd>
</dl>

<dl>
<dd>

**modelIds:** `Optional<String>` — Model ID
    
</dd>
</dl>

<dl>
<dd>

**startTime:** `Optional<OffsetDateTime>` — Start Time
    
</dd>
</dl>

<dl>
<dd>

**endTime:** `Optional<OffsetDateTime>` — End Time
    
</dd>
</dl>

<dl>
<dd>

**severity:** `Optional<ListJobsRequestSeverity>` — Severities
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<String>` — Statuses
    
</dd>
</dl>

<dl>
<dd>

**requestSource:** `Optional<ScanJobRequestSource>` — Filter by request source using a comma-separated list
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Filter by region of the discovered asset
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Filter by model provider name
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` — allow sorting by model name, status, severity, scan start time, asset region, or model provider ascending (+) or the default descending (-)
    
</dd>
</dl>

<dl>
<dd>

**latestPerModelVersionOnly:** `Optional<Boolean>` — only return latest result per model version
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<ListJobsRequestSource>` — source of model related to scans
    
</dd>
</dl>

<dl>
<dd>

**scannerVersion:** `Optional<String>` — filter by version of the scanner
    
</dd>
</dl>

<dl>
<dd>

**detectionCategory:** `Optional<String>` — filter by a single detection category
    
</dd>
</dl>

<dl>
<dd>

**modelName:** `Optional<ListJobsRequestModelName>` — filter by the model name
    
</dd>
</dl>

<dl>
<dd>

**complianceStatus:** `Optional<PolicyStatus>` — A comma separated list of rule set evaluation statuses to include
    
</dd>
</dl>

<dl>
<dd>

**deepScan:** `Optional<Boolean>` — When true, returns only scans that with files. When false, returns only scans without files. When not provided, returns all scans.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Upload
<details><summary><code>client.scans.upload.start(request) -> StartUploadResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().upload().start(
    MultiFileUploadRequestV3
        .builder()
        .modelVersion("model_version")
        .modelName("model_name")
        .requestingEntity("requesting_entity")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**modelVersion:** `String` — Model version
    
</dd>
</dl>

<dl>
<dd>

**modelName:** `String` — Model name
    
</dd>
</dl>

<dl>
<dd>

**requestingEntity:** `String` — Requesting entity
    
</dd>
</dl>

<dl>
<dd>

**locationAlias:** `Optional<String>` — Requested location alias
    
</dd>
</dl>

<dl>
<dd>

**requestSource:** `Optional<ScanJobRequestSource>` 
    
</dd>
</dl>

<dl>
<dd>

**origin:** `Optional<String>` — Specifies the platform or service where the model originated before being scanned
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.upload.completeAll(scanId) -> CompleteAllUploadResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().upload().completeAll(
    "00000000-0000-0000-0000-000000000000",
    CompleteAllUploadRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Results
<details><summary><code>client.scans.results.listFiles(scanId) -> SyncPagingIterable&amp;lt;ScanFileResultWithComplianceV3&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a cursor-paginated list of file results for a given scan. Results are sorted by compliance status, then highest detection severity, then file path.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().results().listFiles(
    "00000000-0000-0000-0000-000000000000",
    ListFilesResultsRequest
        .builder()
        .pageSize(50)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>

<dl>
<dd>

**hasDetections:** `Optional<Boolean>` — When true, only return files that have detections
    
</dd>
</dl>

<dl>
<dd>

**pageSize:** `Optional<Integer>` — Number of items to return per page
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.results.sarif(scanId) -> String</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().results().sarif(
    "00000000-0000-0000-0000-000000000000",
    SarifResultsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.results.retrieveSummary(scanId) -> ScanReportSummaryResponseV3</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns aggregated summary information for a scan without file-level results.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().results().retrieveSummary(
    "00000000-0000-0000-0000-000000000000",
    RetrieveSummaryResultsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Reports
<details><summary><code>client.scans.reports.list() -> SyncPagingIterable&amp;lt;ScanReport&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a cursor-paginated list of scan reports.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().reports().list(
    ListReportsRequest
        .builder()
        .pageSize(5)
        .limit(5)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pageSize:** `Optional<Integer>` 

Number of items to return per page.
The use of `limit` is preferred, and it takes precedence over `page_size`.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Number of items to return per page.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Cursor for pagination, used to navigate through pages of results
    
</dd>
</dl>

<dl>
<dd>

**time:** `Optional<ListReportsRequestTime>` — Time range for the report
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Reports Csv
<details><summary><code>client.scans.reports.csv.create() -> CreateCsvResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Asynchronously initiates generation of a CSV scan report containing all scan results for the given time range.
Returns an ephemeral job ID that can be used to check the status of the export and download the file.
File is stored for 30 days once generated.

Constraints:
- Both `time[gte]` and `time[lte]` are required
- Date range cannot exceed 31 days
- Dates must be in RFC3339 format (e.g., 2023-01-01T00:00:00Z)
- Only scans with status "done" will be included in the export
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().reports().csv().create(
    CreateCsvRequest
        .builder()
        .time(
            CreateCsvRequestTime
                .builder()
                .gte(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                .lte(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**time:** `CreateCsvRequestTime` — Time range for scan results (both gte and lte are required, max 31 day range)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.reports.csv.get(reportId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Checks the status to see if the CSV file is ready to download.  If the CSV file is ready the file will be returned in the response.  Files are stored for 30 days. If the report_id is lost, the report can be re-generated by re-submitting the request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().reports().csv().get(
    "report_id",
    GetCsvRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**reportId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Reports SupplyChain Csv
<details><summary><code>client.scans.reports.supplyChain.csv.create() -> CreateCsvResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Asynchronously initiates generation of a supply chain CSV report containing scan results matching the specified filters.
Returns an ephemeral report ID that can be used to check the status of the export and download the file.
File is stored for 30 days once generated.

**Row Limit**: Returns up to 10,000 most recent scan results.

**Filtering**: Supports the same filtering parameters as the Query endpoint (GET /scan/v3/results).

**Sorting**: Supports sorting via the `sort` parameter. Results can be ordered by any CSV column.

**Columns**: The CSV columns can be customized using the optional `column_list` query parameter.
If not specified, defaults to: name, detections, scanned_on, policy_status, origin, threat_level.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().reports().supplyChain().csv().create(
    CreateCsvRequest
        .builder()
        .startTime(OffsetDateTime.parse("2025-05-27T00:00:00Z"))
        .endTime(OffsetDateTime.parse("2025-05-27T23:59:59Z"))
        .scannerVersion("1.0.0")
        .detectionCategory("Embedded Payloads")
        .region("us-east-1")
        .provider("aws")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**columnList:** `Optional<String>` 

Comma-separated list of columns to include in the CSV export.
Allowed values: name, detections, scanned_on, policy_status, origin, region, provider, threat_level.
If not specified, defaults to: name, detections, scanned_on, policy_status, origin, threat_level.
    
</dd>
</dl>

<dl>
<dd>

**modelVersionIds:** `Optional<String>` — Filter by model version IDs (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**modelIds:** `Optional<String>` — Filter by model IDs (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**startTime:** `Optional<OffsetDateTime>` — Filter scans with start time greater than or equal to this value
    
</dd>
</dl>

<dl>
<dd>

**endTime:** `Optional<OffsetDateTime>` — Filter scans with start time less than or equal to this value
    
</dd>
</dl>

<dl>
<dd>

**severity:** `Optional<CreateCsvRequestSeverity>` — Filter by severity levels (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<String>` — Filter by scan status (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**complianceStatus:** `Optional<PolicyStatus>` — Filter by compliance status (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**requestSource:** `Optional<ScanJobRequestSource>` — Filter by request source (comma-separated)
    
</dd>
</dl>

<dl>
<dd>

**scannerVersion:** `Optional<String>` — Filter by scanner version
    
</dd>
</dl>

<dl>
<dd>

**detectionCategory:** `Optional<String>` — Filter by detection category
    
</dd>
</dl>

<dl>
<dd>

**modelName:** `Optional<CreateCsvRequestModelName>` — Filter by model name (supports exact match or contains)
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<CreateCsvRequestSource>` — Filter by model source
    
</dd>
</dl>

<dl>
<dd>

**latestPerModelVersionOnly:** `Optional<Boolean>` — Only return latest scan result per model version
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Filter by asset region
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — Filter by model provider
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Maximum number of results to return
    
</dd>
</dl>

<dl>
<dd>

**offset:** `Optional<Integer>` — Number of results to skip for pagination
    
</dd>
</dl>

<dl>
<dd>

**sort:** `Optional<String>` 

Sort results by specified field. Prefix with `-` for descending order, `+` or no prefix for ascending.
Supported fields: name, detections, scanned_on, policy_status, origin, region, provider, threat_level, start_time, model_name, severity, status.

Note: If multiple sort parameters are provided, only the first one will be applied.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.reports.supplyChain.csv.get(reportId) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Checks the status to see if the supply chain CSV file is ready to download.
If the CSV file is ready the file will be returned in the response.
Files are stored for 30 days. If the report_id is lost, the report can be re-generated by re-submitting the request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().reports().supplyChain().csv().get(
    "report_id",
    GetCsvRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**reportId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Scans Upload File
<details><summary><code>client.scans.upload.file.add(scanId) -> AddFileResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().upload().file().add(
    "00000000-0000-0000-0000-000000000000",
    AddFileRequest
        .builder()
        .fileContentLength(1)
        .fileName("exampleFile.txt")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>

<dl>
<dd>

**fileContentLength:** `Integer` — Added file size in bytes
    
</dd>
</dl>

<dl>
<dd>

**fileName:** `Optional<String>` 

File name. One of `file-name` or `file-name-base64` must be provided.
When `file-name-base64` is present it takes precedence; otherwise this value is used.
    
</dd>
</dl>

<dl>
<dd>

**fileNameBase64:** `Optional<String>` 

UTF-8 friendly base64-encoded file name. Optional; when omitted, the server uses the `file-name` header.
One of `file-name` or `file-name-base64` must be provided.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.scans.upload.file.complete(scanId, fileId) -> CompleteFileResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.scans().upload().file().complete(
    "00000000-0000-0000-0000-000000000000",
    "file_id",
    CompleteFileRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## SupplyChain Scans
<details><summary><code>client.supplyChain.scans.get(scanId) -> Optional&amp;lt;Map&amp;lt;String, Object&amp;gt;&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.supplyChain().scans().get(
    "00000000-0000-0000-0000-000000000000",
    GetScansRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>

<dl>
<dd>

**accept:** `Optional<GetScansRequestAccept>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.supplyChain.scans.guidance(scanId) -> GuidanceScansResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

[BETA] This endpoint is not GA or Production ready and is subject to changes at any time. Breaking changes may occur.

Remediation guidance is generated on-demand with AI assistance and may not be
immediately available.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.supplyChain().scans().guidance(
    "00000000-0000-0000-0000-000000000000",
    GuidanceScansRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scanId:** `String` — A Model Scan ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

