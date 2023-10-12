# README - Análise de Código em Java

Este é um código Java que lida com autenticação de usuário em um banco de dados. Aqui estão algumas observações sobre o código:

1. **Documentação**:
   - A falta de documentação torna difícil entender a finalidade de cada método e variável. É recomendável adicionar comentários descritivos para melhorar a compreensão do código.

2. **Nomenclatura de Variáveis**:
   - As variáveis "nome" e "result" não seguem as convenções de nomenclatura Java. Recomenda-se usar camelCase, por exemplo, "nome" pode ser renomeado para "nomeUsuario" e "result" para "resultado".

3. **Legibilidade e Organização**:
   - O código carece de indentação adequada e a concatenação de strings para formar instruções SQL torna-o difícil de ler e propenso a erros. Recomenda-se organizar o código com indentação consistente e usar placeholders para instruções SQL.

4. **Tratamento de Null Pointers**:
   - O código não trata adequadamente as exceções que podem levar a null pointers, como exceções durante a obtenção da conexão com o banco de dados. É importante adicionar tratamento de exceções apropriado.

5. **Arquitetura**:
   - Não é possível avaliar completamente a arquitetura apenas com o código fornecido. No entanto, a conexão direta com o banco de dados pode não ser a melhor prática, dependendo dos requisitos do sistema.

6. **Fechamento de Conexões**:
   - O código não fecha as conexões, os statements e os result sets após o uso. Isso pode causar vazamentos de recursos e problemas de desempenho. Certifique-se de adicionar blocos "finally" ou usar a declaração "try-with-resources" para fechar recursos corretamente.


# README - ETAPA 2 - Critérios de Caixa Branca - (Grafo de Fluxo; Complexidade Ciclomática; Base de Caminhos)

## Grafo de fluxo:

![ac2 ohata](https://github.com/ThallesRodriguess/teste_caixa_branca/assets/105616515/7b8590c9-e4ec-4010-b564-adfd1d06bad8)

## Cálculo da Complexidade Ciclomática

Para determinar a complexidade ciclomática do código, utilizamos a fórmula:

v(g) = (arestas - nós) + 2

Onde:
- Arestas: 24
- Nós: 22

Substituindo os valores na fórmula:


- v(g)=(arestas-nós)+2

- v(g)=(24-22)+2

- v(g)=4


Portanto, a complexidade ciclomática é igual a 4.

### Caminhos

A seguir, listamos os caminhos identificados no código:

1. Caminho 1: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 18, 21, 22
2. Caminho 2: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22
3. Caminho 3: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19, 20, 21, 22
4. Caminho 4: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22

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
