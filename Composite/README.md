###Composite

Este padrão tem como principio montar uma árvore onde objetos individuais (folhas) e  grupos de objetos (compostos) sejam tratados de maneira igual, ou seja, através da aplicação do polimorfismo realizamos chamadas de objetos na árvore sem se preocupar se o objeto trata-se de uma folha ou de um composto.

#####INTENÇÃO

>“Compor objetos em estruturas de árvore para representarem hierarquias parte-todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.” 

Design Patterns: Elements of Reusable Object-Oriented Software

#####ESTRUTURA/EXEMPLO

Suponha que tenhamos um questionário formado de questões, que podem estar agrupadas em blocos e blocos podem conter outros blocos. Podemos então ter a estrutura a seguir para um questionário:

Bloco A

—– Q1

—– Q2

—– Q3

Bloco B

—– Bloco B1

———- Q4

———- Q5

—– Bloco B2

———- Q6

—– Q7

