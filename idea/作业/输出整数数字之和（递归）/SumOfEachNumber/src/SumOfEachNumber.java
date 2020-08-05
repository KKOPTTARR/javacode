/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 15:33
 */
import java.util.Scanner;
public class SumOfEachNumber {
    public static int sum(int a) {
        if(a<10) {
            return a;
        }
        else {
            return a%10+sum(a/10);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个非负整数：");
        int n = scan.nextInt();
        System.out.println("Sum of each number =" + sum(n));

    }
}
