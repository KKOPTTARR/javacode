class Node {
    int val;
    Node next;

    public Node (int val) {
        this.val = val;
    }
}
public class Test {

    public Node head;

    public void headIn(int val) {
        Node node = new Node(val);

        node.next = head;
        this.head = node;

    }

    public void endIn(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
        }
        else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public void headDelet(int val) {

    }

    public void endDelet(int val) {

    }


}
