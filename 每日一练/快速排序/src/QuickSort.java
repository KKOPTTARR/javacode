
public class QuickSort {

    int size;
    int array[] = new int[100];


    public void quick(int arr[],int size,int left,int right) {
        int i,j,temp;
        int left_index;
        int right_index;
        int key=arr[left];

        if(left<right) {
            left_index = left + 1;
            right_index = right;

            while(true) {

                for(i=left+1;i<right;i++) {
                    if(arr[i]>=key) {
                        left_index=i;
                        break;
                    }
                    left_index++;
                }

                for(j=right;j>left+1;j--) {
                    if(arr[j]<=key) {
                        right_index=j;
                        break;
                    }
                    right_index--;
                }

                if(left_index<right_index) {
                    temp=arr[left_index];
                    arr[left_index]=arr[right_index];
                    arr[right_index]=temp;
                }
                else {
                    break;
                }
            }

            if(left_index>=right_index) {
                temp=key;
                key=arr[right_index];
                arr[right_index]=temp;
                quick(arr,size,left,right_index-1);
                quick(arr,size,right_index+1,right);
            }
        }
    }
}
