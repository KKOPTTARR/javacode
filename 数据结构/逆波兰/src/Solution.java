import java.util.Stack;

import static java.lang.Integer.valueOf;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        Integer num1, num2;

        for (String s : tokens) {
            switch (s) {
                case ("+"): {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 + num2);
                    break;
                }
                case ("/"): {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                }
                case ("-"): {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                }
                case ("*"): {
                    num1 = stack.pop();
                    num2 = stack.pop();
                    stack.push(num1 * num2);
                    break;
                }
                default: {
                    stack.push(valueOf(s));
                    break;
                }
            }
        }
        return stack.pop();
    }

        //简单粗暴版
    /*public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (s.equals("/")) {
                int num1 = stack.pop();
                stack.push(stack.pop() / num1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }*/

}