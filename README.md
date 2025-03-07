# Projeto de Dependência Cíclica entre Classes

## Descrição

Este projeto foi desenvolvido com o objetivo de **compreender e explorar o conceito de dependência cíclica entre classes** em Java. Através deste estudo, o foco foi entender as implicações de criar uma relação de dependência direta entre duas ou mais classes e como isso pode afetar o design e a estrutura do código. O projeto também ilustra a importância de **classes auxiliares** para resolver problemas de dependência cíclica e como evitar complicações relacionadas ao gerenciamento de objetos em sistemas orientados a objetos.

## Objetivo

- Demonstrar como a **dependência cíclica** entre classes pode ser um problema em projetos de software, criando um loop infinito de criação de objetos.
- Entender como **classes auxiliares** podem ser usadas como mediadoras para quebrar a dependência cíclica, permitindo que as classes interajam sem causar problemas de instância.
- Melhorar o design de sistemas orientados a objetos, aplicando boas práticas para reduzir complexidade e aumentar a manutenção do código.

## Como Funciona

No início do projeto, as **Classes Deposito** e **ConsultarCheque** possuíam uma relação direta entre si, ou seja, cada uma criava uma instância da outra, criando um ciclo infinito de dependências.

Após analisar o problema, **uma terceira classe** foi introduzida para orquestrar a criação dos objetos, quebrando a dependência cíclica. A **terceira classe** gerencia as instâncias de `Deposito` e `ConsultarCheque` e fornece os métodos necessários para que as classes se comuniquem sem criar um ciclo de dependência direta.

## Solução de Dependência Cíclica

1. **Classes originais**: Inicialmente, as classes **Deposito** e **ConsultarCheque** possuíam dependência cíclica, o que resultava em um comportamento problemático.
2. **Classe Auxiliar**: Foi criada uma terceira classe para mediar a criação das instâncias e a comunicação entre **Deposito** e **ConsultarCheque**.
3. **Métodos de Interação**: Os métodos de ambas as classes **Deposito** e **ConsultarCheque** foram adaptados para interagir de maneira indireta, através de parâmetros passados pela classe auxiliar.

## Lições Aprendidas

- **Importância de observar as dependências entre classes**: Antes de criar um sistema, é crucial analisar como as classes se interagem e garantir que não haja dependências circulares que possam prejudicar o fluxo da aplicação.
- **A utilidade de classes auxiliares**: Classes auxiliares podem ajudar a orquestrar a criação e interação de objetos, evitando ciclos problemáticos e tornando o código mais modular e de fácil manutenção.
- **Simplicidade e eficiência**: Com a introdução de classes auxiliares, conseguimos simplificar o design do sistema e aumentar sua flexibilidade, sem comprometer a funcionalidade.

## Conclusão

Este projeto enfatiza a importância de observar as dependências de classes e como gerenciá-las de maneira eficiente. **Quebrar a dependência cíclica** através do uso de classes auxiliares é uma solução simples e poderosa que pode melhorar significativamente a legibilidade e a manutenção do código. 

Neste projeto em particular, a dependência cíclica foi percebida entre as classes **Deposito** e **ConsultarCheque**, e foi solucionada com a introdução de uma classe intermediária para gerenciar a comunicação entre elas.
