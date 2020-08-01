import java.util.Arrays;
import java.util.Scanner;
public class Test {

    public static int[] func1(int[] arr1) {
        for(int i=0;i<arr1.length;i++) {
            arr1[i]=arr1[i]*2;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(Arrays.toString(func1(arr)));
    }

   /* public static int fun(int x) {
        if(x<10) {
            return x;
        }
        return x%10+fun(x/10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = fun(n);
        System.out.println(result);
    }*/
   /* public static int Sum(int n) {
        int result=0;
        for(int i=n;i>1;i--) {
            result +=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Sum(n);
        int add =0;
        add = Sum(n);
        System.out.println(ret);

    }*/
}
