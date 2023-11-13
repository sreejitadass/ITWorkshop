class UserDefinedException extends Exception {
    public UserDefinedException(String str) {
        super(str);
    }
}

public class Throw_ex2 {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException ude) {
            System.out.println("Caught the exception");
            System.out.println(ude.getMessage());
        }
    }
}
