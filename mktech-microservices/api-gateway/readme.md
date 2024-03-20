# API Gateway Project README

## Overview
This project serves as an API Gateway using Spring Cloud Gateway to route requests to various microservices within the system. It employs Spring Boot for application development and utilizes Spring Cloud for service discovery and routing. The project also integrates OpenAPI documentation generation using Springdoc OpenAPI.

## Modules

### 1. Configuration Module
- **Package:** `br.com.mktech.configuration`
- **Description:** This module provides configuration classes for setting up OpenAPI documentation generation and Swagger UI configuration.

#### `OpenApiConfiguration.java`
- **Description:** Configuration class responsible for generating OpenAPI documentation groups based on route definitions.
- **Beans:**
    - `apis(SwaggerUiConfigParameters config, RouteDefinitionLocator locator)`:
        - Generates OpenAPI documentation groups for each service based on route definitions.

### 2. Filter Module
- **Package:** `br.com.mktech.filter`
- **Description:** This module contains a global filter for logging incoming requests.

#### `LoggingFilter.java`
- **Description:** Global filter for logging incoming requests to the API Gateway.
- **Functionality:**
    - Logs the original request path before passing it to the downstream services.

### 3. Main Application Module
- **Package:** `br.com.mktech`
- **Description:** This module contains the main Spring Boot application class.

#### `Application.java`
- **Description:** Main class responsible for bootstrapping the Spring Boot application.

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── br.com.mktech
│   │   │   │   ├── configuration
│   │   │   │   │   └── OpenApiConfiguration.java
│   │   │   │   ├── filter
│   │   │   │   │   └── LoggingFilter.java
│   │   │   │   └── Application.java
│   │   └── resources
│   │       └── application.yml
└── pom.xml
```

## Dependencies
- **Spring Boot:** 2.5.0-M3
- **Spring Cloud:** 2020.0.3-SNAPSHOT
- **Springdoc OpenAPI:** 1.5.7

## Configuration
- **Server Port:** 8765
- **Eureka Server URL:** http://localhost:8761/eureka

## Usage
1. Ensure all dependencies are resolved by Maven.
2. Run the `Application` class to start the API Gateway.
3. Access the Swagger UI for API documentation at `http://localhost:8765/swagger-ui.html`.

## Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.

## License
This project is licensed under the [MIT License](LICENSE).

--- 

*Note: Make sure to adjust the README according to any additional modules or changes in the project structure.*