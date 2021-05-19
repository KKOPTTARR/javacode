public class Meger {
    /*
    public static void merger(int[] data,int fist,int last) {
        if(fist>=last) {
            return;
        }
        int mid = (last-fist)/2 + fist;
        merger(data, fist, mid);
        merger(data, mid+1, last);

        mergerSort(data,fist,mid,last);
    }

    public static void mergerSort(int[] data,int fist,int mid,int last) {
        int[] temp = new int[last-fist+1];
        int i=fist;
        int j=mid+1;

        for(int z=0;z<temp.length;z++) {
            if(i<=mid && (j>last || data[i]<=data[j]) ) {
                temp[z]=data[i++];
            }
            else if(j<=last && (i>mid || data[j]<=data[i]) ) {
                temp[z]=data[j++];
            }
        }
        for(int z=0;z<temp.length;z++) {
            data[fist+z] = temp[z];
        }
    }

    */


    public static void main(String[] args) {
        int[] arr1 = {1,3,5,4,2,};
        merger(arr1,0,arr1.length-1);
        for(int i:arr1) {
            System.out.print(i+ " ");
        }
    }

    public static void merger(int[] data,int fist,int last) {
        if(fist>=last) {
            return;
        }
        int mid = (last-fist)/2+fist;
        merger(data,fist,mid);
        merger(data,mid+1,last);

        mergerSort(data,fist,mid,last);
    }
    public static void mergerSort(int[] data, int fist,int mid,int last) {
        int[] temp = new int[last-fist+1];
        int i=fist;
        int j=mid+1;

        for(int z=0;z<temp.length;z++) {

            if(i<=mid && (j>last || data[i]<=data[j]) ) {
                temp[z] = data[i++];
            }
            else if(j<=last && (i>mid || data[j]<=data[i]) ) {
                temp[z] = data[j++];
            }
        }

        for(int z=0;z<temp.length;z++) {
            data[z+fist]=temp[z];
        }
    }



}
