import java.util.*;

public class Q4 {

    static int ClosestSum(int[] arr, int n) {
        Arrays.sort(arr);
        int left = 0;
        int right = n - 1;
        int minSum = Integer.MAX_VALUE;
        int ClosestSum = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum) < Math.abs(minSum)) {
                ClosestSum = arr[left] + arr[right];
            }

            if (sum < 0)
                left++;
            else
                right--;
        }
        return ClosestSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The sum closest to 0 is: " + ClosestSum(arr, n));
        sc.close();
    }
}
