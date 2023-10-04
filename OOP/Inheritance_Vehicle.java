import java.util.*;

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopped");
    }

    void display() {
        System.out.println("Make of vehicle: " + make);
        System.out.println("Model of vehicle: " + model);
        System.out.println("Year of vehicle: " + year);
    }
}

class Car extends Vehicle {
    int numDoors;
    boolean isConvertible;

    Car(String make, String model, int year, int numDoors, boolean isConvertible) {
        super(make, model, year);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;
    }

    void start() {
        // super.start(); // vehicle
        System.out.println("Car is starting");
    }

    void stop() {
        // super.stop(); // vehicle
        System.out.println("Car is stopped");
    }

    void display() {
        System.out.println("Make of car: " + make);
        System.out.println("Model of car: " + model);
        System.out.println("Year of car: " + year);
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Convertible: " + isConvertible);
    }
}

class Motorcycle extends Vehicle {
    int engineSize;
    boolean isFairing;

    Motorcycle(String make, String model, int year, int engineSize, boolean isFairing) {
        super(make, model, year);
        this.engineSize = engineSize;
        this.isFairing = isFairing;
    }

    void start() {
        // super.start(); // vehicle
        System.out.println("Motorcycle is starting");
    }

    void stop() {
        // super.stop(); // vehicle
        System.out.println("Motorcycle is stopped");
    }

    void display() {
        System.out.println("Make of motorcycle: " + make);
        System.out.println("Model of motorcycle: " + model);
        System.out.println("Year of motorcycle: " + year);
        System.out.println("Engine size: " + engineSize);
        System.out.println("Fairing: " + isFairing);
    }
}

public class Inheritance_Vehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("ABC", "XYZ", 2020);
        Car c = new Car("PQR", "MNO", 2023, 2, false);
        Motorcycle m = new Motorcycle("RST", "UVW", 2021, 6, true);

        v.start();
        v.stop();
        v.display();
        System.out.println();
        c.start();
        c.stop();
        c.display();
        System.out.println();
        m.start();
        m.stop();
        m.display();
    }
}
