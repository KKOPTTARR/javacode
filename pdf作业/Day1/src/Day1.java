public class Day1 {
    public static void main1(String[] args) {

        int i = 15;
        i = i++;
        System.out.println("i:" + i);
        //i:15
    }

    public static void main2(String[] args) {

        int i = 2;
        int j = i++ * 3;
        System.out.println(j);
        //6
    }

    public static void main(String[] args) {
        int i = 2;
        int j = ++i * 3;
        System.out.println(j);
        //9
    }
}
