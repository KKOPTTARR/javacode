import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class test {

    int[] data= new int[1000];
    int size=data.length;

    public void showData() {
        for(int i=0;i<size;i++){
            System.out.println("[" + data[i] + "]");
        }
        System.out.println(" ");
    }


    public void input() {
        try {
            int i;
            for(i=0;i<size;i++) {
                InputStreamReader a = new InputStreamReader(System.in);
                BufferedReader b = new BufferedReader(a);
                data[i]=Integer.parseInt(b.readLine());
            }
        }catch (Exception e){}
    }

    public static void Quick(int[] data,int fist,int last) {
        int index=0;
        if(fist<last) {
            index=quickSort(data, fist, last);
            Quick(data, fist, index-1);
            Quick(data,index+1,last);
        }
    }

    public static int quickSort(int[] data, int fist,int last) {
        int key = data[fist];
        while (fist < last) {
            while (fist < last && data[fist] <= key) {
                fist++;
            }
            data[last] = data[fist];
        }
        data[fist] = key;
        return fist;
    }
}

