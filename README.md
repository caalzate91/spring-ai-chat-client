# Spring AI Chat Client

This project is a simple chat client application built using Spring Boot, integrated with Google Vertex AI (Gemini). It allows users to send and receive messages using a powerful language model.

## Project Structure

The project follows a standard Spring Boot structure with the following key components:

- **src/main/java/com/springchat/chatclient**: Contains the main application code.
    - **ChatClientApplication.java**: The entry point of the Spring Boot application.
    - **config/AppConfig.java**: Application configuration for the chat client.
    - **controller/ChatController.java**: REST controller for handling chat-related requests.
    - **service/ChatService.java**: Business logic for processing messages and interacting with the AI model.
    - **model/ChatResponse.java**: Represents a chat response.

- **src/main/resources**: Contains application resources.
    - **application.yml**: Configuration properties for the Spring application.

- **src/test/java/com/springchat/chatclient**: Contains unit tests for the application.

- **build.gradle**: Gradle build configuration file specifying dependencies and plugins.

- **Dockerfile**: Instructions for building a Docker image of the application.

- **cloudbuild.yaml**: Configuration for Google Cloud Build to deploy the application.

## Getting Started

### Prerequisites

- Java 23
- Gradle
- Docker
- Google Cloud SDK

Install the gcloud CLI, appropriate for your operating system. See the [Google Cloud SDK documentation](https://cloud.google.com/sdk/docs/install) for installation instructions.

Authenticate by running the following command. Replace `<PROJECT_ID>` with your Google Cloud project ID and `<ACCOUNT>` with your Google Cloud username.

```sh
gcloud config set project <PROJECT_ID> && gcloud auth application-default login <ACCOUNT>
```

### Setup

1. Clone the repository:
   ```
   git clone <repository-url>
   cd spring-ai-chat-client
   ```

2. Build the project:
   ```
   ./gradlew build
   ```

3. Run the application:
   ```
   ./gradlew bootRun
   ```

### Docker

To build and run the application in a Docker container:

1. Build the Docker image:
   ```
   docker build -t spring-ai-chat-client .
   ```

2. Run the Docker container:
   ```
   docker run -p 8080:8080 spring-ai-chat-client
   ```

### API Documentation

API documentation is generated using Swagger. Access it at:
```
http://localhost:8080/swagger-ui.html
```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for details.