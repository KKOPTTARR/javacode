/*
用一个栈实现另一个栈的排序

[题目]

-个栈中元素的类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只许申请一个栈。除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序?

[解答]

将要排序的栈记为stack,申请的辅助栈记为TempStack。在stack上执行pop 操作，弹出的元素记为cur。

如果cur小于或等于TempStack的栈顶元素，则将cur直接压入TempStack;

如果cur大于TempStack的栈顶元素，则将TempStack的元素逐一弹出，逐一压入stack,直到cur小于或等于help的栈顶元素，再将cur压入help。

一直执行以上操作，直到stack中的全部元素都压入到TempStack。最后将中的TempStack所有元素逐-压入stack,即完成排序。
 */


import java.util.Stack;

public class SortStack {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> TempStack = new Stack<Integer>();
        while(!stack.isEmpty()) {
            int cur = stack.pop();
            while(!TempStack.isEmpty() && cur>TempStack.peek()) {
                stack.push(TempStack.pop());
            }
            TempStack.push(cur);
        }

        while(!TempStack.isEmpty()) {
            stack.push(TempStack.pop());
        }
    }
}
