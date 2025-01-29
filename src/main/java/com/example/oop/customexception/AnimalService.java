package com.example.oop.customexception;

public class AnimalService {
    public void checkSound(String sound) throws AnimalException {
        if (sound == null || sound.isEmpty()) {
            throw new AnimalException("Sound is invalid");
        }
        System.out.println("Sound: " + sound);
    }
}
