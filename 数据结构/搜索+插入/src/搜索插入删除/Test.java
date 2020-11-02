package 搜索插入删除;

import 搜索插入删除.InsertAndSearch;

public class Test {
    public static void main(String[] args) {
        InsertAndSearch tree = new InsertAndSearch();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(2);
        tree.insert(0);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);

        System.out.println("Hello");

        for (int i = -1; i <= 11; i++) {
            System.out.println(i + ": " + tree.search(i));
        }

        System.out.println(new InsertAndSearch().search(10));
    }
}

