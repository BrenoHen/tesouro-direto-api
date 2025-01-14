# Tesouro Direto API

Este projeto é uma API para consultar informações sobre produtos do Tesouro Direto, utilizando técnicas de web scraping para extrair dados diretamente do site oficial do Tesouro Direto.

## Funcionalidades

- **Consulta de Produtos**: Permite consultar a lista de produtos do Tesouro Direto, incluindo informações como nome, rentabilidade anual, investimento mínimo, preço unitário e data de vencimento.
- **Consulta por ID**: Permite consultar um produto específico pelo seu ID.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a API.
- **Spring Boot**: Framework utilizado para simplificar a configuração e o desenvolvimento da aplicação.
- **Jakarta Persistence (JPA)**: Utilizado para mapeamento objeto-relacional e persistência de dados.
- **Selenium WebDriver**: Utilizado para realizar o web scraping e extrair dados do site do Tesouro Direto.
- **H2 Database**: Banco de dados em memória utilizado para armazenamento temporário dos dados dos produtos.

## Estrutura do Projeto

- **Model**: Contém a classe `Produto`, que representa os produtos do Tesouro Direto.
- **Controller**: Contém a classe `ProdutoController`, responsável por expor os endpoints da API.
- **Utilities**: Contém utilitários como `ScrapingUtil` para realizar o web scraping e `ProdutoService` para manipulação dos dados dos produtos.
- **Repository**: Contém a interface `ProdutoRepository`, que extende `JpaRepository` para interação com o banco de dados.

## Configuração do Banco de Dados

O projeto utiliza o banco de dados em memória H2 para armazenamento temporário dos dados. A configuração está definida no arquivo `application.yml`:

```yaml
spring:
  application:
    name: tesouro-direto-api
  datasource:
    url: jdbc:h2:mem:tesouro
    username: sa
    password: password
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      enabled: true
      path: /h2-console
```

O banco de dados é inicializado com a tabela PRODUTO, conforme definido no arquivo data.sql:

CREATE TABLE PRODUTO (
    ID IDENTITY PRIMARY KEY,
    NOME VARCHAR(100) NOT NULL,
    RENTABILIDADE_ANUAL VARCHAR(50) NOT NULL,
    INVESTIMENTO_MINIMO NUMERIC(18, 2),
    PRECO_UNITARIO NUMERIC(18, 2),
    VENCIMENTO DATE
);

## Como Executar?

1. Clone o repositório:
    git clone https://github.com/BrenoHen/tesouro-direto-api.git

2. Navegue até o diretório do projeto:
    cd tesouro-direto-api

3. Execute a aplicação passando o caminho do arquivo /mvnw:
    ./mvnw spring-boot:run

## Endpoints da API

GET /produtos/consulta: Retorna a lista de produtos do Tesouro Direto.

GET /produtos/consulta/{id}: Retorna um produto específico pelo ID.

## Exemplo de Uso
Para consultar a lista de produtos, faça uma requisição GET para:
http://localhost:8080/produtos/consulta

Para consultar um produto específico pelo ID, faça uma requisição GET para:
http://localhost:8080/produtos/consulta/{id}
``` substitua o {id} por algum valor numérico exemplo: http://localhost:8080/produtos/consulta/1 ```

## Acesso ao Banco de Dados
Para acessar o Banco de Dados basta acessar em seu browser:
http://localhost:8080/h2-console

As informações que devem ser preenchidas para autenticação esão no item deste mesmo readme: Configuração do Banco de Dados

## Contribuições
Contribuições são bem-vindas! 
Se você encontrar algum problema ou tiver alguma sugestão, por favor, abra uma issue ou envie um pull request.
