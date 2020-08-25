import java.util.Scanner;

public class NumberOfOne {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n = scan.nextInt();

		 int num = 0;
		 while(n != 0) {
		 	if((n&1)==1) {
		 		num++;
		 	}
		 	n>>>=1;
		 	//相当于无符号右移后赋值；类似+=和-=
		 	//即 n = n >>> 1
		 }
		 System.out.println(num);
	}
}