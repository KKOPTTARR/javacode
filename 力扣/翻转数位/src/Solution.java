/*
给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。

示例 1：

输入: num = 1775(110111011112)
输出: 8
示例 2：

输入: num = 7(01112)
输出: 4

链接：https://leetcode-cn.com/problems/reverse-bits-lcci
 */



class Solution {
    public int reverseBits(int num) {
        int res = 0;
        int right = 0;
        int left = 0;
        int chance = 1;
        while(num != 0){
            if((num & 1) == 1 && chance==1){
                right++;
                num >>>= 1;
            }else if((num & 1)==1 && chance==0){
                left++;
                num >>>= 1;
            }else if((num & 1) == 0 && chance == 1){
                chance--;
                right++;
                num >>>= 1;
            }else{
                res = Math.max(res,left+right);
                right = left;
                left = 0;
                chance=1;
            }
        }
        if(left+right<32 && chance==1)
            res = Math.max(res,left+right+1);
        else res = Math.max(res,left+right);
        return res;
    }
}
