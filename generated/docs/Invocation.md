

# Invocation

The runtime environment of the analysis tool run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commandLine** | **String** | The command line used to invoke the tool. |  [optional] |
|**arguments** | **List&lt;String&gt;** | An array of strings, containing in order the command line arguments passed to the tool from the operating system. |  [optional] |
|**responseFiles** | [**Set&lt;ArtifactLocation&gt;**](ArtifactLocation.md) | The locations of any response files specified on the tool&#39;s command line. |  [optional] |
|**startTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the invocation started. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format. |  [optional] |
|**endTimeUtc** | **OffsetDateTime** | The Coordinated Universal Time (UTC) date and time at which the invocation ended. See \&quot;Date/time properties\&quot; in the SARIF spec for the required format. |  [optional] |
|**exitCode** | **Integer** | The process exit code. |  [optional] |
|**ruleConfigurationOverrides** | [**Set&lt;ConfigurationOverride&gt;**](ConfigurationOverride.md) | An array of configurationOverride objects that describe rules related runtime overrides. |  [optional] |
|**notificationConfigurationOverrides** | [**Set&lt;ConfigurationOverride&gt;**](ConfigurationOverride.md) | An array of configurationOverride objects that describe notifications related runtime overrides. |  [optional] |
|**toolExecutionNotifications** | [**List&lt;Notification&gt;**](Notification.md) | A list of runtime conditions detected by the tool during the analysis. |  [optional] |
|**toolConfigurationNotifications** | [**List&lt;Notification&gt;**](Notification.md) | A list of conditions detected by the tool that are relevant to the tool&#39;s configuration. |  [optional] |
|**exitCodeDescription** | **String** | The reason for the process exit. |  [optional] |
|**exitSignalName** | **String** | The name of the signal that caused the process to exit. |  [optional] |
|**exitSignalNumber** | **Integer** | The numeric value of the signal that caused the process to exit. |  [optional] |
|**processStartFailureMessage** | **String** | The reason given by the operating system that the process failed to start. |  [optional] |
|**executionSuccessful** | **Boolean** | Specifies whether the tool&#39;s execution completed successfully. |  |
|**machine** | **String** | The machine on which the invocation occurred. |  [optional] |
|**account** | **String** | The account under which the invocation occurred. |  [optional] |
|**processId** | **Integer** | The id of the process in which the invocation occurred. |  [optional] |
|**executableLocation** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**workingDirectory** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**environmentVariables** | **Map&lt;String, String&gt;** | The environment variables associated with the analysis tool process, expressed as key/value pairs. |  [optional] |
|**stdin** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**stdout** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**stderr** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**stdoutStderr** | [**ArtifactLocation**](ArtifactLocation.md) |  |  [optional] |
|**properties** | **PropertyBag** |  |  [optional] |



