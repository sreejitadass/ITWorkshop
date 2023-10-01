class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printX() {
        System.out.println("Value of x = " + x);
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printY() {
        System.out.println("Value of y = " + y);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        b.setX(6); // base class calls its own methods
        b.getX();
        b.printX();

        d.setX(5); // derived class can call base class methods(inherit)
        d.getX();
        d.printX();

        d.setY(8); // derived class calls its own methods
        d.getY();
        d.printY();

        // base class cannot call derived class methods
    }
}
