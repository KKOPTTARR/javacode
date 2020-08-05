/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 9:58
 */
import java.util.Scanner;
public class FindMax {
    public static int max1(int a,int b) {
        if(a>b) {
           return a;
        }
        else {
            return b;
        }
    }
    public static double max2(double c,double d) {
        if(c>d) {
            return c;
        }
        else {
            return d;
        }
    }
    public static double max3(int e,double f,double g) {
        if(e>max2(f,g)) {
            return e;
        }
        else {
            return max2(f,g);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入两个整数：");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result1 = max1(num1,num2);
        System.out.println("The max of " + num1 + " and " + num2 + " is " + result1);

        System.out.print("请输入两个小数：");
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double result2 = max2(num3,num4);
        System.out.println("The max of " + num3 + " and " + num4 + " is " + result2);

        System.out.print("请输入一个整数和两个小数：");
        int  num5 = scan.nextInt();
        double num6 = scan.nextDouble();
        double num7 = scan.nextDouble();
        double result3 = max3(num5,num6,num7);
        System.out.println("The max of " + num5 + " and " + num6 +  " and " + num7 +  " is " + result3);
    }
}