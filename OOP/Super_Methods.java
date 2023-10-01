class Vehicle {
    void print() {
        System.out.println("In Vehicle");
    }
}

class Car extends Vehicle {
    void print() {
        super.print(); // calls print() of superclass
        System.out.println("In Car");
    }
}

public class Super_Methods {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        c.print();
        System.out.println();
        v.print();
    }
}
