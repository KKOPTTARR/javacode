package 搜索插入删除;

public class InsertAndSearch {
    private Node root;

    public InsertAndSearch() {
        root = null;
    }

    public boolean search(Integer key) {
        Node current = root;

        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public void insert(Integer key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        // 始终保持 parent 就是 current 的双亲节点
        Node parent = null;
        Node current = root;

        int cmp = 0;
        while (current != null) {
            cmp = key.compareTo(current.key);
            if (cmp == 0) {
                throw new RuntimeException("BST 中不允许出现相同的 key");
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        // current 一定 null。
        // parent 就是要插入新节点的双亲节点
        Node node = new Node(key);
        if (cmp < 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }
}
