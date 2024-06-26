# Web Service com Spring Boot e JPA/Hibernate 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/JonhJuliao/workshop-springboot3-jpa/blob/master/LICENSE)

# Sobre o projeto

Este é um projeto simples desenvolvido com o intuito de aprimorar minhas habilidades com o framework Spring Boot. 
Trata-se de um web service com entidades como Categoria, Produto, Pedido e Usuário, utilizando conceitos de UML, 
como associações Um-para-Muitos, Um-para-Um, Muitos-para-Um e Muitos-para-Muitos.

Neste projeto, foram criadas camadas de serviço para a implementação da lógica de negócios. 
Como se trata de um projeto de treinamento, fiz questão de criar repositórios para cada uma das entidades que necessitavam de persistência. 
Além disso, foi implementado um tratamento de erros simples para melhorar a robustez da aplicação.

## Domain Model
![Domain Model](https://github.com/JonhJuliao/workshop-springboot3-jpa/blob/master/assets/Domain%20Model.PNG)

## Domain Instance
![Domain Model](https://github.com/JonhJuliao/workshop-springboot3-jpa/blob/master/assets/Domain%20Instance.PNG)

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven

# Como executar o projeto

## Pré-requisitos
Pré-requisitos: Java 17 ou superior

## Clone o projeto
```bash
# clonar repositório
git clone https://github.com/devsuperior/sds1-wmazoni
```
## Abra o projeto na sua IDE
- No Spring Tool Suite (STS), selecione File > Import > Existing Maven Projects e escolha o diretório do projeto clonado.

## Se preferir configure no seu Banco de Dados
- O projeto está configurado para usar o banco de dados em memória H2. O H2 é um banco de dados relacional leve, rápido e de código aberto,
que roda em memória, ou seja, os dados são armazenados temporariamente enquanto a aplicação está em execução e são perdidos quando a aplicação é parada.

- Esse banco de dados é comumente utilizado na fase de testes e posteriormente a configuração é trocada para utilizar um outro banco de dados quando entrar
na fase de implementação.

- As configurações estão no arquivo application.properties e estão da seguinte forma:
```bash
# Configurações do datasource
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configurações do console H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
## Execute o projeto
-No Spring Tool Suite (STS), clique com o botão direito no arquivo principal do projeto (geralmente com o nome SeuProjetoApplication.java)
e selecione Run As > Spring Boot App.
-O Spring Boot irá iniciar e o TestConfig irá alimentar o banco de dados com dados de teste automaticamente.

## Acesse o web service
-Com o servidor em execução, você pode acessar o web service através da URL http://localhost:8080.

## Acesse o console do H2
-Você pode acessar o console do H2 para visualizar os dados no banco de dados em http://localhost:8080/h2-console. 

Caso decida manter as configurações padrão do banco de dados, use as seguintes credenciais:
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (deixe em branco)

## Testando os Endpoints
Para testar os endpoints HTTP GET, POST, PUT e DELETE, recomenda-se o uso do Postman, uma ferramenta popular para testar APIs REST.

### Instale o Postman:

Baixe e instale o Postman em postman.com.
Testando os Endpoints:

### GET Requests:
Configure uma nova requisição GET no Postman para http://localhost:8080/categories, http://localhost:8080/products, 
http://localhost:8080/orders, ou http://localhost:8080/users.
Clique em "Send" para ver a resposta do servidor.

### POST Requests:
Configure uma nova requisição POST no Postman para o endpoint desejado.
Na aba "Body", selecione "raw" e "JSON" para enviar dados no formato JSON.
Adicione o JSON no corpo da requisição e clique em "Send".

### PUT Requests:
Configure uma nova requisição PUT no Postman para o endpoint desejado.
Na aba "Body", selecione "raw" e "JSON" para enviar dados no formato JSON.
Adicione o JSON atualizado no corpo da requisição e clique em "Send".

### DELETE Requests:
Configure uma nova requisição DELETE no Postman para o endpoint desejado.
Clique em "Send" para excluir o recurso especificado

## Endpoints

- GET /categories - Lista todas as categorias
- GET /products - Lista todos os produtos
- GET /orders - Lista todos os pedidos
- GET /users - Lista todos os usuários
- GET /categories/{id} - Lista a categoria por id
- GET /products{id} - Lista o produto por id
- GET /orders{id} - Lista o pedido por id
- GET /users{id} - Lista o usuário por id
- POST /users - Insere um usuário através do Json utilizado no body
- DELETE /users/{id} - Deleta um usuário pelo id
- PUT /users/{id} - Atualiza o usuário do id utilizado no path através do Json utilizado body.

# Autor

Jonathan de Melo Julião

https://www.linkedin.com/in/jonathan-juli%C3%A3o/

