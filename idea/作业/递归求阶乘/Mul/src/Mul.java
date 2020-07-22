/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 15:25
 */
import java.util.Scanner;
public class Mul {
    public static int mul(int a) {
        if (a == 0 || a == 1) {
                return 1;
            }
        else {
                return a*mul(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要求的阶乘为：");
        int n = scan .nextInt();
        System.out.println(mul(n));
    }

}
