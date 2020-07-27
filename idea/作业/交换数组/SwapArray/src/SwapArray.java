
import java.util.Arrays;
public class SwapArray {
    public static void swaparray(int[] arr1, int[] arr2) {
        int tmp = 0;
        for (int i = 0; i < arr1.length; i++) {
            tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4};
            int[] array2 = {5, 6, 7, 8};
            System.out.println("array1:" + Arrays.toString(array1));
            System.out.println("array2:" + Arrays.toString(array2));
            swaparray(array1, array2);
            System.out.println("array1:" + Arrays.toString(array1));
            System.out.println("array2:" + Arrays.toString(array2));
    }
}
