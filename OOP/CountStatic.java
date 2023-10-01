class Count {
    int roll;
    static int c;

    public void CountObjects(int roll) {
        this.roll = roll;
        c++;
        System.out.println("Count=" + c);
    }
}

public class CountStatic {
    public static void main(String[] args) {
        Count ob1 = new Count();
        Count ob2 = new Count();
        Count ob3 = new Count();
        ob1.CountObjects(12);
        ob2.CountObjects(19);
        ob3.CountObjects(45);
    }
}
