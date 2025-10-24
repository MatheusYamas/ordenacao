# Análise de Desempenho de Algoritmos de Ordenação

Este projeto, desenvolvido para a disciplina de Resolução de Problemas Estruturados em Computação, implementa e compara o desempenho de 6 algoritmos de ordenação em Java.

Os algoritmos analisados são:
* Bubble Sort (com flag de parada)
* Selection Sort
* Cocktail Sort
* Gnome Sort
* Comb Sort
* Bucket Sort

A análise de desempenho foi baseada em duas métricas principais:
1.  **Comparações:** O número de vezes que dois elementos foram comparados.
2.  **Trocas:** O número de vezes que elementos trocaram de posição.

Os testes foram executados em três vetores de 20 elementos, representando três cenários:

* **Vetor 1 (Aleatório):** `{12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28}`
* **Vetor 2 (Ordenado):** `{5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32}`
* **Vetor 3 (Invertido):** `{99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}`

## Estrutura do Código

* `Main.java`: Responsável por declarar os vetores, executar os experimentos (chamando os métodos de ordenação com `.clone()`) e imprimir os resultados.
* `Ordenadores.java`: Classe estática que contém a implementação dos 6 algoritmos de ordenação.
* `ResultadoOrdenacao.java`: Classe de dados simples usada para retornar as métricas (`trocas` e `comparacoes`) de cada algoritmo.

## Resultados da Análise

Abaixo estão as tabelas com os dados brutos coletados durante a execução dos testes.

### Tabela 1: Total de Comparações (Interações)

Esta tabela ranqueia os algoritmos pelo número de comparações.

| Algoritmo | Vetor 1 (Aleatório) | Vetor 2 (Ordenado) | Vetor 3 (Invertido) |
| :--- | :---: | :---: | :---: |
| **Bucket Sort** | **65** | **49** | **23** |
| **Comb Sort** | 129 | 110 | 129 |
| **Cocktail Sort** | 154 | 19 | 190 |
| **Gnome Sort** | 174 | 19 | 380 |
| **Bubble Sort** | 180 | 19 | 190 |
| **Selection Sort** | 190 | 190 | 190 |

### Tabela 2: Total de Trocas de Elementos

Esta tabela ranqueia os algoritmos pelo número de trocas.

| Algoritmo | Vetor 1 (Aleatório) | Vetor 2 (Ordenado) | Vetor 3 (Invertido) |
| :--- | :---: | :---: | :---: |
| **Bucket Sort** | **12** | **0** | **7** |
| **Selection Sort** | 18 | **0** | 10 |
| **Comb Sort** | 22 | **0** | 18 |
| **Bubble Sort** | 78 | **0** | 190 |
| **Cocktail Sort** | 78 | **0** | 190 |
| **Gnome Sort** | 78 | **0** | 190 |

## Conclusões: Quem foi melhor e para qual situação?

Com base nas tabelas, podemos tirar várias conclusões importantes:

### Bucket Sort

O **Bucket Sort** foi o vencedor absoluto em **todos os cenários**, tanto em comparações quanto em trocas. Isso se deve à sua abordagem $O(n)$ de "distribuição", que evita a maioria das comparações diretas. O custo real foi apenas o de ordenar os pequenos baldes internos (usando o Selection Sort), o que foi trivial para os dados fornecidos.

### Comb Sort

O **Comb Sort** provou ser uma melhoria drástica sobre o Bubble Sort. Ele foi o segundo melhor em quase todos os cenários, especialmente no vetor invertido (pior caso), onde superou os algoritmos $O(n^2)$ com folga.

---