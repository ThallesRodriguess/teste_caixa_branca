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


v(g)=(arestas-nós)+2

v(g)=(24-22)+2

v(g)=4


Portanto, a complexidade ciclomática é igual a 4.

### Caminhos

A seguir, listamos os caminhos identificados no código:

1. Caminho 1: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 18, 21, 22
2. Caminho 2: 1, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22
3. Caminho 3: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 19, 20, 21, 22
4. Caminho 4: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 21, 22


