import java.util.Scanner;

public class CommonDivisorMaxMultipleMin {
	public static void main(String[] args) {

		System.out.print("请输入两个数：");
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int temp=0;
		int a=n;
		int b =m;

		while(b!=0) {
			temp=a%b;
			a=b;
			b=temp;
		}
		System.out.println("最大公约数是" + a);
		System.out.println("最小公倍数是" + n*m/a);
	}
}