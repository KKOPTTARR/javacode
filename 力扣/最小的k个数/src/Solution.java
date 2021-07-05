import java.util.ArrayList;
import java.util.Collections;


/*
题目描述
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

解题思路
设置一个大小为k的容器，如果还有空余，就将数组中的数加进去，否则就比较数组中的数和容器中最大的数，选择最小的放进去。
注：ArrayList中的indexOf（int k）方法，是返回值为k的下标。


 */


public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList();
        if(input.length < k || k <= 0) {
            return res;
        }
        for(int i = 0; i < input.length; i++) {
            if(res.size() < k) {
                res.add(input[i]);
            }
            else {
                int max = Collections.max(res);
                if(max > input[i]) {
                    res.set(res.indexOf(max), input[i]);
                }
            }
        }
        return res;
    }
}
