import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n+1];


        for(int i=0;i<arr1.length;i++) {
            arr1[i] = scan.nextInt();
            arr2[i] = arr1[i];
        }

        /*for(int o = 0;o<arr2.length;o++)  {
            System.out.println(arr2[o]);
        }*/


        int data = scan.nextInt();

        


        for(int count=0;count<n+1;count++) {
            System.out.println(arr2[count] + " ");
        }




    }
}
