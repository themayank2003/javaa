interface Animal {
    void eat();  // abstract method
    void sleep();  // abstract method
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
