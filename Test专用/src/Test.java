
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