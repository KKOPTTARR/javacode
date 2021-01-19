public class Node {
    Node leftChild;
    Node rightChild;
    int data;

    public Node(Node leftChild,Node rightChild,int data){
        this.leftChild=leftChild;
        this.rightChild=rightChild;
        this.data= data;
    }

    public Node(int data){
        this.data=data;
        this.leftChild=null;
        this.rightChild=null;
    }

}
