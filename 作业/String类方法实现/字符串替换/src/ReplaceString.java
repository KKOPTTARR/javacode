//替换字符串中的某个部分
public class ReplaceString {
    public static void main(String[] args) {
        String str="123456ab";
        System.out.println(replace(str));
    }
    public static String replace(String str) {
      str=str.replace("12","99");
        return str;
    }
}
