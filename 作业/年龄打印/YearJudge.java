import java.util.Scanner;

public class YearJudge {
	public static void main(String[] args) {
		System.out.print("请输入你的年龄:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if(a<=18) {
			System.out.println("少年");
		}
		if(a>19&&a<28) {
			System.out.println("青年");
		}
		if(a>29&&a<55) {
			System.out.println("中年");
		}
		if(a>56) {
			System.out.println("老年");
		}

	}
}