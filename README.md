Sistema de Controle Financeiro Pessoal

Projeto backend desenvolvido com Java + Spring Boot, com foco em boas práticas, segurança e organização de código, simulando um sistema real de controle financeiro pessoal.

O sistema permite que cada usuário gerencie suas entradas e saídas financeiras, com autenticação segura via JWT, garantindo que cada usuário tenha acesso apenas aos seus próprios dados.

🚀 Funcionalidades

Autenticação e Segurança

Cadastro de usuário com senha criptografada (BCrypt)

Login com email e senha

Geração de JWT (JSON Web Token)

Rotas protegidas com Spring Security

Cada usuário acessa somente seus próprios dados

💸 Controle Financeiro

Registrar Entradas (salário, pix recebido, etc)

Registrar Saídas (aluguel, mercado, cartão, etc)

Cada lançamento possui:

Descrição

Valor

Tipo (ENTRADA ou SAÍDA)

Data

Listar lançamentos do usuário

Editar lançamentos

Excluir lançamentos

Cálculo automático do saldo total

🧠 Conceitos Aplicados

Este projeto foi desenvolvido com foco em treinar e demonstrar:

Spring Boot na prática

API REST bem estruturada

Spring Data JPA / Hibernate

Relacionamentos entre entidades (@OneToMany, @ManyToOne)

Autenticação e autorização com Spring Security + JWT

DTOs para entrada e saída de dados

Validações com Jakarta Validation

Tratamento global de exceções (@ControllerAdvice)

Organização em camadas

Boas práticas de versionamento com Git

🛠️ Tecnologias Utilizadas
Backend

Java 17

Spring Boot 3.x

Spring Web

Spring Data JPA

Spring Security

JWT

Lombok

Jakarta Validation

Springdoc OpenAPI (Swagger)

Banco de Dados

PostgreSQL

(Opcional para testes: H2)

🗃️ Modelagem Básica
Usuário

id

nome

email

senha

createdAt

MovimentoFinanceiro

id

descricao

valor

tipo (ENTRADA / SAIDA)

data

usuario (ManyToOne)

🔄 Endpoints Principais
Autenticação

POST /auth/register → Cadastro de usuário

POST /auth/login → Login e geração do JWT

Movimentos Financeiros

POST /movimentos → Criar lançamento

GET /movimentos → Listar lançamentos do usuário

PUT /movimentos/{id} → Atualizar lançamento

DELETE /movimentos/{id} → Remover lançamento

GET /movimentos/saldo → Retorna o saldo total


📌 Objetivo do Projeto

Este projeto foi criado com o objetivo de:

Consolidar conhecimentos em Java e Spring Boot

Simular um sistema real usado no mercado

Servir como projeto de portfólio para vagas de Backend Java / Java Júnior
