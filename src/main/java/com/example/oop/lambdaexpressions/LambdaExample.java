package com.example.oop.lambdaexpressions;

import java.util.Arrays;
import java.util.List;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Dog(), new Cat());
//        animals.forEach(animal -> animal.sound());
        animals.forEach(Animal::sound);
    }
}
