/*
冒泡排序-----从小到大
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble {
    int data[] = new int[10];
    private int size=data.length;

    public static void main(String[] args) throws IOException {
        
        Bubble test = new Bubble();

        test.inputarr();
        test.showData();
        System.out.println("冒泡排序：");
        
        test.showData();
        test.bubble();
        test.showData();
    }
    
    public void inputarr() throws IOException {
        int i;
        for(i=0;i<size;i++) {
            System.out.println("请输入第"+(i+1)+"个数据:");

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            data[i]=Integer.parseInt(br.readLine());
        }
        
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
