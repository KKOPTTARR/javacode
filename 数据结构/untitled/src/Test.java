import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;
class People {
    String  name;
    private int age;
    private int hight;

    public People(String name,int age,int hight) {
        this.name= name;
        this.age= age;
        thsis.hight= hight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHight() {
        return hight;
    }

}


class Teacher extends People {
    private double weight;


}
public class Test {
    public static void main(String[] args) {

    }
}
