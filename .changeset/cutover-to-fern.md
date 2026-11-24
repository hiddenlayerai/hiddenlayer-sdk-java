---
"hiddenlayer-sdk-java-ledger": major
---

Generate the SDK with Fern. The Maven coordinate `com.hiddenlayer.api:hiddenlayer-java`, Java 8 support, the environment variables and the model and community scanners stay; the `hiddenlayer-java-core` and `hiddenlayer-java-client-okhttp` artifacts are folded into `hiddenlayer-java`, a client is built with `new HiddenLayerClientBuilder()` in place of `HiddenLayerOkHttpClient`, request and response types move to new packages and are named after the API's schemas, path parameters become method arguments, errors are renamed, `scans.jobs.list` and `sensors.query` return pages, and every public API in the specification is now covered. [docs/BREAKING_CHANGES_v3.0.0.md](https://github.com/hiddenlayerai/hiddenlayer-sdk-java/blob/main/docs/BREAKING_CHANGES_v3.0.0.md) lists every change.
