import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseSort {
    int data[] = new int[100];
    int size = data.length;

    void showData() {
        int i;
        for (i = 0; i <= size - 1; i++) {
            System.out.print("[" + data[i] + "]" + " ");
        }
        System.out.println("");
    }

    void choose() {
        int n, m, temp;
        for (n = 0; n < size - 1; n++) {
            for (m = n + 1; m < size; m++) {
                if (data[m] < data[n]) {
                    temp = data[m];
                    data[m] = data[n];
                    data[n] = temp;
                }
            }
        }
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
        ChooseSort array = new ChooseSort();
        System.out.println("length:");
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            array.size = Integer.parseInt(br.readLine());
        }catch (Exception e) { }
        System.out.println("array:");
        array.inputarr2();
        System.out.println("show array:");
        array.showData();
        array.choose();
        System.out.println("after sort:");
        array.showData();
    }
}
