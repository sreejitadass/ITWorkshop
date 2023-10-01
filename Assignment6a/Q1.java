import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter the numbers to be added:  ");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] numbersArray = num.split(" ");

        System.out.print("Add ");
        for (String i : numbersArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (num.isEmpty()) {
            System.out.println("Error: No numbers to add");
        } else if (numbersArray.length == 1) {
            System.out.println("Error: Add requires at least two numbers");
        } else {
            int sum = 0, x = 0;
            for (int i = 0; i < numbersArray.length; i++) {
                x = Integer.parseInt(numbersArray[i]);
                sum += x;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}