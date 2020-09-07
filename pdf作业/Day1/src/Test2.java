public class Test2 {
    public static void main(String[] args) {
        char c='a';
        double x=2.0;
        int y=4;
        int d=4;
        int b=++d;
        System.out.println(b);//5
        System.out.println(d);//5
        int a=y++;
        System.out.println(a);//4
        System.out.println(y);//5
        //y=++x
        //先加再赋值
        //y=x++
        //先赋值再加
        //
    }
}
