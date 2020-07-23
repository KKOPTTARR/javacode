/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 14:58
 */
public class Judge {
    public static void judge(int[] arr) {
        sign:
        for(int n=0;n<arr.length-1;n++) {
            for(int m=0;m<arr.length-1-n;m++) {
                if(arr[m]>arr[m+1]) {
                    System.out.println("无序");
                    break sign;
                }
            }
            System.out.println("有序");
            break;
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,2,4,6};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        judge(arr1);

    }
}
