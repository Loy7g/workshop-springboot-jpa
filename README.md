# 📚 Workshop Spring Boot com JPA / Hibernate

Este projeto foi desenvolvido com o objetivo de **estudo prático** de construção de Web Services RESTful usando **Spring Boot** com **JPA / Hibernate**.  
A aplicação simula um sistema de pedidos com usuários, produtos, categorias, pedidos e pagamentos.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (banco em memória)
- Maven
- Postman (para testes de requisição)

---

## 📁 Estrutura de Pastas

```text
src/
└── main/
    └── java/
        └── com.projetojaworkshop.work/
            ├── config/               # Configurações gerais da aplicação
            ├── entities/             # Entidades JPA (mapeamento do banco)
            │   ├── enums/            # Enumerações (ex: status de pedidos)
            │   └── pk/               # IDs compostos para entidades (chaves primárias)
            ├── repositories/         # Interfaces JPA para acesso aos dados
            ├── resources/            # Controladores REST (camada web)
            │   └── exceptions/           # Tratamento centralizado de erros
            ├── services/             # Camada de serviço (regras de negócio)
            │   └── exceptions/           # Tratamento centralizado de erros
```
## ✅ Funcionalidades
- CRUD completo de usuários, produtos, categorias e pedidos.

- Associação entre entidades (OneToMany, ManyToMany, etc).

- Manipulação de chaves compostas.

- Tratamento de exceções com respostas padronizadas.

- Testes de endpoints com Postman.

- Uso de banco H2 com dados populados automaticamente no TestConfig.

## ▶️ Como rodar o projeto
Pré-requisitos:

- Java 17+

- Maven

- IDE como IntelliJ ou VS Code

![image](https://github.com/user-attachments/assets/638ecc61-809d-45ad-a529-df2c4ca43349)


## 🧪 Testes
Você pode utilizar o Postman ou outra ferramenta para testar os seguintes endpoints:

- /users

- /products

- /orders

- /categories

## 🎯 Objetivo
Este projeto foi desenvolvido com foco em aprender e fixar conceitos fundamentais de:

- Modelagem de dados com JPA

- Construção de APIs REST com Spring Boot

- Boas práticas de estruturação em projetos Java

- Manipulação de erros e respostas HTTP

