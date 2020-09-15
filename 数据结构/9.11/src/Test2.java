/*
Comparable 接口

 */


class Teacher2 implements Comparable<Teacher2>//声明自己具备比较xx的能力
{
    String name;
    int age;
    int height;
    int weight;


    public Teacher2(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    //大小关系如何实现，留给开发者自行决定
    //如：年龄比较
    @Override
    public int compareTo(Teacher2 o){
        if(this.age<o.age) {
            return -1;//任意负数
        }
        else if(this.age == o.age) {
            return 0;//0
        }
        else {
            return 1;//任意正数
        }
    }
}


public class Test2 {
    public static void main(String[] args) {
        Teacher2 t1 = new Teacher2("gaobo",30,190,70);
        Teacher2 t2 = new Teacher2("chenpeixin",40,180,80);


        int r = t1.compareTo(t2);
        if(r<0) {
            System.out.println("gaobo小于chenpeixin");
        }
        else if (r==0) {
            System.out.println("gaobo等于chenpeixin");
        }
        else {
            System.out.println("gaobo大于chenpeixin");
        }
    }
}
