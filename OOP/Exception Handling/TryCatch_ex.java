
public class TryCatch_ex {
    public static void main(String[] args) {
        try {
            // may throw exception
            int result = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: division by 0");
        } finally {
            System.out.println("Code to be still executed");
        }
        System.out.println("Rest of the code");
    }
}