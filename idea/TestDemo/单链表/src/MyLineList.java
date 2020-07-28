import com.sun.org.apache.xpath.internal.objects.XNodeSet;

//单链表
class Node {
    public int data;//数据
    public Node next;//地址

    public Node(int data) {
        this.data = data;
    }
}

public class MyLineList {

    public Node head;
    //标识单链表头节点
    //不是真正的头节点（自定一个开始的地方，实际上是访问的第一个节点）



    // 无头单向非循环链表实现
    //头插法
    public void addFirst(int data) {

        Node nobe = new Node(data);
        //创建


      /*  if(this.head==null) {
            this.head=node;
        }
        else {
            nobe.next = this.head;
            this.head = node;
        }*/
        nobe.next = this.head;
        this.head = nobe;
        //先把原head引用的地址赋给noe
        //再让node成为新的head
    }


    //显示打印
    public void display() {
        Node cur = this.head;
        for(;cur!=null;cur=cur.next) {
            System.out.println(cur.data + " ");
        }
        System.out.println(" ");
        //定义一个cur从head开始往后逐个打印直到cur为空
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head==null) {
            this.head = node;
        }
        else {
            Node cur = this.head;
            while(cur.next !=null) {
                cur = cur.next;
            }
            cur.next=node;
        }
    }


    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        if (index < 0 || index > getLength()) {
            System.out.println("不合法的下标");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node cur = searchPrev(index);
        node.next=cur.next;
        cur.next=node;
    }


    public Node searchPrev(int index) {
            Node cur = this.head;
            int count =0;
            while(count<index-1) {
                cur = cur.next;
                count++;
            }
            return cur;
    }


    public int getLength() {
        int count =0;
        for(Node cur=this.head;cur!=null;cur=cur.next) {
            count++;
        }
        return count;
    }

    //查找key
   public Node searchPrevNode(int key) {
        Node cur = this.head;

        //找不到就继续走，找到则返回
        if(cur.next.data != key) {
            if(cur.next.data==key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;//找不到就null
   }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head==null) {
            return;
        }
        if(this.head.data==key) {
            this.head=this.head.next;
            return;
        }

        Node cur = searchPrevNode(key);
        if(cur==null) {
            System.out.println("无该数字");
            return;
        }
        Node del = cur.next;//删除的节点
        cur.next = del.next;//前移
    }

}

