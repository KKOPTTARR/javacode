public class PrimeNumber {
	public static void main(String[] args) {
		int a=0;
		int b=2;
		for(;a<=100;a++) {
			for(b=2;b<a;b++) {
				if(a%b==0) {
					break;
				}
			}
			if(b>=a) {
				System.out.println(a);
			}
		}
		
	}
}