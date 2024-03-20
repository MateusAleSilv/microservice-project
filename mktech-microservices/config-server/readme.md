# Config Server Module README

## Overview
The Config Server module in this project functions as a centralized configuration server using Spring Cloud Config. It allows microservices within the system to externalize their configuration. This module is built on Spring Boot and enables configuration server functionality.

## Module Details

### 1. Main Application Module
- **Package:** `br.com.mktech`
- **Description:** This module contains the main Spring Boot application class for the Config Server.

#### `Application.java`
- **Description:** Main class responsible for bootstrapping the Spring Boot application and enabling the Config Server functionality.
- **Annotations:**
    - `@SpringBootApplication`: Indicates this class is the main Spring Boot application.
    - `@EnableConfigServer`: Enables the Config Server functionality.

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
- **Server Port:** 8888
- **Spring Application Name:** config-server
- **Spring Cloud Config Server Settings:**
    - **Git URI:** https://github.com/mateusaledev/mktech-microservices/config-server
    - **Default Label:** main
    - **Search Paths:**
        - 'greeting-service*'

## Usage
1. Ensure all dependencies are resolved by Maven.
2. Run the `Application` class to start the Config Server.
3. Access the configuration files for microservices by making requests to the Config Server, e.g., `http://localhost:8888/greeting-service/default`.

## Note
- Adjust the Git URI, username, password, default label, and search paths in the `application.yml` according to your Git repository and configuration structure.

## Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.

## License
This project is licensed under the [MIT License](LICENSE).

---

*Note: Make sure to adjust the README according to any additional modules or changes in the project structure.*