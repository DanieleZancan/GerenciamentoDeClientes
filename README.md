# Gerenciamento de Clientes em Java

Criação de um projeto em Java para gerenciar informações de clientes. O sistema permite que o usuário cadastre, edite, visualize e exclua dados de clientes, como nome, e-mail e telefone. O objetivo principal é fornecer uma interface simples para a gestão de dados de clientes em um CRUD (Create, Read, Update, Delete).

## Funcionalidades

- **Cadastrar Cliente**: Permite o cadastro de novos clientes, fornecendo informações como nome, e-mail e telefone.
- **Listar Clientes**: Exibe uma lista com os clientes cadastrados, mostrando o ID, nome, e-mail e telefone.
- **Editar Cliente**: Permite a atualização de dados de clientes já cadastrados. O sistema pedirá para deixar os campos em branco caso não deseje fazer alterações.
- **Excluir Cliente**: Permite excluir um cliente da lista.
  
## Tecnologias Usadas

- **Java**: A linguagem principal utilizada para o desenvolvimento do sistema.
- **Scanner**: Para interação com o usuário via console.
  
## Pré-requisitos

Antes de rodar o projeto, é necessário ter o Java instalado em sua máquina. Caso não tenha, você pode fazer o download do JDK no [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

## Como Executar

1. **Clone o repositório:**

```bash
git clone https://github.com/DanieleZancan/GerenciamentoDeClientes.git
   
2. **Entre no diretório do projeto:**

cd GerenciamentoDeClientes

3. **Abra o projeto em sua IDE preferida.**

4. **Execute a classe Principal.java.**

O sistema iniciará e você verá as opções no console. Escolha uma opção para gerenciar os clientes (adicionar, listar, editar, excluir).

## Estrutura de Pastas
**Cliente.java:** Classe que representa o modelo de cliente.
**Principal.java:** Classe principal onde a lógica do sistema é executada.
