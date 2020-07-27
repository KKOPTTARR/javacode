
import java.util.Arrays;

public class MyArrayList {
    public int[] elem;//null
    public int usedSize;//0
    //成员变量

    public MyArrayList() {
        this.elem = new int[5];
        this.usedSize=0;

    }

    public static void main(String[] args) {


        // 在 pos 位置新增元素
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        //myArrayList.add(2,8);


        // 打印顺序表
        myArrayList.display();
        System.out.println(" ");


        // 判定是否包含某个元素
        boolean result = myArrayList.contains(5);
        System.out.println(result);


        // 查找某个元素对应的位置
        int result2 = myArrayList.search(3);
        System.out.println(result2);


        // 获取 pos 位置的元素
        int result3 = myArrayList.getPos(3);
        System.out.println(result3);


        // 给 pos 位置的元素设为 value
        myArrayList.setPos(3,5);


        // 获取顺序表长度(有效)
        int result4 = myArrayList.size();
        System.out.println(result4);


        //删除第一次出现的关键字key
        myArrayList.remove(3);
        myArrayList.display();


        // 清空顺序表（简单类型）
        myArrayList.clear();
    }


    //①
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos>this.usedSize||pos<0) {
            System.out.println("位置不合法");
            return;
        }
        //扩容
        if(this.elem.length == this.usedSize) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i=this.usedSize-1;i>=pos;i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
        System.out.println(Arrays.toString(this.elem));
    }



    //②
    // 打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i] + " ");
        }
    }



    //③
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }


    //④
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }


    //⑤
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos>=this.usedSize||pos<0) {
            return -1;
        }
        return this.elem[pos];
    }


    //⑥
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos>=this.usedSize||pos<0) {
            return;
        }
        this.elem[pos]=value;
        System.out.println(Arrays.toString(this.elem));
    }



    //⑦
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int i =  search(toRemove);
        if(i==-1) {
            System.out.println("无此元素");
            return;
        }
        for(int n=i;n<this.usedSize-1;n++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }


    //⑧
    // 获取顺序表长度(有效)
    public int size() {
        return this.usedSize;
    }



    //⑨
    // 清空顺序表（简单类型）

    /**
     * 若顺序表当中存放引用类型
     * for(int i=0;i<usedSize;i++) {
     *     elem[i]=null;
     * }
     * 因为引用类型在数组中的只是地址，清空地址其本身不受影响
     */
    public void clear() {
        this.usedSize=0;
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]);
        }
    }


}