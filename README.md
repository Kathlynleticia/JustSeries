# 🎬 JustSeries Streaming

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
[![API OMDb](https://img.shields.io/badge/API-OMDb-blue?style=for-the-badge)](https://gutendex.com/)
[![API MyMemory](https://img.shields.io/badge/API-MyMemory-blue?style=for-the-badge)](https://gutendex.com/)
![Status](https://img.shields.io/badge/status-finalizado-green?style=for-the-badge)

O **JustSeries Streaming** é um sistema inspirado em plataformas de streaming de séries, desenvolvido com Java e Spring Boot.

O projeto é dividido em múltiplas aplicações que trabalham em conjunto, permitindo gerenciamento, persistência e disponibilização de dados de séries através de uma arquitetura baseada em API REST.

---

## Sobre o projeto

O sistema foi desenvolvido com foco em aprendizado de:

- Desenvolvimento backend com Spring Boot
- Arquitetura em camadas
- APIs REST
- Persistência de dados
- Integração com APIs externas
- Manipulação e tratamento de dados
- Comunicação entre aplicações

As informações das séries são obtidas através da API OMDb, processadas pela aplicação, traduzidas automaticamente pela API MyMemory, e persistidas localmente no banco de dados.

---

## Estrutura do projeto

O projeto é dividido em três partes principais:

```bash
JustSeries/
│
├── admin/      → versão administrativa via terminal
├── web-api/    → API REST read-only
└── frontend/   → interface visual da aplicação
```

---

## Aplicações do sistema

### Admin

A versão administrativa é responsável pela manutenção do catálogo de séries.

Funcionalidades:
- Cadastro de séries
- Cadastro de episódios
- Persistência de informações
- Integração com API externa

Tecnologias e conceitos:
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Query Methods (`findBy...`)
- Optional
- Enums
- Records
- Arquitetura em camadas

---

### Web API

A versão web é uma API REST read-only responsável por disponibilizar os dados das séries para o frontend.

Funcionalidades:
- Endpoints REST
- Listagem de séries
- Busca de dados
- Integração com frontend
- Persistência e leitura de dados

Tecnologias e conceitos:
- Spring Boot
- REST API
- JPA / Hibernate
- DTOs
- Controllers
- Configuração de CORS
- Query Methods
- Integração com OMDb API
- Tradução de Dados

---

### Frontend

O frontend é responsável pela interface visual da aplicação, consumindo os dados disponibilizados pela Web API.

A interface permite visualizar:
- Séries cadastradas
- Informações detalhadas
- Episódios
- Dados traduzidos automaticamente

---

## Integração com OMDb API

O sistema realiza integração com a API OMDb para obtenção de informações das séries.

Os dados recebidos passam por:
- Conversão
- Tratamento
- Tradução automática
- Persistência local

---

## Tradução automática

O projeto possui um módulo responsável pela tradução automática dos dados recebidos da OMDb API utilizando a API MyMemory.

---

## Banco de dados

O projeto possui suporte para:

### H2 Database
- Banco local em arquivo
- Compartilhado entre aplicações
- Utilizado para testes e integração rápida

### PostgreSQL
- Persistência alternativa configurável

---

## Compartilhamento de dados

A versão Web API utiliza o mesmo banco de dados da versão Admin.

Por isso, séries previamente cadastradas no sistema administrativo podem ser exibidas automaticamente no frontend ao iniciar a aplicação.

---

## Conceitos e recursos utilizados

- Programação orientada a objetos (POO)
- Enums
- Lists
- Optional (tratamento seguro de dados)
- Streams (utilizado durante o desenvolvimento, posteriormente substituído por **Query Methods**)
- Interfaces
- Records
- Spring Boot
- API REST
- Configuração de CORS com addCorsMappings
- JPA / Hibernate

---

## Como executar o projeto

### Pré-requisitos

- Java 17+
- Maven
- PostgreSQL (opcional)

---

## Versão Admin

### 1. Clonar o repositório
   
```bash
git clone https://github.com/Kathlynleticia/JustSeries
```
### 2. Abrir o projeto
Abra a pasta da versão admin na IDE de sua preferência.

Exemplo:
- IntelliJ IDEA
- VS Code
- Eclipse

### 3. Executar a versão Admin
**Execute a classe principal do projeto.**

Ou utilize o comando:

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/Mac:

```bash
./mvnw spring-boot:run
```

Responsável pelo gerenciamento e persistência das séries.

---

## Versão Web API

### 1. Abrir o projeto
Abra a pasta da versão Web na IDE de sua preferência.

Exemplo:
- IntelliJ IDEA
- VS Code
- Eclipse

### 2. Executar a versão Web API
**Execute a classe principal do projeto.**

Ou utilize o comando:

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/Mac:

```bash
./mvnw spring-boot:run
```

Disponibiliza os endpoints REST para consumo do frontend.

---

### ⚠️ Observação importante (Java / JAVA_HOME)

Em algumas máquinas, o Maven Wrapper pode não funcionar corretamente se o Java não estiver configurado no sistema.

Caso apareça erro relacionado a JAVA_HOME, utilize uma das opções abaixo:

- Solução 1 (recomendada) <br>
Configure o JAVA_HOME no sistema operacional apontando para o JDK instalado.

- Solução 2 (temporária no terminal) <br>
Descubra o JDK rodando isso:

```bash
Get-ChildItem "C:\Program Files\Java"
```
ou 

```bash
Get-ChildItem "C:\Program Files\Eclipse Adoptium"
```
Se aparecer algo tipo:

- jdk-17
- jdk-21

Você roda:

```bash
$env: JAVA_HOME="C:\Program Files\Java\jdk-21"; .\mvnw.cmd spring-boot:run
```

## Executar o Frontend

O frontend pode ser aberto via VS Code.

Passos:
- Abra a pasta do frontend no VS Code
- Instale a extensão Live Server (Go Live)
- Clique em "Go Live" no canto inferior do VS Code

Importante: O backend precisa estar rodando antes de abrir o frontend, pois é ele que fornece os dados (ex: séries, filmes, etc).

---

## Observações

- O banco H2 já possui séries previamente cadastradas
- A Web API funciona em modo read-only
- O foco principal do projeto é aprendizado e prática de arquitetura backend com Spring Boot

---
## Demonstração - Execução do Sistema




---

## 👩‍💻 Autora

Kathlyn Santos
