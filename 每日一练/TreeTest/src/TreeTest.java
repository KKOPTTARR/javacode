class TreeNode {
    int value;
    TreeNode left_Node;
    TreeNode right_Node;

    public TreeNode(int value) {
        this.value = value;
        this.right_Node = null;
        this.left_Node = null;
    }
}

public class TreeTest {
    public TreeNode root;

    public void addNode(int value) {
        if(root==null) {
            root=new TreeNode(value);
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
        if(root!=null) {
            System.out.printf(node.value + " ");
            preOrder(node.left_Node);
            preOrder(node.right_Node);
        }
    }

    /*

    //链表反转
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next++ null){
            return head;
        }
        ListNode next = head.next;
        ListNode new_head = reverseList(next);
        next.next=head;
        head.next=null;
        return new_head;
    }
      */

    }
}

