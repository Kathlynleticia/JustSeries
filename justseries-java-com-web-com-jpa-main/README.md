# 🎬 JustSeries - Web API

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
[![API OMDb](https://img.shields.io/badge/API-OMDb-blue?style=for-the-badge)](https://gutendex.com/)
[![API MyMemory](https://img.shields.io/badge/API-MyMemory-blue?style=for-the-badge)](https://gutendex.com/)
![Status](https://img.shields.io/badge/status-finalizado-green?style=for-the-badge)

A versão web do **JustSeries Streaming** é uma API REST read-only responsável por disponibilizar as informações das séries cadastradas no sistema para consumo no frontend.

Essa aplicação faz parte do ecossistema do projeto **JustSeries**, compartilhando dados com a versão administrativa através do banco H2 e PostgreSQL.

---

## Sobre o projeto

A API foi desenvolvida utilizando Spring Boot e tem como objetivo fornecer os dados das séries, episódios e informações relacionadas para exibição no frontend da aplicação.

Diferente da versão admin, essa aplicação é apenas para leitura dos dados, não permitindo alterações diretamente pela interface web.

---

## Funcionalidades

- Listagem de séries
- Listagem de episódios
- Busca de séries
- Disponibilização de endpoints REST
- Integração com frontend
- Consumo de dados compartilhados com a versão admin

---

## Arquitetura do projeto

O projeto foi organizado utilizando separação em camadas:

- `controller` → responsável pelos endpoints da API REST e comunicação com o frontend
- `service` → contém as regras de negócio e processamento dos dados da aplicação
- `traducao` → responsável pela tradução dos dados recebidos
- `repository` → camada responsável pela comunicação com o banco de dados utilizando Spring Data JPA
- `model` → entidades e modelos da aplicação
- `dto` → objetos utilizados para transferência de dados entre as camadas da aplicação e respostas da API
- `config` → configurações da aplicação, incluindo políticas de CORS para permitir comunicação com o frontend
- `principal` → inicialização e execução da aplicação

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
- Configuração de CORS com `addCorsMappings`
- JPA / Hibernate

---

## Banco de dados

O projeto utiliza dois bancos de dados:

## H2 Database (arquivo)
- Banco local em arquivo
- Utilizado para testes e execução rápida

### Observações importantes

O projeto já está previamente configurado para utilização com o banco **H2 Database** em arquivo.

Algumas séries já foram cadastradas e salvas na pasta de dados da versão administrativa para facilitar a visualização do sistema ao executar a versão web, permitindo que o catálogo já apareça automaticamente no frontend.

Caso deseje adicionar novas séries, basta executar a versão admin, listar as séries já cadastradas e realizar novos cadastros normalmente, evitando duplicidade de registros.

Toda a configuração necessária já está pronta nas duas aplicações. Não é necessário alterar caminhos, bancos ou configurações manualmente.

Após iniciar os projetos, basta acessar a aplicação web pelo navegador através do endereço localhost configurado.

### Em seu navegador acesse:

```bash
http://localhost:8080/h2-console
```
⚠️ Porta da aplicação

É importante saber em qual porta a aplicação está rodando para acessar o console do H2 no navegador.

Por padrão, o Spring Boot utiliza: http://localhost:8080
Mas essa porta pode variar. Para descobrir a porta, ao iniciar a aplicação, verifique o terminal/log. Procure por uma mensagem do Tomcat semelhante a:

Tomcat started on port(s): 8080
O número exibido será a porta da aplicação.

Configurações padrão:
JDBC URL: de acordo com o application properties
User: sa
Password: (vazio)

## PostgreSQL
- Banco principal para persistência real dos dados.
- Alternativa configurável

Caso queira utilizar o PostgreSQL em vez do H2, é necessário configurar corretamente o arquivo `application-prod.properties`.
Nesse arquivo, você deve inserir as informações do seu banco de dados, como:

- URL de conexão  
- Usuário  
- Senha

A configuração do PostgreSQL no projeto está definida utilizando **variáveis de ambiente** no arquivo `application-prod.properties`.

Isso significa que os dados sensíveis (como usuário e senha) **não estão diretamente no código**, o que é a forma mais recomendada. <br>
Para que a aplicação funcione corretamente, você deve:

- Criar as variáveis de ambiente com **os mesmos nomes definidos no projeto**:
  - `DB_URL`
  - `DB_USERNAME`
  - `DB_PASSWORD`

 Alternativa: 
 Caso prefira usar nomes diferentes para as variáveis:
 - Será necessário **alterar também o `application-prod.properties`** para refletir os novos nomes.

### Dúvidas sobre variáveis de ambiente?

Caso tenha dúvidas sobre como criar ou configurar variáveis de ambiente, você pode consultar um outro projeto onde explico esse processo passo a passo.

- [Acesse aqui o guia completo](https://github.com/Kathlynleticia/conversor-de-moedas/tree/main)

---

## Integração com versão Admin

A versão web utiliza o mesmo banco H2 da aplicação administrativa.

Por isso, o arquivo `application-dev.properties` da API aponta para o diretório onde ficam armazenados os dados gerados pela versão admin.

Isso permite que as séries previamente cadastradas sejam exibidas automaticamente no frontend ao iniciar a aplicação.

---

## Tradução de dados

O projeto possui um módulo responsável pela tradução automática das informações vindas da API OMDb utilizando a [MyMemory](https://mymemory.translated.net/) API. O pacote tradução do projeto é responsável por realizar a conversão de dados recebidos de uma API externa para outro idioma. Dessa forma, esse módulo atua como uma camada intermediária que processa e traduz as informações antes de serem utilizadas pelo restante do sistema.

---

## Características da API

- API REST read-only
- Dados compartilhados entre aplicações
- Estrutura baseada em arquitetura em camadas
- Integração com frontend
- Integração com API externa (OMDb e MyMemory)

## Como rodar o projeto (Frontend + Backend)

Este projeto é dividido em duas partes: backend (Java) e frontend (HTML/CSS/JS). Para que tudo funcione corretamente, ambos precisam estar rodando ao mesmo tempo.

### 1. Clonar o repositório

 Primeiro, clone o projeto para sua máquina:

```bash
git clone https://github.com/Kathlynleticia/JustSeries
```
### 2. Rodar o Backend (Java)

 O backend foi desenvolvido em Java (Spring Boot).

Passos:
- Abra a pasta do backend em uma IDE (ex: IntelliJ IDEA ou Eclipse)
- Aguarde o Maven baixar as dependências
- Localize a classe principal (@SpringBootApplication)
- Execute a aplicação

Normalmente, o servidor irá rodar em:

```bash
http://localhost:8080
```
Importante:
O backend precisa estar rodando antes de abrir o frontend, pois é ele que fornece os dados (ex: séries, filmes, etc).

### 3. Rodar o Frontend

O frontend pode ser aberto via VS Code.

Passos:
- Abra a pasta do frontend no VS Code
- Instale a extensão Live Server (Go Live)
- Clique em "Go Live" no canto inferior do VS Code

Isso abrirá o projeto no navegador, geralmente em:

```bash
http://127.0.0.1:5500
```
### 4. Conexão entre Front e Back

Para que os dados apareçam corretamente no frontend:

- O backend deve estar rodando (Spring Boot)
- O frontend faz requisições para http://localhost:8080
- Se o backend estiver desligado, os dados não serão carregados

---
## Demonstração - Execução do Sistema



---

## 🙋🏻 Autora

Kathlyn Santos
