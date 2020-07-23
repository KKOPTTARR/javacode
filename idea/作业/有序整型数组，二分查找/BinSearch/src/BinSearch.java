/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 15:39
 */
import java.util.Scanner;
import java.util.Arrays;
public class BinSearch {
    public static int binSearch(int[] arr,int ret) {
        int mid = arr.length/2;
        if(ret==mid) {
            return arr[mid];
        }
        else if(ret>mid) {
            int result1=0;
            for(mid=arr.length/2;mid+1<ret;mid++) {
                result1=arr[mid];
            }
            return result1;
        }
        else {
            int result2=0;
            for(mid=arr.length/2;mid+1>ret;mid--) {
                result2=arr[mid];
            }
            return result2;
        }

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你要查找的下标：");
        int num = scan.nextInt();
        int result3 =binSearch(arr1,num);
        System.out.println(result3);

    }
}
