
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
2. Compile o projeto com Maven.
3. Execute a classe `Main` para ver os exemplos em execução.

## Perguntas e Respostas

### 1️⃣ Qual é a diferença entre uma classe abstrata e uma interface em termos de design?
- **Classe abstrata:** Serve como um modelo base que pode incluir métodos concretos e abstratos. É usada quando queremos compartilhar parte do comportamento entre classes relacionadas. É estendida com a palavra-chave extends, suporta herança única (uma classe só pode estender uma classe abstrata).
- **Interface:** Define apenas contratos (assinaturas de métodos). A partir do Java 8, pode ter métodos `default` e `static`. É usada para garantir que diferentes classes implementem um conjunto de funcionalidades, independentemente de estarem na mesma hierarquia.  implementada com a palavra-chave implements, suporta múltiplas implementações (uma classe pode implementar várias interfaces).

**Exemplo:**
```java
abstract class Animal {
    abstract void sound(); // Método abstrato
    void sleep() {         // Método concreto
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

interface Walkable {
    void walk();
}

class Cat implements Walkable {
    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }
}
```

---

### 2️⃣ Explique o conceito de polimorfismo com um exemplo em Java.
- **Polimorfismo:** É a habilidade de um objeto se comportar de diferentes formas, dependendo do contexto. Ele pode ser de dois tipos:
  - **Polimorfismo em tempo de compilação (sobrecarga).**
  - **Polimorfismo em tempo de execução (substituição).**

**Exemplo de polimorfismo de sobrecarga em Java:**
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.add(2, 3); // resultado: 5
        double result2 = calc.add(2.5, 3.7); // resultado: 6.2
        String result3 = calc.add("Hello", "World"); // resultado: "HelloWorld"

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```
Nesse exemplo, o método add é chamado com diferentes tipos de parâmetros (inteiros, double e strings), e o método que é executado é o que melhor se adapta ao tipo de parâmetro passado. Isso é o polimorfismo de sobrecarga!

**Exemplo de polimorfismo de substituição em Java:**
```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public static void main(String[] args) {
    Animal animal = new Dog();
    animal.makeSound(); // resultado: "Dog barks"

    animal = new Cat();
    animal.makeSound(); // resultado: "Cat meows"
}
```
Nesse exemplo, a classe Dog e Cat redefine o método sound herdado da classe Animal, emitindo um som específico para cada animal. Isso permite que o método seja chamado com um objeto Dog e Cat, retornando um resultado diferente do que seria se fosse chamado com um objeto Animal.

---

### 3️⃣ Como o Java consegue sobrecarga e substituição de método?
- **Sobrecarga:** Permite definir métodos com o mesmo nome, mas assinaturas diferentes (diferente número ou tipo de argumentos).
- **Substituição:** Uma classe filha redefine um método da classe pai, permitindo comportamento específico.

**Exemplo:**
```java
class Animal {
    // Sobrecarga
    void sound() {
        System.out.println("Generic sound");
    }

    void sound(String type) {
        System.out.println("Sound of " + type);
    }
}

class Dog extends Animal {
    @Override
    void sound() { // Substituição
        System.out.println("Bark");
    }
}
```

---

### 4️⃣ Qual é o propósito da palavra-chave `instanceof` em Java?
- **`instanceof`:** Verifica se um objeto pertence a uma classe específica ou implementa uma interface. É usado para evitar `ClassCastException` ao realizar conversões.

**Exemplo:**
```java
Animal animal = new Dog();
if (animal instanceof Dog) {
    System.out.println("Animal is a Dog");
}
```

---

### 5️⃣ Qual é a diferença entre cópia superficial e cópia profunda?
- **Cópia superficial:** Copia apenas referências para os objetos internos, não os objetos em si.
- **Cópia profunda:** Cria novas instâncias dos objetos referenciados, garantindo independência.

**Exemplo:**
```java
class Address {
    String city;
}

class Animal implements Cloneable {
    String name;
    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Cópia superficial
        return super.clone();
    }

    protected Animal deepClone() throws CloneNotSupportedException {
        // Cópia profunda
        Animal cloned = (Animal) super.clone();
        cloned.address = new Address();
        cloned.address.city = this.address.city;
        return cloned;
    }
}
```

---

### 6️⃣ Explique o conceito de encapsulamento com um exemplo.
- **Encapsulamento:** É a prática de esconder detalhes internos de uma classe, expondo apenas os métodos necessários. Ele protege o estado interno contra acessos ou modificações não autorizados.

**Exemplo:**
```java
class Animal {
    private String name; // Estado oculto

    public String getName() { // Acesso controlado
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

### 7️⃣ O que é uma classe singleton e como você a implementa em Java?
- **Singleton:** Garante que apenas uma instância de uma classe seja criada em toda a aplicação. É usado para recursos compartilhados, como gerenciadores de conexão.

**Exemplo:**
```java
class AnimalManager {
    private static AnimalManager instance;

    private AnimalManager() {} // Construtor privado

    public static AnimalManager getInstance() {
        if (instance == null) {
            instance = new AnimalManager();
        }
        return instance;
    }
}
```

---

### 8️⃣ Qual é o significado da palavra-chave `volatile` em multithreading?
- **`volatile`:** Garante que a variável seja lida diretamente da memória principal, não de caches de threads. Isso assegura visibilidade entre threads.

**Exemplo:**
```java
class AnimalCounter {
    private volatile int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
```

---

### 9️⃣ Como você lida com exceções em Java usando exceções personalizadas?
- **Exceções personalizadas:** São usadas para criar erros específicos do domínio ou da aplicação, melhorando a clareza e o tratamento de erros.

**Exemplo:**
```java
class AnimalException extends Exception {
    public AnimalException(String message) {
        super(message);
    }
}

class AnimalService {
    void checkSound(String sound) throws AnimalException {
        if (sound == null || sound.isEmpty()) {
            throw new AnimalException("Sound is invalid");
        }
        System.out.println("Sound: " + sound);
    }
}
```

---

### 🔟 O que são expressões Lambda em Java e como elas melhoram a legibilidade do código?
- **Expressões Lambda:** Introduzidas no Java 8, permitem passar comportamentos como argumentos para métodos de forma concisa. Elas reduzem a verbosidade no uso de interfaces funcionais.

**Exemplo:**
```java
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Dog(), new Cat());
        animals.forEach(animal -> animal.sound());
    }
}
```
