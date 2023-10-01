import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter the element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += arr[i];
    }
    System.out.println("The sum of the array elements is: " + sum);
    sc.close();
  }
}