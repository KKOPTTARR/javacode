public class Leap {
	public static void main(String[] args) {
		int a=1000;
		for(;a<=2000;a++) {
			if(a%4==0&&a%100!=0) {
				System.out.println(a);
			}
			if(a%400==0) {
				System.out.println(a);
			}
		}
	}
}