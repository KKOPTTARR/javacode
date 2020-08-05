/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 14:49
 */
import java.util.Scanner;
public class EachNumber {
    //递归
    public static void eachNumber(int a) {
       if(a>9) {
           eachNumber(a / 10);
       }
           System.out.println(a%10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = scan.nextInt();
        eachNumber(n);
        //System.out.println(" " + result + " ");
    }
   /*
   //常规方法
   public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int c=10;
        for(;c<a;c*=10) {
            while(a%c==(a-c)){
                break;
            }
        }
        c/=10;
        //System.out.println(c);
        //System.out.println(a);
        while(c>0) {
            int d=a/c;
            a=a-c*d;
            c/=10;
            System.out.println(d);
        }
    }*/
}