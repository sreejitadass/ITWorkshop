class Base {
    Base() {
        System.out.println("Base:Default");
    }

    Base(int x) {
        System.out.println("Base:Overloaded");
    }
}

class Derived extends Base {
    Derived() { // calls overloaded base constructor
        super(3);
        System.out.println("Derived:Default");
    }

    Derived(int x, int y) {
        System.out.println("Derived:Overloaded");
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Base b = new Base();
        System.out.println();
        Derived d = new Derived();
        System.out.println();
        Base b1 = new Base(3);
        System.out.println();
        Derived d1 = new Derived(0, 0);
    }
}
