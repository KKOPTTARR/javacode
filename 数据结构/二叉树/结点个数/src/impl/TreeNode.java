package impl;

public class TreeNode {
    int v;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        v = x;
    }

    @Override
    public String toString() {
        return String.format("%c", v);
    }
}
