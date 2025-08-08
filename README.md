# Java CI Demo

This is a simple Java project used to test and demonstrate a GitHub Actions CI pipeline.

## 🚀 Overview

This project contains:
- A basic `App.java` class with a `greet()` method
- Unit tests using JUnit 5
- A `pom.xml` file for building with Maven
- A GitHub Actions workflow that:
  - Builds the project with Maven
  - Runs tests on push or pull request to the `main` branch
  - Checks for CommitLint messages
  - Automatically tag and release the app
  - Duplicates main branch to auto recover branch for additional backups

