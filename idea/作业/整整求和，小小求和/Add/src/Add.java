/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 10:28
 */
import java.util.Scanner;
public class Add {
    public static int add1(int a,int b) {
        return a+b;
    }
    public static double add2(double c,double d,double e) {
        return c+d+e;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入两个整数:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("The sum is " + add1(num1,num2));

        System.out.print("请输入三个小数:");
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();
        System.out.println("The sum is " + add2(num3,num4,num5));
    }
}
