package com.example.oop.encapsulation;

class Animal {
    private String name; // Estado oculto

    public String getName() { // Acesso controlado
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}