# README - ETAPA 3 - Documentação

# Teste de Caixa Preta - Documentação do Código

## Visão Geral

Este projeto contém uma classe Java chamada "User" que é responsável por estabelecer uma conexão com um banco de dados MySQL, verificar a existência de um usuário com base em um login e senha fornecidos e obter o nome do usuário, caso exista. O código é documentado para facilitar a compreensão e manutenção.

## Funcionalidades

O código da classe "User" fornece as seguintes funcionalidades:

1. **Conexão com o Banco de Dados**

   - O método `conectarBD()` estabelece uma conexão com um banco de dados MySQL. Ele retorna uma conexão válida ou `null` em caso de erro.

2. **Verificação de Usuário**

   - O método `verificarUsuario(String login, String senha)` verifica se um usuário com as credenciais fornecidas existe no banco de dados. Ele retorna `true` se o usuário existe e `false` caso contrário.

## Requisitos

Para usar este código, você deve ter:

- Uma instalação do MySQL Server.
- A biblioteca JDBC para conectar ao banco de dados MySQL.

## Uso

1. Certifique-se de ter atendido aos requisitos mencionados acima.

2. Modifique o valor da variável `url` no método `conectarBD()` para apontar para o seu banco de dados.

3. Chame o método `verificarUsuario(String login, String senha)` com as credenciais que deseja verificar.

4. Verifique a variável `result` para determinar se a verificação do usuário foi bem-sucedida.

5. Se `result` for `true`, você pode acessar o nome do usuário na variável `nome`.

## Exceções

O código trata possíveis erros, como exceções durante a conexão com o banco de dados.
---
