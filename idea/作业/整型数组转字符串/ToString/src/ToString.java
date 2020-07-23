/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 16:16
 */
import java.util.Arrays;
import java.util.Scanner;
public class ToString {
    public static String toString(int[] arr) {
        if(arr==null) {
            return null;
        }
        else if(arr.length==0) {
            return "[]";
        }
        String a= "[";
        for(int i=0;i<arr.length;i++) {
            if(i!=arr.length-1) {
                a=a + arr[i] + ",";
            }
            else {
                a+=arr[i] + "]";
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int n=scan.nextInt();
        System.out.println("请输入数组各元素(用空格隔开):");
        System.out.print("arr1: ");
        int[] arr1 = new int[n];
        int m=0;
        for(m=0;m<n;m++) {
            arr1[m]=scan.nextInt();
        }
        System.out.println(toString(arr1));
    }
}
