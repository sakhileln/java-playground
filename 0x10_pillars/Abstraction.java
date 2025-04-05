/**
 * Abstraction (Hiding Details)
 * 📌 Think of it as a TV remote. You press buttons,
 * but you don’t need to know how the TV works inside.
 * 🔹 Example: If you drive a car, you just turn the key
 * and press the gas pedal. You don’t need to know 
 * how the engine works internally.
 * 
 * 💡 Why is this useful? We only show the important 
 * parts and hide the complex details.
 */

abstract class Animal {
    abstract void makeSound();  // We don't care HOW it makes sound, just that it does
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Woof! Woof!
    }
}
