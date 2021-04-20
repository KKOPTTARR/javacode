
//创建链表
class Node {
    int number;
    String name;
    int score;
    Node next;

    public Node(int number,String name,int score){
        this.name=name;
        this.score=score;
        this.number=number;
        this.next=null;
    }
}

public class LinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first ==null;
    }

    //打印结果
    public void print() {
        Node cur=first;
        while(cur!=null) {
            System.out.println("["+cur.score+" "+cur.name+" "+cur.number+"]");
            cur=cur.next;
        }
    }

    //增
    public void insert(int score,String name,int number) {
        Node newNode = new Node(score,name,number);
        if(this.isEmpty()) {
           first=newNode;
           last=newNode;
        }
        else {
            last.next=newNode;
            last=newNode;
        }


    }

    //删
    public void delete(Node delNode) {
        Node newNode;
        Node temp;

        //头删
        if(first.score==delNode.score) {
            first=first.next;
        }
        //尾删
        else if(last.score==delNode.score) {
            newNode=first;
            while(newNode.next!=last) {
                newNode=newNode.next;
            }
            newNode.next=last.next;
            last=newNode;
        }
        //中间删
        else {
            newNode=first;
            temp=first;
            while(newNode.score!=delNode.score) {
                temp=newNode;
                newNode=newNode.next;
            }
            temp.next=delNode.next;
        }

    }
}
