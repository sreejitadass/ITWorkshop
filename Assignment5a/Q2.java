import java.util.Scanner;

public class Q2 {

    static int FindThirdLargest(int[] arr, int n) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The third largest element is: " + FindThirdLargest(arr, n));
        sc.close();
    }
}
