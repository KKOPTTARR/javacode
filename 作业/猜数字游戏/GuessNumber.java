import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
	public static void main(String[] args) {
	

		Random rnd = new Random();
		int random = rnd.nextInt(50)+1;
		//【0~50）+ 1 = 【1~50】
		int b=3;//三次机会

		while(b>0) {
			System.out.println("请输入：");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();

			if(a<random) {
				System.out.println("小了");
			}
			else if(a>random) {
				System.out.println("大了");
			}

		    else {
			    System.out.println("对了");
			    break;
		    }
		    b--;
		    System.out.println("还剩" + b +"次机会");
	    }
    }
}