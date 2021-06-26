/*
给出一个整数数组 A 和一个查询数组 queries。
对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。
然后，第 i 次查询的答案是 A 中偶数值的和。
（此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
返回所有查询的答案。
你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。

 

示例：
输入：A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
输出：[8,6,2,4]
解释：
开始时，数组为 [1,2,3,4]。
将 1 加到 A[0] 上之后，数组为 [2,2,3,4]，偶数值之和为 2 + 2 + 4 = 8。
将 -3 加到 A[1] 上之后，数组为 [2,-1,3,4]，偶数值之和为 2 + 4 = 6。
将 -4 加到 A[0] 上之后，数组为 [-2,-1,3,4]，偶数值之和为 -2 + 4 = 2。
将 2 加到 A[3] 上之后，数组为 [-2,-1,3,6]，偶数值之和为 -2 + 6 = 4。

链接：https://leetcode-cn.com/problems/sum-of-even-numbers-after-queries
 */

import java.util.Arrays;

class Solution {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int m=queries.length;
        int[] answer = new int[nums.length];
        for(int i=0;i<m;i++) {
            int temp=0;
            nums[queries[i][1]]+=queries[i][0];

            //System.out.println(nums[queries[i][1]]);

            for(int a=0;a<nums.length;a++) {
                if(nums[a]%2==0) {
                    temp+=nums[a];
                }
            }
            answer[i]=temp;
            //System.out.println(answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] data={1,2,3,4};
        int[][] queries = {
                {1,0},
                {-3,1},
                {-4,0},
                {2,3}
        };
        System.out.println(Arrays.toString(sumEvenAfterQueries(data,queries)));
    }

}