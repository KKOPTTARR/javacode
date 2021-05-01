import sun.reflect.generics.tree.Tree;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {

    public TreeNode root;

    public void addNode(int value) {
        if(root==null) {
            root=new TreeNode(value);
        }

        TreeNode cur = root;

        while(true) {
            if(value<cur.value) {
                if(cur.left==null) {
                    cur.left=new TreeNode(value);
                    return;
                }
                else {
                    cur=cur.left;
                }
            }
            else {
                if(cur.right==null) {
                    cur.right=new TreeNode(value);
                    return;
                }
                else {
                    cur=cur.right;
                }
            }
        }
    }

    public void preOrder(TreeNode node) {
        if(node!=null) {
            System.out.println("[" + node.value + "]");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(TreeNode node) {
        if(node!=null) {
            preOrder(node.left);
            System.out.println("[" + node.value + "]");
            preOrder(node.right);
        }
    }

    public void postOrder(TreeNode node) {
        if(node!=null) {
            preOrder(node.left);
            preOrder(node.right);
            System.out.println("[" + node.value + "]");
        }
    }


    public static void main(String[] args) {
        
    }

}
