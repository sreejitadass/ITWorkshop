import java.util.Scanner;

public class Q5 {

    static int[] getInputArray(int[] auxArray, int n) {
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            auxArray[i] = sc1.nextInt();
        }
        sc1.close();
        return (auxArray);
    }

    static int[] reverseArray(int[] auxArray, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int temp = auxArray[start];
            auxArray[start] = auxArray[end];
            auxArray[end] = temp;

            start++;
            end--;
        }
        return (auxArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr = getInputArray(arr, n);

        int[] newArray = new int[n];
        newArray = reverseArray(arr, n);

        System.out.println("Printing in reverse order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }

}
