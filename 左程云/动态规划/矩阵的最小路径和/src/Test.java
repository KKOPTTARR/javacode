/*
给定一个矩阵m，从左上角开始每次只能向右或向下走，最后到达右下角的位置，路径上所有的数字累加起来就是最小路径和，返回所有路径中最小的路径和

例：
给定的m如下：

1  3  5  9
8  1  3  4
5  0  6  1
8  8  4  0

路径1，3，1，0，6，1，0是所有路径中路径和最小的，所有返回12
 */

public class Test {

    public int minPathSum(int[] [] data) {
        if(data==null||data.length==null||data[0]==null||data[0].length==null) {
            return 0;
        }
        int row=data.length;
        int col=data[0].length;
        int[][] newData=new int[row][col];
        newData[0][0]=data[0][0];

        for(int i=1;i<row;i++) {
            newData[i][0]=newData[i-1][0] + data[i][0];
        }
        for(int j=1;j<col;j++) {
            newData[0][j]=newData[0][j-1] + data[0][j];
        }
        for(int i=1;i<row;i++) {
            for(int j=1;j<col;j++) {
                newData[i][j]=Math.min(newData[i-1][j],newData[i][j-1]) + data[i][j];
            }
        }
        return newData[row][col];
    }

}
