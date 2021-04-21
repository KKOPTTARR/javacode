import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    int data[] = new int[10];
    int size = data.length;

    void showData() {
        int i;
        for (i = 0; i <= size - 1; i++) {
            System.out.print("[" + data[i] + "]" + " ");
        }
        System.out.println("");
    }


    public static void Quickly(int[] a,int fist,int last) {
        int b;//用来接收寻找到位置后元素的下标
        if(fist<last) {
            b=sort(a,fist,last); //调用寻找方法，也就是找到9 所在的位置
            Quickly(a,fist,b-1);//9所在位置的左半部分
            Quickly(a,b+1,last);//9所在位置的右半部分
        }
    }
    public static int sort(int[] a,int fist,int last) {
        int val=a[fist];
        while(fist<last) {
            while(fist<last && a[last]>=val) { //移动下标
                last--;
            }
            a[fist]=a[last]; //赋值
            while(fist<last && a[fist]<=val) { //移动下标
                fist++;
            }
            a[last]=a[fist]; //赋值
        }
        a[fist]=val; //将9放到最终位置
        return fist; //返回9所在位置的下标
    }


    void inputarr2() throws IOException {
        int j;
        for (j = 0; j < size; j++) {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            data[j] = Integer.parseInt(br.readLine());
        }
    }


    public static void main(String[] args) throws IOException {
        QuickSort array = new QuickSort();



        System.out.println("length:");
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            array.size = Integer.parseInt(br.readLine());
        }catch (Exception e) { }
        System.out.println("array:");
        array.inputarr2();
        System.out.println("before sort:");
        array.showData();

        Quickly(array.data,0,array.size-1);

        System.out.println("after sort:");
        array.showData();
    }
}
