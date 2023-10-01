import java.util.Scanner;

public class Q3 {

    static boolean isPalindrome(int[] arr, int n) {
        boolean flag = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
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

        boolean flag = isPalindrome(arr, n);
        if (flag)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");

        sc.close();
    }

}
