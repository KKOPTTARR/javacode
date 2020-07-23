/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 0:20
 */
import java.util.Scanner;
public class PrintArray {
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n=scan.nextInt();
        System.out.println("请输入数组各元素（用空格隔开）：");
        int[] arr1=new int[n];
        int m=0;
        for(m=0;m<n;m++) {
            arr1[m]=scan.nextInt();
        }
        printArray(arr1);
    }
}
