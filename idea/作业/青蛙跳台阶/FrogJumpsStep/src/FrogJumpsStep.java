/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 10:33
 */
import java.util.Scanner;
public class FrogJumpsStep {
    public static int jump(int n) {
        if(n<=2) {
            return n;
        }
        else {
            return jump(n-1) + jump(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入台阶数量：");
        int num = scan.nextInt();
        System.out.println("跳法有 " + jump(num) + " 种");

    }
}
