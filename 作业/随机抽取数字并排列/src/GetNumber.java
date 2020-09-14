import java.util.Scanner;
import java.util.Arrays;

public class GetNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many");
        int m = scan.nextInt();
        System.out.println("how long");
        int k = scan.nextInt();


        int[] array = new int[m];
        for(int i = 0;i < array.length-1;i++) {
            array[i] = i + 1;
        }

        int[] getArray = new int[k];

        for(int n = 0;n < getArray.length-1;n++) {

            int j = (int)(Math.random()*m);

            getArray[n] = array[j];

            array[j] = array[m-1];

            m--;

        }

        Arrays.sort(getArray);
        for(int n : getArray) {
            System.out.println(n);
        }
    }
}
