import java.util.Scanner;

public class MulTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();

		int a=1;
		int b=1;
		int c=0;
		for(a=1;a<=n;a++) {
			for(b=1;b<=a;b++) {
				c=a*b;
				System.out.print(c + " ");
			}
			System.out.println();
			System.out.println();
		}
	
	}
}