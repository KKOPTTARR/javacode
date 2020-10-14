import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    //求高度
    public static int getHight(NodeTree root) {
        if (root == null) {
            return 0;
        } else {
            return (Math.max(getHight(root.left), getHight(root.right)));
        }
    }

    //层序遍历
    private static void levelPreOrder(NodeTree root) {
        if (root == null) {
            return;
        }
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            NodeTree node = queue.remove();
            System.out.println(node.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }

    //向下调整
    public void adjustDown(int[] array, int size, int index) {
        while (true) {
            // 1. 判断 index 是不是叶子
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                return;
            }

            // 2. 找最小的孩子
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            // 3. 比较最小孩子的值 和 index 位置的值
            if (array[index] <= array[minIndex]) {
                return;
            }

            // 4. 交换
            int t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            // 5. 把最小的孩子视为 index，继续循环
            index = minIndex;
        }
    }

    //向上调整
    public void adjustDown(int[] array, int size, int index) {
        if(index != 0) {
            

        }
    }
}



class NodeTree {
    char val;
    int root;
    NodeTree left;
    NodeTree right;

    public NodeTree(int root) {
        this.root = root;
    }
    public NodeTree(char val) { this.val = val;   }
}
