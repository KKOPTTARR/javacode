import java.util.Scanner;

public class Fibonacci {
	/**
	 * 求斐波那契数列的第n项。(迭代实现)
	 * @param args [description]
	 */
	

	//递归
	/*public static int fibonacci2(int a) {
		if(a==0) {
			return 0;
		}
		else if(a==1) {
			return 1;
		}
		else {
			return fibonacci2(a-1)+fibonacci2(a-2);
		}
	}*/


    //迭代实现
    public  static int fibonacci1(int m) {
    	
        int a = 0;
        int b = 1;
        int c = 0;

        if(m==0) {
			return 0;
		}
		else if(m==1) {
			return 1;
		}
        for(int i=2;i<=m;i++){
        	c=a+b;
            a=b;
            b=c;
        }
 
        return c;
    }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int result = fibonacci1(n);
		//int result = fibonacci2(n);
		System.out.println(result);
	}
}