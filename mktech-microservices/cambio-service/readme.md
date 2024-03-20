# Cambio Service Module README

## Overview
The Cambio Service module provides currency conversion functionality. It allows users to convert an amount from one currency to another based on the conversion factor stored in the database. This module is built on Spring Boot and integrates with Spring Cloud Netflix Eureka Client for service discovery.

## Module Details

### 1. Main Application Module
- **Package:** `br.com.mktech`
- **Description:** This module contains the main Spring Boot application class for the Cambio Service.

#### `Application.java`
- **Description:** Main class responsible for bootstrapping the Spring Boot application.

### 2. Controller Module
- **Package:** `br.com.mktech.controller`
- **Description:** Contains the controller class responsible for handling HTTP requests related to currency conversion.

#### `CambioController.java`
- **Description:** Controller class with endpoints for currency conversion.

### 3. Model Module
- **Package:** `br.com.mktech.model`
- **Description:** Contains the entity class representing the currency conversion entity.

#### `Cambio.java`
- **Description:** Entity class representing the currency conversion details.

### 4. Repository Module
- **Package:** `br.com.mktech.repository`
- **Description:** Contains the repository interface for CRUD operations on the currency conversion entity.

#### `CambioRepository.java`
- **Description:** Repository interface extending JpaRepository for CRUD operations on the `Cambio` entity.

### 5. Configuration Module
- **Package:** `br.com.mktech.configuration`
- **Description:** Contains configuration classes for the application.

#### `OpenApiConfiguration.java`
- **Description:** Configuration class for OpenAPI documentation using Springdoc.

## Project Structure
```
├── src
│   └── main
│       ├── java
│       │   └── br.com.mktech
│       │       ├── Application.java
│       │       ├── configuration
│       │       │   └── OpenApiConfiguration.java
│       │       ├── controller
│       │       │   └── CambioController.java
│       │       ├── model
│       │       │   └── Cambio.java
│       │       └── repository
│       │           └── CambioRepository.java
│       └── resources
│           ├── application.yml
│           └── db
│               └── migration
│                   └── V1__Create_Cambio_Table.sql
└── pom.xml
```

## Configuration
- **Server Port:** 8000
- **Eureka Client Configuration:**
    - **Service URL:** http://localhost:8761/eureka
- **Database Configuration:**
    - **Driver Class Name:** com.mysql.cj.jdbc.Driver
    - **URL:** jdbc:mysql://localhost:3306/cambio_service?useTimezone=true&serverTimezone=UTC
    - **Username:** root
    - **Password:** admin123
- **Hibernate Configuration:**
    - **DDL Auto:** update
    - **Show SQL:** true
    - **Dialect:** org.hibernate.dialect.MySQL5InnoDBDialect
- **Flyway Configuration:**
    - **URL:** jdbc:mysql://localhost:3306/
    - **Schemas:** cambio_service
    - **User:** root
    - **Password:** admin123
- **Springdoc OpenAPI Configuration:**
    - **API Docs Path:** /cambio-service/v3/api-docs

## Dependencies
- **Spring Boot:** 2.5.0-M3
- **Spring Cloud:** 2020.0.3-SNAPSHOT
- **Spring Cloud Netflix Eureka Client**
- **Spring Data JPA**
- **Springdoc OpenAPI**
- **MySQL Connector Java**
- **Flyway Core**
- **Resilience4j Spring Boot2**
- **Spring Rabbit**
- **Spring Boot Starter Test**

## Database Setup
- The module uses MySQL as the database.
- Run the SQL script `V1__Create_Cambio_Table.sql` located in `src/main/resources/db/migration` to create the necessary table.

## Usage
1. Ensure all dependencies are resolved by Maven.
2. Set up the MySQL database and ensure it is running.
3. Run the `Application` class to start the Cambio Service.
4. Access the Swagger UI documentation at `http://localhost:8000/cambio-service/swagger-ui.html`.
5. Use the provided endpoints to perform currency conversion.

## Contributing
Contributions are welcome! Please feel free to submit issues or pull requests.

## License
This project is licensed under the [MIT License](LICENSE).

---

*Note: Make sure to adjust the README according to any additional modules or changes in the project structure.*