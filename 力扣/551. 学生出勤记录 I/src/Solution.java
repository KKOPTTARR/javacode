import java.util.Scanner;

class Solution {
   public static boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        int  maxL=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='A') {
                countA++;
                countL=0;
            }
            else if(s.charAt(i)=='L') {
                countL++;
            }
            else {
                countL=0;
            }
            maxL=Math.max(maxL,countL);
        }
        if(countA<=1&&maxL<=2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        System.out.println(checkRecord(c));
   }
}