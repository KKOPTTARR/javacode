import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Mark {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("[;,]");

        String a = String.format("%.2f", Double.parseDouble((split[1])));
        String b = String.format("%.2f", Double.parseDouble((split[2])));
        String c = String.format("%.2f", Double.parseDouble((split[3])));
        System.out.println("The each subject score of  No. " + split[0] + " is " + a + ", " + b + ", " + c + ".");
    }
}