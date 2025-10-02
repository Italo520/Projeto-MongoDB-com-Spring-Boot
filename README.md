# Projeto Spring Boot com MongoDB

Este é um projeto de exemplo que demonstra a criação de uma API RESTful com Spring Boot e a integração com um banco de dados NoSQL MongoDB. A aplicação gerencia usuários, posts e comentários, permitindo operações CRUD (Criar, Ler, Atualizar, Deletar) para essas entidades.

## Visão Geral

O projeto é uma aplicação de blog simples onde os usuários podem criar posts e outras pessoas podem comentar neles. Ele é construído usando uma arquitetura em camadas, com uma clara separação entre os controladores (resources), serviços e repositórios.

## Tecnologias Utilizadas

* **Java 8:** Linguagem de programação principal.
* **Spring Boot 2.0.1.RELEASE:** Framework principal para a criação da aplicação.
* **Spring Web:** Para a criação de APIs RESTful.
* **Spring Data MongoDB:** Para a integração com o banco de dados MongoDB.
* **MongoDB:** Banco de dados NoSQL para o armazenamento de dados.
* **Maven:** Ferramenta de gerenciamento de dependências e de build.

## Estrutura do Projeto

O projeto segue a estrutura padrão de um projeto Spring Boot:

* `src/main/java`: Contém todo o código-fonte da aplicação.
    * `com.italo.cursospring`: Pacote raiz.
        * `config`: Classes de configuração, como a `Instantiation`, que popula o banco de dados com dados iniciais.
        * `domain`: As entidades do modelo de domínio (`User`, `Post`).
        * `dto`: Data Transfer Objects (`UserDTO`, `AuthorDTO`, `CommentDTO`) para a transferência de dados entre as camadas.
        * `repository`: Interfaces do Spring Data MongoDB para o acesso aos dados (`UserRepository`, `PostRepository`).
        * `resources`: Controladores REST que expõem os endpoints da API (`UserResource`, `PostResource`).
        * `services`: A lógica de negócios da aplicação (`UserService`, `PostService`).
* `src/main/resources`: Contém os arquivos de configuração, como o `application.properties`.
* `pom.xml`: Define as dependências e as configurações do projeto Maven.

## Como Executar

### Pré-requisitos

* Java 8 ou superior instalado.
* Maven instalado.
* Uma instância do MongoDB em execução no `localhost:27017`.

### Passos

1.  **Clone o repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd <NOME_DO_DIRETORIO>
    ```
3.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

A aplicação estará disponível em `http://localhost:8080`.

## Endpoints da API

### Usuários (`/users`)

* **`GET /users`**: Retorna uma lista de todos os usuários.
* **`GET /users/{id}`**: Busca um usuário específico pelo seu ID.
* **`POST /users`**: Cria um novo usuário.
* **`PUT /users/{id}`**: Atualiza um usuário existente.
* **`DELETE /users/{id}`**: Deleta um usuário.
* **`GET /users/{id}/posts`**: Retorna todos os posts de um usuário específico.

### Posts (`/posts`)

* **`GET /posts/{id}`**: Busca um post específico pelo seu ID.
* **`GET /posts/titlesearch?text=<texto>`**: Busca posts que contenham o texto especificado no título.
* **`GET /posts/fullsearch?text=<texto>&minDate=<data_min>&maxDate=<data_max>`**: Realiza uma busca completa por texto nos posts, com um filtro opcional de datas.
