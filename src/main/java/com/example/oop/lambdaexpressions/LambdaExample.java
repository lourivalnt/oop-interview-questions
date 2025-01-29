package com.example.oop.lambdaexpressions;

import java.util.function.Consumer;

class LambdaExample {
    public static void main(String[] args) {
        Consumer<String> animalSound = animal -> System.out.println(animal + " makes a sound");
        animalSound.accept("Dog");
        animalSound.accept("Cat");
    }
}
