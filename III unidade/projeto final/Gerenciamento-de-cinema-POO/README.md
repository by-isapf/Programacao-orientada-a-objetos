# Sistema de Gerenciamento de Cinema 🎬

Sistema desenvolvido em Java para o gerenciamento de rotinas operacionais de um cinema, aplicando os quatro pilares da Programação Orientada a Objetos (POO).

## 📝 Sobre o Projeto

Este projeto foi desenvolvido como requisito para a conclusão da disciplina de Programação Orientada a Objetos do curso de Bacharelado Interdisciplinar em Tecnologia da Informação da UFERSA, ministrada pelo professor Bruno Borger.

O sistema visa centralizar e organizar informações essenciais, como o cadastro de filmes, controle de sessões, gerenciamento de salas, venda de produtos (lanches) e administração de funcionários e gerentes. O foco principal é a aplicação de boas práticas de desenvolvimento, modularidade e segurança de dados através do encapsulamento.

## 🚀 Funcionalidades

O sistema atende aos seguintes Requisitos Funcionais (RF):

* **Gestão de Filmes:** Cadastro, listagem e detalhamento de filmes (Título, Duração, Classificação).
* **Gestão de Salas:** Controle de salas de exibição, incluindo capacidade e suporte a 3D.
* **Gestão de Sessões:** Organização da grade de horários (Planejado).
* **Venda de Produtos:** Controle de estoque e venda de itens da bomboniere (Pipoca, Refrigerante, etc.).
* **Gestão de Pessoas:**
    * **Funcionários:** Cadastro com cargos e salários específicos.
    * **Gerentes:** Acesso administrativo e gestão de departamentos.
* **Controle de Acesso:** Sistema de login e permissões baseadas em cargos (Polimorfismo).

## 🛠 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Orientação a Objetos
* **Versionamento:** Git & GitHub

## 🧩 Arquitetura e Aplicação de POO

Conforme detalhado na documentação do projeto, a estrutura do código reflete fielmente os conceitos de POO:

### 1. Encapsulamento
Todos os atributos das classes (como `salario` em `Funcionario` ou `capacidadeTotal` em `SalaExibicao`) são privados (`private`). O acesso e validação são feitos estritamente via Getters e Setters, garantindo a integridade dos dados (ex: impedir cadastro de idade ou preço negativo).

### 2. Herança
Utilizada para evitar repetição de código e criar hierarquias lógicas:
* `Pessoa` (Classe Mãe) -> Herdada por `Funcionario` e `Gerente`.
* `Produto` (Classe Mãe) -> Herdada por `Lanche`.

### 3. Abstração
Classes como `Pessoa` e `Produto` são abstratas (`abstract`), impedindo a criação de objetos genéricos e forçando a especialização nas classes filhas. Isso garante que o sistema lide apenas com entidades concretas (ex: Vender um "Lanche", e não um "Produto" genérico).

### 4. Polimorfismo
O sistema trata objetos de formas diferentes dependendo do contexto. Exemplo:
* Método `exibirDetalhes()`: Comporta-se de maneira diferente se chamado por um `Filme` ou por um `Lanche`.
* Listas Genéricas: O `GerenciadorPessoa` manipula uma lista de `Pessoa`, aceitando tanto `Gerente` quanto `Funcionario` na mesma estrutura.

## 📊 Modelagem de Dados

O projeto baseou-se em uma modelagem sólida para garantir a consistência das informações.

### Modelo Conceitual
*(Insira a imagem do Modelo Conceitual do PDF aqui, se desejar)*

### Modelo Lógico
*(Insira a imagem do Modelo Lógico do PDF aqui, se desejar)*

## 👥 Autores

* **Caio Fontes Soares**
* **Francisco Porfírio de Oliveira Neto**
* **Íngridy Duarte Costa**
* **Isabel de Paiva Freire**
* **Ítallo Vicente de Mesquita**
* **Maycon Soares Maia**
* **Pedro Henrique Pereira de Sousa**


---

## 📄 Licença

Este projeto está sob a licença [MIT](./LICENSE).
