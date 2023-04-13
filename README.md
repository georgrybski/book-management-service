[English](README.md) | [Português](README.pt-br.md)

# User and Address Management Service

This microservice, built with Spring Boot, is responsible for managing users and addresses. The service provides a REST API that enables the retrieval, creation, updating, and deletion of user and address entities.

## Installation

To use this service, you will need to have Java 17+ and PostgreSQL installed.

Once you have PostgreSQL installed, you can start the User and Address Management Service by running the following command:

```./mvnw spring-boot:run```

## Configuration

The service is configured using the `application.properties` file, located in the root folder of the project. You can change the database URL, username, and password by modifying the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties, respectively.

## Usage

The User and Address Management Service currently provides the following endpoints:

## GET /api/users

Retrieves all users. The response will be in JSON format.

## GET /api/addresses/{id}

Retrieves the address with the specified `id`. The response will be in JSON format.

## GET /api/users/{id}

Retrieves the user with the specified `id`. The response will be in JSON format.

## GET /api/users/email/{email}

Retrieves the user with the specified `email`. The response will be in JSON format.

## GET /api/users/example

Retrieves an example user creation request body. The response will be in JSON format.

## POST /api/users

Creates a new user. The request body should contain the necessary information for the user, including first name, last name, email, password, and address ID. The response will have an HTTP status of 201 CREATED.

## PUT /api/users/{id}

Updates the user with the specified `id`. The request body should contain the updated information for the user, including first name, last name, email, and password. The response will have an HTTP status of 204 NO CONTENT.

## DELETE /api/users/{id}

Deletes the user with the specified `id`. The response will have an HTTP status of 204 NO CONTENT.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
