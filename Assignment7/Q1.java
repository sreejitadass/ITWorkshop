import java.util.*;

abstract class Shape {
    abstract void RectangleArea(double l, double b);

    abstract void SquareArea(double s);

    abstract void CircleArea(double r);
}

class Area extends Shape {

    void RectangleArea(double l, double b) {
        double area = l * b;
        System.out.println("Area of the rectangle: " + area);
    }

    void SquareArea(double s) {
        double area = s * s;
        System.out.println("Area of the square: " + area);
    }

    void CircleArea(double r) {
        double area = Math.PI * r * r;
        System.out.println("Area of the circle: " + area);
    }
}

public class Q1 {
    public static void main(String[] args) {

        double l, b, s, r;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nFor rectangle: ");
        System.out.print("Enter the length: ");
        l = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        b = sc.nextDouble();
        System.out.println("\nFor square: ");
        System.out.print("Enter the side: ");
        s = sc.nextDouble();
        System.out.println("\nFor circle: ");
        System.out.print("Enter the radius: ");
        r = sc.nextDouble();

        Area a = new Area();
        a.RectangleArea(l, b);
        a.SquareArea(s);
        a.CircleArea(r);

        sc.close();

    }
}
