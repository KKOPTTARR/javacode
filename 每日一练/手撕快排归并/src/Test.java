import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Test {
    int[] data= new int[100];
    int size=data.length;

    public void showData() {
        for(int i=0;i<size;i++) {
            System.out.print("[" + data[i] +"]");
        }
        System.out.println(" ");
    }

    public void input() {
        try {
            for(int i=0;i<size;i++) {
                InputStreamReader a = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(a);
                data[i]= Integer.parseInt(br.readLine());
            }
        }catch(Exception e) {}
    }

    public static void Quick(int[] data,int fist,int last) {
        int index;
        if(fist<last) {
            index = quickSort(data, fist, last);
            Quick(data, fist, index - 1);
            Quick(data, index + 1, last);
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

    public static void Merger(int[] data,int fist,int last) {
        if(fist>=last) {
            return;
        }
        int mid=(last-fist)/2+fist;
        Merger(data, fist, mid);
        Merger(data, mid+1, last);

        mergerSort(data,fist,mid,last);
    }

    public static void mergerSort(int[] data,int fist,int mid,int last) {
        int[] temp=new int[last-fist+1];
        int i=fist;
        int j=mid+1;

        for(int z=0;z<temp.length;z++) {
            if(i<=mid &&(j>last || data[i]<=data[j])) {
                temp[z]=data[i++];
            }
            else if(j<=last &&(i>mid || data[j]<=data[i])) {
                temp[z]=data[j++];
            }
        }

        for(int z=0;z<temp.length;z++) {
            data[z+fist]=temp[z];
        }
    }


    public static void main(String[] args) {
        Test arr = new Test();


        System.out.print("size=:");
        try{
            InputStreamReader a = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(a);
            arr.size = Integer.parseInt(br.readLine());
        }catch(Exception e){}

        System.out.println("input data:");
        arr.input();

        System.out.println("show data:");
        arr.showData();

        //Quick(arr.data,0,arr.size-1);
        Merger(arr.data,0,arr.size-1);


        System.out.println("after Sort:");
        arr.showData();

    }

}

