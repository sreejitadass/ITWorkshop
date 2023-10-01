class Numbers { // Pass by reference,values wont be changed,pointing to same location
    int n1;
    int n2;

    Numbers(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void swap(int n1, int n2) {
        int item = n1;
        n1 = n2;
        n2 = item;
    }
}

public class PassbyValue {
    public static void main(String[] args) {
        Numbers num = new Numbers(2, 3);
        System.out.println("Numbers before swapping: " + num.n1 + " and " + num.n2);
        num.swap(num.n1, num.n2);
        System.out.println("Numbers after swapping: " + num.n1 + " and " + num.n2);
    }
}
