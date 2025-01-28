# OOP Interview Questions - Java Examples

Este projeto contém exemplos de implementações de conceitos importantes de Programação Orientada a Objetos (OOP) em Java, abordando:
- Classes abstratas
- Interfaces
- Singleton
- Polimorfismo
- Sobrecarga e sobrescrita
- Exceções personalizadas
- Expressões Lambda
- Conceitos de multithreading (`volatile`)

## Estrutura
- **`abstractexample`**: Exemplos de classes abstratas.
- **`interfaceexample`**: Exemplos de interfaces.
- **`singleton`**: Implementação do padrão Singleton.
- **`main`**: Classe principal para executar os exemplos.

## Como executar
1. Clone o repositório.
3. Execute a classe `Main` para ver os exemplos em execução.

4. OOP Interview Questions - Java Examples

Este projeto contém exemplos de implementações de conceitos importantes de Programação Orientada a Objetos (OOP) em Java, abordando:

Classes abstratas

Interfaces

Singleton

Polimorfismo

Sobrecarga e sobrescrita

Exceções personalizadas

Expressões Lambda

Conceitos de multithreading (volatile)

Estrutura

abstractexample: Exemplos de classes abstratas.

interfaceexample: Exemplos de interfaces.

singleton: Implementação do padrão Singleton.

polymorphism: Demonstrações de polimorfismo.

methodoverloading: Exemplos de sobrecarga de métodos.

methodoverriding: Exemplos de sobrescrita de métodos.

encapsulation: Demonstração do conceito de encapsulamento.

customexception: Implementação de exceções personalizadas.

lambdaexpressions: Uso de expressões Lambda para simplificar operações.

shallowdeepcopy: Comparação entre cópia superficial e cópia profunda.

threading: Demonstração do uso da palavra-chave volatile em multithreading.

main: Classe principal para executar os exemplos.

Como executar

Clone o repositório:

git clone <URL_DO_REPOSITORIO>

Compile o projeto com Maven:

mvn clean install

Execute a classe Main para ver os exemplos em execução:

java -cp target/oop-interview-project-1.0.jar com.example.oop.Main

Perguntas e Respostas

1. Qual é a diferença entre uma classe abstrata e uma interface em termos de design?

Classe abstrata: Permite métodos abstratos e concretos. Use-a quando você deseja fornecer uma base comum com algum comportamento compartilhado e estender a funcionalidade.

abstract class AbstractAnimal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends AbstractAnimal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

Interface: Contém apenas métodos abstratos (antes do Java 8) ou métodos abstratos, métodos default e métodos estáticos (a partir do Java 8). Use-a para definir um contrato sem impor uma hierarquia rígida.

interface Walkable {
    void walk();
}

class Cat implements Walkable {
    @Override
    public void walk() {
        System.out.println("Walking like a cat...");
    }
}

2. Explique o conceito de polimorfismo com um exemplo em Java.

Polimorfismo permite que objetos de diferentes classes sejam tratados de forma uniforme através de uma interface ou classe base.

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

3. Como o Java consegue sobrecarga e substituição de método?

Sobrecarga (Overloading): Permite criar vários métodos com o mesmo nome, mas assinaturas diferentes.

Substituição (Overriding): Permite que uma classe filha forneça sua própria implementação para um método da classe pai.

4. Qual é o propósito da palavra-chave instanceof em Java?

instanceof verifica se um objeto é uma instância de uma classe específica ou de uma classe que implementa/estende a classe/interface.

5. Qual é a diferença entre cópia superficial e cópia profunda?

Cópia superficial (Shallow Copy): Copia os campos primitivos e referências de objetos, mas não os objetos referenciados.

Cópia profunda (Deep Copy): Copia completamente os campos e objetos referenciados, criando novas instâncias dos objetos.

6. Explique o conceito de encapsulamento com um exemplo.

Encapsulamento é o conceito de esconder detalhes internos e expor apenas o que é necessário.

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

7. O que é uma classe singleton e como você a implementa em Java?

Singleton garante que apenas uma instância de uma classe seja criada.

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

8. Qual é o significado da palavra-chave volatile em multithreading?

volatile garante visibilidade de mudanças em uma variável entre threads. Sem isso, as threads podem usar valores armazenados em cache.

9. Como você lida com exceções em Java usando exceções personalizadas?

Crie uma classe que estenda Exception ou RuntimeException.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

10. O que são expressões Lambda em Java e como elas melhoram a legibilidade do código?

Expressões Lambda permitem escrever funções anônimas de maneira concisa. Elas simplificam o uso de interfaces funcionais.

List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
numbers.forEach(n -> System.out.println(n));


