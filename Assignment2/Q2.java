import java.util.Scanner;

public class Q2 {

    static void countFrequency(int[] arr, int n) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        System.out.println("Element\t\tFrequency");

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            else {
                int freq = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        freq++;
                    }
                }
                System.out.println(arr[i] + "\t\t" + freq);
            }
        }
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

        countFrequency(arr, n);
        sc.close();
    }
}