public class Daffodil {
	public static void main(String[] args) {
		int i=0;
		int a=0;
		int b=0;
		int c=0;
		for (; i<1000; i++)
		{
			a = i / 100;
		    b = i % 100 / 10;
		    c = i % 10;
		    if (i == a*a*a + b*b*b + c*c*c) {
		    	System.out.println(i);
		    }
		}
	}
}