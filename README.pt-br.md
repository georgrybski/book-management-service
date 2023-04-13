[English](README.md) | [Português](README.pt-br.md)

# Serviço de Gerenciamento de Livros

Este é um microsserviço desenvolvido como parte de uma aplicação de livraria. É um serviço simples para gerenciamento de livros, fornecendo operações básicas de CRUD (Create, Read, Update, Delete) sobre os dados do livro.

## Instalação

Para usar este serviço, você precisará ter o Java 17+ e o PostgreSQL instalados.

Assim que você tiver o PostgreSQL instalado, pode iniciar o Serviço de Gerenciamento de Usuários e Endereços executando o seguinte comando:

```./mvnw spring-boot:run```

## Configuração

O serviço é configurado usando o arquivo `application.properties` , localizado na pasta raiz do projeto. Você pode alterar a URL do banco de dados, o nome de usuário e a senha modificando as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password`, respectivamente.

## Uso

O Serviço de Gerenciamento de Livros fornece atualmente os seguintes endpoints:

## GET /api/books

Recupera todos os livros. A resposta será em formato JSON.

## GET /api/books/{id}

Recupera o livro com o `id`especificado. A resposta será em formato JSON.

## GET /api/books/example

Recupera um exemplo de corpo de requisição de criação de livro. A resposta será em formato JSON.

## POST /api/books

Cria um novo livro. O corpo da solicitação deve O retorno terá um status HTTP de 201 CREATED.

Abaixo segue um exemplo de uma solicitação válida:

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

Atualiza o livro com o `id` especificado. O corpo da solicitação deve conter as informações atualizadas do livro, assim como no exemplo anterior. O retorno terá um status HTTP de 204 NO CONTENT.

## DELETE /api/book/{id}

Exclui o livro com o `id` especificado. O retorno terá um status HTTP de 204 NO CONTENT.

## Contribuição

Pull requests são bem-vindos. Para grandes alterações, abra primeiro uma issue para discutir o que você gostaria de alterar.

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
