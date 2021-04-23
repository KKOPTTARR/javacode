/*
给你一个 m * n 的矩阵，矩阵中的数字 各不相同 。请你按 任意 顺序返回矩阵中的所有幸运数。

幸运数是指矩阵中满足同时下列两个条件的元素：

在同一行的所有元素中最小
在同一列的所有元素中最大
 

示例 1：
输入：matrix = [[3,7,8],[9,11,13],[15,16,17]]
输出：[15]
解释：15 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。

示例 2：
输入：matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
输出：[12]
解释：12 是唯一的幸运数，因为它是其所在行中的最小值，也是所在列中的最大值。

示例 3：
输入：matrix = [[7,8],[1,2]]
输出：[7]
 
提示：
m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 10^5
矩阵中的所有元素都是不同的

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */



import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int hang = matrix.length;
        int lie = matrix[0].length;

        for(int i=0;i<lie;i++) {
            int lieMax=matrix[0][i];
            int k=0;
            for(int j=0;j<hang;j++) {
                if(lieMax<matrix[j][i]) {
                    lieMax=matrix[j][i];
                    k=j;
                }
            }
            int l;
            for(l=0;l<lie;l++) {
                if(lieMax>matrix[k][l]) {
                    break;
                }
            }
            if(l==lie) {
                list.add(lieMax);
                break;
            }
        }
        return list;
    }
}