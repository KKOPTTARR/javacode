import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.NativeArray.sort;

public class Test {
    int[] data = new int[100];
    int size = data.length;


    void inputarrArr() {
        try {
            for (int i = 0; i < data.length; i++) {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                data[i] = Integer.parseInt(br.readLine());
            }
        }catch (Exception e) {}
    }

    void showData() {
        int i;
        for(i=0;i<size;i++) {
            System.out.println("["+data[i]+"]");
        }
    }


    void quickSort(int arr[],int fist,int last) {
        int midIndex;
        if(fist<last) {
            midIndex=sort(arr,fist,last);
            quickSort(arr,fist,midIndex-1);
            quickSort(arr,midIndex+1, last);
        }
    }


    int sort(int arr[],int fist,int last) {
        int key = arr[fist];
        while (fist<last) {
            while (fist < last && arr[last] > key) {
                last--;
            }
            arr[fist] = arr[last];
            while (fist < last && arr[fist] < key) {
                fist++;
            }
            arr[last] = arr[fist];

        }
        arr[fist]=key;
        return fist;
    }


    public static void main(String[] args) {

        Test list1 = new Test();

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            list1.size = Integer.parseInt(br.readLine());
        }catch (Exception e) {}


        list1.inputarrArr();
        list1.showData();

        list1.quickSort(list1.data,0,list1.size-1);
        list1.showData();
    }

}
