import java.util.Scanner;

public class LogIn {
	/**
	 * id:AK47
	 * password:AK6666
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("please input your id:");
		String id = sc.nextLine();

		if(id.equals("AK47")) {
			
			int a=3;//次数
			while(a>0) {
				System.out.println("please input your password:");
				String password = sc.nextLine();
				if(password.equals("AK666")) {
					System.out.println("a successful login");
					break;
				}
				else {
					System.out.println("password is wrong,please try again");
					System.out.println(a-1 + "chances left");
				}

			}

		}
		else {
			System.out.println("id有误，请重新输入");
		}

		
	}
}