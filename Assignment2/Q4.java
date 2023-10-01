import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int ch;
        System.out.println("1.Using if-else");
        System.out.println("2.Using ternary operators");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Denominator cannot be zero");
        } else {
            switch (ch) {
                case 1:
                    if (num1 % num2 == 0)
                        System.out.println(num1 + " is divisible by " + num2);
                    else
                        System.out.println(num1 + " is not divisible by " + num2);
                    break;

                case 2:
                    String ans = (num1 % num2 == 0) ? " is divisible by " : " is not divisible by ";
                    System.out.println(num1 + ans + num2);
                    break;

                default:
                    System.out.println("Invalid case");
            }
            sc.close();
        }
    }
}
