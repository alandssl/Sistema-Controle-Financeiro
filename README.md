# 💰 Sistema de Controle Financeiro Pessoal

API backend desenvolvida com Java e Spring Boot para gerenciamento de finanças pessoais, com foco em segurança, organização de código e boas práticas utilizadas no mercado.

---

## 📖 Sobre o Projeto

O sistema permite que usuários registrem e acompanhem suas entradas e saídas financeiras de forma segura e organizada.

Cada usuário possui acesso exclusivo aos seus dados, com autenticação baseada em JWT.

---

## 🚀 Funcionalidades

### 🔐 Autenticação e Segurança
- Cadastro de usuário com senha criptografada (BCrypt)
- Login com email e senha
- Geração de token JWT
- Rotas protegidas com Spring Security
- Isolamento de dados por usuário

---

### 💸 Controle Financeiro
- Registrar entradas (salário, transferências, etc.)
- Registrar saídas (aluguel, mercado, contas, etc.)
- Listar lançamentos do usuário
- Editar lançamentos
- Excluir lançamentos
- Cálculo automático do saldo total

Cada lançamento possui:
- Descrição
- Valor
- Tipo (ENTRADA ou SAÍDA)
- Data

---

## 🧠 Conceitos Aplicados

- API REST estruturada
- Spring Boot
- Spring Data JPA / Hibernate
- Relacionamentos entre entidades
- Autenticação e autorização com JWT
- Spring Security
- DTOs para transferência de dados
- Validação com Jakarta Validation
- Tratamento global de exceções
- Arquitetura em camadas

---

## 🛠️ Tecnologias

### Backend
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- Lombok
- Jakarta Validation
- Springdoc OpenAPI (Swagger)

### Banco de Dados
- PostgreSQL  
- H2 (para testes)

---

## 🗃️ Modelagem

### Usuário
- id  
- nome  
- email  
- senha  
- createdAt  

### MovimentoFinanceiro
- id  
- descricao  
- valor  
- tipo (ENTRADA / SAIDA)  
- data  
- usuario (ManyToOne)  

---

## 🔄 Endpoints

### Autenticação
- `POST /auth/register` → Cadastro de usuário  
- `POST /auth/login` → Login e geração do JWT  

### Movimentos Financeiros
- `POST /movimentos` → Criar lançamento  
- `GET /movimentos` → Listar lançamentos  
- `PUT /movimentos/{id}` → Atualizar lançamento  
- `DELETE /movimentos/{id}` → Remover lançamento  
- `GET /movimentos/saldo` → Retornar saldo total  

---

## 📌 Objetivo

Este projeto foi desenvolvido para:

- Consolidar conhecimentos em Java e Spring Boot  
- Aplicar conceitos de segurança com JWT  
- Simular um sistema real de mercado  
- Servir como projeto de portfólio para vagas backend  

---

## 👨‍💻 Autor

Alan
