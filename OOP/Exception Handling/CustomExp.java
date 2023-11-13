class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class CustomExp {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        // exp handled in main
        try {
            validateAge(14);
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception: " + e);
        }
        System.out.println("Remaining code....");
    }
}
