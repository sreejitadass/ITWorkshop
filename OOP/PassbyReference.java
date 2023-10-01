class Numbers { // passing object, different locations
    int n1;
    int n2;

    Numbers(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void swap(Numbers n) {
        int item = n.n1;
        n.n1 = n.n2;
        n.n2 = item;
    }
}

public class PassbyReference {
    public static void main(String[] args) {
        Numbers num = new Numbers(2, 3);
        System.out.println("Numbers before swapping: " + num.n1 + " and " + num.n2);
        num.swap(num);
        System.out.println("Numbers after swapping: " + num.n1 + " and " + num.n2);
    }
}
