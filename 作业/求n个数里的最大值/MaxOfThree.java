import java.util.Scanner;
public class MaxOfThree {
	/**
	 * 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
	 * 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
	 * @param args [description]
	 */
	
	public static int max2(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static int max3(int c,int d,int e) {
		return max2((max2(c,d)),(max2(d,e)));
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		int o= scan.nextInt();
		max3(n,m,o);
		int result=max3(n,m,o);
		System.out.println(result);
	}
}