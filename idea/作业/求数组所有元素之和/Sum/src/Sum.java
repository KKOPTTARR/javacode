/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 16:48
 */
import java.util.Scanner;
public class Sum {
    public static void sum(int[] arr) {
        double result =0;
        for(int i=0;i<arr.length;i++) {
            result = arr[i]+result;
        }
        System.out.println(result);
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
        sum(arr1);
    }
}
