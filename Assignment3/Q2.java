import java.util.Scanner;

public class Q2 {

    static int[] kthElement(int[] arr1, int[] arr2, int[] arr3, int k, int min) {
        int i = 0, j = 0, l = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                l++;
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] common = new int[min];
        l = 0;
        i = 0;
        j = 0;
        k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common[l] = arr1[i];
                l++;
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return common;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Enter the size of first array: ");
        n1 = sc.nextInt();
        System.out.print("Enter the size of second array: ");
        n2 = sc.nextInt();
        System.out.print("Enter the size of third array: ");
        n3 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

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

        System.out.println("\nFor sorted array-3: ");
        for (int i = 0; i < n3; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr3[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int min = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);

        int[] common = kthElement(arr1, arr2, arr3, k, min);
        System.out.println(k + "-th smallest element among common elements: " +
                common[k - 1]);

        sc.close();
    }
}
