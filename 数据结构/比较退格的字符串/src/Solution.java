import java.util.Stack;

class Solution {
    private Stack<Character> buildStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
    public boolean backSpace(String S, String T) {
        Stack<Character> s = buildStack(S);
        Stack<Character> t = buildStack(T);
        if (s.size() != t.size()) return false;
        while (!s.isEmpty() && !t.isEmpty()) {
            if (s.pop() != t.pop()) {
                return false;
            }
        }
        return true;
    }
}

