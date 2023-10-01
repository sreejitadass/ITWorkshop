import java.util.Scanner;

public class Q1 {

    int[] mergeArray(int[] arr1, int[] arr2, int n1, int n2) {
        int n = n1 + n2;
        int[] merged = new int[n];

        int j = 0, k = 0, l = 0;
        while (j < n1 && k < n2) {
            if (arr1[j] < arr2[k]) {
                merged[l++] = arr1[j++];
            } else if (arr1[j] > arr2[k]) {
                merged[l++] = arr2[k++];
            }
        }

        while (j < n1) {
            merged[l++] = arr1[j++];
        }

        while (k < n2) {
            merged[l++] = arr2[k++];
        }

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter the size of first array: ");
        n1 = sc.nextInt();
        System.out.print("Enter the size of second array: ");
        n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("\nFor sorted array-1: ");
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("\nFor sorted array-2: ");
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        int[] merged = mergeArray(arr1, arr2, n1, n2);
        System.out.println("\nThe merged array is: ");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}
