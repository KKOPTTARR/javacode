public class SortTest {

    public void quick(int[] arr2,int left,int right) {
        int index;
        if(left<right) {
            index=quickSort(arr2,left,right);
            quick(arr2, left, index-1);
            quick(arr2, index+1, right);
        }
    }
    public int quickSort(int[] arr2,int fist,int last) {
        int key=arr2[fist];
        while(fist<last) {
            if(fist<last&&arr2[last]>key) {
                last--;
            }
            arr2[fist]=arr2[fist];
            if(fist<last&&arr2[fist]<key) {
                fist++;
            }
            arr2[last]=arr2[fist];
        }
        arr2[fist]=key;
        return fist;
    }



    public void choose(int[] arr1) {
        int temp;
        for(int i=0;i<arr1.length-1;i++) {
            for(int j=i+1;j<arr1.length;j++) {
                temp=arr1[j];
                arr1[j]=arr1[i];
                arr1[i]=temp;
            }
        }
    }
}
