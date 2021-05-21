import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    int[] data = new int[100];
    int size=data.length;


    public static void quick(int[] data,int fist,int last) {
        int index;
        if(fist<last) {
            index=quickSort(data, fist, last);
            quick(data,fist,index-1);
            quick(data,index+1,last);
        }
    }

    public static int quickSort(int[] data,int fist,int last) {
        int key=data[fist];
        while(fist<last) {
            while(fist<last && data[last]>=key) {
                last--;
            }
            data[fist]=data[last];
            while(fist<last && data[fist]<=key) {
                fist++;
            }
            data[last]=data[fist];
        }
        data[fist]=key;
        return fist;
    }

    public void merger(int[] data,int fist,int last) {
        if(fist>=last) {
            return;
        }
        int mid=(last-fist)/2+fist;
        merger(data, fist, mid);
        merger(data,mid+1,last);

        mergerSort(data,fist,mid,last);
    }

    public void mergerSort(int[] data,int fist,int mid,int last) {
        int[] temp=new int[last-fist+1];
        int i=fist;
        int j=mid+1;

        for(int z=0;z<temp.length;z++) {
            if(i<=mid && (j>last||data[i]<=data[j]) ) {
                temp[z]=data[i++];
            }
            else if(j<=last && (i>mid||data[j]<=data[i]) ) {
                temp[z]=data[j++];
            }
        }

        for(int z=0;z<temp.length;z++) {
            data[z+fist]=temp[z];
        }
    }


    public void showData() {
        for(int i=0;i<size;i++) {
            System.out.print("[" + data[i] +"]");
        }
        System.out.println(" ");
    }

    public void inputArr() {
        int i;
        try {
            for(i=0;i<size;i++) {
                InputStreamReader n = new InputStreamReader(System.in);
                BufferedReader m = new BufferedReader(n);
                data[i]=Integer.parseInt(m.readLine());
            }
        }catch (Exception e) {}
    }

    public static void main(String[] args) {
        Test arr = new Test();
        arr.size=5;
        arr.inputArr();
        arr.showData();
        //arr.merger(arr.data,0,arr.size-1);
        quick(arr.data,0,arr.size-1);
        arr.showData();

    }
}
