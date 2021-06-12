import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {


        //list初始化的方式
        
        //method one
        List<String> stringList1 = new LinkedList<String>(){
            {
            add("a");
            add("b");
            add("c");
            }
        };

        //method two
        List<String> stringList2 = new LinkedList<>();
        stringList2.add("a");
        stringList2.add("b");
        stringList2.add("c");

        //method three
        List<String> stringList3 = Arrays.asList("a", "b", "c");

    }
}
