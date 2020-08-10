import java.util.Scanner;

public class Login {
    private static String username= "Ak47";
    private static String password = "Ak666";
    /**
     * id:AK47
     * password:AK6666
     * @param args [description]
     */

        public static void main(String[] args) throws NameException,PasswordException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input your id: ");
            String id = scanner.nextLine();
            System.out.println("input your password: ");
            String password = scanner.next();
            login(id,password);
            System.out.println("Log in !");
        }
        public static void login(String username, String password) throws NameException,PasswordException {
            if (!Login.username.equals(username)) {
                throw new NameException("id is wrong");
            }
            if (!Login.password.equals(password)) {
                throw new PasswordException("password is wrong");
            }


    }
}