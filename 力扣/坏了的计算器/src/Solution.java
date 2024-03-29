/*
在显示着数字的坏计算器上，我们可以执行以下两种操作：

双倍（Double）：将显示屏上的数字乘 2；
递减（Decrement）：将显示屏上的数字减 1 。
最初，计算器显示数字 X。

返回显示数字 Y 所需的最小操作数。

 

示例 1：
输入：X = 2, Y = 3
输出：2
解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.

示例 2：
输入：X = 5, Y = 8
输出：2
解释：先递减，再双倍 {5 -> 4 -> 8}.

示例 3：
输入：X = 3, Y = 10
输出：3
解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.

 */

class Solution {
    public int brokenCalc(int X, int Y) {
        if (Y <= X) return X - Y;
        int cnt1 = 0;
        while (X < Y) {
            X *= 2;
            cnt1 ++;
        }
        if (X == Y) return cnt1;
        int r = X - Y;
        int cnt2 = 0;
        for (int i = cnt1; i >= 0; i --) {
            int t = (int)Math.pow(2, i);
            int coeff = r / t;
            r = r % t;
            cnt2 += coeff;
            if (r == 0) break;
        }
        return cnt1 + cnt2;
    }

}
