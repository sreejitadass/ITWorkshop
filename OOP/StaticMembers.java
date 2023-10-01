class Number {
    int n1;
    private static int n2;

    Number(int i1, int i2) {
        n1 = i1;
        n2 = i2;
    }

    public void f1() {
        System.out.println("Number-1: " + n1);
        System.out.println("Number-2: " + n2);
    }

    public static void f2() {
        // System.out.println("Number-1: " + n1); // cant access non-static
        // variable from static method
        System.out.println("Number-2: " + n2);
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Number n = new Number(2, 3);
        n.f1();
        Number.f2();
    }
}
