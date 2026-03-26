# Unit Testing Project: service.Calculator 

Automated unit tests for the `service.Calculator` 
The project demonstrates data-driven testing, parallel execution, and configure tests by TestNG file.

## 🛠 Tech Stack
* **Java:** 21+
* **Testing Framework:** TestNG 
* **Build Tool:** Maven


## Structure
The project is built on the principle: one class — one method.
The basic package is responsible for basic arithmetic operations,
advanced for advanced operations from the service.
There is also a validation package for tests
and a runner package for the testrunner class with a before method 
and initialization of the service object that the test classes inherit.

## 🚀 How to Run

### Via IDE (IntelliJ IDEA)
1. Right-click on `src/test/java` and select **Run 'All Tests'**.

### Via TestNG XML (Parallel execution)
1. Locate `testng.xml` in the project root.
2. Right-click the file and select **Run 'testng.xml'**.


### Via Maven Terminal
```bash
mvn clean test































