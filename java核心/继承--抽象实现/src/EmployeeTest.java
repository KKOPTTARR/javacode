class Employee extends Person {
    private double salary;

    public Employee(String name,int age,double salary) {
        super(name,age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getOtherInformation() {
        double bonus = salary*(getAge()-10)/100;
        return "an old employee get a salary=" + (bonus+getSalary());
    }
}
