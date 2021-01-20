import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
    public int[] array={1,2,3,4,5,6,7,8,9};
    public static List<Node> nodeList = null;

    public void createBinaryTree(){

        nodeList = new LinkedList<Node>();

        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            Node start = new Node(array[nodeIndex]);
            System.out.println("添加的是" + array[nodeIndex]);
            nodeList.add(start);
        }

        for()
    }
}
