class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkList {
    public Node head;

    //头插
    public void addFirst(int data) {
        Node node = new Node(data);

        if(this.head==null) {
            this.head=node;
        }
        else {
            node.next = head.next;
            this.head=node;
        }
    }

    //显示打印
    public void disPlay() {
        Node cur = this.head;
        for(;cur!=null;cur=cur.next) {
            System.out.println(cur.data + " ");
        }
        System.out.println(" ");
    }

    //尾插
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        while(cur.next!=null) {
            cur=cur.next;
        }
        cur.next = node;
    }

    //任意插
}
