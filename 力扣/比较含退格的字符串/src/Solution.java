/*
比较含退格的字符串
示例 1：
输入：S = “ab#c”, T = “ad#c”
输出：true
解释：S 和 T 都会变成 “ac”。

示例 2：
输入：S = “ab##”, T = “c#d#”
输出：true
解释：S 和 T 都会变成 “”。

示例 3：
输入：S = “a##c”, T = “#a#c”
输出：true
解释：S 和 T 都会变成 “c”。

示例 4：
输入：S = “a#c”, T = “b”
输出：false
解释：S 会变成 “c”，但 T 仍然是 “b”。

 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getResult(s).equals(getResult(t));
    }


    public static String getResult(String str) {
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for (char c : str.toCharArray()) {
            if (c == '#' && res-- > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            if (res<0){
                res=0;
            }
            if (c != '#' && ++res > 0) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
