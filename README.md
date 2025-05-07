# Rest-Assured-Project

This repository contains automated API test scripts written using **Rest Assured** for the [Fake REST API Swagger UI](https://fakerestapi.azurewebsites.net/index.html). The goal of this project is to demonstrate API testing practices using Java and the Rest Assured library.

---

## 📁 Project Structure

```plaintext
REST-API-DEMO-PROJECT/
├── src/
│   ├── main/java/com/api/
│   │   ├── models/       # POJOs for request/response bodies
│   │   └── services/     # HTTP service methods
│   └── test/java/com/api/
│       └── test/         # Test classes for different endpoints
├── target/               # Compiled output and test reports
├── azure_pipeline.yml    # Azure DevOps CI/CD pipeline configuration
├── pom.xml               # Maven project configuration
```

---

## 🔧 Technologies Used

- Java
- Rest Assured
- Maven
- TestNG / JUnit (specify which one you're using)
- Azure DevOps (CI/CD)

---

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

- Java JDK 11 or above
- Maven
- Git

### Clone the Repository

```bash
git clone https://github.com/83197aditya/Rest-Assured-Project.git
cd Rest-Assured-Project/REST-API-DEMO-PROJECT
```

### Install Dependencies

```bash
mvn clean install
```

---

## ✅ Running the Tests

To run all the tests:

```bash
mvn test
```

Test reports are generated under `target/surefire-reports`.

---

## ⚙️ CI/CD Pipeline

This project includes an Azure DevOps pipeline (`azure_pipeline.yml`) that:

- Builds the project
- Runs the test suite
- Publishes test results

You can configure this pipeline in your Azure DevOps project to automate test execution on code push or PR.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE) - feel free to use and modify it.

---

## 🙋‍♂️ Author

**Aditya Vishwakarma**  
QA Automation Engineer @ NielsenIQ  
[GitHub Profile](https://github.com/83197aditya)

---

## 🌐 API Reference

- [Swagger UI - Fake REST API](https://fakerestapi.azurewebsites.net/index.html)
