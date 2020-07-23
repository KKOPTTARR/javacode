/**
 * @author :大大怪将军
 * @description :Test
 * @data : 2020/7/23 0:30
 */
public class CreateAndInput {
    public static void main(String[] args) {
        int n=100;
        int[] arr1=new int[n];
        int i=0;
        for(i=0;i<n;i++) {
            int k=1;
            for(k=i+1;k<(i+2);k++) {
                arr1[i]=k;
                System.out.print(arr1[i] + " ");
            }


        }

    }
}
