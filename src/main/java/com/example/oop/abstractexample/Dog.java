package src.main.java.com.example.oop.abstractexample;

public class Dog extends AbstractAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Bark!");
    }
}
