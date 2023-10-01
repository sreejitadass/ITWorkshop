import java.util.Scanner;

public class Q3 {

    static int[] InitializeArray(int[] arr, int n) {
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc1.nextInt();
        }
        sc1.close();
        return arr;
    }

    static int findMin(int[] arr, int n) {
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }
        return minEle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr = InitializeArray(arr, n);
        System.out.println("The minimum element of the array is: " + findMin(arr, n));
        sc.close();
    }
}
