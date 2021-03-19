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

        for(int parentIndex=0;parentIndex<array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).leftChild = nodeList.get(parentIndex*2+1);
            nodeList.get(parentIndex).rightChild = nodeList.get(parentIndex*2+2);
        }

        int lastParentIndex = array.length/2-1;
        nodeList.get(lastParentIndex).leftChild = nodeList.get(lastParentIndex*2+1);
        if(array.length%2==1){
            nodeList.get(lastParentIndex).rightChild= nodeList.get(lastParentIndex*2+2);
        }
    }

    public static void preOrderTraverse(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data + " ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);


    }

    public static void midOrderTraverse(Node node){



    }
}
