import java.util.Scanner;

public class SumOfFac {

	public static int sumOfFac(int a) {
		int result=1;
		for(int b=1;b<=a;b++) {
			result *= b;
		}
		return result;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum =0;
		for(int i=1;i<=n;i++) {
			sum += sumOfFac(i);
		}
		System.out.println(sum);		
	}

}


