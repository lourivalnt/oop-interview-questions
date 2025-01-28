package com.example.oop.interfaceexample;

public class RunnableDog implements InterfaceWalkable {
    @Override
    public void walk() {
        System.out.println("The dog is walking.");
    }
}