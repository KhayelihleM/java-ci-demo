# Java CI Demo

This is a simple Java project used to test and demonstrate a GitHub Actions CI/CD pipeline with enterprise-grade practices.

## 🚀 Overview

This project contains:

- A basic `App.java` class with a `greet()` method  
- Unit tests implemented using **JUnit 5**  
- A `pom.xml` file configured for building with **Maven** (Java 17)  
- GitHub Actions workflows that:
  - Build the project using Maven  
  - Run unit tests on push or pull requests to the `main` branch  
  - Enforce CommitLint rules for commit message consistency  
  - Automatically create tags and releases via **semantic-release**  
  - Maintain an auto recovery branch by duplicating the main branch for additional backups  

---

## 📂 Project Structure



portfolio/
 ├── pom.xml
 └── src/
      ├── main/
      │    ├── java/com/example/portfolio/
      │    │     ├── PortfolioApplication.java
      │    │     ├── controller/HomeController.java
      │    │     └── model/BlogPost.java
      │    └── resources/
      │          ├── templates/
      │          │     ├── index.html
      │          │     └── blog.html
      │          └── application.properties
      └── test/java/com/example/portfolio/
           └── PortfolioApplicationTests.java
