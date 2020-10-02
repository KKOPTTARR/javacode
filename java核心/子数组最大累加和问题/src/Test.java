/*
给定一个数组arr，返回子数组的最大累加和
例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.

[要求]
时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)

 */



import java.util.*;


public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray1(array));
    }

    public static int maxsumofSubarray1 (int[] arr) {
        // write code here
        int cur = 0;
        int max = arr[0];

        for(int n =0;n<arr.length;n++) {

            cur +=arr[n];

            max = max > cur ? max : cur;
        }

        return max;
    }
}
//
