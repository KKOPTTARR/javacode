class TreeNode {
    int value;
    TreeNode left_Node;
    TreeNode right_Node;

    public TreeNode(int value) {
        this.value=value;
        this.left_Node=null;
        this.right_Node=null;
    }
}

class BinaryTree {
    public TreeNode root;

    public void AddNode(int value) {
        if(root==null) {
            root=new TreeNode(value);
            return;
        }

        TreeNode cur = root;
        while(true) {
            if(value<cur.value) {
                if(cur.left_Node==null) {
                    cur.left_Node=new TreeNode(value);
                    return;
                }
                else {
                    cur=cur.left_Node;
                }
            }
            else {
                if(cur.right_Node==null) {
                    cur.right_Node=new TreeNode(value);
                    return;
                }
                else {
                    cur=cur.right_Node;
                }

            }
        }
    }

    public void preOrder(TreeNode node) {
        if(node!=null) {
            System.out.println("[" + node.value + "]");
            preOrder(node.left_Node);
            preOrder(node.right_Node);
        }
    }

    public void inOrder(TreeNode node) {
        if(node!=null) {
            inOrder(node.left_Node);
            inOrder(node.right_Node);
            System.out.println("[" + node.value + "]");
        }
    }

    public void postOrder(TreeNode node) {
        if(node!=null) {
            postOrder(node.left_Node);
            postOrder(node.right_Node);
            System.out.println("[" + node.value + "]");
        }
    }
    
}



public class TestOfBinaryTree {
}
