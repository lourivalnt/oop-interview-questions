import com.example.oop.abstractexample.Dog;
import com.example.oop.customexception.AnimalException;
import com.example.oop.customexception.AnimalService;
import com.example.oop.interfaceexample.Cat;
import com.example.oop.polymorphism.Calculator;
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

        Calculator calculator = new Calculator();
        System.out.println("Sum (int): " + calculator.add(2, 3));
        System.out.println("Sum (double): " + calculator.add(2.5, 3.5));

        // Singleton
        AnimalManager manager1 = AnimalManager.getInstance();
        AnimalManager manager2 = AnimalManager.getInstance();
        System.out.println("Singleton instance: " + (manager1 == manager2));

        try {
            AnimalService service = new AnimalService();
            service.checkSound("");
        } catch (AnimalException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
