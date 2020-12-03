/*

public class Test {
    public static void main(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final byte b4=4,b5=6;
        b6=b4+b5;
        b3=(b1+b2);
        System.out.println(b3+b6);

    }
}
//b3=(b1+b2) 编译错误
//Error:(6, 14) java: 不兼容的类型: 从int转换到byte可能会有损失


 */


/*

class HasStatic{
    private static int x = 100;
}
public class Test{
    public static void main(String[] args) {
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        HasStatic hs2 = new HasStatic();
        hs2.x++;
        hs1=new HasStatic();
        hs1.x++;
        HasStatic.x--;
        System.out.println("x="+x);
    }
}
//8行不能访问，因为x是静态私有变量

 */


/*

public class Test{

    public static void main(String[] args) {

        boolean b = true ? false : true == true ? false : true;

        System.out.println(b);
        //false


        //详解：

        //首先拆分式子：
        //(b = true ? false : true) == (true ? false : true)

        //boolean类型的b默认值false

        //左式：
        //b等于true吗？等于返回false，不等于返回true

        //右式：
        //问号左边等于true吗？等于返回false，不等于返回true

    }
}

*/


/*
public class Test {

    public static void main(String[] args) {
        int x,y;
        x=5>>2;
        //System.out.println(x);
        //x=
        y=x>>>2;
        System.out.println(y);
        //y=0
    }
}

 */




/*

class Base{
    Base() {
        System.out.println("base");
    }
}

public class Test {
    public static void main(String[] args) {

    }
}
//接Alphe.java

*/



/*

class Tst {
    public static void hello() {
        System.out.println("hello");
    }
}

public class Test{
    public static void main(String[] args) {
        Tst tst = null;
        tst.hello();
    }
}
//编译正常运行，打印hello

 */