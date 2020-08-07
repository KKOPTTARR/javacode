//按特殊符号拆分
public class SplitString {
    public static void main(String[] args) {
        String str = "111-222-333-444";
       split(str);

    }
    public static void split(String str) {
        String[] array = str.split("-");
        for(int i=0; i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
//111
//222
//333
//444
