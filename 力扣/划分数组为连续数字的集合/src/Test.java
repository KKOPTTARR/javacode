import java.lang.reflect.Array;
import java.util.*;

public class Test {
    public static boolean isPossibleDivide(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:nums) {
            map.put(i,i);
        }

        int[] temp = new int[map.size()];
        int i=0;
        for(Integer key:map.keySet()) {
            temp[i]=map.get(key);
            i++;
        }

        for(int j=0;j<temp.length;j++) {
            int fist=j;
            int last=j+k-1;
            int count=0;
            while(fist<last) {
                if(temp[j+1]==(temp[j]+1)) {
                    count++;
                    fist++;
                }
                else if(temp[j+1]==(temp[j]-1)) {
                    count++;
                    fist++;
                }
                if(count==k-1) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String [] args) {
        int[] data = {1,3,3,4,7};
        System.out.println(isPossibleDivide(data,2));


       /* Map<Integer, Integer> map = new HashMap<>();
        for(Integer i:data) {
            map.put(i,i);
        }

        int[] temp = new int[map.size()];

        int i=0;
        for(Integer key:map.keySet()) {
            temp[i]=map.get(key);
            i++;
        }

        for(int j=0;j<temp.length;j++) {
            System.out.println(temp[j]);
        }*/



    }
}
