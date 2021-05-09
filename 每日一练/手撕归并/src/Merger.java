public class Merger {

    public void merger(int[] data,int fist,int last) {
        if(fist>=last) {
            return;
        }

        int mid = fist+(last-fist)/2;
        merger(data,fist,mid);
        merger(data, mid+1, last);

        mergerSort(data,fist,mid,last);
    }

    public void mergerSort(int[] data,int fist,int mid,int last) {
        int[] temp = new int[last-fist+1];
        int i = fist;
        int j = mid+1;

        for(int z=0;z<data.length;z++) {
            if( i<=mid && ( j>last || data[i]<=data[j]) ) {
                temp[z]=data[i++];
            }
            else if( j<=last && ( i>mid || data[j]<=data[i]) ) {
                temp[z]=data[j++];
            }
        }

        for(int z=0;z<data.length;z++) {
            data[fist+z] = temp[z];
        }
    }
}
