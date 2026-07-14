# ts-events [![](https://jitpack.io/v/enzobbom/ts-events.svg)](https://jitpack.io/#enzobbom/ts-events)

Shared event contracts used by the Task Scheduler Platform.

This repository contains the event models shared between the platform's microservices. Artifacts are published through JitPack so the services can consume versioned contracts.

---

## Installation

### 1. Add the JitPack repository

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        mavenCentral()

        maven {
            url = uri("https://jitpack.io")

            content {
                includeGroup("com.github.enzobbom")
            }
        }
    }
}
```

### 2. Add the dependency

```gradle
implementation "com.github.enzobbom:ts-events:v1.0.0"
```

---

## Versioning

This project follows Semantic Versioning.

| Change | Version |
|---------|---------|
| Bug fix | PATCH |
| Backward-compatible event addition | MINOR |
| Breaking event contract | MAJOR |

---

## Release process

1. Update the version in `build.gradle`.
2. Commit and push the changes.
3. Create a GitHub Release with the corresponding version tag (for example `v1.0.0`).
4. JitPack automatically builds and publishes the release.