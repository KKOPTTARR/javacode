import java.util.Scanner;

public class Rebound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("初始高度：");
        double h = scan.nextInt();
        System.out.println("反弹次数：");
        int c = scan.nextInt();

       Distance(h,c);

    }
    public static void Distance(double high,int count) {
        double raise = 0;
        double distanceEach=0;//count=n时每次落地+反弹的距离
        double distanceAll=0;//连续落地反弹的总距离
        for(int n=1;n<=count;n++) {
           raise=high/2;
           distanceEach = high+raise;
           high=high/2;
           distanceAll+=distanceEach;

            System.out.println("count= " + n + " distanceEach= " + distanceEach);
        }
        System.out.println("distanceAll= " + distanceAll);
    }
}
