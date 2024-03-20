# Naming Server Module README

## Overview
The Naming Server module acts as a service registry and discovery server using Netflix Eureka. It allows microservices within the system to register themselves and discover other services. This module is built on Spring Boot and integrates with Spring Cloud Netflix Eureka Server.

## Module Details

### 1. Main Application Module
- **Package:** `br.com.mktech`
- **Description:** This module contains the main Spring Boot application class for the Naming Server.

#### `Application.java`
- **Description:** Main class responsible for bootstrapping the Spring Boot application and enabling the Eureka Server functionality.

## Project Structure
```
├── src
│   └── main
│       ├── java
│       │   └── br.com.mktech
│       │       └── Application.java
│       └── resources
│           └── application.yml
└── pom.xml
```

## Configuration
- **Server Port:** 8761
- **Spring Application Name:** naming-server
- **Eureka Server Settings:**
    - **Register with Eureka:** false
    - **Fetch Registry:** false

## Dependencies
- **Spring Boot:** 2.5.0-M3
- **Spring Cloud:** 2020.0.3-SNAPSHOT
- **Spring Cloud Netflix Eureka Server**

## Usage
1. Ensure all dependencies are resolved by Maven.
2. Run the `Application` class to start the Naming Server.
3. Access the Eureka dashboard at `http://localhost:8761`.

## Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.

## License
This project is licensed under the [MIT License](LICENSE).

---

*Note: Make sure to adjust the README according to any additional modules or changes in the project structure.*