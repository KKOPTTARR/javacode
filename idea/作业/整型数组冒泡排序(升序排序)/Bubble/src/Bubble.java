/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 14:37
 */
import java.util.Arrays;
public class Bubble {
    public static void bubble(int [] arr) {
        int i=0;
        int j=0;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 ={4,5,6,3,2,1};
        bubble(arr1);
        String arr2 =Arrays.toString(arr1);
        System.out.println(arr2);
    }
}
