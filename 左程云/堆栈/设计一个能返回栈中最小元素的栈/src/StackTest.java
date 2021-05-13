import java.util.Stack;

public class StackTest {

    public Stack<Integer> stackData;
    public Stack<Integer> stackMin;

    public StackTest() {
        this.stackData=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }

    public void push(int value) {
        if(this.stackMin.isEmpty()) {
            this.stackMin.push(value);
        }
        else if(value<this.getMin()) {
            this.stackMin.push(value);
        }
        else {
            int minValue=this.stackMin.peek();
            this.stackMin.push(minValue);
        }
        this.stackMin.push(value);
    }

    public int pop() {
        if(this.stackData.isEmpty()) {
            throw new RuntimeException(" stack is empty");
        }
        this.stackMin.pop();
        return 0;
    }

    public int getMin() {
        if(this.stackData.isEmpty()) {
            throw new RuntimeException(" stack is empty");
        }
        return this.stackMin.peek();
    }
}
