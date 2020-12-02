/*
输入n个整数，输出出现次数大于等于数组长度一半的数

每个测试输入包含n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。

输出描述：

输出出现次数大于等于n/2的数。

示例：

输入：3 9 3 2 5 6 7 3 2 3 3 3

输出：3
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        Integer[] arr = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int len = arr.length / 2;
        int[] a = new int[100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i] == j) {
                    a[j]++;
                }
            }
        }
        int ret = 0;
        for (int j = 0; j < a.length; j++) {
            if (len <= a[j]) {
                ret = j;
            }
        }
        System.out.println(ret);
    }
}