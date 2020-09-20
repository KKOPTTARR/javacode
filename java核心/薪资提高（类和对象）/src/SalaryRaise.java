import java.util.*;

public class SalaryRaise {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0]  = new Employee("cc",40,9000,5,22);
        employee[1]  = new Employee("bb",30,7000,6,22);
        employee[2]  = new Employee("aa",20,5000,7,22);

        for(Employee e : employee) {
            e.raiseSalary(5);
        }

        for(Employee e : employee) {
            System.out.println("name=" + e.getName() +  " " + "age=" + e.getAge() + " " +  "salary=" + e.getSalary() + " " +  "month=" + e.getMonth() + " " +  "day=" + e.getDay());
        }
    }
}
class Employee {
    private String name;
    private int age;
    private double salary;
    private int month;
    private int day;


    public Employee(String name,int age,double salary,int month,int day) {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.month=month;
        this.day=day;
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

    public int getMonth() {

        return month;
    }

    public int getDay() {

        return day;
    }

    public void raiseSalary(double percent) {
        double raise = salary*percent/100;
        salary += raise;
    }
}
