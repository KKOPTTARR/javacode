import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {

    //map去重(字符型数组)
    public static void test2(String[] arrStr) {
        Map<String, Object> map = new HashMap<>();
        for (String str : arrStr) {
            map.put(str, str);
        }
        System.out.println(map.keySet());
    }
<<<<<<< HEAD
    
=======
>>>>>>> 91c1f7325e9d09c943f2760c38e4a9f67e0ac4d9

    //map去重(整型数组)
    public static void test3(int[] arrStr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i:arrStr) {
            map.put(i,i);
        }

        //打印key
        System.out.println(map.keySet());

        //打印value
        System.out.println(map.values());

        //打印key + value
        for(Integer key:map.keySet()){
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        //map转数组
        int[] temp=new int[map.size()];

        int i=0;
        for(Integer key:map.keySet()) {
            temp[i]=map.get(key);
            i++;
        }

        for(int j=0;j<temp.length;j++) {
            System.out.print(temp[j] + " ");
        }
        System.out.println(" ");


        //map.keySet().toArray. 获取key数组
        //map.values().toArray 获取value数组
        //key数组的第i个元素 对应value数组的第i个值 就可以转换回去了
    }

    public static void main(String [] args) {
        String [] arrStr = {"Java", "C++", "Php", "C#", "Python", "C++", "Java"};
        test2(arrStr);

        int[] data = {4,4,5,5,6,6,77,9,9,1,1,};
        test3(data);
    }
}