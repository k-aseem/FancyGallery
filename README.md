# FancyGallery (Android)

It is an academic project.

Overview

- `FancyGallery` is an Android Studio project (Gradle-based) implementing a simple image gallery app. It was developed as part of an academic assignment to demonstrate Android app fundamentals: layouts, adapters, image display, and user interaction.

Key Features

- Browse images from the app's resources or device storage.
- Basic image viewing with zoom/support for fullscreen (where implemented).
- Simple UI designed for learning and demonstration purposes.

Requirements

- Android Studio (recommended: latest stable release).
- Android SDK (install via Android Studio).
- Kotlin and Android Gradle Plugin (project configured with Gradle wrapper `./gradlew`).

Getting Started

- Open the `FancyGallery` folder in Android Studio (`Open an existing Android Studio project`).
- Let Android Studio sync Gradle and download any missing SDK components.
- If `local.properties` is missing, Android Studio will prompt or auto-create it pointing to your SDK path.

Build & Run (command line)

```bash
# From project root
./gradlew assembleDebug
./gradlew installDebug   # installs to connected device/emulator
```

Or use Android Studio: select the `app` module and press Run.

Project Structure

- `app/` — main Android module containing source under `app/src/main/java` or `app/src/main/kotlin` and resources under `app/src/main/res`.
- `build.gradle.kts`, `settings.gradle.kts`, `gradle/`, `gradlew` — Gradle build and wrapper files.

Testing

- Run unit tests (if present) with `./gradlew test`.
- Run instrumentation tests on an emulator/device with `./gradlew connectedAndroidTest`.
  `.
