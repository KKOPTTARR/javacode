/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 15:55
 */
public class CopyOf {
    //拷贝
    public static void copyOf(int[] arr) {
        int[] arrX =new int[arr.length];
        int i=0;
        System.out.print("arrX: ");
        for(i=0;i<arr.length;i++) {
            arrX[i]=arr[i];
            System.out.print(" " + arrX[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        System.out.print("arr1: ");
        for(int a=0;a<arr1.length;a++) {
            System.out.print(" " + arr1[a]);
        }
        System.out.println(" ");
        copyOf(arr1);
    }
}
