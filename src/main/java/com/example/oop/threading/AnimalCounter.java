package com.example.oop.threading;

public class AnimalCounter {
    private volatile int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
