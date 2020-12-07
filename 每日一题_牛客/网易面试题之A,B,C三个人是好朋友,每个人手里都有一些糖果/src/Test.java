/*
A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。

这道题目的实质是：判断三元一次方程组是否有解及求解。
把题目条件用方程式表示：
A-B=Y1;
B-C=Y2;
A+B=Y3;
B+C=Y4;

用消元法求解：
A=(Y1+Y3)/2;
B=(Y3-Y1)/2=(Y2+Y4)/2;
C=(Y4-Y2)/2;

由于题目给出的是整数，要求解也是整数，这个约束条件也需要注意下。
不满足约束条件就是没解，就可以输出NO了，满足所有的约束条件那就是有解。
 */





import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] s = str.split(" ");
        Integer[] arr = new Integer[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int len = arr.length / 2;
        int[] a = new int[100];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (arr[i] == j) {
                    a[j]++;
                }
            }
        }
        int ret = 0;
        for (int j = 0; j < a.length; j++) {
            if (len <= a[j]) {
                ret = j;
            }
        }
        System.out.println(ret);
    }
}