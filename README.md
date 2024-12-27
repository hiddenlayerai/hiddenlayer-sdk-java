# HiddenLayer Java SDK (Beta)

HiddenLayer Java SDK is a library that provides a set of tools to interact with the HiddenLayer API.

## Updating the package version

To update the package version you can run the following command:

```
mvn versions:set -DgenerateBackupPoms=false
```

## Executing the example ScanModel application

Following command will execute a scan against the Hiddenlayer's API using the example "malicious" pickle model.  Model is not actually malicious.

You will need a valid Api Key ID and Secret.

```
mvn exec:java -pl 'scanModel' -Dexec.args="-f client/src/test/resources/malicious_model.pkl -m My-Test-Model -c YOUR_API_ID -s YOU_API_SECRET -a 
```
