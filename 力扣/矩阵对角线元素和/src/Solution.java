/*
最中间元素只算一次


 */

class Solution {
    public static int diagonalSum(int[][] mat) {
        int res=0;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                if(i==j) {
                    res+=mat[i][j];
                }
            }
        }
        for(int i=mat.length-1;i>=0;i--) {
            for(int j=0;j<mat[0].length;j++) {
                if((j+i)==mat.length-1) {
                    res+=mat[j][i];
                }
            }
        }
        if(mat.length%2!=0) {
            return res - mat[(mat.length-1)/2][(mat[0].length-1)/2];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));
    }
}