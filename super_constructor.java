class Animal {
    String name;

    // Superclass constructor
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    int age;

    // Subclass constructor
    Dog(String name, int age) {
        super(name); // Calling the superclass constructor
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.display();  // Output: Name: Buddy, Age: 3
    }
}
