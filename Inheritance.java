// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create object of Dog
        Dog myDog = new Dog();
        
        // Call method from parent class
        myDog.eat();   
        
        // Call method from child class
        myDog.bark();  
    }
}

