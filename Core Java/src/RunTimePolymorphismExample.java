// Superclass
class Animal22 {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass 1
class Dog22 extends Animal22 {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass 2
class Cat22 extends Animal22 {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        // Create instances of different subclasses
        Animal22 myDog = new Dog22();
        Animal22 myCat = new Cat22();

        // Call the overridden method, polymorphically
        myDog.makeSound(); // Output: Woof! Woof!
        myCat.makeSound(); // Output: Meow!
    }
}
