# 🎬 JustSeries - Admin

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
[![API OMDb](https://img.shields.io/badge/API-OMDb-blue?style=for-the-badge)](https://gutendex.com/)
![Status](https://img.shields.io/badge/status-finalizado-green?style=for-the-badge)


A versão administrativa do **JustSeries Streaming** é uma aplicação Java baseada em terminal, responsável pelo gerenciamento completo do catálogo de séries e episódios.

Ela faz parte de um sistema maior que possui também uma versão web read-only, compartilhando os mesmos dados através do banco H2 ou PostgreSQL.

---

## Sobre o projeto

O objetivo da versão admin é permitir a manutenção completa do catálogo de séries, incluindo cadastro, edição, listagem e gerenciamento de episódios.

A aplicação foi desenvolvida com foco em aprendizado de Spring Boot e boas práticas de arquitetura em camadas.

---

## Funcionalidades

- Cadastro de séries
- Cadastro de episódios
- Listagem de séries
- Listagem do top 5 séries
- Listagem por data 
- Persistência de dados
- Integração com API externa (OMDb)

---

## Arquitetura do projeto

O projeto foi organizado utilizando separação em camadas:

- `model` → entidades da aplicação
- `principal` → inicialização da aplicação
- `repository` → acesso ao banco de dados
- `service` → regras de negócio
  
---

## Conceitos e recursos utilizados

- Programação orientada a objetos (POO)
- Enums
- Lists
- Optional (tratamento seguro de dados)
- Streams (utilizado durante o desenvolvimento, posteriormente substituído em parte por consultas no banco)
- Interfaces
- Records
- Spring Boot
- JPA / Hibernate

---

## Banco de dados

O projeto utiliza dois bancos de dados:

### H2 Database (arquivo)
- Banco local em arquivo
- Utilizado para testes e execução rápida

## Observações importantes

O projeto já está previamente configurado para utilização com o banco **H2 Database** em arquivo.

Algumas séries já foram cadastradas e salvas na pasta de dados da versão administrativa para facilitar a visualização do sistema ao executar a versão web, permitindo que o catálogo já apareça automaticamente no frontend.

Caso deseje adicionar novas séries, basta executar a versão admin, listar as séries já cadastradas e realizar novos cadastros normalmente, evitando duplicidade de registros.

Toda a configuração necessária já está pronta nas duas aplicações. Não é necessário alterar caminhos, bancos ou configurações manualmente.

Após iniciar os projetos, basta acessar a aplicação web pelo navegador através do endereço localhost configurado.

### PostgreSQL
- Banco principal para persistência real
- Alternativa configurável

---
