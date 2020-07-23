/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 0:00
 */
import java.util.Arrays;
import java.util.Scanner;
public class Mul {
    public static int[] mul(int[] arr1) {
        int i=0;
        for(i=0;i<arr1.length;i++) {
           arr1[i]=2*arr1[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n=scan.nextInt();
        System.out.println("请输入数组各元素（用空格隔开）：");
        int[] arr=new int[n];
        int m=0;
        for(m=0;m<n;m++) {
            arr[m]=scan.nextInt();
        }
        System.out.println(Arrays.toString(mul(arr)));
    }
}
