/*
题目描述：
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

思路：入栈给stack1，出栈时，若stack2不为空，则出栈，若为空，把stack1的内容全都放入stack2，然后再出栈
 */


import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                int n = stack1.pop();
                stack2.push(n);
            }

        }
        return stack2.pop();
    }
}
