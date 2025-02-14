# ufc-poo-projeto
Projeto para a disciplina de Programação Orientada a Objetos (CK0282) - T01 2024.2

# 📽️ Sistema de Streaming de Filmes

## 📌 Sobre o Projeto
Este projeto visa simular um sistema de compra e streaming de filmes, semelhante ao Amazon Prime Video. O sistema será desenvolvido em **Java** e utilizará **boas práticas de desenvolvimento**, como **arquitetura em camadas** para modularização eficiente, aumentando a coesão e diminuindo a dependência entre os módulos.

Além disso, o projeto aproveitará conceitos de **Programação Orientada a Objetos (POO)**, bem como **recursos nativos da linguagem Java**, como **Java.IO e Java.Utils**. Utilizaremos, também, **Java Swing** para desenvolver uma **interface gráfica interativa**, permitindo que os usuários naveguem pelo sistema de forma intuitiva. A interface oferecerá funcionalidades como **busca por filmes, autenticação de usuários e gerenciamento de compras**, garantindo uma experiência mais acessível e dinâmica.


## 🚀 Tecnologias Utilizadas
- **Java** (linguagem principal)
- **Spring Framework** (para estruturação e integração de componentes)
- **Maven** (gerenciador de dependências)
- **Jackson-Databind** (para manipulação de JSON)
- **OMDb API** (para busca dinâmica de filmes)
- **Arquivos de persistência** (para armazenar estados e usuários)

## 👥 Integrantes
- **André Lima Peixoto**
- **Arthur Lopes Pamplona**
- **David Baima Monte**
- **Filipe Alcantara da Costa**
- **Lídio Alves da Silva Neto**

## 🏗️ Estrutura do Projeto
A organização do projeto segue uma arquitetura modular, dividida nas seguintes camadas:

### 📂 Migrations
Armazena o histórico das alterações feitas nos arquivos de persistência de dados.

### 📂 Services
Contém classes auxiliares que implementam a lógica central da aplicação.
- **`IConverteDado`** → Interface genérica para conversão de tipos de dados.
- **`ConverteDado`** → Implementação da interface `IConverteDado`.
- **`ConsumidorAPI`** → Responsável pela comunicação HTTP com APIs externas (OMDb API).
- **`Autenticador`** → Gerencia a autenticação e recuperação de usuários do sistema.
- **`GerenciadorDeEstado`** → Carrega e mantém o estado do usuário autenticado.

### 📂 Entities
Contém as classes que representam os principais objetos do sistema.
- **`Filme`** → Representa um filme disponível no sistema.
- **`DadosFilme (Record)`** → Facilita a conversão dos dados obtidos da OMDb API.
- **`Usuário`** → Representa um usuário cadastrado no sistema.
- **`Estado`** → Define o estado atual do usuário autenticado.
- **`Menu`** → Centraliza as funcionalidades da aplicação.

### 📂 Controllers
Intermedeiam a comunicação entre os serviços internos e o usuário.
- **`Controller (abstrata)`** → Define os métodos básicos para os controladores.
- **`FilmeController`** → Controlador para operações relacionadas a filmes.
- **`UserController`** → Controlador para operações relacionadas a usuários.

### 📂 Tables
Armazena os arquivos de persistência de dados.
- **`EstadoPersist`** → Persiste informações sobre o estado do usuário.
- **`UserPersist`** → Persiste informações sobre os usuários cadastrados.  

### 📂 GUI
Armazena as classes referente aos componentes da interface gráfica.