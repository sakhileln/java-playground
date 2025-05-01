/**
 * 
 * Polymorphism (Many Forms)
 * Think of it as a superhero with multiple disguises.
 * One hero, but different identities.
 * 🔹 Example: A phone can be used for calling, gaming, and
 * taking pictures—it behaves differently based on how you use it.
 * 
 * Method Overriding (Same method, different behavior)
 * 
 * 💡 Why is this useful? The same method (makeSound())
 * works differently for different animals.
 */

class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

class Cat extends Animal {
    void makeSound() {  // Same method, different behavior
        System.out.println("Meow! Meow!");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();  // Meow! Meow!
    }
}
