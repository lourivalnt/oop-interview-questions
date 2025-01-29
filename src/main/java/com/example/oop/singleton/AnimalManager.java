package com.example.oop.singleton;

public class AnimalManager {
    private static AnimalManager instance;

    private AnimalManager() {}

    public static AnimalManager getInstance() {
        if (instance == null) {
            instance = new AnimalManager();
        }
        return instance;
    }
}
