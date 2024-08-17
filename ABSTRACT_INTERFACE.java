// Abstract Class Example
abstract class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void startEngine();

    // Concrete method
    void stopEngine() {
        System.out.println(name + "'s engine stopped.");
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    @Override
    void startEngine() {
        System.out.println(name + "'s engine started.");
    }
}

// Interface Example
interface Electric {
    // Abstract method (implicitly public and abstract)
    void chargeBattery();

    // Default method (introduced in Java 8)
    default void displayChargeLevel() {
        System.out.println("Displaying charge level...");
    }
}

class Tesla extends Car implements Electric {
    Tesla(String name) {
        super(name);
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " is charging its battery.");
    }

    @Override
    void startEngine() {
        System.out.println(name + "'s electric engine started silently.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Honda");
        myCar.startEngine();
        myCar.stopEngine();

        Tesla myTesla = new Tesla("Model S");
        myTesla.startEngine();
        myTesla.chargeBattery();
        myTesla.displayChargeLevel();
        myTesla.stopEngine();
    }
}


//output
Honda's engine started.
Honda's engine stopped.
Model S's electric engine started silently.
Model S is charging its battery.
Displaying charge level...
Model S's engine stopped.
