import com.example.oop.abstractexample.Dog;
import com.example.oop.interfaceexample.Cat;
import com.example.oop.singleton.AnimalManager;

public class Main {
    public static void main(String[] args) {
        // Abstraction
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();

        // Interface
        Cat cat = new Cat();
        cat.walk();

        // Singleton
        AnimalManager manager = AnimalManager.getInstance();
        System.out.println("Singleton instance: " + manager);
    }
}
