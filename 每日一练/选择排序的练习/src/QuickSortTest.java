import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class QuickSortTest {
    int[] data = new int[100];
    int size=data.length;

    void showData() {
        int i;
        for(i=0;i<=size-1;i++) {
            System.out.println("["+data[i]+"]");
        }
        System.out.println(" ");
    }


    void inputData() {
        int i;
        try {
            for(i=0;i<size;i++) {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                data[i] = Integer.parseInt(br.readLine());
            }
        }catch(Exception e) {}
    }

    static void quick(int[] a, int fist, int last) {
        int index;
        if(fist<last) {
            index=sort(a, fist, last);
            quick(a,fist,index-1);
            quick(a,index+1,last);
        }
    }

    static int sort(int[] a, int fist, int last) {

        int key = a[fist];

        while(fist<last) {
            if(fist<last && a[last]>=key) {
                last--;
            }
            a[fist]=a[last];
            if(fist<last && a[fist]<=key) {
                fist++;
            }
            a[last]=a[fist];
        }
        a[fist]=key;
        return fist;
    }


    public static void main(String[] args) {
        QuickSortTest test = new QuickSortTest();

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            test.size = Integer.parseInt(br.readLine());
        }catch(Exception e) {}


        test.inputData();
        test.showData();

        quick(test.data,0,test.size-1);

        test.showData();
    }

}

