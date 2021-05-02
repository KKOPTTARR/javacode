import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {



    public static void quick(int[] arr,int fist,int last) {
        int index =0;
        if(fist<last) {
            index=sort(arr, fist,last);
            quick(arr,fist,index-1);
            quick(arr,index+1,last);
        }
    }
    public static int sort(int[] arr,int fist,int last) {
        int key=arr[fist];
        while(fist<last) {
            if(fist<last&&arr[last]>=key) {
                last--;
            }
            arr[fist]=arr[last];
            if(fist<last&&arr[fist]<=key) {
                fist++;
            }
            arr[last]=arr[fist];
        }
        arr[fist]=key;
        return fist;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int size= arr1.length;

        try {
            for (int i = 0; i <size; i++) {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader b = new BufferedReader(isr);
                arr1[i]=Integer.parseInt(b.readLine());
            }
        }catch (Exception e) {}

        quick(arr1,0,size-1);

        for(int i=0;i<arr1.length;i++) {
            System.out.println("["+arr1[i]+"]");
        }

    }
}
