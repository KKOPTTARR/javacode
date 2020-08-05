/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/22 14:19
 */
import java.util.Scanner;
public class Tower {
    public static int tower(int a) {
        if(a==0) {
            return 0;
        }
        if (a==1) {
            return 1;
        } else {
            return 2*tower(a-1)+1;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入圆盘个数：");
        int n = scan.nextInt();
        System.out.println("需要" + tower(n) + "步");
    }
}
