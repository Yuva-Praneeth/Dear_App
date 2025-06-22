# DearApp

A Java Spring Boot application for user management, including registration, matching, and user status handling.

## Features
- User registration and authentication
- User matching based on criteria
- Custom exception handling
- Role and status management

### Prerequisites
- Java 17 or later
- Maven 3.6+

### Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd dearapp-main
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Configuration
Edit `src/main/resources/application.properties` to configure database and other settings.

## Running Tests
```sh
mvn test
```

