/*
        给你一个字符串数组 words（下标 从 0 开始 计数）。
        在一步操作中，需先选出两个 不同 下标 i 和 j，其中 words[i] 是一个非空字符串，接着将 words[i] 中的 任一 字符移动到 words[j] 中的 任一 位置上。
        如果执行任意步操作可以使 words 中的每个字符串都相等，返回 true ；否则，返回 false 。

        示例 1：
        输入：words = ["abc","aabc","bc"]
        输出：true
        解释：将 words[1] 中的第一个 'a' 移动到 words[2] 的最前面。
        使 words[1] = "abc" 且 words[2] = "abc" 。
        所有字符串都等于 "abc" ，所以返回 true 。

        示例 2：
        输入：words = ["ab","a"]
        输出：false
        解释：执行操作无法使所有字符串都相等。
*/

/*
题解
题目中有说到，在经过无数次移动之后所有字符串都相等，意思也就是说：这个字符串的每一个字符的数量也是相等的，我们统计这个字符串数组里每个字符的数量，这个字符的数量应该是words数组长度len的倍数，因此可以得出：一个字符的总数对len取余，结果不为0则返回false，如果所有字符对len取余结果都为0，则返回true
代码实现如下

 */


class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[129];
        int len=words.length;
        for(String s:words) {
            for(char a:s.toCharArray()) {
                count[a]++;
            }
        }
        for(int i:count) {
            if(i%len!=0) {
                return false;
            }
        }
        return true;
    }
}
