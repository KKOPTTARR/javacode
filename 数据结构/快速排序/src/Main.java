import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] array = BuildArray.构建完全逆序的数组();
        System.out.println(Arrays.toString(array));
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));
        OddFirst.分割(array);
    }
}
