import java.util.Scanner;

public class Extend {
    public static void main(String[] args) {
        Person person1 = new Person("kk",20,5000);
        Student person2 = new Student("jj",18,4000);
        Person person3 = person2;

        Scanner scan = new Scanner(System.in);
        System.out.println("奖金：");
        int bonus = scan.nextInt();

        person2.setBonus(bonus);

        System.out.println("name=" + person1.getName() +  " " + "age=" + person1.getAge() + " " +  "salary=" + person1.getSalary());
        System.out.println("name=" + person2.getName() +  " " + "age=" + person2.getAge() + " " +  "salary=" + person2.getSalary());
    }
}
class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name,int age,int salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }




}


class Student extends Person {
    private double bonus;

    public Student(String name, int age, int salary) {
        super(name, age, salary);
        bonus = 0;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
