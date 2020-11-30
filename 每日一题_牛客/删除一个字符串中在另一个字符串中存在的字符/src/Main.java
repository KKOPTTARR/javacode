/*
题目：输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。

例如，

输入

”They are students.”

       和

    ”aeiou”，

则删除之后的字符串变成

”Thy r stdnts.

思路：首先要将第一个字符串中的每个字符截取出来，截取成单个字符，
然后用contains方法进去比较，
如果第二个字符串中包含有第一个字符串中的字符，就舍弃掉，
如果不包含则保留使用StringBuffer的append方法进行拼接；
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //s1是第一个字符串，s2是第二个
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();

        //字符串s1转字符串数组arr1
        String[] arr1=s1.split("");

        //创一个新的可变字符串
        StringBuffer a=new StringBuffer();

        //开始比较
        //如果arr1中没有s2中包含的字符串，则添加进a中
        for (int i=0;i<arr1.length;i++){
            if (!s2.contains(arr1[i])){
                a.append(arr1[i]);
            }
        }

        //输出a
        System.out.println(a.toString());
    }
}