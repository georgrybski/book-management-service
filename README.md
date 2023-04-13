[English](README.md) | [Português](README.pt-br.md)

# Book Management Service

This is a microservice developed as part of a programming school activity to familiarize with microservices. It is a simple service for managing books, providing basic CRUD (Create, Read, Update, Delete) operations over the book data.

## Installation

To use this service, you will need to have Java 17+ and PostgreSQL installed.

Once you have PostgreSQL installed, you can start the User and Address Management Service by running the following command:

```./mvnw spring-boot:run```

## Configuration

The service is configured using the `application.properties` file, located in the root folder of the project. You can change the database URL, username, and password by modifying the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties, respectively.

## Usage

The Book Management Service currently provides the following endpoints:

## GET /api/books

Retrieves all books. The response will be in JSON format.

## GET /api/books/{id}

Retrieves the book with the specified `id`. The response will be in JSON format.

## GET /api/books/example

Retrieves an example book creation request body. The response will be in JSON format.

## POST /api/books

Creates a new book. The request body should The response will have an HTTP status of 201 CREATED.

Here's an example of a valid request body:

```
{
    "title": "The Catcher in the Rye",
    "author": "J.D. Salinger",
    "isbn": "978-0316769488",
    "publisher": "Back Bay Books",
    "language": "English",
    "description": "The Catcher in the Rye is a story by J. D. Salinger, partially published in serial form in 1945–1946 and as a novel in 1951. It was originally intended for adults but is often read by adolescents for its themes of angst, alienation, and as a critique on superficiality in society.",
    "publicationDate": "July 16, 1951",
    "numberOfPages": 277,
    "category": "Fiction",
    "price": 10.99,
    "genre": "Coming-of-Age Fiction"
}
```

## PUT /api/book/{id}

Updates the book with the specified `id`. The request body should contain the updated information for the book, just as the previous example. The response will have an HTTP status of 204 NO CONTENT.

## DELETE /api/book/{id}

Deletes the book with the specified `id`. The response will have an HTTP status of 204 NO CONTENT.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
