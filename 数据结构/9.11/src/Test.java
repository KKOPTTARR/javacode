/*
重写equals
 */

class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }




    @Override
    public boolean equals(Object obj) {
        //1.this 不是 null ,所以检查一下 obj 是不是 null
        if(obj == null) {
            return false;
        }
        //2.检查类型，不同的类型，“肯定”代表不了同一个事物
        if(!(obj instanceof Teacher)) {
            return false;
        }
        //3.根据我们设计的目的，来判断对象是否代表同一个现实事务
        //主要名字一样就代表同一个现实事务
        Teacher o = (Teacher)obj;
        return this.name.equals(o.name);
    }
}



public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("gaobo");
        Teacher t2 = new Teacher("gaobo");
        Teacher t3 = new Teacher("chenpeixin ");
        Teacher t4 = new Teacher("chenpeixin ");

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}
