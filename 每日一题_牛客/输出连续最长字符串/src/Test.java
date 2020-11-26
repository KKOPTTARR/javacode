/*
读入一个字符串str，输出字符串str中的连续最长的数字串

输入：abcd12345ed125ss123456789

输出：123456789

思路：两层循环，第一层确定开始位置，第二层负责计算长度，然后根据下标从原字符串中截取


 */



import java.util.*;

public class Test {
    public static void main(String[] args){
        //思路：两层循环：找到起点，然后计算长度，从原字符串中截取
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int count = 0;
        String result = "";
        for(int i = 0;i<arr.length;++i){
            if(arr[i]>='0'&&arr[i]<='9'){  //当前的是数字
                int index = i;
                count = 1;	//初始化计数器
                for(int j = i+1;j<arr.length;++j){
                    if(arr[j]>='0'&&arr[j]<='9'){
                        count++;
                        index = j;
                    }else{
                        break;
                    }
                }
                if(count>result.length()){
                    result = str.substring(i,index+1);
                }
            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}