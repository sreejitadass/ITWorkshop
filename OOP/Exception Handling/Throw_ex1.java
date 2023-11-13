class TestThrow {
    void CheckAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}

public class Throw_ex1 {
    public static void main(String[] args) {
        TestThrow t = new TestThrow();
        t.CheckAge(11);
    }
}
