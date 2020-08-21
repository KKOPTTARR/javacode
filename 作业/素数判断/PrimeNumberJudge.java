import java.util.Scanner;

public class PrimeNumberJudge {
	public static void main(String[] args) {
		System.out.print("请输入一个数字：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		int b=2;
		for(;b<a;b++) {
			if(a%b==0) {
				break;
			}
		}
		if(b>=a) {
			System.out.println(a + "是素数");
		}
		else {
			System.out.println(a + "不是素数");
		}
	}
}