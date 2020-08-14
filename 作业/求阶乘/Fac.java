import java.util.Scanner;

public class Fac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result=1;
		int sum=0;
		for(int a=1;a<=n;a++) {
			result*=a;
			sum+=result;
		}
		System.out.println(result);
	}
}