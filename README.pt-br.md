[English](README.md) | [Português](README.pt-br.md)

# Serviço de Gerenciamento de Usuários e Endereços

Este microserviço, construído com Spring Boot, é responsável pelo gerenciamento de usuários e endereços. O serviço fornece uma API REST que permite a recuperação, criação, atualização e exclusão de entidades de usuário e endereço.

## Instalação

Para usar este serviço, você precisará ter Java 17+ e PostgreSQL instalados.

Depois de ter o PostgreSQL instalado, você pode iniciar o Serviço de Gerenciamento de Usuários e Endereços executando o seguinte comando:

```./mvnw spring-boot:run```

## Configuração

O serviço é configurado usando o arquivo `application.properties`, localizado na pasta raiz do projeto. Você pode alterar a URL do banco de dados, nome de usuário e senha modificando as propriedades `spring.datasource.url`, `spring.datasource.username` e `spring.datasource.password`, respectivamente.

## Uso

O Serviço de Gerenciamento de Usuários e Endereços atualmente fornece os seguintes endpoints:

## GET /api/users

Recupera todos os usuários. A resposta será no formato JSON.

## GET /api/addresses/{id}

Recupera o endereço com o `id` especificado. A resposta será no formato JSON.

## GET /api/users/{id}

Recupera o usuário com o `id` especificado. A resposta será no formato JSON.

## GET /api/users/email/{email}

Recupera o usuário com o `email` especificado. A resposta será no formato JSON.

## GET /api/users/example

Recupera um exemplo de corpo de solicitação de criação de usuário. A resposta será no formato JSON.

## POST /api/users

Cria um novo usuário. O corpo da solicitação deve conter as informações necessárias para o usuário, incluindo nome, sobrenome, email, senha e ID do endereço. A resposta terá um status HTTP de 201 CREATED.

## PUT /api/users/{id}

Atualiza o usuário com o `id` especificado. O corpo da solicitação deve conter as informações atualizadas para o usuário, incluindo nome, sobrenome, email e senha. A resposta terá um status HTTP de 204 NO CONTENT.

## DELETE /api/users/{id}

Exclui o usuário com o `id` especificado. A resposta terá um status HTTP de 204 NO CONTENT.

## Contribuindo

Solicitações de pull são bem-vindas. Para grandes mudanças, abra um problema primeiro para discutir o que você gostaria de mudar.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.
