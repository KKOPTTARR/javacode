
//声明二叉树节点类
class TreeNode {
    int value;
    TreeNode left_Node;
    TreeNode right_Node;

    public TreeNode(int value){
        this.value=value;
        this.left_Node=null;
        this.left_Node=null;
    }
}

//声明二叉树类
class BinaryTree {
    public TreeNode root;//根节点

    //构造函数：利用传入一个数组的参数来建立二叉树
    public BinaryTree(int[] data) {
        for(int i=0;i<data.length;i++) {
            Add(data[i]);
        }
    }

    //将指定的值加入到二叉树中合适的节点
    public void Add(int value) {
        TreeNode currentNode = root;
    }


}


public class BinaryTree1 {
}
