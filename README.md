# capability-gpu-clear

Atomic authority package for `gpu/clear`.

- imports: `#{:gpu-clear}`
- effects: `#{:device-write}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
