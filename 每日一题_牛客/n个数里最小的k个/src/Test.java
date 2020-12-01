/*
题目：找出n个数里最小的k个

输入描述：每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n 不超过100。

输出描述：输出n个整数里最小的k个数。升序输出

示例1

输入  3 9 6 8 -10 7 -11 19 30 12 23 5

输出  -11 -10 3 6 7

思路：

第一步：设一个List，将输入的数存入list中，这里面，输入的最后一个数为k值，所以要把他分割出来，然后删除；

第二步：创建一个数组，将将更新后的list的数存入list中，然后对数组进行排序（从小到大）；

第三步：打印出数组的前k个，此处注意打印出的数字打印在同一行并且之间相隔一个空格，但是最后一个数字后面不需要空格；
 */


import java.util.*;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(scanner.hasNextInt()) {
            String str = scanner.nextLine();
            String[] string = str.split(" ");
            for (int i = 0; i < string.length; i++) {
                int tmp = Integer.parseInt(string[i]);
                list.add(tmp);
            }
            int n = list.remove(list.size()-1);
            list.sort(Integer::compareTo);
            for (int i = 0; i < n ; i++) {
                System.out.print(list.get(i));
                if(i < n-1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
