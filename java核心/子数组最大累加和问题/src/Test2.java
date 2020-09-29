import java.util.*;


public class Test2 {

    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 3, 5, -2, 6, -1};

        System.out.println(maxsumofSubarray2(array));
    }

    public static int maxsumofSubarray2 (int[] arr) {
        // write code here
        if (arr==null || arr.length==0){
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]+max>arr[i]){
                max = arr[i] + max;
            }else {
                max = arr[i];
            }
        }
        return max;
    }
}
