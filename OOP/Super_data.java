class Vehicle {
    int maxspeed = 60;

    void display() {
        System.out.println("Maximum speed =" + maxspeed);
    }
}

class Car extends Vehicle {
    int maxspeed = 30;

    void display() {
        System.out.println("Maximum speed of car =" + maxspeed);
        System.out.println("Maximum speed of vehicle =" + super.maxspeed);
    }
}

class Bike extends Vehicle {
    int maxspeed = 20;

    void display() {
        System.out.println("Maximum speed of car =" + super.maxspeed);
        System.out.println("Maximum speed of vehicle =" + super.maxspeed);
        System.out.println("Maximum speed of bike: " + maxspeed);
    }

}

public class Super_data {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bike b = new Bike();
        v.display();
        System.out.println();
        c.display();
        System.out.println();
        b.display();
    }
}
