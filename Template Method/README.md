### Template Method

O padrão Template Method basicamente oferece um método que define um algoritmo (uma sequência de passos) que pode, por sua vez, ser definido como abstrato para posteriormente ser implementado por uma subclasse. Pode-se notar que a estrutura do algoritmo fica inalterada mesmo com as subclasses fazendo parte da implementação.

##### INTENÇÃO

>"Definir o esqueleto de um algoritmo em uma operação, postergando alguns passos para as subclasses. Template Method permite que subclasses redefinam certos passo de um algoritmo sem mudar a estrutura do mesmo." 

GAMMA, Erich et al. Padrões de Projeto: Soluções reutilizáveis de software orientado a objetos

##### ESTRUTURA/EXEMPLO

Suponha um player de música que oferece várias maneiras de reproduzir as músicas de uma playlist. Para exemplificar suponha que podemos reproduzir a lista de músicas da seguinte maneira:

Ordenado por nome da música

Ordenado por nome do Autor

Ordenado por ano

Ordenado por estrela (preferência do usuário)

[Exemplo](https://bit.ly/2ZNZfQi)
