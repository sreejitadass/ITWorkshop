
import java.util.Scanner;

public class Q3 {

    static char[] reArrange(char[] arr, int n, char x) {
        int pos = n - 1;
        char temp;
        for (int i = 0; i < pos; i++) {
            if (arr[pos] == x) {
                pos--;
            }
            if (arr[i] == x) {
                temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;

                pos--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.next().charAt(0);
        }
        System.out.print("Enter the character to be pushed at end: ");
        char x = sc.next().charAt(0);

        arr = reArrange(arr, n, x);

        System.out.println("The array after rearranging: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
