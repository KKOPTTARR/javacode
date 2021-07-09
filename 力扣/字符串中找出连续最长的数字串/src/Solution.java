/*
牛课题：字符串中找出连续最长的数字串
题目描述：

读入一个字符串str，输出字符串str中的连续最长的数字串

输入描述:

个测试输入包含1个测试用例，一个字符串str，长度不超过255。
输出描述:
在一行内输出str中里连续最长的数字串。

题目链接：https://www.nowcoder.com/questionTerminal/bd891093881d4ddf9e56e7cc8416562d

题目思路：此题目主要要用到关于字符串的一些处理问题；
     用max表示经过的数字长度的最大值，count表示数字计数器，当为数字时就++，当遇到一个字母时，就让它置为0，
     当每次为数字时，对max进行判断，当max小于count时，就更新max和end。
 */

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            int max=0;
            int count=0;
            int end=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max=count;
                        end=i;
                    }
                }
                else{
                    count=0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}