public class Test {
    public static void main(String[] args) {

        //引用
        //引用是一种只能指向对象的数据类型


        Node p = new Node(1);
        Node q = new Node(2);

        //如果 p = q
        //p -> 2
        //不会出现p既指向1，又指向2
        //但相反，多个引用可以指向一个对象

        p = null;
        //生活用语表述：p这个引用不指向任何对象



    }
}
