class Student extends Person {
    private int mark;

    public Student(String name,int age,int mark) {
        super(name,age);
        this.mark = mark;
    }

    public String getOtherInformation() {
        return "the mark of this student=" + mark;
    }
}