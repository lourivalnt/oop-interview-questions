package src.main.java.com.example.oop.abstractexample;

public abstract class AbstractAnimal {
    String name;

    public AbstractAnimal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }



}
