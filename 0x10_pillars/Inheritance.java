/**
 * 
 * Inheritance (IS-A Relationship)
 * 📌 Think of it as "traits passed from parents to children."
 * 🔹 Example: A Baby inherits features from their Parents 
 * (eye color, height, etc.).
 * 
 * 💡 Why is this useful? Instead of rewriting eat(),
 * Dog inherits it from Animal!
 * 
 */

class Animal {
    void eat() {
        System.out.println("Eating food...");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Own method
    }
}
