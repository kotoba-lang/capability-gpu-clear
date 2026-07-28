(ns kotoba.capability.gpu.clear
  "Importable contract for gpu/clear.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:gpu-clear}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-gpu-clear", :capability/id "gpu/clear", :capability/effects #{:device-write}, :capability/provider-status :contract-only})
