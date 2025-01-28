import com.example.oop.abstractexample.AbstractAnimal;
import com.example.oop.abstractexample.Dog;
import com.example.oop.interfaceexample.InterfaceWalkable;
import com.example.oop.interfaceexample.RunnableDog;
import com.example.oop.singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Classe Abstrata
        AbstractAnimal dog = new Dog("Buddy");
        dog.sound();
        dog.sleep();

        // Exemplo de Interface
        InterfaceWalkable walkableDog = new RunnableDog();
        walkableDog.walk();

        // Exemplo de Singleton
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.showMessage();
    }
}
