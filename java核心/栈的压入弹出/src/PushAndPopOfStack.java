import java.util.Stack;

public class PushAndPopOfStack {
    public static void main(String[] args) {
        int n = 10;
        pushStack(n);
        popStack(n);

    }
    public static void popStack(int data1) {
        Stack<Integer>stack = new Stack<>();
        while(!stack.empty()) {
            int res = stack.pop();
            System.out.println(res);
        }
        System.out.println(" ");
    }
    public static void pushStack(int data2) {
        Stack<Integer>stack = new Stack<>();
        stack.push(data2);
    }




}
