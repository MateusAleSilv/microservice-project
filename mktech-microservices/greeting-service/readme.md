# Greeting Service Module README

## Overview
The Greeting Service module is a microservice designed to provide personalized greetings. It utilizes Spring Boot for application development and integrates with Spring Cloud Config for externalized configuration management.

## Module Details

### 1. Main Application Module
- **Package:** `br.com.mktech.greetingservice`
- **Description:** This module contains the main Spring Boot application class for the Greeting Service.

#### `GreetingServiceApplication.java`
- **Description:** Main class responsible for bootstrapping the Spring Boot application.

### 2. Model Module
- **Package:** `br.com.mktech.greetingservice.model`
- **Description:** This module contains the model class representing a greeting.

#### `Greeting.java`
- **Description:** Model class representing a greeting with an ID and content.

### 3. Controller Module
- **Package:** `br.com.mktech.greetingservice.controller`
- **Description:** This module contains the controller class responsible for handling greeting requests.

#### `GreetingController.java`
- **Description:** Controller class for handling greeting requests and returning personalized greetings.

### 4. Configuration Module
- **Package:** `br.com.mktech.greetingservice.configuration`
- **Description:** This module contains the configuration class for the Greeting Service.

#### `GreetingConfiguration.java`
- **Description:** Configuration class responsible for loading greeting configurations from Spring Cloud Config.

## Project Structure
```
├── src
│   └── main
│       ├── java
│       │   └── br.com.mktech
│       │       └── greetingservice
│       │           ├── GreetingServiceApplication.java
│       │           ├── controller
│       │           │   └── GreetingController.java
│       │           ├── configuration
│       │           │   └── GreetingConfiguration.java
│       │           └── model
│       │               └── Greeting.java
│       └── resources
│           └── application.yml
└── pom.xml
```

## Configuration
- **Server Port:** 8080
- **Spring Application Name:** greeting-service
- **Spring Cloud Config Settings:**
    - **Profile:** perf
    - **Import:** optional:configserver:http://localhost:8888/
- **Management Endpoints Exposure:** All endpoints are exposed.

## Usage
1. Ensure all dependencies are resolved by Maven.
2. Run the `GreetingServiceApplication` class to start the Greeting Service.
3. Access the greeting endpoint at `http://localhost:8080/greeting`.

## Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.

## License
This project is licensed under the [MIT License](LICENSE).

---

*Note: Make sure to adjust the README according to any additional modules or changes in the project structure.*