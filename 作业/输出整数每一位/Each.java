import java.util.Scanner;

public class Each {
	/**
	 * 输出整数每一位
	 * @param args [description]
	 */
	public static void main(String[] args) {
		System.out.print("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int c=10;
		for(;c<a;c*=10) {
			while(a%c==(a-c)){
				break;
			}
		}
		c/=10;
		//System.out.println(c);
		//System.out.println(a);
		while(c>0) {
			int d=a/c;
			a=a-c*d;
			c/=10;
			System.out.println(d);
		}
	}
}