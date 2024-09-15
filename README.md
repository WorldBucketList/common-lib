# Common Library

## Description

This is a common library used by both the backend and potentially other services. It includes shared models and services.

## Prerequisites

- Java 17 or above
- Gradle

## How to Build

1. **Build the library:**

   ```bash
   ./gradlew build
   ```

## How to Test

1. Run unit tests:

   ```bash
   ./gradlew test
   ```

2. Verify that tests pass and ensure the library functions as expected.

## How to Publish to Local Environment

To publish the common library to your local Maven repository, follow these steps:

1. Publish the library to the local Maven repository:

   ```bash
   ./gradlew publishToMavenLocal
   ```

   This will generate the library's `.jar` file and store it in your local Maven repository, usually located at `~/.m2/repository/com/example/my-common-lib/`.

2. Use the local version in other projects:

   In the `build.gradle` file of the projects that depend on this library (e.g., backend):

   ```groovy
   implementation 'com.example:my-common-lib:1.0.0'
   ```

3. Verify the installation: After publishing, ensure the `.jar` file is located under `~/.m2/repository/com/example/my-common-lib/1.0.0/`. The library will now be available for local development across other projects.

## Usage

- This library should be included as a dependency in other projects (e.g., backend).
- Ensure the common-lib is built and published to your local repository or a remote repository before adding it as a dependency.

## Common Issues

- Ensure Java version 17 or above is installed. Check with java -version.
- If you face issues with dependencies, make sure the library is correctly published to your repository.
