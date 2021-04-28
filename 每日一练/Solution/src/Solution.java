import sun.applet.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {

    int[] arr1 = new int[101];
    int[] arr2 = new int[101];
    int size1 = arr1.length;
    int size2 = arr2.length;

    void inputarr1() {
        try {
            for(int i=0;i<size1;i++) {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                arr1[i]=Integer.parseInt(br.readLine());
            }
        }catch(Exception e) {}
    }

    void inputarr2() {
        try {
            for(int i=0;i<size2;i++) {
                InputStreamReader isr1 = new InputStreamReader(System.in);
                BufferedReader br1 = new BufferedReader(isr1);
                arr2[i]=Integer.parseInt(br1.readLine());

                InputStreamReader isr2 = new InputStreamReader(System.in);
                BufferedReader br2 = new BufferedReader(isr2);
                arr1[i]=Integer.parseInt(br2.readLine());
            }
        }catch(Exception e) {}
    }

    public static void main(String[] args) {

        Main array1 = new Main();


        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int size = Integer.parseInt(br.readLine());
        }catch(Exception e) {}

        array1.


        System.out.println(6);
    }
}