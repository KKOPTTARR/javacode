/**
 * 运算符
 */
public class test {
public static void main(String[] args) {
	System.out.println(5/2);
	System.out.println((float)5/2);
	System.out.println(5/(float)2);
	System.out.println(5/2.0);
	//输出结果 2
	//输出结果 2.5
	//输出结果 2.5
	//输出结果 2.5
	

    System.out.println(10%3);
    System.out.println(10%-3);
    System.out.println(-10%3);
    System.out.println(-10%-3);
    //输出结果 1
    //输出结果 1
    //输出结果 -1
    //输出结果 -1 
    
    // int a = 10;
    // int b = 20;
    // System.out.println(a == b);//false
    // System.out.println(a != b);//true
    // System.out.println(a < b);//true
    // System.out.println(a > b);//false
    // System.out.println(a <= b);//true
    // System.out.println(a >= b);//false
    // 关系运算符的表达式返回值都是 boolean 类型.
    

    // short c =128;
    // byte d =(byte)c;
    // System.out.println(c);
    // System.out.println(d);
    //输出结果 128
    //输出结果 -128
    
    double x=2.0; 
    int y=4; 
    x/=++y;
    System.out.println(x);//0.4
    System.out.println(y);//5

    // int i=1;
    // long j=2;
    // double k=3.5;

    // i=j;//报错
    // i=k;//报错

    // j=i;//输出结果 1
    // k=i;//输出结果 1



    // byte i=120;
    // byte j=128;
    // System.out.println(i);
    // System.out.println(j);

    // boolean i=true;
    // int j=10;

    // i=j;//报错
    // j=i;//报错
    // 求两个整数的最大值
    int a = 10;
    int b = 20;
    int max = a > b ? a : b;
    System.out.println(max);













}
}