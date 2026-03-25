# Unit Testing Project: Calculator Library

Automated unit tests for the `Calculator-1.0.jar` library
The project demonstrates data-driven testing, parallel execution, and configure tests by TestNG file.

## 🛠 Tech Stack
* **Java:** 21+
* **Testing Framework:** TestNG 
* **Build Tool:** Maven
* **Library under test:** Calculator-1.0.jar

## Structure
The project is built on the principle: one class — one library method.
The basic package is responsible for basic arithmetic operations,
advanced for advanced operations from the calculator library.
There is also a validation package for tests
and a runner package for the testrunner class with a before method 
and initialization of the calculator object that the test classes inherit.

## 🚀 How to Run

### Via IDE (IntelliJ IDEA)
1. Ensure `Calculator-1.0.jar` is added to the project dependencies.
2. Right-click on `src/test/java` and select **Run 'All Tests'**.

### Via TestNG XML (Parallel execution)
1. Locate `testng.xml` in the project root.
2. Right-click the file and select **Run 'testng.xml'**.


### Via Maven Terminal
```bash
mvn clean test































