/*
给你一个正整数数组 arr，请你找出一个长度为 m 且在数组中至少重复 k 次的模式。

模式 是由一个或多个值组成的子数组（连续的子序列），连续 重复多次但 不重叠 。 模式由其长度和重复次数定义。

如果数组中存在至少重复 k 次且长度为 m 的模式，则返回 true ，否则返回  false 。

 

示例 1：

输入：arr = [1,2,4,4,4,4], m = 1, k = 3
输出：true
解释：模式 (4) 的长度为 1 ，且连续重复 4 次。注意，模式可以重复 k 次或更多次，但不能少于 k 次。
示例 2：

输入：arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
输出：true
解释：模式 (1,2) 长度为 2 ，且连续重复 2 次。另一个符合题意的模式是 (2,1) ，同样重复 2 次。
示例 3：

输入：arr = [1,2,1,2,1,3], m = 2, k = 3
输出：false
解释：模式 (1,2) 长度为 2 ，但是只连续重复 2 次。不存在长度为 2 且至少重复 3 次的模式。
示例 4：

输入：arr = [1,2,3,1,2], m = 2, k = 2
输出：false
解释：模式 (1,2) 出现 2 次但并不连续，所以不能算作连续重复 2 次。
示例 5：

输入：arr = [2,2,2,2], m = 2, k = 3
输出：false
解释：长度为 2 的模式只有 (2,2) ，但是只连续重复 2 次。注意，不能计算重叠的重复次数。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        //要的长度大于给定的数组长度，肯定就是不存在
        if(arr.length<k*m) return false;
        //这里指定一个计数器，计算找到的重复子数组数量
        int cnt = 1;
        //从0开始遍历，没什么好说的
        for(int i=0;i<=arr.length-k*m;i++){
            //尝试找第一个
            for(int j=1;j<k;j++){
                //打一个标记，作用后面说
                boolean match = true;
                for(int n=0;n<m; n++){
                    //如果不匹配，则说明该次尝试失败
                    if(arr[i+n]!=arr[i+n+j*m]){
                        //match吗？显然没有-->false
                        match = false;
//！！！！！！这里我改进一下，效率会高一点,有点KMP的意思！！！！！！！！！！
                        i+=n;
                        //跳出来 跳到**行
                        break;
                    }
                }

                if(!match){
                    //我是**行，既然你不匹配，那我就把计数器重置，并跳出该层循环。
                    cnt=1;
                    //break出去，就是for 循环i那行，让i++继续遍历
                    break;
                }
                //如果你走到了这里，说明你寻找到了一个匹配子数组，那么cnt++
                cnt++;
                //到这里需要判断一下，如果你找到了需要的数量，直接return true
                if(cnt==k){
                    return true;
                }
            }
        }
        //你都走到这里了，你还没找到，放弃吧，return false
        return false;
    }
}
