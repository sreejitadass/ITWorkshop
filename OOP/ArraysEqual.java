import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = arr1;
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
