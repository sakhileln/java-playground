/**
 * Composition (HAS-A Relationship)
 * 📌 Think of it as "building with LEGO blocks."
 * 🔹 Example: A Car is made up of an 
 * Engine, Wheels, and Seats. The car HAS-A engine. 
 * 💡 Why is this useful? Instead of making Car do 
 * everything, we create smaller classes (Engine, Wheels) and combine them!
 */


class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    Engine engine = new Engine();  // Car has an Engine

    void startCar() {
        engine.start();
        System.out.println("Car is ready to go!");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
