
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
        }
        else {
            last.next=newNode;
        }
        last=newNode;

    }

    //删
    public void delete(Node delNode) {
        

    }
}
