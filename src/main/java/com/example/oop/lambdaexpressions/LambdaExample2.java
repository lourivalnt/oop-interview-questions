package com.example.oop.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExample2 {
    public static void main(String[] args) {
        // Lista de nomes
        List<String> names = Arrays.asList("Ana", "Carlos", "Beatriz", "Daniel", "Eduardo");

        // 🔹 1. Usando Predicate (Filtrando nomes que começam com 'A')
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                .filter(startsWithA)
                .toList();

        System.out.println("Nomes que começam com A: " + filteredNames);

        // 🔹 2. Usando Function (Transformando nomes para maiúsculas)
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperNames = names.stream()
                .map(toUpperCase)
                .toList();

        System.out.println("Nomes em maiúsculas: " + upperNames);

        // 🔹 3. Usando Consumer (Imprimindo cada nome)
        Consumer<String> printName = name -> System.out.println("Nome: " + name);
        names.forEach(printName);

        // 🔹 4. Usando Comparator (Ordenando nomes em ordem reversa)
        List<String> sortedNames = names.stream()
                .sorted((a, b) -> b.compareTo(a))
                .toList();

        System.out.println("Nomes em ordem reversa: " + sortedNames);
    }
}
