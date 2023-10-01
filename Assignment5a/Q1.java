import java.util.Scanner;

public class Q1 {

    static double findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / 5;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The average is: " + findAvg(arr));
        sc.close();
    }
}
