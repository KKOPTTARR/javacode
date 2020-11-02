package 搜索插入删除;

public class Node {
    public Integer key;
    Node left;
    Node right;

    Node (Integer key) {
        this.key = key;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "搜索插入删除.Node{" +
                "key=" + key +
                '}';
    }
}
