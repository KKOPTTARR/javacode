import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the low and line");
        int j = scan.nextInt();//low
        int k = scan.nextInt();//line
        int array[][] = new int[j][k];
        for (int i = 0; i < j; i++) {
            for (int h = 0; h < k; h++) {
                array[i][h] = scan.nextInt();
            }
        }
        System.out.println("please input the number");
        int number = scan.nextInt();
        System.out.println(FindTheNumber(array,number));
    }

    public static boolean FindTheNumber(int[][] arr,int inputNumber) {
        int begin = 0;
        int rightEnd = arr[0].length-1;
        while(begin<arr.length) {
            if (arr[begin][rightEnd] == inputNumber) {
                return true;
            }
            if (arr[begin][rightEnd] > inputNumber) {
                rightEnd--;
            } else {
                begin++;
            }
        }
        return false;
    }
}
