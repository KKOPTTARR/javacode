/*
冒泡排序-----从小到大
 */


public class Bubble {
    int data[] = new int[]{5,3,1,7,9,2};
    private int size=data.length;

    public static void main(String[] args) {
        System.out.println("冒泡排序：");
        Bubble test = new Bubble();
        test.showData();
        test.bubble();
        test.showData();
    }

    //打印数据
    public void showData() {
        for(int i=0;i<size;i++){
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }

    //冒泡排序-----比较相邻两数，第一个数大则交换
    public void bubble() {
        int i,j,temp;

        //i-----扫描次数
        //j-----比较交换的次数
        for(i=size-1;i>0;i--){
            for(j=0;j<i;j++){
                if(data[j]>data[j+1]){
                    temp=data[j+1];
                    data[j+1]=data[j];
                    data[j]=temp;
                }
            }
        }
    }

}
