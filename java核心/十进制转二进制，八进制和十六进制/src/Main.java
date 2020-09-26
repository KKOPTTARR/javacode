import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //int num3 = scan.nextInt();

        main.change2(num1);
        main.change8(num2);
        //main.change16(num3);
    }

    public void change8(int num2) {

        int num=0;
        Stack<Integer> stack = new Stack<>();
        while(num2>0) {
            num=num2%8;
            stack.push(num);
            num2/=8;
        }
        while(!stack.empty()) {
            int res = stack.pop();
            System.out.print(res);
        }
        System.out.println(" ");
    }
    private void change2(int num1) {

        int num=0;
        Stack<Integer> stack = new Stack<>();
        while(num1>0) {
            num=num1%2;
            stack.push(num);
            num1/=2;
        }
        while(!stack.empty()) {
            int res = stack.pop();
            System.out.print(res);
        }
        System.out.println(" ");
    }

    /*private void change16(int num3) {

        int num=0;
        Stack<Integer> stack = new Stack<>();
        while(num3>0) {
            num=num3%16;
            stack.push(num);
            num3/=16;
        }
        while(!stack.empty()) {
            int res = stack.pop();
            System.out.print(res);
        }
        System.out.println(" ");
    }*/
}
