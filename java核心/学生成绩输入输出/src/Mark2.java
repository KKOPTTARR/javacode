import java.util.Scanner;

class Student {
    private String id;
    //private char fH;
    private double markMath;
    private double markC;
    private double markEnglish;

    public Student(String id,/*char fH,*/double markMath,double markC,double markEnglish) {
        this.id = id;
        //this.fH = fH;
        this.markMath = markMath;
        this.markC = markC;
        this.markEnglish = markEnglish;
    }
    public String getId() {
        return id;
    }
    /*public char getFH() {
        return fH;
    }*/
    public double getMarkMath() {
        return markMath;
    }
    public double getMarkC() {
        return markC;
    }
    public double getMarkEnglish() {
        return markEnglish;
    }
}
public class Mark2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        //char o = scan.next().charAt(0);
        double m = scan.nextDouble();
        double j = scan.nextDouble();
        double k = scan.nextDouble();
        Student s1 = new Student(n,m,j,k);

        System.out.println("The each subject score of No. " + n + " is " + m +", " + j + ", " + k);
    }

}
