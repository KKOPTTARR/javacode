public class Test {
    public static void main(String[] args) {
        MyLineList myLineList = new MyLineList();
        myLineList.addFirst(1);
        myLineList.addFirst(2);
        myLineList.addFirst(3);
        myLineList.addFirst(2);
        myLineList.addFirst(2);
        myLineList.display();
        System.out.println("===================");
        myLineList.addLast(5);
        myLineList.display();
        System.out.println("===================");
        myLineList.addIndex(0,1);
        myLineList.addIndex(1,2);
        myLineList.addIndex(2,3);
        myLineList.display();
        System.out.println("===================");
        myLineList.addIndex(1,5);
        myLineList.display();
        System.out.println("===================");
        myLineList.remove(1);
        myLineList.display();
        System.out.println("===================");
        myLineList.removeAllKey(2);
        myLineList.display();
    }
}
