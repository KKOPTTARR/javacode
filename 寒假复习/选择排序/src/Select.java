/*
选择排序（从小到大）
 */

public class Select {
    int data[] = new int[] {3,7,5,1,9,2};
    int size = data.length;

    public static void main(String[] args) {
        System.out.println("原始数据：");
        Select test = new Select();
        test.showData();
        test.select();
        System.out.println("选择排序后：");
        test.showData();
    }

    //打印数据
    void showData() {
        int i;
        for(i=0;i<size;i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }

    //选择排序
    //原理：
    //第一轮扫描：首先找到数列中最小值与第一个数据交换
    //第二轮扫描：从第二个数据开始找到数列中最小值与第二个数据交换
    //依次推进，直至排序完成

    void select() {
        int i,j,temp;

        //i：扫描次数（n-1）
        //j：寻找最小数据
        for(i=0;i<size-1;i++) {
            for(j=i+1;j<size;j++) {
                if(data[j]<data[i]) {
                    temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }

        }
    }
}
