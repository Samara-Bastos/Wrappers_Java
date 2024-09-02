# Comparação de Tipos Primitivos e Wrappers em Java

## Descrição

Este projeto demonstra a comparação entre tipos primitivos e seus respectivos wrappers em Java. Utilizando o Lombok para simplificar a criação de instâncias da classe ComparacaoPrimitivosEWrappers, o projeto explora como valores iniciais e comparações são tratados para tipos primitivos e wrappers.

## Tipos Primitivos e Wrappers
- Tipos Primitivos
- Os tipos primitivos em Java são tipos de dados simples que armazenam valores diretamente. Eles são:

    - int: para valores inteiros.
    - double: para valores de ponto flutuante.
    - boolean: para valores lógicos (true ou false).
    - char: para caracteres individuais.

- Wrappers
- Os wrappers são classes que encapsulam (ou "envolvem") os tipos primitivos em objetos. Eles fornecem métodos úteis e permitem que os tipos primitivos sejam usados em contextos que exigem objetos. Os wrappers correspondentes são:

    - Integer: para o tipo primitivo int.
    - Double: para o tipo primitivo double.
    - Boolean: para o tipo primitivo boolean.
    - Character: para o tipo primitivo char.

## Funcionalidade do Programa
O programa App realiza testes para ilustrar a diferença entre o uso de tipos primitivos e wrappers. Aqui está um resumo dos testes realizados:

- Teste 01 - Valores Iniciais das Variáveis
Este teste exibe os valores iniciais das variáveis da classe ComparacaoPrimitivosEWrappers quando não são inicializadas. Os valores iniciais são:

Wrappers: null
Primitivos: valores iniciais (0, 0.0, false, \u0000)

- Teste 02 - Comparação de Números Inteiros Wrapper
Compara um Integer inicializado diretamente com um Integer inicializado através de autoboxing. Ambos são comparados utilizando o método equals e o operador ==.

- Teste 03 - Comparação de Números Inteiros Primitivos
Compara um int primitivo com outro valor int primitivo utilizando o operador ==.

- Teste 04 - Comparação de Valores Booleanos Wrapper
Compara um Boolean inicializado diretamente com um Boolean inicializado através de autoboxing. A comparação é feita utilizando o método equals e o operador ==.

- Teste 05 - Comparação de Valores Booleanos Primitivos
Compara um valor boolean primitivo com outro valor boolean primitivo utilizando o operador ==.

## Observação

- Ao utilizar o operador == com uma classe Wrapper, estamos comparando as referências de memória dos objetos e não os valores que eles armazenam. Isso significa que, quando criamos um novo objeto Wrapper usando um construtor, que atualmente é considerado menos recomendado, a comparação com outro objeto Wrapper pode resultar em false se as referências de memória não coincidirem, mesmo que os valores armazenados sejam iguais. Para comparar os valores armazenados nos objetos Wrapper, deve-se utilizar o método equals, que é projetado para comparar os conteúdos dos objetos.

- As classes wrappers podem armazenar valores null, o que permite representar a ausência de valor. Isso é útil em situações onde um valor nulo é uma condição válida e precisa ser tratado.Já os tipos primitivos não podem armazenar null. Em vez disso, eles têm valores padrão definidos pela linguagem Java, como 0 para int, 0.0 para double, e false para boolean.