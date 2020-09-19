public class AbstractTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("aa",20,90);
        people[1] = new Employee("bb",30,7000);

        for(Person p : people) {
            System.out.println("name=" + p.getName() + " " + "age=" + p.getAge() + " " + p.getOtherInformation());
        }
    }
}


