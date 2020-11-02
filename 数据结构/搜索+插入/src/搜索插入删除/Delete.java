package 搜索插入删除;

public class Delete {
    public boolean remove(Integer key) {

        private Node root;

        // 1. 查找要删除的 key 所在的节点，记作 node。node 的双亲节点，记作 parent
        Node parent = null;
        Node current = root;

        while (current != null) {
            int cmp = key.compareTo(current.key);
            if (cmp == 0) {
                removeInternal(current, parent);
                return true;
            } else if (cmp < 0) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        return false;
    }

    private void removeInternal(Node node, Node parent) {
        if (node.left == null && node.right == null) {
            if (node == root) {
                root = null;
            } else if (node == parent.left) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (node.left != null && node.right == null) {
            if (node == root) {
                root = node.left;
            } else if (node == parent.left) {
                parent.left = node.left;
            } else {
                parent.right = node.left;
            }
        } else if (node.left == null && node.right != null) {
            if (node == root) {
                root = node.right;
            } else if (node == parent.left) {
                parent.left = node.right;
            } else {
                parent.right = node.right;
            }
        } else {
            // 使用替换法删除，使用 node 的左子树中的最大值所在的节点，记作 ghost。ghost 的双亲记作 ghostParent
            Node ghostParent = node;
            Node ghost = node.left;
            // 一路朝右查找，直到 ghost.right == null
            while (ghost.right != null) {
                ghostParent = ghost;
                ghost = ghost.right;
            }

            // 1. 替换
            node.key = ghost.key;
            // 2. 删除 ghost 节点（其右孩子一定是 null)
            if (node == ghostParent) {
                ghostParent.left = ghost.left;
            } else {
                ghostParent.right = ghost.left;
            }
        }
    }
}