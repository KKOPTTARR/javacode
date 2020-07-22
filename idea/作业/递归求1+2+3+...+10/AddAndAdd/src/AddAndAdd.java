/**
 * @author :大大怪将军
 * @description :1+2+3+...+10
 * @data : 2020/7/22 15:17
 */
public class AddAndAdd {
    public static int add(int a) {
        if(a<=0) {
            return 0;
        }
        else {
            return add(a-1) + a;
        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(add(n));
    }
}
